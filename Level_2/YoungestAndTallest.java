import java.util.Scanner;
class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age of Amar: ");
        int ageAmar = input.nextInt();
		System.out.print("Enter the age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = input.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        int heightAmar = input.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        int heightAkbar = input.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        int heightAnthony = input.nextInt();
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if(youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else{
            youngestFriend = "Anthony";
        }
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if(tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else{
            tallestFriend = "Anthony";
        }
        System.out.println("The youngest friend is " + youngestFriend + " with an age of " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with a height of " + tallestHeight + " cm.");
    }
}
