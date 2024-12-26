Automated Testing Framework (UiandApiAssignment)


Overview :-
This repository contains an automated testing framework built using Selenium WebDriver, RestAssured, TestNG, and Java. It supports both UI automation and API testing, with the ability to run tests independently or through a centralized testng.xml file. Dependencies are managed under pom.xml.


Features :-

UI Automation: Automates web application user interface tests.
API Automation: Validates API data with automated tests.



Structure :-

project-directory/
├── src/
│   └── test/
│       └── java/
│           └── testclasses/
│               ├── RunApiTest.java        # Contains the API test case
│               ├── RunUiTest.java         # Contains the UI test case
├── testng.xml                             # TestNG configuration file (To trigger multiple tests at same time)
├──




Prerequisites :-

Java JDK: Ensure Java is installed and configured.
Maven: Install Maven for dependency management.
TestNG: Ensure TestNG is installed in your IDE.



Setup :-

1. Clone the repository:
git clone https://github.com/laksh2408/UiandApiAssignment.git
2. cd yourrepository
3. Install dependencies:
mvn clean install



How to Run :-

Using the Test Classes
Run UI Test: Run As -> TestNG Test
Run API Test: Run As -> TestNG Test

Using TestNG XML
1. Navigate to the project directory.
2. Open the testng.xml file
3. Run as -> TestNG Suite


