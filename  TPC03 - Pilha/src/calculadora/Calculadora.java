/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Admilson
 */


import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha();

        boolean executando = true;
        while (executando) {
            System.out.println("----- Calculadora Simples -----");
            System.out.println("Escolha a operacao:");
            System.out.println("1. Inserir numero na pilha");
            System.out.println("2. Somar");
            System.out.println("3. Subtrair");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("6. Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um numero: ");
                    int numero = scanner.nextInt();
                    pilha.push(numero);
                    break;
                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("Insira pelo menos um número na pilha.");
                        break;
                    }
                    System.out.print("Digite o segundo numero: ");
                    int numeroSoma = scanner.nextInt();
                    int resultadoSoma = pilha.pop() + numeroSoma;
                    pilha.push(resultadoSoma);
                    System.out.println("Resultado da soma: " + resultadoSoma);
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("Insira pelo menos um numero na pilha.");
                        break;
                    }
                    System.out.print("Digite o segundo número: ");
                    int numeroSubtracao = scanner.nextInt();
                    int resultadoSubtracao = pilha.pop() - numeroSubtracao;
                    pilha.push(resultadoSubtracao);
                    System.out.println("Resultado da subtracao: " + resultadoSubtracao);
                    break;
                case 4:
                    if (pilha.isEmpty()) {
                        System.out.println("Insira pelo menos um numero na pilha.");
                        break;
                    }
                    System.out.print("Digite o segundo numero: ");
                    int numeroMultiplicacao = scanner.nextInt();
                    int resultadoMultiplicacao = pilha.pop() * numeroMultiplicacao;
                    pilha.push(resultadoMultiplicacao);
                    System.out.println("Resultado da multiplicacao: " + resultadoMultiplicacao);
                    break;
                case 5:
                    if (pilha.isEmpty()) {
                        System.out.println("Insira pelo menos um numero na pilha.");
                        break;
                    }
                    System.out.print("Digite o segundo numero: ");
                    int numeroDivisor = scanner.nextInt();
                    if (numeroDivisor == 0) {
                        System.out.println("Divisao por zero nao e permitida.");
                        break;
                    }
                    int numeroDividendo = pilha.pop();
                    int resultadoDivisao = numeroDividendo / numeroDivisor;
                    pilha.push(resultadoDivisao);
                    System.out.println("Resultado da divisao: " + resultadoDivisao);
                    break;
                case 6:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }
        System.out.println("Encerrando a calculadora...");
    }
}
