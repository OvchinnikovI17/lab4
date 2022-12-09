package allOther;

public class Cash implements Describable {

    String nameCash = "";

    public Cash(String name) {
        this.nameCash = name;
    }

    @Override
    public String describe() {
        return this.nameCash;
    }
}
