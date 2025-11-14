package L7;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3224a = new ThreadLocal();

    public static P a() {
        ThreadLocal threadLocal = f3224a;
        P p8 = (P) threadLocal.get();
        if (p8 == null) {
            C0146d c0146d = new C0146d(Thread.currentThread());
            threadLocal.set(c0146d);
            return c0146d;
        }
        return p8;
    }
}
