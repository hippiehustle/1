package A6;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0005f;
import C6.EnumC0023y;
import C6.F;
import C6.InterfaceC0010k;
import C6.O;
import C6.U;
import F6.AbstractC0042b;
import F6.C0050j;
import F6.S;
import Z5.y;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a6.s;
import a6.w;
import f7.C0722b;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p7.AbstractC1326h;
import p7.C1332n;
import p7.InterfaceC1333o;
import t6.C1586a;
import t6.C1587b;
import t7.C1593c;
import w7.J;
import w7.X;
import x7.C1824f;
import z6.n;

/* loaded from: classes.dex */
public final class c extends AbstractC0042b {

    /* renamed from: o, reason: collision with root package name */
    public static final C0722b f390o = new C0722b(n.k, C0725e.e("Function"));

    /* renamed from: p, reason: collision with root package name */
    public static final C0722b f391p = new C0722b(n.f16801i, C0725e.e("KFunction"));

    /* renamed from: h, reason: collision with root package name */
    public final v7.k f392h;

    /* renamed from: i, reason: collision with root package name */
    public final F f393i;
    public final k j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final b f394l;

    /* renamed from: m, reason: collision with root package name */
    public final e f395m;

    /* renamed from: n, reason: collision with root package name */
    public final List f396n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v2, types: [p7.h, A6.e] */
    public c(v7.k kVar, C1593c c1593c, k kVar2, int i4) {
        super(kVar, kVar2.a(i4));
        o6.j.e(c1593c, "containingDeclaration");
        this.f392h = kVar;
        this.f393i = c1593c;
        this.j = kVar2;
        this.k = i4;
        this.f394l = new b(this);
        this.f395m = new AbstractC1326h(kVar, this);
        ArrayList arrayList = new ArrayList();
        C1586a c1586a = new C1586a(1, i4, 1);
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(c1586a, 10));
        Iterator it = c1586a.iterator();
        while (((C1587b) it).f15128f) {
            arrayList.add(S.P0(this, X.IN_VARIANCE, C0725e.e("P" + ((w) it).nextInt()), arrayList.size(), this.f392h));
            arrayList2.add(y.f7506a);
        }
        arrayList.add(S.P0(this, X.OUT_VARIANCE, C0725e.e("R"), arrayList.size(), this.f392h));
        this.f396n = AbstractC0436k.Q0(arrayList);
        k kVar3 = this.j;
        d.f397d.getClass();
        o6.j.e(kVar3, "functionTypeKind");
        if (kVar3.equals(g.f399c) || kVar3.equals(j.f402c) || kVar3.equals(h.f400c)) {
            return;
        }
        kVar3.equals(i.f401c);
    }

    @Override // C6.InterfaceC0007h
    public final J B() {
        return this.f394l;
    }

    @Override // F6.A
    public final InterfaceC1333o C(C1824f c1824f) {
        return this.f395m;
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
    public final /* bridge */ /* synthetic */ Collection G() {
        return s.f7766d;
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
        return false;
    }

    @Override // C6.InterfaceC0004e
    public final EnumC0005f e() {
        return EnumC0005f.f742e;
    }

    @Override // C6.InterfaceC0004e
    public final boolean g() {
        return false;
    }

    @Override // D6.a
    public final D6.j getAnnotations() {
        return D6.i.f1043a;
    }

    @Override // C6.InterfaceC0011l
    public final O h() {
        return O.f726a;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0022x
    public final EnumC0023y j() {
        return EnumC0023y.f781h;
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
    public final /* bridge */ /* synthetic */ C0050j n0() {
        return null;
    }

    @Override // C6.InterfaceC0004e
    public final /* bridge */ /* synthetic */ InterfaceC1333o o0() {
        return C1332n.f13842b;
    }

    @Override // C6.InterfaceC0010k
    public final InterfaceC0010k q() {
        return this.f393i;
    }

    @Override // C6.InterfaceC0004e, C6.InterfaceC0008i
    public final List t() {
        return this.f396n;
    }

    public final String toString() {
        String b4 = getName().b();
        o6.j.d(b4, "asString(...)");
        return b4;
    }

    @Override // C6.InterfaceC0022x
    public final boolean v0() {
        return false;
    }

    @Override // C6.InterfaceC0022x
    public final boolean z() {
        return false;
    }
}
