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
public class Combo {
    private final ArrayList<Item>    itens = new ArrayList();
    private final String nome;  
    
    public Combo(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void addItem(Item p){
        itens.add(p);
    }
    public Item getItem(int i){
        return itens.get(i);
    }
    public int numItens(){
        return itens.size();
    }
    public float getPreco(){
        float total=0;
        for(Item i:itens){
            total += i.getPreco();
        }
        return total;
    }
}
