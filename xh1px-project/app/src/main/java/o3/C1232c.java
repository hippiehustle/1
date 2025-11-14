package o3;

import Z5.y;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import n6.InterfaceC1164c;

/* renamed from: o3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1232c implements InterfaceC1164c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1243n f13447e;

    public /* synthetic */ C1232c(C1243n c1243n, int i4) {
        this.f13446d = i4;
        this.f13447e = c1243n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        p2.d dVar;
        Point point;
        Point point2;
        Point point3;
        switch (this.f13446d) {
            case 0:
                Point point4 = (Point) obj;
                Point point5 = (Point) obj2;
                o6.j.e(point4, "from");
                o6.j.e(point5, "to");
                C1243n c1243n = this.f13447e;
                return c1243n.h0().f13490c.f11153f.w(c1243n.k(), point4, point5);
            default:
                P2.a aVar = (P2.a) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (aVar != null && booleanValue) {
                    C1243n c1243n2 = this.f13447e;
                    g3.e eVar = c1243n2.h0().f13490c;
                    Context k = c1243n2.k();
                    if (aVar instanceof Q2.c) {
                        PointF pointF = ((Q2.c) aVar).f4781b;
                        if (pointF != null) {
                            point3 = new Point((int) pointF.x, (int) pointF.y);
                        } else {
                            point3 = new Point(0, 0);
                        }
                        dVar = eVar.f11153f.u(k, point3);
                    } else if (aVar instanceof Q2.p) {
                        Q2.p pVar = (Q2.p) aVar;
                        PointF pointF2 = pVar.f4837b;
                        if (pointF2 != null) {
                            point = new Point((int) pointF2.x, (int) pointF2.y);
                        } else {
                            point = new Point(0, 0);
                        }
                        PointF pointF3 = pVar.f4838c;
                        if (pointF3 != null) {
                            point2 = new Point((int) pointF3.x, (int) pointF3.y);
                        } else {
                            point2 = new Point(0, 0);
                        }
                        dVar = eVar.f11153f.w(k, point, point2);
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        eVar.a(dVar, null);
                    }
                }
                return y.f7506a;
        }
    }
}
