package B1;

import Z5.n;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.InterfaceC0499j;
import androidx.lifecycle.InterfaceC0510v;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import c1.C0564e;
import k0.AbstractC0948c;
import k0.C0946a;
import n6.InterfaceC1162a;
import q3.j;
import y1.InterfaceC1830a;

/* loaded from: classes.dex */
public abstract class h implements InterfaceC0510v, f0, InterfaceC0499j {

    /* renamed from: d, reason: collision with root package name */
    public final n f436d;

    /* renamed from: e, reason: collision with root package name */
    public final C0512x f437e = k();

    /* renamed from: f, reason: collision with root package name */
    public final n f438f = new n(new e(0));

    /* renamed from: g, reason: collision with root package name */
    public final n f439g;

    /* renamed from: h, reason: collision with root package name */
    public final n f440h;

    /* renamed from: i, reason: collision with root package name */
    public ViewGroup f441i;
    public ViewGroup j;
    public c k;

    public h(Context context) {
        final int i4 = 0;
        this.f436d = new n(new InterfaceC1162a(this) { // from class: B1.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ h f430e;

            {
                this.f430e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i4) {
                    case 0:
                        return new C0512x(this.f430e);
                    default:
                        h hVar = this.f430e;
                        c1.h hVar2 = ((c1.h) ((InterfaceC1830a) D2.f.p(hVar.h().getApplicationContext(), InterfaceC1830a.class))).f9469b;
                        hVar.i();
                        return new C0564e(hVar2);
                }
            }
        });
        this.f439g = new n(new f(context, 0));
        final int i8 = 1;
        this.f440h = new n(new InterfaceC1162a(this) { // from class: B1.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ h f430e;

            {
                this.f430e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i8) {
                    case 0:
                        return new C0512x(this.f430e);
                    default:
                        h hVar = this.f430e;
                        c1.h hVar2 = ((c1.h) ((InterfaceC1830a) D2.f.p(hVar.h().getApplicationContext(), InterfaceC1830a.class))).f9469b;
                        hVar.i();
                        return new C0564e(hVar2);
                }
            }
        });
    }

    public boolean a() {
        return this instanceof j;
    }

    public final void c(InterfaceC1162a interfaceC1162a) {
        if (k().f8862d == EnumC0504o.f8850h) {
            i().h(interfaceC1162a);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return (b0) this.f439g.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0499j
    public final AbstractC0948c e() {
        return C0946a.f11950b;
    }

    @Override // androidx.lifecycle.f0
    public final e0 f() {
        return (e0) this.f438f.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0510v
    public final C0512x g() {
        return this.f437e;
    }

    public final Context h() {
        ViewGroup viewGroup = this.f441i;
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            o6.j.d(context, "getContext(...)");
            return context;
        }
        o6.j.i("rootContainer");
        throw null;
    }

    public final c i() {
        c cVar = this.k;
        if (cVar != null) {
            return cVar;
        }
        o6.j.i("dialogController");
        throw null;
    }

    public final C0564e j() {
        return (C0564e) this.f440h.getValue();
    }

    public final C0512x k() {
        return (C0512x) this.f436d.getValue();
    }

    public abstract ViewGroup n(ViewGroup viewGroup);

    public abstract void q();

    public final void r() {
        if (k().f8862d != EnumC0504o.f8850h) {
            return;
        }
        k().g(EnumC0504o.f8849g);
    }

    public final void s() {
        if (k().f8862d != EnumC0504o.f8849g) {
            return;
        }
        p();
        ViewGroup viewGroup = this.f441i;
        if (viewGroup != null) {
            ViewGroup viewGroup2 = this.j;
            if (viewGroup2 != null) {
                viewGroup.removeView(viewGroup2);
                k().g(EnumC0504o.f8848f);
                return;
            } else {
                o6.j.i("root");
                throw null;
            }
        }
        o6.j.i("rootContainer");
        throw null;
    }

    public void l() {
    }

    public void m() {
    }

    public void p() {
    }

    public void o(C2.a aVar) {
    }
}
