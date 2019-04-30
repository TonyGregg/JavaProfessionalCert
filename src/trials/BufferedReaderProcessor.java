package trials;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by genil on 2019-04-30 at 04 35
 **/

@FunctionalInterface
public interface BufferedReaderProcessor {
    public String process(BufferedReader bufferedReader) throws IOException;
}
