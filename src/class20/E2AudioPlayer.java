package class20;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2AudioPlayer {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        FileInputStream fis=new FileInputStream("C:\\Users\\ahmad\\IdeaProjects\\Main\\src\\class20\\Phir Aur Kya Chahiye  Zara Hatke Zara Bachke  Vicky K, Sara Ali K, Arijit Singh,Sachin-Jigar,Amitabh2.mp3");
        Player mp3Player=new Player(fis);
        mp3Player.play();
    }

}
