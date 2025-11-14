package L3;

import c4.C0580g;
import n6.InterfaceC1162a;

/* renamed from: L3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0099a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f2840e;

    public /* synthetic */ C0099a(w wVar, int i4) {
        this.f2839d = i4;
        this.f2840e = wVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f2839d) {
            case 0:
                w.H(this.f2840e);
                break;
            case 1:
                w wVar = this.f2840e;
                wVar.o().d(wVar.k(), new C0580g(new C0100b(wVar, 0)), true);
                break;
            default:
                w wVar2 = this.f2840e;
                wVar2.o().d(wVar2.k(), new C0580g(new A1.e(1, wVar2.J(), S.class, "setCounterName", "setCounterName(Ljava/lang/String;)V", 0, 0, 13)), true);
                break;
        }
        return Z5.y.f7506a;
    }
}
