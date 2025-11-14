package b8;

import I7.u;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9253a;

    static {
        Object b4;
        int i4;
        Object obj = null;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            if (property != null) {
                b4 = u.U(property);
            } else {
                b4 = null;
            }
        } catch (Throwable th) {
            b4 = Z5.a.b(th);
        }
        if (!(b4 instanceof Z5.k)) {
            obj = b4;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 2097152;
        }
        f9253a = i4;
    }
}
