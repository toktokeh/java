public class NoBoringZeros {
  public static int noBoringZeros(int n) {
    return (n == 0 || n % 10 != 0) ? n : noBoringZeros(n / 10);
  }

  public static void main(String[] args) {
    assert(noBoringZeros(1450) == 145) : "Expected: 145 | Got: " + noBoringZeros(1450);
    assert(noBoringZeros(960000) == 96) : "Expected: 96 | Got: " + noBoringZeros(960000);
    assert(noBoringZeros(1050) == 105) : "Expected: 105 | Got: " + noBoringZeros(1050);
    assert(noBoringZeros(-1050) == -105) : "Expected: -105 | Got: " + noBoringZeros(-1050);
    assert(noBoringZeros(0) == 0) : "Expected: 0 | Got: " + noBoringZeros(0);
  }
}
