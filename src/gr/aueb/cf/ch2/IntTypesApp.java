package gr.aueb.cf.ch2;

/**
 * Εμφανιζει τυπους δεδομενων
 */
public class IntTypesApp {
    public static void main(String[] args) {
        System.out.printf("Type : %s ,\t Size : %d bits ,\t Min : %,d ,\t\t\t\t Max : %,d\n",
                Integer.TYPE, Integer.SIZE * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type : %s ,\t Size : %d bits ,\t Min : %d ,\t\t\t\t\t\t Max : %d\n",
                Byte.TYPE, Byte.SIZE * 8 , Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type : %s ,\t Size : %d bits ,\t Min : %d ,\t\t\t\t\t\t Max : %d\n",
                Short.TYPE, Short.SIZE * 8 , Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type : %s ,\t Size : %d bits ,\t Min : %,d ,\t Max : %,d\n",
                Long.TYPE, Long.SIZE * 8 , Long.MIN_VALUE, Long.MAX_VALUE);
      }
}
