public class Game {
 private String mAnswer;
 private String mYes;
 private String mNo;

 public Game(String answer) {
   mAnswer = answer;
   mYes = "";
   mNo = "";
 }

 public boolean applyGuess(char letter){
   boolean isYes = mAnswer.indexOf(letter) >= 0;
   if(isYes) {
     mYes += letter;
   } else {
     mNo += letter;
   }
   return isYes;
 }
}
