import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            arrayList.add(sc.nextLine());
        }
        Collections.sort(arrayList);

        System.out.println(arrayList);


    }
}
