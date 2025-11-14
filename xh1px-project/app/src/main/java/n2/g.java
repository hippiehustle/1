package n2;

import Z5.y;
import java.util.List;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f12893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f12894f;

    public /* synthetic */ g(j jVar, List list, int i4) {
        this.f12892d = i4;
        this.f12893e = jVar;
        this.f12894f = list;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        D0.a aVar = (D0.a) obj;
        switch (this.f12892d) {
            case 0:
                o6.j.e(aVar, "_connection");
                this.f12893e.f12908h.m(aVar, this.f12894f);
                return y.f7506a;
            case 1:
                o6.j.e(aVar, "_connection");
                this.f12893e.f12906f.m(aVar, this.f12894f);
                return y.f7506a;
            default:
                o6.j.e(aVar, "_connection");
                return this.f12893e.f12903c.w(aVar, this.f12894f);
        }
    }
}
