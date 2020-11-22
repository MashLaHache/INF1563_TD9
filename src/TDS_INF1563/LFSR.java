package TDS_INF1563;
import java.util.Arrays;

public class LFSR {

    //constantes
    public static final int [] VALEURINITIALE = {0,1,1,0,1,0,0,0,0,1,0};
    public static final int [] PUISSANCES2 = {1,2,4,8,16};
    //attribut
    private int[] registre;

    //constructeur
    public LFSR(){
        registre = new int[11];
        for (int i=0; i<registre.length; i++){
            registre[i] = VALEURINITIALE[i];
        }
    }

    //toString
    public String toString(){
        return Arrays.toString(registre);
    }

    //opération XOR: méthode de classe (statique)
    public static int xor(int op1, int op2) {
        if(op1 == op2)
            return 0;
        else
            return 1;
    }

    public void decalerRegistre() {

    }

}
