/*
 *  This is the area where the required data is declated in the models package for the Account information
 */
package groupaaa_final_webapi.models;

/**
 * @author x17492632
 * @author x17138744
 */

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Account {
    private int id;
    private String nickname;
    private String password;
    public static List<Movie> movie = new ArrayList<>();

    
    public Account() {
    }

    public Account(int id, String nickname, String password, List <Movie> movie ) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static List<Movie> getMovie() {
        return movie;
    }

    public static void setMovie(List<Movie> movie) {
        Account.movie = movie;
    }  

     public String printMessage() {
        String str = this.getId() + " " + this.getNickname() + " "+ this.getPassword() +  Account.getMovie();
        return str;
    }
}
