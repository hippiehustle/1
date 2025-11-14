package w7;

import java.util.List;
import n6.InterfaceC1163b;
import p7.InterfaceC1333o;
import x7.C1824f;

/* loaded from: classes.dex */
public final class A extends z {

    /* renamed from: e, reason: collision with root package name */
    public final J f15939e;

    /* renamed from: f, reason: collision with root package name */
    public final List f15940f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15941g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1333o f15942h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1163b f15943i;

    public A(J j, List list, boolean z8, InterfaceC1333o interfaceC1333o, InterfaceC1163b interfaceC1163b) {
        o6.j.e(j, "constructor");
        o6.j.e(list, "arguments");
        o6.j.e(interfaceC1333o, "memberScope");
        this.f15939e = j;
        this.f15940f = list;
        this.f15941g = z8;
        this.f15942h = interfaceC1333o;
        this.f15943i = interfaceC1163b;
        if (!(interfaceC1333o instanceof y7.g) || (interfaceC1333o instanceof y7.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + interfaceC1333o + '\n' + j);
    }

    @Override // w7.AbstractC1759v
    public final J B0() {
        return this.f15939e;
    }

    @Override // w7.AbstractC1759v
    public final boolean E0() {
        return this.f15941g;
    }

    @Override // w7.AbstractC1759v
    public final AbstractC1759v G0(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        z zVar = (z) this.f15943i.m(c1824f);
        if (zVar == null) {
            return this;
        }
        return zVar;
    }

    @Override // w7.W
    /* renamed from: J0 */
    public final W G0(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        z zVar = (z) this.f15943i.m(c1824f);
        if (zVar == null) {
            return this;
        }
        return zVar;
    }

    @Override // w7.z
    /* renamed from: L0 */
    public final z I0(boolean z8) {
        if (z8 == this.f15941g) {
            return this;
        }
        if (z8) {
            return new y(this, 1);
        }
        return new y(this, 0);
    }

    @Override // w7.z
    /* renamed from: M0 */
    public final z K0(G g8) {
        o6.j.e(g8, "newAttributes");
        if (g8.isEmpty()) {
            return this;
        }
        return new B(this, g8);
    }

    @Override // w7.AbstractC1759v
    public final List r0() {
        return this.f15940f;
    }

    @Override // w7.AbstractC1759v
    public final InterfaceC1333o w0() {
        return this.f15942h;
    }

    @Override // w7.AbstractC1759v
    public final G y0() {
        G.f15953e.getClass();
        return G.f15954f;
    }
}
