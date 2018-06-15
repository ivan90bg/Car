
public class Main {
    
    public static void main(String[] args) {
        
        Car myCar = new Car();
        System.out.println("Maksimalna brzina je: " + myCar.maxSpeed);
        System.out.println(myCar.condition);
        System.out.println(myCar.currentPrice);
        System.out.println(myCar.licence);
        System.out.println(myCar.minSpeed);
        System.out.println(myCar.weight);
        
        
        
        Car companyCar = new Car(150, 30, 2000, false, "ERFG-456", 'B', 3500, 60000);
        System.out.println("Maksimalna brzina je: " + companyCar.maxSpeed);
        System.out.println(companyCar.condition);
        System.out.println(companyCar.currentPrice);
        System.out.println(companyCar.licence);
        System.out.println(companyCar.minSpeed);
        System.out.println(companyCar.weight);
    }
    
}
