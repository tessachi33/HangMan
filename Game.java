public class Game {
public static final int MAX_MISSES = 7;
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

 public String getCurrentProgress(){
   String progress = "";
   for (char letter : mAnswer.toCharArray()) {
     char display = '-';
     if (mYes.indexOf(letter) >= 0) {
       display = letter;
     }
     progress += display;
   }
   return progress;
 }

 public int getRemainingTries() {
   return MAX_MISSES - mNo.length();

 }
}
