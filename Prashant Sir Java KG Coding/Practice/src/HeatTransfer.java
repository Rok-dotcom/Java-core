import java.util.Scanner;
class HeatTransfer {
    public static void main(String[] args) {

        System.out.println("-----Student Information-----");

        System.out.println("Name     : Ramesh Shivaji Koli \n" +
                           "class    : T.Y.B.TECH \n" +
                           "Div      : B\n" +
                           "Roll no. : 28 \n");
        System.out.println("Welcome to the program of Finding Thermal Conductivity of Composite wall\n");

        double T1, T2, T3, T4, T5, T6, T7, T8, TA, TB, TC, TD;
        double L1, L2, L3, Lt, V, A, d, q, Rth, I, K, Q, Ri, Ro;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter voltage (in volts): ");
        V = in.nextFloat();

        System.out.print("Enter current (in Ampere): ");
        I = in.nextFloat();

        Q = (V * I);
        System.out.println("Heat input (in Watts) = " + Q);

        System.out.print("Enter the value of diameter of plates (in meter) d: ");
        d = in.nextFloat();

        A = (3.14 * d * d) / 4;
        q = ((Q / 2) / A);
        System.out.println("The heat transfer rate (in W/m²) = " + q);

        System.out.print("Enter the thickness of mild steel plate (in Meter) L1: ");
        L1 = in.nextFloat();

        System.out.print("Enter the thickness of Bakelite plate (in Meter) L2: ");
        L2 = in.nextFloat();

        System.out.print("Enter the thickness of Wooden plate (in Meter) L3: ");
        L3 = in.nextFloat();

        Lt = (L1 + L2 + L3);
        System.out.println("The total Composite wall thickness (in Meter) Lt = " + Lt);

        System.out.println("Enter the Thermocouple temperatures (in degC): ");
        System.out.print("Enter T1: ");
        T1 = in.nextFloat();
        System.out.print("Enter T2: ");
        T2 = in.nextFloat();
        System.out.print("Enter T3: ");
        T3 = in.nextFloat();
        System.out.print("Enter T4: ");
        T4 = in.nextFloat();
        System.out.print("Enter T5: ");
        T5 = in.nextFloat();
        System.out.print("Enter T6: ");
        T6 = in.nextFloat();
        System.out.print("Enter T7: ");
        T7 = in.nextFloat();
        System.out.print("Enter T8: ");
        T8 = in.nextFloat();

        TA = (T1 + T2) / 2;
        System.out.println("Average Temp. TA (in degC) = " + TA);

        TB = (T3 + T4) / 2;
        System.out.println("Average Temp. TB (in degC) = " + TB);

        TC = (T5 + T6) / 2;
        System.out.println("Average Temp. TC (in degC) = " + TC);

        TD = (T7 + T8) / 2;
        System.out.println("Average Temp. TD (in degC) = " + TD);

        Rth = (TA - TD) / (Q / 2);
        System.out.printf("The thermal resistance of Composite slab Rth = %.5f K/W", Rth);
        K = (q * Lt) / (TA - TD);
        System.out.printf("The thermal conductivity of Composite slab K = %.5f W/m.degC", K);

        in.close();
    }
}