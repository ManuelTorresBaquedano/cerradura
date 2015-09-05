package Cerradura;


import org.junit.Assert;
import org.junit.Test;

public class TestCerradura {
	 
    /*@Test
public void abrirConClaveErronea() {
        Cerradura trabex = new Cerradura(12345,4);
        trabex.abrir(666);
        Assert.assertTrue(trabex.cerrar());
}*/

   
    @Test
public void bloquear(){
        Cerradura trabex = new Cerradura(123,2);
        trabex.abrir(666);
        Assert.assertFalse(trabex.estAbierta());
        Assert.assertFalse(trabex.estaBloqueada());
        trabex.abrir(777);
        Assert.assertFalse(trabex.estAbierta());
        Assert.assertTrue(trabex.estaBloqueada());
}
}