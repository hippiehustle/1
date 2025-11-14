package w7;

import java.util.List;
import p7.InterfaceC1333o;
import x7.C1824f;
import z7.InterfaceC1887d;

/* renamed from: w7.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1759v implements D6.a, InterfaceC1887d {

    /* renamed from: d, reason: collision with root package name */
    public int f16018d;

    public abstract J B0();

    public abstract boolean E0();

    public abstract AbstractC1759v G0(C1824f c1824f);

    public abstract W H0();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AbstractC1759v) {
                AbstractC1759v abstractC1759v = (AbstractC1759v) obj;
                if (E0() == abstractC1759v.E0()) {
                    if (AbstractC1741c.y(x7.m.f16299a, H0(), abstractC1759v.H0())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // D6.a
    public final D6.j getAnnotations() {
        return AbstractC1746h.a(y0());
    }

    public final int hashCode() {
        int hashCode;
        int i4 = this.f16018d;
        if (i4 != 0) {
            return i4;
        }
        if (AbstractC1741c.j(this)) {
            hashCode = super.hashCode();
        } else {
            hashCode = (E0() ? 1 : 0) + ((r0().hashCode() + (B0().hashCode() * 31)) * 31);
        }
        this.f16018d = hashCode;
        return hashCode;
    }

    public abstract List r0();

    public abstract InterfaceC1333o w0();

    public abstract G y0();
}
