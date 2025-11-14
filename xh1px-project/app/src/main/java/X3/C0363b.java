package X3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import n6.InterfaceC1162a;

/* renamed from: X3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0363b implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f6882e;

    public /* synthetic */ C0363b(p pVar, int i4) {
        this.f6881d = i4;
        this.f6882e = pVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        PointF pointF;
        PointF pointF2;
        long j;
        switch (this.f6881d) {
            case 0:
                p pVar = this.f6882e;
                pVar.h(new C0363b(pVar, 2));
                break;
            case 1:
                p.G(this.f6882e);
                break;
            default:
                p pVar2 = this.f6882e;
                f2.k kVar = (f2.k) pVar2.J().f6871b.f1950e.a();
                if (kVar != null) {
                    C1.g o7 = pVar2.o();
                    Context k = pVar2.k();
                    Point point = kVar.f10735f;
                    if (point != null) {
                        pointF = new PointF(point);
                    } else {
                        pointF = null;
                    }
                    Point point2 = kVar.f10736g;
                    if (point2 != null) {
                        pointF2 = new PointF(point2);
                    } else {
                        pointF2 = null;
                    }
                    Long l6 = kVar.f10734e;
                    if (l6 != null) {
                        j = l6.longValue();
                    } else {
                        j = 250;
                    }
                    o7.d(k, new F1.e(new Q2.p(j, pointF, pointF2), new C0362a(pVar2, 5), null), true);
                }
                return Z5.y.f7506a;
        }
        return Z5.y.f7506a;
    }
}
