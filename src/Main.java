//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog  = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println( dog );
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog =  frog + 4;
        System.out.println(frog);

        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var totalWeight = firstFighter + secondFighter;
        System.out.println("Общий вес равен " + totalWeight + " кг!");
        var weightDifference = firstFighter - secondFighter;
        System.out.println("Разница в весе бойцов " + weightDifference + "кг!");
        var weightRemainder = secondFighter % firstFighter;
        System.out.println("Разница в весе бойцов теперь " + weightRemainder +" кг!");

        var totalTime = 640;
        System.out.println(totalTime);
        var timeOfOne = 8;
        System.out.println(timeOfOne);
        var humanCompanies = totalTime / timeOfOne;
        System.out.println("Всего работников в компании " + humanCompanies + " человек!");
        var moreHumanCompfnies = humanCompanies + 94;
        System.out.println(moreHumanCompfnies);
        var moreTotalTime = moreHumanCompfnies * timeOfOne;
        System.out.println("Если в компании работает " + moreHumanCompfnies + " человека, " + " то всего " + moreTotalTime + " часов работы может быть поделено между сотрудниками ");

    }
}