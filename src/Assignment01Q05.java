public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {

        int n = m.length;
        int[] dist = new int[n];
        int[] queue = new int[n];
        int front = 0;
        int back = 0;
        int current = 0;
        int k = 0;

        if (i == j)
        {
            return 0;
        }

        for (k = 0; k < n; k++)
        {
            dist[k] = -1;
        }

        queue[back] = i;
        back++;
        dist[i] = 0;

        while (front < back)
        {
            current = queue[front];
            front++;

            for (k = 0; k < n; k++)
            {
                if (m[current][k] == 1 && dist[k] == -1)
                {
                    dist[k] = dist[current] + 1;

                    if (k == j)
                    {
                        return dist[k];
                    }

                    queue[back] = k;
                    back++;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}