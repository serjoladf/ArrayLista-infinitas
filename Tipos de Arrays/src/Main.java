import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        // String[] nomes = new String[5]; Array Fixo com valor Determinado sem Inicicialização
        // int[] numeros = new String[]{2,3,6,8,9}; Array Fixo com valor Determinado com Inicicialização
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            int randomNumber = gerador.nextInt(100) + 1; // Gera um número inteiro aleatório de 1 a 100
            numbers.add(randomNumber); // Adiciona o número ao ArrayList
        }

        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)); // Imprimi a lista usando Get
        }
        // Buscar indice
        int index = numbers.indexOf(numbers.get(2));
        System.out.print(index);
        int indexz = (numbers.get(2));
        System.out.println("Numero "+indexz);

        // Verifica se a Lista esta vazia
        System.out.println(numbers.isEmpty());

        // Verifica o tamanho da Lista
        System.out.println(numbers.size());

        // Verifica se tem o elemetnto na Lista
        System.out.println(numbers.contains(numbers.get(2)));

        // Verifica se tem o elemento neste caso idice 1
        System.out.println(numbers.remove(numbers.get(1)));

        // Verifica limpar a Lista
        //numbers.clear(); // Limpa a Lista
        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)); // Imprimi a lista vazia
        }
    }
}