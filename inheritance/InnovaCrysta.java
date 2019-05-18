package inheritance;

public class InnovaCrysta extends Car {
    public InnovaCrysta() {
        super(false,"6");
    }

    @Override
    String getMileage() {
        return "10";
    }

    void printCar(String carName) {
        String isSedan = getIsSedan() ? "is Sedan" : "is not Sedan";
        System.out.println("A " + carName + " " + isSedan + ", is " + getSeats() + "-seater, and has a mileage of around " + getMileage() + "kmpl");
    }
}
