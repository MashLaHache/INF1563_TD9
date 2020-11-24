package TDS_INF1563;

class Main {
    public static void main(String[] args) {
        // création d'un LFSR
        LFSR lfsr = new LFSR();
        // affichage de son état interne

        //Test 1.6
        for (int i =0; i<20; i++) {
            System.out.println(lfsr.nextInt());
        }
        //Test 1.3
        System.out.println(lfsr);
        lfsr.decalerRegistre();
        System.out.println(lfsr);
        lfsr.decalerRegistre();
        System.out.println(lfsr);
        lfsr.decalerRegistre();
        System.out.println(lfsr);
        lfsr.decalerRegistre();
        System.out.println(lfsr);


        // Partie II: cryptographie
        String msg = "CECI EST UN MESSAGE SECRET";

        System.out.println("message en clair:"+msg);
        System.out.println("------------");
        String codage = encoder(msg);
        System.out.println("message codé:"+codage);
        System.out.println("------------");
        String decodage = decoder(codage);
        System.out.println("message décodé:"+decodage);

    }

    //"Cesar cypher": on décale tous les caractères d'un nombre fixe de positions
    public static String encoder(String message) {

        LFSR lfsr = new LFSR();

        char[] entree = message.toCharArray();
        char[] sortie = new char[entree.length];
        for (int i=0;i<entree.length; i++) {
            sortie[i] = (char)(entree[i] + lfsr.nextInt()); // decaler de 3 positions
        }
        return new String(sortie);
    }

    // 2.2
    public static String decoder(String cypher) {
        LFSR lfsr = new LFSR();

        char[] entree = cypher.toCharArray();
        char[] sortie = new char[entree.length];
        for (int i=0;i<entree.length; i++) {
            // décalage inverse
            sortie[i] = (char)(entree[i] - lfsr.nextInt());
        }
        return new String(sortie);
    }
}
