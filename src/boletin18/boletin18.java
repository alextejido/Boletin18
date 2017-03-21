
package boletin18;


import java.util.Scanner;


public class boletin18 {

    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String nome, cont;
        Buzon email = new Buzon();

        Boolean comp = false;
        int opc;
        do {
            do {
                System.out.println("---MENU---\n1.Amosar Correos \n2.Cantidade \n3.Engadir \n4.Por ler \n5.Amosar 1º non leido \n6.Eliminar \n7.Sair");
                System.out.println("Introduce un numero del menu.");
                opc = sc.nextInt();
            } while (opc <= 7 && opc < 0);
            switch (opc) {
                case 1:
                    System.out.println("Amosar");
                    System.out.println("Introduce o correo que desexas amosar");
                    email.mostrar(sc.nextInt());
                    break;
                case 2:

                    System.out.println("Cantidade");
                    System.out.println(email.numeroDeCorreos());
                    break;

                case 3:
                    System.out.println("Introduce o nome do emisor");
                    nome = sc.next();
                    System.out.println("Introduce o contido da mensaxe");
                    cont = sc.next();
                    email.añadir(new Correo(nome, cont, false));
                    break;

                case 4:

                    System.out.println("Correos por ler");
                    System.out.println(email.porLer());
                    break;

                case 5:
                    System.out.println("Amosar 1º non leido");
                    System.out.println(email.amosarPrimeiroNonLeido());
                    break;

                case 6:
                    System.out.println("Eliminar");
                    System.out.println("Introduce o correo que desexas eliminar");
                    email.borrar(sc.nextInt());
                    break;

                case 7:
                    comp = true;
                    System.out.println("Saliendo del menu.");
                    break;
            }
        } while (comp == false);

    }

}
