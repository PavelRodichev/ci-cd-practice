package by.pasha.ru.cicdexample;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiCdExampleApplicationTests {

    @Test
    void contextLoads() {
        int a = 1 + 2;
        Assertions.assertThat(a).isEqualTo(3);

    }

}
