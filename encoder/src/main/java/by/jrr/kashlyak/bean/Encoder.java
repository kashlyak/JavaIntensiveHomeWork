package by.jrr.kashlyak.bean;

import java.util.Objects;

public class Encoder {
    char symbol;
    short code;

    public Encoder() {
        //default constructor
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encoder encoder = (Encoder) o;
        return symbol == encoder.symbol &&
                code == encoder.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, code);
    }

    @Override
    public String toString() {
        return "Encoder{" +
                "symbol=" + symbol +
                ", code=" + code +
                '}';
    }
}
