import sun.misc.Unsafe;
public class Main {
    public static void main(String[] args) {
        final Unsafe unsafe = Unsafe.getUnsafe();
        unsafe.setMemory(100, 100, (byte) 0x0000);
    }
}