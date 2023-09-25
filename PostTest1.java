/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import com.film.Film;
import java.util.ArrayList;

/**
 *
 * @author USER
 */

public class PostTest1 {
    public static void main(String[] args) {

        Film film1 = new Film("Film Crazy Rich Asians", "Nina Jacobson, Brad Simpson, Jon M. Chu, Kevin Kwan", 2018);
        Film film2 = new Film("Film Avenger Endgame", "Kevin Feige", 2019);
        Film film3 = new Film("Film The Dark Knight", "Christopher Nolan,Charles Roven", 2022);
        Film film4 = new Film("Film X-Men Dark Phoenix", " Simon Kinberg, Hutch Parker", 2019);
        Film film5 = new Film("Film Avatar", "James Cameron, Jon Landau", 2009);
        Film film6 = new Film("Film Coco", " Darla K. Andersonu", 2017);
        Film film7 = new Film("Film The Nun", "Peter Safran", 2018);
        
        ArrayList<Film> films = new ArrayList<>();
        films.add(film1);
        films.add(film2);
        films.add(film3);
        films.add(film4);
        films.add(film5);
        films.add(film6);
        films.add(film7);

        for (Film film : films) {
            String filmTitle = "Judul Film: " + film.title;
            String filmProducer = "Produser: " + film.producer;
            String filmYear = "Tahun Terbit: " + film.releaseYear;

            String filmInfo = filmTitle.concat(" oleh " + filmProducer + " dirilis pada " + filmYear);
            System.out.println(filmInfo);
            System.out.println();
        }
    }
}
