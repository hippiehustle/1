package g0;

import a6.AbstractC0436k;
import android.view.View;
import android.view.ViewGroup;
import com.buzbuz.smartautoclicker.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: g0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744m {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f11042a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11043b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11044c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11045d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11046e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11047f;

    public C0744m(ViewGroup viewGroup) {
        o6.j.e(viewGroup, "container");
        this.f11042a = viewGroup;
        this.f11043b = new ArrayList();
        this.f11044c = new ArrayList();
    }

    public static final C0744m i(ViewGroup viewGroup, T t8) {
        o6.j.e(viewGroup, "container");
        o6.j.e(t8, "fragmentManager");
        o6.j.d(t8.J(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0744m) {
            return (C0744m) tag;
        }
        C0744m c0744m = new C0744m(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0744m);
        return c0744m;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z8;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z8 = true;
            while (it.hasNext()) {
                g0 g0Var = (g0) it.next();
                if (!g0Var.k.isEmpty()) {
                    ArrayList arrayList2 = g0Var.k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            f0 f0Var = (f0) it2.next();
                            f0Var.getClass();
                            if (!(f0Var instanceof C0740i)) {
                                break;
                            }
                        }
                    }
                }
                z8 = false;
            }
            break loop0;
        }
        if (z8) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a6.q.f0(arrayList3, ((g0) it3.next()).k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(g0 g0Var) {
        o6.j.e(g0Var, "operation");
        if (g0Var.f11030i) {
            A.j.a(g0Var.f11022a, g0Var.f11024c.P(), this.f11042a);
            g0Var.f11030i = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e3, code lost:
    
        r4 = r5.f11024c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01eb, code lost:
    
        if (r5.k.isEmpty() != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        if (r5.f11022a != 3) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:
    
        r5.f11030i = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fe, code lost:
    
        r5.j.add(new g0.C0740i(r3));
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f1, code lost:
    
        if (g0.T.K(2) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f3, code lost:
    
        java.util.Objects.toString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01df, code lost:
    
        r14.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x020a, code lost:
    
        r14 = r14.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0212, code lost:
    
        if (r14.hasNext() == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0214, code lost:
    
        r0 = (g0.C0738g) r14.next();
        r3 = (g0.g0) r0.f1023e;
        r4 = r3.f11024c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0220, code lost:
    
        if (r15 != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x022c, code lost:
    
        if (r1 == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0238, code lost:
    
        r3.j.add(new g0.C0737f(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0232, code lost:
    
        if (g0.T.K(2) == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0234, code lost:
    
        java.util.Objects.toString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0226, code lost:
    
        if (g0.T.K(2) == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0228, code lost:
    
        java.util.Objects.toString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0243, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0079, code lost:
    
        r11 = r11.getVisibility();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x007d, code lost:
    
        if (r11 == 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x007f, code lost:
    
        if (r11 == 4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0081, code lost:
    
        if (r11 != 8) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x008d, code lost:
    
        throw new java.lang.IllegalArgumentException(A.j.l("Unknown visibility ", r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r1 = (g0.g0) r1;
        r0 = r14.listIterator(r14.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r0.hasPrevious() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        r9 = r0.previous();
        r10 = (g0.g0) r9;
        r11 = r10.f11024c.K;
        o6.j.d(r11, "operation.fragment.mView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r11.getAlpha() != 0.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r11.getVisibility() != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (r10.f11022a != 2) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        r3 = (g0.g0) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (g0.T.K(2) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        java.util.Objects.toString(r1);
        java.util.Objects.toString(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        r0 = new java.util.ArrayList();
        r4 = new java.util.ArrayList();
        r5 = ((g0.g0) a6.AbstractC0436k.x0(r14)).f11024c;
        r6 = r14.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r6.hasNext() == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        r7 = ((g0.g0) r6.next()).f11024c.f11097N;
        r8 = r5.f11097N;
        r7.f11076b = r8.f11076b;
        r7.f11077c = r8.f11077c;
        r7.f11078d = r8.f11078d;
        r7.f11079e = r8.f11079e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
    
        r14 = r14.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        if (r14.hasNext() == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
    
        r5 = (g0.g0) r14.next();
        r0.add(new g0.C0738g(r5, r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f6, code lost:
    
        if (r15 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f8, code lost:
    
        if (r5 != r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fa, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        r7 = r5.f11024c;
        r8 = new D6.b(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
    
        if (r5.f11022a != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (r15 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010a, code lost:
    
        r9 = r7.f11097N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        if (r5.f11022a != 2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        if (r15 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011f, code lost:
    
        r9 = r7.f11097N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        r9 = r7.f11097N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0124, code lost:
    
        if (r6 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0126, code lost:
    
        if (r15 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0128, code lost:
    
        r6 = r7.f11097N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012e, code lost:
    
        r4.add(r8);
        r5.f11025d.add(new g0.RunnableC0735d(r13, r5, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012b, code lost:
    
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010d, code lost:
    
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0111, code lost:
    
        if (r15 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0113, code lost:
    
        r9 = r7.f11097N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
    
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fc, code lost:
    
        if (r5 != r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013d, code lost:
    
        r14 = new java.util.ArrayList();
        r15 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014a, code lost:
    
        if (r15.hasNext() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014c, code lost:
    
        r1 = r15.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0157, code lost:
    
        if (((g0.C0743l) r1).I0() != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0159, code lost:
    
        r14.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015d, code lost:
    
        r15 = new java.util.ArrayList();
        r14 = r14.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016a, code lost:
    
        if (r14.hasNext() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016c, code lost:
    
        ((g0.C0743l) r14.next()).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0176, code lost:
    
        r14 = r15.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017e, code lost:
    
        if (r14.hasNext() == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0180, code lost:
    
        ((g0.C0743l) r14.next()).getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018a, code lost:
    
        r14 = new java.util.ArrayList();
        r15 = new java.util.ArrayList();
        r1 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019c, code lost:
    
        if (r1.hasNext() == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019e, code lost:
    
        a6.q.f0(r15, ((g0.g0) ((g0.C0738g) r1.next()).f1023e).k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ae, code lost:
    
        r15 = r15.isEmpty();
        r0 = r0.iterator();
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        if (r0.hasNext() == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bd, code lost:
    
        r3 = (g0.C0738g) r0.next();
        r4 = r13.f11042a.getContext();
        r5 = (g0.g0) r3.f1023e;
        o6.j.d(r4, "context");
        r4 = r3.K0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d6, code lost:
    
        if (r4 != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01dd, code lost:
    
        if (((android.animation.AnimatorSet) r4.f5083f) != null) goto L159;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z8) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            Object obj2 = null;
            if (it.hasNext()) {
                obj = it.next();
                g0 g0Var = (g0) obj;
                View view = g0Var.f11024c.K;
                o6.j.d(view, "operation.fragment.mView");
                if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                    int visibility = view.getVisibility();
                    if (visibility != 0) {
                        if (visibility != 4 && visibility != 8) {
                            throw new IllegalArgumentException(A.j.l("Unknown visibility ", visibility));
                        }
                    } else if (g0Var.f11022a != 2) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
    }

    public final void c(List list) {
        o6.j.e(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a6.q.f0(arrayList, ((g0) it.next()).k);
        }
        List Q02 = AbstractC0436k.Q0(AbstractC0436k.V0(arrayList));
        int size = Q02.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((f0) Q02.get(i4)).b(this.f11042a);
        }
        int size2 = list.size();
        for (int i8 = 0; i8 < size2; i8++) {
            a((g0) list.get(i8));
        }
        List Q03 = AbstractC0436k.Q0(list);
        int size3 = Q03.size();
        for (int i9 = 0; i9 < size3; i9++) {
            g0 g0Var = (g0) Q03.get(i9);
            if (g0Var.k.isEmpty()) {
                g0Var.b();
            }
        }
    }

    public final void d(int i4, int i8, a0 a0Var) {
        synchronized (this.f11043b) {
            try {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = a0Var.f10972c;
                o6.j.d(abstractComponentCallbacksC0755y, "fragmentStateManager.fragment");
                g0 f8 = f(abstractComponentCallbacksC0755y);
                if (f8 == null) {
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = a0Var.f10972c;
                    if (!abstractComponentCallbacksC0755y2.f11120p && !abstractComponentCallbacksC0755y2.f11119o) {
                        f8 = null;
                    }
                    f8 = g(abstractComponentCallbacksC0755y2);
                }
                if (f8 != null) {
                    f8.d(i4, i8);
                    return;
                }
                g0 g0Var = new g0(i4, i8, a0Var);
                this.f11043b.add(g0Var);
                g0Var.f11025d.add(new RunnableC0735d(this, g0Var, 1));
                g0Var.f11025d.add(new RunnableC0735d(this, g0Var, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z8;
        if (this.f11047f) {
            return;
        }
        if (!this.f11042a.isAttachedToWindow()) {
            h();
            this.f11046e = false;
            return;
        }
        synchronized (this.f11043b) {
            try {
                ArrayList S02 = AbstractC0436k.S0(this.f11044c);
                this.f11044c.clear();
                Iterator it = S02.iterator();
                while (true) {
                    z8 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    g0 g0Var = (g0) it.next();
                    if (this.f11043b.isEmpty() || !g0Var.f11024c.f11120p) {
                        z8 = false;
                    }
                    g0Var.f11028g = z8;
                }
                Iterator it2 = S02.iterator();
                while (it2.hasNext()) {
                    g0 g0Var2 = (g0) it2.next();
                    if (this.f11045d) {
                        if (T.K(2)) {
                            Objects.toString(g0Var2);
                        }
                        g0Var2.b();
                    } else {
                        if (T.K(2)) {
                            Objects.toString(g0Var2);
                        }
                        g0Var2.a(this.f11042a);
                    }
                    this.f11045d = false;
                    if (!g0Var2.f11027f) {
                        this.f11044c.add(g0Var2);
                    }
                }
                if (!this.f11043b.isEmpty()) {
                    l();
                    ArrayList S03 = AbstractC0436k.S0(this.f11043b);
                    if (S03.isEmpty()) {
                        return;
                    }
                    this.f11043b.clear();
                    this.f11044c.addAll(S03);
                    b(S03, this.f11046e);
                    boolean j = j(S03);
                    Iterator it3 = S03.iterator();
                    boolean z9 = true;
                    while (it3.hasNext()) {
                        if (!((g0) it3.next()).f11024c.f11120p) {
                            z9 = false;
                        }
                    }
                    if (!z9 || j) {
                        z8 = false;
                    }
                    this.f11045d = z8;
                    if (!z9) {
                        k(S03);
                        c(S03);
                    } else if (j) {
                        k(S03);
                        int size = S03.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            a((g0) S03.get(i4));
                        }
                    }
                    this.f11046e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final g0 f(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        Object obj;
        Iterator it = this.f11043b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                g0 g0Var = (g0) obj;
                if (o6.j.a(g0Var.f11024c, abstractComponentCallbacksC0755y) && !g0Var.f11026e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (g0) obj;
    }

    public final g0 g(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        Object obj;
        Iterator it = this.f11044c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                g0 g0Var = (g0) obj;
                if (o6.j.a(g0Var.f11024c, abstractComponentCallbacksC0755y) && !g0Var.f11026e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (g0) obj;
    }

    public final void h() {
        boolean isAttachedToWindow = this.f11042a.isAttachedToWindow();
        synchronized (this.f11043b) {
            try {
                l();
                k(this.f11043b);
                ArrayList S02 = AbstractC0436k.S0(this.f11044c);
                Iterator it = S02.iterator();
                while (it.hasNext()) {
                    ((g0) it.next()).f11028g = false;
                }
                Iterator it2 = S02.iterator();
                while (it2.hasNext()) {
                    g0 g0Var = (g0) it2.next();
                    if (T.K(2)) {
                        if (!isAttachedToWindow) {
                            Objects.toString(this.f11042a);
                        }
                        Objects.toString(g0Var);
                    }
                    g0Var.a(this.f11042a);
                }
                ArrayList S03 = AbstractC0436k.S0(this.f11043b);
                Iterator it3 = S03.iterator();
                while (it3.hasNext()) {
                    ((g0) it3.next()).f11028g = false;
                }
                Iterator it4 = S03.iterator();
                while (it4.hasNext()) {
                    g0 g0Var2 = (g0) it4.next();
                    if (T.K(2)) {
                        if (!isAttachedToWindow) {
                            Objects.toString(this.f11042a);
                        }
                        Objects.toString(g0Var2);
                    }
                    g0Var2.a(this.f11042a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(List list) {
        float f8;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            g0 g0Var = (g0) list.get(i4);
            a0 a0Var = g0Var.f11031l;
            if (!g0Var.f11029h) {
                g0Var.f11029h = true;
                int i8 = g0Var.f11023b;
                if (i8 == 2) {
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = a0Var.f10972c;
                    o6.j.d(abstractComponentCallbacksC0755y, "fragmentStateManager.fragment");
                    View findFocus = abstractComponentCallbacksC0755y.K.findFocus();
                    if (findFocus != null) {
                        abstractComponentCallbacksC0755y.h().k = findFocus;
                        if (T.K(2)) {
                            findFocus.toString();
                            abstractComponentCallbacksC0755y.toString();
                        }
                    }
                    View P4 = g0Var.f11024c.P();
                    if (P4.getParent() == null) {
                        if (T.K(2)) {
                            abstractComponentCallbacksC0755y.toString();
                            P4.toString();
                        }
                        a0Var.b();
                        P4.setAlpha(0.0f);
                    }
                    if (P4.getAlpha() == 0.0f && P4.getVisibility() == 0) {
                        if (T.K(2)) {
                            P4.toString();
                        }
                        P4.setVisibility(4);
                    }
                    C0753w c0753w = abstractComponentCallbacksC0755y.f11097N;
                    if (c0753w == null) {
                        f8 = 1.0f;
                    } else {
                        f8 = c0753w.j;
                    }
                    P4.setAlpha(f8);
                    T.K(2);
                } else if (i8 == 3) {
                    AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = a0Var.f10972c;
                    o6.j.d(abstractComponentCallbacksC0755y2, "fragmentStateManager.fragment");
                    View P5 = abstractComponentCallbacksC0755y2.P();
                    if (T.K(2)) {
                        Objects.toString(P5.findFocus());
                        P5.toString();
                        abstractComponentCallbacksC0755y2.toString();
                    }
                    P5.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a6.q.f0(arrayList, ((g0) it.next()).k);
        }
        List Q02 = AbstractC0436k.Q0(AbstractC0436k.V0(arrayList));
        int size2 = Q02.size();
        for (int i9 = 0; i9 < size2; i9++) {
            f0 f0Var = (f0) Q02.get(i9);
            f0Var.getClass();
            ViewGroup viewGroup = this.f11042a;
            o6.j.e(viewGroup, "container");
            if (!f0Var.f11017a) {
                f0Var.d(viewGroup);
            }
            f0Var.f11017a = true;
        }
    }

    public final void l() {
        Iterator it = this.f11043b.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            int i4 = 2;
            if (g0Var.f11023b == 2) {
                int visibility = g0Var.f11024c.P().getVisibility();
                if (visibility != 0) {
                    i4 = 4;
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i4 = 3;
                        } else {
                            throw new IllegalArgumentException(A.j.l("Unknown visibility ", visibility));
                        }
                    }
                }
                g0Var.d(i4, 1);
            }
        }
    }
}
