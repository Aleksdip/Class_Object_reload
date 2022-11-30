package task_2;

public class Car {
    int age;
    double speed;
    int weight;
    String color;

    public Car() {
        this.age = 1;
        this.speed = 200.0;
        this.weight = 1500;
        this.color = "blue";
    }

    public Car(int age) {
        this.age = age;
        this.speed = 202.8;
        this.weight = 1590;
        this.color = "white";
    }

    public Car(int age, double speed) {
        this.age = age;
        this.speed = speed;
        this.weight = 1980;
        this.color = "black";
    }

    public Car(int age, double speed, int weight) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = "yellow";
    }

    public Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
