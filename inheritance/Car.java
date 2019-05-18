package inheritance;

public abstract class Car {
    private boolean isSedan;
    private String seats;

    public Car(boolean isSedan, String seats) {
        this.isSedan = isSedan;
        this.seats = seats;
    }

    public boolean getIsSedan() {
        return isSedan;
    }

    public String getSeats() {
        return seats;
    }

    abstract String getMileage();
}
