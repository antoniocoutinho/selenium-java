# Selenium Java UI Automation Project

This repository contains a Java Selenium WebDriver automation framework for UI testing. It is designed using best practices such as the Page Object Model and data-driven testing.

## Features

- **Selenium WebDriver** for browser automation  
- **JUnit** for test execution  
- **EasyTest** for data-driven testing via CSV files  
- **Page Object Model** for maintainable and reusable UI interactions  
- **Headless Chrome** configuration for fast, CI-friendly test runs  

## Structure

- `src/test/java/tests/InformacoesUsuarioPageObjectsTest.java`  
  Main test class for validating user contact information management.

- `src/test/java/pages/`  
  Contains page object classes (`LoginPage`, `MePage`, `AddContactPage`) encapsulating UI actions.

- `src/test/java/suporte/`  
  Utility classes for common actions (`AddContact`, `RemoveContact`, `Web`).

- `src/test/resources/DDT.csv`  
  CSV file for parameterized, data-driven tests.

## How It Works

- Tests log in to [http://www.juliodelima.com.br/taskit](http://www.juliodelima.com.br/taskit), add and remove user contact information, and validate results.
- Page objects abstract UI interactions for maintainability.
- Test data is loaded from CSV for flexible, scalable test scenarios.
- ChromeDriver runs in headless mode for efficient execution.

## Getting Started


To run the Selenium Java UI automation tests in this project, follow these steps:

### Prerequisites

- **Java JDK 8 or newer**  
  Verify installation with:
  ```
  java -version
  ```

- **Apache Maven**  
  Verify installation with:
  ```
  mvn -version
  ```
- **Chrome Driver**  
  Download Chrome Driver:
  ```
  https://getwebdriver.com/chromedriver
  ```
### Steps

1. **Clone the repository**  
   ```
   git clone <your-repo-url>
   cd selenium-java
   ```

2. **Install dependencies and build the project**  
   ```
   mvn clean install
   ```

## Install Dependencies

To install only the project dependencies (without building), run:

```
mvn dependency:resolve
```

3. **Run the tests**  
   ```
   mvn test
   ```

All Selenium tests located in `src/test/java` will be executed automatically.

---

This project demonstrates maintainable, scalable UI automation with Java, Selenium, and data-
