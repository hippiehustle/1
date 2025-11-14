package q3;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import h6.AbstractC0837b;
import k3.C0965l;
import t0.L;
import t0.s0;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1368b extends L {

    /* renamed from: e, reason: collision with root package name */
    public final W4.i f13978e;

    /* renamed from: f, reason: collision with root package name */
    public final W4.i f13979f;

    public C1368b(W4.i iVar, W4.i iVar2) {
        super(C1367a.f13977d);
        this.f13978e = iVar;
        this.f13979f = iVar2;
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        Object g8 = g(i4);
        o6.j.d(g8, "getItem(...)");
        W4.i iVar = this.f13978e;
        o6.j.e(iVar, "actionClickedListener");
        AbstractC0837b.q(((n) s0Var).f14011u, (C0965l) g8, true, iVar);
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        return new n(F3.a.u(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }
}
