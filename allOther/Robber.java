package allOther;

public class Robber extends Person implements Describable {
    private String[] actions = {"ничего", "ничего", "никуда"};
    private ConditionSet condi;
    private Boolean camo = false;

    private String whatCamo = "";
    private String doWeHaveSuitcase = "У бандитов есть чемоданчик";

    public Robber(String name) {
        super(name);
    }

    public boolean condition(ConditionSet conda){
        this.condi = conda;
        return true;
    }

    public boolean camouflage(Boolean getIt){
        if (getIt){
            this.camo = true;
        }
        return true;
    }

    public String camouflage(Boolean getIt, String inWhat){
        if (getIt){
            this.camo = true;
            this.whatCamo = inWhat;
        }
        return "Грабитель был переодет в " + this.whatCamo;
    }

    public boolean getCamouflage(){
        return this.camo;
    }

    public boolean bankLoot(Bank bank, Time time, Rob rob){
        bank.robberyCondition("robber", this.camo, time.getTime(), rob.getStatus());
        return true;
    }

    public String rideAway(){
        return "Бандиты уехали на машине";
    }

    public String doWeHaveCase(Boolean have){
        if (have){
            this.doWeHaveSuitcase = "У грабителей есть чемоданчик";
        }else{
            this.doWeHaveSuitcase = "Чемоданчик грабителей куда-то делся";
        }
        return this.doWeHaveSuitcase;
    }

    public boolean made(String smth) {
        this.actions[0] = smth;
        return true;
    }

    public String camoDescribe(){
        return "Грабители одеты в " + this.whatCamo;
    }

    public boolean know(String smth) {
        this.actions[1] = smth;
        return true;
    }


    public boolean come(String smth) {
        this.actions[2] = smth;
        return true;
    }

    public String camoMode(){
        String whatWeReturn = null;
        if (this.camo) {
            whatWeReturn = "Грабители одеты в балаклаву, черный костюм, в их руках оружие";
        } else if (!(this.camo)) {
            whatWeReturn = "Грабители одеты в гражданское";
        }
        return whatWeReturn;
    }

    public boolean opponentMustDoSmth(BankWorker wrk, String whatToDo){
        System.out.println("Грабители приказали " + wrk.getName() + " " + whatToDo);
        return true;
    }

    public boolean announcement(String whatToDo){
        System.out.println("Грабители заявили " + whatToDo);
        return true;
    }

    public boolean opponentMustDoSmth(BankWorker wrk, String whatToDo, String how){
        System.out.println("Грабители приказали " + wrk.getName() + " " + whatToDo + " " + how);
        return true;
    }

    @Override
    public String describe() {
        String whatWeReturn = null;
        switch (this.condi){
            case ALIVE:
                whatWeReturn = super.getName() + " сделал " + this.actions[0] + " знает " + this.actions[1] + " пришел " + this.actions[2] + " живой";
                break;
            case DAMAGED:
                whatWeReturn = super.getName() + " сделал " + this.actions[0] + " знает " + this.actions[1] + " пришел " + this.actions[2] + " раненный";
                break;
            case DEAD:
                whatWeReturn = super.getName() + " сделал " + this.actions[0] + " знает " + this.actions[1] + " пришел " + this.actions[2] + " мертвый";
                break;
            default:
                break;
        }
        return whatWeReturn;
    }
}