//Vinicius Ramos Diniz 13673242

//Alexandre lima 11797038
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TesteIsLeap {
    private Cal cal;
    
    @BeforeEach
    public void createCal(){
        cal = new Cal();
    }

    @Test
    public void test1(){
        boolean year = cal.isLeap(2019);
        Assertions.assertEquals(false, year);
    }
    @Test
    public void test2() {
        boolean year = cal.isLeap(2020);
        Assertions.assertEquals(true,year);
    }

    @Test
    public void test3() {
        boolean year = cal.isLeap(1900);
        Assertions.assertEquals(false,year);
    }

    @Test
    public void test4() {
        boolean year = cal.isLeap(2000);
        Assertions.assertEquals(true,year);
    }

}
