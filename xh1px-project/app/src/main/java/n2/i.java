package n2;

import Z5.y;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f12899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D0.a f12900f;

    public /* synthetic */ i(j jVar, D0.a aVar, int i4) {
        this.f12898d = i4;
        this.f12899e = jVar;
        this.f12900f = aVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        t.g gVar = (t.g) obj;
        switch (this.f12898d) {
            case 0:
                o6.j.e(gVar, "_tmpMap");
                this.f12899e.a(this.f12900f, gVar);
                break;
            default:
                o6.j.e(gVar, "_tmpMap");
                this.f12899e.b(this.f12900f, gVar);
                break;
        }
        return y.f7506a;
    }
}
