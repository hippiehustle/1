package B6;

import java.util.List;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class m implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f491d;

    /* renamed from: e, reason: collision with root package name */
    public final r f492e;

    public /* synthetic */ m(r rVar, int i4) {
        this.f491d = i4;
        this.f492e = rVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f491d) {
            case 0:
                List y4 = E2.d.y(D6.g.a(this.f492e.f505a.f1450h, "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING"));
                if (y4.isEmpty()) {
                    return D6.i.f1043a;
                }
                return new D6.k(0, y4);
            default:
                return this.f492e.f505a.f1450h.e();
        }
    }
}
