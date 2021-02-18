## Demo Challenge

#### Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com

#### Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

#### Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/

#### Expectations
We will be evaluating
1. Quality of test cases
2. Variety  of testing types (examples: boundary, happy path, negative, etc)
3. Code structure and organization
4. Naming conventions
5. Code readability
6. Code modularity

#### Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo

#### Test Cases

 1.Test cases to test Pizza_application

From top to bottom

Feature_1: Test for drop_downs

	Sceanrio_1: Default option:

	- When user log into "Pizza Order Form" page
	- Then user should to see "Pizza 1" default option should be "Choose Pizza"
	- And user should to see "Toppings 1" default option should be "Choose a Toppings 1"
	- And user should to see "Toppings 2" default option should be "Choose a Toppings 2"

	Feature_2:Is selected options for drop_downs

	Scenario_1:

	- Given user log into "Pizza Order Form" page
	- When user selecting each option of "Pizza 1"
	- Then user should to verify selected option is selected

	Scenario_2:

	- Given user log into "Pizza Order Form" page
	- When user selecting each option of "Toppings 1"
	- Then user should to verify selected option is selected

	Feedback: for "Toppings 1" and "Topping 2" could be replaced in one option.Same toppings.




	Scenario_3:

	- Given user log into "Pizza Order Form" page
	- When user selecting each option of "Toppings 2"
	- Then user should to verify selected option is selected

	Feature_3: Test Quantity and Cost

	Scenario_1: Default of Quantity and Cost

	- Given user log into "Pizza Order Form" page
	- Then user should to see the default "Quantity" is "0"
	- And user should to see the default "Cost" is "0"


	Scenario_2:user should to see the total price of "Cost"

	- Given user log into "Pizza Order Form" page
	- When user selecting any option of "Pizza 1"
	- And user enter number of "Quantity"
	- Then user should to see the total price of "Cost"


	Feature: Pickup information

	For this feature need some work:

	"Name" there is no constrain it accept any characters with digits
	and it could accept 100 characters.This is too much.

	"Email" there is no constrain it accept any characters with digits
	and it could accept 100 characters.This is too much.

	"Phone" there is no constrain it accept any characters with digits
	and it could accept 100 characters.This is too much.10 is normal.

	Pickup information is not printing and appearing anywhere.Pickup information, is not possible to assert, and validate.
	It should to appear on receipt or pop-up which generating after click "Place Order" button.

	Feature: Payment information

	For two radio buttons "Credit Card" and "Cash on Pickup", we just can check for clickability and if they are isSelected().
	But it same here, it is not appearing and printing anywhere.
	Like: "Payment by Credit Card" or "Cash on PickUp"

	For "Credit Card" it should be separate table to insert Credit Card Information. In case if person making payment on line.

	Feature : "Place Order" and "Reset" buttons

	1. "Place order" by clicking this button should appear receipt, but it suppose to looks like receipt or any kind of "Title"

	Ex.:
		Receipt
	Thank you for your order!
	Order # 304
	Full Name
	Phone Number
	Email
	8 Slice
	2 toppings:Olives,Mushroom

	Total price 19.5$

	By default if user accidentally press button "Place Order" with out any selection it should to be message:

	No pizza was selected
	No payment method was selected
	And should not reset "Pickup Information" - Name,Email,Phone

	2. "Reset" when user click on "Reset" button all data should to be reset.
		But here "Toppings 1" and "Toppings 2" unchangeable.


		This is what can i see with first eye view for UI testing and all those ways can be automated and it also possible back end testing for DB validation.
  

