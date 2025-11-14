package L7;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final B f3172a;

    static {
        String str;
        boolean z8;
        B b4;
        int i4 = Q7.u.f4970a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z8 = Boolean.parseBoolean(str);
        } else {
            z8 = false;
        }
        if (!z8) {
            b4 = RunnableC0167z.f3262m;
        } else {
            S7.e eVar = F.f3175a;
            M7.e eVar2 = Q7.n.f4962a;
            M7.e eVar3 = eVar2.f3507h;
            b4 = eVar2;
            if (eVar2 == null) {
                b4 = RunnableC0167z.f3262m;
            }
        }
        f3172a = b4;
    }
}
