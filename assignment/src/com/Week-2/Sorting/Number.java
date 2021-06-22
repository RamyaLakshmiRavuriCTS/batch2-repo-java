/*Number is a class which accepts all integers
 * Comparable is an interface which is used to compare integers*/
public class Number implements Comparable {
    double number;

    public Number(int number) {
        this.number = number;
    }

    public Number(float number) {
        this.number = number;
    }

    public Number(double number) {
        this.number = number;
    }

    public Number(long number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    @Override
    public int hashCode() {
        return (int) this.number;
    }

    @Override
    public boolean equals(Object obj) {
        Number n = (Number) obj;
        if (n.getNumber() == ((Number) obj).getNumber()) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return Double.compare(this.getNumber(), ((Number) o).getNumber());
    }
}
