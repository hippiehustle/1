package w0;

import L7.AbstractC0166y;
import android.database.SQLException;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import n6.InterfaceC1162a;
import n6.InterfaceC1164c;
import t0.C1536c;
import t7.C1594d;

/* loaded from: classes.dex */
public final class i implements InterfaceC1684b {

    /* renamed from: d, reason: collision with root package name */
    public final p f15590d;

    /* renamed from: e, reason: collision with root package name */
    public final p f15591e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreadLocal f15592f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f15593g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15594h;

    public i(C1536c c1536c) {
        this.f15592f = new ThreadLocal();
        this.f15593g = new AtomicBoolean(false);
        int i4 = J7.a.f2503g;
        this.f15594h = J7.f.l(30, J7.c.SECONDS);
        p pVar = new p(1, new C1686d(0, c1536c));
        this.f15590d = pVar;
        this.f15591e = pVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f15593g.compareAndSet(false, true)) {
            this.f15590d.c();
            this.f15591e.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0180 A[Catch: all -> 0x0197, TRY_LEAVE, TryCatch #3 {all -> 0x0197, blocks: (B:16:0x017a, B:18:0x0180, B:24:0x018c, B:21:0x0190), top: B:15:0x017a }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0147 A[Catch: all -> 0x0198, TRY_LEAVE, TryCatch #4 {all -> 0x0198, blocks: (B:60:0x011e, B:64:0x013c, B:66:0x0147, B:70:0x019c, B:71:0x01a3, B:106:0x00f7), top: B:105:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c A[Catch: all -> 0x0198, TRY_ENTER, TryCatch #4 {all -> 0x0198, blocks: (B:60:0x011e, B:64:0x013c, B:66:0x0147, B:70:0x019c, B:71:0x01a3, B:106:0x00f7), top: B:105:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, o6.u] */
    /* JADX WARN: Type inference failed for: r9v1, types: [w0.e] */
    @Override // w0.InterfaceC1684b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(boolean z8, InterfaceC1164c interfaceC1164c, AbstractC0713c abstractC0713c) {
        f fVar;
        int i4;
        p pVar;
        Throwable th;
        p pVar2;
        Object b4;
        i iVar;
        InterfaceC1164c interfaceC1164c2;
        o6.u uVar;
        o6.u uVar2;
        p pVar3;
        boolean z9;
        Object obj;
        o6.u uVar3;
        o6.u uVar4;
        x xVar;
        final boolean z10 = z8;
        if (abstractC0713c instanceof f) {
            fVar = (f) abstractC0713c;
            int i8 = fVar.f15585p;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f15585p = i8 - Integer.MIN_VALUE;
                InterfaceC0622h interfaceC0622h = fVar.f10782e;
                Object obj2 = fVar.f15583n;
                i4 = fVar.f15585p;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    uVar3 = (o6.u) fVar.f15579h;
                                    pVar2 = (p) fVar.f15578g;
                                    try {
                                        Z5.a.d(obj2);
                                        try {
                                            xVar = (x) uVar3.f13642d;
                                            if (xVar != null) {
                                                j jVar = xVar.f15647a;
                                                if (xVar.f15650d.compareAndSet(false, true)) {
                                                    try {
                                                        E2.b.p(jVar, "ROLLBACK TRANSACTION");
                                                    } catch (SQLException unused) {
                                                    }
                                                }
                                                jVar.f15597f = null;
                                                jVar.f15598g = null;
                                                pVar2.e(jVar);
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                        return obj2;
                                    } catch (Throwable th2) {
                                        uVar4 = uVar3;
                                        th = th2;
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                z10 = fVar.f15582m;
                                uVar = fVar.f15581l;
                                interfaceC0622h = fVar.k;
                                o6.u uVar5 = fVar.j;
                                p pVar4 = fVar.f15580i;
                                interfaceC1164c2 = (InterfaceC1164c) fVar.f15579h;
                                i iVar2 = (i) fVar.f15578g;
                                try {
                                    Z5.a.d(obj2);
                                    b4 = obj2;
                                    pVar3 = pVar4;
                                    iVar = iVar2;
                                    uVar2 = uVar5;
                                } catch (Throwable th3) {
                                    th = th3;
                                    pVar2 = pVar4;
                                    uVar4 = uVar5;
                                }
                            }
                            try {
                                throw th;
                            } finally {
                            }
                        } else {
                            Z5.a.d(obj2);
                            return obj2;
                        }
                    } else {
                        Z5.a.d(obj2);
                        return obj2;
                    }
                } else {
                    Z5.a.d(obj2);
                    if (!this.f15593g.get()) {
                        ThreadLocal threadLocal = this.f15592f;
                        x xVar2 = (x) threadLocal.get();
                        C1594d c1594d = C1683a.f15569e;
                        if (xVar2 == null) {
                            o6.j.b(interfaceC0622h);
                            C1683a c1683a = (C1683a) interfaceC0622h.B(c1594d);
                            if (c1683a != null) {
                                xVar2 = c1683a.f15570d;
                            } else {
                                xVar2 = null;
                            }
                        }
                        if (xVar2 != null) {
                            if (!z10 && xVar2.f15648b) {
                                E2.b.M("Cannot upgrade connection from reader to writer", 1);
                                throw null;
                            }
                            o6.j.b(interfaceC0622h);
                            if (interfaceC0622h.B(c1594d) == null) {
                                C1683a c1683a2 = new C1683a(xVar2);
                                o6.j.e(threadLocal, "<this>");
                                InterfaceC0622h C8 = E2.d.C(c1683a2, new Q7.v(xVar2, threadLocal));
                                g gVar = new g(interfaceC1164c, xVar2, null);
                                fVar.f15585p = 1;
                                Object A2 = AbstractC0166y.A(C8, gVar, fVar);
                                if (A2 != enumC0646a) {
                                    return A2;
                                }
                            } else {
                                fVar.f15585p = 2;
                                Object l6 = interfaceC1164c.l(xVar2, fVar);
                                if (l6 != enumC0646a) {
                                    return l6;
                                }
                            }
                        } else {
                            if (z10) {
                                pVar = this.f15590d;
                            } else {
                                pVar = this.f15591e;
                            }
                            ?? obj3 = new Object();
                            try {
                                o6.j.b(interfaceC0622h);
                                long j = this.f15594h;
                                ?? r9 = new InterfaceC1162a() { // from class: w0.e
                                    @Override // n6.InterfaceC1162a
                                    public final Object a() {
                                        String str;
                                        if (z10) {
                                            str = "reader";
                                        } else {
                                            str = "writer";
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Timed out attempting to acquire a " + str + " connection.");
                                        sb.append("\n\nWriter pool:\n");
                                        i iVar3 = i.this;
                                        iVar3.f15591e.d(sb);
                                        sb.append("Reader pool:");
                                        sb.append('\n');
                                        iVar3.f15590d.d(sb);
                                        try {
                                            E2.b.M(sb.toString(), 5);
                                            throw null;
                                        } catch (SQLException e9) {
                                            e9.printStackTrace();
                                            return Z5.y.f7506a;
                                        }
                                    }
                                };
                                fVar.f15578g = this;
                                fVar.f15579h = (Serializable) interfaceC1164c;
                                fVar.f15580i = pVar;
                                fVar.j = obj3;
                                fVar.k = interfaceC0622h;
                                fVar.f15581l = obj3;
                                fVar.f15582m = z10;
                                fVar.f15585p = 3;
                                b4 = pVar.b(j, r9, fVar);
                                if (b4 != enumC0646a) {
                                    iVar = this;
                                    interfaceC1164c2 = interfaceC1164c;
                                    uVar = obj3;
                                    pVar3 = pVar;
                                    uVar2 = obj3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                pVar2 = pVar;
                                uVar4 = obj3;
                            }
                        }
                        return enumC0646a;
                    }
                    E2.b.M("Connection pool is closed", 21);
                    throw null;
                }
                j jVar2 = (j) b4;
                jVar2.getClass();
                o6.j.e(interfaceC0622h, "context");
                jVar2.f15597f = interfaceC0622h;
                jVar2.f15598g = new Throwable();
                if (iVar.f15590d == iVar.f15591e && z10) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                uVar.f13642d = new x(jVar2, z9);
                obj = uVar2.f13642d;
                if (obj == null) {
                    x xVar3 = (x) obj;
                    C1683a c1683a3 = new C1683a(xVar3);
                    ThreadLocal threadLocal2 = iVar.f15592f;
                    o6.j.e(threadLocal2, "<this>");
                    InterfaceC0622h C9 = E2.d.C(c1683a3, new Q7.v(xVar3, threadLocal2));
                    h hVar = new h(interfaceC1164c2, uVar2, null);
                    fVar.f15578g = pVar3;
                    fVar.f15579h = uVar2;
                    fVar.f15580i = null;
                    fVar.j = null;
                    fVar.k = null;
                    fVar.f15581l = null;
                    fVar.f15585p = 4;
                    Object A8 = AbstractC0166y.A(C9, hVar, fVar);
                    if (A8 != enumC0646a) {
                        pVar2 = pVar3;
                        uVar3 = uVar2;
                        obj2 = A8;
                        xVar = (x) uVar3.f13642d;
                        if (xVar != null) {
                        }
                        return obj2;
                    }
                    return enumC0646a;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        fVar = new f(this, abstractC0713c);
        InterfaceC0622h interfaceC0622h2 = fVar.f10782e;
        Object obj22 = fVar.f15583n;
        i4 = fVar.f15585p;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        j jVar22 = (j) b4;
        jVar22.getClass();
        o6.j.e(interfaceC0622h2, "context");
        jVar22.f15597f = interfaceC0622h2;
        jVar22.f15598g = new Throwable();
        if (iVar.f15590d == iVar.f15591e) {
        }
        z9 = false;
        uVar.f13642d = new x(jVar22, z9);
        obj = uVar2.f13642d;
        if (obj == null) {
        }
    }

    public i(final C1536c c1536c, final String str, int i4) {
        o6.j.e(str, "fileName");
        this.f15592f = new ThreadLocal();
        final int i8 = 0;
        this.f15593g = new AtomicBoolean(false);
        int i9 = J7.a.f2503g;
        this.f15594h = J7.f.l(30, J7.c.SECONDS);
        if (i4 > 0) {
            this.f15590d = new p(i4, new InterfaceC1162a() { // from class: w0.c
                @Override // n6.InterfaceC1162a
                public final Object a() {
                    switch (i8) {
                        case 0:
                            D0.a b4 = c1536c.b(str);
                            E2.b.p(b4, "PRAGMA query_only = 1");
                            return b4;
                        default:
                            return c1536c.b(str);
                    }
                }
            });
            final int i10 = 1;
            this.f15591e = new p(1, new InterfaceC1162a() { // from class: w0.c
                @Override // n6.InterfaceC1162a
                public final Object a() {
                    switch (i10) {
                        case 0:
                            D0.a b4 = c1536c.b(str);
                            E2.b.p(b4, "PRAGMA query_only = 1");
                            return b4;
                        default:
                            return c1536c.b(str);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
