import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    @Test
    @Step("Add two numbers and check if result is correct")
    public void testAddition() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        assertEquals(15, sum);
    }
}
