/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author aluno
 */
public abstract class Forma {
    Cor cor;

    public Forma() {
    }

    public Forma(Cor cor) {
        this.cor = cor;
    }
    
    public abstract double area();

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
    
   
}
