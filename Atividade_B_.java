package Ativ_fix_LG_06A_loop;
import java.util.Scanner;
public class Atividade_B_ {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o número que será multiplicado:");
        int numero=sc.nextInt();
        int resultado;

        for (int contador=1;contador<=10 ;contador++) {
            resultado=contador*numero;
            System.out.println("O resultado de " + contador + " * " + numero + " será: " + resultado);
        }
    }
}
