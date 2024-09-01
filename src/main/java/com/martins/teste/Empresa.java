package com.martins.teste;

public class Empresa {
    private String razaoSocial;
    private String cnpj;
    private double saldo;
    private double taxa;

    public Empresa(String razaoSocial, String cnpj, double saldo, double taxa) {
        if (validecnpj(cnpj))
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.saldo = 0.0;
        this.taxa = taxa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void transacao (Cliente cliente, double valor) {
        saldo += valor;
        System.out.println("Depósito  de R$ " + valor + "recebido de" + cliente + ".");
    
    }


}
