package P;

import a.AbstractC0405a;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f4277a;

    /* renamed from: b, reason: collision with root package name */
    public H.c[] f4278b;

    public i0() {
        this(new t0());
    }

    public final void a() {
        H.c[] cVarArr = this.f4278b;
        if (cVarArr != null) {
            H.c cVar = cVarArr[0];
            H.c cVar2 = cVarArr[1];
            t0 t0Var = this.f4277a;
            if (cVar2 == null) {
                cVar2 = t0Var.f4308a.f(2);
            }
            if (cVar == null) {
                cVar = t0Var.f4308a.f(1);
            }
            g(H.c.a(cVar, cVar2));
            H.c cVar3 = this.f4278b[AbstractC0405a.W(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            H.c cVar4 = this.f4278b[AbstractC0405a.W(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            H.c cVar5 = this.f4278b[AbstractC0405a.W(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract t0 b();

    public void c(int i4, H.c cVar) {
        if (this.f4278b == null) {
            this.f4278b = new H.c[10];
        }
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((i4 & i8) != 0) {
                this.f4278b[AbstractC0405a.W(i8)] = cVar;
            }
        }
    }

    public abstract void e(H.c cVar);

    public abstract void g(H.c cVar);

    public i0(t0 t0Var) {
        this.f4277a = t0Var;
    }

    public void d(H.c cVar) {
    }

    public void f(H.c cVar) {
    }

    public void h(H.c cVar) {
    }
}
