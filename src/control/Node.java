/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
/**
 *
 * @author laudz
 */
public class Node {
    public Music ArtSong;
    public Node next;
    public Node prev;
    
    public Node(Music ArtSong){
        this.ArtSong = ArtSong;
    }
    public void displayNode(){
        System.out.println(ArtSong+"");
    }
}
