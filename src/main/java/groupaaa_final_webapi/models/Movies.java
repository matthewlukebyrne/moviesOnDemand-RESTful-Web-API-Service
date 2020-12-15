/*
 *  This is the area where the required data is declated in the models package for the Movies information
 */
package groupaaa_final_webapi.models;

/**
 * @author x17492632
 * @author x17138744
 */

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movies {
    private int id;
    private String name;
    private String genre;
    private Boolean watched;
    private Boolean recco;

    
    public Movies() {
    }

    public Movies(int id, String name, String genre, Boolean watched, Boolean recco) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.watched = watched;
        this.recco = recco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getWatched() {
        return watched;
    }

    public void setWatched(Boolean watched) {
        this.watched = watched;
    }

    public Boolean getRecco() {
        return recco;
    }

    public void setRecco(Boolean recco) {
        this.recco = recco;
    }
}
