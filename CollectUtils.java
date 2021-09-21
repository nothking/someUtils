import java.util.Collection;

public class CollectUtils {
    public static void main(String[] args) {

    }

    /**
     * Collect to String with ,
     * 
     * @param <T>
     * @param collect
     * @return
     */
    public static <T> String c2s(Collection<T> collect) {
        StringBuilder sb = new StringBuilder();
        for (T item : collect) {
            sb.append(item).append(',');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

}
