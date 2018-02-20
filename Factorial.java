/*
  - Write a function to calculate factorial for a given input. 
  - If input is below 0 or above 12 throw an IllegalArgumentException.
*/

public class Factorial {
  public static int factorial(int n) {
    return 0;
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
