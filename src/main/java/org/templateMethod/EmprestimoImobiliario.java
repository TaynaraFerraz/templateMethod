package org.templateMethod;

public class EmprestimoImobiliario extends Emprestimo {

    @Override
    public String verificarAprovacao() {
        if (this.calcularComprometimentoRenda() <= 20.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "EmprestimoImobiliario";
    }
}
