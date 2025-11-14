package P1;

import L7.AbstractC0160s;
import L7.AbstractC0166y;
import L7.k0;
import O7.V;
import O7.i0;
import a6.AbstractC0437l;
import android.content.Context;
import i.AbstractActivityC0870i;
import java.util.List;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: i, reason: collision with root package name */
    public static final List f4488i = AbstractC0437l.X(1, 3, 7);

    /* renamed from: a, reason: collision with root package name */
    public final o f4489a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0160s f4490b;

    /* renamed from: c, reason: collision with root package name */
    public final Q7.d f4491c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4492d;

    /* renamed from: e, reason: collision with root package name */
    public final A.i f4493e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f4494f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f4495g;

    /* renamed from: h, reason: collision with root package name */
    public k0 f4496h;

    public w(Context context, o oVar, AbstractC0160s abstractC0160s, AbstractC0160s abstractC0160s2) {
        o6.j.e(oVar, "qualityMetricsMonitor");
        this.f4489a = oVar;
        this.f4490b = abstractC0160s2;
        Q7.d b4 = AbstractC0166y.b(E2.d.C(AbstractC0166y.c(), abstractC0160s));
        this.f4491c = b4;
        A.i iVar = new A.i(oVar.f4474d, 28, this);
        this.f4493e = iVar;
        i0 c6 = V.c(e.f4457b);
        this.f4494f = c6;
        this.f4495g = c6;
        int i4 = 26;
        V.s(new A.i(new A4.c(iVar, V.c(null), new C3.c(3, null, 5), 27), i4, new q(c6, this, null)), b4);
    }

    public static void a(AbstractActivityC0870i abstractActivityC0870i, U4.a aVar) {
        o6.j.e(abstractActivityC0870i, "activity");
        abstractActivityC0870i.p().b0(":AccessibilityTroubleshootingDialog:result", abstractActivityC0870i, new B1.b(4, aVar));
        new Q1.b().V(abstractActivityC0870i.p(), "AccessibilityTroubleshootingDialog");
    }
}
