package Klasy_i_Obiekty;

public class CarShop {
    public static void main(String[] args) {
//        String brand1 = "Audi";
//        String brand2 = "Bmw";
//        String model3 = "A4";
//        String model4 = "521";
//        String color = "Czarny";
//        String wheelsColor = "Srebrny";
//       String tiresColor = "Czarny";
//      int doors = 5;



        Car car1 = new Car();
        Car car2 = car1;
        car1.brand = "Audi";
        car1.model = "A4";
        car1.color = "Czarny";
        car1.wheelsColor ="Srebrny";
        car1.tiresColor = "Czarny";
        car1.doors = 5;
        String car1Info = car1.brand +"," + car1.model + "," + car1.color + "," + car1.wheelsColor + ","
                +car1.tiresColor + "," + car1.doors;
        System.out.println(car1);


//        Car car2 = new Car();
//        car2.brand = "Vw";
//        car2.model = "Passat";
//        car2.color = "Czerwony";
//        car2.wheelsColor ="Srebrny";
//        car2.tiresColor = "Czarny";
//        car2.doors = 5;
//
//
//        System.out.println(car2.brand);
//        System.out.println(car2.model);
//        System.out.println(car2.doors);



    }
}
