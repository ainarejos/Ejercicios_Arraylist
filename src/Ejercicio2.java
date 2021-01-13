import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ejercicio2 {
    public static void main(String[] args) {
        int n = 10 + (int)(Math.random()*10) ;
        int suma=0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i <=n ; i++) {
            arrayList.add((int)(Math.random()*100));
            suma=suma+(arrayList.get(i));
        }
        System.out.println(arrayList);
        System.out.println("suma:" + suma);
        System.out.println("Media: " + (suma/arrayList.size()));
        Collections.sort(arrayList);
        System.out.println("Minimo: " + arrayList.get(0));
        System.out.println("Maximo: " + arrayList.get(n));
    }
}
