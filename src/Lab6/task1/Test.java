package Lab6.task1;

import java.util.ArrayList;
import java.util.Random;

public class Test {

    public static void main(String [] args) {

        // Task 3

        Car car1 = new Car(150000,Car.CarType.Fiat,2018);
        Car car2 = new Car(80000, Car.CarType.Skoda, 2019);
        Car car3 = new Car(90000, Car.CarType.Mercedes, 2020);

        Dealership deal = new Dealership();

        System.out.printf("The final price of the car1 is : %d \n" , deal.getFinalPrice(car1));
        System.out.printf("The final price of the car1 is : %d \n" , deal.getFinalPrice(car2));
        System.out.printf("The final price of the car1 is : %d \n" , deal.getFinalPrice(car3));


        // Task 4

        Dealership.SpecialOffer oferta = deal.new SpecialOffer() {
            public int getDiscautnt(Car car) {
                return 20;
            }
        };

        Random rand = new Random();

        rand.nextInt(2);

        if (rand.nextInt(2) == 1) {
            deal.negotiate(car1, oferta);
        } else {
            System.out.println("Astazi este ziua ta proasta. Nu ai niciun discaunt! : (");
        }


        // task 5

        int pret_standard = 120000;

        ArrayList<Car> lista = new ArrayList<>();

        lista.add(car1);
        lista.add(car2);
        lista.add(car3);

        for(Car i : lista) {
            System.out.printf("Masina asta are pretul %d \n", i.getPret());
            System.out.println("\n");
        }

//        for(Car i : lista) {
//            if (i.getPret() > pret_standard) {
//                lista.remove(i);
//            }
//        }

        // with lambda function

        lista.removeIf(elem -> elem.getPret() > pret_standard);



        for(Car i : lista) {

            System.out.printf("Masina asta are pretul %d \n ", i.getPret());

        }

    }

}
