package edu.ricardo.model;

public class ContaBancaria {
    private int numero;
    private String agencia;
    private String nome;
    private Double saldo;


    public ContaBancaria(int numero, String agencia, String nome, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }



    public int getNumero() {
        return numero;
    }



    public void setNumero(int numero) {
        this.numero = numero;
    }



    public String getAgencia() {
        return agencia;
    }



    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public Double getSaldo() {
        return saldo;
    }



    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }



    @Override 
    public String toString(){
        return (
        "Olá " + getNome() +  
        ", obrigado por criar uma conta em nosso banco, sua agência é " + getAgencia() +
        ", conta " + getNumero() +
        " e seu saldo " + getSaldo() +
        " já está disponível para saque."

        );
    }

    
}
