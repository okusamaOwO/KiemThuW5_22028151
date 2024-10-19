import org.junit.Test;
import static org.junit.Assert.*;

public class SchoolResultTest {
    @Test
    public void testChuyen1() {
        double diemChuan = 45;
        double diemChuyen = 9;
        String expected = "chuyen 1";
        assertEquals(expected, SchoolResult.getResult(diemChuan, diemChuyen));
    }
    @Test
    public void testChuyen2() {
        double diemChuan = 41;
        double diemChuyen = 9;
        String expected = "chuyen 2";
        assertEquals(expected, SchoolResult.getResult(diemChuan, diemChuyen));
    }
    @Test
    public void testFail() {
        double diemChuan = 39;
        double diemChuyen = 9;
        String expected = "chuc ban may man lan sau";
        assertEquals(expected, SchoolResult.getResult(diemChuan, diemChuyen));
    }
}