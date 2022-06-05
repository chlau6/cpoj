package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1993 {
    class LockingTree {
        int[] lock;
        int[] parent;
        Map<Integer, List<Integer>> des = new HashMap<>();

        public LockingTree(int[] parent) {
            int n = parent.length;
            lock = new int[n];
            this.parent = parent;

            for (int i = 0; i < n; i++) {
                lock[i] = -1;

                des.putIfAbsent(i, new ArrayList<>());
                des.putIfAbsent(parent[i], new ArrayList<>());
                des.get(parent[i]).add(i);
            }
        }

        public boolean lock(int num, int user) {
            if (lock[num] != -1) return false;

            lock[num] = user;
            return true;
        }

        public boolean unlock(int num, int user) {
            if (lock[num] != user) return false;

            lock[num] = -1;
            return true;
        }

        public boolean upgrade(int num, int user) {
            if (lock[num] != -1) return false;

            if (!isDescendantLock(num)) return false;

            if (isAncestorLock(num)) return false;

            upgradeUnlock(num);

            lock[num] = user;

            return true;
        }

        private boolean isDescendantLock(int num) {
            if (lock[num] != -1) return true;

            for (int d : des.get(num)) {
                if (isDescendantLock(d)) return true;
            }

            return false;
        }

        private boolean isAncestorLock(int num) {
            int p = parent[num];

            if (p == -1) return false;

            if (lock[p] != -1) return true;

            return isAncestorLock(p);
        }

        private void upgradeUnlock(int num) {
            for (int d : des.get(num)) {
                lock[d] = -1;

                upgradeUnlock(d);
            }
        }
    }
}
/*
1993. Operations on Tree
 */
