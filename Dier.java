public class Dier {
    private String naam;
    protected int leeftijd;

    public Dier(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public void maakGeluid() {
        System.out.println("Dit dier maakt een geluid");
    }
}
