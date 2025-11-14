package j7;

import C6.InterfaceC0007h;
import C6.T;
import D6.j;
import h7.AbstractC0842e;
import w7.AbstractC1759v;
import w7.M;
import w7.O;
import w7.X;

/* renamed from: j7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945d extends O {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11948b;

    /* renamed from: c, reason: collision with root package name */
    public final O f11949c;

    public /* synthetic */ C0945d(O o7, int i4) {
        this.f11948b = i4;
        this.f11949c = o7;
    }

    @Override // w7.O
    public boolean a() {
        switch (this.f11948b) {
            case 0:
                return this.f11949c.a();
            default:
                return super.a();
        }
    }

    @Override // w7.O
    public boolean b() {
        switch (this.f11948b) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // w7.O
    public final j c(j jVar) {
        switch (this.f11948b) {
            case 0:
                o6.j.e(jVar, "annotations");
                return this.f11949c.c(jVar);
            default:
                o6.j.e(jVar, "annotations");
                return this.f11949c.c(jVar);
        }
    }

    @Override // w7.O
    public final M d(AbstractC1759v abstractC1759v) {
        switch (this.f11948b) {
            case 0:
                M d2 = this.f11949c.d(abstractC1759v);
                T t8 = null;
                if (d2 == null) {
                    return null;
                }
                InterfaceC0007h c6 = abstractC1759v.B0().c();
                if (c6 instanceof T) {
                    t8 = (T) c6;
                }
                return AbstractC0842e.h(d2, t8);
            default:
                return this.f11949c.d(abstractC1759v);
        }
    }

    @Override // w7.O
    public final boolean e() {
        switch (this.f11948b) {
            case 0:
                return this.f11949c.e();
            default:
                return this.f11949c.e();
        }
    }

    @Override // w7.O
    public final AbstractC1759v f(AbstractC1759v abstractC1759v, X x8) {
        switch (this.f11948b) {
            case 0:
                o6.j.e(abstractC1759v, "topLevelType");
                o6.j.e(x8, "position");
                return this.f11949c.f(abstractC1759v, x8);
            default:
                o6.j.e(abstractC1759v, "topLevelType");
                o6.j.e(x8, "position");
                return this.f11949c.f(abstractC1759v, x8);
        }
    }
}
