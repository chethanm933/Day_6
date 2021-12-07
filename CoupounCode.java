import java.security.SecureRandom;
import java.util.Random;

public class CoupounCode {
	
		public static void main(String[] args) {
		CoupounCode coupouncode = new CoupounCode();
		coupouncode.createRandomCode(5);
}
		public String createRandomCode(int codeLength){   
		codeLength = 10;
		char[] chars = "abcdefghijklmnopqrstuvwxyzQWERTYUIOPLKJHGFDSAZXCVBNM1234567890".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new SecureRandom();
		
		for (int i = 0; i < codeLength; i++) {
		char c = chars[random.nextInt(chars.length)];
		sb.append(c);
		}
		String output = sb.toString();
		System.out.println(output);
		return output ;
		}
}
