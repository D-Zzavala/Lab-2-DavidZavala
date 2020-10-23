/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2.davidzavala;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 50431
 */
public class Lab2DAvidZavala {

    static Scanner read = new Scanner(System.in);
    static ArrayList<Detective> ADet = new ArrayList();

    public static void main(String[] args) {

        boolean FLAG = true;
        while (FLAG == true) {
            System.out.println("Lab 2");
            System.out.println("1. Detectives");
            System.out.println("2. Casos");
            System.out.println("0. Salir");
            System.out.print("Opcion:");
            int OP = read.nextInt();
            switch (OP) {
                case 1: {
                    boolean Flag = true;
                    while (Flag == true) {
                        System.out.println("Detectives");
                        System.out.println("A) Agregar");
                        System.out.println("B) Eliminar");
                        System.out.println("c) Modificar");
                        System.out.println("d) Listar");
                        System.out.println("X) Atrás");
                        System.out.print("Opción:");
                        char op = read.next().toLowerCase().charAt(0);
                        switch(op){
                            case 'a':{break;}
                            case 'b':{break;}
                            case 'c':{break;}
                            case 'd':{break;}
                            case 'x':{Flag=false;break;}
                            default: {System.out.println("Opción inválida"); break;}
                        }
                    }
                    break;
                }
                case 2: {
                    boolean Flag = true;
                    while (Flag == true) {
                        System.out.println("Casos");
                        System.out.println("A) Registrar");
                        System.out.println("B) Modificar");
                        System.out.println("c) Listar");
                        System.out.println("d) Listar casos resultos");
                        System.out.println("E) Listar casos pendientes");
                        System.out.println("X) Atrás");
                        System.out.print("Opción:");
                        char op = read.next().toLowerCase().charAt(0);
                        switch(op){
                            case 'a':{break;}
                            case 'b':{break;}
                            case 'c':{break;}
                            case 'd':{break;}
                            case 'e':{break;}
                            case 'x':{Flag=false;break;}
                            default: {System.out.println("Opción inválida"); break;}
                        }
                    }
                    break;
                }
                case 0: {
                    FLAG = false;
                    break;
                }
                default: {
                    System.out.println("Opción inválida");
                    break;
                }
            }
        }
    }

}
