package String;

class Frog{
	
	private int id;
	private String name;
	
	public Frog(int id , String name) {
		this.id = id;
		this.name = name;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(":").append(name);
		
		return sb.toString();
		//return id + ": "+name;
	}
}

public class ToStringAndObjectClass {
    public static void main(String[] args) {
    	Frog f = new Frog(7,"chotu");
		System.out.println(f);
	}
}
