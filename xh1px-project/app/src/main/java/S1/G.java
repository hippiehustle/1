package S1;

import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f5228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D0.a f5229f;

    public /* synthetic */ G(F f8, D0.a aVar, int i4) {
        this.f5227d = i4;
        this.f5228e = f8;
        this.f5229f = aVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        t.g gVar = (t.g) obj;
        switch (this.f5227d) {
            case 0:
                o6.j.e(gVar, "_tmpMap");
                this.f5228e.D(this.f5229f, gVar);
                break;
            case 1:
                o6.j.e(gVar, "_tmpMap");
                this.f5228e.x(this.f5229f, gVar);
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(gVar, "_tmpMap");
                this.f5228e.t(this.f5229f, gVar);
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                o6.j.e(gVar, "_tmpMap");
                this.f5228e.v(this.f5229f, gVar);
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                o6.j.e(gVar, "_tmpMap");
                this.f5228e.B(this.f5229f, gVar);
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                o6.j.e(gVar, "_tmpMap");
                this.f5228e.z(this.f5229f, gVar);
                break;
            default:
                o6.j.e(gVar, "_tmpMap");
                this.f5228e.F(this.f5229f, gVar);
                break;
        }
        return Z5.y.f7506a;
    }
}
