package allOther;

public class AdressNumberException extends Exception{
    private String message;

    public AdressNumberException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return "ВАЖНО! : " + this.message;
    }
}