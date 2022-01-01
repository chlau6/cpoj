package question;

import java.util.HashSet;
import java.util.Set;

public class Q489 {
    /*
    Time Complexity: O(mn)   Space Complexity: O(mn)
     */

    private int[][] directions = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public void cleanRoom(Robot robot) {
        Set<String> visited = new HashSet<>();
        dfs(robot, 0, 0, 0, visited);
    }

    private void dfs(Robot robot, int x, int y, int dir, Set<String> visited) {
        robot.clean();
        visited.add(x + "-" + y);

        for (int i = 0; i < 4; i++) {
            int curr = (i + dir) % 4;
            int newX = x + directions[curr][0];
            int newY = y + directions[curr][1];

            if (!visited.contains(newX + "-" + newY) && robot.move()) {
                dfs(robot, newX, newY, curr, visited);
                robot.turnRight();
                robot.turnRight();
                robot.move();
                robot.turnLeft();
                robot.turnLeft();
            }
            robot.turnRight();
        }
    }

    class Robot {
        public void clean() {

        }

        public boolean move() {
            return false;
        }

        public void turnLeft() {

        }

        public void turnRight() {

        }
    }

}

/*
489. Robot Room Cleaner
 */
