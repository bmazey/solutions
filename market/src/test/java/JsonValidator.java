import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonValidator {

    /**
     * This class has a method which checks to make sure that a given String is valid JSON ...
     * @param json
     * @return
     */

    public static boolean isValidJSON(final String json) {
        boolean valid = false;
        try {
            final JsonParser parser = new ObjectMapper().getFactory()
                    .createParser(json);
            while (parser.nextToken() != null) {
            }
            valid = true;
        } catch (JsonParseException jpe) {
            jpe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return valid;
    }
}
