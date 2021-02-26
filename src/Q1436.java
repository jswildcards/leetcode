import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1436 {
    public String destCity(List<List<String>> p) {
        Map<String, String> m = new HashMap<>();

        for (List<String> q : p)
            m.put(q.get(0), q.get(1));

        for (Map.Entry<String, String> q : m.entrySet()) {
            if (!m.containsKey(q.getValue()))
                return q.getValue();
        }

        return null;
    }
}
