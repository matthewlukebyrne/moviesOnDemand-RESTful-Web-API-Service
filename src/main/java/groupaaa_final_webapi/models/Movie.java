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

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movie {
    private int id;
    private String name;
    private String genre;
    private Boolean watched;
    private Boolean recco;

    
    public Movie() {
    }

    public Movie(int id, String name, String genre, Boolean watched, Boolean recco) {
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
