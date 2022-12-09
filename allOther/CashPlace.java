package allOther;


import java.util.Arrays;

public class CashPlace implements Describable {

    String[] qualities = {"несгораемая"};


    @Override
    public String describe(){
        return  Arrays.toString(qualities).replace("[", "")
                .replace("]", "") + " касса";
    }
}

