package s7;

import C6.InterfaceC0004e;
import f7.C0722b;
import f7.C0723c;
import java.util.Set;
import q4.X;

/* renamed from: s7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1516g {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f14569c;

    /* renamed from: a, reason: collision with root package name */
    public final C1518i f14570a;

    /* renamed from: b, reason: collision with root package name */
    public final U1.c f14571b;

    static {
        C0723c g8 = z6.m.f16766c.g();
        f14569c = X.T(new C0722b(g8.b(), g8.f10797a.f()));
    }

    public C1516g(C1518i c1518i) {
        this.f14570a = c1518i;
        this.f14571b = c1518i.f14573a.c(new B6.n(22, this));
    }

    public final InterfaceC0004e a(C0722b c0722b, C1513d c1513d) {
        o6.j.e(c0722b, "classId");
        return (InterfaceC0004e) this.f14571b.m(new C1515f(c0722b, c1513d));
    }
}
