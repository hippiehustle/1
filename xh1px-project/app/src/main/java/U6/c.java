package U6;

import C6.InterfaceC0007h;
import C6.T;
import I6.q;
import n6.InterfaceC1162a;
import t0.C1536c;
import w7.J;
import w7.z;

/* loaded from: classes.dex */
public final class c implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final R.g f6180d;

    /* renamed from: e, reason: collision with root package name */
    public final T f6181e;

    /* renamed from: f, reason: collision with root package name */
    public final a f6182f;

    /* renamed from: g, reason: collision with root package name */
    public final J f6183g;

    /* renamed from: h, reason: collision with root package name */
    public final q f6184h;

    public c(R.g gVar, T t8, a aVar, J j, q qVar) {
        this.f6180d = gVar;
        this.f6181e = t8;
        this.f6182f = aVar;
        this.f6183g = j;
        this.f6184h = qVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        z zVar;
        C1536c c1536c = (C1536c) this.f6180d.f4989g;
        InterfaceC0007h c6 = this.f6183g.c();
        if (c6 != null) {
            zVar = c6.l();
        } else {
            zVar = null;
        }
        return c1536c.k(this.f6181e, a.a(a.a(this.f6182f, null, false, null, zVar, 31), null, this.f6184h.d(), null, null, 59));
    }
}
