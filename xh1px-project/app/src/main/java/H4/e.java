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
public final class e extends c {
    public final C1474e j;
    public RectF k;

    /* renamed from: l, reason: collision with root package name */
    public Float f2016l;

    public e() {
        super(10);
        this.j = g.a(System.currentTimeMillis());
    }

    @Override // H4.c
    public final void a(int i4, Rect rect) {
        float f8 = 10;
        float f9 = i4;
        this.k = new RectF(rect.left + f8, rect.top + f8, (rect.right - f9) - f8, (rect.bottom - f9) - f8);
        this.f2016l = Float.valueOf(f9 / 2.0f);
        d();
    }

    @Override // H4.c
    public final void c(N4.d dVar) {
        i0 i0Var = this.f2013g;
        Map map = (Map) i0Var.f();
        N4.d dVar2 = N4.d.f3771d;
        N4.d dVar3 = N4.d.f3772e;
        if (dVar == dVar3 && map.containsKey(dVar3) && map.containsKey(dVar2)) {
            LinkedHashMap T02 = x.T0((Map) i0Var.f());
            T02.remove(dVar3);
            i0Var.h(null, T02);
            return;
        }
        i0 i0Var2 = this.f2011e;
        if (dVar == dVar2 && !map.containsKey(dVar3) && map.containsKey(dVar2)) {
            i0Var2.h(null, Integer.valueOf(((Number) i0Var2.f()).intValue() + 2));
            d();
        } else {
            i0Var2.h(null, Integer.valueOf(((Number) i0Var2.f()).intValue() - 1));
        }
    }

    public final void d() {
        Float f8;
        PointF v8;
        RectF rectF;
        float f9;
        float f10;
        RectF rectF2 = this.k;
        if (rectF2 != null && (f8 = this.f2016l) != null) {
            float floatValue = f8.floatValue();
            C1474e c1474e = this.j;
            PointF v9 = h2.a.v(c1474e, rectF2);
            do {
                v8 = h2.a.v(c1474e, rectF2);
                float f11 = v9.x;
                float f12 = v9.y;
                rectF = new RectF(f11 - floatValue, f12 - floatValue, f11 + floatValue, f12 + floatValue);
                f9 = v8.x;
                f10 = v8.y;
            } while (rectF.intersect(new RectF(f9 - floatValue, f10 - floatValue, f9 + floatValue, f10 + floatValue)));
            Map P02 = x.P0(new j(N4.d.f3771d, v9), new j(N4.d.f3772e, v8));
            i0 i0Var = this.f2013g;
            i0Var.getClass();
            i0Var.h(null, P02);
        }
    }
}
