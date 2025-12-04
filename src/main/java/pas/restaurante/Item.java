/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pas.restaurante;

/**
 *
 * @author edumo
 */
public abstract class Item implements ItemCardapio{
    private final int codigo;
    private final String nome;
    private float preco;

    public Item(int codigo, String nome,float preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;        
    }
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
