package o3;

import D4.C0040p;
import K3.z;
import L7.AbstractC0160s;
import M3.W;
import O7.P;
import O7.V;
import O7.i0;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import android.content.Context;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q2.C1365k;
import t6.C1586a;

/* renamed from: o3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1250u extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0160s f13489b;

    /* renamed from: c, reason: collision with root package name */
    public final g3.e f13490c;

    /* renamed from: d, reason: collision with root package name */
    public final C1365k f13491d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f13492e;

    /* renamed from: f, reason: collision with root package name */
    public final P f13493f;

    /* renamed from: g, reason: collision with root package name */
    public final C0040p f13494g;

    /* renamed from: h, reason: collision with root package name */
    public final R3.r f13495h;

    public C1250u(Context context, AbstractC0160s abstractC0160s, g3.e eVar, C1365k c1365k) {
        o6.j.e(eVar, "dumbEditionRepository");
        o6.j.e(c1365k, "dumbEngine");
        this.f13489b = abstractC0160s;
        this.f13490c = eVar;
        this.f13491d = c1365k;
        i0 c6 = V.c(new C1230a(0, false));
        this.f13492e = c6;
        this.f13493f = V.t(new z(c6, 7), U.g(this), O7.Z.f4117a, Boolean.FALSE);
        i0 i0Var = eVar.f11150c;
        this.f13494g = new C0040p(new W(i0Var, context, 4), 18);
        this.f13495h = new R3.r(new H3.v(new A4.c(c6, i0Var, new C3.c(3, null, 7), 27), 2), 24, this);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [t6.a, t6.c] */
    public final void e(p2.d dVar) {
        o6.j.e(dVar, "action");
        g3.e eVar = this.f13490c;
        eVar.getClass();
        i0 i0Var = eVar.f11149b;
        p2.e eVar2 = (p2.e) i0Var.f();
        if (eVar2 == null) {
            return;
        }
        List list = eVar2.f13701c;
        Iterator it = list.iterator();
        int i4 = 0;
        while (true) {
            if (it.hasNext()) {
                if (o6.j.a(((p2.d) it.next()).getId(), dVar.getId())) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        dVar.toString();
        ArrayList S02 = AbstractC0436k.S0(list);
        S02.remove(i4);
        if (i4 <= AbstractC0437l.W(S02)) {
            g3.e.h(S02, new C1586a(i4, AbstractC0437l.W(S02), 1));
        }
        i0Var.h(null, p2.e.g(eVar2, null, S02, 0, false, 0, false, false, 507));
    }
}
