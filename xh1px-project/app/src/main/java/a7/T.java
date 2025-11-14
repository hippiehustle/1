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
public final class T extends AbstractC0803l {

    /* renamed from: w, reason: collision with root package name */
    public static final T f7932w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0440a f7933x = new C0440a(17);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0796e f7934e;

    /* renamed from: f, reason: collision with root package name */
    public int f7935f;

    /* renamed from: g, reason: collision with root package name */
    public List f7936g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7937h;

    /* renamed from: i, reason: collision with root package name */
    public int f7938i;
    public T j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f7939l;

    /* renamed from: m, reason: collision with root package name */
    public int f7940m;

    /* renamed from: n, reason: collision with root package name */
    public int f7941n;

    /* renamed from: o, reason: collision with root package name */
    public int f7942o;

    /* renamed from: p, reason: collision with root package name */
    public T f7943p;

    /* renamed from: q, reason: collision with root package name */
    public int f7944q;

    /* renamed from: r, reason: collision with root package name */
    public T f7945r;

    /* renamed from: s, reason: collision with root package name */
    public int f7946s;

    /* renamed from: t, reason: collision with root package name */
    public int f7947t;

    /* renamed from: u, reason: collision with root package name */
    public byte f7948u;

    /* renamed from: v, reason: collision with root package name */
    public int f7949v;

    static {
        T t8 = new T();
        f7932w = t8;
        t8.q();
    }

    public T(S s8) {
        super(s8);
        this.f7948u = (byte) -1;
        this.f7949v = -1;
        this.f7934e = s8.f11240d;
    }

    public static S r(T t8) {
        S h8 = S.h();
        h8.i(t8);
        return h8;
    }

    @Override // g7.u
    public final AbstractC0793b a() {
        return f7932w;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f7948u;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.f7936g.size(); i4++) {
            if (!((Q) this.f7936g.get(i4)).b()) {
                this.f7948u = (byte) 0;
                return false;
            }
        }
        if ((this.f7935f & 4) == 4 && !this.j.b()) {
            this.f7948u = (byte) 0;
            return false;
        }
        if ((this.f7935f & 256) == 256 && !this.f7943p.b()) {
            this.f7948u = (byte) 0;
            return false;
        }
        if ((this.f7935f & 1024) == 1024 && !this.f7945r.b()) {
            this.f7948u = (byte) 0;
            return false;
        }
        if (!i()) {
            this.f7948u = (byte) 0;
            return false;
        }
        this.f7948u = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f7949v;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f7935f & 4096) == 4096) {
            i4 = L5.m.b(1, this.f7947t);
        } else {
            i4 = 0;
        }
        for (int i9 = 0; i9 < this.f7936g.size(); i9++) {
            i4 += L5.m.d(2, (AbstractC0793b) this.f7936g.get(i9));
        }
        if ((this.f7935f & 1) == 1) {
            i4 += L5.m.h(3) + 1;
        }
        if ((this.f7935f & 2) == 2) {
            i4 += L5.m.b(4, this.f7938i);
        }
        if ((this.f7935f & 4) == 4) {
            i4 += L5.m.d(5, this.j);
        }
        if ((this.f7935f & 16) == 16) {
            i4 += L5.m.b(6, this.f7939l);
        }
        if ((this.f7935f & 32) == 32) {
            i4 += L5.m.b(7, this.f7940m);
        }
        if ((this.f7935f & 8) == 8) {
            i4 += L5.m.b(8, this.k);
        }
        if ((this.f7935f & 64) == 64) {
            i4 += L5.m.b(9, this.f7941n);
        }
        if ((this.f7935f & 256) == 256) {
            i4 += L5.m.d(10, this.f7943p);
        }
        if ((this.f7935f & 512) == 512) {
            i4 += L5.m.b(11, this.f7944q);
        }
        if ((this.f7935f & 128) == 128) {
            i4 += L5.m.b(12, this.f7942o);
        }
        if ((this.f7935f & 1024) == 1024) {
            i4 += L5.m.d(13, this.f7945r);
        }
        if ((this.f7935f & 2048) == 2048) {
            i4 += L5.m.b(14, this.f7946s);
        }
        int size = this.f7934e.size() + j() + i4;
        this.f7949v = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return S.h();
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        R3.r rVar = new R3.r(this);
        if ((this.f7935f & 4096) == 4096) {
            mVar.m(1, this.f7947t);
        }
        for (int i4 = 0; i4 < this.f7936g.size(); i4++) {
            mVar.o(2, (AbstractC0793b) this.f7936g.get(i4));
        }
        if ((this.f7935f & 1) == 1) {
            boolean z8 = this.f7937h;
            mVar.x(3, 0);
            mVar.q(z8 ? 1 : 0);
        }
        if ((this.f7935f & 2) == 2) {
            mVar.m(4, this.f7938i);
        }
        if ((this.f7935f & 4) == 4) {
            mVar.o(5, this.j);
        }
        if ((this.f7935f & 16) == 16) {
            mVar.m(6, this.f7939l);
        }
        if ((this.f7935f & 32) == 32) {
            mVar.m(7, this.f7940m);
        }
        if ((this.f7935f & 8) == 8) {
            mVar.m(8, this.k);
        }
        if ((this.f7935f & 64) == 64) {
            mVar.m(9, this.f7941n);
        }
        if ((this.f7935f & 256) == 256) {
            mVar.o(10, this.f7943p);
        }
        if ((this.f7935f & 512) == 512) {
            mVar.m(11, this.f7944q);
        }
        if ((this.f7935f & 128) == 128) {
            mVar.m(12, this.f7942o);
        }
        if ((this.f7935f & 1024) == 1024) {
            mVar.o(13, this.f7945r);
        }
        if ((this.f7935f & 2048) == 2048) {
            mVar.m(14, this.f7946s);
        }
        rVar.d0(200, mVar);
        mVar.r(this.f7934e);
    }

    public final boolean p() {
        if ((this.f7935f & 16) == 16) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.f7936g = Collections.EMPTY_LIST;
        this.f7937h = false;
        this.f7938i = 0;
        T t8 = f7932w;
        this.j = t8;
        this.k = 0;
        this.f7939l = 0;
        this.f7940m = 0;
        this.f7941n = 0;
        this.f7942o = 0;
        this.f7943p = t8;
        this.f7944q = 0;
        this.f7945r = t8;
        this.f7946s = 0;
        this.f7947t = 0;
    }

    @Override // g7.AbstractC0793b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final S e() {
        return r(this);
    }

    public T() {
        this.f7948u = (byte) -1;
        this.f7949v = -1;
        this.f7934e = AbstractC0796e.f11223d;
    }

    public T(C0797f c0797f, C0799h c0799h) {
        this.f7948u = (byte) -1;
        this.f7949v = -1;
        q();
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        boolean z8 = false;
        boolean z9 = false;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    C0440a c0440a = f7933x;
                    S s8 = null;
                    switch (n3) {
                        case 0:
                            break;
                        case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                            this.f7935f |= 4096;
                            this.f7947t = c0797f.k();
                            continue;
                        case 18:
                            if (!z9) {
                                this.f7936g = new ArrayList();
                                z9 = true;
                            }
                            this.f7936g.add(c0797f.g(Q.f7912l, c0799h));
                            continue;
                        case 24:
                            this.f7935f |= 1;
                            this.f7937h = c0797f.l() != 0;
                            continue;
                        case 32:
                            this.f7935f |= 2;
                            this.f7938i = c0797f.k();
                            continue;
                        case 42:
                            if ((this.f7935f & 4) == 4) {
                                T t8 = this.j;
                                t8.getClass();
                                s8 = r(t8);
                            }
                            T t9 = (T) c0797f.g(c0440a, c0799h);
                            this.j = t9;
                            if (s8 != null) {
                                s8.i(t9);
                                this.j = s8.g();
                            }
                            this.f7935f |= 4;
                            continue;
                        case 48:
                            this.f7935f |= 16;
                            this.f7939l = c0797f.k();
                            continue;
                        case 56:
                            this.f7935f |= 32;
                            this.f7940m = c0797f.k();
                            continue;
                        case 64:
                            this.f7935f |= 8;
                            this.k = c0797f.k();
                            continue;
                        case 72:
                            this.f7935f |= 64;
                            this.f7941n = c0797f.k();
                            continue;
                        case 82:
                            if ((this.f7935f & 256) == 256) {
                                T t10 = this.f7943p;
                                t10.getClass();
                                s8 = r(t10);
                            }
                            T t11 = (T) c0797f.g(c0440a, c0799h);
                            this.f7943p = t11;
                            if (s8 != null) {
                                s8.i(t11);
                                this.f7943p = s8.g();
                            }
                            this.f7935f |= 256;
                            continue;
                        case 88:
                            this.f7935f |= 512;
                            this.f7944q = c0797f.k();
                            continue;
                        case 96:
                            this.f7935f |= 128;
                            this.f7942o = c0797f.k();
                            continue;
                        case 106:
                            if ((this.f7935f & 1024) == 1024) {
                                T t12 = this.f7945r;
                                t12.getClass();
                                s8 = r(t12);
                            }
                            T t13 = (T) c0797f.g(c0440a, c0799h);
                            this.f7945r = t13;
                            if (s8 != null) {
                                s8.i(t13);
                                this.f7945r = s8.g();
                            }
                            this.f7935f |= 1024;
                            continue;
                        case 112:
                            this.f7935f |= 2048;
                            this.f7946s = c0797f.k();
                            continue;
                        default:
                            if (!n(c0797f, j, c0799h, n3)) {
                                break;
                            } else {
                                break;
                            }
                    }
                    z8 = true;
                } catch (Throwable th) {
                    if (z9) {
                        this.f7936g = Collections.unmodifiableList(this.f7936g);
                    }
                    try {
                        j.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f7934e = c0795d.e();
                        throw th2;
                    }
                    this.f7934e = c0795d.e();
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
        if (z9) {
            this.f7936g = Collections.unmodifiableList(this.f7936g);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f7934e = c0795d.e();
            throw th3;
        }
        this.f7934e = c0795d.e();
        m();
    }
}
