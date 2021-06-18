public class Number implements Comparable {
    int number;
    public Number(int number){
        this.number=number;
    }
    public Number(float number){
        this.number= Math.round(number);
    }
    public Number(double number){
        this.number= (int) Math.round(number);
    }
    public Number(long number){
        this.number= (int) number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int hashCode() {

        return this.number;
    }

    @Override
    public boolean equals(Object obj) {
        Number n=(Number) obj;
        return n.getNumber() == ((Number) obj).getNumber();
    }

    @Override
    public int compareTo(Object o) {
        Number number=(Number) o;
        return Integer.compare(this.getNumber(), ((Number) o).getNumber());
    }
}
