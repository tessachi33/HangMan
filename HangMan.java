import java.io.Console;

public class HangMan {

    public static void main(String[] args) {
      Game game = new Game("hired");
      Prompter prompter = new Prompter(game);
      prompter.play();
    }
}
