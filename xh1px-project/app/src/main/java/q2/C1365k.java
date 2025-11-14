package q2;

import A1.n;
import D4.C0037m;
import L7.AbstractC0166y;
import L7.k0;
import O7.V;
import O7.i0;
import d6.InterfaceC0617c;
import java.util.List;
import java.util.Objects;
import l1.C0999a;
import o2.C1229a;

/* renamed from: q2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365k {

    /* renamed from: a, reason: collision with root package name */
    public final C1229a f13962a;

    /* renamed from: b, reason: collision with root package name */
    public final C1357c f13963b;

    /* renamed from: c, reason: collision with root package name */
    public final x2.f f13964c;

    /* renamed from: d, reason: collision with root package name */
    public Q7.d f13965d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f13966e;

    /* renamed from: f, reason: collision with root package name */
    public k0 f13967f;

    /* renamed from: g, reason: collision with root package name */
    public n f13968g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f13969h;

    /* renamed from: i, reason: collision with root package name */
    public final P7.n f13970i;
    public final i0 j;
    public final i0 k;

    public C1365k(C1229a c1229a, C1357c c1357c, x2.f fVar) {
        o6.j.e(c1229a, "dumbRepository");
        o6.j.e(c1357c, "dumbActionExecutor");
        o6.j.e(fVar, "settingsRepository");
        this.f13962a = c1229a;
        this.f13963b = c1357c;
        this.f13964c = fVar;
        i0 c6 = V.c(null);
        this.f13969h = c6;
        this.f13970i = V.u(c6, new C0037m((InterfaceC0617c) null, this, 10));
        i0 c9 = V.c(Boolean.FALSE);
        this.j = c9;
        this.k = c9;
    }

    public final void a() {
        Q7.d dVar;
        if (!((Boolean) this.j.f()).booleanValue() && (dVar = this.f13965d) != null) {
            AbstractC0166y.q(dVar, null, null, new C1359e(this, null), 3);
        }
    }

    public final void b(p2.e eVar) {
        k0 k0Var;
        List list = eVar.f13701c;
        i0 i0Var = this.j;
        if (!((Boolean) i0Var.f()).booleanValue() && !list.isEmpty()) {
            Boolean bool = Boolean.TRUE;
            i0Var.getClass();
            k0 k0Var2 = null;
            i0Var.h(null, bool);
            C0999a c0999a = eVar.f13699a;
            list.size();
            Objects.toString(c0999a);
            if (!eVar.f13705g) {
                int i4 = eVar.f13704f;
                Q7.d dVar = this.f13965d;
                if (dVar != null) {
                    k0Var = AbstractC0166y.q(dVar, null, null, new C1364j(i4, this, null), 3);
                } else {
                    k0Var = null;
                }
                this.f13966e = k0Var;
            }
            Q7.d dVar2 = this.f13965d;
            if (dVar2 != null) {
                k0Var2 = AbstractC0166y.q(dVar2, null, null, new C1362h(null, eVar, this), 3);
            }
            this.f13967f = k0Var2;
        }
    }

    public final void c() {
        if (!((Boolean) this.k.f()).booleanValue()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        i0 i0Var = this.j;
        i0Var.getClass();
        i0Var.h(null, bool);
        k0 k0Var = this.f13966e;
        if (k0Var != null) {
            k0Var.d(null);
        }
        this.f13966e = null;
        k0 k0Var2 = this.f13967f;
        if (k0Var2 != null) {
            k0Var2.d(null);
        }
        this.f13967f = null;
        n nVar = this.f13968g;
        if (nVar != null) {
            nVar.a();
        }
        this.f13968g = null;
    }
}
