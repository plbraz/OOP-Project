package com.mycompany.projectmaker;
import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        
       menu();      
    }

    public static void  menu()  {
        Scanner identity = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);

                int id;

                System.out.println("\n\n### Escolha a opção de login ###");
                System.out.println("\n       =========================");
                System.out.println("       |     1 - Cliente       |");
                System.out.println("       |     2 - Funcionario   |");
                System.out.println("       |     3 - Sair          |");
                System.out.println("       =========================\n");
                id = Integer.parseInt(identity.nextLine());


                 switch(id){

        case 1:
        Compra Co = new Compra();    
        Co.EntradaDadosCo();    
        
        Estoque();  
        
        compra();
        
        System.out.println("Pressione S para continuar ou N para sair:");
        
        char resp1;
        resp1 = ler.next().charAt(0);
        
        if (resp1 == 's' || resp1 == 'S') {
            menu();
        } 
        
        else {
          System.exit(0);
        }

        case 2:
            
        menu2();
        
        
        case 3:
                System.exit(0);
            
  }
 }

public static void  menu2()  {
        Scanner identity = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);

                int id;
           
                System.out.println("\n\n### Escolha uma opção ###");
                System.out.println("\n       =========================");
                System.out.println("       |     1 - Estoque       |");
                System.out.println("       |     2 - ADD Estoque   |");
                System.out.println("       |     3 - Sair          |");
                System.out.println("       =========================\n");
                id = Integer.parseInt(identity.nextLine());


                 switch(id){            

        case 1:
           
            
        Estoque();
           


        System.out.println("Pressione S para continuar ou N para sair:");
        
        char resp1;
        resp1 = ler.next().charAt(0);
        
        if (resp1 == 's' || resp1 == 'S') {
            menu2();
        } 
        
        else {
          System.exit(0);
        }

        case 2:
            
        menu3();

        System.out.println("");

        System.out.println("Pressione S para continuar ou N para sair:");
         char resp3;
        resp3 = ler.next().charAt(0);
        if (resp3 == 's' || resp3 == 'S') {
            menu2();
        } 
        
        else {
                System.exit(0);
        }
        
        case 3:
                menu();
 }            
                
}                
    
public static void  menu3()  {
        Scanner identity = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);

                int id;

                System.out.println("\n\n### Escolha a opção de login ###");
                System.out.println("\n       =========================");
                System.out.println("       |     1 - Coleiras      |");
                System.out.println("       |     2 - Potes         |");
                System.out.println("       |     3 - Petiscos      |");
                System.out.println("       |     4 - Rações        |");
                System.out.println("       |     5 - Sair          |");
                System.out.println("       =========================\n");
                id = Integer.parseInt(identity.nextLine());


                 switch(id){
        case 1:

            Coleiras C = new Coleiras();
            C.EntradaDadosC();
            C.ImprimirC();



        System.out.println("Pressione S para continuar ou N para sair:");
        
        char resp1;
        resp1 = ler.next().charAt(0);
        
        if (resp1 == 's' || resp1 == 'S') {
            menu3();
        } 
        
        else {
          System.exit(0);
        }

        case 2:
            
            Potes PO = new Potes();
            PO.EntradaDadosPO();
            PO.ImprimirPO();


        System.out.println("Pressione S para continuar ou N para sair:");
         char resp2;
        resp2 = ler.next().charAt(0);
        if (resp2 == 's' || resp2 == 'S') {
            menu3();
        } 
        
        else {
                System.exit(0);
        }
        
        case 3:
            
            Petiscos PE = new Petiscos();
            PE.EntradaDadosPE();
            PE.ImprimirPE();

        System.out.println("Pressione S para continuar ou N para sair:");
        
        char resp3;
        resp3 = ler.next().charAt(0);
        
        if (resp3 == 's' || resp3 == 'S') {
            menu3();
        } 
        
        else {
          System.exit(0);
        }

        case 4:
            
            Rações R = new Rações();
            R.EntradaDadosR();
            R.ImprimirR();


        System.out.println("Pressione S para continuar ou N para sair:");
         char resp4;
        resp4 = ler.next().charAt(0);
        if (resp4 == 's' || resp4 == 'S') {
            menu3();
        } 
        
        else {
                System.exit(0);
        }
        
        case 5:
                menu2();
        }
        
   
  }

public static void  compra()  {
        Scanner identity = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);

                int id;

                System.out.println("\n\n### Escolha a opção de login ###");
                System.out.println("\n       =========================");
                System.out.println("       |     1 - ADD produto   |");
                System.out.println("       |     2 - Carrinho      |");
                System.out.println("       |     3 - Sair          |");
                System.out.println("       =========================\n");
                id = Integer.parseInt(identity.nextLine());


                 switch(id){
        case 1:
            
 

        System.out.println("Pressione S para continuar ou N para sair:");
         char resp1;
        resp1 = ler.next().charAt(0);
        if (resp1 == 's' || resp1 == 'S') {
            compra();
        } 
        
        else {
                System.exit(0);
        }   
        
        case 2:
        
            
             
        System.out.println("Pressione S para continuar ou N para terminar a compra:");
         char resp2;
        resp2 = ler.next().charAt(0);
        if (resp2 == 's' || resp2 == 'S') {
            compra();
        } 
        
        else {
                compra2();
        }       
        case 3: 
         menu();
}
}

public static void  compra2()  {
        Scanner identity = new Scanner(System.in);
        

                int id;

                System.out.println("\n\n### Escolha a opção de login ###");
                System.out.println("\n       ================================");
                System.out.println("       |     1 - finalizar a compra   |");
                System.out.println("       |     2 - Cancelar             |");
                System.out.println("       ===============================\n");
                id = Integer.parseInt(identity.nextLine());


                 switch(id){
        case 1:

            
        case 2:   
         System.exit(0);    
            
}
}

public static void  Estoque(){
            Coleiras C = new Coleiras();
            C.ImprimirC();
            Potes PO = new Potes();
            PO.ImprimirPO();
            Petiscos PE = new Petiscos();
            PE.ImprimirPE();
            Rações R = new Rações();
            R.ImprimirR();
          Coleiras C1 = new Coleiras();
          Coleiras C2 = new Coleiras();
          Coleiras C3 = new Coleiras();
         C1.CadastrarC("Electrolux","2021",50,"79");
         C2.CadastrarC("Electrolux","2021",50,"79");
         C3.CadastrarC("Electrolux","2021",50,"79");
         C1.ImprimirC();
         C2.ImprimirC();
         C2.ImprimirC();

          Potes PO1 = new Potes();
          Potes PO2 = new Potes();
          Potes PO3 = new Potes();
         PO1.CadastrarPO("Electrolux","2021",500,"43");          
         PO2.CadastrarPO("Electrolux","2021",500,"43");
         PO3.CadastrarPO("Electrolux","2021",500,"43");
         PO1.ImprimirPO();
         PO2.ImprimirPO();
         PO3.ImprimirPO();

          Petiscos PE1 = new Petiscos();
          Petiscos PE2 = new Petiscos();
          Petiscos PE3 = new Petiscos();
         PE1.CadastrarPE("Electrolux","2021",500,"53"); 
         PE2.CadastrarPE("Electrolux","2021",500,"53");
         PE3.CadastrarPE("Electrolux","2021",500,"53");
         PE1.ImprimirPE();
         PE2.ImprimirPE();
         PE3.ImprimirPE();

          Rações R1 = new Rações();
          Rações R2 = new Rações();
          Rações R3 = new Rações();
         R1.CadastrarR("Electrolux","2021",500,"23");          
         R2.CadastrarR("Electrolux","2021",500,"23");
         R3.CadastrarR("Electrolux","2021",500,"23");
         R1.ImprimirR();
         R2.ImprimirR();
         R3.ImprimirR();

}
}

