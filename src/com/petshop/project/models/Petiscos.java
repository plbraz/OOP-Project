package com.petshop.project.*;

import java.util.Scanner;

public class Petiscos extends Produtos {

    //Declaração de Variáveis
    public String quantidade;
 
    //Métodos Construtores
    public Petiscos(){
     super();
    }

    public Petiscos(String quantidade){
        
      this.quantidade=quantidade;
    }
    //Métodos de Acesso SET
    public void setQuantidade(String quantidade){
      this.quantidade=quantidade;
    }

    //Métodos de Acesso GET
    public String getQuantidade(){
      return quantidade;
    }

    //Método Cadastrar Coleiras 
    public void CadastrarPE(String marca, String modelo, int preco, String quantidade){
       this.marca=marca;
       this.modelo=modelo;
       this.preco=preco;
       this.quantidade=quantidade;

    }

    //Método Imprimir Coleiras
    public void ImprimirPE(){
      System.out.println("\n       =========================");
      System.out.println("       |       Petiscos         |");
      System.out.println("       =========================\n");
      imprimirBase();
      System.out.println("Quantidade: "+getQuantidade());
      System.out.println();

      
    }

    public void EntradaDadosPE(){
      entradaDadosBase();
      Scanner lerPE = new Scanner(System.in);
      
          System.out.println("Digite a Quantidade: ");
          setQuantidade(lerPE.nextLine());

      }    

}