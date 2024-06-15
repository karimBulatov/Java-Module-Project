import java.util.ArrayList;

public class Race { //Гонка – класс, в котором рассчитывается и запоминается лидер.
    private String winner= "";
    private int distance = 0;

    public String getWinner() {
        return winner;
    }

    public void calculation(ArrayList<Car> list){
        for(Car cars: list){
            if(getDistance(cars.getSpeed()) > distance){
                distance = getDistance(cars.getSpeed());
                winner = cars.getName();
            }
        }

    }
    public int getDistance(int a){
        return a * 24;
    }

}
