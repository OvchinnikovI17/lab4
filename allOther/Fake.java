package allOther;

public class Fake implements Describable {
    private String actualInfo = "";
    private String aboutWho = "";
    private String fakeInfo = "";

    public Fake(String aboutWho, String prooveInfo, String fakeInfo) {
        this.actualInfo = prooveInfo;
        this.fakeInfo = fakeInfo;
        this.aboutWho = aboutWho;
    }

    @Override
    public String describe() {

        return "Говоря о " + this.aboutWho + " На самом деле не было так: " + this.fakeInfo + ", а так " + this.actualInfo;
    }
}

