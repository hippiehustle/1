package H4;

import O7.i0;
import Z5.j;
import a6.x;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import h4.g;
import java.util.LinkedHashMap;
import java.util.Map;
import r6.C1474e;

/* loaded from: classes.dex */
public final class f extends c {
    public final /* synthetic */ int j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public Object f2017l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i4, int i8) {
        super(i4);
        this.j = i8;
    }

    @Override // H4.c
    public final void a(int i4, Rect rect) {
        switch (this.j) {
            case 0:
                float f8 = i4;
                this.k = new PointF(rect.width() - (1.5f * f8), (rect.height() - i4) / 2.0f);
                Map O02 = x.O0(new j(N4.d.f3771d, new PointF(f8 / 2.0f, (rect.height() - i4) / 2.0f)));
                i0 i0Var = this.f2013g;
                i0Var.getClass();
                i0Var.h(null, O02);
                d();
                return;
            case 1:
                float f9 = i4;
                this.k = new PointF(rect.width() - (1.5f * f9), (rect.height() - i4) / 2.0f);
                Map O03 = x.O0(new j(N4.d.f3771d, new PointF(f9 / 2.0f, (rect.height() - i4) / 2.0f)));
                i0 i0Var2 = this.f2013g;
                i0Var2.getClass();
                i0Var2.h(null, O03);
                e();
                return;
            default:
                float f10 = 10;
                float f11 = i4;
                this.f2017l = new RectF(rect.left + f10, rect.top + f10, (rect.right - f11) - f10, (rect.bottom - f11) - f10);
                f();
                return;
        }
    }

    @Override // H4.c
    public void b(int i4) {
        switch (this.j) {
            case 0:
                Integer num = (Integer) this.f2017l;
                if (num != null && i4 == num.intValue()) {
                    d();
                    return;
                }
                return;
            case 1:
                Integer num2 = (Integer) this.f2017l;
                if (num2 != null && i4 == num2.intValue()) {
                    e();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // H4.c
    public final void c(N4.d dVar) {
        switch (this.j) {
            case 0:
                i0 i0Var = this.f2013g;
                Map map = (Map) i0Var.f();
                N4.d dVar2 = N4.d.f3771d;
                boolean containsKey = map.containsKey(dVar2);
                boolean containsKey2 = ((Map) i0Var.f()).containsKey(N4.d.f3772e);
                i0 i0Var2 = this.f2011e;
                if (dVar == dVar2 && containsKey && containsKey2) {
                    i0Var2.h(null, Integer.valueOf(((Number) i0Var2.f()).intValue() + 1));
                    return;
                } else {
                    i0Var2.h(null, Integer.valueOf(((Number) i0Var2.f()).intValue() - 1));
                    return;
                }
            case 1:
                i0 i0Var3 = this.f2013g;
                Map map2 = (Map) i0Var3.f();
                N4.d dVar3 = N4.d.f3771d;
                boolean containsKey3 = map2.containsKey(dVar3);
                boolean containsKey4 = ((Map) i0Var3.f()).containsKey(N4.d.f3772e);
                i0 i0Var4 = this.f2011e;
                if (dVar == dVar3 && containsKey3 && !containsKey4) {
                    i0Var4.h(null, Integer.valueOf(((Number) i0Var4.f()).intValue() + 1));
                    return;
                } else {
                    i0Var4.h(null, Integer.valueOf(((Number) i0Var4.f()).intValue() - 1));
                    return;
                }
            default:
                if (dVar == N4.d.f3771d) {
                    i0 i0Var5 = this.f2011e;
                    i0Var5.h(null, Integer.valueOf(((Number) i0Var5.f()).intValue() + 1));
                    f();
                    return;
                }
                return;
        }
    }

    public void d() {
        PointF pointF = (PointF) this.k;
        if (pointF == null) {
            return;
        }
        i0 i0Var = this.f2013g;
        LinkedHashMap T02 = x.T0((Map) i0Var.f());
        N4.d dVar = N4.d.f3772e;
        if (T02.containsKey(dVar)) {
        }
        i0Var.getClass();
        i0Var.h(null, T02);
        this.f2017l = Integer.valueOf(((Number) this.f2010d.f()).intValue() - 1);
    }

    public void e() {
        PointF pointF = (PointF) this.k;
        if (pointF == null) {
            return;
        }
        i0 i0Var = this.f2013g;
        LinkedHashMap T02 = x.T0((Map) i0Var.f());
        N4.d dVar = N4.d.f3772e;
        if (T02.containsKey(dVar)) {
        }
        i0Var.getClass();
        i0Var.h(null, T02);
        this.f2017l = Integer.valueOf(((Number) this.f2010d.f()).intValue() - 1);
    }

    public void f() {
        C1474e c1474e = (C1474e) this.k;
        RectF rectF = (RectF) this.f2017l;
        if (rectF == null) {
            return;
        }
        Map O02 = x.O0(new j(N4.d.f3771d, new PointF(h2.a.t(c1474e, rectF.left, rectF.right), h2.a.t(c1474e, rectF.top, rectF.bottom))));
        i0 i0Var = this.f2013g;
        i0Var.getClass();
        i0Var.h(null, O02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f() {
        super(30);
        this.j = 2;
        this.k = g.a(System.currentTimeMillis());
    }
}
