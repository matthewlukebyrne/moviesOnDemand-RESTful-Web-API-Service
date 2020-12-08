/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupaaa_final_webapi.services;

/**
 *@author keanrz
 * @author matth
 */

import groupaaa_final_webapi.models.Movie;
import java.util.ArrayList;
import java.util.List;

public class MovieService {

    public static List<Movie> list = new ArrayList<>();
    public static boolean init = true;

    public MovieService() {
        if (init) {
            Movie m1 = new Movie(1, "Matrix", "sci-fi", true, true);
            Movie m2 = new Movie(1, "Nacho Libre 2", "comedy", true, true);
            Movie m3 = new Movie(1, "Le Espana", "fantasy", false, true);
            Movie m4 = new Movie(1, "Terminator", "sci-fi", true, false);
            Movie m5 = new Movie(1, "40 Year Old Virgin", "comedy", true, true);
            Movie m6 = new Movie(1, "Matrix Reloaded", "sci-fi", true, true);

            list.add(m1);
            list.add(m2);
            list.add(m3);
            list.add(m4);
            list.add(m5);
            list.add(m6);
            init = false;
        }
    }

    public List<Movie> getAllMovies() {
        return list;
    }

    public Movie getMovie(int id) {
        return list.get(id - 1);
    }
}
