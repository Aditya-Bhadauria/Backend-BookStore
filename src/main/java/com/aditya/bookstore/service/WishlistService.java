package com.aditya.bookstore.service;

import com.aditya.bookstore.model.Book;
import com.aditya.bookstore.model.User;
import com.aditya.bookstore.repository.BookRepository;
import com.aditya.bookstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    public void addBookToWishlist(String userId, String bookId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        if (!user.getWishlist().contains(bookId)) {
            user.getWishlist().add(bookId);
            userRepository.save(user);
        }
    }

    public List<Book> getUserWishlist(String userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        List<String> wishlistBookIds = user.getWishlist();
        return bookRepository.findAllById(wishlistBookIds);
    }

    public void removeBookFromWishlist(String userId, String bookId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (user.getWishlist().contains(bookId)) {
            user.getWishlist().remove(bookId);
            userRepository.save(user);
        } else {
            throw new RuntimeException("Book not found in wishlist");
        }
    }


}
