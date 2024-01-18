import classe.Rubrica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String telefono = null;
        String name = null;
        Rubrica rubrica=new Rubrica();
        for (int i = 0; i < 3; i++) {
            System.out.printf("Inserire un nome: ");
            name = sc.nextLine();
            System.out.printf("Inserire un telefono: ");
            sc = new Scanner(System.in);
            telefono = sc.nextLine();
            rubrica.addTelNome(name, telefono);
        }
        System.out.println(rubrica.getAllContacts());
        System.out.printf("Inserire un nome da rimuovere: ");
        name = sc.nextLine();
        rubrica.removeTelNome(name);
        System.out.println(rubrica.getAllContacts());
        System.out.printf("Inserire un telefono di cui vuoi il nome: ");
        telefono = sc.nextLine();
        System.out.println(rubrica.findWithPhone(telefono));
        System.out.printf("Inserire un nome di cui vuoi il telefono: ");
        name = sc.nextLine();
        System.out.println(rubrica.findWithName(name));
    }
}