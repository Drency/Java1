
public class Navn{
    private String e, f;

    public Navn(String f, String e){
        this.e = e;
        this.f = f;
    }

    public String getFNavn(){
        return this.f;
    }

    public String getENavn(){
        return this.e;
    }
}