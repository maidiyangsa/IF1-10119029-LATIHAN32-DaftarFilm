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
public class DaftarFilm {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying() {
        System.out.println("Judul Film : ".concat(filmName));
        System.out.println("Genre Film : ".concat(filmGenre));
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Duration Film : " + filmDuration + " Menit\n");
    }  
}
