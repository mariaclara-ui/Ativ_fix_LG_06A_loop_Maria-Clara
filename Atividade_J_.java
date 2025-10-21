package Ativ_fix_LG_06A_loop;
import java.util.Scanner;
public class Atividade_J_ {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura inicial em Celcius:");
        int celcius=sc.nextInt();
        System.out.println("Digite a temperatura final em Celcius:");
        int celciusF=sc.nextInt();
        while (celcius<=celciusF) {
            double resultado;
            resultado=(celcius*1.8)+32;
            celcius+=10;
            System.out.println("O resultado em Fahrenheit será:"+resultado);
        }
    }
}
