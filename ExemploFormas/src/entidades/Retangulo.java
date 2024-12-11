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
public class Retangulo extends Forma {
    float largura;
    float altura;

    public Retangulo() {
    }

    public Retangulo(float largura, float altura, Cor cor) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.largura * this.altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
