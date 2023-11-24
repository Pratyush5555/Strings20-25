package String;

public class SchoolDetails {
     public static void main(String[] args) {
		Teacherdetails td= new Teacherdetails();
		
		td.teach();
		
		TeacherName tn = new TeacherName("Ramesh");
		tn.greet();
		
		Info info1 = td;
		info1.showInfo();
		
		Info info2 = tn;
		info2.showInfo();
		
		outputInfo(td);
		outputInfo(tn);
		
		}
     private static void outputInfo(Info info) {
    	 info.showInfo();
    	 
     }
}
