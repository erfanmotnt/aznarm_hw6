import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PrototypeUnitTest {
    @Test
    void CloneTreesTest() {
        AppleTree appleTree = new AppleTree();
        appleTree.height = 10;
        appleTree.age = 5;

        AppleTree anotherAppleTree = new appleTree.clone();
        anotherAppleTree.height = 12;

        assertEquals(anotherAppleTree.age, 5);
        assertEquals(anotherAppleTree.hehgit, 12);
    }
}