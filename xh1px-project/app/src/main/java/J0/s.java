package J0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public p f2336d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f2337e;

    /* JADX WARN: Removed duplicated region for block: B:116:0x01f1 A[EDGE_INSN: B:116:0x01f1->B:117:0x01f1 BREAK  A[LOOP:1: B:17:0x0087->B:29:0x01e8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i4;
        t.e eVar;
        t.e eVar2;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        j jVar;
        ViewGroup viewGroup;
        boolean z8;
        x xVar;
        View view;
        View view2;
        ViewGroup viewGroup2;
        boolean z9;
        p pVar = this.f2336d;
        ViewGroup viewGroup3 = this.f2337e;
        viewGroup3.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup3.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = t.f2340c;
        ViewGroup viewGroup4 = this.f2337e;
        boolean z10 = true;
        if (!arrayList2.remove(viewGroup4)) {
            return true;
        }
        t.e b4 = t.b();
        ArrayList arrayList3 = (ArrayList) b4.get(viewGroup4);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            b4.put(viewGroup4, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            arrayList3.add(pVar);
            pVar.a(new r(this, b4));
            i4 = 0;
            pVar.h(viewGroup4, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).A(viewGroup4);
                }
            }
            pVar.f2321n = new ArrayList();
            pVar.f2322o = new ArrayList();
            A4.a aVar = pVar.j;
            A4.a aVar2 = pVar.k;
            eVar = new t.e((t.e) aVar.f280e);
            eVar2 = new t.e((t.e) aVar2.f280e);
            i8 = 0;
            while (true) {
                iArr = pVar.f2320m;
                if (i8 < iArr.length) {
                    break;
                }
                int i12 = iArr[i8];
                if (i12 != z10) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                t.g gVar = (t.g) aVar.f282g;
                                t.g gVar2 = (t.g) aVar2.f282g;
                                int h8 = gVar.h();
                                int i13 = i4;
                                while (i13 < h8) {
                                    View view3 = (View) gVar.i(i13);
                                    if (view3 != null && pVar.u(view3)) {
                                        viewGroup2 = viewGroup4;
                                        View view4 = (View) gVar2.c(gVar.f(i13));
                                        if (view4 != null && pVar.u(view4)) {
                                            x xVar2 = (x) eVar.get(view3);
                                            z9 = z10;
                                            x xVar3 = (x) eVar2.get(view4);
                                            if (xVar2 != null && xVar3 != null) {
                                                pVar.f2321n.add(xVar2);
                                                pVar.f2322o.add(xVar3);
                                                eVar.remove(view3);
                                                eVar2.remove(view4);
                                            }
                                            i13++;
                                            viewGroup4 = viewGroup2;
                                            z10 = z9;
                                        }
                                    } else {
                                        viewGroup2 = viewGroup4;
                                    }
                                    z9 = z10;
                                    i13++;
                                    viewGroup4 = viewGroup2;
                                    z10 = z9;
                                }
                            }
                            viewGroup = viewGroup4;
                            z8 = z10;
                        } else {
                            viewGroup = viewGroup4;
                            z8 = z10;
                            SparseArray sparseArray = (SparseArray) aVar.f281f;
                            SparseArray sparseArray2 = (SparseArray) aVar2.f281f;
                            int size = sparseArray.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                View view5 = (View) sparseArray.valueAt(i14);
                                if (view5 != null && pVar.u(view5) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i14))) != null && pVar.u(view2)) {
                                    x xVar4 = (x) eVar.get(view5);
                                    x xVar5 = (x) eVar2.get(view2);
                                    if (xVar4 != null && xVar5 != null) {
                                        pVar.f2321n.add(xVar4);
                                        pVar.f2322o.add(xVar5);
                                        eVar.remove(view5);
                                        eVar2.remove(view2);
                                    }
                                }
                            }
                        }
                    } else {
                        viewGroup = viewGroup4;
                        z8 = z10;
                        t.e eVar3 = (t.e) aVar.f283h;
                        t.e eVar4 = (t.e) aVar2.f283h;
                        int i15 = eVar3.f14670f;
                        for (int i16 = 0; i16 < i15; i16++) {
                            View view6 = (View) eVar3.i(i16);
                            if (view6 != null && pVar.u(view6) && (view = (View) eVar4.get(eVar3.f(i16))) != null && pVar.u(view)) {
                                x xVar6 = (x) eVar.get(view6);
                                x xVar7 = (x) eVar2.get(view);
                                if (xVar6 != null && xVar7 != null) {
                                    pVar.f2321n.add(xVar6);
                                    pVar.f2322o.add(xVar7);
                                    eVar.remove(view6);
                                    eVar2.remove(view);
                                }
                            }
                        }
                    }
                } else {
                    viewGroup = viewGroup4;
                    z8 = z10;
                    for (int i17 = eVar.f14670f - 1; i17 >= 0; i17--) {
                        View view7 = (View) eVar.f(i17);
                        if (view7 != null && pVar.u(view7) && (xVar = (x) eVar2.remove(view7)) != null && pVar.u(xVar.f2345b)) {
                            pVar.f2321n.add((x) eVar.g(i17));
                            pVar.f2322o.add(xVar);
                        }
                    }
                }
                i8++;
                viewGroup4 = viewGroup;
                z10 = z8;
                i4 = 0;
            }
            ViewGroup viewGroup5 = viewGroup4;
            boolean z11 = z10;
            for (i9 = 0; i9 < eVar.f14670f; i9++) {
                x xVar8 = (x) eVar.i(i9);
                if (pVar.u(xVar8.f2345b)) {
                    pVar.f2321n.add(xVar8);
                    pVar.f2322o.add(null);
                }
            }
            for (i10 = 0; i10 < eVar2.f14670f; i10++) {
                x xVar9 = (x) eVar2.i(i10);
                if (pVar.u(xVar9.f2345b)) {
                    pVar.f2322o.add(xVar9);
                    pVar.f2321n.add(null);
                }
            }
            t.e p8 = p.p();
            int i18 = p8.f14670f;
            WindowId windowId = viewGroup5.getWindowId();
            i11 = i18 - 1;
            while (i11 >= 0) {
                Animator animator = (Animator) p8.f(i11);
                if (animator != null && (jVar = (j) p8.get(animator)) != null) {
                    p pVar2 = jVar.f2299e;
                    View view8 = jVar.f2295a;
                    if (view8 != null && windowId.equals(jVar.f2298d)) {
                        x xVar10 = jVar.f2297c;
                        boolean z12 = z11;
                        x r8 = pVar.r(view8, z12);
                        x n3 = pVar.n(view8, z12);
                        if (r8 == null && n3 == null) {
                            n3 = (x) ((t.e) pVar.k.f280e).get(view8);
                        }
                        if ((r8 != null || n3 != null) && pVar2.t(xVar10, n3)) {
                            pVar2.o().getClass();
                            if (!animator.isRunning() && !animator.isStarted()) {
                                p8.remove(animator);
                            } else {
                                animator.cancel();
                            }
                        }
                    }
                }
                i11--;
                z11 = true;
            }
            pVar.l(viewGroup5, pVar.j, pVar.k, pVar.f2321n, pVar.f2322o);
            pVar.B();
            return true;
        }
        arrayList = null;
        arrayList3.add(pVar);
        pVar.a(new r(this, b4));
        i4 = 0;
        pVar.h(viewGroup4, false);
        if (arrayList != null) {
        }
        pVar.f2321n = new ArrayList();
        pVar.f2322o = new ArrayList();
        A4.a aVar3 = pVar.j;
        A4.a aVar22 = pVar.k;
        eVar = new t.e((t.e) aVar3.f280e);
        eVar2 = new t.e((t.e) aVar22.f280e);
        i8 = 0;
        while (true) {
            iArr = pVar.f2320m;
            if (i8 < iArr.length) {
            }
            i8++;
            viewGroup4 = viewGroup;
            z10 = z8;
            i4 = 0;
        }
        ViewGroup viewGroup52 = viewGroup4;
        boolean z112 = z10;
        while (i9 < eVar.f14670f) {
        }
        while (i10 < eVar2.f14670f) {
        }
        t.e p82 = p.p();
        int i182 = p82.f14670f;
        WindowId windowId2 = viewGroup52.getWindowId();
        i11 = i182 - 1;
        while (i11 >= 0) {
        }
        pVar.l(viewGroup52, pVar.j, pVar.k, pVar.f2321n, pVar.f2322o);
        pVar.B();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f2337e;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = t.f2340c;
        ViewGroup viewGroup2 = this.f2337e;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) t.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((p) it.next()).A(viewGroup2);
            }
        }
        this.f2336d.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
