public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int savings = 15000;
        int wholeAmount = 0;
        int month = 0;
        while (wholeAmount <= 2459000) {
            wholeAmount += savings;
            month++;
            System.out.print("Месяц " + month + "-й, сумма накопления равна - " + wholeAmount + " рублей. ");
        }
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        int j = 0;
        while (j < 10) {
            ++j;
            System.out.print(j + " ");
        }
        System.out.println();
        for (; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        //количество населения
        int totalPopulation = 12000000;
        //рождаемость в год на 1000 человек
        int birthrate = 17;
        //смертность в год на 1000 человек
        int mortality = 8;
        for (int i = 1; i <= 10; i++) {
            totalPopulation += (totalPopulation * (birthrate - mortality) / 1000);
            System.out.print("Год " + i + "-й, численность населения составляет " + totalPopulation + ". ");
        }
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        int depositAmount = 15000;
        int desiredAmount = 12000000;
        int savingsSum = 0;
        int month4 = 0;
        while (savingsSum <= desiredAmount) {
            month4++;
            savingsSum += depositAmount + savingsSum * 7 / 100;
            System.out.print("Месяц " + month4 + "-й, сумма накопления равна - " + savingsSum + " рублей. ");
        }
        System.out.println();
        System.out.println("Чтобы накопить " + depositAmount + " рублей нужно " + month4 + " месяцев.");
        System.out.println();

        //Задача 5
        System.out.println("Задача 5");
        int depositAmount5 = 15000;
        int desiredAmount5 = 12000000;
        int savingsSum5 = 0;
        int month5 = 0;
        while (savingsSum5 <= desiredAmount5) {
            month5++;
            savingsSum5 += depositAmount5 + savingsSum5 * 7 / 100;
            if (month5 % 6 == 0) {
                System.out.print("Месяц " + month5 + "-й, сумма накопления равна - " + savingsSum5 + " рубле й. ");
            }
        }
        System.out.println();

        //Задача 6
        System.out.println("Задача 6");
        int depositAmount6 = 15000;
        int savingsSum6 = 0;
        int month6 = 0;
        while (month6 <= (12 * 9)) {
            month6++;
            savingsSum6 += depositAmount6 + savingsSum6 * 7 / 100;
            if (month6 % 6 == 0) {
                System.out.print("Месяц " + month6 + "-й, сумма накопления равна - " + savingsSum6 + " рубле й. ");
            }
        }
        System.out.println();

        //Задача 7
        System.out.println("Задача 7");
        int dateFriday = 5;
        while (dateFriday <= 31) {
            System.out.println("Сегодня пятница " + dateFriday + "-ое число, нужно подготовить отчет.");
            dateFriday += 7;
        }

        //Задача 8
        System.out.println("Задача 8");
        int minYear = 2024 - 200;
        int maxYear = 2024 + 100;
        int flightPeriod = 79;
        int year = minYear;
        //определим первый нулевой год
        while (year % 10 != 0) {
            year++;
        }
        while (year <= maxYear) {
            System.out.println("В " + year + " пролетит комета.");
            year += flightPeriod;
        }
    }
}