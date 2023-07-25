package win.ben2.springinactionCDPlayer;


import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private final String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private final String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}

