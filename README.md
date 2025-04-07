# Suite test to test shopping functionality for Saucedemo
Create a suite test and implement the test cases of shopping functionality based on Java, Selenium, Cucumber and ChromeDriver.

---

## Prerequisites
- **Java**: JDK 21 or higher
- **Maven**: Version 4.0 or higher
- **IDE**: IntelliJ IDEA (recommended)

---

## Installation

### Setup in IntelliJ
- Open IntelliJ IDEA.
- Select **File > Open**.
- Navigate to the extracted project folder and open it.
- Ensure that IntelliJ recognizes the project as a **Maven** project.

---

## Run the Test

### From IntelliJ
- Open project folder in IntelliJ
- Under the Maven Lifecycle, click clean to delete target folder
- Under the Maven Lifecycle, click verify to run test cases

### From Command Line
- Open project folder in terminal
- Write 'mvn clean' to delete target folder
- Write 'mvn verify' to run test cases

---

#### 🧾 HTML Test Report
Find the report of test under the target folder:
  - target/html-report.html

---

## CI with GitHub Actions

This project uses [GitHub Actions](https://github.com/mahya-adimi/saucedemo/blob/main/.github/workflows/regression-test.ymll) for continuous integration.

Every push request to the `main` branch triggers automated:
- Build and test with Maven
- Run Cucumber tests
- Generate and upload an HTML report and Cucumber JSON Report


### 🧾 Test Report

After each run, the Cucumber HTML report is available under:
**GitHub → Actions → Workflow run**
  
