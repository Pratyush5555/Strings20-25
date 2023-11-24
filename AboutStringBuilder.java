package String;

public class AboutStringBuilder {
    public static void main(String[] args) {
    	//inefficient
		String info = "";
		
		info += "My name is Ram.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		//more efficient.
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sita.");
		sb.append(" ");
		sb.append("I am a women");
		System.out.println(sb.toString());
		
		
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append("My name is Spider.")
		.append(" ")
		.append("I am a rider.");
		
		System.out.println(sb1.toString());
		
		///////////////Formatting///////////////////////
		
		System.out.print("Here is some text.\tThat was a tab.\nThar was a new line.");
		System.out.println(" More text.");
		
		System.out.printf("Total cost is %d; Quantity is %d\n",120,6);
		
		for(int i = 0; i<6 ; i++) {
			//System.out.printf("%2d:some text here\n",i);OR
			System.out.printf("%2d: %s\n",i,"here is some text.");
		}
		
		
	}
}
