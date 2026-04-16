
import java.util.Arrays;
import java.util.List;

public class probasVsCode {

    private static final double PI = 3.14;

    public static void main(String[] args) {
        System.out.println("Bos dias");

        List<String> color = Arrays.asList("vermello", "laranxa", "verde");

        System.out.println(color.get(2));
        

        String[] libros = {"Don Quijote", "Crimen e castigo"};
        for (String e : libros) {
            System.out.println(e);
        }
    }

    public double getArea(double r){
        return PI * r * r;
    }

    
}
