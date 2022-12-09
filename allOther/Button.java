package allOther;

public class Button implements Describable, Start{

    BankWorker pressedBy;
    String result;
    Boolean status = false;
    static String color = "красная";

    private class Signalize{
        public void signal(){
            System.out.println("Раздался звук сирены, потому что " + pressedBy.getName() + " нажал кнопку");
        }
    }

    public static class ColorButton{
        public void color(){
            System.out.println("Цвет кнопки " + color);
        }
    }
    public boolean press(BankWorker pressedBy){
        this.status = true;
        this.pressedBy = pressedBy;
        Signalize signalize = new Signalize();
        signalize.signal();
        return true;
    }

    public boolean ifPressed(){
        return this.status;
    }

    @Override
    public void start() {
        if (this.status) {
            this.result = "Аварийную кнопку нажал ";
        }else{
            this.result = "Аварийную кнопку не нажал ";
        }
    }

    @Override
    public String describe() {
        return this.result + this.pressedBy.getName();
    }
}
