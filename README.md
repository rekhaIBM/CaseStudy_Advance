# 🧪 SauceDemo BDD Automation

## Overview
This project automates the full purchase workflow on [SauceDemo](https://www.saucedemo.com) using:

- **Cucumber (Gherkin)** for BDD-style test scenarios
- **Selenium WebDriver** for UI interactions
- **TestNG** for execution
- **Extent Reports** for reporting
- **Jenkinsfile** for CI/CD
- **Thread-safe WebDriver** for parallel runs

## Tech Stack
| Tool          | Purpose                    |
|---------------|----------------------------|
| Java 17       | Language                   |
| Selenium 4    | Browser automation         |
| TestNG        | Test framework             |
| Cucumber      | BDD Scenarios              |
| WebDriverManager | Driver management       |
| ExtentReports | Reporting                  |
| Jenkins       | CI/CD pipeline             |
| Maven         | Dependency management      |

## How to Run
```bash
# Clean & run tests using TestNG suite
mvn clean test -Dsurefire.suiteXmlFiles=TestNG.xml
