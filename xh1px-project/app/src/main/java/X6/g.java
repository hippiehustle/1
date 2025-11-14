package X6;

import kotlin.NoWhenBranchMatchedException;
import w7.AbstractC1741c;
import w7.AbstractC1751m;
import w7.AbstractC1754p;
import w7.AbstractC1759v;
import w7.G;
import w7.InterfaceC1748j;
import w7.U;
import w7.W;
import w7.z;

/* loaded from: classes.dex */
public final class g extends AbstractC1751m implements InterfaceC1748j {

    /* renamed from: e, reason: collision with root package name */
    public final z f7003e;

    public g(z zVar) {
        o6.j.e(zVar, "delegate");
        this.f7003e = zVar;
    }

    @Override // w7.AbstractC1751m, w7.AbstractC1759v
    public final boolean E0() {
        return false;
    }

    @Override // w7.z, w7.W
    public final W K0(G g8) {
        o6.j.e(g8, "newAttributes");
        return new g(this.f7003e.K0(g8));
    }

    @Override // w7.z
    /* renamed from: L0 */
    public final z I0(boolean z8) {
        if (z8) {
            return this.f7003e.I0(true);
        }
        return this;
    }

    @Override // w7.z
    /* renamed from: M0 */
    public final z K0(G g8) {
        o6.j.e(g8, "newAttributes");
        return new g(this.f7003e.K0(g8));
    }

    @Override // w7.AbstractC1751m
    public final z N0() {
        return this.f7003e;
    }

    @Override // w7.AbstractC1751m
    public final AbstractC1751m P0(z zVar) {
        return new g(zVar);
    }

    @Override // w7.InterfaceC1748j
    public final boolean V() {
        return true;
    }

    @Override // w7.InterfaceC1748j
    public final W k(AbstractC1759v abstractC1759v) {
        o6.j.e(abstractC1759v, "replacement");
        W H02 = abstractC1759v.H0();
        if (!U.f(H02) && !U.e(H02)) {
            return H02;
        }
        if (H02 instanceof z) {
            z zVar = (z) H02;
            z I02 = zVar.I0(false);
            if (!U.f(zVar)) {
                return I02;
            }
            return new g(I02);
        }
        if (H02 instanceof AbstractC1754p) {
            AbstractC1754p abstractC1754p = (AbstractC1754p) H02;
            z zVar2 = abstractC1754p.f16006e;
            z I03 = zVar2.I0(false);
            if (U.f(zVar2)) {
                I03 = new g(I03);
            }
            z zVar3 = abstractC1754p.f16007f;
            z I04 = zVar3.I0(false);
            if (U.f(zVar3)) {
                I04 = new g(I04);
            }
            return AbstractC1741c.F(AbstractC1741c.e(I03, I04), AbstractC1741c.f(H02));
        }
        throw new NoWhenBranchMatchedException();
    }
}
