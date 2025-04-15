package org.example;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0.0;

    }
    public double getSaldo(){
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()){
            this.titular = titular;
        }
    }
}
