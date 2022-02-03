Test Automation For Hotel Booking System
Framework Design Approach
Selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web.

Page Factory is an inbuilt Page Object Model concept for Selenium WebDriver but it is very optimized.Here we follow the concept of separation of Page Object Repository and Test Methods.

Additionally, with the help of PageFactory class, we use annotations @FindBy to find WebElement. We use initElements method to initialize web elements.

For UI Tests : Selenium-cucumber-Maven with PageFactory Design Pattern.

Tools And Environment
Eclipse oxygen 3a
Java-1.8
Maven-3.5.3
Enable cucumber-java plugin in Eclipse
Git
Required browsers (Chrome-V97.0)
Windows 64bit
Configure JAVA_HOME and MAVEN_HOM in the Environmental Variables : Follow the setup instructions specified in here https://www.mkyong.com/maven/how-to-install-maven-in-windows/

Test Architecture
  AdactinHotelBooking
      |src/main/test
      |	 |BaseClass
      |	 |PageClass
      |src/test/java
      |  |JvM
      |  |	|jvm config
      |  |Stepdefinition
      |  |  |Stepdefinitions
      |  |  |Hooks
      |  |TestRunner
      |src/test/resources
      |	 |Features
      |  |  |HotelBooking.featuree
      |  |failed.txt
      |  |JsonReport
      |  |  |json.rep.json
      |JvmReport
      |	 |Cucumber-html-reports
      |target
      |	 |Report
      |  |junit.xml
      |	 |Screenshot
       
Steps to run the tests
Please make sure to have all the tools and libraries mentioned in the "Tools And Environment" section.

Step-1: Clone the repository from https://github.com/BharathkannaP/Cucumber-Adactin.git

Step-2: Use the following maven commands to run the tests.

"mvn test" executes testcases


