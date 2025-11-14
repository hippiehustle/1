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
public final class V extends AbstractC0803l {

    /* renamed from: s, reason: collision with root package name */
    public static final V f7959s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0440a f7960t = new C0440a(19);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0796e f7961e;

    /* renamed from: f, reason: collision with root package name */
    public int f7962f;

    /* renamed from: g, reason: collision with root package name */
    public int f7963g;

    /* renamed from: h, reason: collision with root package name */
    public int f7964h;

    /* renamed from: i, reason: collision with root package name */
    public List f7965i;
    public T j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public T f7966l;

    /* renamed from: m, reason: collision with root package name */
    public int f7967m;

    /* renamed from: n, reason: collision with root package name */
    public List f7968n;

    /* renamed from: o, reason: collision with root package name */
    public List f7969o;

    /* renamed from: p, reason: collision with root package name */
    public List f7970p;

    /* renamed from: q, reason: collision with root package name */
    public byte f7971q;

    /* renamed from: r, reason: collision with root package name */
    public int f7972r;

    static {
        V v8 = new V();
        f7959s = v8;
        v8.f7963g = 6;
        v8.f7964h = 0;
        List list = Collections.EMPTY_LIST;
        v8.f7965i = list;
        T t8 = T.f7932w;
        v8.j = t8;
        v8.k = 0;
        v8.f7966l = t8;
        v8.f7967m = 0;
        v8.f7968n = list;
        v8.f7969o = list;
        v8.f7970p = list;
    }

    public V(U u8) {
        super(u8);
        this.f7971q = (byte) -1;
        this.f7972r = -1;
        this.f7961e = u8.f11240d;
    }

    @Override // g7.u
    public final AbstractC0793b a() {
        return f7959s;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f7971q;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f7962f & 2) == 2) {
            for (int i4 = 0; i4 < this.f7965i.size(); i4++) {
                if (!((Y) this.f7965i.get(i4)).b()) {
                    this.f7971q = (byte) 0;
                    return false;
                }
            }
            if ((this.f7962f & 4) == 4 && !this.j.b()) {
                this.f7971q = (byte) 0;
                return false;
            }
            if ((this.f7962f & 16) == 16 && !this.f7966l.b()) {
                this.f7971q = (byte) 0;
                return false;
            }
            for (int i8 = 0; i8 < this.f7968n.size(); i8++) {
                if (!((C0447h) this.f7968n.get(i8)).b()) {
                    this.f7971q = (byte) 0;
                    return false;
                }
            }
            for (int i9 = 0; i9 < this.f7970p.size(); i9++) {
                if (!((C0451l) this.f7970p.get(i9)).b()) {
                    this.f7971q = (byte) 0;
                    return false;
                }
            }
            if (!i()) {
                this.f7971q = (byte) 0;
                return false;
            }
            this.f7971q = (byte) 1;
            return true;
        }
        this.f7971q = (byte) 0;
        return false;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f7972r;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f7962f & 1) == 1) {
            i4 = L5.m.b(1, this.f7963g);
        } else {
            i4 = 0;
        }
        if ((this.f7962f & 2) == 2) {
            i4 += L5.m.b(2, this.f7964h);
        }
        for (int i9 = 0; i9 < this.f7965i.size(); i9++) {
            i4 += L5.m.d(3, (AbstractC0793b) this.f7965i.get(i9));
        }
        if ((this.f7962f & 4) == 4) {
            i4 += L5.m.d(4, this.j);
        }
        if ((this.f7962f & 8) == 8) {
            i4 += L5.m.b(5, this.k);
        }
        if ((this.f7962f & 16) == 16) {
            i4 += L5.m.d(6, this.f7966l);
        }
        if ((this.f7962f & 32) == 32) {
            i4 += L5.m.b(7, this.f7967m);
        }
        for (int i10 = 0; i10 < this.f7968n.size(); i10++) {
            i4 += L5.m.d(8, (AbstractC0793b) this.f7968n.get(i10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7969o.size(); i12++) {
            i11 += L5.m.c(((Integer) this.f7969o.get(i12)).intValue());
        }
        int size = (this.f7969o.size() * 2) + i4 + i11;
        for (int i13 = 0; i13 < this.f7970p.size(); i13++) {
            size += L5.m.d(32, (AbstractC0793b) this.f7970p.get(i13));
        }
        int size2 = this.f7961e.size() + j() + size;
        this.f7972r = size2;
        return size2;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return U.h();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        U h8 = U.h();
        h8.i(this);
        return h8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        R3.r rVar = new R3.r(this);
        if ((this.f7962f & 1) == 1) {
            mVar.m(1, this.f7963g);
        }
        if ((this.f7962f & 2) == 2) {
            mVar.m(2, this.f7964h);
        }
        for (int i4 = 0; i4 < this.f7965i.size(); i4++) {
            mVar.o(3, (AbstractC0793b) this.f7965i.get(i4));
        }
        if ((this.f7962f & 4) == 4) {
            mVar.o(4, this.j);
        }
        if ((this.f7962f & 8) == 8) {
            mVar.m(5, this.k);
        }
        if ((this.f7962f & 16) == 16) {
            mVar.o(6, this.f7966l);
        }
        if ((this.f7962f & 32) == 32) {
            mVar.m(7, this.f7967m);
        }
        for (int i8 = 0; i8 < this.f7968n.size(); i8++) {
            mVar.o(8, (AbstractC0793b) this.f7968n.get(i8));
        }
        for (int i9 = 0; i9 < this.f7969o.size(); i9++) {
            mVar.m(31, ((Integer) this.f7969o.get(i9)).intValue());
        }
        for (int i10 = 0; i10 < this.f7970p.size(); i10++) {
            mVar.o(32, (AbstractC0793b) this.f7970p.get(i10));
        }
        rVar.d0(200, mVar);
        mVar.r(this.f7961e);
    }

    public V() {
        this.f7971q = (byte) -1;
        this.f7972r = -1;
        this.f7961e = AbstractC0796e.f11223d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public V(C0797f c0797f, C0799h c0799h) {
        this.f7971q = (byte) -1;
        this.f7972r = -1;
        this.f7963g = 6;
        boolean z8 = false;
        this.f7964h = 0;
        List list = Collections.EMPTY_LIST;
        this.f7965i = list;
        T t8 = T.f7932w;
        this.j = t8;
        this.k = 0;
        this.f7966l = t8;
        this.f7967m = 0;
        this.f7968n = list;
        this.f7969o = list;
        this.f7970p = list;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        int i4 = 0;
        while (true) {
            ?? r52 = 128;
            if (!z8) {
                try {
                    try {
                        int n3 = c0797f.n();
                        S s8 = null;
                        switch (n3) {
                            case 0:
                                z8 = true;
                            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                                this.f7962f |= 1;
                                this.f7963g = c0797f.k();
                            case 16:
                                this.f7962f |= 2;
                                this.f7964h = c0797f.k();
                            case 26:
                                if ((i4 & 4) != 4) {
                                    this.f7965i = new ArrayList();
                                    i4 |= 4;
                                }
                                this.f7965i.add(c0797f.g(Y.f7984q, c0799h));
                            case 34:
                                if ((this.f7962f & 4) == 4) {
                                    T t9 = this.j;
                                    t9.getClass();
                                    s8 = T.r(t9);
                                }
                                T t10 = (T) c0797f.g(T.f7933x, c0799h);
                                this.j = t10;
                                if (s8 != null) {
                                    s8.i(t10);
                                    this.j = s8.g();
                                }
                                this.f7962f |= 4;
                            case 40:
                                this.f7962f |= 8;
                                this.k = c0797f.k();
                            case 50:
                                if ((this.f7962f & 16) == 16) {
                                    T t11 = this.f7966l;
                                    t11.getClass();
                                    s8 = T.r(t11);
                                }
                                T t12 = (T) c0797f.g(T.f7933x, c0799h);
                                this.f7966l = t12;
                                if (s8 != null) {
                                    s8.i(t12);
                                    this.f7966l = s8.g();
                                }
                                this.f7962f |= 16;
                            case 56:
                                this.f7962f |= 32;
                                this.f7967m = c0797f.k();
                            case 66:
                                if ((i4 & 128) != 128) {
                                    this.f7968n = new ArrayList();
                                    i4 |= 128;
                                }
                                this.f7968n.add(c0797f.g(C0447h.k, c0799h));
                            case 248:
                                if ((i4 & 256) != 256) {
                                    this.f7969o = new ArrayList();
                                    i4 |= 256;
                                }
                                this.f7969o.add(Integer.valueOf(c0797f.k()));
                            case 250:
                                int d2 = c0797f.d(c0797f.k());
                                if ((i4 & 256) != 256 && c0797f.b() > 0) {
                                    this.f7969o = new ArrayList();
                                    i4 |= 256;
                                }
                                while (c0797f.b() > 0) {
                                    this.f7969o.add(Integer.valueOf(c0797f.k()));
                                }
                                c0797f.c(d2);
                                break;
                            case 258:
                                if ((i4 & 512) != 512) {
                                    this.f7970p = new ArrayList();
                                    i4 |= 512;
                                }
                                this.f7970p.add(c0797f.g(C0451l.k, c0799h));
                            default:
                                r52 = n(c0797f, j, c0799h, n3);
                                if (r52 == 0) {
                                    z8 = true;
                                }
                        }
                    } catch (InvalidProtocolBufferException e9) {
                        e9.f12155d = this;
                        throw e9;
                    } catch (IOException e10) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                        invalidProtocolBufferException.f12155d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th) {
                    if ((i4 & 4) == 4) {
                        this.f7965i = Collections.unmodifiableList(this.f7965i);
                    }
                    if ((i4 & 128) == r52) {
                        this.f7968n = Collections.unmodifiableList(this.f7968n);
                    }
                    if ((i4 & 256) == 256) {
                        this.f7969o = Collections.unmodifiableList(this.f7969o);
                    }
                    if ((i4 & 512) == 512) {
                        this.f7970p = Collections.unmodifiableList(this.f7970p);
                    }
                    try {
                        j.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f7961e = c0795d.e();
                        throw th2;
                    }
                    this.f7961e = c0795d.e();
                    m();
                    throw th;
                }
            } else {
                if ((i4 & 4) == 4) {
                    this.f7965i = Collections.unmodifiableList(this.f7965i);
                }
                if ((i4 & 128) == 128) {
                    this.f7968n = Collections.unmodifiableList(this.f7968n);
                }
                if ((i4 & 256) == 256) {
                    this.f7969o = Collections.unmodifiableList(this.f7969o);
                }
                if ((i4 & 512) == 512) {
                    this.f7970p = Collections.unmodifiableList(this.f7970p);
                }
                try {
                    j.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f7961e = c0795d.e();
                    throw th3;
                }
                this.f7961e = c0795d.e();
                m();
                return;
            }
        }
    }
}
