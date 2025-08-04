
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author info2
 */
public class Subtracao {
    public static void main(String[] args) {
        Entradas.getInput();

        int numero1 = Entradas.getN1();
        int numero2 = Entradas.getN2();

        int resultado = numero1 - numero2;

        System.out.println("A subtraçãos é: " + resultado);
    }
}
