package org.templateMethod;

public abstract class Emprestimo {

    private int codigo;
    protected String nomeCliente;
    private double valorRendaMensal;
    private double valorParcela;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValorRendaMensal() {
        return valorRendaMensal;
    }

    public void setValorRendaMensal(float valorRendaMensal) {
        this.valorRendaMensal = valorRendaMensal;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    public double calcularComprometimentoRenda() {
        if (this.valorRendaMensal == 0.0f) {
            return 0.0f;
        }
        return (this.valorParcela / this.valorRendaMensal) * 100.0f;
    }

    public abstract String verificarAprovacao();

    public String getTipo() {
        return "Emprestimo";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "codigo=" + this.codigo +
                ", nomeCliente='" + this.nomeCliente + '\'' +
                ", resultado=" + this.verificarAprovacao() +
                '}';
    }
}
