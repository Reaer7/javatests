package com.gmail.reater.last.test.pattern.builder;

public class Pizza {

    String topping1;
    String topping2;
    String topping3;
    String topping4;

    public static class Builder {

        private final Pizza pizza;

        Builder() {
            pizza = new Pizza();
        }

        public Builder topping1(String topping1) {
            pizza.topping1 = topping1;
            return this;
        }

        public Builder topping2(String topping2) {
            pizza.topping2 = topping2;
            return this;
        }

        public Builder topping3(String topping3) {
            pizza.topping3 = topping3;
            return this;
        }

        public Builder topping4(String topping4) {
            pizza.topping4 = topping4;
            return this;
        }
        public Pizza build() {
            return pizza;
        }
    }
}
