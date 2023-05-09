package day13;
public class Eg_Constructor1 {
    private String Name;

    private String Place;
    private String District;
    private String State;
    private int Number;

    public Eg_Constructor1(String Name,String Place,String District,String State,int Number)
    {
        this.Name=Name;
        this.Place=Place;
        this.District=District;
        this.State=State;
        this.Number=Number;
    }

    public Eg_Constructor1() {

    }

    public String getPlace() {
        return Place;
    }
    public int getNumber()
    {
        return Number;
    }
}
