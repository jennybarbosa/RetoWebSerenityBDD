#Author: Jenny Alejandra Barbosa - jenny.barbosa@sqasa.co
Feature: File download in herokuapp

Scenario: File download successfully
Given that i am on herokuapp
When I download a file
Then I open the file
