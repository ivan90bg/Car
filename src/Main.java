
public class Main {

    public static void main(String[] args) {

 //       Car myCar = new Car();
   //     myCar.printMainAttributes();
     //   System.out.println();

        Car companyCar = new Car(150, 30, 2000, false, "ERFG-456", 'B', 3500, 60000);
        companyCar.changeModel("Fiat");
        companyCar.changeMaxFuel(150);
        companyCar.fuelUp();
        companyCar.changeConsumption(10);
        companyCar.printMainAttributes();
        companyCar.travel(10);
        companyCar.printMainAttributes();
        

        Car audi = new Car();
        audi.changeModel("Audi");
        audi.fuelUp();
        audi.changeConsumption(20);
        audi.printMainAttributes();
        audi.travel(3);
        audi.printMainAttributes();
        audi.travel(3);
        audi.printMainAttributes();       
    }

}
