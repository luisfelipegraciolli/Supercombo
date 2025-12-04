/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pas.restaurante;

/**
 *
 * @author edumo
 */
public class Prato extends Item implements ItemCardapio{

    private final int tempoPreparo;
    private final String receita;

    public Prato(int codigo, String nome,float preco, String receita, int tempoPreparo) {
        super(codigo,nome,preco);
        this.tempoPreparo = tempoPreparo;
        this.receita = receita;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public String getReceita(){
        return receita;
    }

}
