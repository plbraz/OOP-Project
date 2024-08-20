package com.petshop.project.*;

import java.util.Scanner;

public class Coleiras extends Produtos {

    //Declaração de Variáveis
    public String comprimento;
 
    //Métodos Construtores
    public Coleiras(){
     super();
    }

    public Coleiras(String comprimento){
        
      this.comprimento=comprimento;
    }


    //Métodos de Acesso SET
    public void setComprimento(String comprimento){
      this.comprimento=comprimento;
    }

    //Métodos de Acesso GET
    public String getComprimento(){
      return comprimento;
    }

    //Método Cadastrar Coleiras 
    public void CadastrarC(String marca, String modelo,int preco,String comprimento){
       this.marca=marca;
       this.modelo=modelo;
       this.preco=preco;
       this.comprimento=comprimento;

    }

    //Método Imprimir Coleiras
    public void ImprimirC(){
      System.out.println("\n       =========================");
      System.out.println("       |       Coleiras         |");
      System.out.println("       =========================\n");
      imprimirBase();
      System.out.println("Comprimento: "+getComprimento());
      System.out.println();

      
    }

    public void EntradaDadosC(){
      entradaDadosBase();
      Scanner lerC = new Scanner(System.in);
      
          System.out.println("Digite o Comprimento Máximo: ");
          setComprimento(lerC.nextLine());

      }    

}