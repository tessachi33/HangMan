import java.io.Console;

public class HangMan {

    public static void main(String[] args) {
      Game game = new Game("Hire me!");
      Prompter prompter = new Prompter(game);
      prompter.displayProgress();
      boolean isYes = prompter.promptForGuess();
      if(isYes) {
        System.out.println("woo, right letter");
      }else{
        System.out.println("try again");
      }
      prompter.displayProgress();
    }


}
