import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AbstractFactoryUnitTest {
    @Test
    void CreateNewGArdenCreator() {
        IranianGardenCreator iranianGardenCreator = new IranianGardenCreator();
        JapaneseGardenCreator japaneseGardenCreator = new JapaneseGardenCreator();
    }

    @Test
    void CallAllCreators() {
        IranianGardenCreator iranianGardenCreator = new IranianGardenCreator();
        JapaneseGardenCreator japaneseGardenCreator = new JapaneseGardenCreator();

        IranianFlower iranianFlower = iranianGardenCreator.createFlower();
        IranianTree iranianTree = iranianGardenCreator.createTree();

        JapaneseFlower japaneseFlower = japaneseGardenCreator.createFlower();
        JapaneseTree japaneseTree = japaneseGardenCreator.createTree();

        assertNotNull(iranianFlower);
        assertNotNull(iranianTree);
        assertNotNull(japaneseFlower);
        assertNotNull(japaneseTree);

    }
}