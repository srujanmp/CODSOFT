import java.util.Scanner;
public class StudentGradeCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of subjects: ");
		int nosubjects=sc.nextInt();
		
		int[] subject=new int[nosubjects];      
		
		int totalmarks=0;
		
		for(int i=0;i<nosubjects;i++) {
			System.out.println("Enter the marks obtained (out of 100) in Subject "+(i+1)+": ");
			subject[i]=sc.nextInt();
			
			totalmarks+=subject[i]; //Calculating sum of marks in all subjects
		}
		
		double averagepercent=(totalmarks/nosubjects);  //Calculating average percentage
		char grade;
		
		switch((int)averagepercent/10) {
		// for >= 90
		case 10:
        case 9:
           grade = 'A';
           break;
        // for >= 80 and <90
        case 8:
           grade = 'B';
           break;
        // for >= 70 and <80
        case 7:
           grade = 'C';
           break;
        // for >= 60 and <70
        case 6:
           grade = 'D';
           break;
        // for >= 50 and <60
        case 5:
           grade = 'E';
           break;
        // for < 50
        default:
           grade = 'F';
           break;
        }
		
		System.out.println("Total Marks = "+totalmarks);
		System.out.println("Average Percentage = "+averagepercent);
		System.out.println("Grade = "+grade);
		
		
	}
}
