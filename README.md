# aEquilibrium

Tools and Technologies :

1. Java (Programming Language)
2. Selenium (UI automation tool)
3. Cucumber (BDD tool)
4. Junit (unit testing tool)
5. Maven (Build tool)
6. Page Factory (Design Pattern)

Test automation framework is developed using the above tools and technologies with Cucumber BDD with Page Facotry design pattern.

Steps to import the Project :

Pre-requisites : Java JDK1.8, Maven & Eclipse IDE(Mars and above) should be already installed in the system.

1.Clone the project from github into local workspace

2.Open Eclipse, File -> import -> Maven -> Existing projects in to workspace -> select the project cloned

3. If you see any error after import, right click on the project ->Maven -> Update Project

4. Open file TestRunner.Java file and right click -> run as -> Junit test

5. Automated browser will open and testcases will be executed.

6. At the end of the execution, we can navigate to target folder in the project.

7. We can see index.html, it can be opened as right click on index.html -> open with -> web browser, where u can see the failed and passed test steps.

8.The framework also takes screenshot incase of any failed testcases, named as embedded0,1,2 and so on.