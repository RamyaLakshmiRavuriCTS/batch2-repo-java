package Assignment30;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Box {
    private double length;
    private double width;
    private double height;
    private double volume = length * width * height;
    private static Set<Box> uniqueBoxes = new HashSet<>();

    public Box() {
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = length * width * height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }

    @Override
    public String toString() {
        return "Length =" + this.length +
                " Width =" + this.width +
                " Height =" + this.height +
                " Volume =" + String.format("%.2f", this.volume);
    }

    public void addBoxToSet() {
        Box.uniqueBoxes.add(this);
    }

    public static void displayUniqueBoxes() {
        System.out.println("Unique Boxes in the Set are");
        Box.uniqueBoxes.forEach(System.out::println);
    }
}
