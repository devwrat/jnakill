import com.sun.jna.Library;
import com.sun.jna.Native;


public class JnaKill {
	public static void main(String args[]){
		Posix posix = (Posix) Native.loadLibrary("c", Posix.class);
		int pid = Integer.parseInt(args[0]);
		int signal = Integer.parseInt(args[1]);
		posix.kill(pid, signal);
	}
	
	public interface Posix extends Library {
		public int kill(int pid, int signal);
	}
}
