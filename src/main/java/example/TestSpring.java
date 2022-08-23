package example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
    //    Music music=context.getBean("musicBean",Music.class);
    //    MusicPlayer musicplayer = new MusicPlayer(music);

    //    Music music=context.getBean("rockMusic",Music.class);
    //     MusicPlayer musicPlayer = new MusicPlayer(music);
    //     musicPlayer.playMusic();
    //     context.close();
        //Test
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
    }
}
