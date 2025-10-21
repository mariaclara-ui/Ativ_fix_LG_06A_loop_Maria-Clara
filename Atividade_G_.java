package Ativ_fix_LG_06A_loop;

public class Atividade_G_ {
    static void main() {
        int numero=3;
        int resultado;

        for (int contador=1;contador<=15 ;contador++) {
            resultado=(int) Math.pow(numero,contador);
            System.out.println("O resultado de 3 elevado á " + contador + " será: " + resultado);
        }
    }
}
