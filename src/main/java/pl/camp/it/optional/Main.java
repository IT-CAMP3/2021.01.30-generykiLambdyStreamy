package pl.camp.it.optional;

import pl.camp.it.lambda.Car;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Car> opcjonalnySamochod = getCar(3);

        System.out.println(
                opcjonalnySamochod
                        .orElseGet(() -> new Car("kashjdgfkas", "sjhdgf", 23453))
                        .getBrand()
        );

        if(opcjonalnySamochod.isPresent()) {
            opcjonalnySamochod.get();
        } else {
            //cos tam
        }
    }

    public static Optional<Car> getCar(int a) {
        if(a > 5) {
            return Optional.of(new Car("sdf", "sadf", 123));
        } else {
            return Optional.empty();
        }
    }
}
