@SB-7
Feature: SwagLabs Application Execution

	@TEST_SB-1 @TESTSET_SB-6
		Scenario Outline: login page
		    Given i am an existing user
		    When i open browser to "<url>": www.saucedemo.com
		    And fill correct username as "<Username>" and password as "<password>"
		    And press login button
		    Then i see my application dashboard
		    Examples:
		      |             url               | Username | password |
		      |   https://www.saucedemo.com/  |standard_user |   secret_sauce  |
	@TEST_SB-2 @TESTSET_SB-6
	Scenario: Verify Shopping Cart
		Given Check all the products
		    And Select the product that you want to order
		    When Click on Add to cart
		    And it will add all your products in shopping cart
		    Then Click on shopping cart icon
	@TEST_SB-3 @TESTSET_SB-6
	Scenario: Continue Shopping
		Given Add another item
		    Then Checkout the product
		    And remove Item from cart
	@TEST_SB-4 @TESTSET_SB-6
	Scenario: Finish order process
		Given Enter address information
		    Then Click Finish
	@TEST_SB-5 @TESTSET_SB-6
	Scenario: Logout
		Given goto react button
		    Then click logout
		    And Close Browser
