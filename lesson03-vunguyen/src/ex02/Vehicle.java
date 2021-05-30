package ex02;

public class Vehicle {
    private String owner;
    private String type;
    private int cc;
    private double vehicleValue;
    private double vehicleTax;

    public Vehicle() {
    }

    public Vehicle(String owner, String type, int cc, double vehicleValue) {
        this.owner = owner;
        this.type = type;
        this.cc = cc;
        this.vehicleValue = vehicleValue;
        if (cc < 100) {
            vehicleTax = this.vehicleValue / 100;
            return;
        }
        if (cc < 200) {
            vehicleTax = this.vehicleValue * 3 / 100;
            return;
        }
        vehicleTax = this.vehicleValue * 5 / 100;
    }

    @Override
    public String toString() {
        return String.format("%-25s%-25s%-25d%-25f%-25f", owner, type, cc, vehicleValue, vehicleValue);
    }
}
