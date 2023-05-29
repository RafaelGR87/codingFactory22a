package gr.aueb.cf.ch3;

/**
 * Testing the XOR command
 */
public class XorTestApp {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int xor = 0;

        System.out.println("\tA\tB\tC\tD\tXOR");
        for (i=0 ; i<2 ; i++) {
            for (j=0 ; j<2 ; j++){
                for (k=0 ; k<2 ; k++){
                    for (l=0 ; l<2 ; l++){
                        //if ((i == 1)^(j == 1)^(k == 1)^(l == 1)) {
                        if (i + j + k + l == 1 ) {
                            xor = 1;}
                            else{
                                xor = 0;
                        }
                        System.out.printf("\t%d\t%d\t%d\t%d\t%d\n" , i, j, k, l, xor);
                    }
                }
            }
        }
    }
}
