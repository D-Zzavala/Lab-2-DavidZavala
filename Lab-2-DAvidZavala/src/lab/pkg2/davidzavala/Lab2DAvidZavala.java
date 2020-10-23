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
    static ArrayList<Caso> ACas = new ArrayList();

    public static void main(String[] args) {

        boolean FLAG = true;
        while (FLAG == true) {
            System.out.println("Lab 2");
            System.out.println("1. Detectives");
            System.out.println("2. Casos");
            System.out.println("0. Salir");
            System.out.print("Opcion:");
            int OP = read.nextInt();
            System.out.println();
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
                        System.out.println();
                        switch (op) {
                            case 'a': {
                                CrearDet();
                                break;
                            }
                            case 'b': {
                                break;
                            }
                            case 'c': {
                                Print(ADet);
                                System.out.print("Elija el detective a Cargo: ");
                                int det = read.nextInt();
                                Detective Detectibe = null;
                                if (det < 0 || det > ADet.size()) {
                                    System.out.println("Detective inexistente");
                                    System.out.println("Intentelo nuevamente");
                                    Print(ADet);
                                    System.out.print("Elija el detective a Cargo: ");
                                    det = read.nextInt();
                                }
                                Detective dete = ADet.get(det);
                                ModDet(dete);
                                break;
                            }
                            case 'd': {
                                Print(ADet);
                                break;
                            }
                            case 'x': {
                                Flag = false;
                                break;
                            }
                            default: {
                                System.out.println("Opción inválida");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    if (ADet.isEmpty()) {
                        System.out.println("No hay detectives para asignar casos.");
                        System.out.println("Cree detectives antes de crear casos");
                    } else {
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

                            switch (op) {
                                case 'a': {
                                    break;
                                }
                                case 'b': {
                                    break;
                                }
                                case 'c': {
                                    break;
                                }
                                case 'd': {
                                    break;
                                }
                                case 'e': {
                                    break;
                                }
                                case 'x': {
                                    Flag = false;
                                    break;
                                }
                                default: {
                                    System.out.println("Opción inválida");
                                    break;
                                }
                            }
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

    //Metodos
    static Detective CrearDet() {
        System.out.print("Nombre:");
        String nombre = read.next();
        System.out.print("Edad:");
        int EDad = read.nextInt();
        System.out.print("Nacionalidad:");
        String nacionalidad = read.next();
        System.out.print("Experiencia:");
        int Experiencia = read.nextInt();
        System.out.print("Nivel:");
        int nivel = read.nextInt();
        if (nivel > 10 || nivel < 1) {
            System.out.print("Nivel:");
            nivel = read.nextInt();
        }
        return new Detective(nombre, EDad, nacionalidad, Experiencia, nivel);
    }

    static void ModDet(Detective det) {
        System.out.print("Nombre:");
        String nombre = read.next();
        System.out.print("Edad:");
        int EDad = read.nextInt();
        System.out.print("Nacionalidad:");
        String nacionalidad = read.next();
        System.out.print("Experiencia:");
        int Experiencia = read.nextInt();
        System.out.print("Nivel:");
        int nivel = read.nextInt();
        if (nivel > 10 || nivel < 1) {
            System.out.print("Nivel:");
            nivel = read.nextInt();
        }

        det.setNombre(nombre);
        det.setEdad(EDad);
        det.setNacionalidad(nacionalidad);
        det.setAños(Experiencia);
        det.setNivel(nivel);
    }

    static void DelDet(Detective det) {
        ArrayList<Caso> casostemp = new ArrayList();
        for (int i = 0; i < ADet.size(); i++) {
            if (ADet.get(i).equals(det)) {
                for (int j = 0; j < ADet.get(i).getCasos().size(); j++) {
                    casostemp.add(ADet.get(i).getCasos().get(j));
                }
                ADet.remove(ADet.get(i));
            }
        }
        for (int i = 0; i < casostemp.size(); i++) {
            if (casostemp.get(i).getTipo().toLowerCase().equals("homicidio")) {
                for (int j = 0; j < ADet.size(); j++) {
                    if (ADet.get(j).getNivel()) {

                    }
                }
            } else if (casostemp.get(i).getTipo().toLowerCase().equals("robo")) {

            } else if (casostemp.get(i).getTipo().toLowerCase().equals("secuestro")) {

            }
        }
    }

    static void SortNivel() {
        Detective temp;
        for (int i = 0; i < ADet.size(); i++) {
            if (i < ADet.size()) {
                if (ADet.get(i).getNivel() < ADet.get(i + 1).getNivel()) {
                    temp = ADet.get(i);
                    ADet.set(i, ADet.get(i + 1));
                    ADet.set(i + 1, temp);
                }
            }
        }
    }

    static Caso CrearCas() {
        System.out.print("Lugar: ");
        String lugar = read.next();
        System.out.print("Descripcion: ");
        String Descripcion = read.nextLine();
        Descripcion = read.nextLine();
        System.out.print("Tipo\n1. Homicidio 2. Robo 3.Secuestro: ");
        int op = read.nextInt();
        String Tipo = null;
        switch (op) {
            case 1:
                Tipo = "Homicidio";
                break;
            case 2:
                Tipo = "Robo";
                break;
            case 3:
                Tipo = "Secuestro";
                break;
            default:
        }
        System.out.print("Estado\n1. En Proceso 2. Resuelto: ");
        int oop = read.nextInt();
        String Estado = null;
        switch (oop) {
            case 1:
                Estado = "En Proceso";
                break;
            case 2:
                Estado = "Resuelto";
                break;
            default:
        }
        Print(ADet);
        System.out.print("Elija el detective a Cargo: ");
        int det = read.nextInt();
        Detective Detectibe = null;
        if (det < 0 || det > ADet.size()) {
            System.out.println("Detective inexistente");
            System.out.println("Intentelo nuevamente");
            Print(ADet);
            System.out.print("Elija el detective a Cargo: ");
            det = read.nextInt();
        }
        Detectibe = ADet.get(det);
        Caso cas = new Caso(lugar, Descripcion, Tipo, Detectibe, Estado);
        Detectibe.getCasos().add(cas);
        return cas;
    }

    static void ModCas(Caso casso) {
        System.out.print("Lugar: ");
        String lugar = read.next();
        System.out.print("Descripcion: ");
        String Descripcion = read.nextLine();
        Descripcion = read.nextLine();
        System.out.print("Tipo\n1. Homicidio 2. Robo 3.Secuestro: ");
        int op = read.nextInt();
        String Tipo = null;
        switch (op) {
            case 1:
                Tipo = "Homicidio";
                break;
            case 2:
                Tipo = "Robo";
                break;
            case 3:
                Tipo = "Secuestro";
                break;
            default:
        }
        System.out.print("Estado\n1. En Proceso 2. Resuelto: ");
        int oop = read.nextInt();
        String Estado = null;
        switch (oop) {
            case 1:
                Estado = "En Proceso";
                break;
            case 2:
                Estado = "Resuelto";
                break;
            default:
        }
        Print(ADet);
        casso.setDescripción(Descripcion);
        casso.setEstado(Estado);
        casso.setLugar(lugar);
        casso.setTipo(Tipo);
    }

    static void DelCas(Caso casso) {
        //Estos ciclos Eliminan el caso del Detective encargado
        for (int i = 0; i < ADet.size(); i++) { //Recorremos los detectives
            if (casso.getDetectibe().equals(ADet.get(i))) { //Encontramos el detective
                for (int j = 0; j < ADet.get(i).getCasos().size(); j++) { //Recorremos los casos del Detective
                    if (ADet.get(i).getCasos().get(j).equals(casso)) { //Econtramos el caso que está siendo eliminado
                        ADet.get(i).getCasos().remove(ADet.get(i).getCasos().get(j)); //Lo eliminamos de lso casos del detective
                    }
                }
            }
        }
        for (int i = 0; i < ACas.size(); i++) { //Se elimina el caso del historial de los casos
            if (ACas.get(i).equals(i)) {
                ACas.remove(ACas.get(i));
            }
        }
    }

    static void Print(ArrayList Array) {
        for (int i = 0; i < Array.size(); i++) {
            System.out.println("{" + i + "} [" + Array.get(i) + "]");

        }
    }

}
