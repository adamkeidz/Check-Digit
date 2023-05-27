public class CheckDigit {
    public static int calculateCheckDigit(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            sum += digit;
            if (sum % 2 == 0) {
                sum /= 2;
            } else {
                sum = (sum - 1) / 2;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        // Task 2 (Basic)
        String number = "98062477123";
        System.out.println("The check digit for " + number + " is " + calculateCheckDigit(number));
        System.out.println("Generated number is " + number + calculateCheckDigit(number));

        // Task 2 (Advance)
        int[] frequencies = new int[10];
        for (int i = 1; i <= 1_000_000; i++) {
            int checkDigit = calculateCheckDigit(String.valueOf(i));
            frequencies[checkDigit]++;
        }

        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("Frequency of check digit " + i + ": " + frequencies[i]);
        }

        int maxIndex = 0;
        for (int i = 1; i < frequencies.length; i++) {
            if (frequencies[i] > frequencies[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("The check digit with the highest frequency is " + maxIndex);
    }
}
