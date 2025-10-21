package Ativ_fix_LG_06A_loop;
public class Atividade_K_ {
    static void main() {
        for (int numero = 1; numero <= 10; numero++) {
            if (numero % 2 != 0) {
                long impar = 1;
                for (int contador = 1; contador <= numero; contador++) {
                    impar *= contador;
                }
                System.out.println(numero + "! = " + impar);
            }
        }
    }
}