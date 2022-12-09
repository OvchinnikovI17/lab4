package allOther;

public class Tire implements Describable {

    private boolean condtion = false;

    public boolean setCondition(){
        this.condtion = true;
        return true;
    }

    public boolean getCondition(){
        return this.condtion;
    }

    @Override
    public String describe(){
        if (this.condtion){
            return "Шина пробита";
        }else{
            return "Шина в хорошем состоянии";
        }
    }

}
