package M3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import java.util.List;
import n6.InterfaceC1162a;

/* renamed from: M3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0168a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0183p f3427e;

    public /* synthetic */ C0168a(C0183p c0183p, int i4) {
        this.f3426d = i4;
        this.f3427e = c0183p;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        PointF pointF;
        long j;
        switch (this.f3426d) {
            case 0:
                C0183p c0183p = this.f3427e;
                c0183p.h(new C0168a(c0183p, 2));
                return Z5.y.f7506a;
            case 1:
                C0183p c0183p2 = this.f3427e;
                c0183p2.o().d(c0183p2.k(), new k4.J((List) c0183p2.J().f3423l.f4088d.f(), new A1.o(2, c0183p2.J(), Z.class, "getConditionBitmap", "getConditionBitmap(Lcom/buzbuz/smartautoclicker/core/domain/model/condition/ImageCondition;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", 0, 0, 5), new A1.e(1, c0183p2.J(), Z.class, "setConditionToBeClicked", "setConditionToBeClicked(Lcom/buzbuz/smartautoclicker/core/domain/model/condition/ImageCondition;)V", 0, 0, 16)), false);
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C0183p c0183p3 = this.f3427e;
                f2.e eVar = (f2.e) c0183p3.J().f3416c.f1950e.a();
                if (eVar != null) {
                    C1.g o7 = c0183p3.o();
                    Context k = c0183p3.k();
                    Point point = eVar.f10696g;
                    if (point != null) {
                        pointF = new PointF(point);
                    } else {
                        pointF = null;
                    }
                    Long l6 = eVar.f10694e;
                    if (l6 != null) {
                        j = l6.longValue();
                    } else {
                        j = 1;
                    }
                    o7.d(k, new F1.e(new Q2.c(j, pointF, 4), new C0169b(c0183p3, 0), null), true);
                }
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                C0183p c0183p4 = this.f3427e;
                c0183p4.h(new C0168a(c0183p4, 1));
                return Z5.y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                C0183p.H(this.f3427e);
                return Z5.y.f7506a;
            default:
                C0183p c0183p5 = this.f3427e;
                c0183p5.o().d(c0183p5.k(), new C0190x(), false);
                return Z5.y.f7506a;
        }
    }
}
