package zaniatija.project_Family;

import zaniatija.demo_ZADANIJE.Naczalnik;

public class Sun extends Persons {

    public Sun (String statusFam, String name, int age) {super(statusFam, name, age);}
    @Override
    public boolean isSlushaetsa() {return super.isSlushaetsa();}

    public void Vitannia() {
        System.out.println("Hejka!");
    }

    public String synNakazan(Father father) {
        father.zloj();
        return  "Guliat nie idesh!";
    }
    public String reakciaSisterDush(Daughter daughter){
        daughter.PoetVDushe();
        return "Zatknis, nadoelo!";
    }
    //Хочу реализовать сравнение по возрасту конкретных "Касю" из "Doughter" и "Марка" из "Sun" -
    //  - не знаю как правильно вытащить их возраст для сравнения...
    Sun marik = new Sun("Younger sun", "Mark", 16);
    int ageOfKasia = marik.ageOfKasia;
    public void ageOfMark (Sun marik){
        if (marik.getAge()<= ageOfKasia){
            System.out.println("Mark is younger of Kasia");
        } else {
            System.out.println ("Mark is oldest of Kasia");
        }
    }


}
