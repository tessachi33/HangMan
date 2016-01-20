import java.io.Console;

public class Prompter{
  private Game mGame;
  public Prompter(Game game){
    mGame = game;
  }

  public void play() {
    while (mGame.getRemainingTries() > 0 && !mGame.isSolved()) {
      displayProgress();
      promptForGuess();
    }
    if (mGame.isSolved()) {
      System.out.printf("wooooo, it was totally '%s', you won with %d tries left! Maybe it is a sign! \n", mGame.getAnswer(), mGame.getRemainingTries());
    }else{
      System.out.printf("Bummer, you totally lost and the word was %s. Maybe it is a sign you need me?  \n", mGame.getAnswer());
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
