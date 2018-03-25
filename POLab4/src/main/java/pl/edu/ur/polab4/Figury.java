package pl.edu.ur.polab4;
import java.util.Scanner;

                public class Figury {
               

       
    
    
    
    public static void main(String[] args) {
        // TODO zad 4, 5
        System.out.println("Wybierz numer oznaczajacy dana figure:\n"
                + "---------------------\n"
                + "1. Kolo\n"
                + "2. Kwadrat\n"
                + "3. Prostokat\n"
                + "4. Szescian\n"
                + "5. Prostopadloscian\n"
                + "6. Stozek\n"
                + "7. Kula\n"
                + "---------------------\n");
        Scanner scanner = new Scanner(System.in);
        int figura = scanner.nextInt();
        switch (figura){
            case 1:
                kolo kolo = new kolo();
                kolo.nazwa = "Kolo";
                System.out.println("Podaj promien kola: ");
                kolo.r = scanner.nextDouble();
                kolo.pole = kolo.pole(kolo.r);
                kolo.obwod = kolo.obwod(kolo.r);
                System.out.println();
                kolo.pokazDane();
                break;
            case 2:
                kwadrat kwadrat = new kwadrat();
                kwadrat.nazwa = "Kwadrat";
                System.out.println("Podaj dlugosc boku: ");
                kwadrat.a = scanner.nextDouble();
                kwadrat.pole = kwadrat.pole(kwadrat.a);
                kwadrat.obwod = kwadrat.obwod(kwadrat.a);
                System.out.println();
                kwadrat.pokazDane();
                break;
            case 3:
                prostokat prostokat = new prostokat();
                prostokat.nazwa = "Prostokat";
                System.out.println("Podaj dlugosc pierwszego boku: ");
                prostokat.bok = scanner.nextDouble();
                System.out.println("Podaj dlugosc drugiego boku: ");
                prostokat.bok2 = scanner.nextDouble();
                prostokat.pole = prostokat.pole(prostokat.bok, prostokat.bok2);
                prostokat.obw = prostokat.obw(prostokat.bok, prostokat.bok2);
                System.out.println();
                prostokat.pokazDane();
                break;
            case 4:
                szescian szescian = new szescian();
                szescian.nazwa = "Szescian";
                System.out.println("Podaj dlugosc boku a: ");
                szescian.a = scanner.nextDouble();
                szescian.pole = szescian.pole(szescian.a);
                szescian.obj = szescian.obj(szescian.a);
                System.out.println();
                szescian.pokazDane();
                break;
            case 5:
                prostopadloscian prostopadloscian = new prostopadloscian();
                prostopadloscian.nazwa = "Prostopadloscian";
                System.out.println("Podaj dlugosc boku: ");
                prostopadloscian.a = scanner.nextDouble();
                System.out.println("Podaj dlugosc drugiego boku: ");
                prostopadloscian.b = scanner.nextDouble();
                System.out.println("Podaj wysokosc: ");
                prostopadloscian.c = scanner.nextDouble();
                prostopadloscian.pole = prostopadloscian.pole(prostopadloscian.a, prostopadloscian.b, prostopadloscian.c);
                prostopadloscian.obj = prostopadloscian.obj(prostopadloscian.a, prostopadloscian.b, prostopadloscian.c);
                System.out.println();
                prostopadloscian.pokazDane();
                break;
            case 6:
                stozek stozek = new stozek();
                stozek.nazwa = "Stozek";
                System.out.println("Podaj promien stozka: ");
                stozek.r = scanner.nextDouble();
                System.out.println("Podaj dlugosc tworzacej stozka: ");
                stozek.l = scanner.nextDouble();
                System.out.println("Podaj wysokosc stozka: ");
                stozek.h = scanner.nextDouble();
                stozek.pole = stozek.pole(stozek.l, stozek.h);
                stozek.obj = stozek.obj(stozek.r, stozek.h);
                System.out.println();
                stozek.pokazDane();
                break;
            case 7:
                kula kula = new kula();
                kula.nazwa = "Kula";
                System.out.println("Podaj promien kuli: ");
                kula.r = scanner.nextDouble();
                kula.pole = kula.pole(kula.r);
                kula.obj = kula.obj(kula.r);
                System.out.println();
                kula.PokazDane();
                break;
            default:
                System.out.println("Nie ma figury o takim oznaczeniu");
                break;
        }
        
    }
    
}