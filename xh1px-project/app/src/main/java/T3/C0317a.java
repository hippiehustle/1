package T3;

import c4.C0580g;
import n6.InterfaceC1162a;

/* renamed from: T3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0317a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f5711e;

    public /* synthetic */ C0317a(o oVar, int i4) {
        this.f5710d = i4;
        this.f5711e = oVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f5710d) {
            case 0:
                o.H(this.f5711e);
                break;
            default:
                o oVar = this.f5711e;
                oVar.o().d(oVar.k(), new C0580g(new C0318b(oVar, 7)), true);
                break;
        }
        return Z5.y.f7506a;
    }
}
