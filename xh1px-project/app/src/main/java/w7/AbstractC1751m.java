package w7;

import java.util.List;
import p7.InterfaceC1333o;
import x7.C1824f;

/* renamed from: w7.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1751m extends z {
    @Override // w7.AbstractC1759v
    public final J B0() {
        return N0().B0();
    }

    @Override // w7.AbstractC1759v
    public boolean E0() {
        return N0().E0();
    }

    public abstract z N0();

    @Override // w7.W
    /* renamed from: O0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public z J0(C1824f c1824f) {
        o6.j.e(c1824f, "kotlinTypeRefiner");
        z N02 = N0();
        o6.j.e(N02, "type");
        return P0(N02);
    }

    public abstract AbstractC1751m P0(z zVar);

    @Override // w7.AbstractC1759v
    public final List r0() {
        return N0().r0();
    }

    @Override // w7.AbstractC1759v
    public final InterfaceC1333o w0() {
        return N0().w0();
    }

    @Override // w7.AbstractC1759v
    public G y0() {
        return N0().y0();
    }
}
