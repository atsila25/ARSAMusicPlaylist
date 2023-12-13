/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import gui.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laudz
 */
public class MpView {

    private static final MpRepos repo = new MpRepos();
    
    Icon welkam = new javax.swing.ImageIcon(getClass().getResource("/Icon/Welkam.png"));
    Icon createSuccess = new javax.swing.ImageIcon(getClass().getResource("/Icon/Playlist.png"));
    String playlist;
    String addSong;
    Music song;
    private PagePlaylist pPlaylist;

    public void createPlaylist() {
        playlist = (String) JOptionPane.showInputDialog(null, "Give title to your playlist: ", "Welcome to ARSA Music Playlist!", JOptionPane.QUESTION_MESSAGE, welkam, null, null);
        JOptionPane.showMessageDialog(null, "Playlist " + playlist + " Has Created", "Playlist successfully created!\nNow let's add song's!", JOptionPane.INFORMATION_MESSAGE, createSuccess);

    }

    public void displayAll() {
      System.out.println("\nDisplay songs in your playlist: ");
      repo.display();
         if (pPlaylist != null) {
        DefaultTableModel defaultTableModel = pPlaylist.getDefaultTableModel();
        if (defaultTableModel == null) return;

        // Hapus semua baris pada jTable1
        defaultTableModel.setRowCount(0);

        // Tambahkan lagu-lagu yang ada di repositori ke jTable1
        for (Node node = repo.getFront(); node != null; node = node.next) {
            defaultTableModel.addRow(new Object[]{node.ArtSong.getArtSong()});
        }
    }
    }

    public String current() {
        System.out.print("Your current song is: ");
        return repo.getCurrentSong();
    }

    public void previous() {
        System.out.println("\nYou click previous");
        repo.prev();
    }

    public void next() {
        System.out.println("\nYou click next");
        repo.next();
    }

    public void queue(String selectedSong) {
         if (selectedSong != null && !selectedSong.isEmpty()) {
            addSong = selectedSong;
            song = new Music(addSong);
            repo.enqueue(song);
            System.out.println("Success adding " + addSong);
            displayAll(); // Memperbarui tampilan setelah lagu ditambahkan
        } else {
            System.out.println("Adding songs cancelled");
        }
       
    }

    public void dequeue() {
        System.out.println("You click dequeue");
        repo.dequeue();
    }

    public String getPlaylist() {
        return playlist;
    }

    public String getNewSongTitle() {
        return addSong; // Mengembalikan judul lagu yang baru ditambahkan
    }

     public void setPlaylist(PagePlaylist newPlaylist) {
        this.pPlaylist = newPlaylist;
    }    
}
