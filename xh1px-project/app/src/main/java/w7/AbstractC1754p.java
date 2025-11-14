package w7;

import h7.C0845h;
import java.util.List;
import p7.InterfaceC1333o;
import z7.InterfaceC1887d;

/* renamed from: w7.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1754p extends W implements InterfaceC1887d {

    /* renamed from: e, reason: collision with root package name */
    public final z f16006e;

    /* renamed from: f, reason: collision with root package name */
    public final z f16007f;

    public AbstractC1754p(z zVar, z zVar2) {
        o6.j.e(zVar, "lowerBound");
        o6.j.e(zVar2, "upperBound");
        this.f16006e = zVar;
        this.f16007f = zVar2;
    }

    @Override // w7.AbstractC1759v
    public final J B0() {
        return L0().B0();
    }

    @Override // w7.AbstractC1759v
    public final boolean E0() {
        return L0().E0();
    }

    public abstract z L0();

    public abstract String M0(C0845h c0845h, C0845h c0845h2);

    @Override // w7.AbstractC1759v
    public final List r0() {
        return L0().r0();
    }

    public String toString() {
        return C0845h.f11448e.V(this);
    }

    @Override // w7.AbstractC1759v
    public InterfaceC1333o w0() {
        return L0().w0();
    }

    @Override // w7.AbstractC1759v
    public final G y0() {
        return L0().y0();
    }
}
