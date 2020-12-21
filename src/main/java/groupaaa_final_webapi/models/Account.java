/*
 *  This is the area where the required data is declated in the models package for the Accounts information
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
    private int accountID;
    private String nickname;
    private String password;
    public static List<Movie> movies = new ArrayList<>();

    
    public Account() {
    }

    public Account(int accountID, String nickname, String password, List <Movie> movies ) {
        this.accountID = accountID;
        this.nickname = nickname;
        this.password = password;
        this.movies = movies;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
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

    public static List<Movie> getMovies() {
        return movies;
    }

    public static void setMovies(List<Movie> movies) {
        Account.movies = movies;
    }  
    
    public void addMovie(Movie movie) {
	movies.add(movie);
        System.out.println("add a new movie");
    }
   
    //remove movie from account by position passed
    public void removeMovie(int accountPos) {
	movies.remove(accountPos);
        System.out.println("removed a movie");
    } 
    
    public String printAccount() {
        String str = this.getAccountID() + " " + this.getNickname() + " "+ this.getPassword() +  Account.getMovies();
        return str;
    }
  
     public String printAllMoviess() {
         String allmovies = "";
         for ( int i=0; i<movies.size(); i++)
             allmovies=allmovies+movies.get(i).printMovie()+" ";
	return allmovies;
    }
}
