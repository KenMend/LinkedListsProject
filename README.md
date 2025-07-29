## Project Description

This application is a graphical Java program developed using **NetBeans**, designed for managing ticket purchase requests for a cinema in the village. It was built as part of a **Data Structures course**, with the primary objective of applying and demonstrating the use of **singly linked lists** implemented manually without built-in Java collections.

All interactions with the user are handled through a **graphical user interface (GUI)** — no console input/output or dialog boxes are used.

---

## Learning Objective

- Apply the functionality of **singly linked lists** using custom node and pointer structures.

---

##  Concepts Covered

- Linked lists (manual implementation)
- Node traversal using pointers
- GUI development with Java Swing
- Random number generation
- Dynamic data management in memory

---

##  Tools & Requirements

- IDE: **NetBeans (latest version)**
- Language: **Java**
- GUI: **Java Swing**
- Data must remain in memory during execution.
- **No use of Java collections** such as `ArrayList` or `LinkedList`.

---

## 🚀 Features

### ✅ Request Registration
- A GUI screen allows users to register a **ticket request**.
- Fields included:
  | Field                | Description                                   |
  |---------------------|-----------------------------------------------|
  | Movie ID            | Auto-incremented integer                      |
  | Applicant Name      | Alphanumeric input                            |
  | Age                 | Randomly generated integer (between 12 and 100) |
  | Ticket Price        | Based on age range:                           |
  |                     | • 12–20: ¢2000                                |
  |                     | • 21–64: ¢2500                                |
  |                     | • 65–100: ¢1500                               |
  | Paid                | Boolean field; defaults to `false`            |

---

### List of Requests
- Displays all current requests using a **table (JTable)**.
- The list is traversed using manually implemented **next pointers** between nodes.

---

### Pay for a Request
- A user can select a request from the list and **mark it as paid**.
- Once paid, the request is **removed from the linked list**.
- The table is refreshed automatically after the update.

---

## Notes

- All request data is stored in memory and lost upon closing the application.
- The linked list is implemented using custom node classes with `next` references.
- No external libraries or Java collection classes are used.
- The application is fully interactive through GUI components like text boxes and tables.

---

## Author

**Keneth Mendez**  
Data Structures Course – Linked List Evaluation Project  
UNED – 2025

---

ma by using linked lists

s
