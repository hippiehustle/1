package M6;

import L6.L;
import o6.m;

/* loaded from: classes.dex */
public final /* synthetic */ class a extends m {
    public static final a k = new m(L.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override // o6.m, u6.i
    public final void e(Object obj, Object obj2) {
        ((L) obj).f3057a = ((Number) obj2).intValue();
    }

    @Override // o6.m, u6.r
    public final Object get(Object obj) {
        return Integer.valueOf(((L) obj).f3057a);
    }
}
