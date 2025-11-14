package j7;

import a6.s;
import java.util.List;
import o6.j;
import p7.InterfaceC1333o;
import w7.AbstractC1759v;
import w7.G;
import w7.J;
import w7.M;
import w7.W;
import w7.z;
import x7.C1824f;
import y7.h;
import y7.l;
import z7.InterfaceC1886c;

/* renamed from: j7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942a extends z implements InterfaceC1886c {

    /* renamed from: e, reason: collision with root package name */
    public final M f11942e;

    /* renamed from: f, reason: collision with root package name */
    public final C0944c f11943f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11944g;

    /* renamed from: h, reason: collision with root package name */
    public final G f11945h;

    public C0942a(M m6, C0944c c0944c, boolean z8, G g8) {
        j.e(m6, "typeProjection");
        j.e(g8, "attributes");
        this.f11942e = m6;
        this.f11943f = c0944c;
        this.f11944g = z8;
        this.f11945h = g8;
    }

    @Override // w7.AbstractC1759v
    public final J B0() {
        return this.f11943f;
    }

    @Override // w7.AbstractC1759v
    public final boolean E0() {
        return this.f11944g;
    }

    @Override // w7.AbstractC1759v
    public final AbstractC1759v G0(C1824f c1824f) {
        j.e(c1824f, "kotlinTypeRefiner");
        return new C0942a(this.f11942e.d(c1824f), this.f11943f, this.f11944g, this.f11945h);
    }

    @Override // w7.z, w7.W
    public final W I0(boolean z8) {
        if (z8 == this.f11944g) {
            return this;
        }
        return new C0942a(this.f11942e, this.f11943f, z8, this.f11945h);
    }

    @Override // w7.W
    /* renamed from: J0 */
    public final W G0(C1824f c1824f) {
        j.e(c1824f, "kotlinTypeRefiner");
        return new C0942a(this.f11942e.d(c1824f), this.f11943f, this.f11944g, this.f11945h);
    }

    @Override // w7.z
    /* renamed from: L0 */
    public final z I0(boolean z8) {
        if (z8 == this.f11944g) {
            return this;
        }
        return new C0942a(this.f11942e, this.f11943f, z8, this.f11945h);
    }

    @Override // w7.z
    /* renamed from: M0 */
    public final z K0(G g8) {
        j.e(g8, "newAttributes");
        return new C0942a(this.f11942e, this.f11943f, this.f11944g, g8);
    }

    @Override // w7.AbstractC1759v
    public final List r0() {
        return s.f7766d;
    }

    @Override // w7.z
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f11942e);
        sb.append(')');
        if (this.f11944g) {
            str = "?";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // w7.AbstractC1759v
    public final InterfaceC1333o w0() {
        return l.a(h.f16523e, true, new String[0]);
    }

    @Override // w7.AbstractC1759v
    public final G y0() {
        return this.f11945h;
    }
}
