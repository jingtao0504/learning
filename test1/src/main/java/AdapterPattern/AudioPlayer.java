package AdapterPattern;

/**
 * @ClassName AudioPlayer
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  19:46
 * Version 1.0
 **/
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
    if(audioType.equalsIgnoreCase("mp3")){
        System.out.println("Playing mp3 file. Name: "+ fileName);
    }else if(audioType.equalsIgnoreCase("vic") || audioType.equalsIgnoreCase("mp4")){
        mediaAdapter = new MediaAdapter(audioType);
        mediaAdapter.play(audioType,fileName);
    }else{
        System.out.println("Invalid media. "+ audioType + " format not supported");
    }

    }
}
