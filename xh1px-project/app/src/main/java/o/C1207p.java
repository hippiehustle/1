package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h.AbstractC0805a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import n0.AbstractC1143u;
import t0.C1532a;

/* renamed from: o.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1207p {

    /* renamed from: a, reason: collision with root package name */
    public int f13342a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13343b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13344c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13345d;

    /* renamed from: e, reason: collision with root package name */
    public Object f13346e;

    /* renamed from: f, reason: collision with root package name */
    public Object f13347f;

    public C1207p(AbstractC1143u abstractC1143u) {
        this.f13343b = abstractC1143u;
        this.f13345d = new ArrayList();
        this.f13346e = new LinkedHashMap();
    }

    public void a() {
        View view = (View) this.f13343b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((c1) this.f13345d) != null) {
                if (((c1) this.f13347f) == null) {
                    this.f13347f = new Object();
                }
                c1 c1Var = (c1) this.f13347f;
                c1Var.f13235a = null;
                c1Var.f13238d = false;
                c1Var.f13236b = null;
                c1Var.f13237c = false;
                WeakHashMap weakHashMap = P.O.f4214a;
                ColorStateList c6 = P.F.c(view);
                if (c6 != null) {
                    c1Var.f13238d = true;
                    c1Var.f13235a = c6;
                }
                PorterDuff.Mode d2 = P.F.d(view);
                if (d2 != null) {
                    c1Var.f13237c = true;
                    c1Var.f13236b = d2;
                }
                if (c1Var.f13238d || c1Var.f13237c) {
                    C1216u.e(background, c1Var, view.getDrawableState());
                    return;
                }
            }
            c1 c1Var2 = (c1) this.f13346e;
            if (c1Var2 != null) {
                C1216u.e(background, c1Var2, view.getDrawableState());
                return;
            }
            c1 c1Var3 = (c1) this.f13345d;
            if (c1Var3 != null) {
                C1216u.e(background, c1Var3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i4) {
        ArrayList arrayList = (ArrayList) this.f13345d;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1532a c1532a = (C1532a) arrayList.get(i8);
            int i9 = c1532a.f14797a;
            if (i9 == 8) {
                if (g(c1532a.f14799c, i8 + 1) == i4) {
                    return true;
                }
            } else {
                if (i9 == 1) {
                    int i10 = c1532a.f14798b;
                    int i11 = c1532a.f14799c + i10;
                    while (i10 < i11) {
                        if (g(i10, i8 + 1) == i4) {
                            return true;
                        }
                        i10++;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f13345d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((t0.T) this.f13346e).a((C1532a) arrayList.get(i4));
        }
        q(arrayList);
        this.f13342a = 0;
    }

    public void d() {
        t0.T t8 = (t0.T) this.f13346e;
        c();
        ArrayList arrayList = (ArrayList) this.f13344c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1532a c1532a = (C1532a) arrayList.get(i4);
            int i8 = c1532a.f14797a;
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 4) {
                        if (i8 == 8) {
                            t8.a(c1532a);
                            t8.g(c1532a.f14798b, c1532a.f14799c);
                        }
                    } else {
                        t8.a(c1532a);
                        t8.c(c1532a.f14798b, c1532a.f14799c);
                    }
                } else {
                    t8.a(c1532a);
                    int i9 = c1532a.f14798b;
                    int i10 = c1532a.f14799c;
                    RecyclerView recyclerView = t8.f14787d;
                    recyclerView.U(i9, i10, true);
                    recyclerView.f8957n0 = true;
                    recyclerView.f8951k0.f14914c += i10;
                }
            } else {
                t8.a(c1532a);
                t8.e(c1532a.f14798b, c1532a.f14799c);
            }
        }
        q(arrayList);
        this.f13342a = 0;
    }

    public void e(C1532a c1532a) {
        int i4;
        O.c cVar = (O.c) this.f13343b;
        int i8 = c1532a.f14797a;
        if (i8 != 1 && i8 != 8) {
            int u8 = u(c1532a.f14798b, i8);
            int i9 = c1532a.f14798b;
            int i10 = c1532a.f14797a;
            if (i10 != 2) {
                if (i10 == 4) {
                    i4 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + c1532a);
                }
            } else {
                i4 = 0;
            }
            int i11 = 1;
            for (int i12 = 1; i12 < c1532a.f14799c; i12++) {
                int u9 = u((i4 * i12) + c1532a.f14798b, c1532a.f14797a);
                int i13 = c1532a.f14797a;
                if (i13 == 2 ? u9 == u8 : !(i13 != 4 || u9 != u8 + 1)) {
                    i11++;
                } else {
                    C1532a l6 = l(i13, u8, i11);
                    f(l6, i9);
                    cVar.c(l6);
                    if (c1532a.f14797a == 4) {
                        i9 += i11;
                    }
                    i11 = 1;
                    u8 = u9;
                }
            }
            cVar.c(c1532a);
            if (i11 > 0) {
                C1532a l8 = l(c1532a.f14797a, u8, i11);
                f(l8, i9);
                cVar.c(l8);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void f(C1532a c1532a, int i4) {
        t0.T t8 = (t0.T) this.f13346e;
        t8.a(c1532a);
        int i8 = c1532a.f14797a;
        if (i8 != 2) {
            if (i8 == 4) {
                t8.c(i4, c1532a.f14799c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i9 = c1532a.f14799c;
        RecyclerView recyclerView = t8.f14787d;
        recyclerView.U(i4, i9, true);
        recyclerView.f8957n0 = true;
        recyclerView.f8951k0.f14914c += i9;
    }

    public int g(int i4, int i8) {
        ArrayList arrayList = (ArrayList) this.f13345d;
        int size = arrayList.size();
        while (i8 < size) {
            C1532a c1532a = (C1532a) arrayList.get(i8);
            int i9 = c1532a.f14797a;
            if (i9 == 8) {
                int i10 = c1532a.f14798b;
                if (i10 == i4) {
                    i4 = c1532a.f14799c;
                } else {
                    if (i10 < i4) {
                        i4--;
                    }
                    if (c1532a.f14799c <= i4) {
                        i4++;
                    }
                }
            } else {
                int i11 = c1532a.f14798b;
                if (i11 > i4) {
                    continue;
                } else if (i9 == 2) {
                    int i12 = c1532a.f14799c;
                    if (i4 < i11 + i12) {
                        return -1;
                    }
                    i4 -= i12;
                } else if (i9 == 1) {
                    i4 += c1532a.f14799c;
                }
            }
            i8++;
        }
        return i4;
    }

    public ColorStateList h() {
        c1 c1Var = (c1) this.f13346e;
        if (c1Var != null) {
            return c1Var.f13235a;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        c1 c1Var = (c1) this.f13346e;
        if (c1Var != null) {
            return c1Var.f13236b;
        }
        return null;
    }

    public boolean j() {
        if (((ArrayList) this.f13344c).size() > 0) {
            return true;
        }
        return false;
    }

    public void k(AttributeSet attributeSet, int i4) {
        ColorStateList f8;
        View view = (View) this.f13343b;
        Context context = view.getContext();
        int[] iArr = AbstractC0805a.f11273A;
        R.g J6 = R.g.J(context, attributeSet, iArr, i4);
        TypedArray typedArray = (TypedArray) J6.f4988f;
        View view2 = (View) this.f13343b;
        P.O.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) J6.f4988f, i4);
        try {
            if (typedArray.hasValue(0)) {
                this.f13342a = typedArray.getResourceId(0, -1);
                C1216u c1216u = (C1216u) this.f13344c;
                Context context2 = view.getContext();
                int i8 = this.f13342a;
                synchronized (c1216u) {
                    f8 = c1216u.f13390a.f(context2, i8);
                }
                if (f8 != null) {
                    r(f8);
                }
            }
            if (typedArray.hasValue(1)) {
                P.F.i(view, J6.z(1));
            }
            if (typedArray.hasValue(2)) {
                P.F.j(view, AbstractC1202m0.c(typedArray.getInt(2, -1), null));
            }
            J6.L();
        } catch (Throwable th) {
            J6.L();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, t0.a] */
    public C1532a l(int i4, int i8, int i9) {
        C1532a c1532a = (C1532a) ((O.c) this.f13343b).a();
        if (c1532a == null) {
            ?? obj = new Object();
            obj.f14797a = i4;
            obj.f14798b = i8;
            obj.f14799c = i9;
            return obj;
        }
        c1532a.f14797a = i4;
        c1532a.f14798b = i8;
        c1532a.f14799c = i9;
        return c1532a;
    }

    public void m() {
        this.f13342a = -1;
        r(null);
        a();
    }

    public void n(int i4) {
        ColorStateList colorStateList;
        this.f13342a = i4;
        C1216u c1216u = (C1216u) this.f13344c;
        if (c1216u != null) {
            Context context = ((View) this.f13343b).getContext();
            synchronized (c1216u) {
                colorStateList = c1216u.f13390a.f(context, i4);
            }
        } else {
            colorStateList = null;
        }
        r(colorStateList);
        a();
    }

    public void o(C1532a c1532a) {
        t0.T t8 = (t0.T) this.f13346e;
        ((ArrayList) this.f13345d).add(c1532a);
        int i4 = c1532a.f14797a;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    if (i4 == 8) {
                        t8.g(c1532a.f14798b, c1532a.f14799c);
                        return;
                    } else {
                        throw new IllegalArgumentException("Unknown update op type for " + c1532a);
                    }
                }
                t8.c(c1532a.f14798b, c1532a.f14799c);
                return;
            }
            int i8 = c1532a.f14798b;
            int i9 = c1532a.f14799c;
            RecyclerView recyclerView = t8.f14787d;
            recyclerView.U(i8, i9, false);
            recyclerView.f8957n0 = true;
            return;
        }
        t8.e(c1532a.f14798b, c1532a.f14799c);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p() {
        int i4;
        boolean z8;
        boolean z9;
        C1532a l6;
        int i8;
        int i9;
        C1532a l8;
        boolean z10;
        boolean z11;
        C1532a l9;
        int i10;
        O.c cVar = (O.c) this.f13343b;
        t0.T t8 = (t0.T) this.f13346e;
        g0.L l10 = (g0.L) this.f13347f;
        ArrayList arrayList = (ArrayList) this.f13344c;
        l10.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z12 = false;
            while (true) {
                i4 = 8;
                if (size >= 0) {
                    if (((C1532a) arrayList.get(size)).f14797a == 8) {
                        if (z12) {
                            break;
                        }
                    } else {
                        z12 = true;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (size == -1) {
                break;
            }
            int i11 = size + 1;
            C1207p c1207p = (C1207p) l10.f10871e;
            C1532a c1532a = (C1532a) arrayList.get(size);
            C1532a c1532a2 = (C1532a) arrayList.get(i11);
            int i12 = c1532a2.f14797a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 4) {
                        int i13 = c1532a.f14799c;
                        int i14 = c1532a2.f14798b;
                        if (i13 < i14) {
                            c1532a2.f14798b = i14 - 1;
                        } else {
                            int i15 = c1532a2.f14799c;
                            if (i13 < i14 + i15) {
                                c1532a2.f14799c = i15 - 1;
                                l6 = c1207p.l(4, c1532a.f14798b, 1);
                                i8 = c1532a.f14798b;
                                i9 = c1532a2.f14798b;
                                if (i8 > i9) {
                                    c1532a2.f14798b = i9 + 1;
                                } else {
                                    int i16 = i9 + c1532a2.f14799c;
                                    if (i8 < i16) {
                                        int i17 = i16 - i8;
                                        l8 = c1207p.l(4, i8 + 1, i17);
                                        c1532a2.f14799c -= i17;
                                        arrayList.set(i11, c1532a);
                                        if (c1532a2.f14799c > 0) {
                                            arrayList.set(size, c1532a2);
                                        } else {
                                            arrayList.remove(size);
                                            ((O.c) c1207p.f13343b).c(c1532a2);
                                        }
                                        if (l6 != null) {
                                            arrayList.add(size, l6);
                                        }
                                        if (l8 != null) {
                                            arrayList.add(size, l8);
                                        }
                                    }
                                }
                                l8 = null;
                                arrayList.set(i11, c1532a);
                                if (c1532a2.f14799c > 0) {
                                }
                                if (l6 != null) {
                                }
                                if (l8 != null) {
                                }
                            }
                        }
                        l6 = null;
                        i8 = c1532a.f14798b;
                        i9 = c1532a2.f14798b;
                        if (i8 > i9) {
                        }
                        l8 = null;
                        arrayList.set(i11, c1532a);
                        if (c1532a2.f14799c > 0) {
                        }
                        if (l6 != null) {
                        }
                        if (l8 != null) {
                        }
                    }
                } else {
                    int i18 = c1532a.f14798b;
                    int i19 = c1532a.f14799c;
                    if (i18 < i19) {
                        if (c1532a2.f14798b == i18 && c1532a2.f14799c == i19 - i18) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z10 = false;
                    } else if (c1532a2.f14798b == i19 + 1 && c1532a2.f14799c == i18 - i19) {
                        z11 = true;
                        z10 = true;
                    } else {
                        z10 = true;
                        z11 = false;
                    }
                    int i20 = c1532a2.f14798b;
                    if (i19 < i20) {
                        c1532a2.f14798b = i20 - 1;
                    } else {
                        int i21 = c1532a2.f14799c;
                        if (i19 < i20 + i21) {
                            c1532a2.f14799c = i21 - 1;
                            c1532a.f14797a = 2;
                            c1532a.f14799c = 1;
                            if (c1532a2.f14799c == 0) {
                                arrayList.remove(i11);
                                ((O.c) c1207p.f13343b).c(c1532a2);
                            }
                        }
                    }
                    int i22 = c1532a.f14798b;
                    int i23 = c1532a2.f14798b;
                    if (i22 <= i23) {
                        c1532a2.f14798b = i23 + 1;
                    } else {
                        int i24 = i23 + c1532a2.f14799c;
                        if (i22 < i24) {
                            l9 = c1207p.l(2, i22 + 1, i24 - i22);
                            c1532a2.f14799c = c1532a.f14798b - c1532a2.f14798b;
                            if (!z11) {
                                arrayList.set(size, c1532a2);
                                arrayList.remove(i11);
                                ((O.c) c1207p.f13343b).c(c1532a);
                            } else {
                                if (z10) {
                                    if (l9 != null) {
                                        int i25 = c1532a.f14798b;
                                        if (i25 > l9.f14798b) {
                                            c1532a.f14798b = i25 - l9.f14799c;
                                        }
                                        int i26 = c1532a.f14799c;
                                        if (i26 > l9.f14798b) {
                                            c1532a.f14799c = i26 - l9.f14799c;
                                        }
                                    }
                                    int i27 = c1532a.f14798b;
                                    if (i27 > c1532a2.f14798b) {
                                        c1532a.f14798b = i27 - c1532a2.f14799c;
                                    }
                                    int i28 = c1532a.f14799c;
                                    if (i28 > c1532a2.f14798b) {
                                        c1532a.f14799c = i28 - c1532a2.f14799c;
                                    }
                                } else {
                                    if (l9 != null) {
                                        int i29 = c1532a.f14798b;
                                        if (i29 >= l9.f14798b) {
                                            c1532a.f14798b = i29 - l9.f14799c;
                                        }
                                        int i30 = c1532a.f14799c;
                                        if (i30 >= l9.f14798b) {
                                            c1532a.f14799c = i30 - l9.f14799c;
                                        }
                                    }
                                    int i31 = c1532a.f14798b;
                                    if (i31 >= c1532a2.f14798b) {
                                        c1532a.f14798b = i31 - c1532a2.f14799c;
                                    }
                                    int i32 = c1532a.f14799c;
                                    if (i32 >= c1532a2.f14798b) {
                                        c1532a.f14799c = i32 - c1532a2.f14799c;
                                    }
                                }
                                arrayList.set(size, c1532a2);
                                if (c1532a.f14798b != c1532a.f14799c) {
                                    arrayList.set(i11, c1532a);
                                } else {
                                    arrayList.remove(i11);
                                }
                                if (l9 != null) {
                                    arrayList.add(size, l9);
                                }
                            }
                        }
                    }
                    l9 = null;
                    if (!z11) {
                    }
                }
            } else {
                int i33 = c1532a.f14799c;
                int i34 = c1532a2.f14798b;
                if (i33 < i34) {
                    i10 = -1;
                } else {
                    i10 = 0;
                }
                int i35 = c1532a.f14798b;
                if (i35 < i34) {
                    i10++;
                }
                if (i34 <= i35) {
                    c1532a.f14798b = i35 + c1532a2.f14799c;
                }
                int i36 = c1532a2.f14798b;
                if (i36 <= i33) {
                    c1532a.f14799c = i33 + c1532a2.f14799c;
                }
                c1532a2.f14798b = i36 + i10;
                arrayList.set(size, c1532a2);
                arrayList.set(i11, c1532a);
            }
        }
        int size2 = arrayList.size();
        int i37 = 0;
        while (i37 < size2) {
            C1532a c1532a3 = (C1532a) arrayList.get(i37);
            int i38 = c1532a3.f14797a;
            if (i38 != 1) {
                if (i38 != 2) {
                    if (i38 != 4) {
                        if (i38 == i4) {
                            o(c1532a3);
                        }
                    } else {
                        int i39 = c1532a3.f14798b;
                        int i40 = c1532a3.f14799c + i39;
                        boolean z13 = -1;
                        int i41 = i39;
                        int i42 = 0;
                        while (i39 < i40) {
                            if (t8.b(i39) == null && !b(i39)) {
                                if (z13) {
                                    o(l(4, i41, i42));
                                    i41 = i39;
                                    i42 = 0;
                                }
                                z13 = false;
                            } else {
                                if (!z13) {
                                    e(l(4, i41, i42));
                                    i41 = i39;
                                    i42 = 0;
                                }
                                z13 = true;
                            }
                            i42++;
                            i39++;
                        }
                        if (i42 != c1532a3.f14799c) {
                            cVar.c(c1532a3);
                            c1532a3 = l(4, i41, i42);
                        }
                        if (!z13) {
                            e(c1532a3);
                        } else {
                            o(c1532a3);
                        }
                    }
                } else {
                    int i43 = c1532a3.f14798b;
                    int i44 = c1532a3.f14799c + i43;
                    int i45 = i43;
                    boolean z14 = -1;
                    int i46 = 0;
                    while (i45 < i44) {
                        if (t8.b(i45) == null && !b(i45)) {
                            if (z14) {
                                o(l(2, i43, i46));
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            z9 = false;
                        } else {
                            if (!z14) {
                                e(l(2, i43, i46));
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            z9 = true;
                        }
                        if (z8) {
                            i45 -= i46;
                            i44 -= i46;
                            i46 = 1;
                        } else {
                            i46++;
                        }
                        i45++;
                        z14 = z9;
                    }
                    if (i46 != c1532a3.f14799c) {
                        cVar.c(c1532a3);
                        c1532a3 = l(2, i43, i46);
                    }
                    if (!z14) {
                        e(c1532a3);
                    } else {
                        o(c1532a3);
                    }
                }
            } else {
                o(c1532a3);
            }
            i37++;
            i4 = 8;
        }
        arrayList.clear();
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1532a c1532a = (C1532a) arrayList.get(i4);
            c1532a.getClass();
            ((O.c) this.f13343b).c(c1532a);
        }
        arrayList.clear();
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((c1) this.f13345d) == null) {
                this.f13345d = new Object();
            }
            c1 c1Var = (c1) this.f13345d;
            c1Var.f13235a = colorStateList;
            c1Var.f13238d = true;
        } else {
            this.f13345d = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((c1) this.f13346e) == null) {
            this.f13346e = new Object();
        }
        c1 c1Var = (c1) this.f13346e;
        c1Var.f13235a = colorStateList;
        c1Var.f13238d = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((c1) this.f13346e) == null) {
            this.f13346e = new Object();
        }
        c1 c1Var = (c1) this.f13346e;
        c1Var.f13236b = mode;
        c1Var.f13237c = true;
        a();
    }

    public int u(int i4, int i8) {
        int i9;
        int i10;
        O.c cVar = (O.c) this.f13343b;
        ArrayList arrayList = (ArrayList) this.f13345d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1532a c1532a = (C1532a) arrayList.get(size);
            int i11 = c1532a.f14797a;
            if (i11 == 8) {
                int i12 = c1532a.f14798b;
                int i13 = c1532a.f14799c;
                if (i12 < i13) {
                    i10 = i12;
                    i9 = i13;
                } else {
                    i9 = i12;
                    i10 = i13;
                }
                if (i4 >= i10 && i4 <= i9) {
                    if (i10 == i12) {
                        if (i8 == 1) {
                            c1532a.f14799c = i13 + 1;
                        } else if (i8 == 2) {
                            c1532a.f14799c = i13 - 1;
                        }
                        i4++;
                    } else {
                        if (i8 == 1) {
                            c1532a.f14798b = i12 + 1;
                        } else if (i8 == 2) {
                            c1532a.f14798b = i12 - 1;
                        }
                        i4--;
                    }
                } else if (i4 < i12) {
                    if (i8 == 1) {
                        c1532a.f14798b = i12 + 1;
                        c1532a.f14799c = i13 + 1;
                    } else if (i8 == 2) {
                        c1532a.f14798b = i12 - 1;
                        c1532a.f14799c = i13 - 1;
                    }
                }
            } else {
                int i14 = c1532a.f14798b;
                if (i14 <= i4) {
                    if (i11 == 1) {
                        i4 -= c1532a.f14799c;
                    } else if (i11 == 2) {
                        i4 += c1532a.f14799c;
                    }
                } else if (i8 == 1) {
                    c1532a.f14798b = i14 + 1;
                } else if (i8 == 2) {
                    c1532a.f14798b = i14 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C1532a c1532a2 = (C1532a) arrayList.get(size2);
            if (c1532a2.f14797a == 8) {
                int i15 = c1532a2.f14799c;
                if (i15 == c1532a2.f14798b || i15 < 0) {
                    arrayList.remove(size2);
                    cVar.c(c1532a2);
                }
            } else if (c1532a2.f14799c <= 0) {
                arrayList.remove(size2);
                cVar.c(c1532a2);
            }
        }
        return i4;
    }

    public C1207p(View view) {
        this.f13342a = -1;
        this.f13343b = view;
        this.f13344c = C1216u.a();
    }

    public C1207p(t0.T t8) {
        this.f13343b = new O.c(30);
        this.f13344c = new ArrayList();
        this.f13345d = new ArrayList();
        this.f13342a = 0;
        this.f13346e = t8;
        this.f13347f = new g0.L(19, this);
    }
}
