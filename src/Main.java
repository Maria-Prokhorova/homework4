public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int age = 52;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, " + "нужно немного подождать.");
        }
        System.out.println();

        System.out.println("Задача 2");
        int temperatura = 5;
        if (temperatura < 5) {
            System.out.println("На улице " + temperatura + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperatura + " градусов, можно идти без шапки.");
        }
        System.out.println();

        System.out.println("Задача 3");
        int speed = 120;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        System.out.println();

        System.out.println("Задача 4");
        age = 50;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
        System.out.println();

        System.out.println("Задача 5");
        age = 14;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в " +
                    "сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без " +
                    "сопровождении взрослого.");
        }
        System.out.println();

        System.out.println("Задача 6");
        int currentPassengers = 35;
        if (currentPassengers > 102) {
            System.out.println("Мест в вагоне нет!");
        } else if (currentPassengers <= 60) {
            System.out.println("Есть сидячие места.");
        } else {
            System.out.println("Остались только стоячие места.");
        }
        System.out.println();

        System.out.println("Задача 7");
        int one = 15;
        int two = 5;
        int three = 9;
        if (one > two && one > three) {
            System.out.println("Самое больше число one = " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое больше число two = " + two);
        } else {
            System.out.println("Самое больше число three = " + three);
        }
    }
}