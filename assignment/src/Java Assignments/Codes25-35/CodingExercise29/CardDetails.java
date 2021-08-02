public class CardDetails implements Comparable<CardDetails> {
    private String symbol;
    private int number;

    public CardDetails() {
    }

    public CardDetails(String symbol, int number) {
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
    public int hashCode() {
        return this.symbol.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        CardDetails o=(CardDetails)obj;
        return this.symbol.equals(o.symbol);
    }

    @Override
    public int compareTo(CardDetails o) {
        return this.symbol.compareTo(o.symbol);
    }
}