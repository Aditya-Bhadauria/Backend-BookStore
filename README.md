# Book Store Application

##  Overview
The **Book Store Application** is a web-based API that allows authenticated users to manage books, including creating, updating, searching, deleting book entries, viewing personal profiles, and maintaining a personal wishlist. The system implements JWT-based authentication, ensuring secure access to book-related functionalities.

**Live Frontend Deployment:**  
🌐 [Visit Frontend]([https://your-frontend-url.com](https://book-store-frontend-aditya-bhadaurias-projects.vercel.app/))


![Screenshot from 2025-06-02 00-47-00](https://github.com/user-attachments/assets/a7cdaf7f-94f8-43cf-a7d0-d4e047855477)

![Screenshot from 2025-06-02 00-47-55](https://github.com/user-attachments/assets/a7216e2c-db5b-4820-9579-b12a58382588)

![Screenshot from 2025-06-02 00-49-47](https://github.com/user-attachments/assets/fe257a1f-17e0-459b-869a-15a5513d06bd)


##  Features
- **User Authentication:** Register and login with secure password hashing.
- **JWT-based Authorization:** Access control using JSON Web Tokens.
- **Book Management:** CRUD operations (Create, Read, Update, Delete) for books.
- **Filtering & Search:**
  - Filter books by **author, category, and rating**.
  - Search books by **title** with partial matching.
- **Secure API Endpoints:** Only authenticated users can access book-related routes.
- **User Profile Management:** Authenticated users can view their personal details.
- **Wishlist Management:** Users can add and manage their favorite books in a personal wishlist.

##  Tech Stack
- **Backend:** Spring Boot, Spring Security, JWT
- **Database:** MongoDB (NoSQL Database)
- **Authentication:** JSON Web Token (JWT)
- **Tools:** Postman (for API testing), Maven (for dependency management)

##  System Architecture
1. **User registers/login** ➝ Gets JWT token.
2. **JWT Authentication Filter** verifies the token before processing requests.
3. **Authenticated users** can manage books.
4. **Profile Controller** manages user profile operations.
5. **Wishlist Controller** handles adding/removing books from the wishlist.
6. **Book Controller** handles book-related operations.
7. **MongoDB Database** stores book data securely.

## 📂 Project Structure
```
📦 BookStoreApp
├── 📁 src/main/java/com/example/bookstore
│   ├── 📂 config      # Security Configuration
│   ├── 📂 controller  # API Controllers
│   ├── 📂 model       # Book & User Models
│   ├── 📂 repository  # MongoDB Repositories
│   ├── 📂 service     # Business Logic Services
│   ├── 📂 security    # JWT Utility & Filters
│   └── Application.java # Main entry point
├── 📄 pom.xml         # Maven Dependencies
└── 📄 README.md       # Documentation
```

##  Authentication & Security
- Uses **JWT** to authenticate users.
- **Spring Security** ensures protected API endpoints.
- Only authenticated users can access book routes.

##  API Endpoints
### **Auth Endpoints**
| Method | Endpoint | Description |
|--------|------------|----------------|
| `POST` | `/api/auth/register` | Register a new user |
| `POST` | `/api/auth/login` | Authenticate and get JWT token |

### **Book Endpoints** *(Requires JWT Authentication)*
| Method | Endpoint | Description |
|--------|------------|----------------|
| `POST` | `/api/books` | Create a new book |
| `GET` | `/api/books` | Get all books |
| `GET` | `/api/books/{id}` | Get a book by ID |
| `PUT` | `/api/books/{id}` | Update a book by ID |
| `DELETE` | `/api/books/{id}` | Delete a book by ID |

### **Filtering & Search**
| Query | Description |
|----------------------|-------------------------------|
| `/api/books?author=xyz` | Filter books by author |
| `/api/books?category=xyz` | Filter books by category |
| `/api/books?rating=4.5` | Filter books by rating |
| `/api/books?search=title` | Search books by title |

### **Profile Endpoints** *(Requires JWT Authentication)*
| Method | Endpoint | Description |
|--------|------------|----------------|
| `GET` | `/api/profile` | Get authenticated user's profile details |

### **Wishlist Endpoints** *(Requires JWT Authentication)*
| Method | Endpoint | Description |
|--------|------------|----------------|
| `POST` | `/api/wishlist/{bookId}` | Add a book to wishlist |
| `GET` | `/api/wishlist` | View wishlist |
| `DELETE` | `/api/wishlist/{bookId}` | Remove a book from wishlist |

## 🔧 Setup & Installation
### **Prerequisites**
- Java 17+
- Maven
- MongoDB

### **Steps to Run**
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/bookstore.git
   cd bookstore
   ```
2. Install dependencies:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```
4. Test API using **Postman** or any API client.
5. Make sure to include your mongodbUri in application.properties for testing.




