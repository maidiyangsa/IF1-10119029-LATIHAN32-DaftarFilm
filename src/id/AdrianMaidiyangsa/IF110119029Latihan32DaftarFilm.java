/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.AdrianMaidiyangsa;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program daftar film, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class IF110119029Latihan32DaftarFilm {
    public static void main(String[] args) {
        DaftarFilm film1 = new DaftarFilm();
        film1.filmName = "Venom";
        film1.filmGenre = "Action, Horror, Scifi";
        film1.filmRating = 8.5;
        film1.filmDuration = 120;
        
        DaftarFilm film2 = new DaftarFilm();
        film2.filmName = "Small Foot";
        film2.filmGenre = "Animation";
        film2.filmRating = 9.0;
        film2.filmDuration = 96;
        
        DaftarFilm film3 = new DaftarFilm();
        film3.filmName = "Crazy Rich Asian";
        film3.filmGenre = "Comedy";
        film3.filmRating = 7.8;
        film3.filmDuration = 119;
        
        DaftarFilm film4 = new DaftarFilm();
        film4.filmName = "Asih";
        film4.filmGenre = "Horror";
        film4.filmRating = 6.0;
        film4.filmDuration = 100;
        
        System.out.println("===Daftar Film Sedang Tayang===\n");
        film1.nowPlaying();
        film2.nowPlaying();
        film3.nowPlaying();
        film4.nowPlaying();
        
    }
    
}
