package w0;

import a6.C0433h;
import android.database.SQLException;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import h6.AbstractC0837b;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class x implements u0.z, y {

    /* renamed from: a, reason: collision with root package name */
    public final j f15647a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15648b;

    /* renamed from: c, reason: collision with root package name */
    public final C0433h f15649c = new C0433h();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15650d = new AtomicBoolean(false);

    public x(j jVar, boolean z8) {
        this.f15647a = jVar;
        this.f15648b = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // u0.InterfaceC1624o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, InterfaceC1163b interfaceC1163b, AbstractC0713c abstractC0713c) {
        w wVar;
        int i4;
        j jVar;
        x xVar;
        try {
            try {
                if (abstractC0713c instanceof w) {
                    wVar = (w) abstractC0713c;
                    int i8 = wVar.f15646m;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        wVar.f15646m = i8 - Integer.MIN_VALUE;
                        Object obj = wVar.k;
                        i4 = wVar.f15646m;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                j jVar2 = wVar.j;
                                interfaceC1163b = wVar.f15644i;
                                String str2 = wVar.f15643h;
                                xVar = wVar.f15642g;
                                Z5.a.d(obj);
                                jVar = jVar2;
                                str = str2;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj);
                            if (!this.f15650d.get()) {
                                InterfaceC0622h interfaceC0622h = wVar.f10782e;
                                o6.j.b(interfaceC0622h);
                                C1683a c1683a = (C1683a) interfaceC0622h.B(C1683a.f15569e);
                                if (c1683a != null && c1683a.f15570d == this) {
                                    wVar.f15642g = this;
                                    wVar.f15643h = str;
                                    wVar.f15644i = interfaceC1163b;
                                    jVar = this.f15647a;
                                    wVar.j = jVar;
                                    wVar.f15646m = 1;
                                    Object d2 = jVar.f15596e.d(wVar);
                                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                                    if (d2 == enumC0646a) {
                                        return enumC0646a;
                                    }
                                    xVar = this;
                                } else {
                                    E2.b.M("Attempted to use connection on a different coroutine", 21);
                                    throw null;
                                }
                            } else {
                                E2.b.M("Connection is recycled", 21);
                                throw null;
                            }
                        }
                        q qVar = new q(xVar, xVar.f15647a.L(str));
                        Object m6 = interfaceC1163b.m(qVar);
                        AbstractC0837b.d(qVar, null);
                        return m6;
                    }
                }
                Object m62 = interfaceC1163b.m(qVar);
                AbstractC0837b.d(qVar, null);
                return m62;
            } finally {
            }
            q qVar2 = new q(xVar, xVar.f15647a.L(str));
        } finally {
            jVar.a(null);
        }
        wVar = new w(this, abstractC0713c);
        Object obj2 = wVar.k;
        i4 = wVar.f15646m;
        if (i4 == 0) {
        }
    }

    @Override // u0.z
    public final Object b(AbstractC0720j abstractC0720j) {
        if (!this.f15650d.get()) {
            InterfaceC0622h interfaceC0622h = abstractC0720j.f10782e;
            o6.j.b(interfaceC0622h);
            C1683a c1683a = (C1683a) interfaceC0622h.B(C1683a.f15569e);
            if (c1683a != null && c1683a.f15570d == this) {
                return Boolean.valueOf(!this.f15649c.isEmpty());
            }
            E2.b.M("Attempted to use connection on a different coroutine", 21);
            throw null;
        }
        E2.b.M("Connection is recycled", 21);
        throw null;
    }

    @Override // w0.y
    public final D0.a c() {
        return this.f15647a;
    }

    @Override // u0.z
    public final Object d(u0.y yVar, InterfaceC1164c interfaceC1164c, AbstractC0720j abstractC0720j) {
        if (!this.f15650d.get()) {
            InterfaceC0622h interfaceC0622h = abstractC0720j.f10782e;
            o6.j.b(interfaceC0622h);
            C1683a c1683a = (C1683a) interfaceC0622h.B(C1683a.f15569e);
            if (c1683a != null && c1683a.f15570d == this) {
                return g(yVar, interfaceC1164c, abstractC0720j);
            }
            E2.b.M("Attempted to use connection on a different coroutine", 21);
            throw null;
        }
        E2.b.M("Connection is recycled", 21);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x0051, B:14:0x005d, B:19:0x0068, B:20:0x0096, B:24:0x0070, B:25:0x0075, B:26:0x0076, B:27:0x007c, B:28:0x0082), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x0051, B:14:0x005d, B:19:0x0068, B:20:0x0096, B:24:0x0070, B:25:0x0075, B:26:0x0076, B:27:0x007c, B:28:0x0082), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(u0.y yVar, AbstractC0713c abstractC0713c) {
        t tVar;
        int i4;
        j jVar;
        x xVar;
        C0433h c0433h;
        try {
            if (abstractC0713c instanceof t) {
                tVar = (t) abstractC0713c;
                int i8 = tVar.f15633l;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    tVar.f15633l = i8 - Integer.MIN_VALUE;
                    Object obj = tVar.j;
                    i4 = tVar.f15633l;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            j jVar2 = tVar.f15632i;
                            u0.y yVar2 = tVar.f15631h;
                            xVar = tVar.f15630g;
                            Z5.a.d(obj);
                            jVar = jVar2;
                            yVar = yVar2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        tVar.f15630g = this;
                        tVar.f15631h = yVar;
                        jVar = this.f15647a;
                        tVar.f15632i = jVar;
                        tVar.f15633l = 1;
                        Object d2 = jVar.f15596e.d(tVar);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                        xVar = this;
                    }
                    c0433h = xVar.f15649c;
                    j jVar3 = xVar.f15647a;
                    int i9 = c0433h.f7763f;
                    if (!c0433h.isEmpty()) {
                        int ordinal = yVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    E2.b.p(jVar3, "BEGIN EXCLUSIVE TRANSACTION");
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                E2.b.p(jVar3, "BEGIN IMMEDIATE TRANSACTION");
                            }
                        } else {
                            E2.b.p(jVar3, "BEGIN DEFERRED TRANSACTION");
                        }
                    } else {
                        E2.b.p(jVar3, "SAVEPOINT '" + i9 + '\'');
                    }
                    c0433h.addLast(new s(i9));
                    Z5.y yVar3 = Z5.y.f7506a;
                    jVar.a(null);
                    return yVar3;
                }
            }
            c0433h = xVar.f15649c;
            j jVar32 = xVar.f15647a;
            int i92 = c0433h.f7763f;
            if (!c0433h.isEmpty()) {
            }
            c0433h.addLast(new s(i92));
            Z5.y yVar32 = Z5.y.f7506a;
            jVar.a(null);
            return yVar32;
        } catch (Throwable th) {
            jVar.a(null);
            throw th;
        }
        tVar = new t(this, abstractC0713c);
        Object obj2 = tVar.j;
        i4 = tVar.f15633l;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:12:0x0051, B:14:0x005b, B:16:0x0065, B:18:0x006e, B:19:0x00ab, B:23:0x0076, B:24:0x008b, B:26:0x0091, B:27:0x0097, B:28:0x00b1, B:29:0x00b8), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[Catch: all -> 0x0074, TRY_ENTER, TryCatch #0 {all -> 0x0074, blocks: (B:12:0x0051, B:14:0x005b, B:16:0x0065, B:18:0x006e, B:19:0x00ab, B:23:0x0076, B:24:0x008b, B:26:0x0091, B:27:0x0097, B:28:0x00b1, B:29:0x00b8), top: B:11:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z8, AbstractC0713c abstractC0713c) {
        u uVar;
        int i4;
        j jVar;
        x xVar;
        C0433h c0433h;
        try {
            if (abstractC0713c instanceof u) {
                uVar = (u) abstractC0713c;
                int i8 = uVar.f15637l;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    uVar.f15637l = i8 - Integer.MIN_VALUE;
                    Object obj = uVar.j;
                    i4 = uVar.f15637l;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            z8 = uVar.f15636i;
                            jVar = uVar.f15635h;
                            xVar = uVar.f15634g;
                            Z5.a.d(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        uVar.f15634g = this;
                        jVar = this.f15647a;
                        uVar.f15635h = jVar;
                        uVar.f15636i = z8;
                        uVar.f15637l = 1;
                        Object d2 = jVar.f15596e.d(uVar);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                        xVar = this;
                    }
                    c0433h = xVar.f15649c;
                    j jVar2 = xVar.f15647a;
                    if (c0433h.isEmpty()) {
                        s sVar = (s) a6.q.h0(c0433h);
                        if (z8) {
                            sVar.getClass();
                            if (c0433h.isEmpty()) {
                                E2.b.p(jVar2, "END TRANSACTION");
                            } else {
                                E2.b.p(jVar2, "RELEASE SAVEPOINT '" + sVar.f15629a + '\'');
                            }
                        } else if (c0433h.isEmpty()) {
                            E2.b.p(jVar2, "ROLLBACK TRANSACTION");
                        } else {
                            E2.b.p(jVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + sVar.f15629a + '\'');
                        }
                        Z5.y yVar = Z5.y.f7506a;
                        jVar.a(null);
                        return yVar;
                    }
                    throw new IllegalStateException("Not in a transaction");
                }
            }
            c0433h = xVar.f15649c;
            j jVar22 = xVar.f15647a;
            if (c0433h.isEmpty()) {
            }
        } catch (Throwable th) {
            jVar.a(null);
            throw th;
        }
        uVar = new u(this, abstractC0713c);
        Object obj2 = uVar.j;
        i4 = uVar.f15637l;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(u0.y yVar, InterfaceC1164c interfaceC1164c, AbstractC0713c abstractC0713c) {
        v vVar;
        Object obj;
        int i4;
        EnumC0646a enumC0646a;
        x xVar;
        x xVar2;
        int i8;
        SQLException e9;
        Throwable th;
        try {
            if (abstractC0713c instanceof v) {
                vVar = (v) abstractC0713c;
                int i9 = vVar.f15641l;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    vVar.f15641l = i9 - Integer.MIN_VALUE;
                    obj = vVar.j;
                    i4 = vVar.f15641l;
                    boolean z8 = false;
                    enumC0646a = EnumC0646a.f10656d;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3 && i4 != 4) {
                                    if (i4 != 5) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    th = (Throwable) vVar.f15639h;
                                    th = (Throwable) vVar.f15638g;
                                    try {
                                        Z5.a.d(obj);
                                        throw th;
                                    } catch (SQLException e10) {
                                        e9 = e10;
                                        if (th == null) {
                                            Z5.a.a(th, e9);
                                            throw th;
                                        }
                                        throw e9;
                                    }
                                }
                                Object obj2 = vVar.f15638g;
                                Z5.a.d(obj);
                                return obj2;
                            }
                            i8 = vVar.f15640i;
                            xVar2 = (x) vVar.f15638g;
                            try {
                                Z5.a.d(obj);
                                if (i8 != 0) {
                                    z8 = true;
                                }
                                vVar.f15638g = obj;
                                vVar.f15641l = 3;
                                if (xVar2.f(z8, vVar) == enumC0646a) {
                                    return obj;
                                }
                                return enumC0646a;
                            } catch (Throwable th2) {
                                th = th2;
                                xVar = xVar2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    try {
                                        vVar.f15638g = th;
                                        vVar.f15639h = th3;
                                        vVar.f15641l = 5;
                                        if (xVar.f(false, vVar) != enumC0646a) {
                                            throw th3;
                                        }
                                    } catch (SQLException e11) {
                                        e9 = e11;
                                        th = th3;
                                        if (th == null) {
                                        }
                                    }
                                }
                            }
                        } else {
                            interfaceC1164c = (InterfaceC1164c) vVar.f15639h;
                            xVar = (x) vVar.f15638g;
                            Z5.a.d(obj);
                        }
                    } else {
                        Z5.a.d(obj);
                        if (yVar == null) {
                            yVar = u0.y.f15292d;
                        }
                        vVar.f15638g = this;
                        vVar.f15639h = (Serializable) interfaceC1164c;
                        vVar.f15641l = 1;
                        if (e(yVar, vVar) != enumC0646a) {
                            xVar = this;
                        }
                        return enumC0646a;
                    }
                    r rVar = new r(0, xVar);
                    vVar.f15638g = xVar;
                    vVar.f15639h = null;
                    vVar.f15640i = 1;
                    vVar.f15641l = 2;
                    obj = interfaceC1164c.l(rVar, vVar);
                    if (obj != enumC0646a) {
                        xVar2 = xVar;
                        i8 = 1;
                        if (i8 != 0) {
                        }
                        vVar.f15638g = obj;
                        vVar.f15641l = 3;
                        if (xVar2.f(z8, vVar) == enumC0646a) {
                        }
                    }
                    return enumC0646a;
                }
            }
            r rVar2 = new r(0, xVar);
            vVar.f15638g = xVar;
            vVar.f15639h = null;
            vVar.f15640i = 1;
            vVar.f15641l = 2;
            obj = interfaceC1164c.l(rVar2, vVar);
            if (obj != enumC0646a) {
            }
            return enumC0646a;
        } catch (Throwable th4) {
            th = th4;
            throw th;
        }
        vVar = new v(this, abstractC0713c);
        obj = vVar.j;
        i4 = vVar.f15641l;
        boolean z82 = false;
        enumC0646a = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
    }
}
