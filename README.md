# 📘 Enhancing Software Quality with JUnit – Calculator Demo

This project demonstrates how to improve software quality using **JUnit 5** with a simple Java calculator. You'll learn:

✅ How to create a Java project using **Maven**  
✅ How to write **unit tests** using **JUnit**  
✅ How to test **positive**, **negative**, and **edge** cases  
✅ How to run tests inside **IntelliJ IDEA**

---

## 📦 Project Overview

We built a simple `Calculator` class that supports:

- Addition
- Subtraction
- Multiplication
- Division

Then, we wrote JUnit 5 tests to ensure the calculator works correctly — even in edge cases like dividing by zero or integer overflow.

---

## 🧑‍💻 Technologies Used

| Tool           | Purpose                        |
|----------------|--------------------------------|
| Java 17        | Main programming language      |
| Maven          | Dependency management & build  |
| JUnit 5        | Unit testing framework         |
| IntelliJ IDEA  | IDE used for development       |

---

## 🏗️ Project Structure

```
calculator-junit-demo/
├── pom.xml                    # Maven config
└── src
    ├── main
    │   └── java
    │       └── com.example.calculator
    │           └── Calculator.java      # Calculator logic
    └── test
        └── java
            └── com.example.calculator
                └── CalculatorTest.java  # JUnit test cases
```

---

## 🚀 Getting Started (in IntelliJ IDEA)

> 🔧 Make sure you have IntelliJ IDEA and Java 17 installed.

### 1. Clone or Download

```bash
git clone https://github.com/yourusername/calculator-junit-demo.git
cd calculator-junit-demo
```

### 2. Open in IntelliJ

- File > Open > Select the folder `calculator-junit-demo`
- IntelliJ will detect `pom.xml` and load dependencies.

### 3. Run Tests

- Open `CalculatorTest.java`
- Right-click > **Run 'CalculatorTest'**
- You’ll see ✅ green checkmarks if all tests pass!

---

## ✅ Test Case Summary

Each method is tested with:

- ✅ **Positive cases**: Normal valid inputs
- ❌ **Negative cases**: Invalid or unexpected inputs
- ⚠️ **Edge cases**: Boundary conditions like large values or 0

### ✔️ Example Tests

| Operation  | Type        | Example                      |
|------------|-------------|------------------------------|
| Add        | Positive    | `add(5, 3) → 8`              |
| Add        | Edge        | `add(Integer.MAX_VALUE, 1)`  |
| Divide     | Negative    | `divide(5, 0)` → throws error|
| Multiply   | Edge        | `multiply(0, 9999) → 0`      |
| Subtract   | Positive    | `subtract(9, 4) → 5`         |

---

## 🤝 Contribution

Want to improve it? Feel free to:

1. Fork the repo
2. Make changes
3. Create a pull request

---

## 📚 Further Learning

- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [Java Official Documentation](https://docs.oracle.com/en/java/)

---

## 📃 License

This project is licensed under the MIT License — you’re free to use and modify it!
