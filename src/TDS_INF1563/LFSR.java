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
        //calculer valeur du nouveau bit genere
       int bitGenerer = xor(registre[0], registre[2]);
       //decaler tableau registre -1
        for(int i = 0; i < registre.length -1; i++) {
            registre[i] = registre[i+1];
        }
        registre[registre.length - 1] = bitGenerer;
    }

    public int nextBit() {
        decalerRegistre();
        return registre[registre.length-1];
    }

    public int nextInt() {

        int decimal = 0;
        int bitGen;

        for (int i =0; i < 5; i++) {
            bitGen = nextBit();
            decimal += bitGen * PUISSANCES2[i];


        }
        return decimal;
    }
}
