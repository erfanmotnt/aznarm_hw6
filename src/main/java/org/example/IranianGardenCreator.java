package org.example;

public class IranianGardenCreator extends AbstractGardenCreator {
    @Override
    public IranianFlower createFlower() {
        IranianFlower flower = new IranianFlower();
        return flower;
    }

    @Override
    public IranianTree createTree() {
        IranianTree tree = new IranianTree();
        return tree;
    }
}
