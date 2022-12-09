package allOther;

public class Alone extends Person implements WhatToDO, Describable{
    private String[] actions = {"ничего", "ничего", "никуда"};
    private String[] lostThings = {"1", "2"};
    private String minds;

    public Alone(String name) {
        super(name);
    }

    public boolean lost(Clothe clothe){
        if (lostThings[0] == "1"){
            lostThings[0] = clothe.describe();
        }else{
            lostThings[1] = clothe.describe();
        }
        return true;
    }

    public String whatLost(){
        return super.getName() + " потерял " + lostThings[0] + ", " + lostThings[1];
    }

    public boolean share(String minds){
        this.minds = super.getName() + " поделился " + minds;
        return true;
    }

    public String getShare(){
        return this.minds;
    }

    public String canDo(String what, Consistence how){
        switch (how){
            case GOOD:
                return super.getName() + " хорошо умеет " + what;
            case BAD:
                return super.getName() + " плохо умеет " + what;
            case NORMAL:
                return super.getName() + " средне умеет " + what;
            default:
                break;
        }



        return super.getName() + " " + how + " умеет " + what;
    }

    public boolean tell(String info, Alone prsn){
        System.out.println( super.getName() + " рассказал " + info + " " + prsn.getName());
        prsn.actions[1] = info;
        return true;
    }

    public String ask(String text, Robber robber){
        return super.getName() + " спросил " + robber.getName() + " о " + text;
    }

    public String sayBad(Police plc, String badWords){
        return  super.getName() + " оскробил  " + plc.getName() + ": " + badWords;
    }

    public String sayGood(Police plc, String badWords){
        return  super.getName() + " поблагодарил  " + plc.getName() + ": " + badWords;
    }
    @Override
    public boolean made() {
        this.actions[0] = "что-то";
        return true;
    }

    @Override
    public boolean know() {
        this.actions[1] = "о ограблении";
        return true;
    }

    @Override
    public boolean come() {
        this.actions[2] = " в контору";
        return true;
    }

    @Override
    public String describe() {
        return super.getName() + " сделал " + this.actions[0] + " знает " + this.actions[1] + " пришел " + this.actions[2];
    }
}



