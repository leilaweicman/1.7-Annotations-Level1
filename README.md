# 1.7.Annotations-Level1

## 📄 Description – Exercise Statement

This project contains the solution to the following Java exercises:

### Exercise 1
Create a hierarchy of objects with three classes:
- `Worker` (base class)
- `OnsiteWorker` (subclass)
- `OnlineWorker` (subclass)

The `Worker` class includes:
- Attributes: `name`, `lastName`, `pricePerHour`.
- A method `calculateSalary(int hoursWorked)` that multiplies the number of hours by the hourly rate.

The subclasses must override this method using `@Override`:
- **OnsiteWorker**: salary = hours × pricePerHour + static value of `gasoline`.
- **OnlineWorker**: salary = hours × pricePerHour + constant internet fee.

A `Main` class demonstrates the behavior of `@Override`.

---

### Exercise 2
Modify the previous classes to include some **deprecated methods** (e.g., an older version of the salary calculation).
- Use the `@Deprecated` annotation on those methods.
- From a separate class (`Main`), invoke the deprecated methods.
- Suppress compiler warnings with `@SuppressWarnings("deprecation")`.

This demonstrates the behavior of both `@Deprecated` and `@SuppressWarnings`.

---

## 💻 Technologies Used
- Java 17  
- IntelliJ IDEA  
- Git & GitHub  

---

## 📋 Requirements
- JDK 17 or higher installed  
- IntelliJ IDEA (or any Java-compatible IDE)  
- Git  

---

## 🛠️ Installation
Clone the repository and access the project folder:

```sh
git clone https://github.com/leilaweicman/1.7.Annotations-Level1.git
cd 1.7.Annotations-Level1
```

---

## ▶️ Execution

### Exercise 1

Run the `Main` class:

```sh
java exercise1.Main
```

Expected output (example):

```sh
Onsite Worker Salary: 3250.0
Online Worker Salary: 3230.0
```

### Exercise 2

Run the `Main` class:

```sh
java exercise2.Main
```

Expected output (example):

```sh
Onsite Worker Salary: 3200.0
Online Worker Salary: 3200.0
```

---

## 🌐 Deployment
Not applicable (local practice project).


---

## 🤝 Contributions

1. Fork this repository.
2. Create a new branch:
```sh
git checkout -b feature/NewFeature
```
3. Commit your changes:
```sh
git commit -m "Add NewFeature"
```
4. Commit your changes:
```sh
git push origin feature/NewFeature
```
5. Open a Pull Request.
