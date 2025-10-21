package Ativ_fix_LG_06A_loop;
import java.util.Scanner;
public class Atividade_I_ {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a quantidade de termos desejados:");
        int numeroTotal=sc.nextInt();
        int numero1 =0;
        int numero2 =1;
        for (int contador=0;contador<=15;contador++) {
            System.out.println(numero1+"");
            int seguencia=numero1+numero2;
            numero1=numero2;
            numero2=seguencia;
        }
    }
}