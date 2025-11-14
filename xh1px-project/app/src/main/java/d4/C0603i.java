package d4;

import O7.InterfaceC0234g;
import Z5.y;
import a6.AbstractC0436k;
import android.os.Build;
import b6.C0535c;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f1.A0;
import f1.B0;
import f1.C0;
import f1.C0698v0;
import f1.C0700w0;
import f1.C0702x0;
import f1.C0704y0;
import f1.C0706z0;
import f1.D0;
import f1.E0;
import f1.F0;
import f1.G0;
import f1.H0;
import f1.I0;
import f1.J0;
import f1.K0;
import f1.L0;
import f1.M0;
import f1.N0;
import f1.O0;
import f1.P0;
import f1.Q0;
import f1.R0;
import f1.S0;
import f1.T0;
import f1.U0;
import f1.V0;
import f1.W0;
import f1.X0;
import f1.Y0;
import f1.Z0;
import f1.a1;
import f1.b1;
import f1.c1;
import f1.d1;
import f1.e1;
import f1.f1;
import f1.g1;
import f1.h1;
import f1.i1;
import f1.j1;
import f1.k1;
import f1.l1;
import f1.m1;
import f1.n1;
import f1.o1;
import f1.p1;
import f1.q1;
import f1.r1;
import f6.AbstractC0720j;
import java.util.List;
import n6.InterfaceC1164c;
import q4.X;

/* renamed from: d4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f10387h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10388i;

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0603i) p((InterfaceC0617c) obj2, (InterfaceC0234g) obj)).v(y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f6.j, d4.i, d6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        ?? abstractC0720j = new AbstractC0720j(2, interfaceC0617c);
        abstractC0720j.f10388i = obj;
        return abstractC0720j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0234g interfaceC0234g = (InterfaceC0234g) this.f10388i;
        int i4 = this.f10387h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0535c i8 = E2.d.i();
            i8.add(F0.k);
            i8.add(Q0.k);
            i8.add(b1.k);
            i8.add(m1.k);
            i8.add(n1.k);
            i8.add(o1.k);
            i8.add(p1.k);
            i8.add(q1.k);
            i8.add(r1.k);
            i8.add(C0698v0.k);
            i8.add(C0700w0.k);
            i8.add(C0702x0.k);
            i8.add(C0704y0.k);
            i8.add(C0706z0.k);
            i8.add(A0.k);
            i8.add(B0.k);
            i8.add(C0.k);
            i8.add(D0.k);
            i8.add(E0.k);
            i8.add(G0.k);
            i8.add(H0.k);
            i8.add(I0.k);
            i8.add(J0.k);
            i8.add(K0.k);
            i8.add(L0.k);
            i8.add(M0.k);
            i8.add(N0.k);
            i8.add(O0.k);
            i8.add(P0.k);
            i8.add(R0.k);
            i8.add(S0.k);
            i8.add(T0.k);
            i8.add(U0.k);
            i8.add(V0.k);
            i8.add(W0.k);
            i8.add(X0.k);
            i8.add(Y0.k);
            i8.add(Z0.k);
            i8.add(a1.k);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 34) {
                i8.add(c1.k);
            }
            if (i9 >= 33) {
                i8.add(d1.k);
            }
            if (i9 >= 31) {
                i8.add(e1.k);
                i8.add(f1.k);
            }
            if (i9 >= 30) {
                i8.add(g1.k);
            }
            if (i9 >= 29) {
                i8.add(h1.k);
                i8.add(i1.k);
                i8.add(j1.k);
            }
            if (i9 >= 27) {
                i8.add(k1.k);
            }
            if (i9 >= 26) {
                i8.add(l1.k);
            }
            List L02 = AbstractC0436k.L0(X.b0(E2.d.f(i8)), new A0.i(18));
            this.f10388i = null;
            this.f10387h = 1;
            Object n3 = interfaceC0234g.n(L02, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (n3 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
