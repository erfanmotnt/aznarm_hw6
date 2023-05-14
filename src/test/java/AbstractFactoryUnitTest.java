package com.mechanitis.demo.junit5;

import org.example.IranianGardenCreator;
import org.example.JapaneseGardenCreator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AbstractFactoryUnitTest {
    @Test
    void CreateNewGArdenCreator() {
        IranianGardenCreator iranianGardenCreator = new IranianGardenCreator();
        JapaneseGardenCreator japaneseGardenCreator = new JapaneseGardenCreator();
    }
}