package M6;

import L6.Y;
import o6.m;

/* loaded from: classes.dex */
public final /* synthetic */ class f extends m {
    public static final /* synthetic */ int k = 0;

    static {
        new m(Y.class, "flags", "getFlags$kotlin_metadata()I", 0);
    }

    @Override // o6.m, u6.i
    public final void e(Object obj, Object obj2) {
        ((Y) obj).f3108a = ((Number) obj2).intValue();
    }

    @Override // o6.m, u6.r
    public final Object get(Object obj) {
        return Integer.valueOf(((Y) obj).f3108a);
    }
}
