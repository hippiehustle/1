package S1;

import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f5207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D0.a f5208f;

    public /* synthetic */ A(w wVar, D0.a aVar, int i4) {
        this.f5206d = i4;
        this.f5207e = wVar;
        this.f5208f = aVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        t.g gVar = (t.g) obj;
        switch (this.f5206d) {
            case 0:
                o6.j.e(gVar, "_tmpMap");
                this.f5207e.t(this.f5208f, gVar);
                break;
            case 1:
                o6.j.e(gVar, "_tmpMap");
                this.f5207e.v(this.f5208f, gVar);
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(gVar, "_tmpMap");
                this.f5207e.z(this.f5208f, gVar);
                break;
            default:
                o6.j.e(gVar, "_tmpMap");
                this.f5207e.x(this.f5208f, gVar);
                break;
        }
        return Z5.y.f7506a;
    }
}
