Feature: End‑to‑End purchase flow on Sauce Demo
  As a standard user
  I want to buy multiple items successfully
  So that I see a confirmation message after checkout

  @Smoke
  Scenario Outline: Place an order successfully
    Given I launch Sauce Demo and verify the title is "Swag Labs"
    When I log in with username <username> and password <password>
    And I add the following items to the cart
    And I proceed to checkout with first name "John", last name "Doe", postal code "560001"
    Then I should see the message "Thank you for your order!" on the confirmation page

    Examples:
      | username       | password     |
      | standard_user  | secret_sauce |