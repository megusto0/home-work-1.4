public class Main {
    public static void main(String[] args) {
        //Задание 1
        int i = 1;
        while(i <= 10) {
            System.out.print(i + " ");
            ++i;
        }
        System.out.println();
        for (;i > 1;) {
            --i;
            System.out.print(i + " ");
        }
        System.out.println();

        //Задание 2

        int firstFriday = 7;

        while(firstFriday < 31) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
            firstFriday += 7;
        }

        //Задание 3
        int currentYear = 2022;
        int year = 0;
        while (year < currentYear) {
            if (year > currentYear - 200) {
                System.out.println(year);
            }
            year += 79;
        }
        System.out.println(year);
    }
}