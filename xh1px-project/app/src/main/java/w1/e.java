package w1;

import C1.g;
import D2.f;
import L7.AbstractC0166y;
import L7.F;
import L7.k0;
import Z5.n;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.InterfaceC0499j;
import androidx.lifecycle.InterfaceC0510v;
import androidx.lifecycle.U;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import c1.C0564e;
import c1.h;
import java.io.PrintWriter;
import k0.AbstractC0948c;
import k0.C0946a;
import m.C1039b;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import o3.C1235f;
import o6.j;
import s3.AbstractC1492c;
import y1.InterfaceC1830a;
import y1.InterfaceC1831b;

/* loaded from: classes.dex */
public abstract class e implements InterfaceC0510v, f0, InterfaceC0499j {

    /* renamed from: d, reason: collision with root package name */
    public final Integer f15662d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15663e;

    /* renamed from: f, reason: collision with root package name */
    public Context f15664f;

    /* renamed from: g, reason: collision with root package name */
    public final n f15665g;

    /* renamed from: h, reason: collision with root package name */
    public final n f15666h;

    /* renamed from: i, reason: collision with root package name */
    public final n f15667i;
    public C0512x j = new C0512x(this);
    public final n k = new n(new C1235f(5));

    /* renamed from: l, reason: collision with root package name */
    public final n f15668l;

    /* renamed from: m, reason: collision with root package name */
    public k0 f15669m;

    /* renamed from: n, reason: collision with root package name */
    public C1688b f15670n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15671o;

    public e(Integer num, boolean z8) {
        this.f15662d = num;
        this.f15663e = z8;
        final int i4 = 0;
        this.f15665g = new n(new InterfaceC1162a(this) { // from class: w1.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e f15654e;

            {
                this.f15654e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i4) {
                    case 0:
                        return (Y1.d) ((h) ((Z1.a) f.p(this.f15654e.k().getApplicationContext(), Z1.a.class))).f9471d.get();
                    case 1:
                        return (g) ((h) ((InterfaceC1831b) f.p(this.f15654e.k().getApplicationContext(), InterfaceC1831b.class))).f9473f.get();
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new C0564e(((h) ((InterfaceC1830a) f.p(this.f15654e.k().getApplicationContext(), InterfaceC1830a.class))).f9469b);
                    default:
                        Context applicationContext = this.f15654e.k().getApplicationContext();
                        j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                        Application application = (Application) applicationContext;
                        if (a0.f8825c == null) {
                            a0.f8825c = new a0(application);
                        }
                        a0 a0Var = a0.f8825c;
                        j.b(a0Var);
                        return a0Var;
                }
            }
        });
        final int i8 = 1;
        this.f15666h = new n(new InterfaceC1162a(this) { // from class: w1.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e f15654e;

            {
                this.f15654e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i8) {
                    case 0:
                        return (Y1.d) ((h) ((Z1.a) f.p(this.f15654e.k().getApplicationContext(), Z1.a.class))).f9471d.get();
                    case 1:
                        return (g) ((h) ((InterfaceC1831b) f.p(this.f15654e.k().getApplicationContext(), InterfaceC1831b.class))).f9473f.get();
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new C0564e(((h) ((InterfaceC1830a) f.p(this.f15654e.k().getApplicationContext(), InterfaceC1830a.class))).f9469b);
                    default:
                        Context applicationContext = this.f15654e.k().getApplicationContext();
                        j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                        Application application = (Application) applicationContext;
                        if (a0.f8825c == null) {
                            a0.f8825c = new a0(application);
                        }
                        a0 a0Var = a0.f8825c;
                        j.b(a0Var);
                        return a0Var;
                }
            }
        });
        final int i9 = 2;
        this.f15667i = new n(new InterfaceC1162a(this) { // from class: w1.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e f15654e;

            {
                this.f15654e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i9) {
                    case 0:
                        return (Y1.d) ((h) ((Z1.a) f.p(this.f15654e.k().getApplicationContext(), Z1.a.class))).f9471d.get();
                    case 1:
                        return (g) ((h) ((InterfaceC1831b) f.p(this.f15654e.k().getApplicationContext(), InterfaceC1831b.class))).f9473f.get();
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new C0564e(((h) ((InterfaceC1830a) f.p(this.f15654e.k().getApplicationContext(), InterfaceC1830a.class))).f9469b);
                    default:
                        Context applicationContext = this.f15654e.k().getApplicationContext();
                        j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                        Application application = (Application) applicationContext;
                        if (a0.f8825c == null) {
                            a0.f8825c = new a0(application);
                        }
                        a0 a0Var = a0.f8825c;
                        j.b(a0Var);
                        return a0Var;
                }
            }
        });
        final int i10 = 3;
        this.f15668l = new n(new InterfaceC1162a(this) { // from class: w1.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e f15654e;

            {
                this.f15654e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                switch (i10) {
                    case 0:
                        return (Y1.d) ((h) ((Z1.a) f.p(this.f15654e.k().getApplicationContext(), Z1.a.class))).f9471d.get();
                    case 1:
                        return (g) ((h) ((InterfaceC1831b) f.p(this.f15654e.k().getApplicationContext(), InterfaceC1831b.class))).f9473f.get();
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        return new C0564e(((h) ((InterfaceC1830a) f.p(this.f15654e.k().getApplicationContext(), InterfaceC1830a.class))).f9469b);
                    default:
                        Context applicationContext = this.f15654e.k().getApplicationContext();
                        j.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                        Application application = (Application) applicationContext;
                        if (a0.f8825c == null) {
                            a0.f8825c = new a0(application);
                        }
                        a0 a0Var = a0.f8825c;
                        j.b(a0Var);
                        return a0Var;
                }
            }
        });
    }

    public final void A(View view, InterfaceC1163b interfaceC1163b) {
        j.e(view, "<this>");
        view.setOnClickListener(new D2.a(this, 15, interfaceC1163b));
    }

    public void B() {
        if (this.j.f8862d != EnumC0504o.f8848f) {
            return;
        }
        if (this.f15671o) {
            y();
        }
        hashCode();
        v();
        this.j.g(EnumC0504o.f8849g);
    }

    public void C() {
        if (this.j.f8862d.compareTo(EnumC0504o.f8849g) >= 0) {
            if (this.j.f8862d.compareTo(EnumC0504o.f8850h) >= 0) {
                x();
            }
            hashCode();
            this.j.g(EnumC0504o.f8848f);
            w();
        }
    }

    public void a() {
        if (!o().e(k())) {
            Log.w("BaseOverlay", "Overlay " + hashCode() + " can't be removed from back stack, destroying manually...");
            i();
        }
    }

    public final void c(Context context, InterfaceC1164c interfaceC1164c) {
        Context b4;
        j.e(context, "appContext");
        C0512x c0512x = this.j;
        EnumC0504o enumC0504o = c0512x.f8862d;
        EnumC0504o enumC0504o2 = EnumC0504o.f8846d;
        EnumC0504o enumC0504o3 = EnumC0504o.f8847e;
        if (enumC0504o == enumC0504o2) {
            c0512x.g(enumC0504o3);
        }
        if (this.j.f8862d != enumC0504o3) {
            return;
        }
        hashCode();
        if (this.f15664f == null) {
            this.f15664f = context;
        }
        Integer num = this.f15662d;
        if (num == null) {
            b4 = context;
        } else {
            C1039b c1039b = new C1039b(context, num.intValue());
            Configuration configuration = new Configuration(c1039b.getApplicationContext().getResources().getConfiguration());
            configuration.orientation = l().f7104e.f7095b;
            c1039b.a(configuration);
            b4 = r5.e.b(c1039b);
        }
        this.f15664f = b4;
        if (interfaceC1164c != null) {
            this.f15670n = new C1688b(interfaceC1164c, context, this);
        }
        p();
        this.j.g(EnumC0504o.f8848f);
    }

    @Override // androidx.lifecycle.InterfaceC0499j
    public final b0 d() {
        return (b0) this.f15668l.getValue();
    }

    @Override // androidx.lifecycle.InterfaceC0499j
    public final AbstractC0948c e() {
        return C0946a.f11950b;
    }

    @Override // androidx.lifecycle.f0
    public final e0 f() {
        return n();
    }

    @Override // androidx.lifecycle.InterfaceC0510v
    public final C0512x g() {
        return this.j;
    }

    public final void h(InterfaceC1162a interfaceC1162a) {
        if (this.f15669m == null && this.j.f8862d == EnumC0504o.f8850h) {
            this.f15669m = AbstractC0166y.q(U.e(this), null, null, new C1689c(interfaceC1162a, this, null), 3);
        }
    }

    public void i() {
        if (this.j.f8862d.compareTo(EnumC0504o.f8848f) >= 0) {
            if (this.j.f8862d.compareTo(EnumC0504o.f8849g) >= 0) {
                C();
            }
            hashCode();
            this.j.g(EnumC0504o.f8846d);
            q();
            if (!this.f15671o) {
                k0 k0Var = this.f15669m;
                if (k0Var != null) {
                    k0Var.d(null);
                }
                this.f15669m = null;
                C1688b c1688b = this.f15670n;
                if (c1688b != null) {
                    c1688b.a();
                }
                this.f15670n = null;
                S7.e eVar = F.f3175a;
                AbstractC0166y.q(AbstractC0166y.b(Q7.n.f4962a), null, null, new C1690d(this, null), 3);
            }
        }
    }

    public void j(PrintWriter printWriter, CharSequence charSequence) {
        j.e(charSequence, "prefix");
        String b4 = AbstractC1492c.b(charSequence);
        printWriter.append(charSequence).println(getClass().getSimpleName() + "@" + hashCode());
        printWriter.append((CharSequence) b4).append((CharSequence) ("lifecycle=" + this.j.f8862d + "; ")).append((CharSequence) ("recreateOnRotation=" + this.f15663e + "; ")).append((CharSequence) ("shouldBeRecreated=" + this.f15671o + "; ")).println();
    }

    public final Context k() {
        Context context = this.f15664f;
        if (context != null) {
            return context;
        }
        j.i("context");
        throw null;
    }

    public final Y1.d l() {
        return (Y1.d) this.f15665g.getValue();
    }

    public final C0564e m() {
        return (C0564e) this.f15667i.getValue();
    }

    public final e0 n() {
        return (e0) this.k.getValue();
    }

    public final g o() {
        return (g) this.f15666h.getValue();
    }

    public abstract void p();

    public boolean r(KeyEvent keyEvent) {
        return false;
    }

    public final void x() {
        if (this.j.f8862d != EnumC0504o.f8850h) {
            return;
        }
        hashCode();
        this.j.g(EnumC0504o.f8849g);
        t();
    }

    public final void y() {
        if (this.j.f8862d.compareTo(EnumC0504o.f8848f) >= 0) {
            hashCode();
            i();
            this.f15671o = false;
            this.j = new C0512x(this);
            c(k(), null);
        }
    }

    public void z() {
        if (this.j.f8862d == EnumC0504o.f8848f) {
            B();
        }
        if (this.j.f8862d != EnumC0504o.f8849g) {
            return;
        }
        hashCode();
        u();
        this.j.g(EnumC0504o.f8850h);
    }

    public void q() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }
}
