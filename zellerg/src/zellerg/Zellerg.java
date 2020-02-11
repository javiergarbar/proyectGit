
package zellerg;

/**
 *
 * @author javiergarbar
 */
public class Zellerg {

   
    public static void main(String[] args) {
      int d=Zellerg(24, 5, 2001);
      String[] dias = new String[]{"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        System.out.println(dias[d]);
        System.out.println(d);
       
        //modificamos el programa para visualizar el dia Lunes, Martes...
    }
    private static int Zellerg(int Day, int Month, int Year){
        int Zeller;
        Month = (Month + 10) % 12;
        Year = Year - 1 * ((Month > 10)?1:0);
        Zeller = (13 * Month -1) / 5 + 1 + Year % 100 + (Year %100) /4 + (-2 * (Year / 100)) + (Year / 400) % 7;
        Zeller = ((Zeller + Day) % 7 + 6) % 7;
       
            return Zeller;
}
}
