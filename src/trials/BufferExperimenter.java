package trials;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by genil on 2019-04-30 at 04 58
 **/
public class BufferExperimenter {

    public String processFile(BufferedReaderProcessor bufferedReaderProcessor) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("file.text"));

        return bufferedReaderProcessor.process(bufferedReader);
    }

    public static void main(String[] args) {
        BufferExperimenter bufferExperimenter = new BufferExperimenter();
        try {
            String oneLine = bufferExperimenter.processFile(BufferedReader::readLine);
            String twoLines = bufferExperimenter.processFile((BufferedReader a) ->
                    a.readLine()+a.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
