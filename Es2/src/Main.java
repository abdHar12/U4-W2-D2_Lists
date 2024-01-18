import java.util.*;

public class Main {
    static List<Integer> createArray(int num){
        List<Integer>array= new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Random rand = new Random();
            Integer randInt = rand.nextInt(100);
            array.add(randInt);
        }
        Collections.sort(array);
        return array;
    }
    static List<Integer> arrayAddedReverse(List<Integer> arr){
        List<Integer> copy=new ArrayList<>(arr);
        Collections.reverse(arr);
        copy.addAll(arr);
        return copy;
    }

    static void printOddEven(List<Integer> arr, boolean bool){
        List<Integer> oddNumbers =new ArrayList<>();
        List<Integer> evenNumbers =new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (bool) {
                if(arr.get(i)%2==0) evenNumbers.add(arr.get(i));
            } else {
                if(arr.get(i)%2!=0) oddNumbers.add(arr.get(i));
            }
        }
        System.out.println(bool ? "Numeri pari: " + evenNumbers : "Numeri dispari: " + oddNumbers);
    }

    public static void main(String[] args) {
        boolean continueCycle=true;
        Scanner sc = new Scanner(System.in);
        int num=0;
        do{
            try {
                continueCycle = false;
                System.out.printf("Digita quanti numeri vuoi inserire: ");
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Devi inserire un numero!");
                continueCycle = true;
            }
        } while (continueCycle == true);

        List<Integer> list = new ArrayList<>(createArray(num));
        System.out.println(list);
        List<Integer> reverse = new ArrayList<>(arrayAddedReverse(list));
        System.out.println(reverse);
        printOddEven(reverse, false);
    }
}