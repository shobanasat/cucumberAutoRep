Feature: Create facebook account
Login as new user and creating facebbook account

Scenario: Validate first name field
Given User need to be on facebook login page
When User enters first name
Then User checks for availability of first name

#Scenario: Validate create user multiple fields
#Given User need to be on facebook login page
#When User enters first name 
#And User enters surname
#Then User checks for availability of first name
#But User mobile field should be blank
