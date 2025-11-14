package D2;

import A0.l;
import A0.m;
import C6.InterfaceC0001b;
import C6.InterfaceC0004e;
import C6.InterfaceC0009j;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.M;
import F6.AbstractC0054n;
import F6.U;
import F6.w;
import I7.v;
import L7.AbstractC0166y;
import L7.C0158p;
import N0.C0202j;
import P.InterfaceC0262j;
import P.O;
import Q7.q;
import X0.p;
import Y6.r;
import Z7.Q;
import a.AbstractC0405a;
import a1.C0414a;
import a6.AbstractC0430e;
import a6.t;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.EnumC0504o;
import b6.C0533a;
import b6.C0535c;
import b6.C0538f;
import b6.C0541i;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import d6.InterfaceC0617c;
import d6.InterfaceC0619e;
import d6.InterfaceC0622h;
import e4.AbstractC0644b;
import e4.C0643a;
import e6.EnumC0646a;
import f2.n;
import f2.o;
import f4.C0709b;
import f6.AbstractC0711a;
import f6.AbstractC0713c;
import f7.C0725e;
import g0.AbstractComponentCallbacksC0755y;
import g0.N;
import g0.T;
import g4.C0780b;
import h6.AbstractC0837b;
import i7.AbstractC0890e;
import j2.AbstractC0901a;
import j2.C0903c;
import j2.C0905e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import k2.AbstractC0951a;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import o.p1;
import o6.y;
import q4.X;
import s3.AbstractC1492c;
import u0.u;
import u0.x;
import u6.AbstractC1638C;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static volatile W0.d f869a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile W0.c f870b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f871c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Method f872d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f873e = false;

    /* renamed from: f, reason: collision with root package name */
    public static Field f874f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f875g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f876h = 0;

    public static T0.a A(Y0.c cVar, C0202j c0202j) {
        return new T0.a(2, p.a(cVar, c0202j, 1.0f, X0.f.f6813d, false));
    }

    public static T0.a B(Y0.d dVar, C0202j c0202j) {
        return new T0.a(3, p.a(dVar, c0202j, Z0.k.c(), X0.f.f6815f, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C(InterfaceC0617c interfaceC0617c, InterfaceC1163b interfaceC1163b, u uVar, boolean z8, boolean z9) {
        AbstractC0713c abstractC0713c;
        int i4;
        EnumC0646a enumC0646a;
        InterfaceC1163b interfaceC1163b2;
        u uVar2;
        boolean z10;
        boolean z11;
        Object A2;
        if (interfaceC0617c instanceof A0.e) {
            A0.e eVar = (A0.e) interfaceC0617c;
            int i8 = eVar.f201l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f201l = i8 - Integer.MIN_VALUE;
                abstractC0713c = eVar;
                A0.e eVar2 = abstractC0713c;
                Object obj = eVar2.k;
                i4 = eVar2.f201l;
                enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                Z5.a.d(obj);
                                return obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z12 = eVar2.j;
                        boolean z13 = eVar2.f200i;
                        InterfaceC1163b interfaceC1163b3 = eVar2.f199h;
                        u uVar3 = eVar2.f198g;
                        Z5.a.d(obj);
                        z10 = z12;
                        z11 = z13;
                        interfaceC1163b2 = interfaceC1163b3;
                        uVar2 = uVar3;
                    } else {
                        Z5.a.d(obj);
                        return obj;
                    }
                } else {
                    Z5.a.d(obj);
                    if (uVar.i() && uVar.m() && uVar.j()) {
                        A0.g gVar = new A0.g(null, interfaceC1163b, uVar, z9, z8);
                        eVar2.f201l = 1;
                        Object n3 = uVar.n(z8, gVar, eVar2);
                        if (n3 != enumC0646a) {
                            return n3;
                        }
                    } else {
                        eVar2.f198g = uVar;
                        eVar2.f199h = interfaceC1163b;
                        eVar2.f200i = z8;
                        eVar2.j = z9;
                        eVar2.f201l = 2;
                        InterfaceC0622h q6 = q(uVar, z9, eVar2);
                        if (q6 != enumC0646a) {
                            interfaceC1163b2 = interfaceC1163b;
                            uVar2 = uVar;
                            obj = q6;
                            z10 = z9;
                            z11 = z8;
                        }
                    }
                    return enumC0646a;
                }
                A0.d dVar = new A0.d(null, interfaceC1163b2, uVar2, z11, z10);
                eVar2.f198g = null;
                eVar2.f199h = null;
                eVar2.f201l = 3;
                A2 = AbstractC0166y.A((InterfaceC0622h) obj, dVar, eVar2);
                if (A2 != enumC0646a) {
                    return enumC0646a;
                }
                return A2;
            }
        }
        abstractC0713c = new AbstractC0713c(interfaceC0617c);
        A0.e eVar22 = abstractC0713c;
        Object obj2 = eVar22.k;
        i4 = eVar22.f201l;
        enumC0646a = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        A0.d dVar2 = new A0.d(null, interfaceC1163b2, uVar2, z11, z10);
        eVar22.f198g = null;
        eVar22.f199h = null;
        eVar22.f201l = 3;
        A2 = AbstractC0166y.A((InterfaceC0622h) obj2, dVar2, eVar22);
        if (A2 != enumC0646a) {
        }
    }

    public static final void D(String str, Bundle bundle) {
        o6.j.e(str, "key");
        bundle.putString(str, null);
    }

    public static final void E(Bundle bundle, String str, Bundle bundle2) {
        o6.j.e(str, "key");
        o6.j.e(bundle2, "value");
        bundle.putBundle(str, bundle2);
    }

    public static final void F(Bundle bundle, String str, List list) {
        ArrayList<String> arrayList;
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = new ArrayList<>(list);
        }
        bundle.putStringArrayList(str, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01db, code lost:
    
        r0 = q4.X.j(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01df, code lost:
    
        h6.AbstractC0837b.d(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m G(D0.a aVar, String str) {
        boolean z8;
        String l6;
        Map c6;
        C0541i c0541i;
        boolean z9;
        o6.j.e(aVar, "connection");
        D0.c L8 = aVar.L("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (!L8.H()) {
                c6 = t.f7767d;
                AbstractC0837b.d(L8, null);
            } else {
                int n3 = X.n(L8, "name");
                int n8 = X.n(L8, "type");
                int n9 = X.n(L8, "notnull");
                int n10 = X.n(L8, "pk");
                int n11 = X.n(L8, "dflt_value");
                C0538f c0538f = new C0538f();
                do {
                    String l8 = L8.l(n3);
                    String l9 = L8.l(n8);
                    if (L8.getLong(n9) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    int i4 = (int) L8.getLong(n10);
                    if (L8.isNull(n11)) {
                        l6 = null;
                    } else {
                        l6 = L8.l(n11);
                    }
                    c0538f.put(l8, new A0.j(l8, l9, z8, i4, l6, 2));
                } while (L8.H());
                c6 = c0538f.c();
                AbstractC0837b.d(L8, null);
            }
            L8 = aVar.L("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int n12 = X.n(L8, "id");
                int n13 = X.n(L8, "seq");
                int n14 = X.n(L8, "table");
                int n15 = X.n(L8, "on_delete");
                int n16 = X.n(L8, "on_update");
                List F2 = AbstractC1492c.F(L8);
                L8.reset();
                C0541i c0541i2 = new C0541i();
                while (L8.H()) {
                    if (L8.getLong(n13) == j) {
                        int i8 = (int) L8.getLong(n12);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i9 = n12;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : F2) {
                            int i10 = n13;
                            List list = F2;
                            if (((A0.h) obj).f209d == i8) {
                                arrayList3.add(obj);
                            }
                            n13 = i10;
                            F2 = list;
                        }
                        int i11 = n13;
                        List list2 = F2;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            A0.h hVar = (A0.h) it.next();
                            arrayList.add(hVar.f211f);
                            arrayList2.add(hVar.f212g);
                        }
                        c0541i2.add(new A0.k(L8.l(n14), L8.l(n15), L8.l(n16), arrayList, arrayList2));
                        n12 = i9;
                        n13 = i11;
                        F2 = list2;
                        j = 0;
                    }
                }
                C0541i j5 = X.j(c0541i2);
                AbstractC0837b.d(L8, null);
                L8 = aVar.L("PRAGMA index_list(`" + str + "`)");
                try {
                    int n17 = X.n(L8, "name");
                    int n18 = X.n(L8, "origin");
                    int n19 = X.n(L8, "unique");
                    if (n17 != -1 && n18 != -1 && n19 != -1) {
                        C0541i c0541i3 = new C0541i();
                        while (true) {
                            if (!L8.H()) {
                                break;
                            }
                            if ("c".equals(L8.l(n18))) {
                                String l10 = L8.l(n17);
                                if (L8.getLong(n19) == 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                l G8 = AbstractC1492c.G(aVar, l10, z9);
                                if (G8 == null) {
                                    AbstractC0837b.d(L8, null);
                                    c0541i = null;
                                    break;
                                }
                                c0541i3.add(G8);
                            }
                        }
                    } else {
                        AbstractC0837b.d(L8, null);
                        c0541i = null;
                    }
                    return new m(str, c6, j5, c0541i);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static final void H(Object[] objArr, int i4, int i8) {
        o6.j.e(objArr, "<this>");
        while (i4 < i8) {
            objArr[i4] = null;
            i4++;
        }
    }

    public static final void I(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, String str, Bundle bundle) {
        T m6 = abstractComponentCallbacksC0755y.m();
        N n3 = (N) m6.f10911n.get(str);
        if (n3 != null && n3.f10874d.f8862d.compareTo(EnumC0504o.f8849g) >= 0) {
            n3.a(str, bundle);
        } else {
            m6.f10910m.put(str, bundle);
        }
        if (T.K(2)) {
            Objects.toString(bundle);
        }
    }

    public static void J(A4.a aVar, List list, InterfaceC1163b interfaceC1163b, String str, int i4) {
        boolean z8;
        if ((i4 & 4) != 0) {
            str = null;
        }
        View view = (View) aVar.f281f;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) aVar.f282g;
        o6.j.e(list, "items");
        TextInputLayout textInputLayout = (TextInputLayout) aVar.f283h;
        textInputLayout.setEndIconMode(3);
        if (str != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        textInputLayout.setHintEnabled(z8);
        textInputLayout.setHint(str);
        materialAutoCompleteTextView.setAdapter(new c(list, new M7.c(aVar, interfaceC1163b), new e(0, new C1.a(1))));
        view.setVisibility(8);
    }

    public static final void K(A4.a aVar, d dVar) {
        o6.j.e(aVar, "<this>");
        o6.j.e(dVar, "item");
        MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) aVar.f282g;
        materialAutoCompleteTextView.setText((CharSequence) materialAutoCompleteTextView.getResources().getString(dVar.f865a), false);
        TextInputLayout textInputLayout = (TextInputLayout) aVar.f283h;
        Integer num = dVar.f866b;
        if (num != null) {
            textInputLayout.setHelperTextEnabled(true);
            textInputLayout.setHelperText(textInputLayout.getResources().getString(num.intValue()));
        } else {
            textInputLayout.setHelperTextEnabled(false);
        }
    }

    public static final Object L(q qVar, boolean z8, q qVar2, InterfaceC1164c interfaceC1164c) {
        Object c0158p;
        Object S8;
        try {
            if (!(interfaceC1164c instanceof AbstractC0711a)) {
                c0158p = E2.c.I0(interfaceC1164c, qVar2, qVar);
            } else {
                y.c(2, interfaceC1164c);
                c0158p = interfaceC1164c.l(qVar2, qVar);
            }
        } catch (DispatchException e9) {
            Throwable th = e9.f12156d;
            qVar.R(new C0158p(th, false));
            throw th;
        } catch (Throwable th2) {
            c0158p = new C0158p(th2, false);
        }
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (c0158p == enumC0646a || (S8 = qVar.S(c0158p)) == AbstractC0166y.f3257e) {
            return enumC0646a;
        }
        qVar.h0();
        if (S8 instanceof C0158p) {
            if (!z8) {
                Throwable th3 = ((C0158p) S8).f3235a;
                if ((th3 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th3).f12158d == qVar) {
                    if (c0158p instanceof C0158p) {
                        throw ((C0158p) c0158p).f3235a;
                    }
                    return c0158p;
                }
            }
            throw ((C0158p) S8).f3235a;
        }
        return AbstractC0166y.y(S8);
    }

    public static final C0643a M(f2.a aVar, Context context, AbstractC0951a abstractC0951a, boolean z8) {
        String string;
        String string2;
        String str;
        int i4;
        String str2;
        String flattenToString;
        ResolveInfo resolveActivity;
        String str3;
        CharSequence loadLabel;
        o6.j.e(aVar, "<this>");
        o6.j.e(abstractC0951a, "parent");
        String g8 = aVar.g();
        o6.j.b(g8);
        int s8 = s(aVar);
        Object obj = null;
        long j = 1;
        if (aVar instanceof f2.e) {
            f2.e eVar = (f2.e) aVar;
            Long l6 = eVar.f10694e;
            if (z8) {
                string = context.getString(R.string.item_error_action_invalid_generic);
                o6.j.d(string, "getString(...)");
            } else {
                if (eVar.f10695f == f2.d.f10688e) {
                    Iterator it = abstractC0951a.i().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (o6.j.a(((AbstractC0901a) next).getId(), eVar.f10697h)) {
                            obj = next;
                            break;
                        }
                    }
                    AbstractC0901a abstractC0901a = (AbstractC0901a) obj;
                    if (abstractC0901a != null) {
                        if (l6 != null) {
                            j = l6.longValue();
                        }
                        string = context.getString(R.string.item_click_details_on_condition, o(j), abstractC0901a.g());
                        o6.j.d(string, "getString(...)");
                    }
                }
                o6.j.b(l6);
                string = context.getString(R.string.item_click_details_at_position, o(l6.longValue()));
                o6.j.d(string, "getString(...)");
            }
        } else if (aVar instanceof f2.k) {
            f2.k kVar = (f2.k) aVar;
            if (z8) {
                string = context.getString(R.string.item_error_action_invalid_generic);
                o6.j.d(string, "getString(...)");
            } else {
                Long l8 = kVar.f10734e;
                if (l8 != null) {
                    j = l8.longValue();
                }
                string = context.getString(R.string.item_swipe_details, o(j));
                o6.j.d(string, "getString(...)");
            }
        } else if (aVar instanceof f2.i) {
            f2.i iVar = (f2.i) aVar;
            if (z8) {
                string = context.getString(R.string.item_error_action_invalid_generic);
                o6.j.d(string, "getString(...)");
            } else {
                Long l9 = iVar.f10723e;
                if (l9 != null) {
                    j = l9.longValue();
                }
                string = context.getString(R.string.item_pause_details, o(j));
                o6.j.d(string, "getString(...)");
            }
        } else if (aVar instanceof f2.f) {
            f2.f fVar = (f2.f) aVar;
            ComponentName componentName = fVar.f10706h;
            String str4 = fVar.f10705g;
            if (z8) {
                string = context.getString(R.string.item_error_action_invalid_generic);
                o6.j.d(string, "getString(...)");
            } else {
                if (!fVar.f10704f && componentName != null) {
                    PackageManager packageManager = context.getPackageManager();
                    o6.j.d(packageManager, "getPackageManager(...)");
                    Intent component = new Intent(str4).setComponent(componentName);
                    o6.j.d(component, "setComponent(...)");
                    if (Build.VERSION.SDK_INT >= 33) {
                        resolveActivity = Q.e.b(packageManager, component, Q.e.a(0));
                    } else {
                        resolveActivity = packageManager.resolveActivity(component, 0);
                    }
                    if (resolveActivity != null && (loadLabel = resolveActivity.loadLabel(packageManager)) != null) {
                        str3 = loadLabel.toString();
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        string = context.getString(R.string.item_intent_details_start_activity, str3);
                        o6.j.d(string, "getString(...)");
                    }
                }
                if (str4 != null) {
                    str2 = E2.b.w(str4);
                } else {
                    str2 = null;
                }
                if (componentName != null && (flattenToString = componentName.flattenToString()) != null) {
                    obj = E2.b.w(flattenToString);
                }
                if (str2 != null && obj != null) {
                    string = context.getString(R.string.item_intent_details_component_name, str2, obj);
                    o6.j.d(string, "getString(...)");
                } else {
                    if (str2 != null) {
                        str4 = str2;
                    }
                    string = context.getString(R.string.item_intent_details, str4);
                    o6.j.d(string, "getString(...)");
                }
            }
        } else if (aVar instanceof o) {
            o oVar = (o) aVar;
            if (z8) {
                string = context.getString(R.string.item_toggle_event_details_error);
                o6.j.d(string, "getString(...)");
            } else if (oVar.f10754e) {
                n nVar = oVar.f10755f;
                if (nVar == null) {
                    i4 = -1;
                } else {
                    i4 = AbstractC0644b.f10611a[nVar.ordinal()];
                }
                if (i4 != -1) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                string = context.getString(R.string.item_toggle_event_details_disable_all);
                                o6.j.d(string, "getString(...)");
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            string = context.getString(R.string.item_toggle_event_details_invert_all);
                            o6.j.d(string, "getString(...)");
                        }
                    } else {
                        string = context.getString(R.string.item_toggle_event_details_enable_all);
                        o6.j.d(string, "getString(...)");
                    }
                } else {
                    throw new IllegalArgumentException("Invalid toggle event type");
                }
            } else {
                string = context.getString(R.string.item_toggle_event_details_manual, Integer.valueOf(oVar.f10756g.size()));
                o6.j.d(string, "getString(...)");
            }
        } else if (aVar instanceof f2.c) {
            f2.c cVar = (f2.c) aVar;
            if (z8) {
                string = context.getString(R.string.item_change_counter_details_error);
                o6.j.d(string, "getString(...)");
            } else {
                String obj2 = I7.m.w0(cVar.f10684e).toString();
                int ordinal = cVar.f10685f.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            str = "=";
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        str = "-";
                    }
                } else {
                    str = "+";
                }
                string = context.getString(R.string.item_change_counter_details, obj2, str, cVar.f10686g.a().toString());
                o6.j.d(string, "getString(...)");
            }
        } else if (aVar instanceof f2.h) {
            f2.h hVar = (f2.h) aVar;
            if (z8) {
                string = context.getString(R.string.item_error_action_invalid_generic);
                o6.j.d(string, "getString(...)");
            } else {
                int ordinal2 = hVar.f10715e.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        string = context.getString(R.string.item_notification_details_counter, hVar.f10717g);
                        o6.j.d(string, "getString(...)");
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    string = context.getString(R.string.item_notification_details_text, hVar.f10716f);
                    o6.j.d(string, "getString(...)");
                }
            }
        } else if (aVar instanceof f2.m) {
            f2.m mVar = (f2.m) aVar;
            if (z8) {
                string = context.getString(R.string.item_error_action_invalid_generic);
                o6.j.d(string, "getString(...)");
            } else {
                int ordinal3 = mVar.f10745e.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        if (ordinal3 == 2) {
                            string2 = context.getString(R.string.field_dropdown_system_action_type_recent_apps);
                            o6.j.d(string2, "getString(...)");
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        string2 = context.getString(R.string.field_dropdown_system_action_type_home);
                        o6.j.d(string2, "getString(...)");
                    }
                } else {
                    string2 = context.getString(R.string.field_dropdown_system_action_type_back);
                    o6.j.d(string2, "getString(...)");
                }
                string = context.getString(R.string.item_system_action_details_text, string2);
                o6.j.d(string, "getString(...)");
            }
        } else if (aVar instanceof f2.j) {
            String str5 = ((f2.j) aVar).f10728e;
            if (z8) {
                string = context.getString(R.string.item_error_action_invalid_generic);
                o6.j.d(string, "getString(...)");
            } else if (str5.length() == 0) {
                string = context.getString(R.string.item_set_text_details_text_empty);
                o6.j.d(string, "getString(...)");
            } else {
                string = context.getString(R.string.item_set_text_details_text, str5);
                o6.j.d(string, "getString(...)");
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new C0643a(s8, g8, string, aVar, z8);
    }

    public static final C0709b N(j2.g gVar, Context context, boolean z8) {
        String string;
        String string2;
        o6.j.e(gVar, "<this>");
        String g8 = gVar.g();
        int t8 = t(gVar);
        if (gVar instanceof C0903c) {
            String str = ((C0903c) gVar).f11801d;
            int m02 = I7.m.m0(str, '.', 6);
            if (m02 != -1 && m02 != I7.m.e0(str)) {
                str = str.substring(m02 + 1);
                o6.j.d(str, "substring(...)");
            }
            string = context.getString(R.string.item_broadcast_received_details, str);
            o6.j.d(string, "getString(...)");
        } else if (gVar instanceof C0905e) {
            C0905e c0905e = (C0905e) gVar;
            String str2 = c0905e.f11811d;
            int ordinal = c0905e.f11812e.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                string2 = context.getString(R.string.dropdown_comparison_operator_item_greater_or_equals);
                                o6.j.d(string2, "getString(...)");
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            string2 = context.getString(R.string.dropdown_comparison_operator_item_greater);
                            o6.j.d(string2, "getString(...)");
                        }
                    } else {
                        string2 = context.getString(R.string.dropdown_comparison_operator_item_lower_or_equals);
                        o6.j.d(string2, "getString(...)");
                    }
                } else {
                    string2 = context.getString(R.string.dropdown_comparison_operator_item_lower);
                    o6.j.d(string2, "getString(...)");
                }
            } else {
                string2 = context.getString(R.string.dropdown_comparison_operator_item_equals);
                o6.j.d(string2, "getString(...)");
            }
            string = context.getString(R.string.item_counter_reached_details, str2, string2, c0905e.f11813f.a().toString());
            o6.j.d(string, "getString(...)");
        } else if (gVar instanceof j2.f) {
            string = context.getString(R.string.item_timer_reached_details, o(((j2.f) gVar).f11817d));
            o6.j.d(string, "getString(...)");
        } else {
            throw new UnsupportedOperationException("Scenario Start and End Conditions are not supported here");
        }
        return new C0709b(gVar, g8, z8, t8, string);
    }

    public static final String a(Object[] objArr, int i4, int i8, AbstractC0430e abstractC0430e) {
        StringBuilder sb = new StringBuilder((i8 * 3) + 2);
        sb.append("[");
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i4 + i9];
            if (obj == abstractC0430e) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        o6.j.d(sb2, "toString(...)");
        return sb2;
    }

    public static void b(Appendable appendable, Object obj, InterfaceC1163b interfaceC1163b) {
        boolean z8;
        o6.j.e(appendable, "<this>");
        if (interfaceC1163b != null) {
            appendable.append((CharSequence) interfaceC1163b.m(obj));
            return;
        }
        if (obj == null) {
            z8 = true;
        } else {
            z8 = obj instanceof CharSequence;
        }
        if (z8) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static final void c(p1 p1Var, C0780b c0780b, InterfaceC1163b interfaceC1163b) {
        int i4;
        o6.j.e(p1Var, "<this>");
        TextView textView = (TextView) p1Var.f13351g;
        o6.j.e(interfaceC1163b, "itemClickedListener");
        ((TextView) p1Var.k).setText(c0780b.f11160f);
        ((TextView) p1Var.f13353i).setText(c0780b.f11161g);
        ConstraintLayout constraintLayout = (ConstraintLayout) p1Var.f13349e;
        Context context = constraintLayout.getContext();
        o6.j.d(context, "getContext(...)");
        if (c0780b.k) {
            i4 = R.attr.colorError;
        } else {
            i4 = R.attr.colorOnSurface;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i4, typedValue, true);
        int i8 = typedValue.data;
        textView.setText(c0780b.f11162h);
        textView.setTextColor(i8);
        ((ImageView) p1Var.f13352h).setColorFilter(i8, PorterDuff.Mode.SRC_IN);
        ((TextView) p1Var.j).setText(c0780b.f11163i);
        ((ImageView) p1Var.f13350f).setImageResource(c0780b.j);
        constraintLayout.setOnClickListener(new a(interfaceC1163b, 11, c0780b));
    }

    public static final D6.j d(D6.j jVar, D6.j jVar2) {
        o6.j.e(jVar, "first");
        o6.j.e(jVar2, "second");
        if (jVar.isEmpty()) {
            return jVar2;
        }
        if (jVar2.isEmpty()) {
            return jVar;
        }
        return new D6.k(new D6.j[]{jVar, jVar2});
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if ((r6 instanceof F6.L) == false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String e(InterfaceC0019u interfaceC0019u, int i4) {
        boolean z8;
        String b4;
        boolean z9 = false;
        if ((i4 & 1) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((i4 & 2) != 0) {
            z9 = true;
        }
        o6.j.e(interfaceC0019u, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z9) {
            if (interfaceC0019u instanceof InterfaceC0009j) {
                b4 = "<init>";
            } else {
                b4 = ((AbstractC0054n) interfaceC0019u).getName().b();
                o6.j.d(b4, "asString(...)");
            }
            sb.append(b4);
        }
        sb.append("(");
        w M8 = interfaceC0019u.M();
        F7.c cVar = F7.c.f1619d;
        if (M8 != null) {
            AbstractC1759v b9 = M8.b();
            o6.j.d(b9, "getType(...)");
            sb.append((Y6.k) AbstractC0405a.f0(b9, r.k, cVar));
        }
        Iterator it = interfaceC0019u.z0().iterator();
        while (it.hasNext()) {
            AbstractC1759v b10 = ((U) it.next()).b();
            o6.j.d(b10, "getType(...)");
            sb.append((Y6.k) AbstractC0405a.f0(b10, r.k, cVar));
        }
        sb.append(")");
        if (z8) {
            if (!(interfaceC0019u instanceof InterfaceC0009j)) {
                AbstractC1759v r8 = interfaceC0019u.r();
                o6.j.b(r8);
                C0725e c0725e = z6.h.f16714e;
                if (z6.h.E(r8, z6.m.f16768d)) {
                    AbstractC1759v r9 = interfaceC0019u.r();
                    o6.j.b(r9);
                    if (!w7.U.e(r9)) {
                    }
                }
                AbstractC1759v r10 = interfaceC0019u.r();
                o6.j.b(r10);
                sb.append((Y6.k) AbstractC0405a.f0(r10, r.k, cVar));
            }
            sb.append("V");
        }
        return sb.toString();
    }

    public static final String f(InterfaceC0001b interfaceC0001b) {
        InterfaceC0004e interfaceC0004e;
        F6.N n3;
        o6.j.e(interfaceC0001b, "<this>");
        if (!AbstractC0890e.n(interfaceC0001b)) {
            InterfaceC0010k q6 = interfaceC0001b.q();
            if (q6 instanceof InterfaceC0004e) {
                interfaceC0004e = (InterfaceC0004e) q6;
            } else {
                interfaceC0004e = null;
            }
            if (interfaceC0004e != null && !interfaceC0004e.getName().f10805e) {
                InterfaceC0001b a3 = interfaceC0001b.a();
                if (a3 instanceof F6.N) {
                    n3 = (F6.N) a3;
                } else {
                    n3 = null;
                }
                if (n3 != null) {
                    return AbstractC1638C.M(interfaceC0004e, e(n3, 3));
                }
            }
        }
        return null;
    }

    public static float[] g(float[] fArr, int i4) {
        if (i4 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i4, length);
                float[] fArr2 = new float[i4];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static H.e[] h(String str) {
        int i4;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        while (i10 < str.length()) {
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i10++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i9, i10).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i8) != 'z' && trim.charAt(i8) != 'Z') {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i11 = i8;
                                int i12 = 1;
                                while (i12 < length) {
                                    int i13 = i8;
                                    int i14 = i13;
                                    int i15 = i14;
                                    int i16 = i15;
                                    for (int i17 = i12; i17 < trim.length(); i17++) {
                                        char charAt2 = trim.charAt(i17);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i17 != i12 && i13 == 0) {
                                                            i13 = 0;
                                                            i15 = 1;
                                                            i16 = 1;
                                                            break;
                                                        }
                                                        i13 = 0;
                                                        break;
                                                    case '.':
                                                        if (i14 == 0) {
                                                            i13 = 0;
                                                            i14 = 1;
                                                            break;
                                                        }
                                                        i13 = 0;
                                                        i15 = 1;
                                                        i16 = 1;
                                                        break;
                                                    default:
                                                        i13 = 0;
                                                        break;
                                                }
                                            } else {
                                                i13 = 1;
                                            }
                                            if (i15 == 0) {
                                                if (i12 < i17) {
                                                    fArr2[i11] = Float.parseFloat(trim.substring(i12, i17));
                                                    i11++;
                                                }
                                                if (i16 == 0) {
                                                    i12 = i17;
                                                } else {
                                                    i12 = i17 + 1;
                                                }
                                                i8 = 0;
                                            }
                                        }
                                        i13 = 0;
                                        i15 = 1;
                                        if (i15 == 0) {
                                        }
                                    }
                                    if (i12 < i17) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    i8 = 0;
                                }
                                fArr = g(fArr2, i11);
                                i8 = 0;
                            } catch (NumberFormatException e9) {
                                throw new RuntimeException(A.j.p("error in parsing \"", trim, "\""), e9);
                            }
                        } else {
                            fArr = new float[i8];
                        }
                        arrayList.add(new H.e(trim.charAt(i8), fArr));
                    }
                    i9 = i10;
                    i10++;
                    i8 = 0;
                }
                i10++;
            }
            trim = str.substring(i9, i10).trim();
            if (!trim.isEmpty()) {
            }
            i9 = i10;
            i10++;
            i8 = 0;
        }
        if (i10 - i9 == 1 && i9 < str.length()) {
            i4 = 0;
            arrayList.add(new H.e(str.charAt(i9), new float[0]));
        } else {
            i4 = 0;
        }
        return (H.e[]) arrayList.toArray(new H.e[i4]);
    }

    public static H.e[] i(H.e[] eVarArr) {
        H.e[] eVarArr2 = new H.e[eVarArr.length];
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            eVarArr2[i4] = new H.e(eVarArr[i4]);
        }
        return eVarArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [P.N, java.lang.Object] */
    public static boolean j(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = O.f4214a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = P.N.f4210d;
            P.N n3 = (P.N) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            P.N n8 = n3;
            if (n3 == null) {
                ?? obj = new Object();
                obj.f4211a = null;
                obj.f4212b = null;
                obj.f4213c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                n8 = obj;
            }
            WeakReference weakReference2 = n8.f4213c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                n8.f4213c = new WeakReference(keyEvent);
                if (n8.f4212b == null) {
                    n8.f4212b = new SparseArray();
                }
                SparseArray sparseArray = n8.f4212b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    throw new ClassCastException();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(InterfaceC0262j interfaceC0262j, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z8 = false;
        if (interfaceC0262j != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0262j.c(keyEvent);
            }
            KeyEvent.DispatcherState dispatcherState = null;
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f871c) {
                            try {
                                f872d = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f871c = true;
                        }
                        Method method = f872d;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z8 = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z8) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (O.c(decorView, keyEvent)) {
                    return true;
                }
                if (decorView != null) {
                    dispatcherState = decorView.getKeyDispatcherState();
                }
                return keyEvent.dispatch(activity, dispatcherState, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f873e) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f874f = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f873e = true;
                }
                Field field = f874f;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (O.c(decorView2, keyEvent)) {
                        return true;
                    }
                    if (decorView2 != null) {
                        dispatcherState = decorView2.getKeyDispatcherState();
                    }
                    return keyEvent.dispatch(dialog, dispatcherState, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && O.c(view, keyEvent)) || interfaceC0262j.c(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final void l(D0.a aVar) {
        o6.j.e(aVar, "connection");
        C0535c i4 = E2.d.i();
        D0.c L8 = aVar.L("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (L8.H()) {
            try {
                i4.add(L8.l(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC0837b.d(L8, th);
                    throw th2;
                }
            }
        }
        AbstractC0837b.d(L8, null);
        ListIterator listIterator = E2.d.f(i4).listIterator(0);
        while (true) {
            C0533a c0533a = (C0533a) listIterator;
            if (c0533a.hasNext()) {
                String str = (String) c0533a.next();
                if (v.a0(str, "room_fts_content_sync_")) {
                    E2.b.p(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
                }
            } else {
                return;
            }
        }
    }

    public static final void m(V7.b bVar, Y7.a aVar, String str) {
        o6.j.e(bVar, "<this>");
        G5.e v8 = aVar.v();
        bVar.getClass();
        v8.getClass();
        o6.j.e(null, "baseClass");
        y.e(1, null);
        Q.g(str, null);
        throw null;
    }

    public static final void n(D0.a aVar, String str) {
        o6.j.e(aVar, "db");
        D0.c L8 = aVar.L("PRAGMA foreign_key_check(`" + str + "`)");
        try {
            if (!L8.H()) {
                AbstractC0837b.d(L8, null);
                return;
            }
            throw new SQLException(E2.b.F(L8));
        } finally {
        }
    }

    public static final String o(long j) {
        int i4 = J7.a.f2503g;
        long m6 = J7.f.m(j, J7.c.MILLISECONDS);
        J7.c cVar = J7.c.HOURS;
        String str = "";
        if (J7.a.g(m6, cVar) > 0) {
            str = "" + J7.a.g(m6, cVar) + "h ";
        }
        J7.c cVar2 = J7.c.MINUTES;
        long j5 = 60;
        if (J7.a.g(m6, cVar2) % j5 > 0) {
            str = str + (J7.a.g(m6, cVar2) % j5) + "m ";
        }
        J7.c cVar3 = J7.c.SECONDS;
        if (J7.a.g(m6, cVar3) % j5 > 0) {
            str = str + (J7.a.g(m6, cVar3) % j5) + "s ";
        }
        long j8 = 1000;
        if (J7.a.c(m6) % j8 > 0) {
            str = str + (J7.a.c(m6) % j8) + "ms ";
        }
        return I7.m.w0(str).toString();
    }

    public static Object p(Object obj, Class cls) {
        if (obj instanceof X5.a) {
            return cls.cast(obj);
        }
        if (obj instanceof X5.b) {
            return p(((X5.b) obj).a(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + X5.a.class + " or " + X5.b.class);
    }

    public static final InterfaceC0622h q(u uVar, boolean z8, AbstractC0713c abstractC0713c) {
        if (uVar.i()) {
            x xVar = (x) abstractC0713c.h().B(x.f15289f);
            if (xVar != null) {
                InterfaceC0619e interfaceC0619e = xVar.f15290d;
                Q7.d dVar = uVar.f15275a;
                if (dVar != null) {
                    InterfaceC0622h D7 = dVar.f4940d.D(interfaceC0619e);
                    if (D7 != null) {
                        return D7;
                    }
                } else {
                    o6.j.i("coroutineScope");
                    throw null;
                }
            }
            if (z8) {
                InterfaceC0622h interfaceC0622h = uVar.f15276b;
                if (interfaceC0622h != null) {
                    return interfaceC0622h;
                }
                o6.j.i("transactionContext");
                throw null;
            }
            Q7.d dVar2 = uVar.f15275a;
            if (dVar2 != null) {
                return dVar2.f4940d;
            }
            o6.j.i("coroutineScope");
            throw null;
        }
        Q7.d dVar3 = uVar.f15275a;
        if (dVar3 != null) {
            return dVar3.f4940d;
        }
        o6.j.i("coroutineScope");
        throw null;
    }

    public static final SharedPreferences r(Context context) {
        o6.j.e(context, "<this>");
        SharedPreferences sharedPreferences = context.getSharedPreferences("DumbConfigPreferences", 0);
        o6.j.d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public static final int s(f2.a aVar) {
        o6.j.e(aVar, "<this>");
        if (aVar instanceof f2.e) {
            return R.drawable.ic_click;
        }
        if (aVar instanceof f2.k) {
            return R.drawable.ic_swipe;
        }
        if (aVar instanceof f2.i) {
            return R.drawable.ic_wait;
        }
        if (aVar instanceof f2.f) {
            return R.drawable.ic_intent;
        }
        if (aVar instanceof o) {
            return R.drawable.ic_toggle_event;
        }
        if (aVar instanceof f2.c) {
            return R.drawable.ic_change_counter;
        }
        if (aVar instanceof f2.h) {
            return R.drawable.ic_action_notification;
        }
        if (aVar instanceof f2.m) {
            return R.drawable.ic_action_system;
        }
        if (aVar instanceof f2.j) {
            return R.drawable.ic_action_set_text;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int t(j2.g gVar) {
        o6.j.e(gVar, "<this>");
        if (gVar instanceof C0903c) {
            return R.drawable.ic_broadcast_received;
        }
        if (gVar instanceof C0905e) {
            return R.drawable.ic_counter_reached;
        }
        if (gVar instanceof j2.f) {
            return R.drawable.ic_timer_reached;
        }
        throw new UnsupportedOperationException("Unsupported condition type");
    }

    public static F0.c u(W0.d dVar, SQLiteDatabase sQLiteDatabase) {
        o6.j.e(dVar, "refHolder");
        F0.c cVar = (F0.c) dVar.f6489e;
        if (cVar != null && cVar.f1262d.equals(sQLiteDatabase)) {
            return cVar;
        }
        F0.c cVar2 = new F0.c(sQLiteDatabase);
        dVar.f6489e = cVar2;
        return cVar2;
    }

    public static String v(C7.e eVar, R6.f fVar) {
        if (!eVar.b(fVar)) {
            return eVar.a();
        }
        return null;
    }

    public static final boolean w(M m6) {
        o6.j.e(m6, "<this>");
        if (m6.c() == null) {
            return true;
        }
        return false;
    }

    public static T0.a x(Y0.d dVar, C0202j c0202j) {
        return new T0.a(0, p.a(dVar, c0202j, 1.0f, X0.f.f6811b, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T0.b, D6.b] */
    public static T0.b y(Y0.c cVar, C0202j c0202j, boolean z8) {
        float f8;
        if (z8) {
            f8 = Z0.k.c();
        } else {
            f8 = 1.0f;
        }
        return new D6.b(p.a(cVar, c0202j, f8, X0.f.f6812c, false));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X0.D, C7.p, java.lang.Object] */
    public static T0.a z(Y0.d dVar, C0202j c0202j, int i4) {
        ?? obj = new Object();
        obj.f818a = i4;
        ArrayList a3 = p.a(dVar, c0202j, 1.0f, obj, false);
        for (int i8 = 0; i8 < a3.size(); i8++) {
            C0414a c0414a = (C0414a) a3.get(i8);
            U0.c cVar = (U0.c) c0414a.f7671b;
            U0.c cVar2 = (U0.c) c0414a.f7672c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f5943a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f5943a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f8 = Float.NaN;
                    int i9 = 0;
                    for (int i10 = 0; i10 < length2; i10++) {
                        float f9 = fArr3[i10];
                        if (f9 != f8) {
                            fArr3[i9] = f9;
                            i9++;
                            f8 = fArr3[i10];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i9);
                    c0414a = new C0414a(cVar.b(copyOfRange), cVar2.b(copyOfRange));
                }
            }
            a3.set(i8, c0414a);
        }
        return new T0.a(1, a3);
    }

    public abstract void O(byte[] bArr, int i4, int i8);
}
