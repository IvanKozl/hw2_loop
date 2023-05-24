public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightTotal = weightBoxer1 + weightBoxer2;
        System.out.println(weightTotal + " кг");
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println(weightDifference + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightDifference1 = weightBoxer2 - weightBoxer1;
        System.out.println(weightDifference1);
        var weightDifference2 = weightBoxer2 % weightBoxer1;
        System.out.println(weightDifference2);
    }
    public static void task8() {
        System.out.println("Задача 8");
        var timeTotal = 640;
        var timeWork = 8;
        var worker = timeTotal / timeWork;
        System.out.println("Всего работников в компании - " + worker + " человек");
        var workerTotal = worker + 94;
        var timeTotalWork = workerTotal * timeWork;
        System.out.println("Если в компании работает " + workerTotal + " человек, то всего " + timeTotalWork + " часов работы может быть поделено между сотрудниками");

    }
}