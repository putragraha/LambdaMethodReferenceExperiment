package inheritance;

public class HondaCity extends Car {
    public HondaCity() {
        super(true, "4");
    }

    @Override
    String getMileage() {
        return "18";
    }

    void printCar(String carName) {
        String isSedan = getIsSedan() ? "is Sedan" : "is not Sedan";
        System.out.println("A " + carName + " " + isSedan + ", is " + getSeats() + "-seater, and has a mileage of around " + getMileage() + "kmpl");
    }
}
