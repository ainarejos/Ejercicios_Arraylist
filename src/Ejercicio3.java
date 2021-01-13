import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);

    }

}
