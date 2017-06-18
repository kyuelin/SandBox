package dev.kyuelin.beaniodemo.utils;

import java.util.Map;
import com.google.gson.Gson;

/**
 * Created by kennethlin on 6/4/17.
 */
public class PrintUtil {
    public static String mapToJson (Map input) {
        Gson gson = new Gson();
        return gson.toJson(input).toString();
    }
}
