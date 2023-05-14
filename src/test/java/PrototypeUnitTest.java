import org.junit.jupiter.api.Test;
import prototype.AppleTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrototypeUnitTest {
    @Test
    void CloneTreesTest() {
        AppleTree appleTree = new AppleTree();
        appleTree.height = 10;
        appleTree.age = 5;

        AppleTree anotherAppleTree = (AppleTree) appleTree.clone();
        anotherAppleTree.height = 12;

        assertEquals(anotherAppleTree.age, 5);
        assertEquals(anotherAppleTree.height, 12);
    }
}