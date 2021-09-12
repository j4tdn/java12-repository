package common;

import java.io.Serializable;

/**
 * Class implements Serializable
 * Default: all attributes will be serialized to byte stream before store in memory, file
 * <p>
 * Mark 'transient' (non serialized) >> don't write transient attribute to memory, file
 */
public class Trader implements FileHandler, Serializable {
    private static final long serialVersionUID = 7785654330748526400L;
    private transient String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Trader(String line) {
        String[] items = line.split(", ");
        this.name = items[1];
        this.city = items[0];
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    @Override
    public String toLine() {
        return name + ", " + city;
    }

    @Override
    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }

    public static Trader toObject(String line) {
        String[] items = line.split(", ");
        if (items.length != 2) {
            return null;
        }
        return new Trader(items[1], items[0]);
    }
}
