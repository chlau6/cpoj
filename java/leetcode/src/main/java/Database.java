import question.Q1;
import question.Q2;
import question.Q283;
import question.Q56;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Database {
    public static final String PACKAGE_NAME_PREFIX = "question";
    public Map<String, List<String>> map = new HashMap<>();

    public void loadQuestion() {
        Database database = new Database();

        database.putMap(Q1.class);
        database.putMap(Q2.class);
        database.putMap(Q56.class);
        database.putMap(Q283.class);
    }

    public void putMap(Class<?> question) {
        Annotation[] annotations;
        try {
            annotations = Class.forName(PACKAGE_NAME_PREFIX + question.getSimpleName()).getAnnotations();
            for (Annotation annotation : annotations) {
                String key = annotation.annotationType().getSimpleName();
                map.computeIfAbsent(key, k -> new ArrayList<>()).add(question.getSimpleName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
