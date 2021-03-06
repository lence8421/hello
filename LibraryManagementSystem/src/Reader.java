import java.io.Serializable;
import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/31 8:55
 */
public class Reader implements Serializable {
    private static final long serialVersionUID = 1293523309463166789L;

    // 证书编号
    private String userLicenses;

    // 姓名
    private String userName;

    // 密码
    private String passWord;

    public Reader() {
    }

    public Reader(String userLicenses) {
        this.userLicenses = userLicenses;
    }

    public Reader(String userLicenses, String userName, String passWord) {
        this.userLicenses = userLicenses;
        this.userName = userName;
        this.passWord = passWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reader)) return false;
        Reader reader = (Reader) o;
        return Objects.equals(userLicenses, reader.userLicenses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userLicenses, userName, passWord);
    }

    @Override
    public String toString() {
        return "读者编号: " + userLicenses + "   " + "用户名: " + userName + "  " + "密码: " + passWord;
    }

    public String getUserLicenses() {
        return userLicenses;
    }

    public void setUserLicenses(String userLicenses) {
        this.userLicenses = userLicenses;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
