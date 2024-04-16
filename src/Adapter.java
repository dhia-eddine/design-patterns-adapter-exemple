public class Adapter implements IAffiche {
    Tv tv;

    public Adapter(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void affiche(String message) {
        tv.display();
    }
}