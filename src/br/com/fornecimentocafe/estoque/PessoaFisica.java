package br.com.fornecimentocafe.estoque;

import metodos.SistemaDeCompra;

public class PessoaFisica extends Fornecedor {
    private String cpf;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
  
    public PessoaFisica(String setNome, String cpf, boolean cartaoFidelidade, double setCapital) {
        super.setNome(setNome);
        this.cpf = cpf;
        super.isCartaoFidelidade();
        super.setCapital(setCapital);
    }
    
    public void dadosPessoaFisica() {
        
        System.out.println("\n Nome do cliente:  " + getNome());
        System.out.println("Cpf do cliente:  " + getCpf());
        System.out.println("Possui cartão fidelidade:   " + isCartaoFidelidade());
        

    }
    
}



   



   

    	