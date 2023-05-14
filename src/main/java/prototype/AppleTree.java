package prototype;

public class AppleTree extends Tree {

    public AppleTree() {
    }
    public AppleTree(Tree target) {
        super(target);
    }

    public Tree clone() {
        return new AppleTree(this);
    }
}
