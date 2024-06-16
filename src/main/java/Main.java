import java.util.ArrayList;
import java.util.Scanner;

public class Main { //Main – класс, в котором происходит считывание пользовательского ввода и коммуникация с остальными классами.
    public static void main(String[] args) {
        ArrayList <Car> participants = new ArrayList<>(3);
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        System.out.println("Привет!");
        System.out.println("Добро пожаловать на «24 часа Ле-Мана»");

        for(int i = 1; i <= 3; i++) {
            System.out.println("— Введите название машины №"+ i +": ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.println("— Введите скорость машины " + name + ": ");
            if(scanner.hasNext()) {
                boolean a = true;
                while(a) {
                    int speed = scanner.nextInt();
                    if (speed <= 250 && speed > 0) {
                        participants.add(new Car(name, speed));
                        a = false;
                    }else{
                        System.out.println("— Неправильная скорость");
                    }
                }
            }else {
                scanner.next();
            }
            scanner.nextLine();
        }
        race.calculation(participants);
        System.out.println("Самая быстрая машина: " + race.getWinner());
    }
}