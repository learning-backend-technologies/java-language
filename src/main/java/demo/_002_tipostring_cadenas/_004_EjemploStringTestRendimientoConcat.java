package demo._002_tipostring_cadenas;

public class _004_EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
//             c += a + b + "\n"; // 500 => 19ms, 1000 => 21ms, 10000 => 68ms, 100000 => 1976ms
//             c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 4ms, 10000 => 105ms, 100000 => 5071ms
            sb.append(i).append(" - ").append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 2ms, 100000 => 8ms
        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.out.println((fin - inicio) + "ms");
        System.exit(0);
    }
}
