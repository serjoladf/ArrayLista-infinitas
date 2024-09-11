import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] number1 = new int[]{1,2,3,4};
        int[] number2 = new int[]{1,2,3,4};
        System.out.println(number1 == number2);
        System.out.println(number1.equals(number2));
        System.out.println(number1+" "+number2); // Comaparação HschCode
        System.out.println(Arrays.toString(number1).equals(Arrays.toString(number2)));  // Formato correto de comparar dois Arrays correto
        System.out.println(Arrays.toString(number1) == Arrays.toString(number2)); // Formato correto de comparar dois Arrays errado

    }
}