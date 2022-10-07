package assignment1part2;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import assignment1.CourseProgramme;
import assignment1.Lecturer;
import assignment1.Module;
import assignment1.Student;

public class test {
	
	public static void main(String[] args){
		DateTime start1 = new DateTime(2013,8,14,0,0,0);
		DateTime end1 = new DateTime(2013,8,16,0,0,0);
		List<Student> Estudents = new ArrayList<Student>();
		List<Module> Emodules = new ArrayList<Module>();
		List<Lecturer> Electurers = new ArrayList<Lecturer>();
		List<Student> Mstudents = new ArrayList<Student>();
		List<Module> Mmodules = new ArrayList<Module>();
		List<Lecturer> Mlecturers = new ArrayList<Lecturer>();
		List<CourseProgramme> Ecourses = new ArrayList<CourseProgramme>();
		List<CourseProgramme> Mcourses = new ArrayList<CourseProgramme>();

		CourseProgramme literature = new CourseProgramme("literature",Emodules,Estudents,start1,end1);
		CourseProgramme maths = new CourseProgramme("maths",Mmodules,Mstudents,start1,end1);
		Student john = new Student("John McGuinness", 23,"22/6/1999", 1, Ecourses);
		Student tom = new Student("tom McGuinness", 21,"3/8/2001", 2, Mcourses);
		Student randy = new Student("randy McGuinness", 31,"3/4/1999", 3, Mcourses);
		Lecturer jim = new Lecturer("Jim McGuinness", 65,"22/6/1945", 1, Ecourses);
		Lecturer Tim = new Lecturer("tim McGuinness", 35,"31/6/1945", 2, Ecourses);
		Lecturer kim = new Lecturer("kim McGuinness", 44,"21/6/1966", 3, Mcourses);
		Module english = new Module("english",Estudents, Electurers,Ecourses);
		Module poetry = new Module("poetry",Estudents, Electurers,Ecourses);
		Module math = new Module("math",Mstudents, Mlecturers,Mcourses);
		Module algorithims = new Module("algorithims",Mstudents, Mlecturers,Mcourses);
		Ecourses.add(literature);
		Emodules.add(english);
		Emodules.add(poetry);
		Estudents.add(john);
		Electurers.add(jim);
		Electurers.add(Tim);
		Mcourses.add(maths);
		Mmodules.add(algorithims);
		Mmodules.add(math);
		Mstudents.add(randy);
		Mstudents.add(tom);
		Mlecturers.add(kim);


		System.out.println(Estudents);
		System.out.println(Emodules);
		System.out.println(Ecourses);
		System.out.println(Electurers);
		System.out.println(Mstudents);
		System.out.println(Mmodules);
		System.out.println(Mcourses);
		System.out.println(Mlecturers);


	}

}
