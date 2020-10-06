package commons;

public class ConvertUtils {
    public static String normalizeString(String string){
        StringBuffer stringBuffer = new StringBuffer(string.substring(0,1).toLowerCase());
        stringBuffer.append(string.substring(1).toLowerCase());

        return stringBuffer.toString();
    }
}
