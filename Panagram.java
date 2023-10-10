import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
    public static boolean isPangramword(String word) {
        Set<Character> hashset = new HashSet<>();

        for (char c : word.toCharArray()) {
            char Lcasechar = Character.toLowerCase(c);
            if (Character.isLetter(Lcasechar)) {
                hashset.add(Lcasechar);
            }
        }
        return (hashset.size() == 26);
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String word = scanner.nextLine();

        boolean ans = isPangramword(word);

        if (ans) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
