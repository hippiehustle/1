package S1;

import n6.InterfaceC1163b;

/* renamed from: S1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0292c implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0297h f5249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D0.a f5250f;

    public /* synthetic */ C0292c(C0297h c0297h, D0.a aVar, int i4) {
        this.f5248d = i4;
        this.f5249e = c0297h;
        this.f5250f = aVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        t.g gVar = (t.g) obj;
        switch (this.f5248d) {
            case 0:
                o6.j.e(gVar, "_tmpMap");
                this.f5249e.s(this.f5250f, gVar);
                break;
            default:
                o6.j.e(gVar, "_tmpMap");
                this.f5249e.q(this.f5250f, gVar);
                break;
        }
        return Z5.y.f7506a;
    }
}
