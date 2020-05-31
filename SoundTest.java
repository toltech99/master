
package temps;
import java.io.*;
import sun.audio.*;

/**
 * A simple Java sound file example (i.e., Java code to play a sound file).
 * AudioStream and AudioPlayer code comes from a javaworld.com example.
 * @author alvin alexander, devdaily.com.
 */

public class SoundTest {

	public static void main(String[] args) throws Exception {
		
		    // open the sound file as a Java input stream
		    String gongFile = "src\\temps\\enter.wav";
		    InputStream in = new FileInputStream(gongFile);

		    // create an audiostream from the inputstream
		    AudioStream audioStream = new AudioStream(in);

		    // play the audio clip with the audioplayer class
		    AudioPlayer.player.start(audioStream);
		  }
		}