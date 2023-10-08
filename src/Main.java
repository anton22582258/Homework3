public class Main {
    public static void main(String[] args) {
        // Задача 1
        int a = 123456;
        byte b = 53;
        short c =2456;
        long d = 357474866L;
        float e = 3.75f;
        double f = 5.89345;
        System.out.println(" Значение переменной " + " a " + " с типом " + " int " + " равно " + a);
        System.out.println(" Значение переменной " + " b " + " с типом " + " byte " + " равно " + b);
        System.out.println(" Значение переменной " + " c " + " с типом " + " short " + " равно " + c);
        System.out.println(" Значение переменной " + " d " + " с типом " + " long " + " равно " + d);
        System.out.println(" Значение переменной " + " e " + " с типом " + " float " + " равно " + e);
        System.out.println(" Значение переменной " + " f " + " с типом " + " double " + " равно " + f);
         // Задача 2
        float k = 27.12f;
        long l = 987678965549L;
        double m = 2.786;
        short n = -159;
        short o = 27897;
        byte p = 67;
        // Задача 3
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 39;
        int children;
        children = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        short list = 480;
        int listStudent = list / children;
        System.out.println(" На каждого ученика рассчитано " + listStudent + " листов бумаги ");
        // Задача 4
        String time = " 20 minutes ";
        String time1 = " 1 day ";
        String time2 = " 3 days ";
        String time3 = " 1 month ";
        int bottle = 16 / 2;
        bottle = bottle * 20;
        System.out.println( " За " + time + " машина произвела " + ( bottle ) + " штук бутылок ");
        bottle = bottle * 3 * 24;
        System.out.println( " За " + time1 + " машина произвела " + ( bottle ) + " штук бутылок ");
        bottle = bottle * 3;
        System.out.println( " За " + time2 + " машина произвела " + ( bottle ) + " штук бутылок ");
        bottle = bottle * 10;
        System.out.println( " За " + time3 + " машина произвела " + ( bottle ) + " штук бутылок ");
        // Задача 5
        int whiteJar, brownJar, total, classes;
        total = 120;
        whiteJar = 2;
        brownJar = 4;
        classes = total / ( whiteJar + brownJar );
        whiteJar = whiteJar * classes;
        brownJar = brownJar * classes;
        System.out.println( " В школе, где " + classes + " классов, нужно " + whiteJar +
                " банок белой краски и " + brownJar + " банок коричневой краски ");
        // Задача 6
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short egges = 4 * 70;
        short totalInGrams = ( short ) ( bananas + milk + iceCream + egges);
        System.out.println( totalInGrams );
        System.out.println( totalInGrams / 1000.0 );
        // Задача 7
        short dayMin = ( short ) ( 7 * 1000 / 250 );
        short dayMax = ( short ) ( 7 * 1000 / 500 );
        short dayAver = ( short ) ( ( dayMin * dayMax ) / 2 );
        System.out.println( dayAver );
        // Задача 8
        int mash = 67760;
        int denis = 83690;
        int krist = 76230;
        int newMash = ( int ) ( mash * 1.1 );
        int newDenis = ( int ) ( denis * 1.1 );
        int newKrist = ( int ) ( krist * 1.1 );
        int difMash = ( newMash - mash ) * 12;
        int difDenis = ( newDenis - denis ) * 12;
        int difKrist = ( newKrist - krist ) * 12;
        System.out.println( " Маша теперь получает " + newMash + " рублей . Годовой доход вырос на "
        + ( newMash - mash ) + " рублей. " );
        System.out.println( " Денис теперь получает " + newDenis + " рублей . Годовой доход вырос на "
        + ( newDenis - denis ) + " рублей. " );
        System.out.println( " Кристина теперь получает " + newKrist + " рублей . Годовой доход вырос на "
        + ( newKrist - krist ) + " рублей. " );







        }


}