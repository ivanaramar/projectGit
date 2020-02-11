package ZellerG;
// @author diomarsillim

public class ZellerG {

    public static void main(String[] args) {
        // TODO code application logic here
        int d = ZellerG(22, 2, 2001);
        //modificamos el programa para visualizar Lunes Martes Miercoles...
        String[] arrayWeekDays = {"Sunday", "Monday", "Thursday", "Wednesday", "Tuesday", "Friday", "Saturday"};
        String dayWeek = (arrayWeekDays[d]);
        System.out.println(dayWeek);
        
        
    }

    private static int ZellerG(int Day, int Month, int Year) {
        int Zeller;
        Month = (Month + 10) % 12;
        Year = Year - 1 * ((Month > 10) ? 1 : 0);
        Zeller = (13 * Month - 1) / 5 + 1 + Year % 100 + (Year % 100) / 4 + (-2 * (Year / 100)) + (Year / 400) % 7;
        Zeller = ((Zeller + Day) % 7 + 6) % 7;
        return Zeller;

    }

}
