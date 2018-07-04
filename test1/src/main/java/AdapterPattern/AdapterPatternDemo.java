package AdapterPattern;

/**
 * @ClassName AdapterPatternDemo
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  19:50
 * Version 1.0
 **/
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer  audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vic", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
