import java.io.Serializable;
import java.util.Objects;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/31 8:53
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = -8163918326556604379L;

    // 用户名
    private String adminUser;

    // 密码
    private String adminPassWd;

    public Admin(String adminUser, String adminPassWd) {
        this.adminUser = adminUser;
        this.adminPassWd = adminPassWd;
    }

    public Admin() {
        this("admin","123123");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;
        Admin admin = (Admin) o;
        return Objects.equals(adminUser, admin.adminUser) &&
                Objects.equals(adminPassWd, admin.adminPassWd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminUser, adminPassWd);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminUser='" + adminUser + '\'' +
                ", adminPassWd='" + adminPassWd + '\'' +
                '}';
    }

    public String getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser;
    }

    public String getAdminPassWd() {
        return adminPassWd;
    }

    public void setAdminPassWd(String adminPassWd) {
        this.adminPassWd = adminPassWd;
    }
}

