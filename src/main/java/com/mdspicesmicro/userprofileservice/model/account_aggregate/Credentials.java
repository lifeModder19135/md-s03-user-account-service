
import java.util.*;




class Credentials {


    Credentials(String username, Password hashedPwd) {
    	this.username = username;
    	this.password = hashedPwd;
    }


    private String username;


    private Password password;


    private Password bcrypt;

}