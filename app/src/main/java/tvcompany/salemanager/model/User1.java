package tvcompany.salemanager.model;


import com.google.gson.annotations.Expose;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User1 {

    @Expose
    private String first_name;
    @Expose
    private String last_name;
    @Expose
    private String username;
    @Expose
    private String email;
    @Expose
    private String birthday;
    @Expose
    private String phone;
    @Expose
    private String password;



    public User1(String first_name, String last_name, String username, String email, String birthday, String phone, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.email = email;
        this.birthday = birthday;
        this.phone = phone;
        this.password = password;
    }

    public User1() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
