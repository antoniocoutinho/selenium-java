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

1. Clone the repository.
2. Install dependencies (Selenium, JUnit, EasyTest).
3. Run tests using your IDE or command line.

---

This project demonstrates maintainable, scalable UI automation with Java, Selenium, and data-
