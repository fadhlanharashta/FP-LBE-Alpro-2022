public class Fax extends Telephone{
    public String office;
    public Fax(String number, String name, String password){
        super(number, name, password);
    }
    public String printValue (){
        return("name = " + this.name + "\nnumber = " + this.number);
    }
}

