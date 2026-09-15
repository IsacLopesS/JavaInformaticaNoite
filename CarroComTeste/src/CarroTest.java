import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarroTest {
    @Test
    public void testAcelerar() {
        Carro relmapago_maquin = new Carro(5, "Maquin");

        relmapago_maquin.acelerar();
        relmapago_maquin.acelerar();
        relmapago_maquin.acelerar();
        assertEquals(15, relmapago_maquin.getVelocidade());
    }

    @Test
    public void testFrear() {
        
    }

    @Test
    public void testGetVelocidade() {

    }

    @Test
    public void testImprimir() {

    }
}
