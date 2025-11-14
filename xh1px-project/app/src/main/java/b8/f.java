package b8;

import O7.Y;

/* loaded from: classes.dex */
public final class f extends N.f {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9260g;

    public f(Y y4, boolean z8) {
        super(y4);
        this.f9260g = z8;
    }

    @Override // N.f
    public final void m(String str) {
        o6.j.e(str, "value");
        if (this.f9260g) {
            super.m(str);
        } else {
            k(str);
        }
    }
}
