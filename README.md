# Book Store Application

##  Overview
The **Book Store Application** is a web-based API that allows authenticated users to manage books, including creating, updating, searching, and deleting book entries. The system implements **JWT-based authentication**, ensuring secure access to book-related functionalities.

##  Features
- **User Authentication:** Register and login with secure password hashing.
- **JWT-based Authorization:** Access control using JSON Web Tokens.
- **Book Management:** CRUD operations (Create, Read, Update, Delete) for books.
- **Filtering & Search:**
  - Filter books by **author, category, and rating**.
  - Search books by **title** with partial matching.
- **Secure API Endpoints:** Only authenticated users can access book-related routes.

##  Tech Stack
- **Backend:** Spring Boot, Spring Security, JWT
- **Database:** MongoDB (NoSQL Database)
- **Authentication:** JSON Web Token (JWT)
- **Tools:** Postman (for API testing), Maven (for dependency management)

##  System Architecture
1. **User registers/login** ➝ Gets JWT token.
2. **JWT Authentication Filter** verifies the token before processing requests.
3. **Authenticated users** can manage books.
4. **Book Controller** handles book-related operations.
5. **MongoDB Database** stores book data securely.

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




