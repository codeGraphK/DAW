public class MainEDomestico {

    public static void main(String[] args) {
        
        EDomestico dom1, dom2;

        dom1 = new EDomestico("Nevera", 8000);
        dom2 = new EDomestico("Horno", 3500);
        
        /* Interruptores Doméstico 1
        
        dom1.setEncender("Encender");
        dom1.setApagar("Apagar");
        
        */

        /* Interruptores Doméstico 2

        dom2.setEncender("Encender");
        dom2.setApagar("Apagar");

        */

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

    }

}