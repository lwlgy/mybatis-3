package cn.lwllm.mybatistest.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lwlas
 */
@Data
@Alias("User")   //这是mybatis限定名的注解，不设置这个注解会使用首字母小写的类名作为别名
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String address;
    private Date birthday;

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String birthdayStr = sdf.format(birthday);
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", birthday=" + birthdayStr +
                '}';
    }
}
