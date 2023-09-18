import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        float[][] notas = {
            {8.0f, 9.0f, 8.6f, 9.2f, 7.0f},  // Notas de BigData
            {7.1f, 6.0f, 7.2f, 5.2f, 7.4f}   // Notas de Lógica de Programação
        };

        imprimirMedia(notas[0], "BigData");
        imprimirMedia(notas[1], "Lógica de Programação");
    }

    public static void imprimirMedia(float[] notas, String materia) {
        float suma = 0;
        for (float nota : notas) {
            suma += nota;
        }
        float media = suma / notas.length;
        System.out.println("Média em " + materia + ": " + media);
    }
}
