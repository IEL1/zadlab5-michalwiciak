package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    private static void zadanie3() {
        Scanner in = new Scanner(System.in);

        System.out.print("Podaj rozmiar stosu: ");
        int rozmiarStosu = in.nextInt();
        Stos stos = new Stos(rozmiarStosu);
        stos.menu();
    }

    private static void zadanie5() {
        Firma company1 = new Firma();
        company1.menu();
    }

    private static void zadanie6() {
        Zad6 zad6 = new Zad6();
        zad6.menu();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int menu = 1;

        while (menu != 0) {
            System.out.println("3. Zadanie 3");
            System.out.println("5. Zadanie 5");
            System.out.println("6. Zadanie 6");
            System.out.println("0. Wyjscie");
            menu = in.nextInt();

            switch (menu) {
                case 3:
                    zadanie3();
                    break;
                case 5:
                    zadanie5();
                    break;
                case 6:
                    zadanie6();
                    break;
                case 0:
                    break;
            }
        }
    }

}
