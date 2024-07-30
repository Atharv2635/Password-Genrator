**Overview**
  "PasswordGenerator" is a simple Java application that generates secure random passwords of a specified length. 
  It uses SecureRandom for better randomness and includes a mix of uppercase letters, lowercase letters, numbers, 
  and special characters to ensure strong password complexity.

**Features**

  1) Generates random passwords of a user-specified length.
  2) Ensures passwords include a mix of:
    (a) Uppercase letters (A-Z)
    (b) Lowercase letters (a-z)
    (c) Numbers (0-9)
    (d) Special characters (!@#$%^&*()-_+=)
  3) Uses SecureRandom for cryptographic strength randomness.

**Prerequisites**

  Java Development Kit (JDK) installed on your machine. You can download it from https://www.oracle.com/in/java/technologies/downloads/.

**Running the Program**

  Clone the repository:
  
    git clone https://github.com/yourusername/PasswordGenerator.git
    cd PasswordGenerator
    
  Compile the Java program:
  
    javac PasswordGenerator.java

  Run the program:
  
    java PasswordGenerator
    
  The program will output a randomly generated password of length 12 by default. You can modify the length by 
  changing the length variable in the main method.

**Code Explanation**

  The "PasswordGenerator" class contains the following main components:

    1) Character Sets: The character sets for uppercase letters, lowercase letters, numbers, and special characters.
    2) Combine Character Sets: All character sets are combined into one string.
    3) SecureRandom: Used for generating random indices.
    4) Password Generation: A "StringBuilder" is used to construct the password by appending characters from random indices.


**Feel free to contribute to this project by submitting issues or pull requests. 
For major changes, please open an issue first to discuss what you would like to change.  
**
    
