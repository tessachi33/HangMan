import java.io.Console;

public class Prompter{
  private Game mGame;
  public Prompter(Game game){
    mGame = game;
  }

  public void play() {
    while (mGame.getRemainingTries() > 0) {
      displayProgress();
      promptForGuess();
    }
  }


    public boolean promptForGuess() {
     Console console = System.console();
      boolean isYes = false;
      boolean isValidGuess = false;
      while (!isValidGuess) {
       String guessAsString = console.readLine("Enter a letter:  ");
        try {
         isYes = mGame.applyGuess(guessAsString);
         isValidGuess = true;
        } catch (IllegalArgumentException iae) {
          console.printf("%s.  Please try again.\n", iae.getMessage());
        }
      }
      return isYes;
    }

  public void displayProgress() {
    System.out.printf("You have %d tries left to solve:  %s\n", mGame.getRemainingTries(), mGame.getCurrentProgress());
  }
}
