package Feb12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class Student{
	private int sid;
	private String sname;
	private float sfees;
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getSfees() {
		return sfees;
	}
	public void setSfees(float sfees) {
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
}
class SortStudentByFees implements Comparator<Student>{


	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getSfees()<s2.getSfees())
			return -1;
		else if(s1.getSfees()>s2.getSfees())
			return 1;
		else 
			return 0;
	}
	
}

public class Feessort {


	public static void main(String[] args) {
		Student s1=new Student(1,"Kiran",7654.3f);
		Student s2=new Student(2,"Sweta",9654.3f);
		Student s3=new Student(3,"Manoj",1654.3f);
		Student s4=new Student(4,"Neha",4654.3f);
		Student s5=new Student(5,"Navya",2654.3f);
		
		//ArrayList for userdefined data type
		
		ArrayList<Student> slist = new ArrayList<Student>();
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		slist.add(s5);
		
		System.out.println(slist);
		
		Iterator<Student> sit=slist.iterator();
		
		System.out.println("SID\tSname\tSfees");
		System.out.println("____________________________");
		while(sit.hasNext()) {
			//System.out.println(sit.next());
			Student s = sit.next();
			System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getSfees());
		}
		 //sorted in ascending
		SortStudentByFees sortfees = new SortStudentByFees();
		
		Collections.sort(slist,sortfees);
		
		Iterator<Student> sit1=slist.iterator();
		
      System.out.println("Student data after sorting");
		System.out.println("SID\tSname\tSfees");
		System.out.println("____________________________");
		while(sit1.hasNext()) {
			//System.out.println(sit.next());
			Student s = sit1.next();
			System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getSfees());
		}
	}
}
