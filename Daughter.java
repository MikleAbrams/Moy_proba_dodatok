package zaniatija.project_Family;

public class Daughter extends Persons {

    public Daughter (String statusFam, String name, int age) {super(statusFam, name, age);}
    @Override
    public boolean isSlushaetsa() {return super.isSlushaetsa();}

    public String GoodDoughter(Mother mother) {
        mother.dobraja();
        return  "Vozmi konfetku !";
    }
    public String VitannjaOtvet(Sun sun){
        sun.Vitannia();
        return "Hejka, hejka Bro!";
    }
    public void PoetVDushe(){
        System.out.println("Sing the song!!!");
    }


// Создаю конкретный обьект "Кася" для сравнения по возрасту с братом в классе "Sun"
    Daughter kasia = new Daughter("Older doughter", "Katherin", 27);
    public int oldesty (Daughter kasia){
        kasia.setAge(this.getAge());
        return kasia.getAge();
    }
}