package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String cpd : cpdomains) {
            int i = cpd.indexOf(' ');
            int count = Integer.parseInt(cpd.substring(0, i));

            String fqdn = cpd.substring(i + 1);
            int len = fqdn.length();

            map.put(fqdn, map.getOrDefault(fqdn, 0) + count);

            for (int j = 0; j < len; j++) {
                if (fqdn.charAt(j) == '.') {
                    String topLevel = fqdn.substring(j + 1);
                    map.put(topLevel, map.getOrDefault(topLevel, 0) + count);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }

        return result;
    }
}

/*
811. Subdomain Visit Count
 */
