/*
  Let's play rock paper scissors! You have to return which player won! In case of a draw return Draw!
*/

public class RockPaperScissors {
  public static String rockPaperScissors(String p1, String p2) {
    return "";
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

