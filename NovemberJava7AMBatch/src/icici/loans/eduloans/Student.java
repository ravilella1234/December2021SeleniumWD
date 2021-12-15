package icici.loans.eduloans;

class Student 
{
	int sno;
	String sname;
	
	public Student(int sno, String sname) 
	{
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Override
	public String toString() 
	{
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) 
	{
		Student s = new Student(100,"ravi");
		//System.out.println(s.sno);
		//System.out.println(s.sname);
		
		System.out.println(s);
		
		Student s1 = new Student(10, "s1");
		Student s2 = new Student(20, "s2");
		Student s3 = new Student(30, "s3");
		Student s4 = new Student(40, "s4");
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		//System.out.println(s4);
		
		Student[] st = new Student[4];
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;
		
		for(Student i:st)
		{
			System.out.println(i);
		}
		
		
	}

}
