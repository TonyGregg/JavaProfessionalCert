package lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by anton on 6/7/2018 9:56 PM
 **/
public class CustomFileReader implements BufferedReaderProcessor{

    public static String processFile(BufferedReaderProcessor bufferedReaderProcessor) throws IOException {

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\anton\\Documents\\trimmer_reset.txt"))){
            return bufferedReaderProcessor.process(br);
        }
    }

    public static void main(String[] args) throws IOException {
//        String out = processFile();
//        System.out.println(out);

        CustomFileReader customFileReader = new CustomFileReader();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\anton\\Documents\\trimmer_reset.txt"));
        String output = customFileReader.process(bufferedReader);

        System.out.printf("# complete output using regular overrride\n");
        System.out.println(output);

        String towLne = processFile((BufferedReader br)-> {
                return  br.readLine() + br.readLine();
            }
        );

        System.out.println("Just 2 lines "+towLne);



    }

    @Override
    public  String process(BufferedReader bf) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        String aLine = null;
        while((aLine = bf.readLine())!=null) {
            stringBuilder.append(aLine);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }
}
