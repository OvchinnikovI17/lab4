package allOther;

public class Newspaper implements Describable {

    private String nameNews;
    private String announ = null;
    private String category = null;


    public Newspaper(String name) throws NameError{
        this.nameNews = ((name.isEmpty()) ? "Новости" : name);
        if (!name.isEmpty()){
            System.out.println("В городе Давилон популярны газеты");
        }else{
            throw new NameError("Пожалуйста, введите название для газеты");
        }


    }

    public boolean announcement(String announ, int mode){
        if (mode == 0){
            this.announ = "Газета " + this.nameNews + " гласит: " + announ;
        }else{
            this.announ = "Газета " + this.nameNews + " умаличивает: " + announ;
        }
        return true;
    }

    public boolean setCategory(String category){
        this.category = category;
        return true;
    }

    public String getCategory(){
        return "Категория: " + this.category;
    }

    @Override
    public String describe() {
        return  this.announ;
    }


}

