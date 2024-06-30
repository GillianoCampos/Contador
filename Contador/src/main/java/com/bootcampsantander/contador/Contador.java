package com.bootcampsantander.contador;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        //Entrada dos parametros
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro :");
        int parametroUM = sc.nextInt();

        System.out.println("Digite o segundo parâmetro :");
        int parametroDois = sc.nextInt();

        try {
            //chamada do metodo contar
            contar(parametroUM, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUM, int parametroDois) throws ParametrosInvalidosException {

        //Validar se o parametro um é maior que o dois e lançar a exceção+
        if (parametroUM > parametroDois) {

            throw new ParametrosInvalidosException();
        } else {

            int contagem = parametroDois - parametroUM;

            //realizar o for para imprimir os numeros com base na variável contagem
            for (int i = 1; i <= contagem; i++) {

                System.out.println("Imprimindo o número " + i);

            }
        }

    }
}
