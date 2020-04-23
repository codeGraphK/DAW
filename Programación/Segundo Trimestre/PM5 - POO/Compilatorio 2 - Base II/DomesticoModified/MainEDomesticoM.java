public class MainEDomesticoM {

    public static void main(String[] args) {
        
        EDomesticoM dom1, dom2;

        dom1 = new EDomesticoM("Nevera", 8000);
        dom2 = new EDomesticoM("Horno", 3500);
        
        /* Interruptores Doméstico 1
        
        dom1.setApagar("Apagar");
        
        */
        
        dom1.setEncender("Encender");
        dom1.setEncender("Encender");
        /* Interruptores Doméstico 2
        
        dom2.setApagar("Apagar");
        
        */
        dom2.setEncender("Encender");
        
        // Resultado
        System.out.println("------------------------");
        System.out.println("Electrodoméstico 1:");
        System.out.println(dom1.getTipo());
        System.out.println(dom1.getPotencia());
        System.out.println(dom1.getEncendido());

        System.out.println("------------------------");
        System.out.println("Electrodoméstico 2:");
        System.out.println(dom2.getTipo());
        System.out.println(dom2.getPotencia());
        System.out.println(dom2.getEncendido());
        
        System.out.println("------------------------");
        System.out.println(EDomesticoM.getSumPot());

    }

}