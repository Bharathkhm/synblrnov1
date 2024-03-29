import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo {

	public static void main(String[] args) {
		
		long starttime = System.currentTimeMillis();
		FileInputStream inputStream =null;
		FileOutputStream outputstream=null;
		FileChannel inputchannel = null;
		FileChannel outputchannel = null;
		try {
			inputStream = new FileInputStream(args[0]);
			outputstream = new FileOutputStream(args[1]);
			inputchannel = inputStream.getChannel();
			outputchannel = outputstream.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(1024*8);
	
			int i = 0;
			do {
				buffer.clear();
				i = inputchannel.read(buffer);
				buffer.flip();
				outputchannel.write(buffer);
				
			}while( i != -1);
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				outputstream.close();
				inputStream.close();
			} catch (Exception e) {
			}
		}
		long endtime = System.currentTimeMillis();
		System.out.println(" Time taken  = " + (endtime- starttime)/1000 );
	}

}
