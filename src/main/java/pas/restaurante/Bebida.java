/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pas.restaurante;

/**
 *
 * @author edumo
 */
public class Bebida extends Item {
    private final int quantidade_ml;
    public Bebida(int codigo, String nome, float preco, int quantidade_ml) {
        super(codigo, nome, preco);
        this.quantidade_ml = quantidade_ml;
    }
    public int getQuantidadeMl(){
        return quantidade_ml;
    }
}
