class Main {
  public static void main(String[] args) {
    int base = 2, exponent = 3;
    long result = 1;
    while (exponent != 0)
        {
            result *= base;
            --exponent;
        }
         System.out.println("  " + result);
    }
  }