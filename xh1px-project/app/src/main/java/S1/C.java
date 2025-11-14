package S1;

import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f5213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ T1.K f5214f;

    public /* synthetic */ C(F f8, T1.K k, int i4) {
        this.f5212d = i4;
        this.f5213e = f8;
        this.f5214f = k;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        D0.a aVar = (D0.a) obj;
        switch (this.f5212d) {
            case 0:
                o6.j.e(aVar, "_connection");
                return Long.valueOf(((v) this.f5213e.f5223c).v(aVar, this.f5214f));
            default:
                o6.j.e(aVar, "_connection");
                ((C0295f) this.f5213e.f5225e).l(aVar, this.f5214f);
                return Z5.y.f7506a;
        }
    }
}
