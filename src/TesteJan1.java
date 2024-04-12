//Vinicius Ramos Diniz 13673242

//Alexandre lima 11797038
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TesteJan1 {
    private Cal cal;

    @BeforeEach
    public void createCal() {
        cal = new Cal();
    }

    
    @Test
    public void test1() {
        int y2024 = cal.jan1(2024);
        Assertions.assertEquals(1, y2024);
    }

    @Test
    public void test2() {
        int y1970 = cal.jan1(1970);
        Assertions.assertEquals(4, y1970);
    }

}
