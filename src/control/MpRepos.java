/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
/**
 *
 * @author laudz
 */
public class MpRepos {
   

    private Node front;
    private Node rear;
    private int current;

    public MpRepos() {
        front = null;
        rear = null;
        current = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Music ArtSong) {
        
        Node newNode = new Node(ArtSong);
      if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        current = 0;
    }

    public Music dequeue() {
        if (front == null) {
            return null;
        }
        Music ArtSong = front.ArtSong;
        front = front.next;

        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }
        current = (current - 1 + size()) % size();
        return ArtSong;
    }

    public Music peek() {
        if (front == null) {
            return null;
        }
        return front.ArtSong;
    }

    public String getCurrentSong() {
        if (front == null) {
            System.out.println("Daftar lagu kosong.");
            return null;
        }
        System.out.println(get(current).getArtSong());
        return get(current).getArtSong();
    }

    public void display() {
        int index = 1;
        for (Node node = front; node != null; node = node.next) {
            System.out.println(index + ". " + node.ArtSong.getArtSong());
            index++;
        }
    }

    public int size() {
        int size = 0;

        for (Node node = front; node != null; node = node.next) {
            size++;
        }
        return size;
    }

    public Music get(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }

        Node node = front;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.ArtSong;
    }

    public void next() {
        if (current < size() - 1) {
            current++;
        } else {
            current = 0;
        }
    }

    public void prev() {
        if (current > 0) {
            current--;
        } else {
            current = size() - 1;
        }
    }

    public Node getFront() {
        return front;
    }
}
