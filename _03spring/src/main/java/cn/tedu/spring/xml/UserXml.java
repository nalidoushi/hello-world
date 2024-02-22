package cn.tedu.spring.xml;

public class UserXml {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserXml{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void run(){
        System.out.println("数据结构与算法,真好!");
    }
}
