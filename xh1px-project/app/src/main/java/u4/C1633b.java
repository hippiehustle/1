package u4;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import g4.C0779a;
import k4.I;
import s3.AbstractC1492c;
import t0.L;
import t0.s0;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1633b extends L {

    /* renamed from: e, reason: collision with root package name */
    public final W4.i f15320e;

    /* renamed from: f, reason: collision with root package name */
    public final d f15321f;

    /* renamed from: g, reason: collision with root package name */
    public final I f15322g;

    public C1633b(W4.i iVar, d dVar, I i4) {
        super(C1632a.f15319d);
        this.f15320e = iVar;
        this.f15321f = dVar;
        this.f15322g = i4;
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        n nVar = (n) s0Var;
        Object g8 = g(i4);
        o6.j.d(g8, "getItem(...)");
        W4.i iVar = this.f15320e;
        o6.j.e(iVar, "itemClickedListener");
        AbstractC1492c.d(nVar.f15349u, (C0779a) g8, true, iVar);
        this.f15322g.l(Integer.valueOf(i4), nVar.f14950a);
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        return new n(F3.d.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }

    @Override // t0.U
    public final void f(s0 s0Var) {
        n nVar = (n) s0Var;
        o6.j.e(nVar, "holder");
        this.f15322g.l(Integer.valueOf(nVar.c()), null);
    }
}
