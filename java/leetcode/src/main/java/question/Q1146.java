package question;

import java.util.TreeMap;

public class Q1146 {
    class SnapshotArray {
        int[] array;
        int id = 0;
        TreeMap<Integer, Integer>[] version;
        public SnapshotArray(int length) {
            version = new TreeMap[length];

            for (int i = 0; i < length; i++) {
                version[i] = new TreeMap<>();
                version[i].put(0, 0);
            }
        }

        public void set(int index, int val) {
            version[index].put(id, val);
        }

        public int snap() {
            return id++;
        }

        public int get(int index, int snap_id) {
            return version[index].floorEntry(snap_id).getValue();
        }
    }
}

/*
1146. Snapshot Array
 */
