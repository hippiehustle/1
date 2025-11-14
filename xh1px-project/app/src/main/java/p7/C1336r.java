package p7;

import a6.AbstractC0437l;
import i7.AbstractC0898m;
import n6.InterfaceC1162a;
import u7.C1655h;

/* renamed from: p7.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1336r implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13844d;

    /* renamed from: e, reason: collision with root package name */
    public final C1337s f13845e;

    public /* synthetic */ C1336r(C1337s c1337s, int i4) {
        this.f13844d = i4;
        this.f13845e = c1337s;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f13844d) {
            case 0:
                C1655h c1655h = this.f13845e.f13847b;
                return AbstractC0437l.X(AbstractC0898m.i(c1655h), AbstractC0898m.j(c1655h));
            default:
                C1337s c1337s = this.f13845e;
                if (c1337s.f13848c) {
                    return AbstractC0437l.Y(AbstractC0898m.h(c1337s.f13847b));
                }
                return a6.s.f7766d;
        }
    }
}
