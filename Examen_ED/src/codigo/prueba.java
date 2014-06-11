package codigo;

import static org.junit.Assert.*;  
import org.junit.Test;

public class prueba {  
 
	@Test
  public void testResta() {  
       
         Resta resta = new Resta(2, 2);  
         int resultado = resta.resta();  
         assertTrue(resultado == 0);  
         
         System.out.println(resta);
     }  
  } 