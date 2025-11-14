package t4;

import D4.C0040p;
import L7.AbstractC0166y;
import Y3.z;
import android.content.Context;
import android.graphics.Point;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import h4.AbstractC0832f;
import l2.C1001a;

/* loaded from: classes.dex */
public final class x extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final Y1.d f15113b;

    /* renamed from: c, reason: collision with root package name */
    public final H3.n f15114c;

    /* renamed from: d, reason: collision with root package name */
    public final C4.e f15115d;

    /* renamed from: e, reason: collision with root package name */
    public final q f15116e;

    /* renamed from: f, reason: collision with root package name */
    public final o f15117f;

    /* renamed from: g, reason: collision with root package name */
    public final q f15118g;

    /* renamed from: h, reason: collision with root package name */
    public final R.g f15119h;

    public x(Context context, Y1.d dVar, H3.n nVar) {
        o6.j.e(dVar, "displayConfigManager");
        o6.j.e(nVar, "editionRepository");
        this.f15113b = dVar;
        this.f15114c = nVar;
        z zVar = new z(nVar.f1950e.f1982c, 16);
        this.f15115d = new C4.e(new C0040p(new o(zVar, 0), 18), 12);
        this.f15116e = new q(zVar, 0);
        int i4 = 1;
        this.f15117f = new o(zVar, i4);
        this.f15118g = new q(zVar, i4);
        this.f15119h = new R.g(zVar, this, context, 19);
    }

    public final void e(int i4) {
        Point point = this.f15113b.f7104e.f7094a;
        int f8 = AbstractC0832f.f(i4, 400, Math.max(point.x, Math.max(point.y, 1)));
        C1001a g8 = this.f15114c.f1950e.g();
        if (g8 != null) {
            AbstractC0166y.q(U.g(this), null, null, new C1584l(this, g8, f8, null), 3);
        }
    }
}
