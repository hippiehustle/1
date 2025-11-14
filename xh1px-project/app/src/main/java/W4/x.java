package W4;

import D4.C0040p;
import O7.InterfaceC0233f;
import O7.L;
import O7.P;
import O7.V;
import O7.f0;
import O7.i0;
import a5.C0423g;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import o2.C1229a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW4/x;", "Landroidx/lifecycle/Z;", "smartautoclicker_fDroidRelease"}, k = 1, mv = {Z.g.FLOAT_FIELD_NUMBER, Z.g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final A4.a f6625b;

    /* renamed from: c, reason: collision with root package name */
    public final C0423g f6626c;

    /* renamed from: d, reason: collision with root package name */
    public final q1.e f6627d;

    /* renamed from: e, reason: collision with root package name */
    public final b2.r f6628e;

    /* renamed from: f, reason: collision with root package name */
    public final C1229a f6629f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f6630g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f6631h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f6632i;
    public final P j;
    public final C0040p k;

    public x(A4.a aVar, C0423g c0423g, q1.e eVar, b2.r rVar, C1229a c1229a) {
        o6.j.e(c0423g, "sortConfigRepository");
        o6.j.e(eVar, "bitmapRepository");
        o6.j.e(rVar, "smartRepository");
        o6.j.e(c1229a, "dumbRepository");
        this.f6625b = aVar;
        this.f6626c = c0423g;
        this.f6627d = eVar;
        this.f6628e = rVar;
        this.f6629f = c1229a;
        i0 c6 = V.c(Z4.q.f7464d);
        this.f6630g = c6;
        i0 c9 = V.c(new d(new LinkedHashSet(), new LinkedHashSet()));
        this.f6631h = c9;
        a6.u uVar = a6.u.f7768d;
        i0 c10 = V.c(new Z4.a(uVar, uVar));
        this.f6632i = c10;
        this.j = V.t(new L(new InterfaceC0233f[]{c6, (L) aVar.f283h, c10, c9}, new s(this, null)), U.g(this), new f0(5000L), null);
        this.k = new C0040p(rVar.f9119i, 27);
    }

    public final void e(Z4.q qVar) {
        i0 i0Var = this.f6630g;
        i0Var.getClass();
        i0Var.h(null, qVar);
        i0 i0Var2 = this.f6632i;
        ((Z4.a) i0Var2.f()).getClass();
        a6.u uVar = a6.u.f7768d;
        Z4.a a3 = Z4.a.a(uVar, uVar);
        i0Var2.getClass();
        i0Var2.h(null, a3);
    }
}
