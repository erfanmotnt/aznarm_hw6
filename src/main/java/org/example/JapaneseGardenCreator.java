package org.example;

public class JapaneseGardenCreator implements AbstractGardenCreator {
    @Override
    public JapaneseFlower createFlower() {
        JapaneseFlower flower = new JapaneseFlower();
        return flower;
    }

    @Override
    public JapaneseTree createTree() {
        JapaneseTree tree = new JapaneseTree();
        return tree;
    }
}
