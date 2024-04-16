//Vinicius Ramos Diniz 13673242

//Alexandre lima 11797038
import org.junit.jupiter.api.*;

public class TesteFirstOfMonthTest {
    private Cal cal;

    @BeforeEach
    public void createCal() {
        cal = new Cal();
    }

    //Janeiro
    //before -> new Cal();
    //bla
    @Test
    public void TesteJan() {
        int mesJan = cal.firstOfMonth(1, 2024);
        Assertions.assertEquals(1, mesJan);
    }
    //after -> call = null;

    //Fevereiro
    @Test
    public void TesteFev() {
        int mesFev = cal.firstOfMonth(2, 2024);
        Assertions.assertEquals(4, mesFev);
    }
    @AfterEach
    public void descreact(){
        cal = null;
    }

}