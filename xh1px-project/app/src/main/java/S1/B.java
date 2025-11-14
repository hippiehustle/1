package S1;

import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f5210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D0.a f5211f;

    public /* synthetic */ B(F f8, D0.a aVar, int i4) {
        this.f5209d = i4;
        this.f5210e = f8;
        this.f5211f = aVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        t.g gVar = (t.g) obj;
        switch (this.f5209d) {
            case 0:
                o6.j.e(gVar, "_tmpMap");
                this.f5210e.A(this.f5211f, gVar);
                break;
            case 1:
                o6.j.e(gVar, "_tmpMap");
                this.f5210e.u(this.f5211f, gVar);
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(gVar, "_tmpMap");
                this.f5210e.s(this.f5211f, gVar);
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                o6.j.e(gVar, "_tmpMap");
                this.f5210e.C(this.f5211f, gVar);
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                o6.j.e(gVar, "_tmpMap");
                this.f5210e.y(this.f5211f, gVar);
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                o6.j.e(gVar, "_tmpMap");
                this.f5210e.E(this.f5211f, gVar);
                break;
            default:
                o6.j.e(gVar, "_tmpMap");
                this.f5210e.w(this.f5211f, gVar);
                break;
        }
        return Z5.y.f7506a;
    }
}
