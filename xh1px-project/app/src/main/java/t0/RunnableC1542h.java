package t0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1542h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1548n f14847f;

    public /* synthetic */ RunnableC1542h(C1548n c1548n, ArrayList arrayList, int i4) {
        this.f14845d = i4;
        this.f14847f = c1548n;
        this.f14846e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        switch (this.f14845d) {
            case 0:
                ArrayList arrayList = this.f14846e;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C1548n c1548n = this.f14847f;
                    if (hasNext) {
                        C1547m c1547m = (C1547m) it.next();
                        s0 s0Var = c1547m.f14886a;
                        int i4 = c1547m.f14887b;
                        int i8 = c1547m.f14888c;
                        int i9 = c1547m.f14889d;
                        int i10 = c1547m.f14890e;
                        c1548n.getClass();
                        View view2 = s0Var.f14950a;
                        int i11 = i9 - i4;
                        int i12 = i10 - i8;
                        if (i11 != 0) {
                            view2.animate().translationX(0.0f);
                        }
                        if (i12 != 0) {
                            view2.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view2.animate();
                        c1548n.f14906p.add(s0Var);
                        animate.setDuration(c1548n.f14795e).setListener(new C1544j(c1548n, s0Var, i11, view2, i12, animate)).start();
                    } else {
                        arrayList.clear();
                        c1548n.f14903m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f14846e;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    C1548n c1548n2 = this.f14847f;
                    if (hasNext2) {
                        C1546l c1546l = (C1546l) it2.next();
                        ArrayList arrayList3 = c1548n2.f14908r;
                        long j = c1548n2.f14796f;
                        s0 s0Var2 = c1546l.f14879a;
                        View view3 = null;
                        if (s0Var2 == null) {
                            view = null;
                        } else {
                            view = s0Var2.f14950a;
                        }
                        s0 s0Var3 = c1546l.f14880b;
                        if (s0Var3 != null) {
                            view3 = s0Var3.f14950a;
                        }
                        View view4 = view3;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j);
                            arrayList3.add(c1546l.f14879a);
                            duration.translationX(c1546l.f14883e - c1546l.f14881c);
                            duration.translationY(c1546l.f14884f - c1546l.f14882d);
                            duration.alpha(0.0f).setListener(new C1545k(c1548n2, c1546l, duration, view, 0)).start();
                        }
                        if (view4 != null) {
                            ViewPropertyAnimator animate2 = view4.animate();
                            arrayList3.add(c1546l.f14880b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C1545k(c1548n2, c1546l, animate2, view4, 1)).start();
                        }
                    } else {
                        arrayList2.clear();
                        c1548n2.f14904n.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList4 = this.f14846e;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it3.hasNext();
                    C1548n c1548n3 = this.f14847f;
                    if (hasNext3) {
                        s0 s0Var4 = (s0) it3.next();
                        c1548n3.getClass();
                        View view5 = s0Var4.f14950a;
                        ViewPropertyAnimator animate3 = view5.animate();
                        c1548n3.f14905o.add(s0Var4);
                        animate3.alpha(1.0f).setDuration(c1548n3.f14793c).setListener(new C1543i(c1548n3, s0Var4, view5, animate3)).start();
                    } else {
                        arrayList4.clear();
                        c1548n3.f14902l.remove(arrayList4);
                        return;
                    }
                }
        }
    }
}
