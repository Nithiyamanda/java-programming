class Main {
  public static void main(String[] args) {
     int a = 150, b = 160;
     for(int number = a + 1; number < b; ++number) 
     {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

     
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number)
                System.out.print(number + " ");
        }
    }
}