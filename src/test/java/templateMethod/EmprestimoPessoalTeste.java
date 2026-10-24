package templateMethod;

import org.junit.jupiter.api.Test;
import org.templateMethod.EmprestimoPessoal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmprestimoPessoalTeste {

    @Test
    void deveRetornarAprovado(){
        EmprestimoPessoal emprestimoPessoal = new EmprestimoPessoal();
        emprestimoPessoal.setValorRendaMensal(1000);
        emprestimoPessoal.setValorParcela(300);
        assertEquals("Aprovado",  emprestimoPessoal.verificarAprovacao());
    }

    @Test
    void deveRetornarReprovado(){
        EmprestimoPessoal emprestimoPessoal = new EmprestimoPessoal();
        emprestimoPessoal.setValorRendaMensal(1000);
        emprestimoPessoal.setValorParcela(301);
        assertEquals("Reprovado",  emprestimoPessoal.verificarAprovacao());
    }
}
