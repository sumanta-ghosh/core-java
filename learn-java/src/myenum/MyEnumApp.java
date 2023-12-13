package myenum;

public class MyEnumApp {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.SUNDAY;
        System.out.println(day);
        System.out.println(DaysOfTheWeek.TUESDAY + " ==> " + DaysOfTheWeek.TUESDAY.ordinal());
        System.out.println("==============");
        for (DaysOfTheWeek d : DaysOfTheWeek.values()) {
            System.out.println(d);
        }

        //Cereals enum
        System.out.println(Cereals.REESES_PUFFS.levelOfDeliciousness);

    }
}
