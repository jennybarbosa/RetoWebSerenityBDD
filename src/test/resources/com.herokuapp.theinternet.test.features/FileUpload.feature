#Author: Jenny Alejandra Barbosa - jenny.barbosa@sqasa.co
Feature: File upload in herokuapp

  Scenario: File upload successfully
    Given that i am in herokuapp
    When I upload a txt file
    And I validate message "File Uploaded!" for txt file
    And I upload a png file
    Then I validate message "File Uploaded!" for png file

