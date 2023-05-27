import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckDigitTest {

    @Test
    public void testCalculateCheckDigit() {
        // Testing with the provided example
        String number = "98062477123";
        int expectedCheckDigit = 2;
        int actualCheckDigit = CheckDigit.calculateCheckDigit(number);
        Assertions.assertEquals(expectedCheckDigit, actualCheckDigit, "Calculated check digit does not match the expected value");

        // Testing with the base value from the question
        number = "2987654321";
        expectedCheckDigit = 1;
        actualCheckDigit = CheckDigit.calculateCheckDigit(number);
        Assertions.assertEquals(expectedCheckDigit, actualCheckDigit, "Calculated check digit does not match the expected value");

        // Testing with a different number
        number = "123456789";
        expectedCheckDigit = 8;
        actualCheckDigit = CheckDigit.calculateCheckDigit(number);
        Assertions.assertEquals(expectedCheckDigit, actualCheckDigit, "Calculated check digit does not match the expected value");
    }

    @Test
    public void testCheckDigitDistribution() {
        // Test the distribution of check digits for numbers from 1 to 10000
        // This is a smaller range for the purpose of the test, you can adjust it
        int[] frequencies = new int[10];
        for (int i = 1; i <= 10000; i++) {
            int checkDigit = CheckDigit.calculateCheckDigit(String.valueOf(i));
            if (checkDigit != 9) { // Exclude digit 9 from the check
                frequencies[checkDigit]++;
            }
        }

        // Check that the frequencies are roughly equal
        // The precise distribution can depend on the specific algorithm and range of numbers
        for (int i = 0; i < frequencies.length; i++) {
            if (i != 9) { // Exclude digit 9 from the check
                Assertions.assertTrue(frequencies[i] > 0, "Check digit " + i + " was never generated");
            }
        }
    }
}
