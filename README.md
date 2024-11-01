# roche-taf-demo
Jay's project repo for a Test Automation framework for Roche

proj: https://github.com/jayslabs/roche-taf-demo | jdk 21, mvn

dependencies: selenium-java, testng, cucumber-java, cucumber-testng, webdrivermanager, poi, mysql, jackson, extentreports

- Initial sample Test: StandAloneTest.java - Open browser and navigate to roche diagnostics home page
- setup template for dependencies, 
    packages (src/main/java:pageObjects, util; src/test/java:test, test.components); common files: pageObjects[AbstractComponent, LandingPage], util[ExtentReportNG], test.components[BaseTest, Listeners, Retrier], test.data[ExcelDataUtil, JDBCUtil, JsonDataReader], GlobalData.properties
- initial project setup
