import java.io.*;
import java.util.*;

public class Template {
    static class FastIO extends PrintWriter {
        private BufferedReader br;
        private StringTokenizer st;

        public FastIO() {
            this(System.in, System.out);
        }

        public FastIO(InputStream in, OutputStream out) {
            super(out);
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastIO(String problemName) throws IOException {
            super(new FileWriter(problemName + ".out"));
            br = new BufferedReader(new FileReader(problemName + ".in"));
        }

        public String next() {
            try {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                return st.nextToken();
            }  catch (Exception e) {}
            return null;
        }

        public String nextLine() {
            try { return br.readLine(); }
            catch (Exception e) {}
            return null;
        }

        public int nextInt() { return Integer.parseInt(next()); }
        public long nextLong() { return Long.parseLong(next()); }
        public float nextFloat() { return Float.parseFloat(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public boolean nextBoolean() { return Boolean.parseBoolean(next()); }
    }

    public static void main(String[] args) {
        FastIO io = new FastIO();
        io.close();
    }
}
