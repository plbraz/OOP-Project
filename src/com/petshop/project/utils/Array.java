package com.petshop.project.*;

import java.util.ArrayList;

public class Array extends Menu{
  // array compra  
private static ArrayList<Racoes> ra = new ArrayList<>();
private static ArrayList<Potes> po = new ArrayList<>();
private static ArrayList<Petiscos> pet = new ArrayList<>();
private static ArrayList<Coleiras> col = new ArrayList<>();
private static ArrayList<Compra> com = new ArrayList<>();
private static ArrayList<Produtos> pro = new ArrayList<>();
  //add ob
static public void adicionar(Racoes l){
       ra.add(l);
}
static public void adicionar(Potes l){
       po.add(l);
}
static public void adicionar(Petiscos l){
       pet.add(l);
}
static public void adicionar(Coleiras l){
       col.add(l);
}
static public void adicionar(Compra l){
       com.add(l);
}
static public void adicionar(Produtos l){
       pro.add(l);
}
    
    
   //listar
static public String listar(){
        String saida = "";
        int i=1;
        for(Racoes l : ra){
            saida+= "\n==== Lancha" + (i++) + " ====\n";
            saida+= l.ImprimirR() + "\n"; 
        }

        return saida;
    }
static public String listar2(){
        String saida = "";
        int i=1;
        for(Potes l : po){
            saida+= "\n==== Lancha" + (i++) + " ====\n";
            saida+= l.ImprimirLancha() + "\n"; 
        }

        return saida;
    }    
static public String listar3(){
        String saida = "";
        int i=1;
        for(Petiscos l : pet){
            saida+= "\n==== Lancha" + (i++) + " ====\n";
            saida+= l.ImprimirLancha() + "\n"; 
        }

        return saida;
    }    
static public String listar4(){
        String saida = "";
        int i=1;
        for(Coleiras l : col){
            saida+= "\n==== Lancha" + (i++) + " ====\n";
            saida+= l.ImprimirLancha() + "\n"; 
        }

        return saida;
    }
static public String listar5(){
        String saida = "";
        int i=1;
        for(Compra l : com){
            saida+= "\n==== Lancha" + (i++) + " ====\n";
            saida+= l.ImprimirLancha() + "\n"; 
        }

        return saida;
    }
static public String listar6(){
        String saida = "";
        int i=1;
        for(Produtos l : pro){
            saida+= l.ImprimirLancha() + "\n"; 
        }

        return saida;
    }
    } 