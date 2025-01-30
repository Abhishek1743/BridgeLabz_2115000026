import java.util.Scanner;
class Toggle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        System.out.println("String after toggling the case: " + toggleCase(input));
    }

    public static String toggleCase(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            String ch = String.valueOf(chars[i]);
            if (ch.equals(ch.toUpperCase())){
                chars[i] = ch.toLowerCase().charAt(0);
            } else if (ch.equals(ch.toLowerCase())){
                chars[i] = ch.toUpperCase().charAt(0);
            }
        }
        return new String(chars);
    }
}
