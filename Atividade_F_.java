package Ativ_fix_LG_06A_loop;

public class Atividade_F_ {
    static void main() {
        int contador=0;
        while (contador<=200) {
            if(contador%4==0){
                System.out.println("E necessario a verificação do sistema são "+contador+" minutos");
            }
            contador++;
        }
    }
}

