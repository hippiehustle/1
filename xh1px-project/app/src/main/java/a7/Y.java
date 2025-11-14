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
public final class Y extends AbstractC0803l {

    /* renamed from: p, reason: collision with root package name */
    public static final Y f7983p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0440a f7984q = new C0440a(20);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0796e f7985e;

    /* renamed from: f, reason: collision with root package name */
    public int f7986f;

    /* renamed from: g, reason: collision with root package name */
    public int f7987g;

    /* renamed from: h, reason: collision with root package name */
    public int f7988h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7989i;
    public X j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public List f7990l;

    /* renamed from: m, reason: collision with root package name */
    public int f7991m;

    /* renamed from: n, reason: collision with root package name */
    public byte f7992n;

    /* renamed from: o, reason: collision with root package name */
    public int f7993o;

    static {
        Y y4 = new Y();
        f7983p = y4;
        y4.f7987g = 0;
        y4.f7988h = 0;
        y4.f7989i = false;
        y4.j = X.INV;
        List list = Collections.EMPTY_LIST;
        y4.k = list;
        y4.f7990l = list;
    }

    public Y(W w8) {
        super(w8);
        this.f7991m = -1;
        this.f7992n = (byte) -1;
        this.f7993o = -1;
        this.f7985e = w8.f11240d;
    }

    @Override // g7.u
    public final AbstractC0793b a() {
        return f7983p;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f7992n;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        int i4 = this.f7986f;
        if ((i4 & 1) == 1) {
            if ((i4 & 2) == 2) {
                for (int i8 = 0; i8 < this.k.size(); i8++) {
                    if (!((T) this.k.get(i8)).b()) {
                        this.f7992n = (byte) 0;
                        return false;
                    }
                }
                if (!i()) {
                    this.f7992n = (byte) 0;
                    return false;
                }
                this.f7992n = (byte) 1;
                return true;
            }
            this.f7992n = (byte) 0;
            return false;
        }
        this.f7992n = (byte) 0;
        return false;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f7993o;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f7986f & 1) == 1) {
            i4 = L5.m.b(1, this.f7987g);
        } else {
            i4 = 0;
        }
        if ((this.f7986f & 2) == 2) {
            i4 += L5.m.b(2, this.f7988h);
        }
        if ((this.f7986f & 4) == 4) {
            i4 += L5.m.h(3) + 1;
        }
        if ((this.f7986f & 8) == 8) {
            i4 += L5.m.a(4, this.j.f7982d);
        }
        for (int i9 = 0; i9 < this.k.size(); i9++) {
            i4 += L5.m.d(5, (AbstractC0793b) this.k.get(i9));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f7990l.size(); i11++) {
            i10 += L5.m.c(((Integer) this.f7990l.get(i11)).intValue());
        }
        int i12 = i4 + i10;
        if (!this.f7990l.isEmpty()) {
            i12 = i12 + 1 + L5.m.c(i10);
        }
        this.f7991m = i10;
        int size = this.f7985e.size() + j() + i12;
        this.f7993o = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return W.h();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        W h8 = W.h();
        h8.i(this);
        return h8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        R3.r rVar = new R3.r(this);
        if ((this.f7986f & 1) == 1) {
            mVar.m(1, this.f7987g);
        }
        if ((this.f7986f & 2) == 2) {
            mVar.m(2, this.f7988h);
        }
        if ((this.f7986f & 4) == 4) {
            boolean z8 = this.f7989i;
            mVar.x(3, 0);
            mVar.q(z8 ? 1 : 0);
        }
        if ((this.f7986f & 8) == 8) {
            mVar.l(4, this.j.f7982d);
        }
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            mVar.o(5, (AbstractC0793b) this.k.get(i4));
        }
        if (this.f7990l.size() > 0) {
            mVar.v(50);
            mVar.v(this.f7991m);
        }
        for (int i8 = 0; i8 < this.f7990l.size(); i8++) {
            mVar.n(((Integer) this.f7990l.get(i8)).intValue());
        }
        rVar.d0(1000, mVar);
        mVar.r(this.f7985e);
    }

    public Y() {
        this.f7991m = -1;
        this.f7992n = (byte) -1;
        this.f7993o = -1;
        this.f7985e = AbstractC0796e.f11223d;
    }

    public Y(C0797f c0797f, C0799h c0799h) {
        X x8;
        this.f7991m = -1;
        this.f7992n = (byte) -1;
        this.f7993o = -1;
        this.f7987g = 0;
        this.f7988h = 0;
        this.f7989i = false;
        X x9 = X.INV;
        this.j = x9;
        List list = Collections.EMPTY_LIST;
        this.k = list;
        this.f7990l = list;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        boolean z8 = false;
        int i4 = 0;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 == 8) {
                            this.f7986f |= 1;
                            this.f7987g = c0797f.k();
                        } else if (n3 == 16) {
                            this.f7986f |= 2;
                            this.f7988h = c0797f.k();
                        } else if (n3 == 24) {
                            this.f7986f |= 4;
                            this.f7989i = c0797f.l() != 0;
                        } else if (n3 == 32) {
                            int k = c0797f.k();
                            if (k == 0) {
                                x8 = X.IN;
                            } else if (k != 1) {
                                x8 = k != 2 ? null : x9;
                            } else {
                                x8 = X.OUT;
                            }
                            if (x8 == null) {
                                j.v(n3);
                                j.v(k);
                            } else {
                                this.f7986f |= 8;
                                this.j = x8;
                            }
                        } else if (n3 == 42) {
                            if ((i4 & 16) != 16) {
                                this.k = new ArrayList();
                                i4 |= 16;
                            }
                            this.k.add(c0797f.g(T.f7933x, c0799h));
                        } else if (n3 == 48) {
                            if ((i4 & 32) != 32) {
                                this.f7990l = new ArrayList();
                                i4 |= 32;
                            }
                            this.f7990l.add(Integer.valueOf(c0797f.k()));
                        } else if (n3 != 50) {
                            if (!n(c0797f, j, c0799h, n3)) {
                            }
                        } else {
                            int d2 = c0797f.d(c0797f.k());
                            if ((i4 & 32) != 32 && c0797f.b() > 0) {
                                this.f7990l = new ArrayList();
                                i4 |= 32;
                            }
                            while (c0797f.b() > 0) {
                                this.f7990l.add(Integer.valueOf(c0797f.k()));
                            }
                            c0797f.c(d2);
                        }
                    }
                    z8 = true;
                } catch (Throwable th) {
                    if ((i4 & 16) == 16) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    if ((i4 & 32) == 32) {
                        this.f7990l = Collections.unmodifiableList(this.f7990l);
                    }
                    try {
                        j.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f7985e = c0795d.e();
                        throw th2;
                    }
                    this.f7985e = c0795d.e();
                    m();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e9) {
                e9.f12155d = this;
                throw e9;
            } catch (IOException e10) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                invalidProtocolBufferException.f12155d = this;
                throw invalidProtocolBufferException;
            }
        }
        if ((i4 & 16) == 16) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if ((i4 & 32) == 32) {
            this.f7990l = Collections.unmodifiableList(this.f7990l);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f7985e = c0795d.e();
            throw th3;
        }
        this.f7985e = c0795d.e();
        m();
    }
}
