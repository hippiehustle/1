package androidx.lifecycle;

import g0.AbstractComponentCallbacksC0755y;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: d, reason: collision with root package name */
    public final D f8763d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8764e;

    /* renamed from: f, reason: collision with root package name */
    public int f8765f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C f8766g;

    public B(C c6, D d2) {
        this.f8766g = c6;
        this.f8763d = d2;
    }

    public final void b(boolean z8) {
        int i4;
        if (z8 != this.f8764e) {
            this.f8764e = z8;
            if (z8) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            C c6 = this.f8766g;
            int i8 = c6.f8769c;
            c6.f8769c = i4 + i8;
            if (!c6.f8770d) {
                c6.f8770d = true;
                while (true) {
                    try {
                        int i9 = c6.f8769c;
                        if (i8 == i9) {
                            break;
                        } else {
                            i8 = i9;
                        }
                    } finally {
                        c6.f8770d = false;
                    }
                }
            }
            if (this.f8764e) {
                c6.c(this);
            }
        }
    }

    public void c() {
    }

    public boolean d(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        return false;
    }

    public abstract boolean e();
}
