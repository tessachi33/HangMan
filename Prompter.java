import java.io.console;

public class Prompter{
  private Game mGame;
  public Prompter(Game game){
    mGame = game;
  }

  public boolean promptForGuess() {
    Console console = System.console();
  }
}
