# Check-Digit

Check-Digit is a Java application that provides functionalities for calculating and verifying check digits based on a specific algorithm.

## Features

- Calculate the check digit for a given number based on the provided algorithm.
- Verify the correctness of a number based on its check digit.
- Analyze the distribution of check digits for a range of numbers.

## Usage

1. Clone the repository:

   ```shell
   git clone https://github.com/adamkeidz/Check-Digit.git
   ```
2. Build the project using Maven:
   ```shell
   mvn clean install
   ```
3. Run the application:
   ```shell
   java -jar target/CheckDigit.jar
   ```
4. Follow the on-screen instructions to input the number and choose the desired operation.

## Algorithm
The check digit algorithm used in this application follows the steps described below:

1. Start.
2. Initialize the sum to 0.
3. For each digit in the number, starting from the left (most significant):
    - Add the digit to the sum.
    - If the sum is even, divide it by 2.
    - If the sum is odd, subtract 1 and divide it by 2.
4. The final sum is the calculated check digit.
5. End.

## Tests
The project includes JUnit tests to ensure the correctness of the check digit calculation and the distribution of check digits.

To run the tests, execute the following command:
``` shell
mvn test
```
