/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupaaa_final_webapi.models;

/**
 *@author keanrz
 * @author matth
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
}
