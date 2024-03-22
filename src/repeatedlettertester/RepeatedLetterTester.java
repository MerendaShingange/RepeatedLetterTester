/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeatedlettertester;
import java.util.Scanner;

/**
 *
 * @author Lenovo-User
 */
public class RepeatedLetterTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("Enter a letter to check: ");
        char letter = scanner.nextLine().charAt(0);

        boolean foundRepeated = false;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == letter && word.charAt(i + 1) == letter) {
                System.out.println("Letter '" + letter + "' occurs twice in succession in the word: " + word);
                foundRepeated = true;
                break;
            }
        }

        if (!foundRepeated) {
            System.out.println("Letter '" + letter + "' does not occur twice in succession in the word: " + word);
        }
    }
}
    
    

