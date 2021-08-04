public class Card implements Comparable<Card> {
//Java Comparable interface is used to order the objects of the user-defined class.
 // It has compareTO()

    private String symbol;

    private int number;

    public Card() {
    }

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    //hashcode() determines the hash code for a given Integer.
    //It returns a random integer that is unique for each instance.
    public int hashCode() {
        return this.symbol.hashCode();
    }

    @Override
    //string equals() method compares the two given strings
    // based on the data / content of the string. It returns boolean value
    public boolean equals(Object obj) {
        Card o=(Card)obj;
        return this.symbol.equals(o.symbol);
    }

    @Override
    //public int compareTo(Object obj) is used to compare the current object with the specified object.
    // It returns , positive integer, if the current object is greater than the specified object.....

    public int compareTo(Card o)
    {
        return this.symbol.compareTo(o.symbol);
    }

}