import builder.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BuilderUnitTest {
    @Test
    void CloneTreesTest() {
        Director director = new Director();

        MaleBuilder builder = new MaleBuilder();
        director.constructMale(builder);
        Male male = builder.getResult();
        assertNotNull(male);

        FemaleBuilder femaleBuilder = new FemaleBuilder();
        director.constructFemale(femaleBuilder);
        Female female = femaleBuilder.getResult();
        assertNotNull(female);
    }
}