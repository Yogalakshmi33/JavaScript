package Day3;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setSid(56);
		s1.setSname("yoga");
		s1.setCity("Nowyork");
		/*
		 * System.out.println("Student id:"+s1.getSid());
		 * System.out.println("Student name:"+s1.getSname());
		 * System.out.println("Student city:"+s1.getCity());
		 */
		System.out.println(s1);//object printing calls the tostring()
		Student s2=new Student();
		s2.setSid(67);
		s2.setSname("riya");
		s2.setCity("TamilNadu");
		System.out.println(s1);//object printing calls the tostring()
		Student s3=new Student();
		s3.setSid(60);
		s3.setSname("JYNTU");
		s3.setCity("Frds");
		System.out.println(s3);//object printing calls the tostring()
		

	}

}
