package G6;

import C6.b0;
import C6.c0;
import C6.d0;
import C6.g0;
import C6.h0;
import b6.C0538f;
import o6.j;

/* loaded from: classes.dex */
public final class a extends h0 {

    /* renamed from: g, reason: collision with root package name */
    public static final a f1842g = new h0("package", false);

    @Override // C6.h0
    public final Integer a(h0 h0Var) {
        j.e(h0Var, "visibility");
        if (this == h0Var) {
            return 0;
        }
        C0538f c0538f = g0.f748a;
        if (h0Var != b0.f734g && h0Var != c0.f735g) {
            return -1;
        }
        return 1;
    }

    @Override // C6.h0
    public final String d() {
        return "public/*package*/";
    }

    @Override // C6.h0
    public final h0 k() {
        return d0.f739g;
    }
}
