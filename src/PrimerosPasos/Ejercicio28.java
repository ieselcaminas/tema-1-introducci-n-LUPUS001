package PrimerosPasos;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

public class Ejercicio28 {
    public static void main(String[] args) {
        String sc = JOptionPane.showInputDialog("Dame un número");
        int num = Integer.parseInt(sc);
        boolean primo = true;

        if(num == 2){
            System.out.println("Es primo");
        } else{
            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                    primo = false;
                    break;
                }
            }
        }

        if (primo){
            System.out.println("Es primo");
        } else{
            System.out.println("No es primo");
        }


    }
}