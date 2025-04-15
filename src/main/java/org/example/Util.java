package org.example;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Util {
    public Scanner scanner = new Scanner(System.in);
    private int defineQuantidadeDecimaisParaFormatar() {
        try {
            System.out.print("Defina uma quantidade de números decimais para formatar: ");
            return scanner.nextInt();
        } catch (Exception ex) {
            System.out.println("Erro ao ler a quantidade.");
        }
        return 0;
    }
    private List<Double> receberValoresDecimais(int quantidade) {
        List<Double> listaValoresDecimais = new ArrayList<>();
        try {
            for (int i = 1; i <= quantidade; i++) {
                System.out.print(i + "o número: ");
                listaValoresDecimais.add(scanner.nextDouble());
            }
        } catch (Exception ex) {
            System.out.println("Erro ao receber os valores.");
        }
        return listaValoresDecimais;
    }
    public void formatar() {
        List<Double> listaValores = receberValoresDecimais(defineQuantidadeDecimaisParaFormatar());
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        try {
            simbolos.setDecimalSeparator('.');
            DecimalFormat formato = new DecimalFormat("#.##", simbolos);
            for (double valor : listaValores) {
                String valorFormatado = formato.format(valor);
                System.out.println("ValorFormatado: " + valorFormatado);
            }
        }catch (Exception ex) {
            System.out.println("Erro ao formatar os valores.");
        }
    }
}
