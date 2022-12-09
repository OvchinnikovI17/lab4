package allOther;

public class Adress implements Describable {
    String nameAdress = "nothing";
    String numberAdress = "nothing";


    public boolean setAdress(String name, String number) throws AdressNumberException {
        if (Integer.parseInt(number) > 0) {
            this.nameAdress = name;
            this.numberAdress = number;
        }else{
            throw new AdressNumberException("Адрес дома не может быть меньше 0");
        }
        return true;
    }

    @Override
    public String describe() {
        return this.nameAdress + " " + this.numberAdress;
    }

}
