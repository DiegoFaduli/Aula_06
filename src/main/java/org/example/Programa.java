package org.example;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite o numero:");
        double valor = scanner.nextDouble();

        //Configura o simbolo decimal para o ponto
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        simbolos.setDecimalSeparator('.');

        //Aplica o formato desejado
        DecimalFormat formato = new DecimalFormat("#.##", simbolos);
        String valorFormatado = formato.format(valor);

        System.out.println("Valor formatado " + valorFormatado);
    }
}