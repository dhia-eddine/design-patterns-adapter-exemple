public class Pc implements IAffiche {
    Adapter adapter;
    Tv tv;

    public Pc() {
        this.tv = new Tv();
        this.adapter = new Adapter(tv);
    }

    @Override
    public void affiche(String message) {
        if(message.equals("Pc")){
            System.out.println("Displaying on PC");
        }
        if(message.equals("tv")){
            adapter.affiche("tv");
        }
    }
}