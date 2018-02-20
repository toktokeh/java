/*
  - Numbers ending with zeros are boring. Get rid of the ending zeros. 
  - Number zero by itself is fine.
*/
public class NoBoringZeros {
  public static int noBoringZeros(int n) {
    return 0;
  }

  public static void main(String[] args) {
    assert(noBoringZeros(1450) == 145) : "Expected: 145 | Got: " + noBoringZeros(1450);
    assert(noBoringZeros(960000) == 96) : "Expected: 96 | Got: " + noBoringZeros(960000);
    assert(noBoringZeros(1050) == 105) : "Expected: 105 | Got: " + noBoringZeros(1050);
    assert(noBoringZeros(-1050) == -105) : "Expected: -105 | Got: " + noBoringZeros(-1050);
    assert(noBoringZeros(0) == 0) : "Expected: 0 | Got: " + noBoringZeros(0);
  }
}
