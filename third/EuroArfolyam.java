package euroArfolyam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class EuroArfolyam {

	public static void main(String[] args) {
		try {
			URL index=new URL("https://www.index.hu");
			BufferedReader in=new BufferedReader(
					new InputStreamReader(index.openStream()));
			String sor;
			
			while((sor=in.readLine()) != null) {
				//System.out.println(sor);
				if (sor.contains("EUR:")) {
					sor=in.readLine();
					sor=in.readLine();
					sor=sor.trim();
					
					String sortomb[]=sor.split(" ");
					sor=sortomb[0];
					
					//sor=sor.replaceAll(",", ".");
					System.out.println(sor);
					float arfolyam=Float.parseFloat(sor.replaceAll(",", "."));
					System.out.println("Ár="+(12*arfolyam));
					
				}
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
