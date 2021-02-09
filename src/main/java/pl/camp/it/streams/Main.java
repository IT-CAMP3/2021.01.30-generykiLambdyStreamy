package pl.camp.it.streams;

import pl.camp.it.lambda.Car;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(13);
        list.add(19);

        /*List<String> nowaLista = new ArrayList<>();
        for (Integer integer : list) {
            if (integer >= 5 && integer <= 10 && integer % 2 == 0) {
                String s = integer.toString();
                s = s + "A";
                nowaLista.add(s);
            }
        }

        System.out.println(nowaLista);*/

        /*System.out.println(list.stream()
                .filter(x -> x >= 5)
                .filter(x -> x <= 10)
                .filter(x -> x%2 == 0)
                .map(x -> x.toString() + "A")
                .peek(x -> System.out.println(x))
                .limit(10)
                .collect(Collectors.toList()));*/

        /*List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 50; i++) {
            while (true) {
                int number = random.nextInt(10000);
                if(number % 2 == 0 && number % 5 == 0) {
                    randomNumbers.add(number);
                    break;
                }
            }
        }

        System.out.println(randomNumbers);*/

        /*List<Integer> randomNumbers = new Random().ints(0, 10000)
                .filter(x -> x%2 == 0)
                .filter(x -> x % 5 == 0)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(randomNumbers);*/

        /*int sum = 0;
        for(int element : list) {
            sum = sum + element;
        }
        System.out.println(sum);*/

        /*Integer sum = list.stream().reduce(0, (x, y) -> x+y);
        System.out.println(sum);*/

        /*long count = new Random().ints(0, 100)
                .boxed()
                .limit(50)
                .filter(x -> x % 2 == 0)
                .count();

        System.out.println(count);*/

        /*boolean result = new Random().ints(0, 100)
                .boxed()
                .limit(50)
                .allMatch(x -> x != 50);

        System.out.println(result);*/

        /*List<Integer> ints = new Random()
                .ints(0, 100).boxed()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(ints);*/

        /*list.stream().peek(x -> list.add(x)).forEach(System.out::println);*/

        /*for (int element : list) {
            list.remove(element);
        }*/

        List<Car> samochody = new ArrayList<>();
        samochody.add(new Car("Ford", "Focus", 234));
        samochody.add(new Car("Polonez", "Caro", 154));
        samochody.add(new Car("BMW", "3", 300));
        samochody.add(new Car("Audi", "A5", 300));

        /*Collections.sort(samochody, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                int priceResult = o1.getPrice() - o2.getPrice();
                if(priceResult != 0) {
                    return priceResult;
                } else {
                    return o1.getBrand().compareTo(o2.getBrand());
                }
            }
        });*/

        Collections.sort(samochody, (x, y) -> {
                    int priceResult = x.getPrice() - y.getPrice();
                    if(priceResult != 0) {
                        return priceResult;
                    } else {
                        return x.getBrand().compareTo(y.getBrand());
                    }
        });

        System.out.println(samochody);
    }

    public static void metodaKtoraCosRobi(int a) {

    }


}
