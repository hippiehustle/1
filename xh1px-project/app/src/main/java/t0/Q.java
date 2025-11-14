package t0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Q implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f14785e;

    public /* synthetic */ Q(RecyclerView recyclerView, int i4) {
        this.f14784d = i4;
        this.f14785e = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        long j;
        int i4 = this.f14784d;
        RecyclerView recyclerView = this.f14785e;
        switch (i4) {
            case 0:
                if (recyclerView.f8976x && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f8972v) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.f8909A) {
                        recyclerView.f8980z = true;
                        return;
                    } else {
                        recyclerView.p();
                        return;
                    }
                }
                return;
            default:
                Z z9 = recyclerView.f8928P;
                if (z9 != null) {
                    C1548n c1548n = (C1548n) z9;
                    long j5 = c1548n.f14794d;
                    ArrayList arrayList = c1548n.f14900h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c1548n.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c1548n.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c1548n.f14901i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            s0 s0Var = (s0) it.next();
                            View view = s0Var.f14950a;
                            ViewPropertyAnimator animate = view.animate();
                            c1548n.f14907q.add(s0Var);
                            animate.setDuration(j5).alpha(0.0f).setListener(new C1543i(c1548n, s0Var, animate, view)).start();
                            arrayList = arrayList;
                            isEmpty = isEmpty;
                        }
                        boolean z10 = isEmpty;
                        arrayList.clear();
                        if (!isEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c1548n.f14903m.add(arrayList5);
                            arrayList2.clear();
                            RunnableC1542h runnableC1542h = new RunnableC1542h(c1548n, arrayList5, 0);
                            if (!z10) {
                                View view2 = ((C1547m) arrayList5.get(0)).f14886a.f14950a;
                                WeakHashMap weakHashMap = P.O.f4214a;
                                view2.postOnAnimationDelayed(runnableC1542h, j5);
                            } else {
                                runnableC1542h.run();
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c1548n.f14904n.add(arrayList6);
                            arrayList3.clear();
                            RunnableC1542h runnableC1542h2 = new RunnableC1542h(c1548n, arrayList6, 1);
                            if (!z10) {
                                View view3 = ((C1546l) arrayList6.get(0)).f14879a.f14950a;
                                WeakHashMap weakHashMap2 = P.O.f4214a;
                                view3.postOnAnimationDelayed(runnableC1542h2, j5);
                            } else {
                                runnableC1542h2.run();
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c1548n.f14902l.add(arrayList7);
                            arrayList4.clear();
                            RunnableC1542h runnableC1542h3 = new RunnableC1542h(c1548n, arrayList7, 2);
                            if (z10 && isEmpty2 && isEmpty3) {
                                runnableC1542h3.run();
                            } else {
                                long j8 = 0;
                                if (z10) {
                                    j5 = 0;
                                }
                                if (!isEmpty2) {
                                    j = c1548n.f14795e;
                                } else {
                                    j = 0;
                                }
                                if (!isEmpty3) {
                                    j8 = c1548n.f14796f;
                                }
                                long max = Math.max(j, j8) + j5;
                                z8 = false;
                                View view4 = ((s0) arrayList7.get(0)).f14950a;
                                WeakHashMap weakHashMap3 = P.O.f4214a;
                                view4.postOnAnimationDelayed(runnableC1542h3, max);
                                recyclerView.f8963q0 = z8;
                                return;
                            }
                        }
                    }
                }
                z8 = false;
                recyclerView.f8963q0 = z8;
                return;
        }
    }
}
