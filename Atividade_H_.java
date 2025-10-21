package Ativ_fix_LG_06A_loop;
import java.util.Scanner;
public class Atividade_H_ {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a base:");
        int numero=sc.nextInt();
        int resultado;
        System.out.println("Digite a potencia:");
        int potencia=sc.nextInt();
        resultado=(int) Math.pow(numero,potencia);
        System.out.println("O resultado da conta será: " + resultado);
    }
}


