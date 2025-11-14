package C6;

import F6.AbstractC0051k;
import F6.C0050j;
import a6.AbstractC0438m;
import f7.C0725e;
import h4.AbstractC0832f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC1098d;
import p7.C1332n;
import p7.InterfaceC1333o;
import t6.C1587b;
import t6.C1588c;
import w7.C1747i;
import x7.C1824f;

/* loaded from: classes.dex */
public final class E extends AbstractC0051k {
    public final boolean j;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final C1747i f717l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(v7.k kVar, InterfaceC0006g interfaceC0006g, C0725e c0725e, boolean z8, int i4) {
        super(kVar, interfaceC0006g, c0725e, O.f726a);
        o6.j.e(interfaceC0006g, "container");
        this.j = z8;
        C1588c G8 = AbstractC0832f.G(0, i4);
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(G8, 10));
        Iterator it = G8.iterator();
        while (((C1587b) it).f15128f) {
            int nextInt = ((a6.w) it).nextInt();
            arrayList.add(F6.S.P0(this, w7.X.INVARIANT, C0725e.e("T" + nextInt), nextInt, kVar));
        }
        this.k = arrayList;
        this.f717l = new C1747i(this, AbstractC0021w.c(this), q4.X.T(AbstractC1098d.j(this).o().e()), kVar);
    }

    @Override // C6.InterfaceC0007h
    public final w7.J B() {
        return this.f717l;
    }

    @Override // F6.A
    public final InterfaceC1333o C(C1824f c1824f) {
        return C1332n.f13842b;
    }

    @Override // C6.InterfaceC0004e
    public final boolean D0() {
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final boolean E() {
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final Collection G() {
        return a6.u.f7768d;
    }

    @Override // C6.InterfaceC0004e
    public final boolean N() {
        return false;
    }

    @Override // C6.InterfaceC0022x
    public final boolean c0() {
        return false;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0022x, C6.InterfaceC0013n
    public final C0014o d() {
        C0014o c0014o = AbstractC0015p.f758e;
        o6.j.d(c0014o, "PUBLIC");
        return c0014o;
    }

    @Override // C6.InterfaceC0008i
    public final boolean d0() {
        return this.j;
    }

    @Override // C6.InterfaceC0004e
    public final EnumC0005f e() {
        return EnumC0005f.f741d;
    }

    @Override // C6.InterfaceC0004e
    public final boolean g() {
        return false;
    }

    @Override // D6.a
    public final D6.j getAnnotations() {
        return D6.i.f1043a;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0022x
    public final EnumC0023y j() {
        return EnumC0023y.f778e;
    }

    @Override // C6.InterfaceC0004e
    public final U l0() {
        return null;
    }

    @Override // C6.InterfaceC0004e
    public final boolean m() {
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final C0050j n0() {
        return null;
    }

    @Override // C6.InterfaceC0004e
    public final /* bridge */ /* synthetic */ InterfaceC1333o o0() {
        return C1332n.f13842b;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0008i
    public final List t() {
        return this.k;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        return false;
    }

    @Override // F6.AbstractC0051k, C6.InterfaceC0022x
    public final boolean z() {
        return false;
    }
}
