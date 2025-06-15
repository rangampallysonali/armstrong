import org.junit.Test;
import static org.junit.Assert.*;

public class ArmstrongTest {

    @Test
    public void testIsArmstrongWithValidNumber() {
        assertTrue(Armstrong.isArmstrong(153));
        assertTrue(Armstrong.isArmstrong(370));
        assertTrue(Armstrong.isArmstrong(371));
        assertTrue(Armstrong.isArmstrong(407));
    }

    @Test
    public void testIsArmstrongWithInvalidNumber() {
        assertFalse(Armstrong.isArmstrong(100));
        assertFalse(Armstrong.isArmstrong(123));
    }
}
