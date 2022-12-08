import sun.misc.Unsafe;
public class Main {
    static final Unsafe unsafe = Unsafe.getUnsafe();
    public static void test() {
        unsafe.setMemory(100, 100, (byte) 0x0000);
    }
    public static void main(String[] args) {
        test();
    }
}