import org.junit.Test;
import static org.junit.Assert.*;
public class VeiculoTest {

    @Test
    public void testVeiculo() {
        Carro teste01 = new Carro("Pegeout", "206", 2004);

        System.out.println(teste01.getMarca() + " | " + teste01.getModelo() + " | " + teste01.getAno());

        assertEquals("Pegeout", teste01.getMarca());
        assertEquals("206", teste01.getModelo());
        assertEquals(2004, teste01.getAno());
    }
}
