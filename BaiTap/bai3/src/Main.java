import ru.Fan;

public class Main {
    public static void main(String[] args) {
        ///b1
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("blue");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEIUN);
        fan2.setRadius(5);
        fan2.setColor("red");
        fan2.setOn(false);
        ///b2
        System.out.println("thong tin doi tuog fan1");
        System.out.println(fan1.toString());
        System.out.println("thong tin doi tuong fan2");
        System.out.println(fan2.toString());
    }
}