package t0;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import P.C0267o;
import P.InterfaceC0268p;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import android.content.Context;
import android.content.IntentFilter;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import b6.C0541i;
import d6.InterfaceC0617c;
import j2.C0902b;
import j2.C0903c;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import k2.C0952b;
import k2.C0953c;
import kotlin.NoWhenBranchMatchedException;
import l2.C1001a;
import n6.InterfaceC1163b;
import v0.C1660a;
import v2.InterfaceC1661a;
import w2.C1691a;
import w7.AbstractC1741c;
import w7.AbstractC1754p;
import w7.AbstractC1759v;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1536c implements D0.b, v2.j, M0.a, InterfaceC0268p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14807d;

    /* renamed from: e, reason: collision with root package name */
    public Object f14808e;

    /* renamed from: f, reason: collision with root package name */
    public Object f14809f;

    public /* synthetic */ C1536c(Object obj, int i4, Object obj2) {
        this.f14807d = i4;
        this.f14808e = obj;
        this.f14809f = obj2;
    }

    public static w7.G g(List list) {
        if (list.isEmpty()) {
            return w7.G.f15954f;
        }
        return new w7.G(list);
    }

    @Override // v2.j
    public Object B(C0902b c0902b, InterfaceC0617c interfaceC0617c) {
        switch (this.f14807d) {
            case 13:
                Objects.toString(c0902b);
                return Z5.y.f7506a;
            default:
                return Z5.y.f7506a;
        }
    }

    @Override // v2.j
    public Object D(Context context, C1001a c1001a, List list, InterfaceC0617c interfaceC0617c) {
        switch (this.f14807d) {
            case 13:
                return Z5.y.f7506a;
            default:
                return Z5.y.f7506a;
        }
    }

    @Override // v2.j
    public Object O(InterfaceC0617c interfaceC0617c) {
        switch (this.f14807d) {
            case 13:
                return Z5.y.f7506a;
            default:
                return Z5.y.f7506a;
        }
    }

    @Override // v2.j
    public Z5.y R(InterfaceC1661a interfaceC1661a) {
        switch (this.f14807d) {
            case 13:
                if ((interfaceC1661a instanceof s2.p) && o6.j.a(((s2.p) interfaceC1661a).f14495c.f11789a, ((C0902b) ((C1691a) this.f14808e).f15676f).f11789a)) {
                    Objects.toString(interfaceC1661a);
                    ((A1.h) this.f14809f).m(interfaceC1661a);
                }
                return Z5.y.f7506a;
            default:
                return Z5.y.f7506a;
        }
    }

    public void a(s0 s0Var, C0267o c0267o) {
        t.j jVar = (t.j) this.f14808e;
        C0 c02 = (C0) jVar.get(s0Var);
        if (c02 == null) {
            c02 = C0.a();
            jVar.put(s0Var, c02);
        }
        c02.f14704c = c0267o;
        c02.f14702a |= 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8 A[Catch: all -> 0x00b9, TRY_ENTER, TryCatch #6 {all -> 0x00b9, blocks: (B:61:0x00b8, B:62:0x00bb, B:63:0x00d3), top: B:59:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb A[Catch: all -> 0x00b9, TryCatch #6 {all -> 0x00b9, blocks: (B:61:0x00b8, B:62:0x00bb, B:63:0x00d3), top: B:59:0x00b6 }] */
    @Override // D0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D0.a b(String str) {
        boolean z8;
        FileChannel fileChannel;
        FileChannel fileChannel2;
        o6.j.e(str, "fileName");
        u0.r rVar = (u0.r) this.f14809f;
        if (!str.equals(":memory:")) {
            str = rVar.f15253c.f15203a.getDatabasePath(str).getAbsolutePath();
            o6.j.b(str);
        }
        boolean z9 = true;
        if (!rVar.f15251a && !rVar.f15252b && !str.equals(":memory:")) {
            z8 = true;
        } else {
            z8 = false;
        }
        C1660a c1660a = new C1660a(str, z8);
        ReentrantLock reentrantLock = c1660a.f15484a;
        reentrantLock.lock();
        C1536c c1536c = c1660a.f15485b;
        if (c1536c != null) {
            try {
                c1536c.n();
            } catch (Throwable th) {
                th = th;
                z9 = false;
                try {
                    if (!z9) {
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            try {
                if (!rVar.f15252b) {
                    D0.a b4 = ((D0.b) this.f14808e).b(str);
                    if (!rVar.f15251a) {
                        try {
                            rVar.f15252b = true;
                            u0.r.a(rVar, b4);
                            rVar.f15252b = false;
                        } catch (Throwable th2) {
                            rVar.f15252b = false;
                            throw th2;
                        }
                    } else {
                        if (rVar.f15253c.f15209g == u0.t.f15273f) {
                            E2.b.p(b4, "PRAGMA synchronous = NORMAL");
                        } else {
                            E2.b.p(b4, "PRAGMA synchronous = FULL");
                        }
                        u0.r.b(b4);
                        rVar.f15254d.s(b4);
                    }
                    if (c1536c != null && (fileChannel2 = (FileChannel) c1536c.f14809f) != null) {
                        try {
                            fileChannel2.close();
                            c1536c.f14809f = null;
                        } finally {
                        }
                    }
                    return b4;
                }
                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
            } catch (Throwable th3) {
                if (c1536c != null && (fileChannel = (FileChannel) c1536c.f14809f) != null) {
                    try {
                        fileChannel.close();
                        c1536c.f14809f = null;
                    } finally {
                    }
                }
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            if (!z9) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        }
    }

    @Override // v2.j
    public Object c(InterfaceC0617c interfaceC0617c) {
        switch (this.f14807d) {
            case 13:
                return Z5.y.f7506a;
            default:
                return Z5.y.f7506a;
        }
    }

    @Override // v2.j
    public Object d(InterfaceC0617c interfaceC0617c) {
        switch (this.f14807d) {
            case 13:
                return Z5.y.f7506a;
            default:
                return Z5.y.f7506a;
        }
    }

    public boolean e() {
        synchronized (this) {
            if (((AtomicBoolean) this.f14809f).get()) {
                return false;
            }
            ((AtomicInteger) this.f14808e).incrementAndGet();
            return true;
        }
    }

    public void f() {
        int[] iArr = (int[]) this.f14808e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f14809f = null;
    }

    @Override // M0.a
    public View getRoot() {
        switch (this.f14807d) {
            case 19:
                return (CoordinatorLayout) this.f14808e;
            case 20:
                return (ConstraintLayout) this.f14808e;
            default:
                return (FrameLayout) this.f14808e;
        }
    }

    public void h(int i4) {
        int[] iArr = (int[]) this.f14808e;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i4, 10) + 1];
            this.f14808e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int length = iArr.length;
            while (length <= i4) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f14808e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f14808e;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View i(int i4, int i8, int i9, int i10) {
        int i11;
        A0 a02 = (A0) this.f14809f;
        B0 b02 = (B0) this.f14808e;
        int J6 = b02.J();
        int n3 = b02.n();
        if (i8 > i4) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        View view = null;
        while (i4 != i8) {
            View F2 = b02.F(i4);
            int p8 = b02.p(F2);
            int L8 = b02.L(F2);
            a02.f14692b = J6;
            a02.f14693c = n3;
            a02.f14694d = p8;
            a02.f14695e = L8;
            if (i9 != 0) {
                a02.f14691a = i9;
                if (a02.a()) {
                    return F2;
                }
            }
            if (i10 != 0) {
                a02.f14691a = i10;
                if (a02.a()) {
                    view = F2;
                }
            }
            i4 += i11;
        }
        return view;
    }

    public w7.W j(U6.a aVar) {
        w7.W m02;
        w7.z zVar = aVar.f6175f;
        if (zVar != null && (m02 = AbstractC0405a.m0(zVar)) != null) {
            return m02;
        }
        return (y7.i) ((Z5.n) this.f14808e).getValue();
    }

    public AbstractC1759v k(C6.T t8, U6.a aVar) {
        o6.j.e(t8, "typeParameter");
        o6.j.e(aVar, "typeAttr");
        return (AbstractC1759v) ((v7.e) this.f14809f).m(new w7.L(t8, aVar));
    }

    public int l(String str) {
        int i4;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f14808e;
        o6.j.e(concurrentHashMap, "<this>");
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    i4 = num2.intValue();
                } else {
                    int andIncrement = ((AtomicInteger) this.f14809f).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                    i4 = andIncrement;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i4;
    }

    public boolean m(View view) {
        A0 a02 = (A0) this.f14809f;
        B0 b02 = (B0) this.f14808e;
        int J6 = b02.J();
        int n3 = b02.n();
        int p8 = b02.p(view);
        int L8 = b02.L(view);
        a02.f14692b = J6;
        a02.f14693c = n3;
        a02.f14694d = p8;
        a02.f14695e = L8;
        a02.f14691a = 24579;
        return a02.a();
    }

    public void n() {
        String str = (String) this.f14808e;
        if (((FileChannel) this.f14809f) == null) {
            try {
                File file = new File(str);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                this.f14809f = channel;
                if (channel != null) {
                    channel.lock();
                }
            } catch (Throwable th) {
                FileChannel fileChannel = (FileChannel) this.f14809f;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                this.f14809f = null;
                throw new IllegalStateException(A.j.p("Unable to lock file: '", str, "'."), th);
            }
        }
    }

    @Override // v2.j
    public Object o(InterfaceC0617c interfaceC0617c) {
        switch (this.f14807d) {
            case 13:
                return Z5.y.f7506a;
            default:
                return Z5.y.f7506a;
        }
    }

    public void p(int i4, int i8) {
        int[] iArr = (int[]) this.f14808e;
        if (iArr != null && i4 < iArr.length) {
            int i9 = i4 + i8;
            h(i9);
            int[] iArr2 = (int[]) this.f14808e;
            System.arraycopy(iArr2, i4, iArr2, i9, (iArr2.length - i4) - i8);
            Arrays.fill((int[]) this.f14808e, i4, i9, -1);
            ArrayList arrayList = (ArrayList) this.f14809f;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    y0 y0Var = (y0) ((ArrayList) this.f14809f).get(size);
                    int i10 = y0Var.f15026d;
                    if (i10 >= i4) {
                        y0Var.f15026d = i10 + i8;
                    }
                }
            }
        }
    }

    public void q(int i4, int i8) {
        int[] iArr = (int[]) this.f14808e;
        if (iArr != null && i4 < iArr.length) {
            int i9 = i4 + i8;
            h(i9);
            int[] iArr2 = (int[]) this.f14808e;
            System.arraycopy(iArr2, i9, iArr2, i4, (iArr2.length - i4) - i8);
            int[] iArr3 = (int[]) this.f14808e;
            Arrays.fill(iArr3, iArr3.length - i8, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.f14809f;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    y0 y0Var = (y0) ((ArrayList) this.f14809f).get(size);
                    int i10 = y0Var.f15026d;
                    if (i10 >= i4) {
                        if (i10 < i9) {
                            ((ArrayList) this.f14809f).remove(size);
                        } else {
                            y0Var.f15026d = i10 - i8;
                        }
                    }
                }
            }
        }
    }

    @Override // v2.j
    public Object r(C0952b c0952b, s2.k kVar, InterfaceC0617c interfaceC0617c) {
        switch (this.f14807d) {
            case 13:
                return Z5.y.f7506a;
            default:
                if (c0952b.f11959a.equals(((C0952b) ((C1691a) this.f14808e).f15676f).f11959a)) {
                    ((A1.h) this.f14809f).m(kVar);
                }
                return Z5.y.f7506a;
        }
    }

    public C0267o s(s0 s0Var, int i4) {
        C0 c02;
        C0267o c0267o;
        t.j jVar = (t.j) this.f14808e;
        int d2 = jVar.d(s0Var);
        if (d2 >= 0 && (c02 = (C0) jVar.i(d2)) != null) {
            int i8 = c02.f14702a;
            if ((i8 & i4) != 0) {
                int i9 = i8 & (~i4);
                c02.f14702a = i9;
                if (i4 == 4) {
                    c0267o = c02.f14703b;
                } else if (i4 == 8) {
                    c0267o = c02.f14704c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i9 & 12) == 0) {
                    jVar.g(d2);
                    c02.f14702a = 0;
                    c02.f14703b = null;
                    c02.f14704c = null;
                    C0.f14701d.c(c02);
                }
                return c0267o;
            }
        }
        return null;
    }

    public void t(s0 s0Var) {
        C0 c02 = (C0) ((t.j) this.f14808e).get(s0Var);
        if (c02 == null) {
            return;
        }
        c02.f14702a &= -2;
    }

    public void u(s0 s0Var) {
        t.g gVar = (t.g) this.f14809f;
        int h8 = gVar.h() - 1;
        while (true) {
            if (h8 < 0) {
                break;
            }
            if (s0Var == gVar.i(h8)) {
                Object[] objArr = gVar.f14657f;
                Object obj = objArr[h8];
                Object obj2 = t.h.f14659a;
                if (obj != obj2) {
                    objArr[h8] = obj2;
                    gVar.f14655d = true;
                }
            } else {
                h8--;
            }
        }
        C0 c02 = (C0) ((t.j) this.f14808e).remove(s0Var);
        if (c02 != null) {
            c02.f14702a = 0;
            c02.f14703b = null;
            c02.f14704c = null;
            C0.f14701d.c(c02);
        }
    }

    @Override // v2.j
    public Object v(C0952b c0952b, InterfaceC0617c interfaceC0617c) {
        switch (this.f14807d) {
            case 13:
                Objects.toString(c0952b);
                return Z5.y.f7506a;
            default:
                return Z5.y.f7506a;
        }
    }

    public C0541i w(w7.Q q6, List list, U6.a aVar) {
        w7.W w8;
        boolean z8;
        boolean z9;
        boolean z10;
        C0541i c0541i = new C0541i();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC1759v abstractC1759v = (AbstractC1759v) it.next();
            InterfaceC0007h c6 = abstractC1759v.B0().c();
            if (c6 instanceof InterfaceC0004e) {
                Set set = aVar.f6174e;
                w7.W H02 = abstractC1759v.H0();
                if (H02 instanceof AbstractC1754p) {
                    AbstractC1754p abstractC1754p = (AbstractC1754p) H02;
                    w7.z zVar = abstractC1754p.f16006e;
                    if (!zVar.B0().e().isEmpty() && zVar.B0().c() != null) {
                        List<C6.T> e9 = zVar.B0().e();
                        o6.j.d(e9, "getParameters(...)");
                        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(e9, 10));
                        for (C6.T t8 : e9) {
                            w7.M m6 = (w7.M) AbstractC0436k.s0(t8.getIndex(), abstractC1759v.r0());
                            if (set != null && set.contains(t8)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (m6 != null && !z10) {
                                w7.O f8 = q6.f();
                                AbstractC1759v b4 = m6.b();
                                o6.j.d(b4, "getType(...)");
                                if (f8.d(b4) != null) {
                                    arrayList.add(m6);
                                }
                            }
                            m6 = new w7.E(t8);
                            arrayList.add(m6);
                        }
                        zVar = AbstractC1741c.q(zVar, arrayList, null, 2);
                    }
                    w7.z zVar2 = abstractC1754p.f16007f;
                    if (!zVar2.B0().e().isEmpty() && zVar2.B0().c() != null) {
                        List<C6.T> e10 = zVar2.B0().e();
                        o6.j.d(e10, "getParameters(...)");
                        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(e10, 10));
                        for (C6.T t9 : e10) {
                            w7.M m8 = (w7.M) AbstractC0436k.s0(t9.getIndex(), abstractC1759v.r0());
                            if (set != null && set.contains(t9)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (m8 != null && !z9) {
                                w7.O f9 = q6.f();
                                AbstractC1759v b9 = m8.b();
                                o6.j.d(b9, "getType(...)");
                                if (f9.d(b9) != null) {
                                    arrayList2.add(m8);
                                }
                            }
                            m8 = new w7.E(t9);
                            arrayList2.add(m8);
                        }
                        zVar2 = AbstractC1741c.q(zVar2, arrayList2, null, 2);
                    }
                    w8 = AbstractC1741c.e(zVar, zVar2);
                } else if (H02 instanceof w7.z) {
                    w7.z zVar3 = (w7.z) H02;
                    if (!zVar3.B0().e().isEmpty() && zVar3.B0().c() != null) {
                        List<C6.T> e11 = zVar3.B0().e();
                        o6.j.d(e11, "getParameters(...)");
                        ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(e11, 10));
                        for (C6.T t10 : e11) {
                            w7.M m9 = (w7.M) AbstractC0436k.s0(t10.getIndex(), abstractC1759v.r0());
                            if (set != null && set.contains(t10)) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (m9 != null && !z8) {
                                w7.O f10 = q6.f();
                                AbstractC1759v b10 = m9.b();
                                o6.j.d(b10, "getType(...)");
                                if (f10.d(b10) != null) {
                                    arrayList3.add(m9);
                                }
                            }
                            m9 = new w7.E(t10);
                            arrayList3.add(m9);
                        }
                        w8 = AbstractC1741c.q(zVar3, arrayList3, null, 2);
                    } else {
                        w8 = zVar3;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                c0541i.add(q6.g(AbstractC1741c.h(w8, H02), w7.X.OUT_VARIANCE));
            } else if (c6 instanceof C6.T) {
                Set set2 = aVar.f6174e;
                if (set2 != null && set2.contains(c6)) {
                    c0541i.add(j(aVar));
                } else {
                    List upperBounds = ((C6.T) c6).getUpperBounds();
                    o6.j.d(upperBounds, "getUpperBounds(...)");
                    c0541i.addAll(w(q6, upperBounds, aVar));
                }
            }
        }
        return q4.X.j(c0541i);
    }

    public void x() {
        synchronized (this) {
            ((AtomicInteger) this.f14808e).decrementAndGet();
            if (((AtomicInteger) this.f14808e).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [x5.t, java.lang.Object] */
    @Override // P.InterfaceC0268p
    public P.t0 y(View view, P.t0 t0Var) {
        x5.s sVar = (x5.s) this.f14808e;
        x5.t tVar = (x5.t) this.f14809f;
        ?? obj = new Object();
        obj.f16220a = tVar.f16220a;
        obj.f16221b = tVar.f16221b;
        obj.f16222c = tVar.f16222c;
        obj.f16223d = tVar.f16223d;
        return sVar.b(view, t0Var, obj);
    }

    public C1536c(U6.e eVar) {
        this.f14807d = 18;
        v7.k kVar = new v7.k("Type parameter upper bound erasure results");
        this.f14808e = new Z5.n(new B6.j(27, this));
        this.f14809f = kVar.b(new B6.n(26, this));
    }

    public C1536c(Object obj) {
        this.f14807d = 12;
        this.f14808e = obj;
        this.f14809f = Thread.currentThread();
    }

    public C1536c(InterfaceC1163b interfaceC1163b) {
        this.f14807d = 15;
        this.f14808e = interfaceC1163b;
        this.f14809f = new ConcurrentHashMap();
    }

    public C1536c(o1.a aVar) {
        this.f14807d = 9;
        o6.j.e(aVar, "notificationIds");
        this.f14808e = aVar;
        this.f14809f = new LinkedHashMap();
    }

    public C1536c(CoordinatorLayout coordinatorLayout, A4.d dVar, RecyclerView recyclerView) {
        this.f14807d = 19;
        this.f14808e = coordinatorLayout;
        this.f14809f = recyclerView;
    }

    public C1536c(int i4, List list) {
        this.f14807d = i4;
        switch (i4) {
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                o6.j.e(list, "triggerEvents");
                this.f14808e = list;
                this.f14809f = new LinkedHashMap();
                return;
            default:
                o6.j.e(list, "triggerEvents");
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    for (j2.g gVar : ((C0953c) it.next()).f11973f) {
                        if (gVar instanceof C0903c) {
                            concurrentHashMap.put(((C0903c) gVar).f11801d, Boolean.FALSE);
                        }
                    }
                }
                this.f14808e = concurrentHashMap;
                IntentFilter intentFilter = new IntentFilter();
                Set keySet = concurrentHashMap.keySet();
                o6.j.d(keySet, "<get-keys>(...)");
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    intentFilter.addAction((String) it2.next());
                }
                this.f14809f = new Y1.c(this, intentFilter, 1);
                return;
        }
    }

    public C1536c(String str) {
        this.f14807d = 11;
        this.f14808e = str.concat(".lck");
    }

    public C1536c(J3.s sVar) {
        this.f14807d = 10;
        this.f14808e = new AtomicInteger(0);
        this.f14809f = new AtomicBoolean(false);
    }

    public C1536c(u0.r rVar, D0.b bVar) {
        this.f14807d = 7;
        o6.j.e(bVar, "actual");
        this.f14809f = rVar;
        this.f14808e = bVar;
    }

    public C1536c(List list, List list2) {
        this.f14807d = 5;
        o6.j.e(list, "imageEvents");
        o6.j.e(list2, "triggerEvents");
        this.f14808e = new R.g(list);
        this.f14809f = new R.g(list2);
    }

    public C1536c(int i4) {
        this.f14807d = i4;
        switch (i4) {
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                this.f14808e = new t.j(0);
                this.f14809f = new t.g((Object) null);
                return;
            case 17:
                this.f14808e = new ConcurrentHashMap();
                this.f14809f = new AtomicInteger(0);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [t0.A0, java.lang.Object] */
    public C1536c(B0 b02) {
        this.f14807d = 2;
        this.f14808e = b02;
        ?? obj = new Object();
        obj.f14691a = 0;
        this.f14809f = obj;
    }
}
