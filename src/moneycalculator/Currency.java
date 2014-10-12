package moneycalculator;

public class Currency {

    private final String code;
    private final String symbol;
    private final String name;

    public Currency(String code, String symbol, String name) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    public String getCode() {
        return code;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

}
