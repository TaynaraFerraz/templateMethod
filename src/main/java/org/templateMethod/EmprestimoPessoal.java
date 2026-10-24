package org.templateMethod;

public class EmprestimoPessoal extends Emprestimo {

    @Override
    public String verificarAprovacao() {
        if (this.calcularComprometimentoRenda() <= 30.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }
}