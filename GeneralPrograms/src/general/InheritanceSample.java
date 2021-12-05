package general;

public class InheritanceSample {

    public static void main(String[] args) {

        Car car = new Car();

        BMW bmw = new BMW();

        Car car1 = new BMW();

        System.out.println(car.getSpeed());

        System.out.println(bmw.getSpeed());

        System.out.println(car1.getSpeed());

    }
}
