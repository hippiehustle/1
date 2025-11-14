package F6;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.InterfaceC0001b;
import C6.InterfaceC0002c;
import C6.InterfaceC0010k;
import C6.InterfaceC0011l;
import C6.InterfaceC0012m;
import C6.W;
import a6.AbstractC0438m;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public class U extends V implements C6.K, W {
    public final int j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1512l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f1513m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC1759v f1514n;

    /* renamed from: o, reason: collision with root package name */
    public final U f1515o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(InterfaceC0001b interfaceC0001b, U u8, int i4, D6.j jVar, C0725e c0725e, AbstractC1759v abstractC1759v, boolean z8, boolean z9, boolean z10, AbstractC1759v abstractC1759v2, C6.O o7) {
        super(interfaceC0001b, jVar, c0725e, abstractC1759v, o7);
        U u9;
        o6.j.e(interfaceC0001b, "containingDeclaration");
        o6.j.e(jVar, "annotations");
        o6.j.e(c0725e, "name");
        o6.j.e(abstractC1759v, "outType");
        o6.j.e(o7, "source");
        this.j = i4;
        this.k = z8;
        this.f1512l = z9;
        this.f1513m = z10;
        this.f1514n = abstractC1759v2;
        if (u8 == null) {
            u9 = this;
        } else {
            u9 = u8;
        }
        this.f1515o = u9;
    }

    @Override // C6.W
    public final boolean H() {
        return false;
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.f(this, obj);
    }

    public U M0(A6.f fVar, C0725e c0725e, int i4) {
        D6.j annotations = getAnnotations();
        o6.j.d(annotations, "<get-annotations>(...)");
        AbstractC1759v b4 = b();
        o6.j.d(b4, "getType(...)");
        return new U(fVar, null, i4, annotations, c0725e, b4, N0(), this.f1512l, this.f1513m, this.f1514n, C6.O.f726a);
    }

    public final boolean N0() {
        if (this.k && ((InterfaceC0002c) q()).e() != 2) {
            return true;
        }
        return false;
    }

    @Override // F6.AbstractC0055o, C6.InterfaceC0010k
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0001b q() {
        InterfaceC0010k q6 = super.q();
        o6.j.c(q6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC0001b) q6;
    }

    @Override // F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final U a() {
        U u8 = this.f1515o;
        if (u8 == this) {
            return this;
        }
        return u8.a();
    }

    @Override // C6.InterfaceC0013n
    public final C0014o d() {
        C0014o c0014o = AbstractC0015p.f759f;
        o6.j.d(c0014o, "LOCAL");
        return c0014o;
    }

    @Override // C6.Q
    public final InterfaceC0011l f(w7.Q q6) {
        o6.j.e(q6, "substitutor");
        if (q6.f15972a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // C6.InterfaceC0001b
    public final Collection s() {
        Collection s8 = q().s();
        o6.j.d(s8, "getOverriddenDescriptors(...)");
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            arrayList.add((U) ((InterfaceC0001b) it.next()).z0().get(this.j));
        }
        return arrayList;
    }

    @Override // C6.W
    public final /* bridge */ /* synthetic */ k7.g u0() {
        return null;
    }
}
