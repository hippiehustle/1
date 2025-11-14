package o4;

import c4.C0580g;
import n6.InterfaceC1162a;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1264a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f13557e;

    public /* synthetic */ C1264a(t tVar, int i4) {
        this.f13556d = i4;
        this.f13557e = tVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f13556d) {
            case 0:
                t.H(this.f13557e);
                break;
            case 1:
                t tVar = this.f13557e;
                tVar.o().d(tVar.k(), new C0580g(new C1265b(tVar, 0)), true);
                break;
            default:
                t tVar2 = this.f13557e;
                tVar2.o().d(tVar2.k(), new C0580g(new W4.i(1, tVar2.J(), O.class, "setCounterName", "setCounterName(Ljava/lang/String;)V", 0, 0, 17)), true);
                break;
        }
        return Z5.y.f7506a;
    }
}
