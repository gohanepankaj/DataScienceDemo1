Feature: Amazon buying functionality
	Scenario Outline: 
	Given open "chrome" browser
	And launch site using"https://www.amazon.in"
	When do serch in search box with product name"<prn>"
	Then selected product is display
	And add to the With same product
	Then checkout product is display in cart
	
	
	
	
	Examples:
	|prn|adr|
	|Sneaker Casual Shoes for Men|Pankaj Gohane Ramteke shop, Near balvikas school, MUL, MAHARASHTRA, 441224, India|