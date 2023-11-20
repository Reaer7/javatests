package com.gmail.reater.last.test.pattern.composite;

import java.util.List;

/*
    Контейнер (композит) - это составной компонент дерева.
    Он содержит набор дочерних компонентов, но ничего не знает об их типах.
    Это могут быть как простые компоненты-листья, так и другие компоненты-контейнеры.
    Но это не является проблемой, если все дочерние компоненты следуют единому интерфейсу.
*/
public class BoxContainer implements PackageComponent {

    private final List<PackageComponent> childrenComponents;

    public BoxContainer(final List<PackageComponent> childrenComponents) {
        this.childrenComponents = childrenComponents;
    }

    public void add(PackageComponent packageComponent) {
        childrenComponents.add(packageComponent);
    }

    public void remove(int index) {
        childrenComponents.remove(index);
    }

    public List<PackageComponent> getChildren() {
        return childrenComponents;
    }

    @Override
    public int countPrice() {
        return childrenComponents.stream()
                .map(PackageComponent::countPrice)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
