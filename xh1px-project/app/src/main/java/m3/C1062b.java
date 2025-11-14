package m3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import n6.InterfaceC1162a;

/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1062b implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1079s f12438e;

    public /* synthetic */ C1062b(C1079s c1079s, int i4) {
        this.f12437d = i4;
        this.f12438e = c1079s;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        PointF pointF;
        PointF pointF2;
        switch (this.f12437d) {
            case 0:
                C1079s c1079s = this.f12438e;
                c1079s.h(new C1062b(c1079s, 1));
                return Z5.y.f7506a;
            default:
                C1079s c1079s2 = this.f12438e;
                p2.c cVar = (p2.c) c1079s2.G().f12425b.f();
                if (cVar != null) {
                    C1.g o7 = c1079s2.o();
                    Context k = c1079s2.k();
                    Point point = cVar.f13697h;
                    if (point.x == 0 && point.y == 0) {
                        pointF = null;
                    } else {
                        pointF = new PointF(point);
                    }
                    Point point2 = cVar.f13698i;
                    if (point2.x == 0 && point2.y == 0) {
                        pointF2 = null;
                    } else {
                        pointF2 = new PointF(point2);
                    }
                    o7.d(k, new F1.e(new Q2.p(cVar.j, pointF, pointF2), new C1061a(c1079s2, 7), null), true);
                }
                return Z5.y.f7506a;
        }
    }
}
