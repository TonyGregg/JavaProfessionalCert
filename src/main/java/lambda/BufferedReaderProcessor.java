package lambda;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by anton on 6/7/2018 10:04 PM
 **/
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader bf) throws IOException;
}
