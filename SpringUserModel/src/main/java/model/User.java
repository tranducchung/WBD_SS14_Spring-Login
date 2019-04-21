package model;

public class User {
    private String name;
    private String email;
    private int age;
    private String account;
    private String password;

    public User(){}

    public User(String name, String email, int age, String account, String password) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.account = account;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
