
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class OrderItemCount {
	private File inFile,outFile;
	private HashMap<String, Integer> orderItemcount;
	private int count;

	public OrderItemCount() {
		orderItemcount = new HashMap<>();
		count = 0;

	}

	public void showEvents() {
		inFile = new File(
				"C:\\Users\\YalamandaRao\\workspace\\Grocery4me\\src\\items");
		try {
			BufferedReader in = new BufferedReader(
					new FileReader(inFile));

			String ar = in.readLine();
			int c = 0;
			while (ar != null) {
				// System.out.println(ar);
				if (!orderItemcount.containsKey(ar))
					orderItemcount.put(ar, count);
				else {
					c = orderItemcount.get(ar);
					// System.out.println(c);
					c++;
					orderItemcount.put(ar, c);
				}
				ar = in.readLine();
			}
			in.close();
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	public void display() {
		for (Map.Entry<String, Integer> k : orderItemcount.entrySet()) {
			System.out.println(k.getKey() + " - " + k.getValue());
		}
	}
	public void createCsv(){
	
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String nam=dateFormat.format(date).toString();
		System.out.println(nam);
		String m;
		String file="C:\\Users\\YalamandaRao\\workspace\\Grocery4me\\src\\"+nam+"output";
		outFile=new File(file);
		try {
			
			PrintWriter out= new PrintWriter(
	                  new BufferedWriter(
	                          new FileWriter(outFile)));
		
			
			for (Map.Entry<String, Integer> k : orderItemcount.entrySet()) {
				m=k.getKey()+","+k.getValue();
			out.println(m);
				
				
			}
			out.close();
			}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	public static void main(String args[]) {
		OrderItemCount l = new OrderItemCount();
		l.showEvents();
	    l.display();
		l.createCsv();
		
		

	}

}
