import java.util.Scanner;
public class StudentVoteChecker{
    public boolean canStudentVote(int age){
        if (age < 0){
            return false;
        }
        return (age >= 18);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] studentAges = new int[10];
        StudentVoteChecker obj = new StudentVoteChecker();

        for (int i = 0; i < 10; i++){
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();
            boolean canVote = obj.canStudentVote(studentAges[i]);
            
            if (studentAges[i] < 0){
                System.out.println("Invalid age. Cannot vote.");
            } else{
                System.out.println("Student " + (i + 1) + " can vote: " + canVote);
            }
        }
    }
}
