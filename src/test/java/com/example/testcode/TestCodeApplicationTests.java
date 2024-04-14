package com.example.testcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class TestCodeApplicationTests {

    @Test
    void contextLoads() {
        TestCodeApplication testCodeApplication = new TestCodeApplication();
        Assertions.assertThat(testCodeApplication).isNotNull();
    }

}
