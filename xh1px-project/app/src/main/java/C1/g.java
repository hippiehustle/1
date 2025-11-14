package C1;

import A1.h;
import A1.o;
import O7.InterfaceC0233f;
import O7.V;
import O7.i0;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.C0433h;
import a6.x;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.EnumC0504o;
import f6.AbstractC0720j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1162a;
import o6.j;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Y1.d f572a;

    /* renamed from: b, reason: collision with root package name */
    public final H1.b f573b;

    /* renamed from: c, reason: collision with root package name */
    public final h f574c;

    /* renamed from: d, reason: collision with root package name */
    public final A4.c f575d;

    /* renamed from: e, reason: collision with root package name */
    public final D1.d f576e;

    /* renamed from: f, reason: collision with root package name */
    public final a f577f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f578g;

    /* renamed from: h, reason: collision with root package name */
    public S4.h f579h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1162a f580i;
    public T4.a j;
    public final InterfaceC0233f k;

    /* JADX WARN: Type inference failed for: r5v2, types: [A4.c, D1.d] */
    public g(Y1.d dVar, H1.b bVar) {
        j.e(dVar, "displayConfigManager");
        j.e(bVar, "menuPositionDataSource");
        this.f572a = dVar;
        this.f573b = bVar;
        this.f574c = new h(1, this);
        A4.c cVar = new A4.c();
        this.f575d = cVar;
        this.f576e = new A4.c();
        this.f577f = new a(0);
        i0 c6 = V.c(null);
        this.f578g = c6;
        this.k = V.k(new A4.c(new f(c6, 0), (i0) cVar.f293g, new AbstractC0720j(3, null), 27));
    }

    public final void a(Context context) {
        D1.c cVar;
        w1.e eVar;
        D1.d dVar = this.f576e;
        if (!((C0433h) dVar.f291e).isEmpty()) {
            cVar = (D1.c) dVar.j();
        } else {
            cVar = null;
        }
        i0 i0Var = this.f578g;
        i0Var.g(cVar);
        Objects.toString(cVar);
        boolean z8 = cVar instanceof D1.a;
        A4.c cVar2 = this.f575d;
        if (z8) {
            D1.a aVar = (D1.a) cVar;
            C0433h c0433h = (C0433h) cVar2.f291e;
            C0433h c0433h2 = (C0433h) cVar2.f291e;
            if (c0433h.isEmpty()) {
                this.f572a.f7102c.add(this.f574c);
                eVar = null;
            } else {
                eVar = (w1.e) c0433h2.last();
            }
            w1.e eVar2 = aVar.f855a;
            eVar2.c(context, new o(2, this, g.class, "onOverlayDismissed", "onOverlayDismissed(Landroid/content/Context;Lcom/buzbuz/smartautoclicker/core/common/overlays/base/Overlay;)V", 0, 0, 1));
            if (eVar != null) {
                eVar.x();
                if (aVar.f856b) {
                    eVar.C();
                }
            }
            eVar2.B();
            c0433h2.addLast(eVar2);
            i0 i0Var2 = (i0) cVar2.f292f;
            i0Var2.getClass();
            i0Var2.h(null, eVar2);
            a(context);
            return;
        }
        if (j.a(cVar, D1.b.f857a)) {
            if (((C0433h) cVar2.f291e).isEmpty()) {
                return;
            }
            w1.e eVar3 = (w1.e) ((C0433h) cVar2.f291e).last();
            eVar3.x();
            eVar3.C();
            eVar3.i();
            return;
        }
        if (cVar == null) {
            if (!((C0433h) cVar2.f291e).isEmpty()) {
                if (!c()) {
                    ((w1.e) ((C0433h) cVar2.f291e).last()).z();
                }
                InterfaceC1162a interfaceC1162a = this.f580i;
                if (interfaceC1162a != null) {
                    interfaceC1162a.a();
                }
                this.f580i = null;
            }
            i0Var.g(null);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b() {
        EnumC0504o enumC0504o;
        if (!c()) {
            A4.c cVar = this.f575d;
            C0433h c0433h = (C0433h) cVar.f291e;
            C0433h c0433h2 = (C0433h) cVar.f291e;
            List<w1.e> Q02 = AbstractC0436k.Q0(c0433h);
            a aVar = this.f577f;
            aVar.getClass();
            LinkedHashMap linkedHashMap = aVar.f561a;
            linkedHashMap.clear();
            for (w1.e eVar : Q02) {
                boolean z8 = eVar instanceof E1.c;
                if (z8 && ((E1.c) eVar).f1168t) {
                    enumC0504o = EnumC0504o.f8850h;
                } else if (z8 && ((E1.c) eVar).f1169u) {
                    enumC0504o = EnumC0504o.f8846d;
                } else {
                    enumC0504o = eVar.j.f8862d;
                }
                linkedHashMap.put(eVar, enumC0504o);
            }
            for (int W7 = AbstractC0437l.W(c0433h2); -1 < W7; W7--) {
                ((w1.e) c0433h2.get(W7)).C();
            }
            T4.a aVar2 = this.j;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
    }

    public final boolean c() {
        return !this.f577f.f561a.isEmpty();
    }

    public final void d(Context context, w1.e eVar, boolean z8) {
        j.e(context, "context");
        eVar.hashCode();
        i0 i0Var = this.f578g;
        Objects.toString(i0Var.f());
        this.f576e.n(new D1.a(eVar, z8));
        if (i0Var.f() == null) {
            a(context);
        }
    }

    public final boolean e(Context context) {
        j.e(context, "context");
        if (((C0433h) this.f575d.f291e).isEmpty()) {
            return false;
        }
        i0 i0Var = this.f578g;
        Objects.toString(i0Var.f());
        this.f576e.n(D1.b.f857a);
        if (i0Var.f() == null) {
            a(context);
            return true;
        }
        return true;
    }

    public final void f(Context context, B0.e eVar) {
        int i4;
        A4.c cVar = this.f575d;
        if (((C0433h) cVar.f291e).f7763f <= 1) {
            if (eVar != null) {
                eVar.a();
                return;
            }
            return;
        }
        this.f580i = eVar;
        D1.d dVar = this.f576e;
        List Q02 = AbstractC0436k.Q0((C0433h) dVar.f291e);
        int i8 = ((C0433h) cVar.f291e).f7763f - 1;
        Iterator it = Q02.iterator();
        while (it.hasNext()) {
            if (((D1.c) it.next()) instanceof D1.a) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            i8 += i4;
        }
        i0 i0Var = this.f578g;
        D1.c cVar2 = (D1.c) i0Var.f();
        if (cVar2 instanceof D1.a) {
            i8++;
        } else if (cVar2 instanceof D1.b) {
            i8--;
        }
        Objects.toString(i0Var.f());
        for (int i9 = 0; i9 < i8; i9++) {
            dVar.n(D1.b.f857a);
        }
        if (i0Var.f() == null) {
            a(context);
        }
    }

    public final void g() {
        if (c()) {
            LinkedHashMap linkedHashMap = this.f577f.f561a;
            Map S02 = x.S0(linkedHashMap);
            linkedHashMap.clear();
            A4.c cVar = this.f575d;
            if (!((C0433h) cVar.f291e).isEmpty() && !S02.isEmpty()) {
                Iterator it = ((C0433h) cVar.f291e).iterator();
                while (it.hasNext()) {
                    w1.e eVar = (w1.e) it.next();
                    EnumC0504o enumC0504o = (EnumC0504o) S02.get(eVar);
                    if (enumC0504o != null) {
                        eVar.hashCode();
                        enumC0504o.toString();
                        int ordinal = enumC0504o.ordinal();
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                eVar.z();
                            }
                        } else {
                            eVar.B();
                        }
                    } else {
                        Log.w("OverlayManager", "State for overlay " + eVar.hashCode() + " not found, can't restore state");
                    }
                }
                T4.a aVar = this.j;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }
}
