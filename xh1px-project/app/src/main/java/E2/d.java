package E2;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0004e;
import C6.O;
import C6.T;
import F6.B;
import F6.U;
import H7.q;
import I6.C0062a;
import J0.y;
import K3.C0091e;
import K3.D;
import L3.w;
import L7.C0159q;
import M3.C0183p;
import O3.F;
import R3.r;
import U3.o;
import X3.p;
import Z5.n;
import Z7.Z;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a6.s;
import a6.v;
import a6.x;
import a7.I;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.b0;
import b6.C0535c;
import c1.C0560a;
import c1.C0563d;
import c7.InterfaceC0588g;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.feature.smart.config.ui.common.starters.RequestNotificationPermissionActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import d6.C0623i;
import d6.InterfaceC0620f;
import d6.InterfaceC0621g;
import d6.InterfaceC0622h;
import f2.f;
import f2.h;
import f2.i;
import f2.k;
import f2.m;
import f7.C0723c;
import f7.C0724d;
import f7.C0725e;
import g0.AbstractComponentCallbacksC0755y;
import g7.AbstractC0803l;
import g7.C0799h;
import g7.C0800i;
import g7.C0804m;
import h4.AbstractC0832f;
import i.AbstractActivityC0870i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k2.AbstractC0951a;
import k2.C0952b;
import k2.C0953c;
import kotlin.NoWhenBranchMatchedException;
import n1.AbstractC1149a;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import o6.j;
import s3.AbstractC1492c;
import t.g;
import u6.InterfaceC1642c;
import w7.X;
import w7.z;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: b, reason: collision with root package name */
    public static C0062a f1185b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1186c = true;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1187d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1188a;

    public /* synthetic */ d(int i4) {
        this.f1188a = i4;
    }

    public static InterfaceC0622h C(InterfaceC0620f interfaceC0620f, InterfaceC0622h interfaceC0622h) {
        j.e(interfaceC0622h, "context");
        if (interfaceC0622h == C0623i.f10448d) {
            return interfaceC0620f;
        }
        return (InterfaceC0622h) interfaceC0622h.n(interfaceC0620f, new C0159q(8));
    }

    public static final void D(g gVar, boolean z8, InterfaceC1163b interfaceC1163b) {
        j.e(gVar, "map");
        g gVar2 = new g(999);
        int h8 = gVar.h();
        int i4 = 0;
        int i8 = 0;
        while (i4 < h8) {
            if (z8) {
                gVar2.g(gVar.f(i4), gVar.i(i4));
            } else {
                gVar2.g(gVar.f(i4), null);
            }
            i4++;
            i8++;
            if (i8 == 999) {
                interfaceC1163b.m(gVar2);
                if (!z8) {
                    int h9 = gVar2.h();
                    for (int i9 = 0; i9 < h9; i9++) {
                        gVar.g(gVar2.f(i9), gVar2.i(i9));
                    }
                }
                gVar2.a();
                i8 = 0;
            }
        }
        if (i8 > 0) {
            interfaceC1163b.m(gVar2);
            if (!z8) {
                int h10 = gVar2.h();
                for (int i10 = 0; i10 < h10; i10++) {
                    gVar.g(gVar2.f(i10), gVar2.i(i10));
                }
            }
        }
    }

    public static TypedValue E(Context context, int i4) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean F(Context context, int i4, boolean z8) {
        TypedValue E7 = E(context, i4);
        if (E7 != null && E7.type == 18) {
            if (E7.data != 0) {
                return true;
            }
            return false;
        }
        return z8;
    }

    public static TypedValue G(Context context, int i4, String str) {
        TypedValue E7 = E(context, i4);
        if (E7 != null) {
            return E7;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i4)));
    }

    public static final void H(A4.a aVar, boolean z8) {
        int i4;
        j.e(aVar, "<this>");
        MaterialButton materialButton = (MaterialButton) aVar.f281f;
        if (z8) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        materialButton.setVisibility(i4);
    }

    public static final void I(A4.a aVar, boolean z8) {
        Boolean bool;
        float f8;
        j.e(aVar, "<this>");
        Object tag = ((ConstraintLayout) aVar.f280e).getTag();
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (!j.a(bool, Boolean.TRUE)) {
            return;
        }
        TextInputLayout textInputLayout = (TextInputLayout) aVar.f282g;
        textInputLayout.setEnabled(!z8);
        if (z8) {
            f8 = 0.5f;
        } else {
            f8 = 1.0f;
        }
        textInputLayout.setAlpha(f8);
        ((MaterialButton) aVar.f281f).setChecked(z8);
    }

    public static void J(Window window, boolean z8) {
        int i4;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 35) {
            I.b.e(window, z8);
            return;
        }
        if (i8 >= 30) {
            I.b.d(window, z8);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z8) {
            i4 = systemUiVisibility & (-1793);
        } else {
            i4 = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i4);
    }

    public static final void K(A4.a aVar, boolean z8) {
        String str;
        j.e(aVar, "<this>");
        TextInputLayout textInputLayout = (TextInputLayout) aVar.f282g;
        if (z8) {
            str = ((ConstraintLayout) aVar.f280e).getContext().getString(R.string.input_field_error_required);
        } else {
            str = null;
        }
        textInputLayout.setError(str);
    }

    public static final void L(A4.a aVar, String str) {
        j.e(aVar, "<this>");
        j.e(str, "value");
        TextInputEditText textInputEditText = (TextInputEditText) aVar.f283h;
        textInputEditText.setInputType(2);
        textInputEditText.setImeOptions(6);
        textInputEditText.setText(str);
    }

    public static final void M(A4.a aVar, InterfaceC1162a interfaceC1162a) {
        ((MaterialButton) aVar.f281f).setOnClickListener(new a(2, interfaceC1162a));
    }

    public static final void N(A4.a aVar, InterfaceC1163b interfaceC1163b) {
        ((TextInputEditText) aVar.f283h).addTextChangedListener(new C2.b(1, interfaceC1163b));
    }

    public static final void O(A4.a aVar, String str) {
        j.e(aVar, "<this>");
        TextInputEditText textInputEditText = (TextInputEditText) aVar.f283h;
        textInputEditText.setInputType(1);
        textInputEditText.setImeOptions(6);
        textInputEditText.setText(str);
    }

    public static final void P(A4.a aVar, int i4, int i8, boolean z8) {
        ((TextInputLayout) aVar.f282g).setHint(i4);
        MaterialButton materialButton = (MaterialButton) aVar.f281f;
        materialButton.setIconResource(i8);
        ((ConstraintLayout) aVar.f280e).setTag(Boolean.valueOf(z8));
        materialButton.setCheckable(z8);
    }

    public static final boolean Q(AbstractC0951a abstractC0951a, f2.a aVar) {
        boolean z8;
        if (aVar.d()) {
            if (!(abstractC0951a instanceof C0953c) || !((z8 = aVar instanceof f2.e)) || !z8 || ((f2.e) aVar).f10695f != f2.d.f10688e) {
                if ((abstractC0951a instanceof C0952b) && (aVar instanceof f2.e) && !((f2.e) aVar).j()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void R(w1.e eVar, D d2, f2.a aVar) {
        w1.e aVar2;
        j.e(eVar, "<this>");
        j.e(d2, "configurator");
        j.e(aVar, "action");
        d2.f2642d.c(aVar);
        n nVar = new n(new B0.e(4, d2));
        if (aVar instanceof f2.e) {
            aVar2 = new C0183p((C0091e) nVar.getValue());
        } else if (aVar instanceof k) {
            aVar2 = new p((C0091e) nVar.getValue());
        } else if (aVar instanceof i) {
            aVar2 = new o((C0091e) nVar.getValue());
        } else if (aVar instanceof f) {
            aVar2 = new F((C0091e) nVar.getValue());
        } else if (aVar instanceof m) {
            aVar2 = new Y3.m((C0091e) nVar.getValue());
        } else if (aVar instanceof f2.o) {
            aVar2 = new Z3.D((C0091e) nVar.getValue());
        } else if (aVar instanceof f2.c) {
            aVar2 = new w((C0091e) nVar.getValue());
        } else if (aVar instanceof f2.j) {
            aVar2 = new W3.o((C0091e) nVar.getValue());
        } else if (aVar instanceof h) {
            if (new L1.e(false).a(eVar.k())) {
                aVar2 = new T3.o((C0091e) nVar.getValue());
            } else {
                Context k = eVar.k();
                int i4 = RequestNotificationPermissionActivity.f9810I;
                Intent addFlags = new Intent(k, (Class<?>) RequestNotificationPermissionActivity.class).addFlags(268468224);
                j.d(addFlags, "addFlags(...)");
                aVar2 = new F1.a(addFlags);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        eVar.o().d(eVar.k(), aVar2, true);
    }

    public static final void S(w1.e eVar, D d2) {
        j.e(d2, "configurator");
        eVar.o().d(eVar.k(), new N3.d(new M7.c(eVar, 4, d2)), false);
    }

    public static void T(ViewGroup viewGroup, boolean z8) {
        if (Build.VERSION.SDK_INT >= 29) {
            y.b(viewGroup, z8);
        } else if (f1186c) {
            try {
                y.b(viewGroup, z8);
            } catch (NoSuchMethodError unused) {
                f1186c = false;
            }
        }
    }

    public static C0723c U(C0725e c0725e) {
        j.e(c0725e, "shortName");
        String b4 = c0725e.b();
        j.d(b4, "asString(...)");
        return new C0723c(new C0724d(b4, C0723c.f10796c.f10797a, c0725e));
    }

    public static float a(float f8) {
        if (f8 <= 0.04045f) {
            return f8 / 12.92f;
        }
        return (float) Math.pow((f8 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f8) {
        if (f8 <= 0.0031308f) {
            return f8 * 12.92f;
        }
        return (float) ((Math.pow(f8, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final void c(MenuItem menuItem, Z4.m mVar) {
        Drawable drawable;
        menuItem.setVisible(mVar.f7452a);
        menuItem.setEnabled(mVar.f7453b);
        Drawable icon = menuItem.getIcon();
        if (icon != null && (drawable = icon.mutate()) != null) {
            drawable.setAlpha(mVar.f7454c);
        } else {
            drawable = null;
        }
        menuItem.setIcon(drawable);
    }

    public static final String d(long j) {
        if (j < 1) {
            return "< 1ms";
        }
        int i4 = J7.a.f2503g;
        return J7.a.h(J7.f.m(j, J7.c.MILLISECONDS));
    }

    public static C0535c f(C0535c c0535c) {
        c0535c.l();
        c0535c.f9220f = true;
        if (c0535c.f9219e > 0) {
            return c0535c;
        }
        return C0535c.f9217g;
    }

    public static void g(N7.h hVar) {
        hVar.h(null, false);
    }

    public static A6.f h(A6.c cVar, boolean z8) {
        String lowerCase;
        j.e(cVar, "functionClass");
        List list = cVar.f396n;
        A6.f fVar = new A6.f(cVar, null, 1, z8);
        F6.w F02 = cVar.F0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((T) obj).e0() != X.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        q W02 = AbstractC0436k.W0(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(W02, 10));
        Iterator it = W02.iterator();
        while (true) {
            H7.b bVar = (H7.b) it;
            if (bVar.f2047e.hasNext()) {
                v vVar = (v) bVar.next();
                int i4 = vVar.f7769a;
                T t8 = (T) vVar.f7770b;
                String b4 = t8.getName().b();
                j.d(b4, "asString(...)");
                if (b4.equals("T")) {
                    lowerCase = "instance";
                } else if (b4.equals("E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = b4.toLowerCase(Locale.ROOT);
                    j.d(lowerCase, "toLowerCase(...)");
                }
                A6.f fVar2 = fVar;
                C0725e e9 = C0725e.e(lowerCase);
                z l6 = t8.l();
                j.d(l6, "getDefaultType(...)");
                arrayList2.add(new U(fVar2, null, i4, D6.i.f1043a, e9, l6, false, false, false, null, O.f726a));
                fVar = fVar2;
            } else {
                z l8 = ((T) AbstractC0436k.x0(list)).l();
                EnumC0023y enumC0023y = EnumC0023y.f781h;
                C0014o c0014o = AbstractC0015p.f758e;
                s sVar = s.f7766d;
                fVar.R0(null, F02, sVar, sVar, arrayList2, l8, enumC0023y, c0014o);
                A6.f fVar3 = fVar;
                fVar3.f1580A = true;
                return fVar3;
            }
        }
    }

    public static C0535c i() {
        return new C0535c(10);
    }

    public static final w7.F j(InterfaceC0004e interfaceC0004e, InterfaceC0004e interfaceC0004e2) {
        j.e(interfaceC0004e, "from");
        j.e(interfaceC0004e2, "to");
        interfaceC0004e.t().size();
        interfaceC0004e2.t().size();
        List t8 = interfaceC0004e.t();
        j.d(t8, "getDeclaredTypeParameters(...)");
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(t8, 10));
        Iterator it = t8.iterator();
        while (it.hasNext()) {
            arrayList.add(((T) it.next()).B());
        }
        List t9 = interfaceC0004e2.t();
        j.d(t9, "getDeclaredTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(t9, 10));
        Iterator it2 = t9.iterator();
        while (it2.hasNext()) {
            z l6 = ((T) it2.next()).l();
            j.d(l6, "getDefaultType(...)");
            arrayList2.add(AbstractC0405a.e(l6));
        }
        return new w7.F(1, x.R0(AbstractC0436k.X0(arrayList, arrayList2)));
    }

    public static int m(float f8, int i4, int i8) {
        if (i4 == i8 || f8 <= 0.0f) {
            return i4;
        }
        if (f8 >= 1.0f) {
            return i8;
        }
        float f9 = ((i4 >> 24) & 255) / 255.0f;
        float f10 = ((i8 >> 24) & 255) / 255.0f;
        float a3 = a(((i4 >> 16) & 255) / 255.0f);
        float a4 = a(((i4 >> 8) & 255) / 255.0f);
        float a9 = a((i4 & 255) / 255.0f);
        float a10 = a(((i8 >> 16) & 255) / 255.0f);
        float a11 = a(((i8 >> 8) & 255) / 255.0f);
        float a12 = a((i8 & 255) / 255.0f);
        float a13 = AbstractC1149a.a(f10, f9, f8, f9);
        float a14 = AbstractC1149a.a(a10, a3, f8, a3);
        float a15 = AbstractC1149a.a(a11, a4, f8, a4);
        float a16 = AbstractC1149a.a(a12, a9, f8, a9);
        float b4 = b(a14) * 255.0f;
        float b9 = b(a15) * 255.0f;
        return Math.round(b(a16) * 255.0f) | (Math.round(b4) << 16) | (Math.round(a13 * 255.0f) << 24) | (Math.round(b9) << 8);
    }

    public static final String n(double d2) {
        return String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(AbstractC0832f.d(d2 * 100))}, 1)).concat(" % ");
    }

    public static final Object o(Context context, Class cls) {
        Application application;
        j.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        } else {
            Context context2 = applicationContext;
            while (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                if (context2 instanceof Application) {
                    application = (Application) context2;
                }
            }
            throw new IllegalStateException("Could not find an Application in the given context: " + applicationContext);
        }
        return D2.f.p(application, cls);
    }

    public static InterfaceC0620f p(InterfaceC0620f interfaceC0620f, InterfaceC0621g interfaceC0621g) {
        j.e(interfaceC0621g, "key");
        if (j.a(interfaceC0620f.getKey(), interfaceC0621g)) {
            return interfaceC0620f;
        }
        return null;
    }

    public static U5.f q(AbstractActivityC0870i abstractActivityC0870i, b0 b0Var) {
        r a3 = ((C0560a) ((U5.a) D2.f.p(abstractActivityC0870i, U5.a.class))).a();
        Y5.b bVar = (Y5.b) a3.f5082e;
        b0Var.getClass();
        return new U5.f(bVar, b0Var, (r) a3.f5083f);
    }

    public static final InterfaceC1642c r(X7.f fVar) {
        j.e(fVar, "<this>");
        if (fVar instanceof X7.b) {
            ((X7.b) fVar).getClass();
            return null;
        }
        if (fVar instanceof Z) {
            return r(((Z) fVar).f7580a);
        }
        return null;
    }

    public static final Object t(AbstractC0803l abstractC0803l, g7.n nVar) {
        j.e(abstractC0803l, "<this>");
        j.e(nVar, "extension");
        if (abstractC0803l.l(nVar)) {
            return abstractC0803l.k(nVar);
        }
        return null;
    }

    public static final Object u(AbstractC0803l abstractC0803l, g7.n nVar, int i4) {
        int size;
        j.e(abstractC0803l, "<this>");
        j.e(nVar, "extension");
        abstractC0803l.o(nVar);
        C0800i c0800i = abstractC0803l.f11243d;
        C0804m c0804m = nVar.f11250d;
        c0800i.getClass();
        g7.z zVar = c0800i.f11238a;
        if (c0804m.f11246f) {
            Object obj = zVar.get(c0804m);
            if (obj == null) {
                size = 0;
            } else {
                size = ((List) obj).size();
            }
            if (i4 < size) {
                abstractC0803l.o(nVar);
                if (c0804m.f11246f) {
                    Object obj2 = zVar.get(c0804m);
                    if (obj2 != null) {
                        return nVar.a(((List) obj2).get(i4));
                    }
                    throw new IndexOutOfBoundsException();
                }
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            return null;
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public static U5.f v(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, b0 b0Var) {
        r a3 = ((C0563d) ((U5.b) D2.f.p(abstractComponentCallbacksC0755y, U5.b.class))).f9442b.a();
        Y5.b bVar = (Y5.b) a3.f5082e;
        b0Var.getClass();
        return new U5.f(bVar, b0Var, (r) a3.f5083f);
    }

    public static final Y6.p w(I i4, InterfaceC0588g interfaceC0588g, B b4, boolean z8, boolean z9, boolean z10) {
        j.e(i4, "proto");
        j.e(interfaceC0588g, "nameResolver");
        g7.n nVar = d7.k.f10515d;
        j.d(nVar, "propertySignature");
        d7.e eVar = (d7.e) t(i4, nVar);
        if (eVar != null) {
            if (z8) {
                C0799h c0799h = e7.g.f10671a;
                e7.d b9 = e7.g.b(i4, interfaceC0588g, b4, z10);
                if (b9 != null) {
                    return AbstractC1492c.l(b9);
                }
            } else if (z9 && (eVar.f10475e & 2) == 2) {
                d7.c cVar = eVar.f10477g;
                j.d(cVar, "getSyntheticMethod(...)");
                return new Y6.p(interfaceC0588g.getString(cVar.f10463f).concat(interfaceC0588g.getString(cVar.f10464g)));
            }
        }
        return null;
    }

    public static /* synthetic */ Y6.p x(I i4, InterfaceC0588g interfaceC0588g, B b4, int i8) {
        boolean z8;
        boolean z9;
        if ((i8 & 8) != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        if ((i8 & 16) != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        return w(i4, interfaceC0588g, b4, z8, z9, true);
    }

    public static List y(Object obj) {
        List singletonList = Collections.singletonList(obj);
        j.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static InterfaceC0622h z(InterfaceC0620f interfaceC0620f, InterfaceC0621g interfaceC0621g) {
        j.e(interfaceC0621g, "key");
        if (j.a(interfaceC0620f.getKey(), interfaceC0621g)) {
            return C0623i.f10448d;
        }
        return interfaceC0620f;
    }

    public abstract void A(Throwable th);

    public abstract void B(A4.a aVar);

    public abstract String e();

    public abstract String k(byte[] bArr, int i4, int i8);

    public abstract int l(String str, byte[] bArr, int i4, int i8);

    public abstract AbstractC0951a s();

    public String toString() {
        switch (this.f1188a) {
            case 27:
                return e();
            default:
                return super.toString();
        }
    }
}
