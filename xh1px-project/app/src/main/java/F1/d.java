package F1;

import Q2.p;
import Z5.y;
import n6.InterfaceC1162a;
import o6.j;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f1294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f1295f;

    public /* synthetic */ d(e eVar, p pVar, int i4) {
        this.f1293d = i4;
        this.f1294e = eVar;
        this.f1295f = pVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f1293d) {
            case 0:
                p pVar = this.f1295f;
                e eVar = this.f1294e;
                eVar.V(pVar);
                K2.d dVar = eVar.f1300N;
                if (dVar != null) {
                    dVar.e();
                    return y.f7506a;
                }
                j.i("instructionsAnimationController");
                throw null;
            case 1:
                e eVar2 = this.f1294e;
                eVar2.a();
                eVar2.f1297J.m(this.f1295f);
                return y.f7506a;
            default:
                p a3 = p.a(this.f1295f, null, null, 3);
                e eVar3 = this.f1294e;
                eVar3.U(a3);
                K2.d dVar2 = eVar3.f1300N;
                if (dVar2 != null) {
                    dVar2.e();
                    return y.f7506a;
                }
                j.i("instructionsAnimationController");
                throw null;
        }
    }
}
