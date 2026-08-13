import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CompraTest {
    @Test
    void testCompraAVista() {

        Compra c1 = new Compra(250);
        assertEquals(1, c1.getNumeroParcelas());
        assertEquals(250, c1.getValorTotal());
        assertEquals(250, c1.getValorParcela());           
    }

    @Test
    void testCompraAPrazo() {

        Compra c1 = new Compra(100, 5);
        assertEquals(5, c1.getNumeroParcelas());
        assertEquals(500, c1.getValorTotal());
        assertEquals(100, c1.getValorParcela());           
    }



    
}
