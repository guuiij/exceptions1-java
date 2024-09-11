package model.entities;

public class Account {
    private Integer numeroConta;
    private String titular;
    private Double saldo;
    private Double limiteDeSaque;

    public Account() {
    }

    public Account(Integer numeroConta, String titular, Double saldo, Double limiteDeSaldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteDeSaque = limiteDeSaldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteDeSaque() {
        return limiteDeSaque;
    }

    public void setLimiteDeSaque(Double limiteDeSaque) {
        this.limiteDeSaque = limiteDeSaque;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de " + String.format("%.2f", valor) + " efetuado com sucesso ! ");
    }

    public double sacar(double valor) {

        try {
            if (valor > limiteDeSaque) {
                // Lançando uma exceção personalizada para limite de saque excedido
                throw new IllegalArgumentException("Valor de saque excede o limite permitido.");
            }
            if (valor > saldo) {
                // Lançando uma exceção personalizada para saldo insuficiente
                throw new IllegalArgumentException("Saldo insuficiente.");
            }

                return  saldo -= valor;

        } catch (IllegalArgumentException e) {
            // Captura qualquer exceção lançada acima e imprime a mensagem correspondente
            System.out.println(e.getMessage());
            return -1;
        }
    }

}