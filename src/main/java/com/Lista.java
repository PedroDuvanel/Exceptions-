package com;

import java.util.Scanner;

import com.exceptions.Minhaexception;

public class Lista {

    public void ex01(){
        Scanner scanner = new Scanner(System.in);

        int dividendo;
        int divisor; 
        int resultado;
        
        try {

            System.out.println("Escolha um numero para dividir: ");
            dividendo = scanner.nextInt();

            System.out.println("Escolha um numero para ser o divisor: ");
            divisor = scanner.nextInt();

            resultado = dividendo / divisor;

            System.out.println("O resultado será: " + resultado);

        } catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero.");
        }
    }

    public void ex02(){

        Scanner scanner = new Scanner(System.in);
        int escolha; 

        try {
            System.out.println("Bem-vindo ao restaurante");
            System.out.println("1- ver cardápio.");
            System.out.println("2- ver pedido.");
            System.out.println("3- sair.");

            escolha = scanner.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println("Esse é o seu cardápio...");
                    break;
                case 2:
                    System.out.println("Esse é o seu pedido...");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Número inválido!");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Erro: Por favor, insira um número inteiro válido!");
            
        } finally {
            scanner.close(); 
        }

    }
    
    public void ex03(){
        
        Scanner scanner = new Scanner(System.in);
        int escolha;

        System.out.println("Bem-vindo(a) ao Menu:");
        System.out.println("1 - ver nomes.");
        System.out.println("2 - sair.");

        try {
            escolha = scanner.nextInt();

            while (escolha == 1) {
                System.out.println("Escolha um nome:");
                System.out.println("1 - Lucas");
                System.out.println("2 - Enzo");
                System.out.println("3 - Eloisa");

                int nomeEscolhido = scanner.nextInt();

                switch (nomeEscolhido) {
                    case 1:
                        System.out.println("Você escolheu: Lucas");
                        break;
                    case 2:
                        System.out.println("Você escolheu: Enzo");
                        break;
                    case 3:
                        System.out.println("Você escolheu: Eloisa");
                        break;
                    default:
                        System.out.println("Erro: Nome inválido!");
                        break;
                }

            }

            System.out.println("Saindo...");

        } catch (Exception e) {
            System.out.println("Erro: Por favor, insira um index válido!");
        } finally {
            scanner.close(); 
        }
    }

    public void ex04() {

    }


}