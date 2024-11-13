# 🚀 Automation Framework with Selenium

This framework is built to automate testing of (https://www.saucedemo.com/) using Selenium WebDriver with Java, implementing the Page Object Model (POM) design pattern. 
The framework includes automated tests for core functionalities such as product purchase, shopping cart management, and user Logout.

# 💻Technology Stack

1. Java
2. Selenium WebDriver
3. TestNG
4. Log4j
5. Maven
6. Chrome WebDriver

# 📦Dependencies

1. org.seleniumhq.selenium<
2. org.testng
3. com.google.code.gson
4. org.apache.logging.log4j
5. io.github.bonigarcia

# 🔎 Test Scenarios
The framework covers the following test scenarios:

1. Purchase Test
   
     1.1 Login to the application
   
     1.2 Navigate to product page

     1.3 Add product to cart

     1.4 Complete checkout process

     1.5 Verify checkout confirmation


   
![image](https://github.com/user-attachments/assets/68f0e1e6-9499-4be2-895e-f76ef2760bbe)

2. Cart Test
   
     2.1 Add 3 random items to cart
   
     2.2 Remove items from cart
   
     2.3 Check is the cart empty

   
![image](https://github.com/user-attachments/assets/b0b927c5-345b-46c1-998b-1d81702bba3b)

   
3. Logout Test

    3.1 Perform logout operation
   
    3.2 Verify successful logout
   
    3.3 Check redirect to login page
   
![image](https://github.com/user-attachments/assets/fead111c-8137-43f2-ba50-5883e35078e2)



# ⚠️ Warning
if when cloning the repository via cmd, you run the suite.xml and the console gives you an error in the .iws file, please clone the repository directly from the IDE, it should no longer throw an error.
