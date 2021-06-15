package The_property_management.model;

// 用户实体
public class User {

    private  int id;
    private  String userName;
    private String passWord;
    private int is_admit;


    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setIs_admit(int is_admit) {
        this.is_admit = is_admit;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public int getIs_admit() {
        return is_admit;
    }
    public User(){
        super();

    }
    public User(String userName,String passWord){
        super();
        this.userName = userName;
        this.passWord = passWord;
    }

}
