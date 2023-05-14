package prototype;

public abstract class Tree {
    private int height;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public Tree() {
    }
    public Tree(Tree target) {
        if(target != null) {
            this.height = target.height;
            this.age = target.age;
        }
    }
    public abstract Tree clone();
}
