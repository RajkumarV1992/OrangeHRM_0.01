@SimpleLogin
Feature: Login functionlity 

Scenario: Successfull validation with valid credentials.

Given User open the valid Orange Hrm url
When User entered valid Credentials "Admin" and "admin123"
And click login button
Then User sees OrangeHRM portal Home Page

