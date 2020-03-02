import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TempForEasyOne {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		String cases[] = {"TTT", "TTH", "THT", "THH", "HTT", "HTH", "HHT", "HHH"};
		for(int t = 0; t<testCase; t++) {
			int arr[] = new int[8];
			String s = br.readLine();
			for(int i = 0; i<38; i++) {
				for(int j = 0; j<8; j++) {
					if(s.substring(i, i+3).equals(cases[j]))
						arr[j]++;
				}
			}
			for(int i = 0; i<8; i++)
				bw.write(arr[i] + " ");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
