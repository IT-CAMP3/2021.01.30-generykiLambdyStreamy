package pl.camp.it.lambda;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<Car> samochody = new ArrayList<>();
        samochody.add(new Car("Audi", "A5", 300000));
        samochody.add(new Car("Toyota", "Corolla", 100000));
        samochody.add(new Car("Ford", "Mustang", 250000));
        samochody.add(new Car("BMW", "5", 220000));

        Collections.sort(samochody, (x, y) -> x.getBrand().compareTo(y.getBrand()));

        System.out.println(samochody);

        Collections.sort(samochody, (x, y) -> x.getPrice() - y.getPrice());

        System.out.println(samochody);

        Function<Car, Boolean> function = x -> x.getPrice() >= 250000;

        System.out.println(function.apply(new Car("asdf", "sadfas", 250000)));

        BiFunction<Car, Car, Integer> biFunction = (x, y) -> x.getPrice() - y.getPrice();

        System.out.println(biFunction.apply(
                new Car("Audi", "A5", 300000),
                new Car("Toyota", "Corolla", 100000)
        ));

        UnaryOperator<Integer> unaryOperator = x -> x*4;

        System.out.println(unaryOperator.apply(5));

        Predicate<String> predicate = x -> x.equals("ok");

        System.out.println(predicate.test("ok123"));

        Supplier<Car> supplier = () -> new Car("Audi", "A" + (new Random().nextInt(8) + 1), 300000);

        System.out.println(supplier.get());

        Consumer<Car> consumer = x -> System.out.println("Car " + x.getBrand() + " destroyed !!");

        consumer.accept(new Car("Audi", "5", 220000));
    }
}
