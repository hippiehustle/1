package F1;

import Q2.p;
import Z5.y;
import android.graphics.PointF;
import n6.InterfaceC1163b;
import o6.j;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f1291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f1292f;

    public /* synthetic */ c(e eVar, p pVar, int i4) {
        this.f1290d = i4;
        this.f1291e = eVar;
        this.f1292f = pVar;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        PointF pointF = (PointF) obj;
        switch (this.f1290d) {
            case 0:
                j.e(pointF, "position");
                this.f1291e.U(p.a(this.f1292f, pointF, null, 5));
                break;
            default:
                j.e(pointF, "position");
                this.f1291e.V(p.a(this.f1292f, null, pointF, 3));
                break;
        }
        return y.f7506a;
    }
}
