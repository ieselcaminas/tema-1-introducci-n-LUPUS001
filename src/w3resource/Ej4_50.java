package w3resource;

public class Ej4_50 {
    public static void main(String[] args) {
        String res3 ="";
        String res5 ="";
        String res35 ="";
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res35 = res35 + i + ", ";
            } else if (i % 3 == 0){
                res3 = res3 + i + ", ";
            } else if (i % 5 == 0){
                res5 = res5 + i + ", ";
            }
        }

        System.out.println("Divisibles por 3");
        System.out.println(res3);
        System.out.println("Divisibles por 5");
        System.out.println(res5);
        System.out.println("Divisibles por 3 y 5");
        System.out.println(res35);
    }
}
//https://www.w3resource.com/java-exercises/basic/index.php