package singleton;

public class GlobalClass {
    protected int m_value;

    private static GlobalClass global_ptr = null;

    public static GlobalClass Instance() {
        if (global_ptr == null) {
            global_ptr = new GlobalClass();
        }
        return global_ptr;
    }

    public static GlobalClass Instance(int v) {
        if (global_ptr == null) {
            global_ptr = new GlobalClass(v);
        }
        return global_ptr;
    }

    private GlobalClass() {
        m_value = 0;
    }

    private GlobalClass(int v) {
        m_value = v;
    }

    public int get_value() {
        return m_value;
    }

    public void set_value(int v) {
        m_value = v;
    }
};