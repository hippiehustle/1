package w7;

import java.util.List;
import n6.InterfaceC1162a;
import p7.InterfaceC1333o;
import x7.C1824f;

/* renamed from: w7.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1761x extends AbstractC1759v {

    /* renamed from: e, reason: collision with root package name */
    public final v7.n f16021e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1162a f16022f;

    /* renamed from: g, reason: collision with root package name */
    public final v7.i f16023g;

    /* JADX WARN: Type inference failed for: r0v1, types: [v7.i, v7.h] */
    public C1761x(v7.n nVar, InterfaceC1162a interfaceC1162a) {
        o6.j.e(nVar, "storageManager");
        this.f16021e = nVar;
        this.f16022f = interfaceC1162a;
        this.f16023g = new v7.h((v7.k) nVar, interfaceC1162a);
    }

    @Override // w7.AbstractC1759v
    public final J B0() {
        return I0().B0();
    }

    @Override // w7.AbstractC1759v
    public final boolean E0() {
        return I0().E0();
    }

    @Override // w7.AbstractC1759v
    public final AbstractC1759v G0(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        return new C1761x(this.f16021e, new B6.f(c1824f, 16, this));
    }

    @Override // w7.AbstractC1759v
    public final W H0() {
        AbstractC1759v I02 = I0();
        while (I02 instanceof C1761x) {
            I02 = ((C1761x) I02).I0();
        }
        o6.j.c(I02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (W) I02;
    }

    public final AbstractC1759v I0() {
        return (AbstractC1759v) this.f16023g.a();
    }

    @Override // w7.AbstractC1759v
    public final List r0() {
        return I0().r0();
    }

    public final String toString() {
        v7.i iVar = this.f16023g;
        if (iVar.f15554f != v7.j.f15555d && iVar.f15554f != v7.j.f15556e) {
            return I0().toString();
        }
        return "<Not computed yet>";
    }

    @Override // w7.AbstractC1759v
    public final InterfaceC1333o w0() {
        return I0().w0();
    }

    @Override // w7.AbstractC1759v
    public final G y0() {
        return I0().y0();
    }
}
