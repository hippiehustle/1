package g0;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.InterfaceC0510v;
import c.C0544A;
import c.C0553g;
import c.InterfaceC0549c;
import com.buzbuz.smartautoclicker.R;
import e.C0628d;
import e.C0629e;
import f.C0649a;
import i.AbstractActivityC0870i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C0946a;
import m0.C1050a;
import n1.AbstractC1149a;
import p0.C1301i;
import t7.C1594d;
import u6.AbstractC1638C;
import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: A, reason: collision with root package name */
    public AbstractComponentCallbacksC0755y f10884A;

    /* renamed from: D, reason: collision with root package name */
    public C0629e f10887D;

    /* renamed from: E, reason: collision with root package name */
    public C0629e f10888E;

    /* renamed from: F, reason: collision with root package name */
    public C0629e f10889F;

    /* renamed from: H, reason: collision with root package name */
    public boolean f10891H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f10892I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f10893J;
    public boolean K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f10894L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f10895M;

    /* renamed from: N, reason: collision with root package name */
    public ArrayList f10896N;

    /* renamed from: O, reason: collision with root package name */
    public ArrayList f10897O;

    /* renamed from: P, reason: collision with root package name */
    public W f10898P;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10901b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f10904e;

    /* renamed from: g, reason: collision with root package name */
    public C0544A f10906g;

    /* renamed from: r, reason: collision with root package name */
    public final E f10915r;

    /* renamed from: s, reason: collision with root package name */
    public final E f10916s;

    /* renamed from: t, reason: collision with root package name */
    public final E f10917t;

    /* renamed from: u, reason: collision with root package name */
    public final E f10918u;

    /* renamed from: x, reason: collision with root package name */
    public C0731A f10921x;

    /* renamed from: y, reason: collision with root package name */
    public AbstractC1638C f10922y;

    /* renamed from: z, reason: collision with root package name */
    public AbstractComponentCallbacksC0755y f10923z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10900a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final b0 f10902c = new b0(0);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f10903d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final D f10905f = new D(this);

    /* renamed from: h, reason: collision with root package name */
    public C0732a f10907h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10908i = false;
    public final H j = new H(0, this);
    public final AtomicInteger k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    public final Map f10909l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map f10910m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final Map f10911n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f10912o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final R3.r f10913p = new R3.r(this);

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f10914q = new CopyOnWriteArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final I f10919v = new I(this);

    /* renamed from: w, reason: collision with root package name */
    public int f10920w = -1;

    /* renamed from: B, reason: collision with root package name */
    public final J f10885B = new J(this);

    /* renamed from: C, reason: collision with root package name */
    public final C1594d f10886C = new Object();

    /* renamed from: G, reason: collision with root package name */
    public ArrayDeque f10890G = new ArrayDeque();

    /* renamed from: Q, reason: collision with root package name */
    public final L5.x f10899Q = new L5.x(6, this);

    /* JADX WARN: Type inference failed for: r0v17, types: [g0.E] */
    /* JADX WARN: Type inference failed for: r0v18, types: [g0.E] */
    /* JADX WARN: Type inference failed for: r0v19, types: [g0.E] */
    /* JADX WARN: Type inference failed for: r0v20, types: [g0.E] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, t7.d] */
    public T() {
        final int i4 = 0;
        this.f10915r = new O.a(this) { // from class: g0.E

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ T f10856b;

            {
                this.f10856b = this;
            }

            @Override // O.a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        T t8 = this.f10856b;
                        if (t8.M()) {
                            t8.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        T t9 = this.f10856b;
                        if (t9.M() && num.intValue() == 80) {
                            t9.m(false);
                            return;
                        }
                        return;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        E.h hVar = (E.h) obj;
                        T t10 = this.f10856b;
                        if (t10.M()) {
                            boolean z8 = hVar.f1100a;
                            t10.n(false);
                            return;
                        }
                        return;
                    default:
                        E.u uVar = (E.u) obj;
                        T t11 = this.f10856b;
                        if (t11.M()) {
                            boolean z9 = uVar.f1149a;
                            t11.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i8 = 1;
        this.f10916s = new O.a(this) { // from class: g0.E

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ T f10856b;

            {
                this.f10856b = this;
            }

            @Override // O.a
            public final void accept(Object obj) {
                switch (i8) {
                    case 0:
                        T t8 = this.f10856b;
                        if (t8.M()) {
                            t8.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        T t9 = this.f10856b;
                        if (t9.M() && num.intValue() == 80) {
                            t9.m(false);
                            return;
                        }
                        return;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        E.h hVar = (E.h) obj;
                        T t10 = this.f10856b;
                        if (t10.M()) {
                            boolean z8 = hVar.f1100a;
                            t10.n(false);
                            return;
                        }
                        return;
                    default:
                        E.u uVar = (E.u) obj;
                        T t11 = this.f10856b;
                        if (t11.M()) {
                            boolean z9 = uVar.f1149a;
                            t11.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i9 = 2;
        this.f10917t = new O.a(this) { // from class: g0.E

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ T f10856b;

            {
                this.f10856b = this;
            }

            @Override // O.a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        T t8 = this.f10856b;
                        if (t8.M()) {
                            t8.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        T t9 = this.f10856b;
                        if (t9.M() && num.intValue() == 80) {
                            t9.m(false);
                            return;
                        }
                        return;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        E.h hVar = (E.h) obj;
                        T t10 = this.f10856b;
                        if (t10.M()) {
                            boolean z8 = hVar.f1100a;
                            t10.n(false);
                            return;
                        }
                        return;
                    default:
                        E.u uVar = (E.u) obj;
                        T t11 = this.f10856b;
                        if (t11.M()) {
                            boolean z9 = uVar.f1149a;
                            t11.s(false);
                            return;
                        }
                        return;
                }
            }
        };
        final int i10 = 3;
        this.f10918u = new O.a(this) { // from class: g0.E

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ T f10856b;

            {
                this.f10856b = this;
            }

            @Override // O.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        T t8 = this.f10856b;
                        if (t8.M()) {
                            t8.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        T t9 = this.f10856b;
                        if (t9.M() && num.intValue() == 80) {
                            t9.m(false);
                            return;
                        }
                        return;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        E.h hVar = (E.h) obj;
                        T t10 = this.f10856b;
                        if (t10.M()) {
                            boolean z8 = hVar.f1100a;
                            t10.n(false);
                            return;
                        }
                        return;
                    default:
                        E.u uVar = (E.u) obj;
                        T t11 = this.f10856b;
                        if (t11.M()) {
                            boolean z9 = uVar.f1149a;
                            t11.s(false);
                            return;
                        }
                        return;
                }
            }
        };
    }

    public static HashSet G(C0732a c0732a) {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < c0732a.f10951a.size(); i4++) {
            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = ((c0) c0732a.f10951a.get(i4)).f10994b;
            if (abstractComponentCallbacksC0755y != null && c0732a.f10957g) {
                hashSet.add(abstractComponentCallbacksC0755y);
            }
        }
        return hashSet;
    }

    public static boolean K(int i4) {
        if (Log.isLoggable("FragmentManager", i4)) {
            return true;
        }
        return false;
    }

    public static boolean L(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        abstractComponentCallbacksC0755y.getClass();
        Iterator it = abstractComponentCallbacksC0755y.f11130z.f10902c.i().iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = (AbstractComponentCallbacksC0755y) it.next();
            if (abstractComponentCallbacksC0755y2 != null) {
                z8 = L(abstractComponentCallbacksC0755y2);
            }
            if (z8) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        if (abstractComponentCallbacksC0755y != null) {
            if (abstractComponentCallbacksC0755y.f11092H) {
                if (abstractComponentCallbacksC0755y.f11128x == null || N(abstractComponentCallbacksC0755y.f11085A)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean O(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        if (abstractComponentCallbacksC0755y != null) {
            T t8 = abstractComponentCallbacksC0755y.f11128x;
            if (abstractComponentCallbacksC0755y.equals(t8.f10884A) && O(t8.f10923z)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A(boolean z8) {
        boolean z9;
        C0732a c0732a;
        z(z8);
        if (!this.f10908i && (c0732a = this.f10907h) != null) {
            c0732a.f10967s = false;
            c0732a.d();
            if (K(3)) {
                Objects.toString(this.f10907h);
                Objects.toString(this.f10900a);
            }
            this.f10907h.f(false, false);
            this.f10900a.add(0, this.f10907h);
            Iterator it = this.f10907h.f10951a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = ((c0) it.next()).f10994b;
                if (abstractComponentCallbacksC0755y != null) {
                    abstractComponentCallbacksC0755y.f11120p = false;
                }
            }
            this.f10907h = null;
        }
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f10895M;
            ArrayList arrayList2 = this.f10896N;
            synchronized (this.f10900a) {
                if (this.f10900a.isEmpty()) {
                    z9 = false;
                } else {
                    try {
                        int size = this.f10900a.size();
                        z9 = false;
                        for (int i4 = 0; i4 < size; i4++) {
                            z9 |= ((O) this.f10900a.get(i4)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (z9) {
                z10 = true;
                this.f10901b = true;
                try {
                    W(this.f10895M, this.f10896N);
                } finally {
                    d();
                }
            } else {
                h0();
                v();
                ((HashMap) this.f10902c.f10988e).values().removeAll(Collections.singleton(null));
                return z10;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:142:0x025c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:186:0x0368. Please report as an issue. */
    public final void B(ArrayList arrayList, ArrayList arrayList2, int i4, int i8) {
        Object obj;
        String str;
        ArrayList arrayList3;
        boolean z8;
        int i9;
        boolean z9;
        ArrayList arrayList4;
        boolean z10;
        int i10;
        int i11;
        int i12 = i4;
        b0 b0Var = this.f10902c;
        ArrayList arrayList5 = this.f10912o;
        boolean z11 = ((C0732a) arrayList.get(i12)).f10964p;
        ArrayList arrayList6 = this.f10897O;
        if (arrayList6 == null) {
            this.f10897O = new ArrayList();
        } else {
            arrayList6.clear();
        }
        this.f10897O.addAll(b0Var.k());
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10884A;
        int i13 = i12;
        boolean z12 = false;
        while (i13 < i8) {
            C0732a c0732a = (C0732a) arrayList.get(i13);
            if (!((Boolean) arrayList2.get(i13)).booleanValue()) {
                ArrayList arrayList7 = this.f10897O;
                ArrayList arrayList8 = c0732a.f10951a;
                int i14 = 0;
                while (i14 < arrayList8.size()) {
                    c0 c0Var = (c0) arrayList8.get(i14);
                    boolean z13 = z11;
                    int i15 = c0Var.f10993a;
                    int i16 = i13;
                    int i17 = 1;
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3 && i15 != 6) {
                                if (i15 != 7) {
                                    if (i15 != 8) {
                                        arrayList4 = arrayList5;
                                        z10 = z12;
                                    } else {
                                        z10 = z12;
                                        arrayList8.add(i14, new c0(9, abstractComponentCallbacksC0755y, 0));
                                        c0Var.f10995c = true;
                                        i14++;
                                        arrayList4 = arrayList5;
                                        abstractComponentCallbacksC0755y = c0Var.f10994b;
                                    }
                                } else {
                                    i17 = 1;
                                    z10 = z12;
                                    arrayList4 = arrayList5;
                                }
                            } else {
                                z10 = z12;
                                arrayList7.remove(c0Var.f10994b);
                                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = c0Var.f10994b;
                                if (abstractComponentCallbacksC0755y2 == abstractComponentCallbacksC0755y) {
                                    arrayList8.add(i14, new c0(9, abstractComponentCallbacksC0755y2));
                                    i14++;
                                    arrayList4 = arrayList5;
                                    abstractComponentCallbacksC0755y = null;
                                } else {
                                    arrayList4 = arrayList5;
                                }
                            }
                            i17 = 1;
                        } else {
                            z10 = z12;
                            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y3 = c0Var.f10994b;
                            int i18 = abstractComponentCallbacksC0755y3.f11087C;
                            int size = arrayList7.size() - 1;
                            boolean z14 = false;
                            while (size >= 0) {
                                int i19 = size;
                                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y4 = (AbstractComponentCallbacksC0755y) arrayList7.get(size);
                                ArrayList arrayList9 = arrayList5;
                                if (abstractComponentCallbacksC0755y4.f11087C == i18) {
                                    if (abstractComponentCallbacksC0755y4 == abstractComponentCallbacksC0755y3) {
                                        i10 = i18;
                                        z14 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0755y4 == abstractComponentCallbacksC0755y) {
                                            i10 = i18;
                                            arrayList8.add(i14, new c0(9, abstractComponentCallbacksC0755y4, 0));
                                            i14++;
                                            i11 = 0;
                                            abstractComponentCallbacksC0755y = null;
                                        } else {
                                            i10 = i18;
                                            i11 = 0;
                                        }
                                        c0 c0Var2 = new c0(3, abstractComponentCallbacksC0755y4, i11);
                                        c0Var2.f10996d = c0Var.f10996d;
                                        c0Var2.f10998f = c0Var.f10998f;
                                        c0Var2.f10997e = c0Var.f10997e;
                                        c0Var2.f10999g = c0Var.f10999g;
                                        arrayList8.add(i14, c0Var2);
                                        arrayList7.remove(abstractComponentCallbacksC0755y4);
                                        i14++;
                                        abstractComponentCallbacksC0755y = abstractComponentCallbacksC0755y;
                                    }
                                } else {
                                    i10 = i18;
                                }
                                size = i19 - 1;
                                i18 = i10;
                                arrayList5 = arrayList9;
                            }
                            arrayList4 = arrayList5;
                            i17 = 1;
                            if (z14) {
                                arrayList8.remove(i14);
                                i14--;
                            } else {
                                c0Var.f10993a = 1;
                                c0Var.f10995c = true;
                                arrayList7.add(abstractComponentCallbacksC0755y3);
                            }
                        }
                        i14 += i17;
                        z11 = z13;
                        i13 = i16;
                        z12 = z10;
                        arrayList5 = arrayList4;
                    } else {
                        arrayList4 = arrayList5;
                        z10 = z12;
                    }
                    arrayList7.add(c0Var.f10994b);
                    i14 += i17;
                    z11 = z13;
                    i13 = i16;
                    z12 = z10;
                    arrayList5 = arrayList4;
                }
                arrayList3 = arrayList5;
                z8 = z11;
                i9 = i13;
                z9 = z12;
            } else {
                arrayList3 = arrayList5;
                z8 = z11;
                i9 = i13;
                z9 = z12;
                int i20 = 1;
                ArrayList arrayList10 = this.f10897O;
                ArrayList arrayList11 = c0732a.f10951a;
                int size2 = arrayList11.size() - 1;
                while (size2 >= 0) {
                    c0 c0Var3 = (c0) arrayList11.get(size2);
                    int i21 = c0Var3.f10993a;
                    if (i21 != i20) {
                        if (i21 != 3) {
                            switch (i21) {
                                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                                    abstractComponentCallbacksC0755y = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0755y = c0Var3.f10994b;
                                    break;
                                case 10:
                                    c0Var3.f11001i = c0Var3.f11000h;
                                    break;
                            }
                            size2--;
                            i20 = 1;
                        }
                        arrayList10.add(c0Var3.f10994b);
                        size2--;
                        i20 = 1;
                    }
                    arrayList10.remove(c0Var3.f10994b);
                    size2--;
                    i20 = 1;
                }
            }
            if (!z9 && !c0732a.f10957g) {
                z12 = false;
            } else {
                z12 = true;
            }
            i13 = i9 + 1;
            z11 = z8;
            arrayList5 = arrayList3;
        }
        ArrayList arrayList12 = arrayList5;
        boolean z15 = z11;
        boolean z16 = z12;
        this.f10897O.clear();
        if (!z15 && this.f10920w >= 1) {
            for (int i22 = i12; i22 < i8; i22++) {
                Iterator it = ((C0732a) arrayList.get(i22)).f10951a.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y5 = ((c0) it.next()).f10994b;
                    if (abstractComponentCallbacksC0755y5 != null && abstractComponentCallbacksC0755y5.f11128x != null) {
                        b0Var.n(g(abstractComponentCallbacksC0755y5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i23 = i12;
        while (i23 < i8) {
            C0732a c0732a2 = (C0732a) arrayList.get(i23);
            if (((Boolean) arrayList2.get(i23)).booleanValue()) {
                c0732a2.c(-1);
                T t8 = c0732a2.f10966r;
                ArrayList arrayList13 = c0732a2.f10951a;
                for (int size3 = arrayList13.size() - 1; size3 >= 0; size3--) {
                    c0 c0Var4 = (c0) arrayList13.get(size3);
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y6 = c0Var4.f10994b;
                    if (abstractComponentCallbacksC0755y6 != null) {
                        abstractComponentCallbacksC0755y6.f11121q = c0732a2.f10969u;
                        if (abstractComponentCallbacksC0755y6.f11097N != null) {
                            abstractComponentCallbacksC0755y6.h().f11075a = true;
                        }
                        int i24 = c0732a2.f10956f;
                        int i25 = 8194;
                        int i26 = 4097;
                        if (i24 != 4097) {
                            if (i24 != 8194) {
                                i25 = 4100;
                                if (i24 != 8197) {
                                    i26 = 4099;
                                    if (i24 != 4099) {
                                        if (i24 != 4100) {
                                            i25 = 0;
                                        } else {
                                            i25 = 8197;
                                        }
                                    }
                                }
                            }
                            i25 = i26;
                        }
                        if (abstractComponentCallbacksC0755y6.f11097N != null || i25 != 0) {
                            abstractComponentCallbacksC0755y6.h();
                            abstractComponentCallbacksC0755y6.f11097N.f11080f = i25;
                        }
                        abstractComponentCallbacksC0755y6.h();
                        abstractComponentCallbacksC0755y6.f11097N.getClass();
                    }
                    switch (c0Var4.f10993a) {
                        case 1:
                            abstractComponentCallbacksC0755y6.Q(c0Var4.f10996d, c0Var4.f10997e, c0Var4.f10998f, c0Var4.f10999g);
                            t8.a0(abstractComponentCallbacksC0755y6, true);
                            t8.V(abstractComponentCallbacksC0755y6);
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        default:
                            throw new IllegalArgumentException(str2 + c0Var4.f10993a);
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            abstractComponentCallbacksC0755y6.Q(c0Var4.f10996d, c0Var4.f10997e, c0Var4.f10998f, c0Var4.f10999g);
                            t8.a(abstractComponentCallbacksC0755y6);
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            abstractComponentCallbacksC0755y6.Q(c0Var4.f10996d, c0Var4.f10997e, c0Var4.f10998f, c0Var4.f10999g);
                            t8.getClass();
                            if (K(2)) {
                                Objects.toString(abstractComponentCallbacksC0755y6);
                            }
                            if (abstractComponentCallbacksC0755y6.f11089E) {
                                abstractComponentCallbacksC0755y6.f11089E = false;
                                abstractComponentCallbacksC0755y6.f11098O = !abstractComponentCallbacksC0755y6.f11098O;
                            }
                        case Z.g.STRING_FIELD_NUMBER /* 5 */:
                            abstractComponentCallbacksC0755y6.Q(c0Var4.f10996d, c0Var4.f10997e, c0Var4.f10998f, c0Var4.f10999g);
                            t8.a0(abstractComponentCallbacksC0755y6, true);
                            if (K(2)) {
                                Objects.toString(abstractComponentCallbacksC0755y6);
                            }
                            if (!abstractComponentCallbacksC0755y6.f11089E) {
                                abstractComponentCallbacksC0755y6.f11089E = true;
                                abstractComponentCallbacksC0755y6.f11098O = !abstractComponentCallbacksC0755y6.f11098O;
                                t8.e0(abstractComponentCallbacksC0755y6);
                            }
                        case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                            abstractComponentCallbacksC0755y6.Q(c0Var4.f10996d, c0Var4.f10997e, c0Var4.f10998f, c0Var4.f10999g);
                            t8.c(abstractComponentCallbacksC0755y6);
                        case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                            abstractComponentCallbacksC0755y6.Q(c0Var4.f10996d, c0Var4.f10997e, c0Var4.f10998f, c0Var4.f10999g);
                            t8.a0(abstractComponentCallbacksC0755y6, true);
                            t8.h(abstractComponentCallbacksC0755y6);
                        case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                            t8.d0(null);
                        case 9:
                            t8.d0(abstractComponentCallbacksC0755y6);
                        case 10:
                            t8.c0(abstractComponentCallbacksC0755y6, c0Var4.f11000h);
                    }
                }
            } else {
                c0732a2.c(1);
                T t9 = c0732a2.f10966r;
                ArrayList arrayList14 = c0732a2.f10951a;
                int size4 = arrayList14.size();
                int i27 = 0;
                while (i27 < size4) {
                    c0 c0Var5 = (c0) arrayList14.get(i27);
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y7 = c0Var5.f10994b;
                    if (abstractComponentCallbacksC0755y7 != null) {
                        abstractComponentCallbacksC0755y7.f11121q = c0732a2.f10969u;
                        if (abstractComponentCallbacksC0755y7.f11097N != null) {
                            abstractComponentCallbacksC0755y7.h().f11075a = false;
                        }
                        int i28 = c0732a2.f10956f;
                        if (abstractComponentCallbacksC0755y7.f11097N != null || i28 != 0) {
                            abstractComponentCallbacksC0755y7.h();
                            abstractComponentCallbacksC0755y7.f11097N.f11080f = i28;
                        }
                        abstractComponentCallbacksC0755y7.h();
                        abstractComponentCallbacksC0755y7.f11097N.getClass();
                    }
                    switch (c0Var5.f10993a) {
                        case 1:
                            str = str2;
                            abstractComponentCallbacksC0755y7.Q(c0Var5.f10996d, c0Var5.f10997e, c0Var5.f10998f, c0Var5.f10999g);
                            t9.a0(abstractComponentCallbacksC0755y7, false);
                            t9.a(abstractComponentCallbacksC0755y7);
                            i27++;
                            str2 = str;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        default:
                            throw new IllegalArgumentException(str2 + c0Var5.f10993a);
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            str = str2;
                            abstractComponentCallbacksC0755y7.Q(c0Var5.f10996d, c0Var5.f10997e, c0Var5.f10998f, c0Var5.f10999g);
                            t9.V(abstractComponentCallbacksC0755y7);
                            i27++;
                            str2 = str;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            str = str2;
                            abstractComponentCallbacksC0755y7.Q(c0Var5.f10996d, c0Var5.f10997e, c0Var5.f10998f, c0Var5.f10999g);
                            t9.getClass();
                            if (K(2)) {
                                Objects.toString(abstractComponentCallbacksC0755y7);
                            }
                            if (!abstractComponentCallbacksC0755y7.f11089E) {
                                abstractComponentCallbacksC0755y7.f11089E = true;
                                abstractComponentCallbacksC0755y7.f11098O = !abstractComponentCallbacksC0755y7.f11098O;
                                t9.e0(abstractComponentCallbacksC0755y7);
                            }
                            i27++;
                            str2 = str;
                        case Z.g.STRING_FIELD_NUMBER /* 5 */:
                            str = str2;
                            abstractComponentCallbacksC0755y7.Q(c0Var5.f10996d, c0Var5.f10997e, c0Var5.f10998f, c0Var5.f10999g);
                            t9.a0(abstractComponentCallbacksC0755y7, false);
                            if (K(2)) {
                                Objects.toString(abstractComponentCallbacksC0755y7);
                            }
                            if (abstractComponentCallbacksC0755y7.f11089E) {
                                abstractComponentCallbacksC0755y7.f11089E = false;
                                abstractComponentCallbacksC0755y7.f11098O = !abstractComponentCallbacksC0755y7.f11098O;
                            }
                            i27++;
                            str2 = str;
                        case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = str2;
                            abstractComponentCallbacksC0755y7.Q(c0Var5.f10996d, c0Var5.f10997e, c0Var5.f10998f, c0Var5.f10999g);
                            t9.h(abstractComponentCallbacksC0755y7);
                            i27++;
                            str2 = str;
                        case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = str2;
                            abstractComponentCallbacksC0755y7.Q(c0Var5.f10996d, c0Var5.f10997e, c0Var5.f10998f, c0Var5.f10999g);
                            t9.a0(abstractComponentCallbacksC0755y7, false);
                            t9.c(abstractComponentCallbacksC0755y7);
                            i27++;
                            str2 = str;
                        case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                            t9.d0(abstractComponentCallbacksC0755y7);
                            str = str2;
                            i27++;
                            str2 = str;
                        case 9:
                            t9.d0(null);
                            str = str2;
                            i27++;
                            str2 = str;
                        case 10:
                            t9.c0(abstractComponentCallbacksC0755y7, c0Var5.f11001i);
                            str = str2;
                            i27++;
                            str2 = str;
                    }
                }
            }
            i23++;
            str2 = str2;
        }
        boolean booleanValue = ((Boolean) arrayList2.get(i8 - 1)).booleanValue();
        if (z16 && !arrayList12.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(G((C0732a) it2.next()));
            }
            if (this.f10907h == null) {
                Iterator it3 = arrayList12.iterator();
                while (it3.hasNext()) {
                    C1301i c1301i = (C1301i) it3.next();
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        c1301i.b((AbstractComponentCallbacksC0755y) it4.next(), booleanValue);
                    }
                }
                Iterator it5 = arrayList12.iterator();
                while (it5.hasNext()) {
                    C1301i c1301i2 = (C1301i) it5.next();
                    Iterator it6 = linkedHashSet.iterator();
                    while (it6.hasNext()) {
                        c1301i2.a((AbstractComponentCallbacksC0755y) it6.next(), booleanValue);
                    }
                }
            }
        }
        for (int i29 = i12; i29 < i8; i29++) {
            C0732a c0732a3 = (C0732a) arrayList.get(i29);
            if (booleanValue) {
                for (int size5 = c0732a3.f10951a.size() - 1; size5 >= 0; size5--) {
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y8 = ((c0) c0732a3.f10951a.get(size5)).f10994b;
                    if (abstractComponentCallbacksC0755y8 != null) {
                        g(abstractComponentCallbacksC0755y8).k();
                    }
                }
            } else {
                Iterator it7 = c0732a3.f10951a.iterator();
                while (it7.hasNext()) {
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y9 = ((c0) it7.next()).f10994b;
                    if (abstractComponentCallbacksC0755y9 != null) {
                        g(abstractComponentCallbacksC0755y9).k();
                    }
                }
            }
        }
        Q(this.f10920w, true);
        Iterator it8 = f(arrayList, i12, i8).iterator();
        while (it8.hasNext()) {
            C0744m c0744m = (C0744m) it8.next();
            c0744m.f11046e = booleanValue;
            synchronized (c0744m.f11043b) {
                try {
                    c0744m.l();
                    ArrayList arrayList15 = c0744m.f11043b;
                    ListIterator listIterator = arrayList15.listIterator(arrayList15.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            g0 g0Var = (g0) obj;
                            View view = g0Var.f11024c.K;
                            o6.j.d(view, "operation.fragment.mView");
                            char c6 = 4;
                            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                                int visibility = view.getVisibility();
                                if (visibility != 0) {
                                    if (visibility != 4) {
                                        if (visibility == 8) {
                                            c6 = 3;
                                        } else {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                    }
                                } else {
                                    c6 = 2;
                                }
                            }
                            if (g0Var.f11022a != 2 || c6 == 2) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    c0744m.f11047f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0744m.e();
        }
        while (i12 < i8) {
            C0732a c0732a4 = (C0732a) arrayList.get(i12);
            if (((Boolean) arrayList2.get(i12)).booleanValue() && c0732a4.f10968t >= 0) {
                c0732a4.f10968t = -1;
            }
            if (c0732a4.f10965q != null) {
                for (int i30 = 0; i30 < c0732a4.f10965q.size(); i30++) {
                    ((Runnable) c0732a4.f10965q.get(i30)).run();
                }
                c0732a4.f10965q = null;
            }
            i12++;
        }
        if (z16) {
            for (int i31 = 0; i31 < arrayList12.size(); i31++) {
                ((C1301i) arrayList12.get(i31)).getClass();
            }
        }
    }

    public final int C(String str, int i4, boolean z8) {
        if (this.f10903d.isEmpty()) {
            return -1;
        }
        if (str == null && i4 < 0) {
            if (z8) {
                return 0;
            }
            return this.f10903d.size() - 1;
        }
        int size = this.f10903d.size() - 1;
        while (size >= 0) {
            C0732a c0732a = (C0732a) this.f10903d.get(size);
            if ((str != null && str.equals(c0732a.f10959i)) || (i4 >= 0 && i4 == c0732a.f10968t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (z8) {
            while (size > 0) {
                C0732a c0732a2 = (C0732a) this.f10903d.get(size - 1);
                if ((str == null || !str.equals(c0732a2.f10959i)) && (i4 < 0 || i4 != c0732a2.f10968t)) {
                    break;
                }
                size--;
            }
            return size;
        }
        if (size == this.f10903d.size() - 1) {
            return -1;
        }
        return size + 1;
    }

    public final AbstractComponentCallbacksC0755y D(int i4) {
        b0 b0Var = this.f10902c;
        ArrayList arrayList = (ArrayList) b0Var.f10987d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = (AbstractComponentCallbacksC0755y) arrayList.get(size);
            if (abstractComponentCallbacksC0755y != null && abstractComponentCallbacksC0755y.f11086B == i4) {
                return abstractComponentCallbacksC0755y;
            }
        }
        for (a0 a0Var : ((HashMap) b0Var.f10988e).values()) {
            if (a0Var != null) {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = a0Var.f10972c;
                if (abstractComponentCallbacksC0755y2.f11086B == i4) {
                    return abstractComponentCallbacksC0755y2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC0755y E(String str) {
        b0 b0Var = this.f10902c;
        ArrayList arrayList = (ArrayList) b0Var.f10987d;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = (AbstractComponentCallbacksC0755y) arrayList.get(size);
                if (abstractComponentCallbacksC0755y != null && str.equals(abstractComponentCallbacksC0755y.f11088D)) {
                    return abstractComponentCallbacksC0755y;
                }
            }
        }
        if (str != null) {
            for (a0 a0Var : ((HashMap) b0Var.f10988e).values()) {
                if (a0Var != null) {
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = a0Var.f10972c;
                    if (str.equals(abstractComponentCallbacksC0755y2.f11088D)) {
                        return abstractComponentCallbacksC0755y2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public final void F() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            C0744m c0744m = (C0744m) it.next();
            if (c0744m.f11047f) {
                c0744m.f11047f = false;
                c0744m.e();
            }
        }
    }

    public final ViewGroup H(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        ViewGroup viewGroup = abstractComponentCallbacksC0755y.f11094J;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0755y.f11087C > 0 && this.f10922y.F()) {
            View E7 = this.f10922y.E(abstractComponentCallbacksC0755y.f11087C);
            if (E7 instanceof ViewGroup) {
                return (ViewGroup) E7;
            }
            return null;
        }
        return null;
    }

    public final J I() {
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10923z;
        if (abstractComponentCallbacksC0755y != null) {
            return abstractComponentCallbacksC0755y.f11128x.I();
        }
        return this.f10885B;
    }

    public final C1594d J() {
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10923z;
        if (abstractComponentCallbacksC0755y != null) {
            return abstractComponentCallbacksC0755y.f11128x.J();
        }
        return this.f10886C;
    }

    public final boolean M() {
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10923z;
        if (abstractComponentCallbacksC0755y != null) {
            if (abstractComponentCallbacksC0755y.f11129y != null && abstractComponentCallbacksC0755y.f11118n && abstractComponentCallbacksC0755y.m().M()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean P() {
        if (!this.f10892I && !this.f10893J) {
            return false;
        }
        return true;
    }

    public final void Q(int i4, boolean z8) {
        C0731A c0731a;
        if (this.f10921x == null && i4 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z8 || i4 != this.f10920w) {
            this.f10920w = i4;
            b0 b0Var = this.f10902c;
            HashMap hashMap = (HashMap) b0Var.f10988e;
            Iterator it = ((ArrayList) b0Var.f10987d).iterator();
            while (it.hasNext()) {
                a0 a0Var = (a0) hashMap.get(((AbstractComponentCallbacksC0755y) it.next()).f11114h);
                if (a0Var != null) {
                    a0Var.k();
                }
            }
            for (a0 a0Var2 : hashMap.values()) {
                if (a0Var2 != null) {
                    a0Var2.k();
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = a0Var2.f10972c;
                    if (abstractComponentCallbacksC0755y.f11119o && !abstractComponentCallbacksC0755y.s()) {
                        if (abstractComponentCallbacksC0755y.f11121q && !((HashMap) b0Var.f10989f).containsKey(abstractComponentCallbacksC0755y.f11114h)) {
                            b0Var.r(abstractComponentCallbacksC0755y.f11114h, a0Var2.o());
                        }
                        b0Var.o(a0Var2);
                    }
                }
            }
            f0();
            if (this.f10891H && (c0731a = this.f10921x) != null && this.f10920w == 7) {
                c0731a.f10846m.invalidateOptionsMenu();
                this.f10891H = false;
            }
        }
    }

    public final void R() {
        if (this.f10921x != null) {
            this.f10892I = false;
            this.f10893J = false;
            this.f10898P.f10937g = false;
            for (AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y : this.f10902c.k()) {
                if (abstractComponentCallbacksC0755y != null) {
                    abstractComponentCallbacksC0755y.f11130z.R();
                }
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i4, int i8) {
        A(false);
        z(true);
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10884A;
        if (abstractComponentCallbacksC0755y != null && i4 < 0 && abstractComponentCallbacksC0755y.i().S()) {
            return true;
        }
        boolean U8 = U(this.f10895M, this.f10896N, null, i4, i8);
        if (U8) {
            this.f10901b = true;
            try {
                W(this.f10895M, this.f10896N);
            } finally {
                d();
            }
        }
        h0();
        v();
        ((HashMap) this.f10902c.f10988e).values().removeAll(Collections.singleton(null));
        return U8;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, String str, int i4, int i8) {
        boolean z8;
        if ((i8 & 1) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int C8 = C(str, i4, z8);
        if (C8 < 0) {
            return false;
        }
        for (int size = this.f10903d.size() - 1; size >= C8; size--) {
            arrayList.add((C0732a) this.f10903d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        if (K(2)) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        boolean s8 = abstractComponentCallbacksC0755y.s();
        if (abstractComponentCallbacksC0755y.f11090F && s8) {
            return;
        }
        b0 b0Var = this.f10902c;
        synchronized (((ArrayList) b0Var.f10987d)) {
            ((ArrayList) b0Var.f10987d).remove(abstractComponentCallbacksC0755y);
        }
        abstractComponentCallbacksC0755y.f11118n = false;
        if (L(abstractComponentCallbacksC0755y)) {
            this.f10891H = true;
        }
        abstractComponentCallbacksC0755y.f11119o = true;
        e0(abstractComponentCallbacksC0755y);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i4 = 0;
                int i8 = 0;
                while (i4 < size) {
                    if (!((C0732a) arrayList.get(i4)).f10964p) {
                        if (i8 != i4) {
                            B(arrayList, arrayList2, i8, i4);
                        }
                        i8 = i4 + 1;
                        if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                            while (i8 < size && ((Boolean) arrayList2.get(i8)).booleanValue() && !((C0732a) arrayList.get(i8)).f10964p) {
                                i8++;
                            }
                        }
                        B(arrayList, arrayList2, i4, i8);
                        i4 = i8 - 1;
                    }
                    i4++;
                }
                if (i8 != size) {
                    B(arrayList, arrayList2, i8, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void X(Bundle bundle) {
        R3.r rVar;
        a0 a0Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f10921x.j.getClassLoader());
                this.f10910m.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f10921x.j.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        b0 b0Var = this.f10902c;
        HashMap hashMap2 = (HashMap) b0Var.f10989f;
        HashMap hashMap3 = (HashMap) b0Var.f10988e;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        U u8 = (U) bundle.getParcelable("state");
        if (u8 == null) {
            return;
        }
        hashMap3.clear();
        Iterator it = u8.f10924d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rVar = this.f10913p;
            if (!hasNext) {
                break;
            }
            Bundle r8 = b0Var.r((String) it.next(), null);
            if (r8 != null) {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = (AbstractComponentCallbacksC0755y) this.f10898P.f10932b.get(((Z) r8.getParcelable("state")).f10939e);
                if (abstractComponentCallbacksC0755y != null) {
                    if (K(2)) {
                        abstractComponentCallbacksC0755y.toString();
                    }
                    a0Var = new a0(rVar, b0Var, abstractComponentCallbacksC0755y, r8);
                } else {
                    a0Var = new a0(this.f10913p, this.f10902c, this.f10921x.j.getClassLoader(), I(), r8);
                }
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = a0Var.f10972c;
                abstractComponentCallbacksC0755y2.f11111e = r8;
                abstractComponentCallbacksC0755y2.f11128x = this;
                if (K(2)) {
                    abstractComponentCallbacksC0755y2.toString();
                }
                a0Var.m(this.f10921x.j.getClassLoader());
                b0Var.n(a0Var);
                a0Var.f10974e = this.f10920w;
            }
        }
        W w8 = this.f10898P;
        w8.getClass();
        Iterator it2 = new ArrayList(w8.f10932b.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y3 = (AbstractComponentCallbacksC0755y) it2.next();
            if (hashMap3.get(abstractComponentCallbacksC0755y3.f11114h) == null) {
                if (K(2)) {
                    abstractComponentCallbacksC0755y3.toString();
                    Objects.toString(u8.f10924d);
                }
                this.f10898P.f(abstractComponentCallbacksC0755y3);
                abstractComponentCallbacksC0755y3.f11128x = this;
                a0 a0Var2 = new a0(rVar, b0Var, abstractComponentCallbacksC0755y3);
                a0Var2.f10974e = 1;
                a0Var2.k();
                abstractComponentCallbacksC0755y3.f11119o = true;
                a0Var2.k();
            }
        }
        ArrayList<String> arrayList = u8.f10925e;
        ((ArrayList) b0Var.f10987d).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0755y e9 = b0Var.e(str3);
                if (e9 != null) {
                    if (K(2)) {
                        e9.toString();
                    }
                    b0Var.a(e9);
                } else {
                    throw new IllegalStateException(A.j.p("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (u8.f10926f != null) {
            this.f10903d = new ArrayList(u8.f10926f.length);
            int i4 = 0;
            while (true) {
                C0733b[] c0733bArr = u8.f10926f;
                if (i4 >= c0733bArr.length) {
                    break;
                }
                C0733b c0733b = c0733bArr[i4];
                ArrayList arrayList2 = c0733b.f10976e;
                C0732a c0732a = new C0732a(this);
                c0733b.a(c0732a);
                c0732a.f10968t = c0733b.j;
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    String str4 = (String) arrayList2.get(i8);
                    if (str4 != null) {
                        ((c0) c0732a.f10951a.get(i8)).f10994b = b0Var.e(str4);
                    }
                }
                c0732a.c(1);
                if (K(2)) {
                    c0732a.toString();
                    PrintWriter printWriter = new PrintWriter(new e0());
                    c0732a.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f10903d.add(c0732a);
                i4++;
            }
        } else {
            this.f10903d = new ArrayList();
        }
        this.k.set(u8.f10927g);
        String str5 = u8.f10928h;
        if (str5 != null) {
            AbstractComponentCallbacksC0755y e10 = b0Var.e(str5);
            this.f10884A = e10;
            r(e10);
        }
        ArrayList arrayList3 = u8.f10929i;
        if (arrayList3 != null) {
            for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                this.f10909l.put((String) arrayList3.get(i9), (C0734c) u8.j.get(i9));
            }
        }
        this.f10890G = new ArrayDeque(u8.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.os.Parcelable, java.lang.Object, g0.U] */
    public final Bundle Y() {
        ArrayList arrayList;
        C0733b[] c0733bArr;
        Bundle bundle = new Bundle();
        F();
        x();
        A(true);
        this.f10892I = true;
        this.f10898P.f10937g = true;
        b0 b0Var = this.f10902c;
        b0Var.getClass();
        HashMap hashMap = (HashMap) b0Var.f10988e;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (a0 a0Var : hashMap.values()) {
            if (a0Var != null) {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = a0Var.f10972c;
                b0Var.r(abstractComponentCallbacksC0755y.f11114h, a0Var.o());
                arrayList2.add(abstractComponentCallbacksC0755y.f11114h);
                if (K(2)) {
                    abstractComponentCallbacksC0755y.toString();
                    Objects.toString(abstractComponentCallbacksC0755y.f11111e);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f10902c.f10989f;
        if (hashMap2.isEmpty()) {
            return bundle;
        }
        b0 b0Var2 = this.f10902c;
        synchronized (((ArrayList) b0Var2.f10987d)) {
            try {
                if (((ArrayList) b0Var2.f10987d).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) b0Var2.f10987d).size());
                    Iterator it = ((ArrayList) b0Var2.f10987d).iterator();
                    while (it.hasNext()) {
                        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = (AbstractComponentCallbacksC0755y) it.next();
                        arrayList.add(abstractComponentCallbacksC0755y2.f11114h);
                        if (K(2)) {
                            abstractComponentCallbacksC0755y2.toString();
                        }
                    }
                }
            } finally {
            }
        }
        int size = this.f10903d.size();
        if (size > 0) {
            c0733bArr = new C0733b[size];
            for (int i4 = 0; i4 < size; i4++) {
                c0733bArr[i4] = new C0733b((C0732a) this.f10903d.get(i4));
                if (K(2)) {
                    Objects.toString(this.f10903d.get(i4));
                }
            }
        } else {
            c0733bArr = null;
        }
        ?? obj = new Object();
        obj.f10928h = null;
        ArrayList arrayList3 = new ArrayList();
        obj.f10929i = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        obj.j = arrayList4;
        obj.f10924d = arrayList2;
        obj.f10925e = arrayList;
        obj.f10926f = c0733bArr;
        obj.f10927g = this.k.get();
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y3 = this.f10884A;
        if (abstractComponentCallbacksC0755y3 != null) {
            obj.f10928h = abstractComponentCallbacksC0755y3.f11114h;
        }
        arrayList3.addAll(this.f10909l.keySet());
        arrayList4.addAll(this.f10909l.values());
        obj.k = new ArrayList(this.f10890G);
        bundle.putParcelable("state", obj);
        for (String str : this.f10910m.keySet()) {
            bundle.putBundle(A.j.o("result_", str), (Bundle) this.f10910m.get(str));
        }
        for (String str2 : hashMap2.keySet()) {
            bundle.putBundle(A.j.o("fragment_", str2), (Bundle) hashMap2.get(str2));
        }
        return bundle;
    }

    public final void Z() {
        synchronized (this.f10900a) {
            try {
                if (this.f10900a.size() == 1) {
                    this.f10921x.k.removeCallbacks(this.f10899Q);
                    this.f10921x.k.post(this.f10899Q);
                    h0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a0 a(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        String str = abstractComponentCallbacksC0755y.f11101R;
        if (str != null) {
            h0.c.c(abstractComponentCallbacksC0755y, str);
        }
        if (K(2)) {
            abstractComponentCallbacksC0755y.toString();
        }
        a0 g8 = g(abstractComponentCallbacksC0755y);
        abstractComponentCallbacksC0755y.f11128x = this;
        b0 b0Var = this.f10902c;
        b0Var.n(g8);
        if (!abstractComponentCallbacksC0755y.f11090F) {
            b0Var.a(abstractComponentCallbacksC0755y);
            abstractComponentCallbacksC0755y.f11119o = false;
            if (abstractComponentCallbacksC0755y.K == null) {
                abstractComponentCallbacksC0755y.f11098O = false;
            }
            if (L(abstractComponentCallbacksC0755y)) {
                this.f10891H = true;
            }
        }
        return g8;
    }

    public final void a0(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, boolean z8) {
        ViewGroup H2 = H(abstractComponentCallbacksC0755y);
        if (H2 != null && (H2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) H2).setDrawDisappearingViewsLast(!z8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0731A c0731a, AbstractC1638C abstractC1638C, AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        String str;
        C0731A c0731a2;
        if (this.f10921x == null) {
            this.f10921x = c0731a;
            this.f10922y = abstractC1638C;
            this.f10923z = abstractComponentCallbacksC0755y;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f10914q;
            if (abstractComponentCallbacksC0755y != 0) {
                copyOnWriteArrayList.add(new K(abstractComponentCallbacksC0755y));
            } else if (c0731a != null) {
                copyOnWriteArrayList.add(c0731a);
            }
            if (this.f10923z != null) {
                h0();
            }
            if (c0731a != null) {
                C0544A k = c0731a.f10846m.k();
                this.f10906g = k;
                if (abstractComponentCallbacksC0755y != 0) {
                    c0731a2 = abstractComponentCallbacksC0755y;
                } else {
                    c0731a2 = c0731a;
                }
                k.getClass();
                H h8 = this.j;
                o6.j.e(h8, "onBackPressedCallback");
                C0512x g8 = c0731a2.g();
                if (g8.f8862d != EnumC0504o.f8846d) {
                    h8.f10862b.add(new c.y(k, g8, h8));
                    k.c();
                    h8.f10863c = new J3.s(0, k, C0544A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 5);
                }
            }
            if (abstractComponentCallbacksC0755y != 0) {
                W w8 = abstractComponentCallbacksC0755y.f11128x.f10898P;
                HashMap hashMap = w8.f10933c;
                W w9 = (W) hashMap.get(abstractComponentCallbacksC0755y.f11114h);
                if (w9 == null) {
                    w9 = new W(w8.f10935e);
                    hashMap.put(abstractComponentCallbacksC0755y.f11114h, w9);
                }
                this.f10898P = w9;
            } else if (c0731a != null) {
                androidx.lifecycle.e0 f8 = c0731a.f10846m.f();
                o6.j.e(f8, "store");
                C0946a c0946a = C0946a.f11950b;
                o6.j.e(c0946a, "defaultCreationExtras");
                b0 b0Var = new b0(f8, W.f10931h, c0946a);
                InterfaceC1642c n3 = h2.a.n(W.class);
                String a3 = n3.a();
                if (a3 != null) {
                    this.f10898P = (W) b0Var.l("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a3), n3);
                } else {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
            } else {
                this.f10898P = new W(false);
            }
            this.f10898P.f10937g = P();
            this.f10902c.f10990g = this.f10898P;
            C0731A c0731a3 = this.f10921x;
            if (c0731a3 != null && abstractComponentCallbacksC0755y == 0) {
                A.i b4 = c0731a3.b();
                b4.k("android:support:fragments", new F(0, this));
                Bundle b9 = b4.b("android:support:fragments");
                if (b9 != null) {
                    X(b9);
                }
            }
            C0731A c0731a4 = this.f10921x;
            if (c0731a4 != null) {
                C0553g c0553g = c0731a4.f10846m.f9342o;
                if (abstractComponentCallbacksC0755y != 0) {
                    str = A.j.r(new StringBuilder(), abstractComponentCallbacksC0755y.f11114h, ":");
                } else {
                    str = "";
                }
                String o7 = A.j.o("FragmentManager:", str);
                this.f10887D = c0553g.c(AbstractC1149a.g(o7, "StartActivityForResult"), new C0649a(2), new L(0, this));
                this.f10888E = c0553g.c(AbstractC1149a.g(o7, "StartIntentSenderForResult"), new C0649a(3), new G(this, 1));
                this.f10889F = c0553g.c(AbstractC1149a.g(o7, "RequestPermissions"), new C0649a(0), new G(this, 0));
            }
            C0731A c0731a5 = this.f10921x;
            if (c0731a5 != null) {
                c0731a5.f10846m.i(this.f10915r);
            }
            C0731A c0731a6 = this.f10921x;
            if (c0731a6 != null) {
                c0731a6.f10846m.f9344q.add(this.f10916s);
            }
            C0731A c0731a7 = this.f10921x;
            if (c0731a7 != null) {
                c0731a7.f10846m.f9346s.add(this.f10917t);
            }
            C0731A c0731a8 = this.f10921x;
            if (c0731a8 != null) {
                c0731a8.f10846m.f9347t.add(this.f10918u);
            }
            C0731A c0731a9 = this.f10921x;
            if (c0731a9 != null && abstractComponentCallbacksC0755y == 0) {
                A4.c cVar = c0731a9.f10846m.f9335f;
                ((CopyOnWriteArrayList) cVar.f292f).add(this.f10919v);
                ((Runnable) cVar.f291e).run();
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void b0(String str, InterfaceC0510v interfaceC0510v, Y y4) {
        C0512x g8 = interfaceC0510v.g();
        if (g8.f8862d == EnumC0504o.f8846d) {
            return;
        }
        C0628d c0628d = new C0628d(this, str, y4, g8, 1);
        N n3 = (N) this.f10911n.put(str, new N(g8, y4, c0628d));
        if (n3 != null) {
            n3.f10874d.f(n3.f10876f);
        }
        if (K(2)) {
            g8.getClass();
            Objects.toString(y4);
        }
        g8.a(c0628d);
    }

    public final void c(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        if (K(2)) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        if (abstractComponentCallbacksC0755y.f11090F) {
            abstractComponentCallbacksC0755y.f11090F = false;
            if (!abstractComponentCallbacksC0755y.f11118n) {
                this.f10902c.a(abstractComponentCallbacksC0755y);
                if (K(2)) {
                    abstractComponentCallbacksC0755y.toString();
                }
                if (L(abstractComponentCallbacksC0755y)) {
                    this.f10891H = true;
                }
            }
        }
    }

    public final void c0(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, EnumC0504o enumC0504o) {
        if (abstractComponentCallbacksC0755y.equals(this.f10902c.e(abstractComponentCallbacksC0755y.f11114h)) && (abstractComponentCallbacksC0755y.f11129y == null || abstractComponentCallbacksC0755y.f11128x == this)) {
            abstractComponentCallbacksC0755y.f11102S = enumC0504o;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0755y + " is not an active fragment of FragmentManager " + this);
    }

    public final void d() {
        this.f10901b = false;
        this.f10896N.clear();
        this.f10895M.clear();
    }

    public final void d0(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        if (abstractComponentCallbacksC0755y != null) {
            if (!abstractComponentCallbacksC0755y.equals(this.f10902c.e(abstractComponentCallbacksC0755y.f11114h)) || (abstractComponentCallbacksC0755y.f11129y != null && abstractComponentCallbacksC0755y.f11128x != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0755y + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = this.f10884A;
        this.f10884A = abstractComponentCallbacksC0755y;
        r(abstractComponentCallbacksC0755y2);
        r(this.f10884A);
    }

    public final HashSet e() {
        C0744m c0744m;
        HashSet hashSet = new HashSet();
        Iterator it = this.f10902c.h().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((a0) it.next()).f10972c.f11094J;
            if (viewGroup != null) {
                o6.j.e(J(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0744m) {
                    c0744m = (C0744m) tag;
                } else {
                    c0744m = new C0744m(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0744m);
                }
                hashSet.add(c0744m);
            }
        }
        return hashSet;
    }

    public final void e0(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        int i4;
        int i8;
        int i9;
        int i10;
        ViewGroup H2 = H(abstractComponentCallbacksC0755y);
        if (H2 != null) {
            C0753w c0753w = abstractComponentCallbacksC0755y.f11097N;
            boolean z8 = false;
            if (c0753w == null) {
                i4 = 0;
            } else {
                i4 = c0753w.f11076b;
            }
            if (c0753w == null) {
                i8 = 0;
            } else {
                i8 = c0753w.f11077c;
            }
            int i11 = i8 + i4;
            if (c0753w == null) {
                i9 = 0;
            } else {
                i9 = c0753w.f11078d;
            }
            int i12 = i9 + i11;
            if (c0753w == null) {
                i10 = 0;
            } else {
                i10 = c0753w.f11079e;
            }
            if (i10 + i12 > 0) {
                if (H2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    H2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0755y);
                }
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = (AbstractComponentCallbacksC0755y) H2.getTag(R.id.visible_removing_fragment_view_tag);
                C0753w c0753w2 = abstractComponentCallbacksC0755y.f11097N;
                if (c0753w2 != null) {
                    z8 = c0753w2.f11075a;
                }
                if (abstractComponentCallbacksC0755y2.f11097N != null) {
                    abstractComponentCallbacksC0755y2.h().f11075a = z8;
                }
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i4, int i8) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i4 < i8) {
            Iterator it = ((C0732a) arrayList.get(i4)).f10951a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = ((c0) it.next()).f10994b;
                if (abstractComponentCallbacksC0755y != null && (viewGroup = abstractComponentCallbacksC0755y.f11094J) != null) {
                    hashSet.add(C0744m.i(viewGroup, this));
                }
            }
            i4++;
        }
        return hashSet;
    }

    public final void f0() {
        Iterator it = this.f10902c.h().iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = a0Var.f10972c;
            if (abstractComponentCallbacksC0755y.f11095L) {
                if (this.f10901b) {
                    this.f10894L = true;
                } else {
                    abstractComponentCallbacksC0755y.f11095L = false;
                    a0Var.k();
                }
            }
        }
    }

    public final a0 g(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        String str = abstractComponentCallbacksC0755y.f11114h;
        b0 b0Var = this.f10902c;
        a0 a0Var = (a0) ((HashMap) b0Var.f10988e).get(str);
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(this.f10913p, b0Var, abstractComponentCallbacksC0755y);
        a0Var2.m(this.f10921x.j.getClassLoader());
        a0Var2.f10974e = this.f10920w;
        return a0Var2;
    }

    public final void g0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new e0());
        C0731A c0731a = this.f10921x;
        if (c0731a != null) {
            try {
                c0731a.f10846m.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e9) {
                Log.e("FragmentManager", "Failed dumping state", e9);
                throw runtimeException;
            }
        }
        try {
            w("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw runtimeException;
        }
    }

    public final void h(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        if (K(2)) {
            Objects.toString(abstractComponentCallbacksC0755y);
        }
        if (!abstractComponentCallbacksC0755y.f11090F) {
            abstractComponentCallbacksC0755y.f11090F = true;
            if (abstractComponentCallbacksC0755y.f11118n) {
                if (K(2)) {
                    abstractComponentCallbacksC0755y.toString();
                }
                b0 b0Var = this.f10902c;
                synchronized (((ArrayList) b0Var.f10987d)) {
                    ((ArrayList) b0Var.f10987d).remove(abstractComponentCallbacksC0755y);
                }
                abstractComponentCallbacksC0755y.f11118n = false;
                if (L(abstractComponentCallbacksC0755y)) {
                    this.f10891H = true;
                }
                e0(abstractComponentCallbacksC0755y);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [o6.i, n6.a] */
    /* JADX WARN: Type inference failed for: r1v8, types: [o6.i, n6.a] */
    public final void h0() {
        int i4;
        synchronized (this.f10900a) {
            try {
                boolean z8 = true;
                if (!this.f10900a.isEmpty()) {
                    H h8 = this.j;
                    h8.f10861a = true;
                    ?? r12 = h8.f10863c;
                    if (r12 != 0) {
                        r12.a();
                    }
                    if (K(3)) {
                        toString();
                    }
                    return;
                }
                int size = this.f10903d.size();
                if (this.f10907h != null) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (size + i4 <= 0 || !O(this.f10923z)) {
                    z8 = false;
                }
                if (K(3)) {
                    toString();
                }
                H h9 = this.j;
                h9.f10861a = z8;
                ?? r02 = h9.f10863c;
                if (r02 != 0) {
                    r02.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(boolean z8) {
        if (z8 && this.f10921x != null) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y : this.f10902c.k()) {
            if (abstractComponentCallbacksC0755y != null) {
                abstractComponentCallbacksC0755y.f11093I = true;
                if (z8) {
                    abstractComponentCallbacksC0755y.f11130z.i(true);
                }
            }
        }
    }

    public final boolean j() {
        boolean z8;
        if (this.f10920w >= 1) {
            for (AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y : this.f10902c.k()) {
                if (abstractComponentCallbacksC0755y != null) {
                    if (!abstractComponentCallbacksC0755y.f11089E) {
                        z8 = abstractComponentCallbacksC0755y.f11130z.j();
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        boolean z8;
        if (this.f10920w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z9 = false;
        for (AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y : this.f10902c.k()) {
            if (abstractComponentCallbacksC0755y != null && N(abstractComponentCallbacksC0755y)) {
                if (!abstractComponentCallbacksC0755y.f11089E) {
                    z8 = abstractComponentCallbacksC0755y.f11130z.k();
                } else {
                    z8 = false;
                }
                if (z8) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0755y);
                    z9 = true;
                }
            }
        }
        if (this.f10904e != null) {
            for (int i4 = 0; i4 < this.f10904e.size(); i4++) {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = (AbstractComponentCallbacksC0755y) this.f10904e.get(i4);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0755y2)) {
                    abstractComponentCallbacksC0755y2.getClass();
                }
            }
        }
        this.f10904e = arrayList;
        return z9;
    }

    public final void l() {
        boolean z8 = true;
        this.K = true;
        A(true);
        x();
        C0731A c0731a = this.f10921x;
        b0 b0Var = this.f10902c;
        if (c0731a != null) {
            z8 = ((W) b0Var.f10990g).f10936f;
        } else {
            AbstractActivityC0870i abstractActivityC0870i = c0731a.j;
            if (abstractActivityC0870i != null) {
                z8 = true ^ abstractActivityC0870i.isChangingConfigurations();
            }
        }
        if (z8) {
            Iterator it = this.f10909l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C0734c) it.next()).f10991d.iterator();
                while (it2.hasNext()) {
                    ((W) b0Var.f10990g).e((String) it2.next(), false);
                }
            }
        }
        u(-1);
        C0731A c0731a2 = this.f10921x;
        if (c0731a2 != null) {
            c0731a2.f10846m.f9344q.remove(this.f10916s);
        }
        C0731A c0731a3 = this.f10921x;
        if (c0731a3 != null) {
            c0731a3.f10846m.f9343p.remove(this.f10915r);
        }
        C0731A c0731a4 = this.f10921x;
        if (c0731a4 != null) {
            c0731a4.f10846m.f9346s.remove(this.f10917t);
        }
        C0731A c0731a5 = this.f10921x;
        if (c0731a5 != null) {
            c0731a5.f10846m.f9347t.remove(this.f10918u);
        }
        C0731A c0731a6 = this.f10921x;
        if (c0731a6 != null && this.f10923z == null) {
            A4.c cVar = c0731a6.f10846m.f9335f;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.f292f;
            I i4 = this.f10919v;
            copyOnWriteArrayList.remove(i4);
            if (((HashMap) cVar.f293g).remove(i4) == null) {
                ((Runnable) cVar.f291e).run();
            } else {
                throw new ClassCastException();
            }
        }
        this.f10921x = null;
        this.f10922y = null;
        this.f10923z = null;
        if (this.f10906g != null) {
            Iterator it3 = this.j.f10862b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0549c) it3.next()).cancel();
            }
            this.f10906g = null;
        }
        C0629e c0629e = this.f10887D;
        if (c0629e != null) {
            c0629e.b();
            this.f10888E.b();
            this.f10889F.b();
        }
    }

    public final void m(boolean z8) {
        if (z8 && this.f10921x != null) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y : this.f10902c.k()) {
            if (abstractComponentCallbacksC0755y != null) {
                abstractComponentCallbacksC0755y.f11093I = true;
                if (z8) {
                    abstractComponentCallbacksC0755y.f11130z.m(true);
                }
            }
        }
    }

    public final void n(boolean z8) {
        if (z8 && this.f10921x != null) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y : this.f10902c.k()) {
            if (abstractComponentCallbacksC0755y != null && z8) {
                abstractComponentCallbacksC0755y.f11130z.n(true);
            }
        }
    }

    public final void o() {
        Iterator it = this.f10902c.i().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = (AbstractComponentCallbacksC0755y) it.next();
            if (abstractComponentCallbacksC0755y != null) {
                abstractComponentCallbacksC0755y.r();
                abstractComponentCallbacksC0755y.f11130z.o();
            }
        }
    }

    public final boolean p() {
        boolean z8;
        if (this.f10920w >= 1) {
            for (AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y : this.f10902c.k()) {
                if (abstractComponentCallbacksC0755y != null) {
                    if (!abstractComponentCallbacksC0755y.f11089E) {
                        z8 = abstractComponentCallbacksC0755y.f11130z.p();
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f10920w >= 1) {
            for (AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y : this.f10902c.k()) {
                if (abstractComponentCallbacksC0755y != null && !abstractComponentCallbacksC0755y.f11089E) {
                    abstractComponentCallbacksC0755y.f11130z.q();
                }
            }
        }
    }

    public final void r(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        if (abstractComponentCallbacksC0755y != null) {
            if (abstractComponentCallbacksC0755y.equals(this.f10902c.e(abstractComponentCallbacksC0755y.f11114h))) {
                abstractComponentCallbacksC0755y.f11128x.getClass();
                boolean O8 = O(abstractComponentCallbacksC0755y);
                Boolean bool = abstractComponentCallbacksC0755y.f11117m;
                if (bool == null || bool.booleanValue() != O8) {
                    abstractComponentCallbacksC0755y.f11117m = Boolean.valueOf(O8);
                    T t8 = abstractComponentCallbacksC0755y.f11130z;
                    t8.h0();
                    t8.r(t8.f10884A);
                }
            }
        }
    }

    public final void s(boolean z8) {
        if (z8 && this.f10921x != null) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y : this.f10902c.k()) {
            if (abstractComponentCallbacksC0755y != null && z8) {
                abstractComponentCallbacksC0755y.f11130z.s(true);
            }
        }
    }

    public final boolean t() {
        boolean z8;
        if (this.f10920w < 1) {
            return false;
        }
        boolean z9 = false;
        for (AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y : this.f10902c.k()) {
            if (abstractComponentCallbacksC0755y != null && N(abstractComponentCallbacksC0755y)) {
                if (!abstractComponentCallbacksC0755y.f11089E) {
                    z8 = abstractComponentCallbacksC0755y.f11130z.t();
                } else {
                    z8 = false;
                }
                if (z8) {
                    z9 = true;
                }
            }
        }
        return z9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = this.f10923z;
        if (abstractComponentCallbacksC0755y != null) {
            sb.append(abstractComponentCallbacksC0755y.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f10923z)));
            sb.append("}");
        } else {
            C0731A c0731a = this.f10921x;
            if (c0731a != null) {
                sb.append(c0731a.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f10921x)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i4) {
        try {
            this.f10901b = true;
            for (a0 a0Var : ((HashMap) this.f10902c.f10988e).values()) {
                if (a0Var != null) {
                    a0Var.f10974e = i4;
                }
            }
            Q(i4, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0744m) it.next()).h();
            }
            this.f10901b = false;
            A(true);
        } catch (Throwable th) {
            this.f10901b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.f10894L) {
            this.f10894L = false;
            f0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        boolean z8;
        int i4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str2;
        String g8 = AbstractC1149a.g(str, "    ");
        b0 b0Var = this.f10902c;
        ArrayList arrayList = (ArrayList) b0Var.f10987d;
        String g9 = AbstractC1149a.g(str, "    ");
        HashMap hashMap = (HashMap) b0Var.f10988e;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (a0 a0Var : hashMap.values()) {
                printWriter.print(str);
                if (a0Var != null) {
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = a0Var.f10972c;
                    printWriter.println(abstractComponentCallbacksC0755y);
                    abstractComponentCallbacksC0755y.getClass();
                    printWriter.print(g9);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0755y.f11086B));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0755y.f11087C));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0755y.f11088D);
                    printWriter.print(g9);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0755y.f11110d);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0755y.f11114h);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0755y.f11127w);
                    printWriter.print(g9);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0755y.f11118n);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0755y.f11119o);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0755y.f11122r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0755y.f11123s);
                    printWriter.print(g9);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0755y.f11089E);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0755y.f11090F);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0755y.f11092H);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(g9);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0755y.f11091G);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0755y.f11096M);
                    if (abstractComponentCallbacksC0755y.f11128x != null) {
                        printWriter.print(g9);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0755y.f11128x);
                    }
                    if (abstractComponentCallbacksC0755y.f11129y != null) {
                        printWriter.print(g9);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0755y.f11129y);
                    }
                    if (abstractComponentCallbacksC0755y.f11085A != null) {
                        printWriter.print(g9);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0755y.f11085A);
                    }
                    if (abstractComponentCallbacksC0755y.f11115i != null) {
                        printWriter.print(g9);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0755y.f11115i);
                    }
                    if (abstractComponentCallbacksC0755y.f11111e != null) {
                        printWriter.print(g9);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0755y.f11111e);
                    }
                    if (abstractComponentCallbacksC0755y.f11112f != null) {
                        printWriter.print(g9);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0755y.f11112f);
                    }
                    if (abstractComponentCallbacksC0755y.f11113g != null) {
                        printWriter.print(g9);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0755y.f11113g);
                    }
                    Object obj = abstractComponentCallbacksC0755y.j;
                    if (obj == null) {
                        T t8 = abstractComponentCallbacksC0755y.f11128x;
                        if (t8 != null && (str2 = abstractComponentCallbacksC0755y.k) != null) {
                            obj = t8.f10902c.e(str2);
                        } else {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        printWriter.print(g9);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0755y.f11116l);
                    }
                    printWriter.print(g9);
                    printWriter.print("mPopDirection=");
                    C0753w c0753w = abstractComponentCallbacksC0755y.f11097N;
                    if (c0753w == null) {
                        z8 = false;
                    } else {
                        z8 = c0753w.f11075a;
                    }
                    printWriter.println(z8);
                    C0753w c0753w2 = abstractComponentCallbacksC0755y.f11097N;
                    if (c0753w2 == null) {
                        i4 = 0;
                    } else {
                        i4 = c0753w2.f11076b;
                    }
                    if (i4 != 0) {
                        printWriter.print(g9);
                        printWriter.print("getEnterAnim=");
                        C0753w c0753w3 = abstractComponentCallbacksC0755y.f11097N;
                        if (c0753w3 == null) {
                            i14 = 0;
                        } else {
                            i14 = c0753w3.f11076b;
                        }
                        printWriter.println(i14);
                    }
                    C0753w c0753w4 = abstractComponentCallbacksC0755y.f11097N;
                    if (c0753w4 == null) {
                        i8 = 0;
                    } else {
                        i8 = c0753w4.f11077c;
                    }
                    if (i8 != 0) {
                        printWriter.print(g9);
                        printWriter.print("getExitAnim=");
                        C0753w c0753w5 = abstractComponentCallbacksC0755y.f11097N;
                        if (c0753w5 == null) {
                            i13 = 0;
                        } else {
                            i13 = c0753w5.f11077c;
                        }
                        printWriter.println(i13);
                    }
                    C0753w c0753w6 = abstractComponentCallbacksC0755y.f11097N;
                    if (c0753w6 == null) {
                        i9 = 0;
                    } else {
                        i9 = c0753w6.f11078d;
                    }
                    if (i9 != 0) {
                        printWriter.print(g9);
                        printWriter.print("getPopEnterAnim=");
                        C0753w c0753w7 = abstractComponentCallbacksC0755y.f11097N;
                        if (c0753w7 == null) {
                            i12 = 0;
                        } else {
                            i12 = c0753w7.f11078d;
                        }
                        printWriter.println(i12);
                    }
                    C0753w c0753w8 = abstractComponentCallbacksC0755y.f11097N;
                    if (c0753w8 == null) {
                        i10 = 0;
                    } else {
                        i10 = c0753w8.f11079e;
                    }
                    if (i10 != 0) {
                        printWriter.print(g9);
                        printWriter.print("getPopExitAnim=");
                        C0753w c0753w9 = abstractComponentCallbacksC0755y.f11097N;
                        if (c0753w9 == null) {
                            i11 = 0;
                        } else {
                            i11 = c0753w9.f11079e;
                        }
                        printWriter.println(i11);
                    }
                    if (abstractComponentCallbacksC0755y.f11094J != null) {
                        printWriter.print(g9);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0755y.f11094J);
                    }
                    if (abstractComponentCallbacksC0755y.K != null) {
                        printWriter.print(g9);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0755y.K);
                    }
                    if (abstractComponentCallbacksC0755y.j() != null) {
                        androidx.lifecycle.e0 f8 = abstractComponentCallbacksC0755y.f();
                        V v8 = C1050a.f12376c;
                        o6.j.e(f8, "store");
                        C0946a c0946a = C0946a.f11950b;
                        o6.j.e(c0946a, "defaultCreationExtras");
                        b0 b0Var2 = new b0(f8, v8, c0946a);
                        InterfaceC1642c n3 = h2.a.n(C1050a.class);
                        String a3 = n3.a();
                        if (a3 != null) {
                            t.k kVar = ((C1050a) b0Var2.l("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(a3), n3)).f12377b;
                            if (kVar.e() > 0) {
                                printWriter.print(g9);
                                printWriter.println("Loaders:");
                                if (kVar.e() > 0) {
                                    if (kVar.f(0) == null) {
                                        printWriter.print(g9);
                                        printWriter.print("  #");
                                        printWriter.print(kVar.c(0));
                                        printWriter.print(": ");
                                        throw null;
                                    }
                                    throw new ClassCastException();
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                    }
                    printWriter.print(g9);
                    printWriter.println("Child " + abstractComponentCallbacksC0755y.f11130z + ":");
                    abstractComponentCallbacksC0755y.f11130z.w(AbstractC1149a.g(g9, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i15 = 0; i15 < size2; i15++) {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = (AbstractComponentCallbacksC0755y) arrayList.get(i15);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i15);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0755y2.toString());
            }
        }
        ArrayList arrayList2 = this.f10904e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i16 = 0; i16 < size; i16++) {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y3 = (AbstractComponentCallbacksC0755y) this.f10904e.get(i16);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i16);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0755y3.toString());
            }
        }
        int size3 = this.f10903d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i17 = 0; i17 < size3; i17++) {
                C0732a c0732a = (C0732a) this.f10903d.get(i17);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i17);
                printWriter.print(": ");
                printWriter.println(c0732a.toString());
                c0732a.h(g8, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.f10900a) {
            try {
                int size4 = this.f10900a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i18 = 0; i18 < size4; i18++) {
                        Object obj2 = (O) this.f10900a.get(i18);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i18);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f10921x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f10922y);
        if (this.f10923z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f10923z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f10920w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f10892I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f10893J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.f10891H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f10891H);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0744m) it.next()).h();
        }
    }

    public final void y(O o7, boolean z8) {
        if (!z8) {
            if (this.f10921x == null) {
                if (this.K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f10900a) {
            try {
                if (this.f10921x == null) {
                    if (z8) {
                    } else {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f10900a.add(o7);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z8) {
        if (!this.f10901b) {
            if (this.f10921x == null) {
                if (this.K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.f10921x.k.getLooper()) {
                if (!z8 && P()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.f10895M == null) {
                    this.f10895M = new ArrayList();
                    this.f10896N = new ArrayList();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }
}
