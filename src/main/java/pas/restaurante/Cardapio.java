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
public class Cardapio {
    private final String nome;
    private final ArrayList<Item>    itens = new ArrayList();
    private final ArrayList<Combo>    combos = new ArrayList();
    private final ArrayList<MegaCombo>    megacombos = new ArrayList();    
    public Cardapio(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void addItem(Item it){
        itens.add(it);
    }
    public Item getItem(int i){
        return itens.get(i);
    }
    public int numItens(){
        return itens.size();
    }
    public void addCombo(Combo c){
        combos.add(c);
    }
    public Combo getCombo(int i){
        return combos.get(i);
    }
    public int numCombos(){
        return combos.size();
    }    
    public void addMegaCombo(MegaCombo c){
        megacombos.add(c);
    }
    public MegaCombo getMegaCombo(int i){
        return megacombos.get(i);
    }
    public int numMegaCombos(){
        return megacombos.size();
    } 
}
