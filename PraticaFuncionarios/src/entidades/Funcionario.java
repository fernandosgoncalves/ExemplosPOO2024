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
public class Funcionario {
    private int id;
    private String nome;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, float salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void aumentoSalarial(float percentual){
        this.salario = this.salario * (1+(percentual/100));
    }

    @Override
    public String toString() {
        return id + ", " + nome + ", " + salario;
    }
    
    
    
}
