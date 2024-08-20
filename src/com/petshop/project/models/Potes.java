package com.petshop.project.*;

import java.util.Scanner;

public class Potes extends Produtos {

    //Declaração de Variáveis
    public String tamanho;
 
    //Métodos Construtores
    public Potes(){
     super();
    }

    public Potes(String tamanho){
        
      this.tamanho=tamanho;
    }
    //Métodos de Acesso SET
    public void setTamanho(String tamanho){
      this.tamanho=tamanho;
    }

    //Métodos de Acesso GET
    public String getTamanho(){
      return tamanho;
    }

    //Método Cadastrar Coleiras 
    public void CadastrarPO(String marca, String modelo, int preco, String tamanho){
       this.marca=marca;
       this.modelo=modelo;
       this.preco=preco;
       this.tamanho=tamanho;

    }

    //Método Imprimir Coleiras
    public void ImprimirPO(){
      System.out.println("\n       =========================");
      System.out.println("       |       Potes            |");
      System.out.println("       =========================\n");
      imprimirBase();
      System.out.println("Tamanho: "+getTamanho());
      System.out.println();

      
    }

    public void EntradaDadosPO(){
      entradaDadosBase();
      Scanner lerPO = new Scanner(System.in);
      
          System.out.println("Digite o tamanho: ");
          setTamanho(lerPO.nextLine());

      }    

}