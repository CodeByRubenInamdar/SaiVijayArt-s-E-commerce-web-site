# 🛍 Sai Vijay Art – E‑Commerce Website  

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.8-green?logo=springboot)  
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?logo=mysql)  
![HTML](https://img.shields.io/badge/HTML-5-orange?logo=html5)  
![CSS](https://img.shields.io/badge/CSS-3-blue?logo=css3)  
![JavaScript](https://img.shields.io/badge/JavaScript-ES6-yellow?logo=javascript)  
![License](https://img.shields.io/badge/License-MIT-brightgreen)

Sai Vijay Art is a **full‑stack e‑commerce platform** for showcasing and selling artworks.  
It features **product listings, search & filtering, cart management, and secure order placement**, built with **Spring Boot (backend)** and **HTML/CSS/JS (frontend)**.

---

## 🚀 Features  
✅ **Home Page with Art Categories**  
✅ **Product Listing with Search & Filters**  
✅ **Product Details Page with Gallery**  
✅ **User Registration & Login**  
✅ **Shopping Cart & Checkout System**  
✅ **MySQL Database Integration with Hibernate (JPA)**  

---

## 🛠 Tech Stack  

| Technology       | Purpose                        |
|------------------|--------------------------------|
| **Java (Spring Boot)** | Backend REST API          |
| **MySQL**        | Database for persistent storage |
| **Spring Data JPA** | ORM for database operations |
| **HTML, CSS, JavaScript** | Frontend UI            |
| **Bootstrap**    | Responsive UI Design          |
| **Maven**        | Build & Dependency Management |

---

## 📂 Project Structure  

```
SaiVijayArt/
 ├── src/main/java/com/saivijayart/
 │   ├── controller/     # REST Controllers
 │   ├── entity/         # JPA Entities
 │   ├── repository/     # Spring Data Repositories
 │   ├── service/        # Business Logic
 │   └── SaiVijayArtApplication.java
 ├── src/main/resources/
 │   ├── application.properties
 │   └── templates/      # Thymeleaf Templates
 └── pom.xml
```

---

## ⚙️ Setup & Installation  

### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/CodeByRubenInamdar/SaiVijayArt.git
cd SaiVijayArt
```

### 2️⃣ Configure MySQL Database  
Create a MySQL database named `spring` (or update in `application.properties`)  

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spring
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Build & Run  
```bash
mvn clean install
mvn spring-boot:run
```

---

## 📌 Key Pages  

✅ **Home Page** – Showcases categories & featured artworks  
✅ **Product Page** – Displays all products with search & filters  
✅ **Product Details Page** – Detailed view with multiple images  
✅ **Cart Page** – Shows selected items & checkout option  
✅ **Registration/Login Page** – User authentication system  

---


## 🤝 Contributing  
1. Fork the repository  
2. Create a new branch (`feature-xyz`)  
3. Commit your changes  
4. Push to your branch and create a PR  

---

## 📬 Contact  

👤 **Ruben Inamdar**  
📧 Email: rubeninamdar86@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/ruben-inamdar)  
💻 [GitHub](https://github.com/CodeByRubenInamdar)
