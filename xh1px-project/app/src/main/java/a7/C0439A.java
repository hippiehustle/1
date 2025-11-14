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

/* renamed from: a7.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439A extends AbstractC0803l {

    /* renamed from: B, reason: collision with root package name */
    public static final C0439A f7775B;

    /* renamed from: C, reason: collision with root package name */
    public static final C0440a f7776C = new C0440a(10);

    /* renamed from: A, reason: collision with root package name */
    public int f7777A;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0796e f7778e;

    /* renamed from: f, reason: collision with root package name */
    public int f7779f;

    /* renamed from: g, reason: collision with root package name */
    public int f7780g;

    /* renamed from: h, reason: collision with root package name */
    public int f7781h;

    /* renamed from: i, reason: collision with root package name */
    public int f7782i;
    public T j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public List f7783l;

    /* renamed from: m, reason: collision with root package name */
    public T f7784m;

    /* renamed from: n, reason: collision with root package name */
    public int f7785n;

    /* renamed from: o, reason: collision with root package name */
    public List f7786o;

    /* renamed from: p, reason: collision with root package name */
    public List f7787p;

    /* renamed from: q, reason: collision with root package name */
    public int f7788q;

    /* renamed from: r, reason: collision with root package name */
    public List f7789r;

    /* renamed from: s, reason: collision with root package name */
    public List f7790s;

    /* renamed from: t, reason: collision with root package name */
    public Z f7791t;

    /* renamed from: u, reason: collision with root package name */
    public List f7792u;

    /* renamed from: v, reason: collision with root package name */
    public C0455p f7793v;

    /* renamed from: w, reason: collision with root package name */
    public List f7794w;

    /* renamed from: x, reason: collision with root package name */
    public List f7795x;

    /* renamed from: y, reason: collision with root package name */
    public List f7796y;

    /* renamed from: z, reason: collision with root package name */
    public byte f7797z;

    static {
        C0439A c0439a = new C0439A();
        f7775B = c0439a;
        c0439a.p();
    }

    public C0439A(C0464z c0464z) {
        super(c0464z);
        this.f7788q = -1;
        this.f7797z = (byte) -1;
        this.f7777A = -1;
        this.f7778e = c0464z.f11240d;
    }

    @Override // g7.u
    public final AbstractC0793b a() {
        return f7775B;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f7797z;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        int i4 = this.f7779f;
        if ((i4 & 4) == 4) {
            if ((i4 & 8) == 8 && !this.j.b()) {
                this.f7797z = (byte) 0;
                return false;
            }
            for (int i8 = 0; i8 < this.f7783l.size(); i8++) {
                if (!((Y) this.f7783l.get(i8)).b()) {
                    this.f7797z = (byte) 0;
                    return false;
                }
            }
            if ((this.f7779f & 32) == 32 && !this.f7784m.b()) {
                this.f7797z = (byte) 0;
                return false;
            }
            for (int i9 = 0; i9 < this.f7786o.size(); i9++) {
                if (!((T) this.f7786o.get(i9)).b()) {
                    this.f7797z = (byte) 0;
                    return false;
                }
            }
            for (int i10 = 0; i10 < this.f7789r.size(); i10++) {
                if (!((b0) this.f7789r.get(i10)).b()) {
                    this.f7797z = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < this.f7790s.size(); i11++) {
                if (!((b0) this.f7790s.get(i11)).b()) {
                    this.f7797z = (byte) 0;
                    return false;
                }
            }
            if ((this.f7779f & 128) == 128 && !this.f7791t.b()) {
                this.f7797z = (byte) 0;
                return false;
            }
            if ((this.f7779f & 256) == 256 && !this.f7793v.b()) {
                this.f7797z = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < this.f7794w.size(); i12++) {
                if (!((C0451l) this.f7794w.get(i12)).b()) {
                    this.f7797z = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < this.f7795x.size(); i13++) {
                if (!((C0447h) this.f7795x.get(i13)).b()) {
                    this.f7797z = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < this.f7796y.size(); i14++) {
                if (!((C0447h) this.f7796y.get(i14)).b()) {
                    this.f7797z = (byte) 0;
                    return false;
                }
            }
            if (!i()) {
                this.f7797z = (byte) 0;
                return false;
            }
            this.f7797z = (byte) 1;
            return true;
        }
        this.f7797z = (byte) 0;
        return false;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f7777A;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f7779f & 2) == 2) {
            i4 = L5.m.b(1, this.f7781h);
        } else {
            i4 = 0;
        }
        if ((this.f7779f & 4) == 4) {
            i4 += L5.m.b(2, this.f7782i);
        }
        if ((this.f7779f & 8) == 8) {
            i4 += L5.m.d(3, this.j);
        }
        for (int i9 = 0; i9 < this.f7783l.size(); i9++) {
            i4 += L5.m.d(4, (AbstractC0793b) this.f7783l.get(i9));
        }
        if ((this.f7779f & 32) == 32) {
            i4 += L5.m.d(5, this.f7784m);
        }
        for (int i10 = 0; i10 < this.f7790s.size(); i10++) {
            i4 += L5.m.d(6, (AbstractC0793b) this.f7790s.get(i10));
        }
        if ((this.f7779f & 16) == 16) {
            i4 += L5.m.b(7, this.k);
        }
        if ((this.f7779f & 64) == 64) {
            i4 += L5.m.b(8, this.f7785n);
        }
        if ((this.f7779f & 1) == 1) {
            i4 += L5.m.b(9, this.f7780g);
        }
        for (int i11 = 0; i11 < this.f7786o.size(); i11++) {
            i4 += L5.m.d(10, (AbstractC0793b) this.f7786o.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f7787p.size(); i13++) {
            i12 += L5.m.c(((Integer) this.f7787p.get(i13)).intValue());
        }
        int i14 = i4 + i12;
        if (!this.f7787p.isEmpty()) {
            i14 = i14 + 1 + L5.m.c(i12);
        }
        this.f7788q = i12;
        for (int i15 = 0; i15 < this.f7795x.size(); i15++) {
            i14 += L5.m.d(12, (AbstractC0793b) this.f7795x.get(i15));
        }
        for (int i16 = 0; i16 < this.f7789r.size(); i16++) {
            i14 += L5.m.d(13, (AbstractC0793b) this.f7789r.get(i16));
        }
        if ((this.f7779f & 128) == 128) {
            i14 += L5.m.d(30, this.f7791t);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f7792u.size(); i18++) {
            i17 += L5.m.c(((Integer) this.f7792u.get(i18)).intValue());
        }
        int size = (this.f7792u.size() * 2) + i14 + i17;
        if ((this.f7779f & 256) == 256) {
            size += L5.m.d(32, this.f7793v);
        }
        for (int i19 = 0; i19 < this.f7794w.size(); i19++) {
            size += L5.m.d(33, (AbstractC0793b) this.f7794w.get(i19));
        }
        for (int i20 = 0; i20 < this.f7796y.size(); i20++) {
            size += L5.m.d(34, (AbstractC0793b) this.f7796y.get(i20));
        }
        int size2 = this.f7778e.size() + j() + size;
        this.f7777A = size2;
        return size2;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return C0464z.h();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        C0464z h8 = C0464z.h();
        h8.i(this);
        return h8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        R3.r rVar = new R3.r(this);
        if ((this.f7779f & 2) == 2) {
            mVar.m(1, this.f7781h);
        }
        if ((this.f7779f & 4) == 4) {
            mVar.m(2, this.f7782i);
        }
        if ((this.f7779f & 8) == 8) {
            mVar.o(3, this.j);
        }
        for (int i4 = 0; i4 < this.f7783l.size(); i4++) {
            mVar.o(4, (AbstractC0793b) this.f7783l.get(i4));
        }
        if ((this.f7779f & 32) == 32) {
            mVar.o(5, this.f7784m);
        }
        for (int i8 = 0; i8 < this.f7790s.size(); i8++) {
            mVar.o(6, (AbstractC0793b) this.f7790s.get(i8));
        }
        if ((this.f7779f & 16) == 16) {
            mVar.m(7, this.k);
        }
        if ((this.f7779f & 64) == 64) {
            mVar.m(8, this.f7785n);
        }
        if ((this.f7779f & 1) == 1) {
            mVar.m(9, this.f7780g);
        }
        for (int i9 = 0; i9 < this.f7786o.size(); i9++) {
            mVar.o(10, (AbstractC0793b) this.f7786o.get(i9));
        }
        if (this.f7787p.size() > 0) {
            mVar.v(90);
            mVar.v(this.f7788q);
        }
        for (int i10 = 0; i10 < this.f7787p.size(); i10++) {
            mVar.n(((Integer) this.f7787p.get(i10)).intValue());
        }
        for (int i11 = 0; i11 < this.f7795x.size(); i11++) {
            mVar.o(12, (AbstractC0793b) this.f7795x.get(i11));
        }
        for (int i12 = 0; i12 < this.f7789r.size(); i12++) {
            mVar.o(13, (AbstractC0793b) this.f7789r.get(i12));
        }
        if ((this.f7779f & 128) == 128) {
            mVar.o(30, this.f7791t);
        }
        for (int i13 = 0; i13 < this.f7792u.size(); i13++) {
            mVar.m(31, ((Integer) this.f7792u.get(i13)).intValue());
        }
        if ((this.f7779f & 256) == 256) {
            mVar.o(32, this.f7793v);
        }
        for (int i14 = 0; i14 < this.f7794w.size(); i14++) {
            mVar.o(33, (AbstractC0793b) this.f7794w.get(i14));
        }
        for (int i15 = 0; i15 < this.f7796y.size(); i15++) {
            mVar.o(34, (AbstractC0793b) this.f7796y.get(i15));
        }
        rVar.d0(19000, mVar);
        mVar.r(this.f7778e);
    }

    public final void p() {
        this.f7780g = 6;
        this.f7781h = 6;
        this.f7782i = 0;
        T t8 = T.f7932w;
        this.j = t8;
        this.k = 0;
        List list = Collections.EMPTY_LIST;
        this.f7783l = list;
        this.f7784m = t8;
        this.f7785n = 0;
        this.f7786o = list;
        this.f7787p = list;
        this.f7789r = list;
        this.f7790s = list;
        this.f7791t = Z.j;
        this.f7792u = list;
        this.f7793v = C0455p.f8199h;
        this.f7794w = list;
        this.f7795x = list;
        this.f7796y = list;
    }

    public C0439A() {
        this.f7788q = -1;
        this.f7797z = (byte) -1;
        this.f7777A = -1;
        this.f7778e = AbstractC0796e.f11223d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x003c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x039a  */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0439A(C0797f c0797f, C0799h c0799h) {
        boolean z8;
        int i4;
        int i8;
        this.f7788q = -1;
        this.f7797z = (byte) -1;
        this.f7777A = -1;
        p();
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        boolean z9 = false;
        int i9 = 0;
        while (true) {
            int i10 = 32768;
            boolean z10 = z8;
            ?? r42 = 256;
            r4 = 256;
            int i11 = 256;
            if (!z9) {
                try {
                    int n3 = c0797f.n();
                    S s8 = null;
                    C0446g c0446g = null;
                    S s9 = null;
                    switch (n3) {
                        case 0:
                            z9 = z10;
                        case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                            this.f7779f |= 2;
                            this.f7781h = c0797f.k();
                        case 16:
                            this.f7779f |= 4;
                            this.f7782i = c0797f.k();
                        case 26:
                            if ((this.f7779f & 8) == 8) {
                                T t8 = this.j;
                                t8.getClass();
                                s8 = T.r(t8);
                            }
                            S s10 = s8;
                            T t9 = (T) c0797f.g(T.f7933x, c0799h);
                            this.j = t9;
                            if (s10 != null) {
                                s10.i(t9);
                                this.j = s10.g();
                            }
                            this.f7779f |= 8;
                        case 34:
                            if ((i9 & 32) != 32) {
                                this.f7783l = new ArrayList();
                                i9 |= 32;
                            }
                            this.f7783l.add(c0797f.g(Y.f7984q, c0799h));
                        case 42:
                            if ((this.f7779f & 32) == 32) {
                                T t10 = this.f7784m;
                                t10.getClass();
                                s9 = T.r(t10);
                            }
                            S s11 = s9;
                            T t11 = (T) c0797f.g(T.f7933x, c0799h);
                            this.f7784m = t11;
                            if (s11 != null) {
                                s11.i(t11);
                                this.f7784m = s11.g();
                            }
                            this.f7779f |= 32;
                        case 50:
                            if ((i9 & 2048) != 2048) {
                                this.f7790s = new ArrayList();
                                i9 |= 2048;
                            }
                            this.f7790s.add(c0797f.g(b0.f8013r, c0799h));
                        case 56:
                            this.f7779f |= 16;
                            this.k = c0797f.k();
                        case 64:
                            this.f7779f |= 64;
                            this.f7785n = c0797f.k();
                        case 72:
                            this.f7779f |= 1;
                            this.f7780g = c0797f.k();
                        case 82:
                            if ((i9 & 256) != 256) {
                                this.f7786o = new ArrayList();
                                i9 |= 256;
                            }
                            this.f7786o.add(c0797f.g(T.f7933x, c0799h));
                        case 88:
                            if ((i9 & 512) != 512) {
                                this.f7787p = new ArrayList();
                                i9 |= 512;
                            }
                            this.f7787p.add(Integer.valueOf(c0797f.k()));
                        case 90:
                            int d2 = c0797f.d(c0797f.k());
                            if ((i9 & 512) != 512 && c0797f.b() > 0) {
                                this.f7787p = new ArrayList();
                                i9 |= 512;
                            }
                            while (c0797f.b() > 0) {
                                this.f7787p.add(Integer.valueOf(c0797f.k()));
                            }
                            c0797f.c(d2);
                            break;
                        case 98:
                            if ((i9 & 65536) != 65536) {
                                this.f7795x = new ArrayList();
                                i9 |= 65536;
                            }
                            this.f7795x.add(c0797f.g(C0447h.k, c0799h));
                        case 106:
                            if ((i9 & 1024) != 1024) {
                                this.f7789r = new ArrayList();
                                i9 |= 1024;
                            }
                            this.f7789r.add(c0797f.g(b0.f8013r, c0799h));
                        case 242:
                            if ((this.f7779f & 128) == 128) {
                                Z z11 = this.f7791t;
                                z11.getClass();
                                c0446g = Z.i(z11);
                            }
                            C0446g c0446g2 = c0446g;
                            Z z12 = (Z) c0797f.g(Z.k, c0799h);
                            this.f7791t = z12;
                            if (c0446g2 != null) {
                                c0446g2.j(z12);
                                this.f7791t = c0446g2.g();
                            }
                            this.f7779f |= 128;
                        case 248:
                            if ((i9 & 8192) != 8192) {
                                this.f7792u = new ArrayList();
                                i9 |= 8192;
                            }
                            this.f7792u.add(Integer.valueOf(c0797f.k()));
                        case 250:
                            i8 = 131072;
                            int d3 = c0797f.d(c0797f.k());
                            if ((i9 & 8192) != 8192 && c0797f.b() > 0) {
                                this.f7792u = new ArrayList();
                                i9 |= 8192;
                            }
                            while (c0797f.b() > 0) {
                                i4 = i10;
                                try {
                                    try {
                                        this.f7792u.add(Integer.valueOf(c0797f.k()));
                                        i10 = i4;
                                    } catch (Throwable th) {
                                        th = th;
                                        if ((i9 & 32) == 32) {
                                            this.f7783l = Collections.unmodifiableList(this.f7783l);
                                        }
                                        if ((i9 & 2048) == 2048) {
                                            this.f7790s = Collections.unmodifiableList(this.f7790s);
                                        }
                                        if ((i9 & 256) == i11) {
                                            this.f7786o = Collections.unmodifiableList(this.f7786o);
                                        }
                                        if ((i9 & 512) == 512) {
                                            this.f7787p = Collections.unmodifiableList(this.f7787p);
                                        }
                                        if ((i9 & 65536) == 65536) {
                                            this.f7795x = Collections.unmodifiableList(this.f7795x);
                                        }
                                        if ((i9 & 1024) == 1024) {
                                            this.f7789r = Collections.unmodifiableList(this.f7789r);
                                        }
                                        if ((i9 & 8192) == 8192) {
                                            this.f7792u = Collections.unmodifiableList(this.f7792u);
                                        }
                                        if ((i9 & i4) == i4) {
                                            this.f7794w = Collections.unmodifiableList(this.f7794w);
                                        }
                                        if ((i9 & i8) == i8) {
                                            this.f7796y = Collections.unmodifiableList(this.f7796y);
                                        }
                                        try {
                                            j.i();
                                        } catch (IOException unused) {
                                        } catch (Throwable th2) {
                                            this.f7778e = c0795d.e();
                                            throw th2;
                                        }
                                        this.f7778e = c0795d.e();
                                        m();
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException e9) {
                                    e = e9;
                                    e.f12155d = this;
                                    throw e;
                                } catch (IOException e10) {
                                    e = e10;
                                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                    invalidProtocolBufferException.f12155d = this;
                                    throw invalidProtocolBufferException;
                                }
                            }
                            c0797f.c(d3);
                            break;
                        case 258:
                            C0454o i12 = (this.f7779f & 256) == 256 ? this.f7793v.i() : null;
                            C0455p c0455p = (C0455p) c0797f.g(C0455p.f8200i, c0799h);
                            this.f7793v = c0455p;
                            if (i12 != null) {
                                i12.j(c0455p);
                                this.f7793v = i12.f();
                            }
                            this.f7779f |= 256;
                        case 266:
                            if ((i9 & 32768) != 32768) {
                                this.f7794w = new ArrayList();
                                i9 |= 32768;
                            }
                            this.f7794w.add(c0797f.g(C0451l.k, c0799h));
                        case 274:
                            if ((i9 & 131072) != 131072) {
                                this.f7796y = new ArrayList();
                                i9 |= 131072;
                            }
                            try {
                                i8 = 131072;
                            } catch (InvalidProtocolBufferException e11) {
                                e = e11;
                            } catch (IOException e12) {
                                e = e12;
                            } catch (Throwable th3) {
                                th = th3;
                                i8 = 131072;
                            }
                            try {
                                this.f7796y.add(c0797f.g(C0447h.k, c0799h));
                            } catch (InvalidProtocolBufferException e13) {
                                e = e13;
                                e.f12155d = this;
                                throw e;
                            } catch (IOException e14) {
                                e = e14;
                                InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e.getMessage());
                                invalidProtocolBufferException2.f12155d = this;
                                throw invalidProtocolBufferException2;
                            } catch (Throwable th4) {
                                th = th4;
                                i4 = 32768;
                                if ((i9 & 32) == 32) {
                                }
                                if ((i9 & 2048) == 2048) {
                                }
                                if ((i9 & 256) == i11) {
                                }
                                if ((i9 & 512) == 512) {
                                }
                                if ((i9 & 65536) == 65536) {
                                }
                                if ((i9 & 1024) == 1024) {
                                }
                                if ((i9 & 8192) == 8192) {
                                }
                                if ((i9 & i4) == i4) {
                                }
                                if ((i9 & i8) == i8) {
                                }
                                j.i();
                                this.f7778e = c0795d.e();
                                m();
                                throw th;
                            }
                            break;
                        default:
                            r42 = n(c0797f, j, c0799h, n3);
                            z8 = r42 != 0 ? z10 : true;
                            z9 = z10;
                    }
                } catch (InvalidProtocolBufferException e15) {
                    e = e15;
                } catch (IOException e16) {
                    e = e16;
                } catch (Throwable th5) {
                    th = th5;
                    i4 = 32768;
                    i8 = 131072;
                    i11 = r42;
                }
            } else {
                if ((i9 & 32) == 32) {
                    this.f7783l = Collections.unmodifiableList(this.f7783l);
                }
                if ((i9 & 2048) == 2048) {
                    this.f7790s = Collections.unmodifiableList(this.f7790s);
                }
                if ((i9 & 256) == 256) {
                    this.f7786o = Collections.unmodifiableList(this.f7786o);
                }
                if ((i9 & 512) == 512) {
                    this.f7787p = Collections.unmodifiableList(this.f7787p);
                }
                if ((i9 & 65536) == 65536) {
                    this.f7795x = Collections.unmodifiableList(this.f7795x);
                }
                if ((i9 & 1024) == 1024) {
                    this.f7789r = Collections.unmodifiableList(this.f7789r);
                }
                if ((i9 & 8192) == 8192) {
                    this.f7792u = Collections.unmodifiableList(this.f7792u);
                }
                if ((i9 & 32768) == 32768) {
                    this.f7794w = Collections.unmodifiableList(this.f7794w);
                }
                if ((i9 & 131072) == 131072) {
                    this.f7796y = Collections.unmodifiableList(this.f7796y);
                }
                try {
                    j.i();
                } catch (IOException unused2) {
                } catch (Throwable th6) {
                    this.f7778e = c0795d.e();
                    throw th6;
                }
                this.f7778e = c0795d.e();
                m();
                return;
            }
        }
    }
}
