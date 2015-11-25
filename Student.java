public class Student {
		private final int SIZE = 4;
		private String name;
		private double [] assignmentGrade;
		private double [] assignmentWeight;
		private double gpa;
		public String Grade = "";
		
		
		
		public Student () {
			name = "";
			assignmentGrade = new double[SIZE];
			assignmentWeight = new double[SIZE];
			gpa = 0;
		}

		public Student(String name, double[] assignmentGrade, double[] assignmentWeight) {
			
			this.name = name;
			this.assignmentGrade = assignmentGrade;
			this.assignmentWeight = assignmentWeight;
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double[] getAssignmentGrade() {
			return assignmentGrade;
		}

		public void setAssignmentGrade(double[] assignmentGrade) {
			this.assignmentGrade = assignmentGrade;
		}

		public double[] getAssignmentWeight() {
			return assignmentWeight;
		}
		
		public void setAssignmentWeight(double [] assignmentWeight) {
			this.assignmentWeight = assignmentWeight;
		}
		
		
		
		
		public double getGpa() {
			return calculateAVGScore();
		}

		public void setGpa(double gpa) {
			this.gpa = gpa;
		}
		
		private double calculateAVGScore() {
			double sum = 0;
			if (this.assignmentGrade !=null) {
			for(int i=0; i<assignmentGrade.length; i++) {
				sum +=(assignmentGrade[i]*assignmentWeight[i]);
				
			}
			this.gpa = sum/100;
			}
			
			return this.gpa;
		}
		
		
		
		
		public String toString() {
			String info = "";
			info = "Student Name: " + this.name;
			for(int i=0; i <assignmentGrade.length; i++) {
				info+="\n Assignment " + (i + 1) + "\t" + assignmentGrade[i] + "\n";
			}
		info+= "\nWeighted Average: " + getGpa();
		
		if(this.gpa < .6) {
			Grade = "F";
		}
		
		if(this.gpa < .7) {
			Grade = "D";
		}
		
		if(this.gpa < .8) {
			Grade = "C";
		}
		
		if(this.gpa < .9) {
			Grade = "B";
		}
		
		if(this.gpa > .9) {
			Grade = "A";
		}
		
		
		
		return info + "\nGrade: " + Grade;
			
		}
		
}




