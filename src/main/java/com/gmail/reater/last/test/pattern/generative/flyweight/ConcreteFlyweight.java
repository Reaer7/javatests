package com.gmail.reater.last.test.pattern.generative.flyweight;

public final class ConcreteFlyweight implements SymbolFlyweight {

    private final String symbol;
    private final String symbolStyle;

    public ConcreteFlyweight(final String symbol, final String symbolStyle) {
        this.symbol = symbol;
        this.symbolStyle = symbolStyle;
    }

    @Override
    public void drawSymbol(final PositionExternalContext position) {
        System.out.println("Display symbol: " + symbol
                                   + " in style: " + symbolStyle
                                   + "in coordinations: x and y as " + position.getX()
                                   + " " + position.getY());
    }
}
