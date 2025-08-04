
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author info2
 */
public class Entradas {
    private static int n1;
    private static int n2;
    
    public static void getInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero 1: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o numero 2: ");
        n2 = scanner.nextInt();
    }

    public static int getN1() {
        return n1;
    }

    public static int getN2() {
        return n2;
    }

}
