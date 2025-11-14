package M6;

import L6.b0;
import o6.m;

/* loaded from: classes.dex */
public final /* synthetic */ class g extends m {
    public static final /* synthetic */ int k = 0;

    static {
        new m(b0.class, "flags", "getFlags$kotlin_metadata()I", 0);
    }

    @Override // o6.m, u6.i
    public final void e(Object obj, Object obj2) {
        ((b0) obj).f3122a = ((Number) obj2).intValue();
    }

    @Override // o6.m, u6.r
    public final Object get(Object obj) {
        return Integer.valueOf(((b0) obj).f3122a);
    }
}
