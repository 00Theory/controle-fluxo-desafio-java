import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int paramUm = sc.nextInt();
        int paramDois = sc.nextInt();
        try{
            contar(paramUm, paramDois);
        }
        catch(ParametrosInvalidosException e){
           System.out.printf("O segundo par\u00E2metro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        int contagem = parametroDois - parametroUm;

        for (int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }

        if (contagem < 1){
            throw new ParametrosInvalidosException();
        }
    }
}
