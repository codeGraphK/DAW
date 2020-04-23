/**
 * mainRecursos
 */
public class mainRecursos {

    public static void main(String[] args) {
        Empleado emp1 = new Jefe("888888K", "Diego", "Rodrígues", 2000);
        Empleado emp2 = new Jefe("888888K", "Diego", "Rodrígues", 2000);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp2.equals(emp1));
    }
}