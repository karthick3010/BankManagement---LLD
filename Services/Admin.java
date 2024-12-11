package Services;

public class Admin {

    private String name;
    private int id;
    private String passWord;


    
    public Admin(String name, int id, String passWord) {
        this.name = name;
        this.id = id;
        this.passWord = passWord;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    
    
}
