public class Car { //Автомобиль — объект, содержащий в себе параметры «название» и «скорость».




    private String name;

    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


}