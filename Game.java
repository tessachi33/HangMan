public class Game {
public static final int MAX_MISSES = 5;
 private String mAnswer;
 private String mYes;
 private String mNo;

 public Game(String answer) {
   mAnswer = answer;
   mYes = "";
   mNo = "";
 }

 private char validateGuess(char letter) {
   if (! Character.isLetter(letter)) {
     throw new IllegalArgumentException("A letter is required");
   }
   letter = Character.toLowerCase(letter);
   if (mNo.indexOf(letter) >= 0 || mYes.indexOf(letter) >= 0) {
     throw new IllegalArgumentException (letter + " has already been guessed");
   }
   return letter;
 }

 public boolean applyGuess(String letters) {
   if (letters.length() == 0){
     throw new IllegalArgumentException("No letter found");
   }
   return applyGuess(letters.charAt(0));
 }

 public boolean applyGuess(char letter){
   letter = validateGuess(letter);
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

 public String getAnswer() {
   return mAnswer;
 }

 public boolean isSolved() {
   return getCurrentProgress().indexOf('-') == -1;
 }
}
