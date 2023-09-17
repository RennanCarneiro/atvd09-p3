package atvd09.questao02;

import java.util.ArrayList;

public class Pedido {
    private int numero;
    private ArrayList<ItemPedido> listaItens;
    private double total;

    
    
    
    public Pedido(int numero, ArrayList<ItemPedido> listaItens) {
        this.numero = numero;
        this.listaItens = listaItens;
        
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total2) {
        this.total = total2;
    }
    public ArrayList<ItemPedido> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<ItemPedido> listaItens) {
        this.listaItens = listaItens;
    }

    
    
}
