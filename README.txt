1. Automation Tool/Design/FrameWork Used in Project:

      * I have executed this task using Selenium_Webdriver, with Java as programming language with TestNG framework
 and POM design (page object model)

     * Page Object Model in Selenium is a design pattern where web pages are represented using classes. 
Variables in the class can then be used to hold references to elements on the web page, and methods can be used to implement behaviors. 
This allows an elegant way of implementing test routines that are both readable and easier to maintain and extend in the future.


2. Project Framework Structure

 Project name : SRTasks

 Packages     :                                               Classess/File :

                1. BaseClass                                  Base

                2. WebElementPages                             1.LandingPage 

                                                               2.AddComputerPage 

                                                               3.FilterComputerPage

                                                               4.EditComputerPage


                3. TestCases                                   1.VerifyLandingPage

                                                               2.VerifyAddComputer

                                                               3.VerifyFilterComputer

                                                               4.VerifyEditComputer

3.Test Runner


    *Since i have implemented in a TestNG framework, need to use testng.xml file as runner file

    *you can find testng.xml file at the end of project file after Test-output folder and pom.xml file

    * Open the testng.xml file, already I have written the suite script in the file. So to execute, Right click on the opened file,
      select Run as -> TestNG suite.
    * I have included following 4 test cases in testng suite:

             <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="TestCases.VerifyLandingPage"/>
      <class name="TestCases.VerifyAddComputer"/>
      <class name="TestCases.VerifyFilterComputer"/>
      <class name="TestCases.VerifyEditComputer"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->


4. View Report

    * You can view the test results in the console
    * Also can view the test results in Test Out-put folder after refreshing the folder/project
    * Extend the Test out-put folder, select either one junit report/emailable-report.html/index.html


    