
public class Car {

    int maxSpeed = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean isTheCarOn = false;
    String licence = "ABCD - 123";
    char condition = 'A';
    double currentPrice = 3000;
    int mileagePassed = 50000;

    String model;
    int maxFuel;
    int currentFuel;
    int consumption;

    public Car() {
        this.model = "default";
        this.currentFuel = 0;
        this.maxFuel = 100;
        this.consumption = 0;
    }

    public Car(int maxSpeed, int minSpeed, double weight, boolean isTheCarOn,
            String licence, char condition, double currentPrice, int mileagePassed) {

        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.weight = minSpeed;
        this.licence = licence;
        this.condition = condition;
        this.currentPrice = currentPrice;
        this.mileagePassed = mileagePassed;
    }

    public void printAttributes() {

        System.out.println("Maksimalna brzina je: " + this.maxSpeed);
        System.out.println("Minimalna brzina je " + this.minSpeed);
        System.out.println("Registarski broj je: " + this.licence);
        System.out.println("Tezina ovog automobila je: " + this.weight);
        System.out.println("Cena mu je : " + this.currentPrice);
        System.out.println("Predjena kilometraza je: " + this.mileagePassed);
    }

    public void printMainAttributes() {

        System.out.println("Model: " + this.model);
        System.out.println("Kapacitet rezervoara je " + this.maxFuel);
        System.out.println("Trenutno gorivo je " + this.currentFuel);
        System.out.println("Predjena kilometraza je: " + this.mileagePassed);
        System.out.println("Trenutna potrosnja je: " + this.consumption);
        System.out.println();
    }

    public void changeModel(String customModel) {
        this.model = customModel;

    }

    public void changeMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }

    public void fuelUp() {
        this.currentFuel = this.maxFuel;
    }

    public void changeConsumption(int customConsumption) {
        this.consumption = customConsumption;
    }

    public void travel(int distance) {

        if (this.currentFuel > distance * this.consumption) {
            this.mileagePassed = this.mileagePassed + distance;
            this.currentFuel = this.currentFuel - distance * this.consumption;
            System.out.println("Putovali ste: " + distance);
        } else {
            System.out.println("Nema dovoljno goriva");
        }

    }
}
