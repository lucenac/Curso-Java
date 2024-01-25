package entities;

import java.util.Locale;

public class Items {
    private String[] vect;
    private String name;
    private double value;
    private int quantity;

    public Items(String[] vect) {
        this.name = vect[0];
        this.value = Double.parseDouble(vect[1]);
        this.quantity = Integer.parseInt(vect[2]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String[] getVect() {
        return vect;
    }

    public void setVect(String[] vect) {
        this.vect = vect;
    }

    public double calculate(){
        return value * quantity;
    }



    public String toString() {
        return name + "," + calculate();
    }
}
