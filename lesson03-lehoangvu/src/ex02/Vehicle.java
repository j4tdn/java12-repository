package ex02;

public class Vehicle {
    private String Owner;
    private String Type;
    private int Capacity;
    private double Cost;
    private double Tax;

    public Vehicle(String chuXe, String kieuXe, int dungTich, double giaTri) {
    }

    public Vehicle(String owner,double tax,  String type, int capacity, double cost) {
        Owner = owner;
        Type = type;
        Capacity = capacity;
        Cost = cost;
        Tax = tax;
        taxMoney();
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getType(){
        return Type;
    }

    public void setType(String type){
        Type = type;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double tax) {
        Tax = tax;
    }

    private void taxMoney(){

        if (Capacity < 100) this.Tax = (Cost * 0.01);
        if (Capacity < 200 ) this.Tax = (Cost * 0.05);
        else this.Tax = (Cost * 0.03);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Owner='" + Owner + '\'' +
                ", Type='" + Type + '\'' +
                ", Capacity=" + Capacity +
                ", Cost=" + Cost +
                ", Tax=" + Tax +
                '}';
    }
}
