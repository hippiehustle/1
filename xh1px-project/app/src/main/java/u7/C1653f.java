package u7;

import java.util.Collection;
import n6.InterfaceC1162a;
import p7.C1324f;
import p7.C1330l;
import p7.InterfaceC1333o;
import w7.AbstractC1744f;
import x7.C1824f;

/* renamed from: u7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1653f implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15394d;

    /* renamed from: e, reason: collision with root package name */
    public final C1654g f15395e;

    public /* synthetic */ C1653f(C1654g c1654g, int i4) {
        this.f15394d = i4;
        this.f15395e = c1654g;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15394d) {
            case 0:
                C1324f c1324f = C1324f.f13817m;
                InterfaceC1333o.f13843a.getClass();
                return this.f15395e.i(c1324f, C1330l.f13836e);
            default:
                C1654g c1654g = this.f15395e;
                C1824f c1824f = c1654g.f15396g;
                C1655h c1655h = c1654g.j;
                c1824f.getClass();
                o6.j.e(c1655h, "classDescriptor");
                Collection d2 = ((AbstractC1744f) c1655h.B()).d();
                o6.j.d(d2, "getSupertypes(...)");
                return d2;
        }
    }
}
