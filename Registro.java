public class Registro {

    public static void log(String msg) {
        System.out.println("[LOG] " + msg);
    }

    public static void warn(String msg) {
        System.out.println("[WARN] " + msg);
    }

    public static void error(String msg) {
        System.out.println("[ERROR] " + msg);
    }
}
