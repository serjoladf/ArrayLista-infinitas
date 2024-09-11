import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        for(int i =0;i<=20; i++){
            User atual = new User("Nome"+ i,"Sobrenom"+ i ,i+ 12);
            users.add(atual);
        }
            //System.out.println(users.toString());
        System.out.println(users.get(2).getFirstName()); // A estrutura com Get pra pegar a informação para imprimir
        System.out.println(users.get(2).getLastName());

        for(int i =0;i<=20; i++){
            System.out.println(users.get(i).getFirstName()); // A estrutura com Get pra pegar a informação para imprimir
            System.out.println(users.get(i).getLastName());
        }

    }
}