package J2;

import O7.V;
import O7.i0;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.NoWhenBranchMatchedException;
import o6.j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Y1.d f2389a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2390b;

    /* renamed from: c, reason: collision with root package name */
    public View f2391c;

    /* renamed from: d, reason: collision with root package name */
    public e f2392d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f2393e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f2394f;

    /* JADX WARN: Type inference failed for: r2v1, types: [J2.c] */
    public d(Y1.d dVar) {
        j.e(dVar, "displayConfigManager");
        this.f2389a = dVar;
        this.f2390b = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: J2.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                d.this.a();
            }
        };
        i0 c6 = V.c(new Rect());
        this.f2393e = c6;
        this.f2394f = c6;
    }

    public final void a() {
        e eVar;
        Point point;
        View view = this.f2391c;
        if (view == null || (eVar = this.f2392d) == null) {
            return;
        }
        int ordinal = eVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                point = new Point(iArr[0], iArr[1] - this.f2389a.f7104e.f7096c);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            int[] iArr2 = new int[2];
            view.getLocationInWindow(iArr2);
            point = new Point(iArr2[0], iArr2[1]);
        }
        int i4 = point.x;
        Rect rect = new Rect(i4, point.y, view.getWidth() + i4, view.getHeight() + point.y);
        i0 i0Var = this.f2393e;
        i0Var.getClass();
        i0Var.h(null, rect);
    }
}
