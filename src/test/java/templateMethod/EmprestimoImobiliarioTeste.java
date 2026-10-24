package templateMethod;

import org.junit.jupiter.api.Test;
import org.templateMethod.EmprestimoImobiliario;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmprestimoImobiliarioTeste {

    @Test
    void deveRetornarAprovado(){
        EmprestimoImobiliario emprestimoImobiliario = new EmprestimoImobiliario();
        emprestimoImobiliario.setValorRendaMensal(1000);
        emprestimoImobiliario.setValorParcela(200);
        assertEquals("Aprovado", emprestimoImobiliario.verificarAprovacao());
    }

    @Test
    void deveRetornarReprovado(){
        EmprestimoImobiliario emprestimoImobiliario = new EmprestimoImobiliario();
        emprestimoImobiliario.setValorRendaMensal(1000);
        emprestimoImobiliario.setValorParcela(201);
        assertEquals("Reprovado", emprestimoImobiliario.verificarAprovacao());
    }
}
