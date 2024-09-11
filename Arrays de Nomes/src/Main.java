import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];

        Arrays.fill(nomes,"Desconhecido");
        System.out.println(Arrays.toString(nomes));

        for(int i = 0;i< nomes.length;i++){
            System.out.println("Digite nome: "+ i);
           nomes[i] = sc.nextLine();
        }
        for(int i = 0;i< nomes.length;i++) {
            System.out.println(nomes[i]);
        }
    }
}