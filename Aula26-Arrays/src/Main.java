public class Main {
    public static void main(String[] args) {
        User[] srg = new User[]{
                new User("Sergio", "Bispo", 42),
                new User("Marcelo","Silva",56)
        };

        for(int i = 0;i < srg.length; i++){
            System.out.println(srg[i]);
        }
        int[] numeros = {1,34,57,3,7,9,70,4};

        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for(int j = 0; j < numeros.length;j++){
            if (numeros[j] > maior){
                maior = numeros[j];
            }
            if (numeros[j] < menor){
                menor = numeros[j];
            }
            media = media + numeros[j];
        }

        System.out.println("Maior "+ maior);
        System.out.println("Menor "+ menor);
        System.out.println("Média "+ (double) media/numeros.length);
    }
}
    
