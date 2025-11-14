package S1;

import n6.InterfaceC1163b;

/* renamed from: S1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0299j implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0297h f5272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D0.a f5273f;

    public /* synthetic */ C0299j(C0297h c0297h, D0.a aVar, int i4) {
        this.f5271d = i4;
        this.f5272e = c0297h;
        this.f5273f = aVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        t.g gVar = (t.g) obj;
        switch (this.f5271d) {
            case 0:
                o6.j.e(gVar, "_tmpMap");
                this.f5272e.t(this.f5273f, gVar);
                break;
            default:
                o6.j.e(gVar, "_tmpMap");
                this.f5272e.r(this.f5273f, gVar);
                break;
        }
        return Z5.y.f7506a;
    }
}
