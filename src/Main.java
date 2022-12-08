import sun.misc.Unsafe;

public class Crash {
    private static final Unsafe unsafe = Unsafe.getUnsafe();
    public static void crash() {
        unsafe.putAddress(0, 0);
    }
    public static void main(String[] args) {
        crash();
    }
}