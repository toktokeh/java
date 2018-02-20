public class RockPaperScissors {
  public static String rockPaperScissors(String p1, String p2) {
    if (p1.equals(p2)) return "Draw!";
    String result = p1 + p2;
    int winner = "scissorspaper".equals(result) || "rockscissors".equals(result) || "paperrock".equals(result) ? 1 : 2;
    return String.format("Player %d won!", winner);
  }

  public static void main(String[] args) {
    assert(rockPaperScissors("rock", "scissors").equals("Player 1 won!")) : "Expected: \"Player 1 won!\" | Got: " + rockPaperScissors("rock", "scissors");
    assert(rockPaperScissors("scissors", "paper").equals("Player 1 won!")) : "Expected: \"Player 1 won!\" | Got: " + rockPaperScissors("scissors", "paper");
    assert(rockPaperScissors("paper", "rock").equals("Player 1 won!")) : "Expected: \"Player 1 won!\" | Got: " + rockPaperScissors("paper", "rock");
    assert(rockPaperScissors("scissors", "rock").equals("Player 2 won!")) : "Expected: \"Player 2 won!\" | Got: " + rockPaperScissors("scissors", "rock");
    assert(rockPaperScissors("paper", "scissors").equals("Player 2 won!")) : "Expected: \"Player 2 won!\" | Got: " + rockPaperScissors("paper", "scissors");
    assert(rockPaperScissors("rock", "paper").equals("Player 2 won!")) : "Expected: \"Player 2 won!\" | Got: " + rockPaperScissors("rock", "paper");
    assert(rockPaperScissors("scissors", "scissors").equals("Draw!")) : "Expected: \"Draw!\" | Got: " + rockPaperScissors("scissors", "scissors");
    assert(rockPaperScissors("paper", "paper").equals("Draw!")) : "Expected: \"Draw!\" | Got: " + rockPaperScissors("paper", "paper");
    assert(rockPaperScissors("rock", "rock").equals("Draw!")) : "Expected: \"Draw!\" | Got: " + rockPaperScissors("rock", "rock");
  }
}

