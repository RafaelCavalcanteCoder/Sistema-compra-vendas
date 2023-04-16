package br.com.fornecimentocafe.estoque;
import metodos.SistemaDeCompra;

public class App {
    public static void main(String[] args) throws Exception {

        Fornecedor fornecedor = new Fornecedor();        
        SistemaDeCompra sistemaDeCompra = new SistemaDeCompra();

        fornecedor.setCafeCru(1000);
        fornecedor.setCafeMoido(1000);
        fornecedor.setCafeTorrado(1000);
        

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Café Mania","12345644", true, 10000.00);
        pessoaJuridica.dadosPessoaJuridica();
        sistemaDeCompra.comprarCafeCru(200, fornecedor, pessoaJuridica);
        System.out.println("\n ESTOQUE DO CAFÉ MANIA");
        pessoaJuridica.imprimirEstoque();



        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Cafe Caval", "123456789858", false, 10000);
        pessoaJuridica2.dadosPessoaJuridica();
        sistemaDeCompra.comprarCafeCru(200, fornecedor, pessoaJuridica2);
        System.out.println("\n ESTOQUE DO CAFÉ CAVAL");
        pessoaJuridica2.imprimirEstoque();


        System.out.println(fornecedor.getCapital());
        fornecedor.imprimirEstoque();

        sistemaDeCompra.comprarCafeCru(800, fornecedor, pessoaJuridica);
      
    }
}