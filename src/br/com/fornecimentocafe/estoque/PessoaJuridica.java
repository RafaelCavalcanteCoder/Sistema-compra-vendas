package br.com.fornecimentocafe.estoque;

import metodos.SistemaDeCompra;

public class PessoaJuridica extends Fornecedor{
    private String cnpj;
   
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }



    public PessoaJuridica(String setNome, String cnpj, boolean cartaoFidelidade, double setCapital) {
        super.setNome(setNome);
        this.cnpj = cnpj;
      super.setCartaoFidelidade(cartaoFidelidade);
        super.setCapital(setCapital);
  
    }

    public void dadosPessoaJuridica() {
       
        System.out.println("\n Nome da Empresa: " + getNome());
        System.out.println("Cnpj da Empresa:  " + getCnpj());
        System.out.println("É Empresa Parceira:   " + isCartaoFidelidade());
        
    }


    }

    
