package M6;

import L6.W;
import o6.m;

/* loaded from: classes.dex */
public final /* synthetic */ class e extends m {
    public static final e k = new m(W.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override // o6.m, u6.i
    public final void e(Object obj, Object obj2) {
        ((W) obj).f3097a = ((Number) obj2).intValue();
    }

    @Override // o6.m, u6.r
    public final Object get(Object obj) {
        return Integer.valueOf(((W) obj).f3097a);
    }
}
