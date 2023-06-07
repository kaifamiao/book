package chap14.section02;

// chap14/section02/Client.java
// 定义UserModel类
import java.io.Serializable;

public class UserModel implements Serializable{
    private String userName;
    private String userPass;
    public UserModel(String userName, String userPass) {
        super();
        this.userName = userName;
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
