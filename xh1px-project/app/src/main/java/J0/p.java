package J0;

import P.O;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class p implements Cloneable {

    /* renamed from: B, reason: collision with root package name */
    public static final Animator[] f2308B = new Animator[0];

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2309C = {2, 1, 3, 4};

    /* renamed from: D, reason: collision with root package name */
    public static final G5.e f2310D = new G5.e(4);

    /* renamed from: E, reason: collision with root package name */
    public static final ThreadLocal f2311E = new ThreadLocal();

    /* renamed from: A, reason: collision with root package name */
    public long f2312A;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2321n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2322o;

    /* renamed from: p, reason: collision with root package name */
    public n[] f2323p;

    /* renamed from: z, reason: collision with root package name */
    public long f2333z;

    /* renamed from: d, reason: collision with root package name */
    public final String f2313d = getClass().getName();

    /* renamed from: e, reason: collision with root package name */
    public long f2314e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f2315f = -1;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f2316g = null;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2317h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2318i = new ArrayList();
    public A4.a j = new A4.a(18);
    public A4.a k = new A4.a(18);

    /* renamed from: l, reason: collision with root package name */
    public C0067a f2319l = null;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f2320m = f2309C;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2324q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public Animator[] f2325r = f2308B;

    /* renamed from: s, reason: collision with root package name */
    public int f2326s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2327t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2328u = false;

    /* renamed from: v, reason: collision with root package name */
    public p f2329v = null;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f2330w = null;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f2331x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public G5.e f2332y = f2310D;

    public static void b(A4.a aVar, View view, x xVar) {
        t.e eVar = (t.e) aVar.f280e;
        t.e eVar2 = (t.e) aVar.f283h;
        SparseArray sparseArray = (SparseArray) aVar.f281f;
        t.g gVar = (t.g) aVar.f282g;
        eVar.put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = O.f4214a;
        String f8 = P.F.f(view);
        if (f8 != null) {
            if (eVar2.containsKey(f8)) {
                eVar2.put(f8, null);
            } else {
                eVar2.put(f8, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (gVar.d(itemIdAtPosition) >= 0) {
                    View view2 = (View) gVar.c(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        gVar.g(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                gVar.g(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [t.j, java.lang.Object, t.e] */
    public static t.e p() {
        ThreadLocal threadLocal = f2311E;
        t.e eVar = (t.e) threadLocal.get();
        if (eVar == null) {
            ?? jVar = new t.j(0);
            threadLocal.set(jVar);
            return jVar;
        }
        return eVar;
    }

    public static boolean v(x xVar, x xVar2, String str) {
        Object obj = xVar.f2344a.get(str);
        Object obj2 = xVar2.f2344a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        if (this.f2327t) {
            if (!this.f2328u) {
                ArrayList arrayList = this.f2324q;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2325r);
                this.f2325r = f2308B;
                for (int i4 = size - 1; i4 >= 0; i4--) {
                    Animator animator = animatorArr[i4];
                    animatorArr[i4] = null;
                    animator.resume();
                }
                this.f2325r = animatorArr;
                w(this, o.f2306f, false);
            }
            this.f2327t = false;
        }
    }

    public void B() {
        J();
        t.e p8 = p();
        Iterator it = this.f2331x.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p8.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new C0075i(this, p8));
                    long j = this.f2315f;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j5 = this.f2314e;
                    if (j5 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j5);
                    }
                    TimeInterpolator timeInterpolator = this.f2316g;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new H5.e(2, this));
                    animator.start();
                }
            }
        }
        this.f2331x.clear();
        m();
    }

    public void C(long j, long j5) {
        boolean z8;
        long j8 = this.f2333z;
        int i4 = 0;
        if (j < j5) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((j5 < 0 && j >= 0) || (j5 > j8 && j <= j8)) {
            this.f2328u = false;
            w(this, o.f2302b, z8);
        }
        ArrayList arrayList = this.f2324q;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2325r);
        this.f2325r = f2308B;
        while (i4 < size) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            k.b(animator, Math.min(Math.max(0L, j), k.a(animator)));
            i4++;
            j8 = j8;
        }
        long j9 = j8;
        this.f2325r = animatorArr;
        if ((j > j9 && j5 <= j9) || (j < 0 && j5 >= 0)) {
            if (j > j9) {
                this.f2328u = true;
            }
            w(this, o.f2303c, z8);
        }
    }

    public void D(long j) {
        this.f2315f = j;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.f2316g = timeInterpolator;
    }

    public void G(G5.e eVar) {
        if (eVar == null) {
            this.f2332y = f2310D;
        } else {
            this.f2332y = eVar;
        }
    }

    public void I(long j) {
        this.f2314e = j;
    }

    public final void J() {
        if (this.f2326s == 0) {
            w(this, o.f2302b, false);
            this.f2328u = false;
        }
        this.f2326s++;
    }

    public String K(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f2315f != -1) {
            sb.append("dur(");
            sb.append(this.f2315f);
            sb.append(") ");
        }
        if (this.f2314e != -1) {
            sb.append("dly(");
            sb.append(this.f2314e);
            sb.append(") ");
        }
        if (this.f2316g != null) {
            sb.append("interp(");
            sb.append(this.f2316g);
            sb.append(") ");
        }
        ArrayList arrayList = this.f2317h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2318i;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i4));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i8));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(n nVar) {
        if (this.f2330w == null) {
            this.f2330w = new ArrayList();
        }
        this.f2330w.add(nVar);
    }

    public void c() {
        ArrayList arrayList = this.f2324q;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2325r);
        this.f2325r = f2308B;
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            animator.cancel();
        }
        this.f2325r = animatorArr;
        w(this, o.f2304d, false);
    }

    public abstract void d(x xVar);

    public final void e(View view, boolean z8) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                x xVar = new x(view);
                if (z8) {
                    g(xVar);
                } else {
                    d(xVar);
                }
                xVar.f2346c.add(this);
                f(xVar);
                if (z8) {
                    b(this.j, view, xVar);
                } else {
                    b(this.k, view, xVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    e(viewGroup.getChildAt(i4), z8);
                }
            }
        }
    }

    public abstract void g(x xVar);

    public final void h(ViewGroup viewGroup, boolean z8) {
        i(z8);
        ArrayList arrayList = this.f2317h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2318i;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z8);
            return;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i4)).intValue());
            if (findViewById != null) {
                x xVar = new x(findViewById);
                if (z8) {
                    g(xVar);
                } else {
                    d(xVar);
                }
                xVar.f2346c.add(this);
                f(xVar);
                if (z8) {
                    b(this.j, findViewById, xVar);
                } else {
                    b(this.k, findViewById, xVar);
                }
            }
        }
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            View view = (View) arrayList2.get(i8);
            x xVar2 = new x(view);
            if (z8) {
                g(xVar2);
            } else {
                d(xVar2);
            }
            xVar2.f2346c.add(this);
            f(xVar2);
            if (z8) {
                b(this.j, view, xVar2);
            } else {
                b(this.k, view, xVar2);
            }
        }
    }

    public final void i(boolean z8) {
        if (z8) {
            ((t.e) this.j.f280e).clear();
            ((SparseArray) this.j.f281f).clear();
            ((t.g) this.j.f282g).a();
        } else {
            ((t.e) this.k.f280e).clear();
            ((SparseArray) this.k.f281f).clear();
            ((t.g) this.k.f282g).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public p clone() {
        try {
            p pVar = (p) super.clone();
            pVar.f2331x = new ArrayList();
            pVar.j = new A4.a(18);
            pVar.k = new A4.a(18);
            pVar.f2321n = null;
            pVar.f2322o = null;
            pVar.f2329v = this;
            pVar.f2330w = null;
            return pVar;
        } catch (CloneNotSupportedException e9) {
            throw new RuntimeException(e9);
        }
    }

    public Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [J0.j, java.lang.Object] */
    public void l(ViewGroup viewGroup, A4.a aVar, A4.a aVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i4;
        int i8;
        View view;
        x xVar;
        Animator animator;
        x xVar2;
        t.e p8 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i9 = 0;
        while (i9 < size) {
            x xVar3 = (x) arrayList.get(i9);
            x xVar4 = (x) arrayList2.get(i9);
            if (xVar3 != null && !xVar3.f2346c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.f2346c.contains(this)) {
                xVar4 = null;
            }
            if ((xVar3 != null || xVar4 != null) && (xVar3 == null || xVar4 == null || t(xVar3, xVar4))) {
                Animator k = k(viewGroup, xVar3, xVar4);
                if (k != null) {
                    String str = this.f2313d;
                    if (xVar4 != null) {
                        view = xVar4.f2345b;
                        String[] q6 = q();
                        if (q6 != null && q6.length > 0) {
                            xVar2 = new x(view);
                            x xVar5 = (x) ((t.e) aVar2.f280e).get(view);
                            i4 = size;
                            if (xVar5 != null) {
                                int i10 = 0;
                                while (i10 < q6.length) {
                                    String str2 = q6[i10];
                                    xVar2.f2344a.put(str2, xVar5.f2344a.get(str2));
                                    i10++;
                                    i9 = i9;
                                    xVar5 = xVar5;
                                }
                            }
                            i8 = i9;
                            int i11 = p8.f14670f;
                            int i12 = 0;
                            while (true) {
                                if (i12 < i11) {
                                    j jVar = (j) p8.get((Animator) p8.f(i12));
                                    if (jVar.f2297c != null && jVar.f2295a == view && jVar.f2296b.equals(str) && jVar.f2297c.equals(xVar2)) {
                                        animator = null;
                                        break;
                                    }
                                    i12++;
                                } else {
                                    animator = k;
                                    break;
                                }
                            }
                        } else {
                            i4 = size;
                            i8 = i9;
                            animator = k;
                            xVar2 = null;
                        }
                        k = animator;
                        xVar = xVar2;
                    } else {
                        i4 = size;
                        i8 = i9;
                        view = xVar3.f2345b;
                        xVar = null;
                    }
                    if (k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.f2295a = view;
                        obj.f2296b = str;
                        obj.f2297c = xVar;
                        obj.f2298d = windowId;
                        obj.f2299e = this;
                        obj.f2300f = k;
                        p8.put(k, obj);
                        this.f2331x.add(k);
                    }
                    i9 = i8 + 1;
                    size = i4;
                }
            }
            i4 = size;
            i8 = i9;
            i9 = i8 + 1;
            size = i4;
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                j jVar2 = (j) p8.get((Animator) this.f2331x.get(sparseIntArray.keyAt(i13)));
                jVar2.f2300f.setStartDelay(jVar2.f2300f.getStartDelay() + (sparseIntArray.valueAt(i13) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i4 = this.f2326s - 1;
        this.f2326s = i4;
        if (i4 == 0) {
            w(this, o.f2303c, false);
            for (int i8 = 0; i8 < ((t.g) this.j.f282g).h(); i8++) {
                View view = (View) ((t.g) this.j.f282g).i(i8);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i9 = 0; i9 < ((t.g) this.k.f282g).h(); i9++) {
                View view2 = (View) ((t.g) this.k.f282g).i(i9);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f2328u = true;
        }
    }

    public final x n(View view, boolean z8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0067a c0067a = this.f2319l;
        if (c0067a != null) {
            return c0067a.n(view, z8);
        }
        if (z8) {
            arrayList = this.f2321n;
        } else {
            arrayList = this.f2322o;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    x xVar = (x) arrayList.get(i4);
                    if (xVar != null) {
                        if (xVar.f2345b == view) {
                            break;
                        }
                        i4++;
                    } else {
                        return null;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 >= 0) {
                if (z8) {
                    arrayList2 = this.f2322o;
                } else {
                    arrayList2 = this.f2321n;
                }
                return (x) arrayList2.get(i4);
            }
            return null;
        }
        return null;
    }

    public final p o() {
        C0067a c0067a = this.f2319l;
        if (c0067a != null) {
            return c0067a.o();
        }
        return this;
    }

    public String[] q() {
        return null;
    }

    public final x r(View view, boolean z8) {
        A4.a aVar;
        C0067a c0067a = this.f2319l;
        if (c0067a != null) {
            return c0067a.r(view, z8);
        }
        if (z8) {
            aVar = this.j;
        } else {
            aVar = this.k;
        }
        return (x) ((t.e) aVar.f280e).get(view);
    }

    public boolean s() {
        return !this.f2324q.isEmpty();
    }

    public boolean t(x xVar, x xVar2) {
        if (xVar != null && xVar2 != null) {
            String[] q6 = q();
            if (q6 != null) {
                for (String str : q6) {
                    if (v(xVar, xVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = xVar.f2344a.keySet().iterator();
                while (it.hasNext()) {
                    if (v(xVar, xVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return K("");
    }

    public final boolean u(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f2317h;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f2318i;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final void w(p pVar, o oVar, boolean z8) {
        p pVar2 = this.f2329v;
        if (pVar2 != null) {
            pVar2.w(pVar, oVar, z8);
        }
        ArrayList arrayList = this.f2330w;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f2330w.size();
            n[] nVarArr = this.f2323p;
            if (nVarArr == null) {
                nVarArr = new n[size];
            }
            this.f2323p = null;
            n[] nVarArr2 = (n[]) this.f2330w.toArray(nVarArr);
            for (int i4 = 0; i4 < size; i4++) {
                n nVar = nVarArr2[i4];
                switch (oVar.f2307a) {
                    case 0:
                        nVar.f(pVar);
                        break;
                    case 1:
                        nVar.d(pVar);
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        nVar.e(pVar);
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        nVar.a();
                        break;
                    default:
                        nVar.c();
                        break;
                }
                nVarArr2[i4] = null;
            }
            this.f2323p = nVarArr2;
        }
    }

    public void x(View view) {
        if (!this.f2328u) {
            ArrayList arrayList = this.f2324q;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f2325r);
            this.f2325r = f2308B;
            for (int i4 = size - 1; i4 >= 0; i4--) {
                Animator animator = animatorArr[i4];
                animatorArr[i4] = null;
                animator.pause();
            }
            this.f2325r = animatorArr;
            w(this, o.f2305e, false);
            this.f2327t = true;
        }
    }

    public void y() {
        t.e p8 = p();
        this.f2333z = 0L;
        for (int i4 = 0; i4 < this.f2331x.size(); i4++) {
            Animator animator = (Animator) this.f2331x.get(i4);
            j jVar = (j) p8.get(animator);
            if (animator != null && jVar != null) {
                Animator animator2 = jVar.f2300f;
                long j = this.f2315f;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j5 = this.f2314e;
                if (j5 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j5);
                }
                TimeInterpolator timeInterpolator = this.f2316g;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f2324q.add(animator);
                this.f2333z = Math.max(this.f2333z, k.a(animator));
            }
        }
        this.f2331x.clear();
    }

    public p z(n nVar) {
        p pVar;
        ArrayList arrayList = this.f2330w;
        if (arrayList != null) {
            if (!arrayList.remove(nVar) && (pVar = this.f2329v) != null) {
                pVar.z(nVar);
            }
            if (this.f2330w.size() == 0) {
                this.f2330w = null;
            }
        }
        return this;
    }

    public void H() {
    }

    public void E(E2.c cVar) {
    }

    public void f(x xVar) {
    }
}
