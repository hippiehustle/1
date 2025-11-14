package t0;

import P.C0253a;
import P.C0254b;
import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import g5.C0787g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14866a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f14867b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14868c;

    /* renamed from: d, reason: collision with root package name */
    public final List f14869d;

    /* renamed from: e, reason: collision with root package name */
    public int f14870e;

    /* renamed from: f, reason: collision with root package name */
    public int f14871f;

    /* renamed from: g, reason: collision with root package name */
    public i0 f14872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f14873h;

    public j0(RecyclerView recyclerView) {
        this.f14873h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f14866a = arrayList;
        this.f14867b = null;
        this.f14868c = new ArrayList();
        this.f14869d = Collections.unmodifiableList(arrayList);
        this.f14870e = 2;
        this.f14871f = 2;
    }

    public final void a(s0 s0Var, boolean z8) {
        C0254b c0254b;
        RecyclerView.l(s0Var);
        View view = s0Var.f14950a;
        RecyclerView recyclerView = this.f14873h;
        u0 u0Var = recyclerView.f8965r0;
        if (u0Var != null) {
            t0 t0Var = u0Var.f15002e;
            if (t0Var != null) {
                c0254b = (C0254b) t0Var.f14972e.remove(view);
            } else {
                c0254b = null;
            }
            P.O.m(view, c0254b);
        }
        if (z8) {
            ArrayList arrayList = recyclerView.f8964r;
            if (arrayList.size() <= 0) {
                U u8 = recyclerView.f8960p;
                if (u8 != null) {
                    u8.f(s0Var);
                }
                if (recyclerView.f8951k0 != null) {
                    recyclerView.j.u(s0Var);
                }
                if (RecyclerView.f8901G0) {
                    Objects.toString(s0Var);
                }
            } else {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        s0Var.f14966s = null;
        s0Var.f14965r = null;
        i0 c6 = c();
        c6.getClass();
        int i4 = s0Var.f14955f;
        ArrayList arrayList2 = c6.a(i4).f14848a;
        if (((h0) c6.f14857a.get(i4)).f14849b <= arrayList2.size()) {
            E2.c.J(view);
        } else {
            if (RecyclerView.f8900F0 && arrayList2.contains(s0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            s0Var.o();
            arrayList2.add(s0Var);
        }
    }

    public final int b(int i4) {
        RecyclerView recyclerView = this.f14873h;
        if (i4 >= 0 && i4 < recyclerView.f8951k0.b()) {
            if (!recyclerView.f8951k0.f14918g) {
                return i4;
            }
            return recyclerView.f8947h.g(i4, 0);
        }
        StringBuilder j = AbstractC1149a.j(i4, "invalid position ", ". State item count is ");
        j.append(recyclerView.f8951k0.b());
        j.append(recyclerView.C());
        throw new IndexOutOfBoundsException(j.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [t0.i0, java.lang.Object] */
    public final i0 c() {
        if (this.f14872g == null) {
            ?? obj = new Object();
            obj.f14857a = new SparseArray();
            obj.f14858b = 0;
            obj.f14859c = Collections.newSetFromMap(new IdentityHashMap());
            this.f14872g = obj;
            d();
        }
        return this.f14872g;
    }

    public final void d() {
        RecyclerView recyclerView;
        U u8;
        i0 i0Var = this.f14872g;
        if (i0Var != null && (u8 = (recyclerView = this.f14873h).f8960p) != null && recyclerView.f8972v) {
            i0Var.f14859c.add(u8);
        }
    }

    public final void e(U u8, boolean z8) {
        i0 i0Var = this.f14872g;
        if (i0Var != null) {
            SparseArray sparseArray = i0Var.f14857a;
            Set set = i0Var.f14859c;
            set.remove(u8);
            if (set.size() == 0 && !z8) {
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    ArrayList arrayList = ((h0) sparseArray.get(sparseArray.keyAt(i4))).f14848a;
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        E2.c.J(((s0) arrayList.get(i8)).f14950a);
                    }
                }
            }
        }
    }

    public final void f() {
        ArrayList arrayList = this.f14868c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.f8905K0) {
            C0787g c0787g = this.f14873h.j0;
            int[] iArr = (int[]) c0787g.f11190d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0787g.f11189c = 0;
        }
    }

    public final void g(int i4) {
        boolean z8 = RecyclerView.f8900F0;
        ArrayList arrayList = this.f14868c;
        s0 s0Var = (s0) arrayList.get(i4);
        if (RecyclerView.f8901G0) {
            Objects.toString(s0Var);
        }
        a(s0Var, true);
        arrayList.remove(i4);
    }

    public final void h(View view) {
        s0 N8 = RecyclerView.N(view);
        boolean l6 = N8.l();
        RecyclerView recyclerView = this.f14873h;
        if (l6) {
            recyclerView.removeDetachedView(view, false);
        }
        if (N8.k()) {
            N8.f14961n.l(N8);
        } else if (N8.r()) {
            N8.j &= -33;
        }
        i(N8);
        if (recyclerView.f8928P != null && !N8.i()) {
            recyclerView.f8928P.d(N8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b8, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(s0 s0Var) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean k = s0Var.k();
        View view = s0Var.f14950a;
        boolean z11 = false;
        boolean z12 = true;
        RecyclerView recyclerView = this.f14873h;
        if (!k && view.getParent() == null) {
            if (!s0Var.l()) {
                if (!s0Var.q()) {
                    if ((s0Var.j & 16) == 0) {
                        WeakHashMap weakHashMap = P.O.f4214a;
                        if (view.hasTransientState()) {
                            z8 = true;
                            z9 = RecyclerView.f8900F0;
                            ArrayList arrayList = this.f14868c;
                            if (!z9 && arrayList.contains(s0Var)) {
                                StringBuilder sb = new StringBuilder("cached view received recycle internal? ");
                                sb.append(s0Var);
                                throw new IllegalArgumentException(AbstractC1149a.e(recyclerView, sb));
                            }
                            if (!s0Var.i()) {
                                if (this.f14871f > 0 && (s0Var.j & 526) == 0) {
                                    int size = arrayList.size();
                                    if (size >= this.f14871f && size > 0) {
                                        g(0);
                                        size--;
                                    }
                                    if (RecyclerView.f8905K0 && size > 0) {
                                        C0787g c0787g = recyclerView.j0;
                                        int i4 = s0Var.f14952c;
                                        if (((int[]) c0787g.f11190d) != null) {
                                            int i8 = c0787g.f11189c * 2;
                                            for (int i9 = 0; i9 < i8; i9 += 2) {
                                                if (((int[]) c0787g.f11190d)[i9] == i4) {
                                                    break;
                                                }
                                            }
                                        }
                                        int i10 = size - 1;
                                        loop1: while (i10 >= 0) {
                                            int i11 = ((s0) arrayList.get(i10)).f14952c;
                                            C0787g c0787g2 = recyclerView.j0;
                                            if (((int[]) c0787g2.f11190d) == null) {
                                                break;
                                            }
                                            int i12 = c0787g2.f11189c * 2;
                                            for (int i13 = 0; i13 < i12; i13 += 2) {
                                                if (((int[]) c0787g2.f11190d)[i13] == i11) {
                                                    break;
                                                }
                                            }
                                            break loop1;
                                        }
                                        size = i10 + 1;
                                    }
                                    arrayList.add(size, s0Var);
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    a(s0Var, true);
                                } else {
                                    z12 = false;
                                }
                                z11 = z10;
                            } else {
                                if (RecyclerView.f8901G0) {
                                    recyclerView.C();
                                }
                                z12 = false;
                            }
                            recyclerView.j.u(s0Var);
                            if (z11 && !z12 && z8) {
                                E2.c.J(view);
                                s0Var.f14966s = null;
                                s0Var.f14965r = null;
                                return;
                            }
                            return;
                        }
                    }
                    z8 = false;
                    z9 = RecyclerView.f8900F0;
                    ArrayList arrayList2 = this.f14868c;
                    if (!z9) {
                    }
                    if (!s0Var.i()) {
                    }
                    recyclerView.j.u(s0Var);
                    if (z11) {
                        return;
                    } else {
                        return;
                    }
                }
                throw new IllegalArgumentException(AbstractC1149a.e(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(s0Var);
            throw new IllegalArgumentException(AbstractC1149a.e(recyclerView, sb2));
        }
        StringBuilder sb3 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb3.append(s0Var.k());
        sb3.append(" isAttached:");
        if (view.getParent() != null) {
            z11 = true;
        }
        sb3.append(z11);
        sb3.append(recyclerView.C());
        throw new IllegalArgumentException(sb3.toString());
    }

    public final void j(View view) {
        Z z8;
        s0 N8 = RecyclerView.N(view);
        int i4 = N8.j & 12;
        RecyclerView recyclerView = this.f14873h;
        if (i4 == 0 && N8.m() && (z8 = recyclerView.f8928P) != null) {
            C1548n c1548n = (C1548n) z8;
            if (N8.e().isEmpty() && c1548n.f14899g && !N8.h()) {
                if (this.f14867b == null) {
                    this.f14867b = new ArrayList();
                }
                N8.f14961n = this;
                N8.f14962o = true;
                this.f14867b.add(N8);
                return;
            }
        }
        if (N8.h() && !N8.j() && !recyclerView.f8960p.f14789b) {
            throw new IllegalArgumentException(AbstractC1149a.e(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        N8.f14961n = this;
        N8.f14962o = false;
        this.f14866a.add(N8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x045d, code lost:
    
        if (r10.h() == false) goto L257;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0622 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0080  */
    /* JADX WARN: Type inference failed for: r6v42, types: [P.o, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s0 k(int i4, long j) {
        boolean z8;
        s0 s0Var;
        boolean z9;
        long j5;
        long j8;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        C0254b c0254b;
        boolean z15;
        ViewGroup.LayoutParams layoutParams;
        d0 d0Var;
        boolean z16;
        RecyclerView H2;
        boolean z17;
        s0 s0Var2;
        int i8;
        View view;
        int b4;
        boolean z18;
        int size;
        int g8;
        RecyclerView recyclerView = this.f14873h;
        o0 o0Var = recyclerView.f8951k0;
        if (i4 >= 0 && i4 < o0Var.b()) {
            if (o0Var.f14918g) {
                ArrayList arrayList = this.f14867b;
                if (arrayList != null && (size = arrayList.size()) != 0) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < size) {
                            s0Var = (s0) this.f14867b.get(i9);
                            if (!s0Var.r() && s0Var.d() == i4) {
                                s0Var.a(32);
                                break;
                            }
                            i9++;
                        } else if (recyclerView.f8960p.f14789b && (g8 = recyclerView.f8947h.g(i4, 0)) > 0 && g8 < recyclerView.f8960p.a()) {
                            long b9 = recyclerView.f8960p.b(g8);
                            for (int i10 = 0; i10 < size; i10++) {
                                s0 s0Var3 = (s0) this.f14867b.get(i10);
                                if (!s0Var3.r() && s0Var3.f14954e == b9) {
                                    s0Var3.a(32);
                                    s0Var = s0Var3;
                                    break;
                                }
                            }
                        }
                    }
                    if (s0Var == null) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
                s0Var = null;
                if (s0Var == null) {
                }
            } else {
                z8 = false;
                s0Var = null;
            }
            ArrayList arrayList2 = this.f14866a;
            ArrayList arrayList3 = this.f14868c;
            if (s0Var == null) {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    s0 s0Var4 = (s0) arrayList2.get(i11);
                    if (!s0Var4.r() && s0Var4.d() == i4 && !s0Var4.h() && (o0Var.f14918g || !s0Var4.j())) {
                        s0Var4.a(32);
                        s0Var = s0Var4;
                        z9 = true;
                        break;
                    }
                }
                ArrayList arrayList4 = (ArrayList) recyclerView.f8949i.f5432e;
                int size3 = arrayList4.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size3) {
                        view = (View) arrayList4.get(i12);
                        s0 N8 = RecyclerView.N(view);
                        z9 = true;
                        if (N8.d() == i4 && !N8.h() && !N8.j()) {
                            break;
                        }
                        i12++;
                    } else {
                        z9 = true;
                        view = null;
                        break;
                    }
                }
                if (view != null) {
                    s0 N9 = RecyclerView.N(view);
                    S6.e eVar = recyclerView.f8949i;
                    C1541g c1541g = (C1541g) eVar.f5431d;
                    int indexOfChild = ((S) eVar.f5430c).f14786a.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (c1541g.d(indexOfChild)) {
                            c1541g.a(indexOfChild);
                            eVar.F(view);
                            S6.e eVar2 = recyclerView.f8949i;
                            C1541g c1541g2 = (C1541g) eVar2.f5431d;
                            int indexOfChild2 = ((S) eVar2.f5430c).f14786a.indexOfChild(view);
                            if (indexOfChild2 == -1 || c1541g2.d(indexOfChild2)) {
                                b4 = -1;
                            } else {
                                b4 = indexOfChild2 - c1541g2.b(indexOfChild2);
                            }
                            if (b4 != -1) {
                                recyclerView.f8949i.o(b4);
                                j(view);
                                N9.a(8224);
                                s0Var = N9;
                            } else {
                                StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                sb.append(N9);
                                throw new IllegalStateException(AbstractC1149a.e(recyclerView, sb));
                            }
                        } else {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                    } else {
                        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                    }
                } else {
                    int size4 = arrayList3.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size4) {
                            s0 s0Var5 = (s0) arrayList3.get(i13);
                            if (!s0Var5.h() && s0Var5.d() == i4 && !s0Var5.f()) {
                                arrayList3.remove(i13);
                                if (RecyclerView.f8901G0) {
                                    s0Var5.toString();
                                }
                                s0Var = s0Var5;
                            } else {
                                i13++;
                            }
                        } else {
                            s0Var = null;
                            break;
                        }
                    }
                }
                if (s0Var != null) {
                    if (s0Var.j()) {
                        if (RecyclerView.f8900F0 && !o0Var.f14918g) {
                            throw new IllegalStateException(AbstractC1149a.e(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                        }
                        z18 = o0Var.f14918g;
                    } else {
                        int i14 = s0Var.f14952c;
                        if (i14 >= 0 && i14 < recyclerView.f8960p.a()) {
                            if (o0Var.f14918g || recyclerView.f8960p.c(s0Var.f14952c) == s0Var.f14955f) {
                                U u8 = recyclerView.f8960p;
                                if (!u8.f14789b || s0Var.f14954e == u8.b(s0Var.f14952c)) {
                                    z18 = z9;
                                }
                            }
                            z18 = false;
                        } else {
                            StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                            sb2.append(s0Var);
                            throw new IndexOutOfBoundsException(AbstractC1149a.e(recyclerView, sb2));
                        }
                    }
                    if (!z18) {
                        s0Var.a(4);
                        if (s0Var.k()) {
                            recyclerView.removeDetachedView(s0Var.f14950a, false);
                            s0Var.f14961n.l(s0Var);
                        } else if (s0Var.r()) {
                            s0Var.j &= -33;
                        }
                        i(s0Var);
                        s0Var = null;
                    } else {
                        z8 = z9;
                    }
                }
            } else {
                z9 = true;
            }
            if (s0Var == null) {
                int g9 = recyclerView.f8947h.g(i4, 0);
                if (g9 >= 0) {
                    j5 = 3;
                    if (g9 < recyclerView.f8960p.a()) {
                        int c6 = recyclerView.f8960p.c(g9);
                        U u9 = recyclerView.f8960p;
                        j8 = 4;
                        if (u9.f14789b) {
                            long b10 = u9.b(g9);
                            int size5 = arrayList2.size() - 1;
                            while (true) {
                                if (size5 >= 0) {
                                    s0 s0Var6 = (s0) arrayList2.get(size5);
                                    i8 = g9;
                                    long j9 = s0Var6.f14954e;
                                    View view2 = s0Var6.f14950a;
                                    if (j9 == b10 && !s0Var6.r()) {
                                        if (c6 == s0Var6.f14955f) {
                                            s0Var6.a(32);
                                            if (s0Var6.j() && !o0Var.f14918g) {
                                                s0Var6.j = (s0Var6.j & (-15)) | 2;
                                            }
                                            s0Var = s0Var6;
                                        } else {
                                            arrayList2.remove(size5);
                                            recyclerView.removeDetachedView(view2, false);
                                            s0 N10 = RecyclerView.N(view2);
                                            N10.f14961n = null;
                                            N10.f14962o = false;
                                            N10.j &= -33;
                                            i(N10);
                                        }
                                    }
                                    size5--;
                                    g9 = i8;
                                } else {
                                    i8 = g9;
                                    int size6 = arrayList3.size() - 1;
                                    while (true) {
                                        if (size6 < 0) {
                                            break;
                                        }
                                        s0 s0Var7 = (s0) arrayList3.get(size6);
                                        if (s0Var7.f14954e != b10 || s0Var7.f()) {
                                            size6--;
                                        } else if (c6 == s0Var7.f14955f) {
                                            arrayList3.remove(size6);
                                            s0Var = s0Var7;
                                        } else {
                                            g(size6);
                                        }
                                    }
                                    s0Var = null;
                                }
                            }
                            if (s0Var != null) {
                                s0Var.f14952c = i8;
                                z8 = z9;
                            }
                        }
                        if (s0Var == null) {
                            boolean z19 = RecyclerView.f8900F0;
                            h0 h0Var = (h0) c().f14857a.get(c6);
                            if (h0Var != null) {
                                ArrayList arrayList5 = h0Var.f14848a;
                                if (!arrayList5.isEmpty()) {
                                    for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                        if (!((s0) arrayList5.get(size7)).f()) {
                                            s0Var2 = (s0) arrayList5.remove(size7);
                                            break;
                                        }
                                    }
                                }
                            }
                            s0Var2 = null;
                            if (s0Var2 != null) {
                                s0Var2.o();
                                boolean z20 = RecyclerView.f8900F0;
                            }
                            s0Var = s0Var2;
                        }
                        if (s0Var == null) {
                            long nanoTime = recyclerView.getNanoTime();
                            if (j != Long.MAX_VALUE) {
                                long j10 = this.f14872g.a(c6).f14850c;
                                if (j10 != 0 && j10 + nanoTime >= j) {
                                    z17 = false;
                                } else {
                                    z17 = z9;
                                }
                                if (!z17) {
                                    return null;
                                }
                            }
                            U u10 = recyclerView.f8960p;
                            u10.getClass();
                            try {
                                if (L.f.a()) {
                                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(c6)));
                                }
                                s0Var = u10.e(recyclerView, c6);
                                if (s0Var.f14950a.getParent() == null) {
                                    s0Var.f14955f = c6;
                                    Trace.endSection();
                                    if (RecyclerView.f8905K0 && (H2 = RecyclerView.H(s0Var.f14950a)) != null) {
                                        s0Var.f14951b = new WeakReference(H2);
                                    }
                                    long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                                    h0 a3 = this.f14872g.a(c6);
                                    long j11 = a3.f14850c;
                                    if (j11 != 0) {
                                        nanoTime2 = (nanoTime2 / 4) + ((j11 / 4) * 3);
                                    }
                                    a3.f14850c = nanoTime2;
                                } else {
                                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                                }
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                    }
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i4 + "(offset:" + g9 + ").state:" + o0Var.b() + recyclerView.C());
            }
            j5 = 3;
            j8 = 4;
            View view3 = s0Var.f14950a;
            if (z8 && !o0Var.f14918g) {
                int i15 = s0Var.j;
                if ((i15 & 8192) != 0) {
                    z16 = z9;
                } else {
                    z16 = false;
                }
                if (z16) {
                    s0Var.j = i15 & (-8193);
                    if (o0Var.j) {
                        Z.b(s0Var);
                        Z z21 = recyclerView.f8928P;
                        s0Var.e();
                        z21.getClass();
                        ?? obj = new Object();
                        obj.a(s0Var);
                        recyclerView.b0(s0Var, obj);
                    }
                }
            }
            if (o0Var.f14918g && s0Var.g()) {
                s0Var.f14956g = i4;
            } else {
                if (s0Var.g()) {
                    if ((s0Var.j & 2) != 0) {
                        z15 = z9;
                    } else {
                        z15 = false;
                    }
                    if (!z15) {
                    }
                }
                if (RecyclerView.f8900F0 && s0Var.j()) {
                    StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                    sb3.append(s0Var);
                    throw new IllegalStateException(AbstractC1149a.e(recyclerView, sb3));
                }
                int g10 = recyclerView.f8947h.g(i4, 0);
                s0Var.f14966s = null;
                s0Var.f14965r = recyclerView;
                int i16 = s0Var.f14955f;
                long nanoTime3 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j12 = this.f14872g.a(i16).f14851d;
                    if (j12 != 0 && j12 + nanoTime3 >= j) {
                        z14 = false;
                        z13 = z9;
                        layoutParams = view3.getLayoutParams();
                        if (layoutParams == null) {
                            d0Var = (d0) recyclerView.generateDefaultLayoutParams();
                            view3.setLayoutParams(d0Var);
                        } else if (!recyclerView.checkLayoutParams(layoutParams)) {
                            d0Var = (d0) recyclerView.generateLayoutParams(layoutParams);
                            view3.setLayoutParams(d0Var);
                        } else {
                            d0Var = (d0) layoutParams;
                        }
                        d0Var.f14827a = s0Var;
                        if (z8 || !z14) {
                            z13 = false;
                        }
                        d0Var.f14830d = z13;
                        return s0Var;
                    }
                }
                if (s0Var.l()) {
                    recyclerView.attachViewToParent(view3, recyclerView.getChildCount(), view3.getLayoutParams());
                    z10 = z9;
                } else {
                    z10 = false;
                }
                U u11 = recyclerView.f8960p;
                u11.getClass();
                if (s0Var.f14966s == null) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
                if (z11) {
                    s0Var.f14952c = g10;
                    if (u11.f14789b) {
                        s0Var.f14954e = u11.b(g10);
                    }
                    s0Var.j = (s0Var.j & (-520)) | 1;
                    if (L.f.a()) {
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(s0Var.f14955f)));
                    }
                }
                s0Var.f14966s = u11;
                if (RecyclerView.f8900F0) {
                    if (view3.getParent() == null && view3.isAttachedToWindow() != s0Var.l()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + s0Var.l() + ", attached to window: " + view3.isAttachedToWindow() + ", holder: " + s0Var);
                    }
                    if (view3.getParent() == null && view3.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + s0Var);
                    }
                }
                s0Var.e();
                u11.d(s0Var, g10);
                if (z11) {
                    ArrayList arrayList6 = s0Var.k;
                    if (arrayList6 != null) {
                        arrayList6.clear();
                    }
                    s0Var.j &= -1025;
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 instanceof d0) {
                        ((d0) layoutParams2).f14829c = z9;
                    }
                    Trace.endSection();
                }
                if (z10) {
                    recyclerView.detachViewFromParent(view3);
                }
                long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                h0 a4 = this.f14872g.a(s0Var.f14955f);
                long j13 = a4.f14851d;
                if (j13 != 0) {
                    nanoTime4 = (nanoTime4 / j8) + ((j13 / j8) * j5);
                }
                a4.f14851d = nanoTime4;
                AccessibilityManager accessibilityManager = recyclerView.f8917E;
                if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    z13 = true;
                    if (view3.getImportantForAccessibility() == 0) {
                        view3.setImportantForAccessibility(1);
                    }
                    u0 u0Var = recyclerView.f8965r0;
                    if (u0Var != null) {
                        t0 t0Var = u0Var.f15002e;
                        if (t0Var != null) {
                            View.AccessibilityDelegate d2 = P.O.d(view3);
                            if (d2 == null) {
                                c0254b = null;
                            } else if (d2 instanceof C0253a) {
                                c0254b = ((C0253a) d2).f4240a;
                            } else {
                                c0254b = new C0254b(d2);
                            }
                            if (c0254b != null && c0254b != t0Var) {
                                t0Var.f14972e.put(view3, c0254b);
                            }
                        }
                        P.O.m(view3, t0Var);
                    }
                } else {
                    z13 = true;
                }
                if (o0Var.f14918g) {
                    s0Var.f14956g = i4;
                }
                z14 = z13;
                layoutParams = view3.getLayoutParams();
                if (layoutParams == null) {
                }
                d0Var.f14827a = s0Var;
                if (z8) {
                }
                z13 = false;
                d0Var.f14830d = z13;
                return s0Var;
            }
            z13 = z9;
            z14 = false;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
            }
            d0Var.f14827a = s0Var;
            if (z8) {
            }
            z13 = false;
            d0Var.f14830d = z13;
            return s0Var;
        }
        throw new IndexOutOfBoundsException("Invalid item position " + i4 + "(" + i4 + "). Item count:" + o0Var.b() + recyclerView.C());
    }

    public final void l(s0 s0Var) {
        if (s0Var.f14962o) {
            this.f14867b.remove(s0Var);
        } else {
            this.f14866a.remove(s0Var);
        }
        s0Var.f14961n = null;
        s0Var.f14962o = false;
        s0Var.j &= -33;
    }

    public final void m() {
        int i4;
        AbstractC1537c0 abstractC1537c0 = this.f14873h.f8962q;
        if (abstractC1537c0 != null) {
            i4 = abstractC1537c0.j;
        } else {
            i4 = 0;
        }
        this.f14871f = this.f14870e + i4;
        ArrayList arrayList = this.f14868c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f14871f; size--) {
            g(size);
        }
    }
}
