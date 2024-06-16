import java.util.ArrayList;
import java.util.Scanner;

public class Main { //Main – класс, в котором происходит считывание пользовательского ввода и коммуникация с остальными классами.
    public static void main(String[] args) {
        ArrayList <Car> participants = new ArrayList<>(3);
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        System.out.println("— Привет!");
        System.out.println("— Добро пожаловать на «24 часа Ле-Мана»");

        for(int i = 1; i <= 3; i++) {
            System.out.println("— Введите название машины №" + i + ": ");
            String name = "";
            while (true) {
                name = scanner.nextLine();
                if (name.trim().isEmpty()) {
                    System.out.println("Не ввел название машины.");
                } else {
                    System.out.println("Отлично"); //
                    break;
                }
            }
            System.out.println("— Введите скорость машины " + name + ": ");
            while (true) {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("— Ввод не должен быть пустым. Введи скорость от 1 до 250");
                    continue;
                }

                try {
                    int speed = Integer.parseInt(input);
                    if (speed <= 0 || speed > 250) {
                        System.out.println("— Неправильная скорость. Введи скорость от 1 до 250");
                        continue;
                    } else {
                        participants.add(new Car(name, speed));
                        break;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("— Неверные данные. Введи действительный номер скорости");
                }
            }
        }

        race.calculation(participants);
        System.out.println("— Самая быстрая машина: " + race.getWinner());

        scanner.close();
    }
}