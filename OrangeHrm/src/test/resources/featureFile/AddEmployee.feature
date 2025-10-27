@SimpleLoginone
Feature: Add Employee in Hrm Portal

Scenario: Add Multiple Employee details from Excelsheet

Given User is logged into Hrm web application
When User add employee details from "EmployeeData.xlsx"
And  User clicked Save button 
Then Employees should be created successfully 
