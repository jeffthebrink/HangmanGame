import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String secretWord = "bicycle";
        int numberOfGuesses = 10;

        System.out.println();
        System.out.println("Welcome to the hangman game!");
        initGameGallows();
        System.out.println("Type one letter to guess if it is in the secret word.");
        System.out.println();

        guess(secretWord, numberOfGuesses);
    }

    public static void guess(String secretWord, int numberOfGuesses) {

        char[] filler = new char[secretWord.length()];
        int i = 0;
        while (i < secretWord.length()) {
            filler[i] = '_';
            if (secretWord.charAt(i) == ' ') {
                filler[i] = ' ';
            }
            i++;
        }
        System.out.println(filler);
        System.out.println("Number of guesses remaining: " + numberOfGuesses);

        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> guessedLetters = new ArrayList<>();

        while (numberOfGuesses > 0) {
            char x = scanner.next().charAt(0);

            if (guessedLetters.contains(x)) {
                System.out.println("You have already guessed that letter.");
                continue;
            }
            guessedLetters.add(x);

            if (secretWord.contains(x + "")) {
                for (int y = 0; y < secretWord.length(); y++) {
                    if (secretWord.charAt(y) == x) {
                        filler[y] = x;
                    }
                }
            } else {
                numberOfGuesses--;
                System.out.println("Sorry, wrong guess!");
                switch (numberOfGuesses) {
                    case 9:
                        oneWrongAnswer();
                        break;
                    case 8:
                        twoWrongAnswers();
                        break;
                    case 7:
                        threeWrongAnswers();
                        break;
                    case 6:
                        fourWrongAnswers();
                        break;
                    case 5:
                        fiveWrongAnswers();
                        break;
                    case 4:
                        sixWrongAnswers();
                        break;
                    case 3:
                        sevenWrongAnswers();
                        break;
                    case 2:
                        eightWrongAnswers();
                        break;
                    case 1:
                        nineWrongAnswers();
                        break;
                    default:
                        tenWrongAnswers();
                        break;
                }
            }

            if (secretWord.equals(String.valueOf(filler))) {

                System.out.println(filler);
                System.out.println("Congrats! You have won!");
                break;
            }

            System.out.println(filler);
            System.out.println("Number of guesses remaining: " + numberOfGuesses);
        }
    }

    private static void tenWrongAnswers() {
        System.out.println();
        System.out.println("    ------------");
        System.out.println("    |          |");
        System.out.println("   ( )         |");
        System.out.println("    =          |");
        System.out.println("    |          |");
        System.out.println("  / | \\        |");
        System.out.println("    |          |");
        System.out.println("   / \\         |");
        System.out.println("               |");
        System.out.println("    ====================");
        System.out.println();
        System.out.println("You have lost the game! Better luck next time.");
        System.out.println("The secret word was bicycle.");
    }

    private static void nineWrongAnswers() {
        System.out.println();
        System.out.println("    ------------");
        System.out.println("    |          |");
        System.out.println("   ( )         |");
        System.out.println("    |          |");
        System.out.println("  / | \\        |");
        System.out.println("    |          |");
        System.out.println("   / \\         |");
        System.out.println("               |");
        System.out.println("    ====================");
        System.out.println();
    }

    private static void eightWrongAnswers() {
        System.out.println();
        System.out.println("    ------------");
        System.out.println("    |          |");
        System.out.println("   ( )         |");
        System.out.println("    |          |");
        System.out.println("  / | \\        |");
        System.out.println("    |          |");
        System.out.println("   /           |");
        System.out.println("               |");
        System.out.println("    ====================");
        System.out.println();
    }

    private static void sevenWrongAnswers() {
        System.out.println();
        System.out.println("    ------------");
        System.out.println("    |          |");
        System.out.println("   ( )         |");
        System.out.println("    |          |");
        System.out.println("  / | \\        |");
        System.out.println("    |          |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("    ====================");
        System.out.println();
    }

    private static void sixWrongAnswers() {
        System.out.println();
        System.out.println("    ------------");
        System.out.println("    |          |");
        System.out.println("   ( )         |");
        System.out.println("    |          |");
        System.out.println("  / | \\        |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("    ====================");
        System.out.println();
    }

    private static void fiveWrongAnswers() {
        System.out.println();
        System.out.println("    ------------");
        System.out.println("    |          |");
        System.out.println("   ( )         |");
        System.out.println("    |          |");
        System.out.println("  / |          |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("    ====================");
        System.out.println();
    }

    private static void fourWrongAnswers() {
        System.out.println();
        System.out.println("    ------------");
        System.out.println("    |          |");
        System.out.println("   ( )         |");
        System.out.println("    |          |");
        System.out.println("    |          |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("    ====================");
        System.out.println();
    }

    private static void threeWrongAnswers() {
        System.out.println();
        System.out.println("    ------------");
        System.out.println("    |          |");
        System.out.println("   ( )         |");
        System.out.println("    |          |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("    ====================");
        System.out.println();
    }

    private static void twoWrongAnswers() {
        System.out.println();
        System.out.println("    ------------");
        System.out.println("    |          |");
        System.out.println("   ( )         |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("    ====================");
        System.out.println();
    }

    private static void oneWrongAnswer() {
        System.out.println();
        System.out.println("    ------------");
        System.out.println("    |          |");
        System.out.println("   (           |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("    ====================");
        System.out.println();
    }

    private static void initGameGallows() {
        System.out.println();
        System.out.println("    ------------");
        System.out.println("    |          |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("    ====================");
        System.out.println();
    }
}