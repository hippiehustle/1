package W3;

import c4.C0580g;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f6508e;

    public /* synthetic */ b(o oVar, int i4) {
        this.f6507d = i4;
        this.f6508e = oVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f6507d) {
            case 0:
                o oVar = this.f6508e;
                oVar.o().d(oVar.k(), new C0580g(new A1.e(1, oVar.J(), z.class, "appendCounterReferenceToTextToWrite", "appendCounterReferenceToTextToWrite(Ljava/lang/String;)V", 0, 0, 26)), true);
                break;
            default:
                o.H(this.f6508e);
                break;
        }
        return Z5.y.f7506a;
    }
}
