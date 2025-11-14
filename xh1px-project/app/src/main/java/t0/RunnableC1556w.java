package t0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import g5.C0787g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: t0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1556w implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal f15010h = new ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public static final A0.i f15011i = new A0.i(28);

    /* renamed from: e, reason: collision with root package name */
    public long f15013e;

    /* renamed from: f, reason: collision with root package name */
    public long f15014f;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f15012d = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f15015g = new ArrayList();

    public static s0 c(RecyclerView recyclerView, int i4, long j) {
        int w8 = recyclerView.f8949i.w();
        for (int i8 = 0; i8 < w8; i8++) {
            s0 N8 = RecyclerView.N(recyclerView.f8949i.v(i8));
            if (N8.f14952c == i4 && !N8.h()) {
                return null;
            }
        }
        j0 j0Var = recyclerView.f8943f;
        if (j == Long.MAX_VALUE) {
            try {
                if (L.f.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.W(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.V();
        s0 k = j0Var.k(i4, j);
        if (k != null) {
            if (k.g() && !k.h()) {
                j0Var.h(k.f14950a);
            } else {
                j0Var.a(k, false);
            }
        }
        recyclerView.W(false);
        Trace.endSection();
        return k;
    }

    public final void a(RecyclerView recyclerView, int i4, int i8) {
        if (recyclerView.f8972v) {
            if (RecyclerView.f8900F0 && !this.f15012d.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f15013e == 0) {
                this.f15013e = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0787g c0787g = recyclerView.j0;
        c0787g.f11187a = i4;
        c0787g.f11188b = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j) {
        C1555v c1555v;
        RecyclerView recyclerView;
        long j5;
        RecyclerView recyclerView2;
        String str;
        C1555v c1555v2;
        boolean z8;
        ArrayList arrayList = this.f15012d;
        int size = arrayList.size();
        int i4 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i9);
            int windowVisibility = recyclerView3.getWindowVisibility();
            C0787g c0787g = recyclerView3.j0;
            if (windowVisibility == 0) {
                c0787g.d(recyclerView3, false);
                i8 += c0787g.f11189c;
            }
        }
        ArrayList arrayList2 = this.f15015g;
        arrayList2.ensureCapacity(i8);
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i10);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0787g c0787g2 = recyclerView4.j0;
                int abs = Math.abs(c0787g2.f11188b) + Math.abs(c0787g2.f11187a);
                for (int i12 = i4; i12 < c0787g2.f11189c * 2; i12 += 2) {
                    if (i11 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        c1555v2 = obj;
                    } else {
                        c1555v2 = (C1555v) arrayList2.get(i11);
                    }
                    int[] iArr = (int[]) c0787g2.f11190d;
                    int i13 = iArr[i12 + 1];
                    if (i13 <= abs) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    c1555v2.f15003a = z8;
                    c1555v2.f15004b = abs;
                    c1555v2.f15005c = i13;
                    c1555v2.f15006d = recyclerView4;
                    c1555v2.f15007e = iArr[i12];
                    i11++;
                }
            }
            i10++;
            i4 = 0;
        }
        Collections.sort(arrayList2, f15011i);
        for (int i14 = 0; i14 < arrayList2.size() && (recyclerView = (c1555v = (C1555v) arrayList2.get(i14)).f15006d) != null; i14++) {
            if (c1555v.f15003a) {
                j5 = Long.MAX_VALUE;
            } else {
                j5 = j;
            }
            s0 c6 = c(recyclerView, c1555v.f15007e, j5);
            if (c6 != null && c6.f14951b != null && c6.g() && !c6.h() && (recyclerView2 = (RecyclerView) c6.f14951b.get()) != null) {
                if (recyclerView2.f8920G && recyclerView2.f8949i.w() != 0) {
                    j0 j0Var = recyclerView2.f8943f;
                    Z z9 = recyclerView2.f8928P;
                    if (z9 != null) {
                        z9.e();
                    }
                    AbstractC1537c0 abstractC1537c0 = recyclerView2.f8962q;
                    if (abstractC1537c0 != null) {
                        abstractC1537c0.n0(j0Var);
                        recyclerView2.f8962q.o0(j0Var);
                    }
                    j0Var.f14866a.clear();
                    j0Var.f();
                }
                C0787g c0787g3 = recyclerView2.j0;
                c0787g3.d(recyclerView2, true);
                if (c0787g3.f11189c != 0) {
                    if (j == Long.MAX_VALUE) {
                        str = "RV Nested Prefetch";
                    } else {
                        str = "RV Nested Prefetch forced - needed next frame";
                    }
                    try {
                        Trace.beginSection(str);
                        o0 o0Var = recyclerView2.f8951k0;
                        U u8 = recyclerView2.f8960p;
                        o0Var.f14915d = 1;
                        o0Var.f14916e = u8.a();
                        o0Var.f14918g = false;
                        o0Var.f14919h = false;
                        o0Var.f14920i = false;
                        for (int i15 = 0; i15 < c0787g3.f11189c * 2; i15 += 2) {
                            c(recyclerView2, ((int[]) c0787g3.f11190d)[i15], j);
                        }
                        Trace.endSection();
                        c1555v.f15003a = false;
                        c1555v.f15004b = 0;
                        c1555v.f15005c = 0;
                        c1555v.f15006d = null;
                        c1555v.f15007e = 0;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c1555v.f15003a = false;
            c1555v.f15004b = 0;
            c1555v.f15005c = 0;
            c1555v.f15006d = null;
            c1555v.f15007e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f15012d;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.f15014f);
                }
            }
        } finally {
            this.f15013e = 0L;
            Trace.endSection();
        }
    }
}
