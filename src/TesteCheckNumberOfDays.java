//Vinicius Ramos Diniz 13673242

//Alexandre lima 11797038
import org.junit.jupiter.api.*;
//[1,31]
public class TesteCheckNumberOfDays {
    private  Cal cal; 

    @BeforeEach
    public void createCal() {
        cal = new Cal();
    }

    //testar de uma vez 
    @Test
   public void testMounths(){

        //janeiro
        
        assertCheckNumbers(1,2024, 31);

        //fev bi
        assertCheckNumbers(2,2024, 29);

        //setembro bi
        assertCheckNumbers(9,1752, 19);
   }


    //funcao teste
    private void assertCheckNumbers(int m,int a, int expected){
        int result = cal.numberOfDays(m, a);
        Assertions.assertEquals(expected, result);
    }
    
    //Teste individual
    @Test
    public void testfev() {
        int fev = cal.numberOfDays(2, 2024);
        Assertions.assertEquals(29,fev);
    }

    @Test
    public void testJaneiro() {
        int jan = cal.numberOfDays(1, 2024);
        Assertions.assertEquals(31,jan);
    }

}
