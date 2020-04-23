public class PonerUltimoPrimero {
    public static void main(String[] args) {
        int[] iWiu = { 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        int Ward1 = iWiu[0], Ward2 = 0;

        int ultimo = iWiu[iWiu.length - 1];

        /*
         * for (int iCont = 0; iCont < iWiu.length - 1; iCont++) { if (iCont == 0) {
         * Ward1 = iWiu[iCont + 1]; iWiu[iCont + 1] = iWiu[iCont]; iWiu[iCont] =
         * iWiu[iWiu.length - 1]; } else { Ward2 = iWiu[iCont + 1]; iWiu[iCont + 1] =
         * Ward1; Ward1 = Ward2; } }
         */

        for (int iCont = 1; iCont < iWiu.length; iCont++) {
            /*
             * if (iCont == 0) { Ward1 = iWiu[iCont + 1]; iWiu[iCont + 1] = iWiu[iCont];
             * iWiu[iCont] = iWiu[iWiu.length - 1]; } else {
             */
            Ward2 = iWiu[iCont];
            iWiu[iCont] = Ward1;
            Ward1 = Ward2;
            // }
        }

        iWiu[0] = ultimo;

        for (int i : iWiu) {
            System.out.print(i + " ");
        }
    }
}