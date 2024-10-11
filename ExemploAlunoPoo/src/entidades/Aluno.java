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
public class Aluno {
    public String nome;
    public float notas[] = new float[3];
    public float notaFinal;
    public String status;
    
    public void calcularMedia(){
        this.notaFinal = (notas[0]+notas[1]+notas[2])/3;
    }
    
    public void statusAluno(){
        if(notaFinal >= 6)
            status = "APROVADO";
        else
            status = "REPROVADO";
    }

    @Override
    public String toString() {
        String resultado = "Nome: "+ nome + " nota1:" + notas[0] + 
                " nota2:" + notas[1] + " nota3:" + notas[2] 
                + " Media: " + notaFinal + " Status:" + status;
        float nota = 6-notaFinal;
        if(notaFinal <= 6)
            resultado += " Faltaram: " + nota + " pontos";        
                
        return  resultado;
    }
    
}
