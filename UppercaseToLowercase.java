import java.io.*;

public class UppercaseToLowercase{
    public static void main(String[] args){
        String inputFile = "source.txt";
        String outputFile = "output.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))){
            
            String line;
            while((line = br.readLine()) != null){
				
                String convertedLine = line.toLowerCase();
				
                bw.write(convertedLine);
                bw.newLine();
            }
            System.out.println("File converted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
