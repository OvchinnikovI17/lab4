package allOther;

public class Police extends Person implements WhatToDO, Describable {
    private String[] actions = {"ничего", "о ограблении", "на перестрелку"};
    private ConditionSet condi = ConditionSet.ALIVE;

    private Integer hp = 2;

    public Police(String name) {
        super(name);
    }

    public boolean condition(ConditionSet conda){
        this.condi = conda;
        return true;
    }

    public String reward(Alone aln, String about, String whatGive){
        return "Полиция даст " + aln.getName() + " за информацию о " + about + " много " + whatGive;
    }

    public boolean getDamage(){
        this.hp = this.hp - 1;
        return true;
    }


    public String getCondition(){
        String whatWeReturn = null;
        switch (this.condi){
            case ALIVE:
                whatWeReturn = super.getName() + " живой";
                break;
            case DAMAGED:
                whatWeReturn = super.getName() + " раненный";
                break;
            case DEAD:
                whatWeReturn = super.getName() + " мертвый";
                break;
            default:
                break;
        }
        return whatWeReturn;
    }

    public Boolean hearSignal(Button button) {
        if (button.status = true){
            System.out.println("Сигнал услышан, полиция в пути");
        }else{
            System.out.println("Сигнал не услышан");
        }
        return true;
    }

    public String rideAway(){
        return "Полицейские уехали на машине";
    }

    public boolean nearCar(boolean isNear, Robber robber){
        if (isNear){
            System.out.println("Машины сравнялись, " + robber.getName() + " стреляют по колесу полицейской машины");
            Tire tire = new Tire();
            tire.setCondition();
            System.out.println(tire.describe());
            if (tire.getCondition()){
                System.out.println("Из-за " + tire.describe() + " машина полиции разбилась об фонарный столб");
                this.condi = ConditionSet.DAMAGED;
            }else{
                System.out.println("Неудачная попытка прибить колесо от " + robber.getName());
            }


        }
        return true;
    }
    @Override
    public boolean made() {
        this.actions[0] = "играл в козла";
        return true;
    }

    @Override
    public boolean know() {
        this.actions[1] = "ничего";
        return true;
    }

    @Override
    public boolean come() {
        this.actions[2] = "в банк";
        return true;
    }

    @Override
    public String describe() {
        String whatWeReturn = null;

        if (this.hp == 1){
            this.condi = ConditionSet.DAMAGED;
        }

        if (this.hp == 0){
            this.condi = ConditionSet.DEAD;
        }

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
