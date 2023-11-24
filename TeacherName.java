package String;

public class TeacherName implements Info{
	
	private String name;
	
    public TeacherName(String name) {

		this.name = name;
	}

	public void greet() {
    	System.out.println("hello there.");
    }

	
	public void showInfo() {
		System.out.println("name is :"+ name);
		
	}
}
