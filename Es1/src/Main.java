import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean continueCycle=true;
        Scanner sc = new Scanner(System.in);
        int num=0;
        do{
            try {
                continueCycle = false;
                System.out.printf("Digita quante parole vuoi inserire: ");
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Devi inserire un numero!");
                continueCycle = true;
            }
        }while (continueCycle==true);

        Set<String> singleWords=new HashSet<>();
        Set<String> duplicateWords=new HashSet<>();

        for (int i = 0; i < num; i++) {
            System.out.print("\nInserire la "+(i+1)+"a "+ "parola: ");
            String word= sc.next();
            if((singleWords.contains(word))){
                duplicateWords.add(word);
            }
            singleWords.add(word);
        }

        System.out.printf("Ecco le tue parole singole: ");
        System.out.println(singleWords);
        System.out.printf("Ecco le tue parole duplicate: ");
        System.out.println(duplicateWords);
        System.out.printf("Il numero delle tue parole distinte: ");
        System.out.println(singleWords.size());
    }
}