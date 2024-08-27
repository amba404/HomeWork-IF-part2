public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1\n");
        {
            int personAge = 17;

            if (personAge >= 18) {
                System.out.printf("Вам %d. Это больше или равно 18. Вы совершеннолетний\n", personAge);
            } else {
                System.out.printf("Вам %d. Вы не достигли совершеннолетия. Нужно немного подождать\n", personAge);
            }

        }

        System.out.println("\nTask 2\n");
        {
            int outTemp = 12;

            if (outTemp < 5) {
                System.out.println("На улице холодно, нужно надеть шапку");
            } else {
                System.out.println("Сегодня тепло, можно идти без шапки");
            }
        }

        System.out.println("\nTask 3\n");
        {
            int speedRace = 60;

            if (speedRace > 60) {
                System.out.println("Скорость превышена. Вам штраф");
            } else {
                System.out.println("Превышения скорости нет. Продолжайте движение");
            }
        }

        System.out.println("\nTask 4\n");
        {
            int personAge = 17;

            if (personAge >= 2 && personAge <= 6) {
                System.out.println("Иди в детсад");
            } else if (personAge >= 7 && personAge <= 17) {
                System.out.println("Иди в школу");
            } else if (personAge >= 18 && personAge <= 24) {
                System.out.println("Твоё место в университете");
            } else if (personAge > 24) {
                System.out.println("Вставай! На работу опоздаешь");
            }
        }

        System.out.println("\nTask 5\n");
        {
            int childAge = 8;

            if (childAge < 5) {
                System.out.println("Тебе ещё рано кататься");
            } else if (childAge >= 5 && childAge <= 14) {
                System.out.println("Можешь кататься со взрослым или мимо проходи");
            } else if (childAge > 14) {
                System.out.println("Иди и катайся!");
            }
        }

        System.out.println("\nTask 6\n");
        {
            int vanCapacity = 102;
            int sittingPlaceCount = 60;
            int currentPassengerCount = 80;

            if (currentPassengerCount < sittingPlaceCount) {
                System.out.println("Есть свободные сидячие места");
            } else if (currentPassengerCount < vanCapacity) {
                System.out.println("Есть свободные стоячие места");
            } else {
                System.out.println("В вагоне свободных мест не осталось");
            }
        }

        System.out.println("\nTask 7\n");
        {
            int one = 1;
            int two = 2;
            int three = 3;

            if (one >= two && one >= three) {
                System.out.println(one);
            } else if (two >= one && two >= three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }

        }

    }
}
