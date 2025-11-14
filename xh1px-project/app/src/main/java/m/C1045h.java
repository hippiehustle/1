package m;

import P.V;
import o.l1;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045h extends E2.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12366f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12367g;

    /* renamed from: h, reason: collision with root package name */
    public int f12368h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12369i;

    public C1045h(C1046i c1046i) {
        this.f12366f = 0;
        this.f12369i = c1046i;
        this.f12367g = false;
        this.f12368h = 0;
    }

    @Override // E2.c, P.V
    public final void F() {
        switch (this.f12366f) {
            case 0:
                if (!this.f12367g) {
                    this.f12367g = true;
                    V v8 = ((C1046i) this.f12369i).f12373d;
                    if (v8 != null) {
                        v8.F();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((l1) this.f12369i).f13300a.setVisibility(0);
                return;
        }
    }

    @Override // P.V
    public final void c() {
        switch (this.f12366f) {
            case 0:
                int i4 = this.f12368h + 1;
                this.f12368h = i4;
                C1046i c1046i = (C1046i) this.f12369i;
                if (i4 == c1046i.f12370a.size()) {
                    V v8 = c1046i.f12373d;
                    if (v8 != null) {
                        v8.c();
                    }
                    this.f12368h = 0;
                    this.f12367g = false;
                    c1046i.f12374e = false;
                    return;
                }
                return;
            default:
                if (!this.f12367g) {
                    ((l1) this.f12369i).f13300a.setVisibility(this.f12368h);
                    return;
                }
                return;
        }
    }

    @Override // E2.c, P.V
    public void d() {
        switch (this.f12366f) {
            case 1:
                this.f12367g = true;
                return;
            default:
                return;
        }
    }

    public C1045h(l1 l1Var, int i4) {
        this.f12366f = 1;
        this.f12369i = l1Var;
        this.f12368h = i4;
        this.f12367g = false;
    }
}
