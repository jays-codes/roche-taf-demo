# roche-taf-demo
Jay's project repo for a Test Automation framework for Roche

NOTE for David: Buddy, thank you for taking the time to interview me earlier. And thank you for taking a look at this as well. This is all I can manage within a few hours. I've added a file as well for the Peak solution using BST (PeakBST.java) :-D. 

And don't forget to vote if you haven't (hopefully KH wins ;)) Thanks again!

-Jay

proj: [roche-taf-demo](https://github.com/jays-codes/roche-taf-demo/tree/master/roche-taf-demo) | jdk 21, Selenium 4.26

TO RUN: 
1. go to project root folder
2. mvn clean test -Dtest=StandAloneTest
3. Test Results are generated in <project root>/test-output/index.html

dependencies: selenium-java, testng, cucumber-java, cucumber-testng, webdrivermanager, poi, mysql, jackson, extentreports

Activity Log:
- created Utility.java to read properties from GlobalData.properties; replaced several hardcoded values with calls to Utility.getProperty()
- Initial sample Test: StandAloneTest.java - Open browser and navigate to roche diagnostics home page
- setup template for dependencies, 
    packages (src/main/java:pageObjects, util; src/test/java:test, test.components); common files: pageObjects[AbstractComponent, LandingPage], util[ExtentReportNG], test.components[BaseTest, Listeners, Retrier], test.data[ExcelDataUtil, JDBCUtil, JsonDataReader], GlobalData.properties
- initial project setup

Improvements Needed/TODOS:
- A LOT
- Define TestNG suite
- Define proper smoketest scenario
- implement demo for Cucumber - feature files, etc.
- implement demo for RestAssured for automated API/Integration testing
- explore using Spring for DI
- implement demo for CI/CD - mvn:jenkins:dockerize(?) 
- Application of Extent Reports
- demo Parallel Execution of Test (TestNG)
- Headless Execution
- apply SOLID principles
- demo for Cloud Testing (Browserstack, etc.)

## Framework Diagram
<img src="roche-tafdemo-diag.png" alt="Framework Diagram" width="100%">
