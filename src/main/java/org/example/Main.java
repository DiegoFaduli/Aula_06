package org.example;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitar a quantidade de valores a serem formatados
        System.out.println("Quantos valores decimais você deseja formatar? ");
        int quantidade = scanner.nextInt();

        //Configurar para o formato desejado
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        simbolos.setDecimalSeparator('.');
        DecimalFormat formatar = new DecimalFormat("#.##", simbolos);

        //Armazenar array com valores formatados
        String[] valoresFormatados = new String[quantidade];

        //Realizar leitura de valores e formatação
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o valor decimal (ex: 0,00) " + (i + 1) + ": ");
            double valor = scanner.nextDouble();
            valoresFormatados[i] = formatar.format(valor);
        }

        //Exibir os valores formatados no console
        System.out.println("\nValores formatados: ");
        for(String valorFormatado : valoresFormatados) {
            System.out.println(valorFormatado);
        }
        scanner.close();
    }
}