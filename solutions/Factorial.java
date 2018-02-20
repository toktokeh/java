public class Factorial {
  public static int factorial(int n) {
    if (n < 0 || n > 12) throw new IllegalArgumentException();
    return n <= 1 ? 1 : n * factorial(n-1);
  }

  public static void main(String[] args) {
    assert(factorial(0) == 1) : "Expected: 1 | Got: " + factorial(0);
    assert(factorial(1) == 1) : "Expected: 1 | Got: " + factorial(1);
    assert(factorial(3) == 6) : "Expected: 6 | Got: " + factorial(3);
    assert(factorial(5) == 120) : "Expected: 120 | Got: " + factorial(5);
    try {
      factorial(-1);
    } catch(IllegalArgumentException e){
      System.out.println("IllegalArgumentException thrown as expected.");
    };
  }
}
