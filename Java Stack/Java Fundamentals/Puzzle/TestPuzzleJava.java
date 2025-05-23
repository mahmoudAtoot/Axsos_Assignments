import java.util.ArrayList;
// import java.util.Random;
public class TestPuzzleJava {
    
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        System.out.println("Random Letter: " + generator.getRandomLetter());

        System.out.println("Password:" + generator.generatePassword());

        String[] passwordSet = generator.getNewPasswordSet(5);
        System.out.println("Password Set:");
        for (String password : passwordSet) {
            System.out.println(password);
        }
    }
}
