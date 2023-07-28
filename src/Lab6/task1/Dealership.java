package Lab6.task1;

import java.util.Random;

public class Dealership {

     class BrandOffer implements Offer{

        @Override
        public int getDiscount(Car car) {
            if (car.getCartype().equals(Car.CarType.Mercedes)) {
                return (int)((float)( 5 * car.getPret() )/ 100);
            } else
            if (car.getCartype().equals(Car.CarType.Fiat)) {
                return (int)((float)( 10 * car.getPret() )/ 100);
            } else
            if (car.getCartype().equals(Car.CarType.Skoda)) {
                return (int)((float)( 15 * car.getPret() )/ 100);
            } else

            return 0;
        }
    }

     class DealerOffer implements Offer {


        @Override
        public int getDiscount(Car car) {
            if (car.getCartype().equals(Car.CarType.Mercedes)) {
                return 300 * (2023 - car.getAn_fabricatie());
            } else
            if (car.getCartype().equals(Car.CarType.Fiat)) {
                return 100 * (2023 - car.getAn_fabricatie());
            } else
            if (car.getCartype().equals(Car.CarType.Skoda)) {
                return 150 * (2023 - car.getAn_fabricatie());
            } else

                return 0;
        }


    }

     class SpecialOffer implements Offer{

        @Override
        public int getDiscount(Car car) {
            Random rand  = new Random();
            return rand.nextInt(300);


        }


    }

    public int getFinalPrice(Car car) {

        BrandOffer nr1 = new BrandOffer();
        DealerOffer nr2 = new DealerOffer();
        SpecialOffer nr3 = new SpecialOffer();

        car.setPret(car.getPret() - nr1.getDiscount(car) - nr2.getDiscount(car) - nr3.getDiscount(car));

        return car.getPret();
    }

    public void negotiate(Car car, Offer offer) {
        car.setPret(car.getPret() - offer.getDiscount(car));

        System.out.printf("The Final price is : %d \n", car.getPret());
    }
}
