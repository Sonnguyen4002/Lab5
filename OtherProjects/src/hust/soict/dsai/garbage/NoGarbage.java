package hust.soict.dsai.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class NoGarbage {
	public static void main(String[] args) throws IOException {
		String filename = "/Users/ADMIN/eclipse-workspace/OtherProjects/src/text.txt";
		byte[] inputBytes = {0};
		long startTime, endTime;
		String s = "";
		StringBuffer sbf = new StringBuffer();
		
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		for (byte b : inputBytes) {
			sbf.append(b);
		}
		s = sbf.toString();
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

	}
}
