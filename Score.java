public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] assignmentGrade = {.90,1.00,.85,.65};
		double[] assignmentWeight = {25,35,15,25};
		
		Student student = new Student("Tim", assignmentGrade, assignmentWeight);
		System.out.println(student);
	}

}

