 package br.com.fornecimentocafe.estoque;

 import metodos.SistemaDeCompra;

public class Fornecedor {

    private String nome;
    private double cafeCru ;
    private double cafeTorrado;
    private double cafeMoido ;
    private double capital;
    private boolean cartaoFidelidade;
    private double valorCafeCru = 4.5;
    private double valorCafeTorrado = 5.0;
    private double valorCafeMoido = 6;
    private double desconto = 0.3;
    

    public double getDesconto() {
        return desconto;
    }
    public double getValorCafeCru() {
        return valorCafeCru;
    }

    public double getValorCafeTorrado() {
        return valorCafeTorrado;
    }

    public double getValorCafeMoido() {
        return valorCafeMoido;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;

    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        return this.nome = nome;
    }

    public double getCafeCru() {
        return cafeCru;
    }

    public void setCafeCru(double cafeCru) {
        this.cafeCru = cafeCru;

    }

    public double getCafeTorrado() {
        return cafeTorrado;
    }

    public void setCafeTorrado(double cafeTorrado) {
        this.cafeTorrado = cafeTorrado;
    }

    public double getCafeMoido() {
        return cafeMoido;
    }

    public void setCafeMoido(double cafeMoido) {
        this.cafeMoido = cafeMoido;
    }
    
    public boolean isCartaoFidelidade() {
        return cartaoFidelidade;
    }

    public void setCartaoFidelidade(boolean cartaoFidelidade) {
        this.cartaoFidelidade = cartaoFidelidade;
    }
  
  
  
    public void imprimirEstoque() {
        System.out.println("Valor Total do capital:  " + capital);
        System.out.println("\n Estoque de café cru: " + cafeCru);
        System.out.println("Estoque de café torrado: " + cafeTorrado);
        System.out.println("Estoque de café moído: " + cafeMoido);
        System.out.println("Total de Estoque:  "+ (cafeCru + cafeMoido + cafeTorrado));
    }

  

    




    }

   
    	    