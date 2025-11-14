package j3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import n6.InterfaceC1162a;
import p2.C1304a;

/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0916b implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0934t f11855e;

    public /* synthetic */ C0916b(C0934t c0934t, int i4) {
        this.f11854d = i4;
        this.f11855e = c0934t;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        PointF pointF;
        switch (this.f11854d) {
            case 0:
                C0934t c0934t = this.f11855e;
                c0934t.h(new C0916b(c0934t, 1));
                return Z5.y.f7506a;
            default:
                C0934t c0934t2 = this.f11855e;
                C1304a c1304a = (C1304a) c0934t2.G().f11842b.f();
                if (c1304a != null) {
                    C1.g o7 = c0934t2.o();
                    Context k = c0934t2.k();
                    Point point = c1304a.f13683h;
                    if (point.x == 0 && point.y == 0) {
                        pointF = null;
                    } else {
                        pointF = new PointF(point);
                    }
                    o7.d(k, new F1.e(new Q2.c(c1304a.f13684i, pointF, 4), new C0915a(c0934t2, 7), null), true);
                }
                return Z5.y.f7506a;
        }
    }
}
