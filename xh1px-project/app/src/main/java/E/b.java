package E;

import L7.AbstractC0166y;
import L7.C0150h;
import L7.S;
import P.O;
import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.textview.MaterialTextView;
import d6.C0623i;
import g0.L;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import t0.C1527A;
import t0.C1530D;
import t0.C1539e;
import t0.C1540f;
import t0.C1549o;
import t0.C1550p;
import t0.C1551q;
import t0.RunnableC1538d;
import t0.Z;
import t0.s0;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1082d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1083e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1084f;

    public b(View view, A4.c cVar, o6.s sVar) {
        this.f1082d = 3;
        this.f1083e = cVar;
        this.f1084f = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr;
        int i4;
        int[] iArr;
        ArrayList arrayList;
        int i8 = 1;
        switch (this.f1082d) {
            case 0:
                ((c) this.f1083e).f1085a = this.f1084f;
                return;
            case 1:
                ((Application) this.f1084f).unregisterActivityLifecycleCallbacks((c) this.f1083e);
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                Object obj = this.f1083e;
                Object obj2 = this.f1084f;
                try {
                    Method method = d.f1094d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        d.f1095e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e9) {
                    if (e9.getClass() == RuntimeException.class && e9.getMessage() != null && e9.getMessage().startsWith("Unable to stop")) {
                        throw e9;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                ((MaterialTextView) ((A4.c) this.f1083e).f292f).setLines(((o6.s) this.f1084f).f13640d);
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                ((C0150h) this.f1084f).D((S) this.f1083e);
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                W0.c cVar = (W0.c) this.f1083e;
                Typeface typeface = (Typeface) this.f1084f;
                G.b bVar = (G.b) cVar.f6486e;
                if (bVar != null) {
                    bVar.h(typeface);
                    return;
                }
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((M.f) this.f1083e).accept(this.f1084f);
                return;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                int i9 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f1083e).run();
                    } catch (Throwable th2) {
                        try {
                            AbstractC0166y.n(C0623i.f10448d, th2);
                        } catch (Throwable th3) {
                            Q7.g gVar = (Q7.g) this.f1084f;
                            synchronized (gVar.j) {
                                Q7.g.k.decrementAndGet(gVar);
                                throw th3;
                            }
                        }
                    }
                    Runnable R5 = ((Q7.g) this.f1084f).R();
                    if (R5 != null) {
                        this.f1083e = R5;
                        i9++;
                        if (i9 >= 16) {
                            Q7.g gVar2 = (Q7.g) this.f1084f;
                            if (Q7.b.j(gVar2.f4946g, gVar2)) {
                                Q7.g gVar3 = (Q7.g) this.f1084f;
                                Q7.b.i(gVar3.f4946g, gVar3, this);
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                W.e eVar = ((SwipeDismissBehavior) this.f1084f).f9929a;
                if (eVar != null && eVar.f()) {
                    View view = (View) this.f1083e;
                    WeakHashMap weakHashMap = O.f4214a;
                    view.postOnAnimation(this);
                    return;
                }
                return;
            case 9:
                RunnableC1538d runnableC1538d = (RunnableC1538d) this.f1084f;
                C1539e c1539e = runnableC1538d.f14826g;
                if (c1539e.f14838g == runnableC1538d.f14825f) {
                    List list = runnableC1538d.f14824e;
                    C1550p c1550p = (C1550p) this.f1083e;
                    c1539e.f14836e = list;
                    c1539e.f14837f = Collections.unmodifiableList(list);
                    L l6 = c1539e.f14832a;
                    int[] iArr2 = c1550p.f14925b;
                    ArrayList arrayList2 = c1550p.f14924a;
                    int i10 = c1550p.f14928e;
                    W5.a aVar = c1550p.f14927d;
                    C1540f c1540f = new C1540f(l6);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i11 = c1550p.f14929f;
                    int size = arrayList2.size() - 1;
                    int i12 = i11;
                    int i13 = i10;
                    while (size >= 0) {
                        C1549o c1549o = (C1549o) arrayList2.get(size);
                        int i14 = c1549o.f14909a;
                        int i15 = i8;
                        int i16 = c1549o.f14911c;
                        int i17 = i14 + i16;
                        int i18 = c1549o.f14910b;
                        C1539e c1539e2 = c1539e;
                        int i19 = i18 + i16;
                        while (i13 > i17) {
                            i13--;
                            int i20 = iArr2[i13];
                            if ((i20 & 12) != 0) {
                                i4 = i17;
                                int i21 = i20 >> 4;
                                iArr = iArr2;
                                arrayList = arrayList2;
                                C1551q a3 = C1550p.a(arrayDeque, i21, false);
                                if (a3 != null) {
                                    int i22 = (i10 - a3.f14932b) - 1;
                                    c1540f.k(i13, i22);
                                    if ((i20 & 4) != 0) {
                                        aVar.H(i13, i21);
                                        c1540f.G(i22, i15);
                                    }
                                } else {
                                    boolean z8 = i15;
                                    arrayDeque.add(new C1551q(i13, (i10 - i13) - (z8 ? 1 : 0), z8));
                                }
                            } else {
                                i4 = i17;
                                iArr = iArr2;
                                arrayList = arrayList2;
                                c1540f.j(i13, i15);
                                i10--;
                            }
                            i17 = i4;
                            iArr2 = iArr;
                            arrayList2 = arrayList;
                            i15 = 1;
                        }
                        int[] iArr3 = iArr2;
                        ArrayList arrayList3 = arrayList2;
                        while (i12 > i19) {
                            i12--;
                            int i23 = c1550p.f14926c[i12];
                            if ((i23 & 12) != 0) {
                                int i24 = i23 >> 4;
                                if (C1550p.a(arrayDeque, i24, true) == null) {
                                    objArr = true;
                                    arrayDeque.add(new C1551q(i12, i10 - i13, false));
                                } else {
                                    objArr = true;
                                    c1540f.k((i10 - r2.f14932b) - 1, i13);
                                    if ((i23 & 4) != 0) {
                                        aVar.H(i24, i12);
                                        c1540f.G(i13, 1);
                                    }
                                }
                            } else {
                                c1540f.H(i13, 1);
                                i10++;
                            }
                        }
                        int i25 = i18;
                        int i26 = i14;
                        for (int i27 = 0; i27 < i16; i27++) {
                            if ((iArr3[i26] & 15) == 2) {
                                aVar.H(i26, i25);
                                c1540f.G(i26, 1);
                            }
                            i26++;
                            i25++;
                        }
                        size--;
                        i12 = i18;
                        i13 = i14;
                        c1539e = c1539e2;
                        iArr2 = iArr3;
                        arrayList2 = arrayList3;
                        i8 = 1;
                    }
                    c1540f.a();
                    c1539e.a();
                    return;
                }
                return;
            default:
                C1527A c1527a = (C1527A) this.f1083e;
                s0 s0Var = c1527a.f14681e;
                C1530D c1530d = (C1530D) this.f1084f;
                RecyclerView recyclerView = c1530d.f14722r;
                if (recyclerView != null && recyclerView.f8972v && !c1527a.k && s0Var.b() != -1) {
                    Z itemAnimator = c1530d.f14722r.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.f()) {
                        ArrayList arrayList4 = c1530d.f14720p;
                        int size2 = arrayList4.size();
                        for (int i28 = 0; i28 < size2; i28++) {
                            if (((C1527A) arrayList4.get(i28)).f14686l) {
                            }
                        }
                        c1530d.f14717m.g(s0Var);
                        return;
                    }
                    c1530d.f14722r.post(this);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ b(Object obj, int i4, Object obj2) {
        this.f1082d = i4;
        this.f1083e = obj;
        this.f1084f = obj2;
    }

    public /* synthetic */ b(Object obj, Object obj2, int i4, boolean z8) {
        this.f1082d = i4;
        this.f1084f = obj;
        this.f1083e = obj2;
    }

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z8) {
        this.f1082d = 8;
        this.f1084f = swipeDismissBehavior;
        this.f1083e = view;
    }

    public b(C1530D c1530d, C1527A c1527a, int i4) {
        this.f1082d = 10;
        this.f1084f = c1530d;
        this.f1083e = c1527a;
    }
}
