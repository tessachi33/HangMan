import java.io.Console;

public class HangMan {

    public static void main(String[] args) {
      Game game = new Game("Hire me!");
      Prompter Prompter = new Prompter(game);
      boolean isYes = Prompter.promptForGuess();
      if(isYes) {
        System.out.println("woo, right letter");
      }else{
        System.out.println("try again");
      }
    }


}
