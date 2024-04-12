//Vinicius Ramos Diniz 13673242

//Alexandre lima 11797038
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class Testecal {
    private Cal cal;

    @BeforeEach
    public void createCal() {
        cal = new Cal();
    }

    
    @Test
    public void test1() {
        String calendario1 = cal.cal(1, 30); // Chamada do método com parâmetros

        int day = 1;
        int fristDayint =  1 + (3* day);
        int lastDayFristint = calendario1.length()-3;
        int lastDayLastint =  calendario1.length()-2;
        
        char[] actual = {calendario1.charAt(fristDayint), calendario1.charAt(lastDayFristint), calendario1.charAt(lastDayLastint)};
        char[] expected = {'1','3','0'};

        Assertions.assertArrayEquals(actual,expected);
    }

    @Test
    public void test2() {
        String calendario1 = cal.cal(1, 19); // Chamada do método com parâmetros

       
        
        int fristDayint = 7;
        int lastDayFristint = calendario1.length()-2;
        int lastDayLastint =  calendario1.length()-1;
        
        char[] actual = {calendario1.charAt(fristDayint), calendario1.charAt(lastDayFristint), calendario1.charAt(lastDayLastint)};
        char[] expected = {'1','3','0'};

        Assertions.assertArrayEquals(actual,expected);
    }


    @Test
    public void test3() {
        String calendario1 = cal.cal(4, 28); // Chamada do método com parâmetros

        int day = 4;
        int fristDayint =  1 + (3* day);
        int lastDayFristint = calendario1.length()-3;
        int lastDayLastint =  calendario1.length()-2;
        
        char[] actual = {calendario1.charAt(fristDayint), calendario1.charAt(lastDayFristint), calendario1.charAt(lastDayLastint)};
        char[] expected = {'1','2','8'};

        Assertions.assertArrayEquals(actual,expected);   
    }

    @Test
    public void test4() {
        String calendario1 = cal.cal(0, 30); // Chamada do método com parâmetros

        int day = 0;
        int fristDayint =  1 + (3* day);
        int lastDayFristint = calendario1.length()-3;
        int lastDayLastint =  calendario1.length()-2;
        
        char[] actual = {calendario1.charAt(fristDayint), calendario1.charAt(lastDayFristint), calendario1.charAt(lastDayLastint)};
        char[] expected = {'1','3','0'};

        Assertions.assertArrayEquals(actual,expected);   
    }
}
