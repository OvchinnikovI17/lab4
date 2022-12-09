package allOther;


public class Clothe implements Describable {
    String nameClothe = "";

    public Clothe(String name) {
        this.nameClothe = name;
    }

    @Override
    public String describe() {
        return this.nameClothe;
    }

}
