import java.util.*;

public class AnotherRunner {
    public static void main(String[] args) {
        // initializing car objects
        Car car1 = new Car("Toyota", 2000);
        Car car2 = new Car("Ford",5500);
        Car car3 = new Car("Tesla", 12000);

        // creating car array
        // Car[] carArr = {car1, car2, car3};

        // creating car ArrayList with array
        ArrayList<Car> carArrList = new ArrayList<Car>(Arrays.asList(new Car[]{car1, car2, car3}));
        System.out.println(carArrList);
    }
}
