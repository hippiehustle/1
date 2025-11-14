package n2;

import Z5.y;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f12887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f12888f;

    public /* synthetic */ e(j jVar, m mVar, int i4) {
        this.f12886d = i4;
        this.f12887e = jVar;
        this.f12888f = mVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        D0.a aVar = (D0.a) obj;
        switch (this.f12886d) {
            case 0:
                o6.j.e(aVar, "_connection");
                this.f12887e.f12907g.l(aVar, this.f12888f);
                return y.f7506a;
            default:
                o6.j.e(aVar, "_connection");
                return Long.valueOf(this.f12887e.f12902b.v(aVar, this.f12888f));
        }
    }
}
