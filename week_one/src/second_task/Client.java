package second_task;

public class Client {
    
    private String name;
    private int id;

    // Default constructor
    public Client(String name, int id){
        setName(name);
        setId(id);
    }

    // Name getter and setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // Id getter and setter
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}
