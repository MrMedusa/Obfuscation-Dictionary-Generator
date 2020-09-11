import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Random;

public class GenerateObfDir {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		int lines = 1000;
		for (int i = 0; i < lines; i++) {
			  sb.append(generateLine() + newLine);
		}
		
		makeList(sb.toString());
		
	}
	
	public static String generateLine() {
		int chars = 100;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chars; i++) {
		int shit = getNumber();
			if (shit == 1) {
				sb.append("I");
			} else {
				sb.append("l");
			}
		}
		return sb.toString();
	}
	
	public static Random rn = new Random();
	public static int getNumber() {
		int r = rn.nextInt((1) + 1) + 1;
		return r;
	}
	public static String newLine = System.getProperty("line.separator");
	public static void makeList(String sb) {
		try {
            File listFile = new File("obf.txt");
            listFile.createNewFile();
            FileOutputStream is = new FileOutputStream(listFile);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            BufferedWriter w = new BufferedWriter(osw);
            w.write(sb);
            ((Writer)w).close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}
