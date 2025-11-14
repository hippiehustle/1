package g0;

import a6.AbstractC0436k;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import n1.AbstractC1149a;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f11022a;

    /* renamed from: b, reason: collision with root package name */
    public int f11023b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0755y f11024c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11025d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11026e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11027f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11028g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11029h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11030i;
    public final ArrayList j;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final a0 f11031l;

    public g0(int i4, int i8, a0 a0Var) {
        AbstractC1149a.l("finalState", i4);
        AbstractC1149a.l("lifecycleImpact", i8);
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = a0Var.f10972c;
        o6.j.d(abstractComponentCallbacksC0755y, "fragmentStateManager.fragment");
        AbstractC1149a.l("finalState", i4);
        AbstractC1149a.l("lifecycleImpact", i8);
        o6.j.e(abstractComponentCallbacksC0755y, "fragment");
        this.f11022a = i4;
        this.f11023b = i8;
        this.f11024c = abstractComponentCallbacksC0755y;
        this.f11025d = new ArrayList();
        this.f11030i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.f11031l = a0Var;
    }

    public final void a(ViewGroup viewGroup) {
        o6.j.e(viewGroup, "container");
        this.f11029h = false;
        if (!this.f11026e) {
            this.f11026e = true;
            if (this.j.isEmpty()) {
                b();
                return;
            }
            for (f0 f0Var : AbstractC0436k.Q0(this.k)) {
                f0Var.getClass();
                if (!f0Var.f11018b) {
                    f0Var.a(viewGroup);
                }
                f0Var.f11018b = true;
            }
        }
    }

    public final void b() {
        this.f11029h = false;
        if (!this.f11027f) {
            if (T.K(2)) {
                toString();
            }
            this.f11027f = true;
            Iterator it = this.f11025d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f11024c.f11120p = false;
        this.f11031l.k();
    }

    public final void c(f0 f0Var) {
        o6.j.e(f0Var, "effect");
        ArrayList arrayList = this.j;
        if (arrayList.remove(f0Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i4, int i8) {
        AbstractC1149a.l("finalState", i4);
        AbstractC1149a.l("lifecycleImpact", i8);
        int b4 = AbstractC1769h.b(i8);
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f11024c;
        if (b4 != 0) {
            if (b4 != 1) {
                if (b4 == 2) {
                    if (T.K(2)) {
                        Objects.toString(abstractComponentCallbacksC0755y);
                    }
                    this.f11022a = 1;
                    this.f11023b = 3;
                    this.f11030i = true;
                    return;
                }
                return;
            }
            if (this.f11022a == 1) {
                if (T.K(2)) {
                    Objects.toString(abstractComponentCallbacksC0755y);
                }
                this.f11022a = 2;
                this.f11023b = 2;
                this.f11030i = true;
                return;
            }
            return;
        }
        if (this.f11022a != 1) {
            if (T.K(2)) {
                Objects.toString(abstractComponentCallbacksC0755y);
                if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
                    throw null;
                }
            }
            this.f11022a = i4;
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder s8 = A.j.s("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        int i4 = this.f11022a;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        str = "null";
                    } else {
                        str = "INVISIBLE";
                    }
                } else {
                    str = "GONE";
                }
            } else {
                str = "VISIBLE";
            }
        } else {
            str = "REMOVED";
        }
        s8.append(str);
        s8.append(" lifecycleImpact = ");
        int i8 = this.f11023b;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    str2 = "null";
                } else {
                    str2 = "REMOVING";
                }
            } else {
                str2 = "ADDING";
            }
        } else {
            str2 = "NONE";
        }
        s8.append(str2);
        s8.append(" fragment = ");
        s8.append(this.f11024c);
        s8.append('}');
        return s8.toString();
    }
}
