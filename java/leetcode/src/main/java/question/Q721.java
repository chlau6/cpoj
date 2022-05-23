package question;

import java.util.*;

public class Q721 {
    Map<String, Set<String>> union = new HashMap<>();
    Map<String, String> parents = new HashMap<>();
    Map<String, String> emailOwner = new HashMap<>();

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> result = new ArrayList<>();

        for (List<String> account : accounts) {
            int n = account.size();

            for (int i = 1; i < n; i++) {
                parents.put(account.get(i), account.get(i));
                emailOwner.put(account.get(i), account.get(0));
            }
        }

        for (List<String> account : accounts) {
            String parent = find(account.get(1));
            for (int i = 2; i < account.size(); i++) {
                parents.put(find(account.get(i)), parent);
            }
        }

        for (List<String> account : accounts) {
            String parent = find(account.get(1));
            union.putIfAbsent(parent, new TreeSet<>());

            for (int i = 1; i < account.size(); i++) {
                union.get(parent).add(account.get(i));
            }
        }

        for (Map.Entry<String, Set<String>> entry : union.entrySet()) {
            List<String> subList = new ArrayList<>();
            subList.add(emailOwner.get(entry.getKey()));
            subList.addAll(entry.getValue());

            result.add(subList);
        }

        return result;
    }

    public String find(String email) {
        String parent = parents.get(email);

        if (parent.equals(email)) {
            return parent;
        } else {
            String root = find(parent);

            parents.put(email, root);

            return root;
        }
    }
}

/*
721. Accounts Merge
 */
