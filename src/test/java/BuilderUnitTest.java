import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BuilderUnitTest {
    @Test
    void CloneTreesTest() {
        Director director = new Director();

        MaleBuilder builder = new MaleBuilder();
        director.constructMale(builder);
        Male male = director.getResult();
        assertNotNull(male);

        FemaleBuilder femaleBuilder = new FemaleBuilder();
        director.constructFemale(femaleBuilder);
        Female female = director.getResult();
        assertNotNull(female);
    }
}