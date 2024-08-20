package com.petshop.project.*;

import java.util.Scanner;

public class Racoes extends Produtos {

    // Declaração de Variáveis
    private String peso;
 
    // Métodos Construtores
    public Racoes() {
        super();
    }

    public Racoes(String peso, String modelo, double preco) {
        super(modelo, preco);  // Chama o construtor da superclasse
        this.peso = peso;
    }
    
    // Métodos de Acesso SET
    public void setPeso(String peso) {
        this.peso = peso;
    }

    // Métodos de Acesso GET
    public String getPeso() {
        return this.peso;
    }
    
    // Método Cadastrar Rações 
    public void CadastrarRacoes(String marca, String modelo, double preco, String peso) {
        super.setMarca(marca);  // Método da superclasse
        super.setModelo(modelo); // Método da superclasse
        super.setPreco(preco);   // Método da superclasse
        this.peso = peso;
    }

    // Método EntradaDados
    public void EntradaDadosRacoes() {
        Scanner scanner = new Scanner(System.in);  
          
        System.out.println("Digite o Peso: ");
        setPeso(scanner.nextLine());
          
        Racoes novoRacao = new Racoes(peso, super.getModelo(), super.getPreco()); // Ajusta a criação do objeto
        Array.adicionar(novoRacao);    
    }    

    // Método Imprimir
    public String ImprimirRacoes() {
        return String.format("Peso: %s, Modelo: %s, Preço: %.2f", peso, super.getModelo(), super.getPreco());
    }
}
