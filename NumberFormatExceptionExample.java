public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String invalidNumber = "123abc"; // Invalid number format

        try {
            int number = Integer.parseInt(invalidNumber); // This will throw NumberFormatException
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format! " + e.getMessage());
        }
    }
}

