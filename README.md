# Spring Boot JWT Authentication & Authorization API


A production-style Spring Boot REST API project demonstrating **JWT Authentication**, **Role-Based Authorization**, **Spring Security**, and clean layered architecture using Java and Spring Boot.

This project showcases how to build secure REST APIs with login/signup flows, JWT token validation, protected endpoints, exception handling, and role management.

---

# 🚀 Features

- User Registration (Signup)
- User Login Authentication
- JWT Token Generation
- JWT Token Validation
- Role-Based Authorization (`USER`, `ADMIN`)
- Spring Security Integration
- Custom Exception Handling
- CORS Configuration
- DTO-Based Request/Response Handling
- Secure Password Encoding
- RESTful API Design
- Layered Architecture
- Clean Package Structure

---

# 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- Maven
- MySQL / PostgreSQL
- Lombok

---

# 📂 Project Structure

```text
src/main/java
└── com.example.demojwt
    ├── config
    │   ├── CorsConfiguration.java
    │   └── SecurityConfig.java
    │
    ├── constant
    │   └── ERole.java
    │
    ├── controller
    │   ├── AuthController.java
    │   └── TestController.java
    │
    ├── dto
    │   ├── ErrorDTO.java
    │   ├── JwtResponseDTO.java
    │   ├── LoginRequestDTO.java
    │   ├── MessageResponseDTO.java
    │   └── SignupRequestDTO.java
    │
    ├── entity
    │   ├── RoleEntity.java
    │   └── UserEntity.java
    │
    ├── exception
    │   ├── AuthEntryPointJwt.java
    │   ├── BusinessException.java
    │   └── CustomExceptionHandler.java
    │
    ├── filter
    │   └── JwtAuthFilter.java
    │
    ├── repository
    │   ├── RoleRepository.java
    │   └── UserRepository.java
    │
    ├── service
    │   ├── JwtServiceImpl.java
    │   ├── UserDetailsImpl.java
    │   └── UserServiceImpl.java
    │
    ├── util
    │   └── CommonUtil.java
    │
    ├── DemojwtApplication.java
    └── StartUp.java
```

---

# 🔐 Authentication Flow

1. User registers using `/api/auth/signup`
2. Password gets encrypted using Spring Security
3. User logs in using `/api/auth/signin`
4. JWT token is generated
5. Client sends JWT token in Authorization header
6. JWT Filter validates token for every protected request
7. Access is granted based on user roles



# ▶️ Running the Application

## Clone Repository

```bash
git clone <repository-url>
```

---

## Configure Database

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/demojwt
spring.datasource.username=root
spring.datasource.password=password
```

---

## Build Project

```bash
mvn clean install
```

---

## Run Application

```bash
mvn spring-boot:run
```

Application starts on:

```text
http://localhost:8080
```



# 📌 Key Learning Concepts

- Spring Security Fundamentals
- JWT Authentication Workflow
- Stateless Security Architecture
- Authentication vs Authorization
- Request Filtering
- Exception Handling in Spring Boot
- Role-Based Access Control (RBAC)
- DTO Design Pattern
- Repository-Service-Controller Pattern



# 👨‍💻 Author

Saket Satpute

---

# ⭐ Notes

This project is intended for learning and demonstrating secure backend API development using Spring Boot and JWT Authentication.
