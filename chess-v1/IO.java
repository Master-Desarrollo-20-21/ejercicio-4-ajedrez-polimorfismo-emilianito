import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IO {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public void writeln() {
        System.out.println();
    }

    public void writeln(String s) {
        System.out.println(s);
    }

    public void write(String s) {
        System.out.print(s);
    }

    public int readInt(String s){
        boolean ok = false;
        int value = 0;
        do {
            try {
                System.out.print(s);
                value = Integer.parseInt(bufferedReader.readLine());
                ok = true;
            } catch (Exception ex) {
                System.out.println("ERROR DE FORMATO");
            }
        } while(!ok);

        return value;
    }
}
