# NMB Fintech Backend 🏦

This is the backend API for the **NMB Fintech App Clone**, built with **Spring Boot**. It is part of a full-stack mobile finance application that replicates the core features of the NMB Mobile App, with future enhancements for personal finance tracking and budgeting.

---

## 🔧 Tech Stack

- **Java 21**
- **Spring Boot 3**
- **Spring Security + JWT**
- **Spring Data JPA**
- **H2 Database** (for local dev)
- **Maven**

---

## 🚀 Features (Phase 1)

- Secure PIN-based login  
- JWT authentication  
- User profile + dummy dashboard  
- Modular code structure (ready for microservices)

---

## 📂 Project Structure

src/  
└── main/  
  ├── java/com/elinonga/nmb/backend/  
  │  ├── controller/  # REST Controllers  
  │  ├── model/     # JPA Entities  
  │  ├── repository/  # JPA Repos  
  │  ├── dto/       # Request/Response DTOs  
  │  └── security/   # JWT & Auth config  
  └── resources/  
    └── application.properties

---

## ▶️ Getting Started

1. **Clone the repo**  
   ```bash
   git clone https://github.com/dkmezza/nmb-clone-backend.git
   cd nmb-clone-backend

---

2. **Run the application**
- Open in VSCode or IntelliJ
- Run DemoApplication.java
- Access API at: http://localhost:8080

---

## 📌 Next Steps
- Setup PostgreSQL
- Implement full user management (register, reset PIN)
- Integrate real transaction data
- Add analytics for savings & spending

---

## 👥 Author
**David Mezza**
Tanzania 🇹🇿


> “This project is built for educational and professional portfolio purposes, inspired by the original NMB Mobile App.”




