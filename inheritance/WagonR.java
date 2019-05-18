package inheritance;

public class WagonR extends Car {
    public WagonR() {
        super(false, "4");
    }

    @Override
    String getMileage() {
        return "22";
    }

    void printCar(String carName) {
        String isSedan = getIsSedan() ? "is Sedan" : "is not Sedan";
        System.out.println("A " + carName + " " + isSedan + ", is " + getSeats() + "-seater, and has a mileage of around " + getMileage() + "kmpl");
    }
}
