package uno.dos.tres.bean;

import java.io.Serializable;
import java.util.Objects;

public class RegInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userName;
    private String password;
    private String email;

    public RegInfo() {}
    public RegInfo(String userName, String password, String email) {}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegInfo regInfo = (RegInfo) o;
        return Objects.equals(userName, regInfo.userName) && Objects.equals(password, regInfo.password) && Objects.equals(email, regInfo.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, email);
    }
}
