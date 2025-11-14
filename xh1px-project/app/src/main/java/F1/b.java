package F1;

import Z5.y;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f1289e;

    public /* synthetic */ b(e eVar, int i4) {
        this.f1288d = i4;
        this.f1289e = eVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f1288d) {
            case 0:
                e eVar = this.f1289e;
                eVar.a();
                InterfaceC1162a interfaceC1162a = eVar.K;
                if (interfaceC1162a != null) {
                    interfaceC1162a.a();
                }
                return y.f7506a;
            default:
                e eVar2 = this.f1289e;
                eVar2.a();
                InterfaceC1162a interfaceC1162a2 = eVar2.K;
                if (interfaceC1162a2 != null) {
                    interfaceC1162a2.a();
                }
                return y.f7506a;
        }
    }
}
