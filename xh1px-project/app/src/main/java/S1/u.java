package S1;

import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f5302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D0.a f5303f;

    public /* synthetic */ u(w wVar, D0.a aVar, int i4) {
        this.f5301d = i4;
        this.f5302e = wVar;
        this.f5303f = aVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        t.g gVar = (t.g) obj;
        switch (this.f5301d) {
            case 0:
                o6.j.e(gVar, "_tmpMap");
                this.f5302e.s(this.f5303f, gVar);
                break;
            case 1:
                o6.j.e(gVar, "_tmpMap");
                this.f5302e.u(this.f5303f, gVar);
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(gVar, "_tmpMap");
                this.f5302e.w(this.f5303f, gVar);
                break;
            default:
                o6.j.e(gVar, "_tmpMap");
                this.f5302e.y(this.f5303f, gVar);
                break;
        }
        return Z5.y.f7506a;
    }
}
