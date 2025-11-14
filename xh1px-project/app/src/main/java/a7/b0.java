package a7;

import g7.AbstractC0793b;
import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.AbstractC0803l;
import g7.C0795d;
import g7.C0797f;
import g7.C0799h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class b0 extends AbstractC0803l {

    /* renamed from: q, reason: collision with root package name */
    public static final b0 f8012q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0440a f8013r = new C0440a(22);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0796e f8014e;

    /* renamed from: f, reason: collision with root package name */
    public int f8015f;

    /* renamed from: g, reason: collision with root package name */
    public int f8016g;

    /* renamed from: h, reason: collision with root package name */
    public int f8017h;

    /* renamed from: i, reason: collision with root package name */
    public T f8018i;
    public int j;
    public T k;

    /* renamed from: l, reason: collision with root package name */
    public int f8019l;

    /* renamed from: m, reason: collision with root package name */
    public List f8020m;

    /* renamed from: n, reason: collision with root package name */
    public C0444e f8021n;

    /* renamed from: o, reason: collision with root package name */
    public byte f8022o;

    /* renamed from: p, reason: collision with root package name */
    public int f8023p;

    static {
        b0 b0Var = new b0();
        f8012q = b0Var;
        b0Var.f8016g = 0;
        b0Var.f8017h = 0;
        T t8 = T.f7932w;
        b0Var.f8018i = t8;
        b0Var.j = 0;
        b0Var.k = t8;
        b0Var.f8019l = 0;
        b0Var.f8020m = Collections.EMPTY_LIST;
        b0Var.f8021n = C0444e.f8057s;
    }

    public b0(a0 a0Var) {
        super(a0Var);
        this.f8022o = (byte) -1;
        this.f8023p = -1;
        this.f8014e = a0Var.f11240d;
    }

    @Override // g7.u
    public final AbstractC0793b a() {
        return f8012q;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f8022o;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        int i4 = this.f8015f;
        if ((i4 & 2) == 2) {
            if ((i4 & 4) == 4 && !this.f8018i.b()) {
                this.f8022o = (byte) 0;
                return false;
            }
            if ((this.f8015f & 16) == 16 && !this.k.b()) {
                this.f8022o = (byte) 0;
                return false;
            }
            for (int i8 = 0; i8 < this.f8020m.size(); i8++) {
                if (!((C0447h) this.f8020m.get(i8)).b()) {
                    this.f8022o = (byte) 0;
                    return false;
                }
            }
            if ((this.f8015f & 64) == 64 && !this.f8021n.b()) {
                this.f8022o = (byte) 0;
                return false;
            }
            if (!i()) {
                this.f8022o = (byte) 0;
                return false;
            }
            this.f8022o = (byte) 1;
            return true;
        }
        this.f8022o = (byte) 0;
        return false;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f8023p;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f8015f & 1) == 1) {
            i4 = L5.m.b(1, this.f8016g);
        } else {
            i4 = 0;
        }
        if ((this.f8015f & 2) == 2) {
            i4 += L5.m.b(2, this.f8017h);
        }
        if ((this.f8015f & 4) == 4) {
            i4 += L5.m.d(3, this.f8018i);
        }
        if ((this.f8015f & 16) == 16) {
            i4 += L5.m.d(4, this.k);
        }
        if ((this.f8015f & 8) == 8) {
            i4 += L5.m.b(5, this.j);
        }
        if ((this.f8015f & 32) == 32) {
            i4 += L5.m.b(6, this.f8019l);
        }
        for (int i9 = 0; i9 < this.f8020m.size(); i9++) {
            i4 += L5.m.d(7, (AbstractC0793b) this.f8020m.get(i9));
        }
        if ((this.f8015f & 64) == 64) {
            i4 += L5.m.d(8, this.f8021n);
        }
        int size = this.f8014e.size() + j() + i4;
        this.f8023p = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return a0.h();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        a0 h8 = a0.h();
        h8.i(this);
        return h8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        R3.r rVar = new R3.r(this);
        if ((this.f8015f & 1) == 1) {
            mVar.m(1, this.f8016g);
        }
        if ((this.f8015f & 2) == 2) {
            mVar.m(2, this.f8017h);
        }
        if ((this.f8015f & 4) == 4) {
            mVar.o(3, this.f8018i);
        }
        if ((this.f8015f & 16) == 16) {
            mVar.o(4, this.k);
        }
        if ((this.f8015f & 8) == 8) {
            mVar.m(5, this.j);
        }
        if ((this.f8015f & 32) == 32) {
            mVar.m(6, this.f8019l);
        }
        for (int i4 = 0; i4 < this.f8020m.size(); i4++) {
            mVar.o(7, (AbstractC0793b) this.f8020m.get(i4));
        }
        if ((this.f8015f & 64) == 64) {
            mVar.o(8, this.f8021n);
        }
        rVar.d0(200, mVar);
        mVar.r(this.f8014e);
    }

    public final a0 p() {
        a0 h8 = a0.h();
        h8.i(this);
        return h8;
    }

    public b0() {
        this.f8022o = (byte) -1;
        this.f8023p = -1;
        this.f8014e = AbstractC0796e.f11223d;
    }

    public b0(C0797f c0797f, C0799h c0799h) {
        this.f8022o = (byte) -1;
        this.f8023p = -1;
        boolean z8 = false;
        this.f8016g = 0;
        this.f8017h = 0;
        T t8 = T.f7932w;
        this.f8018i = t8;
        this.j = 0;
        this.k = t8;
        this.f8019l = 0;
        this.f8020m = Collections.EMPTY_LIST;
        this.f8021n = C0444e.f8057s;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        char c6 = 0;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 == 8) {
                            this.f8015f |= 1;
                            this.f8016g = c0797f.k();
                        } else if (n3 != 16) {
                            C0442c c0442c = null;
                            S s8 = null;
                            S s9 = null;
                            if (n3 == 26) {
                                if ((this.f8015f & 4) == 4) {
                                    T t9 = this.f8018i;
                                    t9.getClass();
                                    s8 = T.r(t9);
                                }
                                T t10 = (T) c0797f.g(T.f7933x, c0799h);
                                this.f8018i = t10;
                                if (s8 != null) {
                                    s8.i(t10);
                                    this.f8018i = s8.g();
                                }
                                this.f8015f |= 4;
                            } else if (n3 == 34) {
                                if ((this.f8015f & 16) == 16) {
                                    T t11 = this.k;
                                    t11.getClass();
                                    s9 = T.r(t11);
                                }
                                T t12 = (T) c0797f.g(T.f7933x, c0799h);
                                this.k = t12;
                                if (s9 != null) {
                                    s9.i(t12);
                                    this.k = s9.g();
                                }
                                this.f8015f |= 16;
                            } else if (n3 == 40) {
                                this.f8015f |= 8;
                                this.j = c0797f.k();
                            } else if (n3 == 48) {
                                this.f8015f |= 32;
                                this.f8019l = c0797f.k();
                            } else if (n3 == 58) {
                                int i4 = (c6 == true ? 1 : 0) & '@';
                                c6 = c6;
                                if (i4 != 64) {
                                    this.f8020m = new ArrayList();
                                    c6 = '@';
                                }
                                this.f8020m.add(c0797f.g(C0447h.k, c0799h));
                            } else if (n3 != 66) {
                                if (!n(c0797f, j, c0799h, n3)) {
                                }
                            } else {
                                if ((this.f8015f & 64) == 64) {
                                    C0444e c0444e = this.f8021n;
                                    c0444e.getClass();
                                    c0442c = C0444e.j(c0444e);
                                }
                                C0444e c0444e2 = (C0444e) c0797f.g(C0444e.f8058t, c0799h);
                                this.f8021n = c0444e2;
                                if (c0442c != null) {
                                    c0442c.h(c0444e2);
                                    this.f8021n = c0442c.f();
                                }
                                this.f8015f |= 64;
                            }
                        } else {
                            this.f8015f |= 2;
                            this.f8017h = c0797f.k();
                        }
                    }
                    z8 = true;
                } catch (InvalidProtocolBufferException e9) {
                    e9.f12155d = this;
                    throw e9;
                } catch (IOException e10) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                    invalidProtocolBufferException.f12155d = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if (((c6 == true ? 1 : 0) & '@') == 64) {
                    this.f8020m = Collections.unmodifiableList(this.f8020m);
                }
                try {
                    j.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8014e = c0795d.e();
                    throw th2;
                }
                this.f8014e = c0795d.e();
                m();
                throw th;
            }
        }
        if (((c6 == true ? 1 : 0) & '@') == 64) {
            this.f8020m = Collections.unmodifiableList(this.f8020m);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8014e = c0795d.e();
            throw th3;
        }
        this.f8014e = c0795d.e();
        m();
    }
}
