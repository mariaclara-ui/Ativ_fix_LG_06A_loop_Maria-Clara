package Ativ_fix_LG_06A_loop;

public class Atividade_D_ {
    static void main() {
        System.out.println("Hello world!");
        int contador=1;
        int resultado=0;
        while (contador<=500) {
            if(contador%2==0){
                resultado+=contador;
            }
            contador++;
            System.out.println("A soma dos números pares até 500 será:"+resultado);
        }
    }
}
