package O3;

import D4.C0040p;
import O7.InterfaceC0233f;
import a6.AbstractC0437l;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.buzbuz.smartautoclicker.R;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 extends androidx.lifecycle.Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f3924b;

    /* renamed from: c, reason: collision with root package name */
    public final O7.P f3925c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f3926d;

    /* renamed from: e, reason: collision with root package name */
    public final PackageManager f3927e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0233f f3928f;

    /* renamed from: g, reason: collision with root package name */
    public final C4.e f3929g;

    /* renamed from: h, reason: collision with root package name */
    public final H f3930h;

    /* renamed from: i, reason: collision with root package name */
    public final C4.e f3931i;
    public final H j;
    public final C4.e k;

    /* renamed from: l, reason: collision with root package name */
    public final C4.e f3932l;

    /* renamed from: m, reason: collision with root package name */
    public final Q f3933m;

    /* renamed from: n, reason: collision with root package name */
    public final D2.d f3934n;

    /* renamed from: o, reason: collision with root package name */
    public final D2.d f3935o;

    /* renamed from: p, reason: collision with root package name */
    public final List f3936p;

    /* renamed from: q, reason: collision with root package name */
    public final C0040p f3937q;

    /* renamed from: r, reason: collision with root package name */
    public final C0040p f3938r;

    /* renamed from: s, reason: collision with root package name */
    public final A.i f3939s;

    /* renamed from: t, reason: collision with root package name */
    public final C4.e f3940t;

    public a0(Context context, H3.n nVar) {
        o6.j.e(nVar, "editionRepository");
        this.f3924b = nVar;
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.f1990m;
        W0.d dVar = new W0.d(18, new C0040p(nVar2, 16));
        this.f3925c = O7.V.t(new C0040p(nVar2, 15), androidx.lifecycle.U.g(this), O7.Z.f4117a, Boolean.FALSE);
        this.f3926d = h2.a.j(context);
        PackageManager packageManager = context.getPackageManager();
        o6.j.d(packageManager, "getPackageManager(...)");
        this.f3927e = packageManager;
        this.f3928f = O7.V.j(O7.V.k(nVar.j));
        int i4 = 12;
        this.f3929g = new C4.e(new Q(dVar, 0), i4);
        int i8 = 1;
        this.f3930h = new H(dVar, i8);
        this.f3931i = new C4.e(new Q(dVar, i8), i4);
        int i9 = 2;
        this.j = new H(dVar, i9);
        this.k = new C4.e(new Q(dVar, i9), i4);
        this.f3932l = new C4.e(new H(dVar, 3), i4);
        this.f3933m = new Q(dVar, 3);
        D2.d dVar2 = new D2.d(R.string.dropdown_intent_sending_type_item_activity, 6, null);
        this.f3934n = dVar2;
        D2.d dVar3 = new D2.d(R.string.dropdown_intent_sending_type_item_broadcast, 6, null);
        this.f3935o = dVar3;
        this.f3936p = AbstractC0437l.X(dVar2, dVar3);
        this.f3937q = new C0040p(new A.i(dVar, 21, this), 18);
        this.f3938r = new C0040p(yVar.f1991n, 14);
        this.f3939s = new A.i(new H(dVar, 0), 20, this);
        this.f3940t = new C4.e(yVar.f1990m, 10);
    }

    public final void e(String str) {
        o6.j.e(str, "action");
        H3.n nVar = this.f3924b;
        f2.f fVar = (f2.f) nVar.f1950e.a();
        if (fVar != null) {
            nVar.j(f2.f.i(fVar, null, null, null, 0, null, false, str, null, null, null, 959));
        }
    }

    public final void f(Integer num) {
        H3.n nVar = this.f3924b;
        f2.f fVar = (f2.f) nVar.f1950e.a();
        if (fVar != null) {
            nVar.j(f2.f.i(fVar, null, null, null, 0, null, false, null, null, num, null, 767));
        }
    }

    public final void g(boolean z8) {
        boolean z9;
        H3.n nVar = this.f3924b;
        f2.f fVar = (f2.f) nVar.f1950e.a();
        if (fVar != null) {
            Boolean valueOf = Boolean.valueOf(z8);
            if (!z8) {
                z9 = false;
            } else {
                z9 = fVar.f10704f;
            }
            nVar.j(f2.f.i(fVar, null, null, null, 0, valueOf, z9, null, null, null, null, 975));
        }
    }

    public final void h(String str) {
        o6.j.e(str, "name");
        H3.n nVar = this.f3924b;
        f2.f fVar = (f2.f) nVar.f1950e.a();
        if (fVar != null) {
            nVar.j(f2.f.i(fVar, null, null, str, 0, null, false, null, null, null, null, 1019));
        }
    }
}
