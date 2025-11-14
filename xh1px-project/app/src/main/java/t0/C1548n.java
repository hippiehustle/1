package t0;

import P.C0267o;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: t0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1548n extends Z {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f14898s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14899g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f14900h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f14901i;
    public ArrayList j;
    public ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f14902l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f14903m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f14904n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f14905o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f14906p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f14907q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f14908r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s0) arrayList.get(size)).f14950a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, t0.l] */
    @Override // t0.Z
    public final boolean a(s0 s0Var, s0 s0Var2, C0267o c0267o, C0267o c0267o2) {
        int i4;
        int i8;
        int i9 = c0267o.f4298a;
        int i10 = c0267o.f4299b;
        if (s0Var2.q()) {
            int i11 = c0267o.f4298a;
            i8 = c0267o.f4299b;
            i4 = i11;
        } else {
            i4 = c0267o2.f4298a;
            i8 = c0267o2.f4299b;
        }
        if (s0Var == s0Var2) {
            return g(s0Var, i9, i10, i4, i8);
        }
        View view = s0Var.f14950a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(s0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = s0Var2.f14950a;
        l(s0Var2);
        view2.setTranslationX(-((int) ((i4 - i9) - translationX)));
        view2.setTranslationY(-((int) ((i8 - i10) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        ?? obj = new Object();
        obj.f14879a = s0Var;
        obj.f14880b = s0Var2;
        obj.f14881c = i9;
        obj.f14882d = i10;
        obj.f14883e = i4;
        obj.f14884f = i8;
        arrayList.add(obj);
        return true;
    }

    @Override // t0.Z
    public final void d(s0 s0Var) {
        ArrayList arrayList = this.f14902l;
        ArrayList arrayList2 = this.f14903m;
        ArrayList arrayList3 = this.f14904n;
        View view = s0Var.f14950a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C1547m) arrayList4.get(size)).f14886a == s0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(s0Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, s0Var);
        if (this.f14900h.remove(s0Var)) {
            view.setAlpha(1.0f);
            c(s0Var);
        }
        if (this.f14901i.remove(s0Var)) {
            view.setAlpha(1.0f);
            c(s0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, s0Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C1547m) arrayList6.get(size4)).f14886a == s0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(s0Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(s0Var)) {
                view.setAlpha(1.0f);
                c(s0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f14907q.remove(s0Var);
        this.f14905o.remove(s0Var);
        this.f14908r.remove(s0Var);
        this.f14906p.remove(s0Var);
        i();
    }

    @Override // t0.Z
    public final void e() {
        ArrayList arrayList = this.f14904n;
        ArrayList arrayList2 = this.f14902l;
        ArrayList arrayList3 = this.f14903m;
        ArrayList arrayList4 = this.k;
        ArrayList arrayList5 = this.f14901i;
        ArrayList arrayList6 = this.f14900h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1547m c1547m = (C1547m) arrayList7.get(size);
            View view = c1547m.f14886a.f14950a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c1547m.f14886a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((s0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s0 s0Var = (s0) arrayList5.get(size3);
            s0Var.f14950a.setAlpha(1.0f);
            c(s0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C1546l c1546l = (C1546l) arrayList4.get(size4);
            s0 s0Var2 = c1546l.f14879a;
            if (s0Var2 != null) {
                k(c1546l, s0Var2);
            }
            s0 s0Var3 = c1546l.f14880b;
            if (s0Var3 != null) {
                k(c1546l, s0Var3);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
            for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                C1547m c1547m2 = (C1547m) arrayList8.get(size6);
                View view2 = c1547m2.f14886a.f14950a;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                c(c1547m2.f14886a);
                arrayList8.remove(size6);
                if (arrayList8.isEmpty()) {
                    arrayList3.remove(arrayList8);
                }
            }
        }
        for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
            for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                s0 s0Var4 = (s0) arrayList9.get(size8);
                s0Var4.f14950a.setAlpha(1.0f);
                c(s0Var4);
                arrayList9.remove(size8);
                if (arrayList9.isEmpty()) {
                    arrayList2.remove(arrayList9);
                }
            }
        }
        for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                C1546l c1546l2 = (C1546l) arrayList10.get(size10);
                s0 s0Var5 = c1546l2.f14879a;
                if (s0Var5 != null) {
                    k(c1546l2, s0Var5);
                }
                s0 s0Var6 = c1546l2.f14880b;
                if (s0Var6 != null) {
                    k(c1546l2, s0Var6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList.remove(arrayList10);
                }
            }
        }
        h(this.f14907q);
        h(this.f14906p);
        h(this.f14905o);
        h(this.f14908r);
        ArrayList arrayList11 = this.f14792b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            arrayList11.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // t0.Z
    public final boolean f() {
        if (this.f14901i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.f14900h.isEmpty() && this.f14906p.isEmpty() && this.f14907q.isEmpty() && this.f14905o.isEmpty() && this.f14908r.isEmpty() && this.f14903m.isEmpty() && this.f14902l.isEmpty() && this.f14904n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, t0.m] */
    public final boolean g(s0 s0Var, int i4, int i8, int i9, int i10) {
        View view = s0Var.f14950a;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i8 + ((int) s0Var.f14950a.getTranslationY());
        l(s0Var);
        int i11 = i9 - translationX;
        int i12 = i10 - translationY;
        if (i11 == 0 && i12 == 0) {
            c(s0Var);
            return false;
        }
        if (i11 != 0) {
            view.setTranslationX(-i11);
        }
        if (i12 != 0) {
            view.setTranslationY(-i12);
        }
        ArrayList arrayList = this.j;
        ?? obj = new Object();
        obj.f14886a = s0Var;
        obj.f14887b = translationX;
        obj.f14888c = translationY;
        obj.f14889d = i9;
        obj.f14890e = i10;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f14792b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void j(ArrayList arrayList, s0 s0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1546l c1546l = (C1546l) arrayList.get(size);
            if (k(c1546l, s0Var) && c1546l.f14879a == null && c1546l.f14880b == null) {
                arrayList.remove(c1546l);
            }
        }
    }

    public final boolean k(C1546l c1546l, s0 s0Var) {
        if (c1546l.f14880b == s0Var) {
            c1546l.f14880b = null;
        } else if (c1546l.f14879a == s0Var) {
            c1546l.f14879a = null;
        } else {
            return false;
        }
        View view = s0Var.f14950a;
        View view2 = s0Var.f14950a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(s0Var);
        return true;
    }

    public final void l(s0 s0Var) {
        if (f14898s == null) {
            f14898s = new ValueAnimator().getInterpolator();
        }
        s0Var.f14950a.animate().setInterpolator(f14898s);
        d(s0Var);
    }
}
