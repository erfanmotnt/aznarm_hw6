import org.junit.jupiter.api.Test;
import prototype.AppleTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrototypeUnitTest {
    @Test
    void CloneTreesTest() {
        AppleTree appleTree = new AppleTree();
        appleTree.setHeight(10);
        appleTree.setAge(5);

        AppleTree anotherAppleTree = (AppleTree) appleTree.clone();
        anotherAppleTree.setHeight(12);

        assertEquals(anotherAppleTree.getAge(), 5);
        assertEquals(anotherAppleTree.getHeight(), 12);
    }
}