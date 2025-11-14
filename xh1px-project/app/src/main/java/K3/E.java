package K3;

import android.view.View;
import java.util.List;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f2651e;

    public /* synthetic */ E(L l6, int i4) {
        this.f2650d = i4;
        this.f2651e = l6;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f2650d) {
            case 0:
                o6.j.e((View) obj, "it");
                this.f2651e.a();
                break;
            case 1:
                o6.j.e((View) obj, "it");
                L l6 = this.f2651e;
                l6.o().d(l6.k(), new V3.m((List) l6.G().f2648l.f4088d.f(), new E(l6, 3)), false);
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e((View) obj, "it");
                L l8 = this.f2651e;
                E2.d.S(l8, l8.G());
                break;
            default:
                V3.k kVar = (V3.k) obj;
                o6.j.e(kVar, "choiceClicked");
                L l9 = this.f2651e;
                E2.d.R(l9, l9.G(), l9.G().f(l9.k(), kVar));
                break;
        }
        return Z5.y.f7506a;
    }
}
