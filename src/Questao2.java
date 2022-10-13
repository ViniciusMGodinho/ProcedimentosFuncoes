import java.util.*;
public class Questao2 {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);

        int numero1, numero2;
        System.out.println("Informe dois numero inteiros!");
        numero1 = Entrada.nextInt();
        numero2 = Entrada.nextInt();

        System.out.println("A soma dos dois numeros é: " + soma(numero1, numero2));
        System.out.println("A subtração dos dois numeros é: " + subtracao(numero1, numero2));
        System.out.println("A multiplicação dos numeros é: " + multiplicacao(numero1, numero2));

    }
    public static int soma (int n1, int n2){
        return n1 + n2;
    }

    public static int subtracao (int n1, int n2){
        if (n1 > n2){
            return n1-n2;
        }else {
            return n2 - n1;
        }
    }

    public static int multiplicacao ( int n1, int n2){
        int n0 = 0;
        for(int i = 1; i<=n2; i++){
            n0 = n0 + n1;
        }
        return n0;
    }
}