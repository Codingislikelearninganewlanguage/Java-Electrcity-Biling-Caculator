import java.util.*;
public class Main {
    public static void main(String[] args) {
        var userinput = new Scanner(System.in);
        System.out.println("Cost per watt");
        var costperwatt = userinput.nextInt();
        System.out.println("Average Usage Of Electrcity in house(mesaured in watts)");
        int dayusage = userinput.nextInt();
        double usage = 0.010*dayusage*30;
        System.out.println("Okay that will be "+ usage);
    }
}
