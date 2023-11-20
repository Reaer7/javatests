package com.gmail.reater.last.test.pattern.composite;

/*
    Лист - это простой компонент дерева, не имеющий ответвлений.
    Из-за того, что им некому больше передавать выполнение,
    классы листьев будут содержать большую часть полезного кода.
*/
public class PurchaseLeaf implements PackageComponent {

    private final int price;

    public PurchaseLeaf(final int price) {
        this.price = price;
    }

    @Override
    public int countPrice() {
        return price;
    }
}
