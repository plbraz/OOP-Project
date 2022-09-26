
package com.mycompany.projectmaker;

import java.util.Scanner;

public class Rações extends Produtos {

    //Declaração de Variáveis
    public String peso;
 
    //Métodos Construtores
    public Rações(){
     super();
    }

    public Rações(String peso, String modelo1, double preco1, String peso1){
        
      this.peso=peso;
    }
    //Métodos de Acesso SET
    public void setPeso(String peso){
      this.peso=peso;
    }

    //Métodos de Acesso GET
    public String getPeso(){
      return this.peso;
    }
    
    //Método Cadastrar Coleiras 
    public void CadastrarR(String marca, String modelo, int preco, String peso){
       this.marca=marca;
       this.modelo=modelo;
       this.preco=preco;
       this.peso=peso;

    }

    //Método Imprimir Coleiras
   

    public void EntradaDadosR(){
        Racoes objRa;  
        Scanner lerR = new Scanner(System.in);  
          
          System.out.println("Digite o Peso: ");
          setPeso(lerR.nextLine());
          
        objRa = new Rações(peso);
        Array.adicionar(objRa);    
      }    
    public String ImprimirR(){
        
    return String.format("Peso: " + peso);
    }
}