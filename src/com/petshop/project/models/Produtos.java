package com.petshop.project.*;

import java.util.Scanner;

 abstract public class Produtos{
    //Declaração de Variáveis
    
    protected String marca;
    protected String modelo;
    protected double preco;

    
    //Métodos Construtores

    public Produtos(){
       super();
    }

    public Produtos(String marca, String modelo, double preco){
      this.marca=marca;
      this.modelo=modelo;
      this.preco=preco;
    }
    
    public Produtos(String marca, String modelo){
      this.marca=marca;
      this.modelo=modelo;
    }

    public Produtos(String marca){
      this.marca=marca;
    }

    public Produtos(String marca, double preco){
      this.marca=marca;
      this.preco=preco;
    }

    public Produtos(double preco , String modelo){
      this.preco=preco;
      this.modelo=modelo;
    }

    public Produtos(double preco){

      this.preco=preco;
    }
    
      //Métodos de Acesso SET

    public void setMarca(String marca){
      this.marca=marca;
    }

    public void setModelo(String modelo){
      this.modelo=modelo;
    }

    public void setPreco(double preco){
      this.preco=preco;
    }

    //Métodos de Acesso GET

    public String getMarca(){
      
      return marca;
    }

    public String getModelo(){

      return modelo;
    }

    public double getPreco(){

      return preco;
    }

    //Método Cadastrar Eletrodoméstico
    public void CadastrarBase(String marca, String modelo, int preco){
      this.marca=marca;
      this.modelo=modelo;
      this.preco=preco;
    }

    //Método Imprimir valores base
    public void imprimirBase(){
      System.out.println();
      System.out.println("Marca: "+getMarca());
      System.out.println("Modelo: "+getModelo());
      System.out.println("Preço: "+getPreco());
      
    }

    //entrada de dados base
    public void entradaDadosBase(){
        Produtos objRa;
        System.out.println();
      Scanner lerE = new Scanner(System.in);
          System.out.println("Digite a Marca: ");
      setMarca(lerE.nextLine());
          System.out.println("Digite o Modelo: ");
      setModelo(lerE.nextLine());
          System.out.println("Digite o Preço: ");
      setPreco(Double.parseDouble(lerE.nextLine()));
      
      
      }  
  }   