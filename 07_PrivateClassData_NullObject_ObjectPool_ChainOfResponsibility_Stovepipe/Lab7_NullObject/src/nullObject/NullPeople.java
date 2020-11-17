package nullObject;

public class NullPeople implements AbstractPeople {

    public NullPeople(){}

    @Override
    public String getName() {
        return "Entry not found";
    }

    @Override
    public String getAddress() {
        return "Entry not found";
    }

    @Override
    public String getNumber() {
        return "Entry not found";
    }

    @Override
    public String getData() {
        return "Entry not found";
    }
    
}
