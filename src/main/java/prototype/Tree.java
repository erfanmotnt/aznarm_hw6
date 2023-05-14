package prototype;

public abstract class Tree {
    public int height;
    public int age;

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
