package metodos;

import br.com.fornecimentocafe.estoque.Fornecedor;

public class SistemaDeCompra extends Fornecedor {

    public void comprarCafeCru(double quantidade, Fornecedor fornecedor, Fornecedor comprador) {
        if (comprador.getCapital()>= quantidade*getValorCafeCru() && quantidade <= fornecedor.getCafeCru()&&  comprador.isCartaoFidelidade() == true && quantidade >= 100) {
            comprador.setCafeCru(comprador.getCafeCru()+ quantidade); 
            fornecedor.setCafeCru(fornecedor.getCafeCru() - quantidade);// Aqui vai tirar do Fornecedor e passar para quem esta comprando
            
            comprador.setCapital((comprador.getCapital() -quantidade*getValorCafeCru() * getDesconto()));
            fornecedor.setCapital(fornecedor.getCapital() + (quantidade*getValorCafeCru() * getDesconto()));
            comprador.setCapital(comprador.getCapital() - getValorCafeCru()* quantidade * 0.10);
            setCapital(getCapital() + getValorCafeCru()* quantidade * 0.1);
            System.out.println("Compra de café cru realizada com desconto! ");

       
        } else  if (comprador.getCapital()>= quantidade*getValorCafeCru() && quantidade <= fornecedor.getCafeCru()&& comprador.isCartaoFidelidade() == false) {

            comprador.setCafeCru(comprador.getCafeCru()+ quantidade); 
            fornecedor.setCafeCru(fornecedor.getCafeCru() - quantidade);// Aqui vai tirar do Fornecedor e passar para quem esta comprando
            comprador.setCapital((comprador.getCapital() -quantidade*getValorCafeCru()));
            fornecedor.setCapital(fornecedor.getCapital() + (quantidade*getValorCafeCru()));
            comprador.setCapital(comprador.getCapital() - getValorCafeCru()* quantidade * 0.10);
            setCapital(getCapital() + getValorCafeCru()* quantidade * 0.1);
            System.out.println("Compra de café cru realizada com sucesso!");
        } else {
            System.out.println("Não há café cru suficiente no estoque do fornecedor "
            		+ "ou seu capital é insuficiente");
        }
    }

    public void comprarCafeTorrado(int quantidade, Fornecedor fornecedor, Fornecedor comprador) {
    	
        if (comprador.getCapital()>= quantidade*getValorCafeTorrado() && quantidade <= fornecedor.getCafeTorrado()&&  comprador.isCartaoFidelidade() == true && quantidade >= 100) {
            comprador.setCafeTorrado(comprador.getCafeTorrado()+ quantidade); 
            fornecedor.setCafeTorrado(fornecedor.getCafeTorrado() - quantidade);// Aqui vai tirar do Fornecedor e passar para quem esta comprando
            comprador.setCapital((comprador.getCapital() -quantidade*getValorCafeTorrado() * getDesconto()));
            fornecedor.setCapital(fornecedor.getCapital() + (quantidade*getValorCafeTorrado() * getDesconto()));
            comprador.setCapital(comprador.getCapital() - getValorCafeTorrado()* quantidade * 0.10);
            setCapital(getCapital() + getValorCafeTorrado()* quantidade * 0.1);
            System.out.println("Compra de café torrado realizada com desconto! ");

       
        } else if (comprador.getCapital()>= quantidade*getValorCafeTorrado() && quantidade <= fornecedor.getCafeTorrado()&& comprador.isCartaoFidelidade() == false) {
            comprador.setCafeTorrado(comprador.getCafeTorrado() + quantidade);
            fornecedor.setCafeTorrado(fornecedor.getCafeTorrado() - quantidade);
            comprador.setCapital((comprador.getCapital() -quantidade* getValorCafeTorrado()));
            fornecedor.setCapital(fornecedor.getCapital() + (quantidade* getValorCafeTorrado()));
            comprador.setCapital(comprador.getCapital() - getValorCafeTorrado()* quantidade * 0.10);
            setCapital(getCapital() + getValorCafeTorrado()* quantidade * 0.1);
            System.out.println("\n Compra de café torrado realizada com sucesso!");

        } else {
        	System.out.println("Não há café torrado suficiente no estoque do fornecedor "
            		+ "ou seu capital é insuficiente");
        }
    }
    public void comprarCafeMoido(int quantidade, Fornecedor fornecedor, Fornecedor comprador) {
    	
        if (comprador.getCapital()>= quantidade*getValorCafeMoido() && quantidade <= fornecedor.getCafeMoido()&&  comprador.isCartaoFidelidade() == true && quantidade >= 100) {
            comprador.setCafeMoido(comprador.getCafeMoido()+ quantidade); 
            fornecedor.setCafeMoido(fornecedor.getCafeMoido() - quantidade);// Aqui vai tirar do Fornecedor e passar para quem esta comprando
            comprador.setCapital((comprador.getCapital() -quantidade*getValorCafeMoido() * getDesconto()));
            fornecedor.setCapital(fornecedor.getCapital() + (quantidade*getValorCafeMoido() * getDesconto()));
            comprador.setCapital(comprador.getCapital() - getValorCafeMoido()* quantidade * 0.10);
            setCapital(getCapital() + getValorCafeMoido()* quantidade * 0.1);
            System.out.println("Compra de café moido realizada com desconto! ");

       
        } else if (quantidade <= fornecedor.getCafeMoido()&& comprador.isCartaoFidelidade() == false) {
            comprador.setCafeMoido(comprador.getCafeMoido() + quantidade);
            fornecedor.setCafeMoido(fornecedor.getCafeMoido() - quantidade);
            comprador.setCapital((comprador.getCapital() -quantidade*getValorCafeMoido()));
            fornecedor.setCapital(fornecedor.getCapital() + (quantidade*getValorCafeMoido()));
            comprador.setCapital(comprador.getCapital() - getValorCafeMoido()* quantidade * 0.10);
            setCapital(getCapital() + getValorCafeMoido()* quantidade * 0.1);
            System.out.println("\n Compra de café moido realizada com sucesso!");
        } else {
        	System.out.println("Não há café moido suficiente no estoque do fornecedor "
            		+ "ou seu capital é insuficiente");
        }
    }

    
    }