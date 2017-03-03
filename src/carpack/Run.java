package carpack;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Car car1 = new Car("BMW1", "Black1", 1000);
        Car car2 = new Car("BMW2", "Black2", 2000);
        Car car3 = new Car("BMW3", "Black3", 3000);
        Car car4 = new Car("BMW4", "Black4", 4000);
        Car car5 = new Car("BMW5", "Black5", 5000);

        List<Car> carList = new ArrayList<Car>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        for (Car car : carList) {
            System.out.println(car);
        }

        System.out.println("==============");
        carList.set(4, new Car("123", "45", 100));
        for (Car car : carList) {
            System.out.println(car);
        }
        System.out.println("=============");
        carList.remove(4);
        for (Car car : carList) {
            System.out.println(car);
        }
        System.out.println("==============");
        carList.add(new Car("Opel", "999", 200));
        for (Car car : carList) {
            System.out.println(car);
        }
        System.out.println("==============");

        carList.clear();
        System.out.println(carList);

    }
}
