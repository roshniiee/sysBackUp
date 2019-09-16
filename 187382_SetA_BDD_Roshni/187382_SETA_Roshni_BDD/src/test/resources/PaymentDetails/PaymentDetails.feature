Feature: Payment Details Test

Scenario: Titile test
Given user is in Payment form page
When title matches the payment page title
Then prints the title in console

Scenario: cardHolder name test
Given user is in Payment form page
When user enters invalid name  and clicks makepayment button
Then displays alert box for invalid name

Scenario: Debit Card Number test
Given user is in Payment form page
When user enters invalid Debit Card Number and clicks makepayment button
Then displays alert box for invalid number

Scenario: CVV test
Given user is in Payment form page
When user does not enter invalid CVV value and clicks makepayment button
Then displays alert box for invalid cvv

Scenario: expiration month test
Given user is in Payment form page
When user enters invalid expiration month and clicks makepayment button
Then displays alert box for invalid month
Scenario: expiration year test
Given user is in Payment form page
When user enters invalid expiration year and clicks makepayment button
Then displays alert box for invalid year
  
Scenario: Valid details test
Given user is in Payment form page
When user enters valid  payment details and clicks makepayment button
Then displays alert box for successful registration