package guru.springframework.commands;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class LoginCommand {

    @NotEmpty
    @Size(min=2, max=12)
    private String userName;

    @NotEmpty
    @Size(min=6, max=12)
    private String password;

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
}
