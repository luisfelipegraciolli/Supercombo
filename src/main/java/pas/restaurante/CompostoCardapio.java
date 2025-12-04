/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pas.restaurante;

import java.util.ArrayList;

/**
 *
 * @author edumo
 */
public class CompostoCardapio implements ItemCardapio{
    private final String nome;
    private final ArrayList<ItemCardapio> itens = new ArrayList<>();

    public CompostoCardapio(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    @Override
    public float getPreco() {
        float total=0;
        for(ItemCardapio i:itens){
            total += i.getPreco();
        }
        return total;
    }

    public void addItem(ItemCardapio it){
        itens.add(it);
    }
    public ItemCardapio getItem(int i){
        return itens.get(i);
    }
    public int numItens(){
        return itens.size();
    }


}
