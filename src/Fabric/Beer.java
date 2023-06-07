package Fabric;

public abstract class Beer {
    protected String info="";
    public void make(){
        System.out.println("Варим Пиво");
    }

    public void pour(){
        System.out.println("Наливаем бутылку пива");
    }

    public String getInfo() {
        return info;
    }
}

