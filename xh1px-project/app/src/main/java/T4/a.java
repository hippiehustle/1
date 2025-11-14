package T4;

import Z5.y;
import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import n6.InterfaceC1162a;
import s3.C1491b;
import t3.C1572j;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f5758e;

    public /* synthetic */ a(k kVar, int i4) {
        this.f5757d = i4;
        this.f5758e = kVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        boolean z8;
        switch (this.f5757d) {
            case 0:
                k kVar = this.f5758e;
                return new C1491b(kVar.f5774a, kVar.f5777d, kVar.f5776c, new c(kVar));
            case 1:
                k kVar2 = this.f5758e;
                C1491b c1491b = (C1491b) kVar2.f5785n.getValue();
                SmartAutoClickerService smartAutoClickerService = kVar2.f5774a;
                if (!((Boolean) kVar2.f5779f.k.f()).booleanValue() && !kVar2.f5778e.a()) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                boolean z9 = !kVar2.f5775b.c();
                C1572j c1572j = c1491b.f14517f;
                if (c1572j != null) {
                    c1491b.a(smartAutoClickerService, C1572j.a(c1572j, z8, z9, false, 9));
                }
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                this.f5758e.c();
                return y.f7506a;
            default:
                this.f5758e.c();
                return y.f7506a;
        }
    }
}
