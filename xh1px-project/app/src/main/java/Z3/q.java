package Z3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f7397e;

    public /* synthetic */ q(D d2, int i4) {
        this.f7396d = i4;
        this.f7397e = d2;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f7396d) {
            case 0:
                D d2 = this.f7397e;
                d2.h(new q(d2, 2));
                break;
            case 1:
                D.H(this.f7397e);
                break;
            default:
                D d3 = this.f7397e;
                d3.o().d(d3.k(), new C0372g(new W4.i(1, d3.J(), N.class, "setNewEventToggles", "setNewEventToggles(Ljava/util/List;)V", 0, 0, 8)), false);
                break;
        }
        return Z5.y.f7506a;
    }
}
