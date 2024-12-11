/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploformas;

import entidades.Circulo;
import entidades.Cor;
import entidades.Forma;
import entidades.Retangulo;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExemploFormas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a quantidade de formas que deseja cadastrar:");
        int qtde = ler.nextInt();
        
        Forma[] f = new Forma[qtde];
        
        for(int i=0; i<qtde; i++){
            System.out.println("Forma " + (i+1));
            System.out.print("Retangulo ou circulo (1/2)?");
            int tipo = ler.nextInt();
            
            if(tipo == 1){
                //Retangulo
                System.out.print("Altura: ");
                float altura = ler.nextFloat();
                System.out.print("Largura: ");
                float largura = ler.nextFloat();
                System.out.print("Cor:");
                Cor cor = Cor.valueOf(ler.next());
                
                f[i] = new Retangulo(largura, altura, cor);
            }else{
                //Circulo
                System.out.print("Raio: " );
                float raio = ler.nextFloat();
                System.out.print("Cor:");
                Cor cor = Cor.valueOf(ler.next());
                
                f[i] = new Circulo(raio, cor);
            }
        }
        
        System.out.println("Area das Formas");
        for(int i=0; i<qtde; i++){
            if(f[i].getCor() == Cor.BRANCO)
                System.out.println("Area: " + f[i].area());
        }
        
        
    }
    
}
