package com.gmail.reater.last.test.interview;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class TaskTreeNode {

    /**
     * Задача:
     * Создать метод extractStringsFromLeaves в классе TreeTraversal для извлечения строк из листьев древовидной
     * структуры.
     * Если узел не имеет детей, его значение добавляется в список. Если у узла есть дети, метод рекурсивно
     * вызывается для каждого ребенка.
     */

    @Getter
    static class TreeNode {

        private final String value;
        public List<TreeNode> children;

        public TreeNode(String value) {
            this.value = value;
            this.children = new ArrayList<>();
        }

        public void addChild(TreeNode child) {
            this.children.add(child);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode("Root");
        TreeNode child1 = new TreeNode("Child 1");
        TreeNode child2 = new TreeNode("Child 2");
        TreeNode leaf1 = new TreeNode("Leaf 1");
        TreeNode leaf2 = new TreeNode("Leaf 2");
        TreeNode parentLeaf = new TreeNode("Parent Leaf 3");
        TreeNode leaf3 = new TreeNode("Leaf 3");

        root.addChild(child1);
        root.addChild(child2);
        child1.addChild(leaf1);
        child1.addChild(leaf2);
        child2.addChild(parentLeaf);
        parentLeaf.addChild(leaf3);

        // Получение строк из листьев и их объединение
        List<String> stringsFromLeaves = extractStringsFromLeaves(root);
        String combinedString = String.join(", ", stringsFromLeaves);

        System.out.println("Строки из листьев: " + stringsFromLeaves);
        System.out.println("Объединенная строка: " + combinedString);
    }

    public static List<String> extractStringsFromLeaves(final TreeNode node) {
        List<String> strings = new ArrayList<>();

        // WRITE CODE

        return strings;
    }
}
