
package musical;

import animals.playable;

public class Music implements playable {
    String[] mp3=new String[4];
    String[] playerstate={"playing","paused","stopped"};
    public Music(String[] audio)
    {
        for(int i=0;i<audio.length;i++)
        mp3[i]=audio[i];
    }

    @Override
    public void play() {
          System.out.print("The current song playing is :");
          System.out.println(mp3[0]);
          System.out.println(playerstate[0]);
    }
}
