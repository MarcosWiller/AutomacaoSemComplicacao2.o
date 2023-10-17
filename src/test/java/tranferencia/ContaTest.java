package tranferencia;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import transferencia.Cliente;
import transferencia.Conta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ContaTest {

    Conta contaXuxa;
    Conta contaSilvio;
    Cliente xuxa;
    Cliente silvioSantos;

    @BeforeEach
    void setUp() {
//criando uma conta e passando o que tenho nela
        contaXuxa = new Conta("0813", "1234", 600.00, xuxa);
        contaSilvio = new Conta("0213", "9345", 600.00, silvioSantos);
    }

    @Test
    public void realizarTransação() {
        contaXuxa.realizarTransferencia(100, contaSilvio);

        assertEquals(500.00, contaXuxa.getSaldo());
        assertEquals(700.00, contaSilvio.getSaldo());

    }

    @Test
    public void realizarTrasnferenciaInvalida() {
        xuxa = new Cliente("Xuxa", "11222333445", "11111");
        silvioSantos = new Cliente("Silvio", "22333444556", "222222");

        boolean resultado = contaXuxa.realizarTransferencia(3000.00, contaSilvio);
        assertEquals(false, resultado);
   }
}
