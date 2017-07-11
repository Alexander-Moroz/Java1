/**
 * Homework to a lesson 3.2
 *
 * @author Alexander Moroz
 * @since 2017-23-02
 * @version 1.0
 *
 * 2 * Создать массив из слов
 *     String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
 *     "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
 *     "pepper", "pineapple", "pumpkin", "potato"};
 *
 *     При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным
 *     словом и сообщает правильно ли ответил пользователь.
 *
 *     Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
 *
 *     apple – загаданное
 *     apricot - ответ игрока ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
 *
 *     Для сравнения двух слов посимвольно, можно пользоваться:
 *     String str = "apple";
 *     str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
 *     Играем до тех пор, пока игрок не отгадает слово
 *     Используем только маленькие буквы
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class HomeworkLesson3_2 {
    public static void main(String[] args) throws IOException {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin",
                "potato"};
        String guess = getRandomWord(words); // слово, которое нужно угадать
        String maskedGuess = maskWord(guess); // максируем слово, увеличивая длину до 15 символов и добавляя символ #
        System.out.println("Guess the word");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String myWord = br.readLine();
            myWord = maskWord(myWord);
            if (maskedGuess.equals(myWord)) {
                System.out.println("You win! The word is: " + guess);
                break;
            } else {
                String maskedResult = "";
                for (int i = 0; i < maskedGuess.length() - 1; i++) {
                    if (maskedGuess.charAt(i) == myWord.charAt(i)) maskedResult += maskedGuess.charAt(i);
                    else maskedResult += "#";
                }
                System.out.println(maskedResult);
                System.out.println("WRONG! Try again!");
            }
        }

    }

    static String getRandomWord(String[] s) {
        Random r = new Random();
        return s[r.nextInt(s.length - 1)];
    }

    static String maskWord(String s) {
        String mask = "###############";
        for (int i = s.length() - 1; i < mask.length() - 1; i++) {
            s += mask.charAt(i);
        }
        return s;
    }
}