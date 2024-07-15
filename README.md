# simran-project
# Git Project
# Overview
Test Automation (Java, Selinium, Cucumber, BDD)
Test Automation means using a software tool to run repeatable test against the application to be tested. It contains the automation framework for testing Swag Lab Websites. It includes BDD Scenarios written in Gherkin language and implemented using a test automation tool.
In this project we need to know what test automation is and how this project is created and executed in Intellij by Test Runner.
# Pre-requisites
1. Install Intellij
2. cloning this Project
3. Dependency

# Install Idea and How to Install

Intellij Idea is a type of development environment popularly used and designed to develop applications written in JVM based languages like Java,Ruby,Kotlin etc. JetBrains has developed this java IDE. It is supported on all operating systems like Windows, Mac, Linux.

Steps to install Intellij Idea
Community edition - Free and open source. Intellij Idea Ultimate edition - For commercial purposes.

Steps
1.Search intellij Idea on Google

2.Next, Go to https://www.jetbrains.com/idea/

3.Follow the Community Edition

# Dependencies in POM.Xml file
These are the dependencies added available in POM.Xml:

1.Junit

2.Selenium WebDriver

3.Cucumber

4.Cucumber Junit

Link to Maven repo - https://mvnrepository.com/

# Feature File
In the Feature file, all scenarios are written for swag lab website. It is written in Gerkin Language Example/ Scenario, Background, Given,When, Then, And, But,Background, Scenario Outline and Examples.

# Step Definitions
Step definitions connect Gherkin's steps to programming code. A step definition carries out the action that should be performed by the step.

Once all the dependencies are added on POM.XML file, we create a project by writing the BDD Scenarios using Gherkin Language which is understood easily by non-Programmers also.

Based on the Scenarios we create:

Step Definitions: Snippets generated when we run Scenarios.

# Page Object
Page Objects class: we write code for the objects located in base page.

# Utilities
Constant Utils: the elements which are constant we write in this class so we can use it when needed.

# Test Runner Class
In the TestRunner Class, You run the test and Generate report. To run the test need to add CucumberOptions (Plugins,features,glue and tags) in this class.

# Generate the Report
To generate the Report, In intellij right click on cucumber.html-> open in -> Browser -> Chrome



