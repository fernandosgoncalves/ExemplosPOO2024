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
public class Circulo extends Forma{
    float raio;

    public Circulo() {
    }

    public Circulo(float raio, Cor cor) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * this.raio * this.raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
}
