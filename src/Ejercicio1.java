import java.util.ArrayList;
class Alumno{
    private String nombre;
    private String apellido1;
    private String apellido2;
    public Alumno(String a, String b, String c){
        this.nombre=a;
        this.apellido1=b;
        this.apellido2=c;
    };

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                '}';
    }
}
public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Alumno> Alumnos = new ArrayList<Alumno>();
        Alumnos.add(new Alumno("Joshua", "Mars", "Mayers"));
        Alumnos.add(new Alumno("Adan", "Inarejos", "Palma"));
        Alumnos.add(new Alumno("Carlos", "Pomares", "Parpal"));
        Alumnos.add(new Alumno("Ivan", "Boshc", "Amengual"));
        Alumnos.add(new Alumno("Ismael", "Martin", "Fernandez"));
        Alumnos.add(new Alumno("Diego", "Matas", "Fulanito"));

        System.out.println("Lista de Alumnos: ");


        for (Alumno c : Alumnos) {
            System.out.println(c.toString());
        }
    }


}
