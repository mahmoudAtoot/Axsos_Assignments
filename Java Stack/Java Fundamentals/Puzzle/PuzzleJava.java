import java.util.Random;
import java.util.ArrayList;


public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        Random rand = new Random();
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rolls.add(rand.nextInt(20) + 1); 
        }
        return rolls;
    }

    public char getRandomLetter(){
        Random rand = new Random();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int randomIndex = rand.nextInt(26);
        return alphabet[randomIndex];
    }

    public String generatePassword(){
        StringBuilder password = new StringBuilder();
        for(int i = 0 ; i < 8 ; i++){
            password.append(getRandomLetter());
        
        }
        return password.toString();
    }

    public String[] getNewPasswordSet(int length) {
        String[] passwordSet = new String[length];
        for (int i = 0; i < length; i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }
    
}
