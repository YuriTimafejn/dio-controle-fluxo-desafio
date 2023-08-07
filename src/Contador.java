import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.err.println(exception.getMessage());
        }
    }

    private static void contar(int parametroUm, int parametroDois) {
        int contagem = parametroDois - parametroUm;

        if(contagem <= 0) {
            throw new ParametrosInvalidosException("O parâmetro dois deve ser maior que o primeiro parâmetro");
        }

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
