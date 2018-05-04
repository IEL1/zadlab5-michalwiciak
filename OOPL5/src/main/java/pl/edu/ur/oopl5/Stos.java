/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author MICHAL
 */
public class Stos {

    private int stos[];
    private int wskaznik;

    public Stos(int rozmiarStosu) {
        stos = new int[rozmiarStosu];
        wskaznik = -1;
    }

    private boolean pop() {
        Scanner in = new Scanner(System.in);
        if (wskaznik >= 0) {
            stos[wskaznik] = 0;
            wskaznik--;
            System.out.println("Zrobione");
            return true;
        } else {
            System.out.println("Stos jest pusty, nie mozna sciagnac ze stosu");
            in.nextLine();
            return false;
        }
    }

    private boolean push() {
        Scanner in = new Scanner(System.in);

        if (wskaznik < stos.length - 1) {
            wskaznik++;
            System.out.print("Podaj wartosc do wprowadzenia na stos: ");
            int wskaznikNowaWartosc = in.nextInt();
            stos[wskaznik] = wskaznikNowaWartosc;
            System.out.println("Gotowe");
            return true;
        } else {
            System.out.println("Stos jest pelny, nie mozna dodac kolejnego elementu");
            in.nextLine();
            return false;
        }
    }

    private boolean zawartoscStosu() {
        Scanner in = new Scanner(System.in);
        if (wskaznik != -1) {
            System.out.println("\n-------");
            for (int i = 0; i <= stos.length - 1; i++) {
                System.out.println(stos[i]);
            }
            System.out.println("------\n");
            return true;
        } else {
            System.out.println("Stos jest pusty");
            in.nextLine();
            return false;
        }
    }

    public void menu() {
        Scanner in = new Scanner(System.in);
        int menu = 1;

        while (menu != 0) {
            System.out.println("1. Wkladanie \n2. Wyciaganie \n3. Zawartosc stosu\n0. Koniec programu");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    if (push()) {
                        System.out.println("Zrobione!");
                    } else {
                        System.out.print("Cos sie popsulo!");
                    }
                    break;
                case 2:
                    if (pop()) {
                        System.out.println("Zrobione!");
                    } else {
                        System.out.print("Cos sie popsulo!");
                    }
                    break;
                case 3:
                    if (zawartoscStosu()) {
                        System.out.println("Zrobione!");
                    } else {
                        System.out.print("Cos sie popsulo!");
                    }
                    break;
                case 0:
                    break;
            }
        }
    }

}
