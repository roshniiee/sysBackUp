Feature: ConferenceRegistration Test

Scenario: Titile test
Given user is in regsitration form page
When title matches the page title
Then prints title in console

Scenario: firstname test
Given user is in regsitration form page
When user enters invalid firstname and clicks next
Then displays alert box for firstname

Scenario: lastname test
Given user is in regsitration form page
When user enters invalid lastname and clicks next
Then displays alert box for lastname

Scenario: Email test
Given user is in regsitration form page
When user enters invalid email and clicks next
Then displays alert box for email

Scenario: Valid Email test
Given user is in regsitration form page
When user enters invalid emailid and clicks next
Then displays alert box for invaildEmail

Scenario: ContactNo test
Given user is in regsitration form page
When user enters invalid contactno and clicks next
Then displays alert box for contactNo

Scenario: Valid ContactNo test
Given user is in regsitration form page
When user enters invalid number and clicks next
Then displays alert box for invaildNo

Scenario: No of People test
Given user is in regsitration form page
When user enters invalid number of people and clicks next
Then displays alert box for number of people

Scenario: building and rooms  test
Given user is in regsitration form page
When user enters invalid rooms and clicks next
Then displays alert box for building and rooms

Scenario: area test
Given user is in regsitration form page
When user enters invalid area and clicks next
Then displays alert box for area

Scenario: city test
Given user is in regsitration form page
When user enters invalid city and clicks next
Then displays alert box for city

Scenario: State test
Given user is in regsitration form page
When user enters invalid State and clicks next
Then displays alert box for State

Scenario: Member Access test
Given user is in regsitration form page
When user enters invalid Member Access and clicks next
Then displays alert box for Member Access

Scenario: valid details test
Given user is in regsitration form page
When user enters valid details and clicks next
Then displays alert box for valid
And navigates to payment details page