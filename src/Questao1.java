import java.util.Scanner;

 public class Questao1 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Escolha a questão A-E");
        System.out.println("---------------------------");
        String choose = Entrada.next();

        switch (choose) {
            case "a":
                // 1.a
                int numero1a;

                System.out.println("Informe um numero: ");
                numero1a = Entrada.nextInt();

                System.out.println("---------------------------");
                System.out.println("O dobro do numero é: " + dobro(numero1a));
                System.out.println("============================");
                break;
            case "b":
                // 1.b
                int numero1b, numero2b;

                System.out.println("Informe dois numeros");
                numero1b = Entrada.nextInt();
                numero2b = Entrada.nextInt();

                System.out.println("---------------------------");
                System.out.println("O maior é: " + maior(numero1b, numero2b));
                System.out.println("============================");
                break;
            case "c":
                // 1.c
                double numero1c, numero2c;

                System.out.println("Informe dois numeros:");
                numero1c = Entrada.nextDouble();
                numero2c = Entrada.nextDouble();

                System.out.println("---------------------------");
                System.out.println("A média é : " + media(numero1c, numero2c));
                System.out.println("============================");
                break;
            case "d":
                // 1.d
                int numero1d;

                System.out.println("Informe um numero:");
                numero1d = Entrada.nextInt();

                System.out.println("---------------------------");
                System.out.println("O fatorial do numero é: " + fatorial(numero1d));
                System.out.println("============================");
                break;
            case "e":
                // 1.e
                int numero1e;

                System.out.println("Informe um numero:");
                numero1e = Entrada.nextInt();

                System.out.println("---------------------------");
                System.out.println("A soma dos numeros entre 1 e o numero informado é: " + somaE(numero1e));
                System.out.println("============================");
                break;
        }
    }

    public static int dobro(int dobro) {
        return dobro * 2;
    }

    public static int maior(int n1, int n2) {
        return Math.max(n1, n2);

    }

    public static double media(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public static int fatorial(int n1) {
        for (int i = n1; i >= 1; i--) {
            n1 = i * n1;
        }
        return n1;
    }

    public static int somaE(int n1) {
        int n0 = 0;
        for (int i = 0; i <= n1; i++) {
            n0 = i + n0;
        }
        return n0;
    }
}