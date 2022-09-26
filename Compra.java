
package com.mycompany.projectmaker;

import java.util.Scanner;

public class Compra {
public String nome;
public String endereco;        

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

 public void ImprimirC(){

      System.out.println("Nome: "+getNome());
      System.out.println("Endereço: "+getEndereco());

      
    }    
    
 public void EntradaDadosCo(){   
        Scanner lerCo = new Scanner(System.in);    
        System.out.println("Nome do comprador:");
        setNome(lerCo.nextLine());
        System.out.println("Endereço do comprador:");
        setEndereco(lerCo.nextLine());  
        
 }       
}
