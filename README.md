# 🚗 Car Shop Inventory Management System

## 📌 Overview

The Car Shop Inventory Management System is a desktop-based application developed using Java Swing and MySQL.
It is designed to help car dealerships efficiently manage vehicle stock, process sales, and generate professional reports.

This system demonstrates real-world implementation of database integration, user authentication, and reporting tools in a structured desktop environment.

---

## 🎯 Features

* 🔐 Secure Login System
* 🚘 Vehicle Inventory Management
* 💰 Sales Processing Module
* 📊 Sales & Inventory Reports (JasperReports Integration)
* 🗄️ MySQL Database Connectivity
* 🖥️ Clean Java Swing User Interface

---

## 🛠️ Technologies Used

* **Java (Swing GUI)**
* **MySQL Database**
* **JDBC**
* **JasperReports**
* **NetBeans IDE**
* **Maven (if applicable)**

---

## 🧱 System Architecture

Application Flow:

Login Page → Dashboard → Inventory / Sales → Reports

The system uses:

* JFrame navigation
* PreparedStatements for secure database queries
* MVC-inspired structure for better maintainability

---

## 🖼️ Screenshots

> Add your screenshots below this section

### 🔑 Login Page

(Add image here)

### 📋 Dashboard

(Add image here)

### 🚘 Inventory Management

(Add image here)

### 💵 Sales Module

(Add image here)

### 📊 Reports

(Add image here)

---

## 🗃️ Database Structure

The system connects to a MySQL database containing tables such as:

* `users`
* `vehicles`
* `sales`
* `customers`

All queries are handled using JDBC with proper error handling.

---

## ⚙️ How to Run the Project

1. Clone the repository
2. Open the project in NetBeans
3. Configure your MySQL database
4. Update database credentials in the connection class
5. Run the application

---

## 🔒 Login Credentials (For Testing)

You may create your own user in the database or use:

Username: admin
Password: 1234

(Ensure it exists in your database.)

---

## 📈 Future Improvements

* Role-based access control (Admin / Salesperson)
* Search and filtering functionality
* Data validation improvements
* Deployment packaging (Executable JAR)
* Cloud database hosting

---

## 👨‍💻 Author

Developed as a portfolio project to demonstrate:

* Java desktop development
* Database integration
* Inventory system logic
* Report generation

