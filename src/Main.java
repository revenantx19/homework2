public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задача1");
        int a1 = 2147483647;
        byte a2 = 127;
        short a3 = 32767;
        long a4 = 1L;
        float a5 = 4.5f;
        double a6 = 4.5;
        System.out.println("Значение переменно а1 с типом int равно "+a1);
        System.out.println("Значение переменно а2 с типом int равно "+a2);
        System.out.println("Значение переменно а3 с типом int равно "+a3);
        System.out.println("Значение переменно а4 с типом int равно "+a4);
        System.out.println("Значение переменно а5 с типом int равно "+a5);
        System.out.println("Значение переменно а6 с типом int равно "+a6 + "\nЗадача2");
        //task2
        float b1 = 27.12f;
        long b2 = 987_678_965_549L;
        float b3 = 2.786f;
        short b4 = 569;
        short b5 = -159;
        int b6 = 27897;
        byte b7 = 67;
        //task3
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        System.out.println("На каждого ученика рассчитано " + 480/(lp+as+ea) + " листов бумаги\nЗадача4");
        //task4
        byte proizv = 8; //8 бутылок за 1 минуту
        System.out.println("За 20 минут машина произвела " + (20*proizv) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (24*60*proizv) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (24*60*3*proizv) + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + (24*60*30*proizv) + " штук бутылок\nЗадача5");
        //task5
        byte all = 120;
        byte white = 2;
        byte brown = 4;
        int classroom = all/(white+brown);
        System.out.println("В школе, где " + classroom + " классов, нужно " + classroom/white + " банок белой краски и " + classroom/brown + " банок коричневой краски\nЗадача6");
        //task6
        short banana = 400;
        short milk = 210;
        short icecream = 200;
        short egg = 280;
        float breakfast = (banana+milk+icecream+egg)/1000f;
        System.out.println("Вес завтрака " + (banana+milk+icecream+egg) + " грамм.");
        System.out.println("Вес завтрака " + breakfast + " килограмм.\nЗадача7");
        //task7
        short case1 = 250;
        short case2 = 500;
        System.out.println("При потере веса равной " + case1 + " грамм в день, уйдет на похудение " + (7000/case1) + " дней");
        System.out.println("При потере веса равной " + case2 + " грамм в день, уйдет на похудение " + (7000/case2) + " дней\nЗадача8");
        //task8
        int mary = 67760;
        int den = 83690;
        int cris = 76230;
        System.out.println("Маша теперь получает " + mary*1.1 + ". Годовой доход вырос на " + (mary*1.1-mary)*12 + " рублей");
        System.out.println("Денис теперь получает " + Math.ceil(den*1.1) + ". Годовой доход вырос на " + Math.ceil((den*1.1-den)*12) + " рублей");
        System.out.println("Кристина теперь получает " + cris*1.1 + ". Годовой доход вырос на " + (cris*1.1-cris)*12 + " рублей");
    }
}