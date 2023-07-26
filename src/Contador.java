import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int paramUm = sc.nextInt();
        int paramDois = sc.nextInt();
        
    }

    static void contar(int parametroUm, int parametroDois){
        int contagem = parametroDois - parametroUm;

        for (int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
    }
}
