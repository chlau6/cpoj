package question;

import java.util.*;

public class Q721 {
    Map<String, String> parents = new HashMap<>();
    Map<String, String> emailOwner = new HashMap<>();
    Map<String, Set<String>> union = new HashMap<>();

    public List<List<String>> accountsMerge(List<List<String>> accounts) {

        for (List<String> account : accounts) {
            for (int i = 1; i < account.size(); i++) {
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

            Set<String> set = union.computeIfAbsent(parent, k -> new TreeSet<>());
            for (int i = 1; i < account.size(); i++) {
                set.add(account.get(i));
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : union.entrySet()) {
            List<String> account = new ArrayList<>();
            account.add(emailOwner.get(entry.getKey()));
            account.addAll(entry.getValue());

            ans.add(account);
        }

        return ans;
    }

    private String find(String u) {
        String parent = parents.get(u);
        return u.equals(parent) ? u : find(parent);
    }
}

/*
721. Accounts Merge
 */
