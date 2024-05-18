package src;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        System.out.println("Добро пожаловать в игру \"Угадай число\"!");
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfTries = 0;
            boolean hasGuessed = false;

            System.out.println("Я загадал число от 1 до 100. Попробуй угадать его!");
            while (!hasGuessed) {
                System.out.print("Введите ваше число: ");
                int userGuess = scanner.nextInt();
                numberOfTries++;

                if (userGuess < numberToGuess) {
                    System.out.println("Мое число больше.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Мое число меньше.");
                } else {
                    System.out.printf("Вы угадали! Это число %d. Количество попыток: %d%n", numberToGuess, numberOfTries);
                    hasGuessed = true;
                }
            }

            System.out.print("Хотите сыграть еще раз? (да/нет): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("да");
        }

        System.out.println("Спасибо за игру! До свидания!");
        scanner.close();
    }
}
