package x7;

import java.util.List;
import p7.InterfaceC1333o;
import w7.G;
import w7.J;
import w7.M;
import w7.W;
import w7.z;
import z7.EnumC1885b;
import z7.InterfaceC1886c;

/* renamed from: x7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1826h extends z implements InterfaceC1886c {

    /* renamed from: e, reason: collision with root package name */
    public final EnumC1885b f16284e;

    /* renamed from: f, reason: collision with root package name */
    public final C1827i f16285f;

    /* renamed from: g, reason: collision with root package name */
    public final W f16286g;

    /* renamed from: h, reason: collision with root package name */
    public final G f16287h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16288i;
    public final boolean j;

    public C1826h(EnumC1885b enumC1885b, C1827i c1827i, W w8, G g8, boolean z8, boolean z9) {
        o6.j.e(enumC1885b, "captureStatus");
        o6.j.e(c1827i, "constructor");
        o6.j.e(g8, "attributes");
        this.f16284e = enumC1885b;
        this.f16285f = c1827i;
        this.f16286g = w8;
        this.f16287h = g8;
        this.f16288i = z8;
        this.j = z9;
    }

    @Override // w7.AbstractC1759v
    public final J B0() {
        return this.f16285f;
    }

    @Override // w7.AbstractC1759v
    public final boolean E0() {
        return this.f16288i;
    }

    @Override // w7.z, w7.W
    public final W I0(boolean z8) {
        return new C1826h(this.f16284e, this.f16285f, this.f16286g, this.f16287h, z8, 32);
    }

    @Override // w7.z
    /* renamed from: L0 */
    public final z I0(boolean z8) {
        return new C1826h(this.f16284e, this.f16285f, this.f16286g, this.f16287h, z8, 32);
    }

    @Override // w7.z
    /* renamed from: M0 */
    public final z K0(G g8) {
        o6.j.e(g8, "newAttributes");
        return new C1826h(this.f16284e, this.f16285f, this.f16286g, g8, this.f16288i, this.j);
    }

    @Override // w7.W
    /* renamed from: N0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1826h G0(C1824f c1824f) {
        B6.f fVar;
        W w8;
        o6.j.e(c1824f, "kotlinTypeRefiner");
        C1827i c1827i = this.f16285f;
        c1827i.getClass();
        M d2 = c1827i.f16289a.d(c1824f);
        if (c1827i.f16290b != null) {
            fVar = new B6.f(c1827i, 18, c1824f);
        } else {
            fVar = null;
        }
        C1827i c1827i2 = c1827i.f16291c;
        if (c1827i2 == null) {
            c1827i2 = c1827i;
        }
        C1827i c1827i3 = new C1827i(d2, fVar, c1827i2, c1827i.f16292d);
        W w9 = this.f16286g;
        if (w9 != null) {
            w8 = w9;
        } else {
            w8 = null;
        }
        return new C1826h(this.f16284e, c1827i3, w8, this.f16287h, this.f16288i, 32);
    }

    @Override // w7.AbstractC1759v
    public final List r0() {
        return a6.s.f7766d;
    }

    @Override // w7.AbstractC1759v
    public final InterfaceC1333o w0() {
        return y7.l.a(y7.h.f16523e, true, new String[0]);
    }

    @Override // w7.AbstractC1759v
    public final G y0() {
        return this.f16287h;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1826h(EnumC1885b enumC1885b, C1827i c1827i, W w8, G g8, boolean z8, int i4) {
        this(enumC1885b, c1827i, w8, g8, (i4 & 16) != 0 ? false : z8, false);
        if ((i4 & 8) != 0) {
            G.f15953e.getClass();
            g8 = G.f15954f;
        }
    }
}
