package allOther;

public class Case implements Describable{
    private String contain = "Ничего";
    private boolean doWeHaveThis = true;
    private String name = "Чемодан";

    public String put(String what, Robber robber){
        this.contain = what;
        return robber.getName() + " положил " + what + " в чемодан";
    }

    public String getName(){
        return this.name;
    }

    public boolean lost(){
        this.doWeHaveThis = false;
        return true;
    }

    public String isLost(Robber rob){
        return rob.doWeHaveCase(this.doWeHaveThis);
    }

    @Override
    public String describe() {
        return "В чемодане лежит " + this.contain;
    }
}
