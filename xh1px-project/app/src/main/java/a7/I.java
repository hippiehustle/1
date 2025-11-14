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
public final class I extends AbstractC0803l {

    /* renamed from: F, reason: collision with root package name */
    public static final I f7847F;

    /* renamed from: G, reason: collision with root package name */
    public static final C0440a f7848G = new C0440a(13);

    /* renamed from: A, reason: collision with root package name */
    public List f7849A;

    /* renamed from: B, reason: collision with root package name */
    public List f7850B;

    /* renamed from: C, reason: collision with root package name */
    public List f7851C;

    /* renamed from: D, reason: collision with root package name */
    public byte f7852D;

    /* renamed from: E, reason: collision with root package name */
    public int f7853E;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0796e f7854e;

    /* renamed from: f, reason: collision with root package name */
    public int f7855f;

    /* renamed from: g, reason: collision with root package name */
    public int f7856g;

    /* renamed from: h, reason: collision with root package name */
    public int f7857h;

    /* renamed from: i, reason: collision with root package name */
    public int f7858i;
    public T j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public List f7859l;

    /* renamed from: m, reason: collision with root package name */
    public T f7860m;

    /* renamed from: n, reason: collision with root package name */
    public int f7861n;

    /* renamed from: o, reason: collision with root package name */
    public List f7862o;

    /* renamed from: p, reason: collision with root package name */
    public List f7863p;

    /* renamed from: q, reason: collision with root package name */
    public int f7864q;

    /* renamed from: r, reason: collision with root package name */
    public List f7865r;

    /* renamed from: s, reason: collision with root package name */
    public b0 f7866s;

    /* renamed from: t, reason: collision with root package name */
    public int f7867t;

    /* renamed from: u, reason: collision with root package name */
    public int f7868u;

    /* renamed from: v, reason: collision with root package name */
    public List f7869v;

    /* renamed from: w, reason: collision with root package name */
    public List f7870w;

    /* renamed from: x, reason: collision with root package name */
    public List f7871x;

    /* renamed from: y, reason: collision with root package name */
    public List f7872y;

    /* renamed from: z, reason: collision with root package name */
    public List f7873z;

    static {
        I i4 = new I();
        f7847F = i4;
        i4.p();
    }

    public I(H h8) {
        super(h8);
        this.f7864q = -1;
        this.f7852D = (byte) -1;
        this.f7853E = -1;
        this.f7854e = h8.f11240d;
    }

    @Override // g7.u
    public final AbstractC0793b a() {
        return f7847F;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f7852D;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        int i4 = this.f7855f;
        if ((i4 & 4) == 4) {
            if ((i4 & 8) == 8 && !this.j.b()) {
                this.f7852D = (byte) 0;
                return false;
            }
            for (int i8 = 0; i8 < this.f7859l.size(); i8++) {
                if (!((Y) this.f7859l.get(i8)).b()) {
                    this.f7852D = (byte) 0;
                    return false;
                }
            }
            if ((this.f7855f & 32) == 32 && !this.f7860m.b()) {
                this.f7852D = (byte) 0;
                return false;
            }
            for (int i9 = 0; i9 < this.f7862o.size(); i9++) {
                if (!((T) this.f7862o.get(i9)).b()) {
                    this.f7852D = (byte) 0;
                    return false;
                }
            }
            for (int i10 = 0; i10 < this.f7865r.size(); i10++) {
                if (!((b0) this.f7865r.get(i10)).b()) {
                    this.f7852D = (byte) 0;
                    return false;
                }
            }
            if ((this.f7855f & 128) == 128 && !this.f7866s.b()) {
                this.f7852D = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < this.f7870w.size(); i11++) {
                if (!((C0451l) this.f7870w.get(i11)).b()) {
                    this.f7852D = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < this.f7871x.size(); i12++) {
                if (!((C0447h) this.f7871x.get(i12)).b()) {
                    this.f7852D = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < this.f7872y.size(); i13++) {
                if (!((C0447h) this.f7872y.get(i13)).b()) {
                    this.f7852D = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < this.f7873z.size(); i14++) {
                if (!((C0447h) this.f7873z.get(i14)).b()) {
                    this.f7852D = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < this.f7849A.size(); i15++) {
                if (!((C0447h) this.f7849A.get(i15)).b()) {
                    this.f7852D = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < this.f7850B.size(); i16++) {
                if (!((C0447h) this.f7850B.get(i16)).b()) {
                    this.f7852D = (byte) 0;
                    return false;
                }
            }
            for (int i17 = 0; i17 < this.f7851C.size(); i17++) {
                if (!((C0447h) this.f7851C.get(i17)).b()) {
                    this.f7852D = (byte) 0;
                    return false;
                }
            }
            if (!i()) {
                this.f7852D = (byte) 0;
                return false;
            }
            this.f7852D = (byte) 1;
            return true;
        }
        this.f7852D = (byte) 0;
        return false;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f7853E;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f7855f & 2) == 2) {
            i4 = L5.m.b(1, this.f7857h);
        } else {
            i4 = 0;
        }
        if ((this.f7855f & 4) == 4) {
            i4 += L5.m.b(2, this.f7858i);
        }
        if ((this.f7855f & 8) == 8) {
            i4 += L5.m.d(3, this.j);
        }
        for (int i9 = 0; i9 < this.f7859l.size(); i9++) {
            i4 += L5.m.d(4, (AbstractC0793b) this.f7859l.get(i9));
        }
        if ((this.f7855f & 32) == 32) {
            i4 += L5.m.d(5, this.f7860m);
        }
        if ((this.f7855f & 128) == 128) {
            i4 += L5.m.d(6, this.f7866s);
        }
        if ((this.f7855f & 256) == 256) {
            i4 += L5.m.b(7, this.f7867t);
        }
        if ((this.f7855f & 512) == 512) {
            i4 += L5.m.b(8, this.f7868u);
        }
        if ((this.f7855f & 16) == 16) {
            i4 += L5.m.b(9, this.k);
        }
        if ((this.f7855f & 64) == 64) {
            i4 += L5.m.b(10, this.f7861n);
        }
        if ((this.f7855f & 1) == 1) {
            i4 += L5.m.b(11, this.f7856g);
        }
        for (int i10 = 0; i10 < this.f7862o.size(); i10++) {
            i4 += L5.m.d(12, (AbstractC0793b) this.f7862o.get(i10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f7863p.size(); i12++) {
            i11 += L5.m.c(((Integer) this.f7863p.get(i12)).intValue());
        }
        int i13 = i4 + i11;
        if (!this.f7863p.isEmpty()) {
            i13 = i13 + 1 + L5.m.c(i11);
        }
        this.f7864q = i11;
        for (int i14 = 0; i14 < this.f7871x.size(); i14++) {
            i13 += L5.m.d(14, (AbstractC0793b) this.f7871x.get(i14));
        }
        for (int i15 = 0; i15 < this.f7872y.size(); i15++) {
            i13 += L5.m.d(15, (AbstractC0793b) this.f7872y.get(i15));
        }
        for (int i16 = 0; i16 < this.f7873z.size(); i16++) {
            i13 += L5.m.d(16, (AbstractC0793b) this.f7873z.get(i16));
        }
        for (int i17 = 0; i17 < this.f7865r.size(); i17++) {
            i13 += L5.m.d(17, (AbstractC0793b) this.f7865r.get(i17));
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f7869v.size(); i19++) {
            i18 += L5.m.c(((Integer) this.f7869v.get(i19)).intValue());
        }
        int size = (this.f7869v.size() * 2) + i13 + i18;
        for (int i20 = 0; i20 < this.f7870w.size(); i20++) {
            size += L5.m.d(32, (AbstractC0793b) this.f7870w.get(i20));
        }
        for (int i21 = 0; i21 < this.f7849A.size(); i21++) {
            size += L5.m.d(33, (AbstractC0793b) this.f7849A.get(i21));
        }
        for (int i22 = 0; i22 < this.f7850B.size(); i22++) {
            size += L5.m.d(34, (AbstractC0793b) this.f7850B.get(i22));
        }
        for (int i23 = 0; i23 < this.f7851C.size(); i23++) {
            size += L5.m.d(35, (AbstractC0793b) this.f7851C.get(i23));
        }
        int size2 = this.f7854e.size() + j() + size;
        this.f7853E = size2;
        return size2;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return H.h();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        H h8 = H.h();
        h8.i(this);
        return h8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        R3.r rVar = new R3.r(this);
        if ((this.f7855f & 2) == 2) {
            mVar.m(1, this.f7857h);
        }
        if ((this.f7855f & 4) == 4) {
            mVar.m(2, this.f7858i);
        }
        if ((this.f7855f & 8) == 8) {
            mVar.o(3, this.j);
        }
        for (int i4 = 0; i4 < this.f7859l.size(); i4++) {
            mVar.o(4, (AbstractC0793b) this.f7859l.get(i4));
        }
        if ((this.f7855f & 32) == 32) {
            mVar.o(5, this.f7860m);
        }
        if ((this.f7855f & 128) == 128) {
            mVar.o(6, this.f7866s);
        }
        if ((this.f7855f & 256) == 256) {
            mVar.m(7, this.f7867t);
        }
        if ((this.f7855f & 512) == 512) {
            mVar.m(8, this.f7868u);
        }
        if ((this.f7855f & 16) == 16) {
            mVar.m(9, this.k);
        }
        if ((this.f7855f & 64) == 64) {
            mVar.m(10, this.f7861n);
        }
        if ((this.f7855f & 1) == 1) {
            mVar.m(11, this.f7856g);
        }
        for (int i8 = 0; i8 < this.f7862o.size(); i8++) {
            mVar.o(12, (AbstractC0793b) this.f7862o.get(i8));
        }
        if (this.f7863p.size() > 0) {
            mVar.v(106);
            mVar.v(this.f7864q);
        }
        for (int i9 = 0; i9 < this.f7863p.size(); i9++) {
            mVar.n(((Integer) this.f7863p.get(i9)).intValue());
        }
        for (int i10 = 0; i10 < this.f7871x.size(); i10++) {
            mVar.o(14, (AbstractC0793b) this.f7871x.get(i10));
        }
        for (int i11 = 0; i11 < this.f7872y.size(); i11++) {
            mVar.o(15, (AbstractC0793b) this.f7872y.get(i11));
        }
        for (int i12 = 0; i12 < this.f7873z.size(); i12++) {
            mVar.o(16, (AbstractC0793b) this.f7873z.get(i12));
        }
        for (int i13 = 0; i13 < this.f7865r.size(); i13++) {
            mVar.o(17, (AbstractC0793b) this.f7865r.get(i13));
        }
        for (int i14 = 0; i14 < this.f7869v.size(); i14++) {
            mVar.m(31, ((Integer) this.f7869v.get(i14)).intValue());
        }
        for (int i15 = 0; i15 < this.f7870w.size(); i15++) {
            mVar.o(32, (AbstractC0793b) this.f7870w.get(i15));
        }
        for (int i16 = 0; i16 < this.f7849A.size(); i16++) {
            mVar.o(33, (AbstractC0793b) this.f7849A.get(i16));
        }
        for (int i17 = 0; i17 < this.f7850B.size(); i17++) {
            mVar.o(34, (AbstractC0793b) this.f7850B.get(i17));
        }
        for (int i18 = 0; i18 < this.f7851C.size(); i18++) {
            mVar.o(35, (AbstractC0793b) this.f7851C.get(i18));
        }
        rVar.d0(19000, mVar);
        mVar.r(this.f7854e);
    }

    public final void p() {
        this.f7856g = 518;
        this.f7857h = 2054;
        this.f7858i = 0;
        T t8 = T.f7932w;
        this.j = t8;
        this.k = 0;
        List list = Collections.EMPTY_LIST;
        this.f7859l = list;
        this.f7860m = t8;
        this.f7861n = 0;
        this.f7862o = list;
        this.f7863p = list;
        this.f7865r = list;
        this.f7866s = b0.f8012q;
        this.f7867t = 0;
        this.f7868u = 0;
        this.f7869v = list;
        this.f7870w = list;
        this.f7871x = list;
        this.f7872y = list;
        this.f7873z = list;
        this.f7849A = list;
        this.f7850B = list;
        this.f7851C = list;
    }

    public I() {
        this.f7864q = -1;
        this.f7852D = (byte) -1;
        this.f7853E = -1;
        this.f7854e = AbstractC0796e.f11223d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0413  */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public I(C0797f c0797f, C0799h c0799h) {
        boolean z8;
        int i4;
        int i8;
        this.f7864q = -1;
        this.f7852D = (byte) -1;
        this.f7853E = -1;
        p();
        C0795d n3 = AbstractC0796e.n();
        L5.m j = L5.m.j(n3, 1);
        boolean z9 = false;
        int i9 = 0;
        while (true) {
            int i10 = 1048576;
            boolean z10 = z8;
            ?? r42 = 16384;
            r4 = 16384;
            int i11 = 16384;
            if (!z9) {
                try {
                    int n8 = c0797f.n();
                    switch (n8) {
                        case 0:
                            z9 = z10;
                        case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                            this.f7855f |= 2;
                            this.f7857h = c0797f.f();
                        case 16:
                            this.f7855f |= 4;
                            this.f7858i = c0797f.f();
                        case 26:
                            S e9 = (this.f7855f & 8) == 8 ? this.j.e() : null;
                            T t8 = (T) c0797f.g(T.f7933x, c0799h);
                            this.j = t8;
                            if (e9 != null) {
                                e9.i(t8);
                                this.j = e9.g();
                            }
                            this.f7855f |= 8;
                        case 34:
                            if ((i9 & 32) != 32) {
                                this.f7859l = new ArrayList();
                                i9 |= 32;
                            }
                            this.f7859l.add(c0797f.g(Y.f7984q, c0799h));
                        case 42:
                            S e10 = (this.f7855f & 32) == 32 ? this.f7860m.e() : null;
                            T t9 = (T) c0797f.g(T.f7933x, c0799h);
                            this.f7860m = t9;
                            if (e10 != null) {
                                e10.i(t9);
                                this.f7860m = e10.g();
                            }
                            this.f7855f |= 32;
                        case 50:
                            a0 p8 = (this.f7855f & 128) == 128 ? this.f7866s.p() : null;
                            b0 b0Var = (b0) c0797f.g(b0.f8013r, c0799h);
                            this.f7866s = b0Var;
                            if (p8 != null) {
                                p8.i(b0Var);
                                this.f7866s = p8.g();
                            }
                            this.f7855f |= 128;
                        case 56:
                            this.f7855f |= 256;
                            this.f7867t = c0797f.f();
                        case 64:
                            this.f7855f |= 512;
                            this.f7868u = c0797f.f();
                        case 72:
                            this.f7855f |= 16;
                            this.k = c0797f.f();
                        case 80:
                            this.f7855f |= 64;
                            this.f7861n = c0797f.f();
                        case 88:
                            this.f7855f |= 1;
                            this.f7856g = c0797f.f();
                        case 98:
                            if ((i9 & 256) != 256) {
                                this.f7862o = new ArrayList();
                                i9 |= 256;
                            }
                            this.f7862o.add(c0797f.g(T.f7933x, c0799h));
                        case 104:
                            if ((i9 & 512) != 512) {
                                this.f7863p = new ArrayList();
                                i9 |= 512;
                            }
                            this.f7863p.add(Integer.valueOf(c0797f.f()));
                        case 106:
                            int d2 = c0797f.d(c0797f.k());
                            if ((i9 & 512) != 512 && c0797f.b() > 0) {
                                this.f7863p = new ArrayList();
                                i9 |= 512;
                            }
                            while (c0797f.b() > 0) {
                                this.f7863p.add(Integer.valueOf(c0797f.f()));
                            }
                            c0797f.c(d2);
                            break;
                        case 114:
                            if ((i9 & 65536) != 65536) {
                                this.f7871x = new ArrayList();
                                i9 |= 65536;
                            }
                            this.f7871x.add(c0797f.g(C0447h.k, c0799h));
                        case 122:
                            if ((i9 & 131072) != 131072) {
                                this.f7872y = new ArrayList();
                                i9 |= 131072;
                            }
                            this.f7872y.add(c0797f.g(C0447h.k, c0799h));
                        case 130:
                            if ((i9 & 262144) != 262144) {
                                this.f7873z = new ArrayList();
                                i9 |= 262144;
                            }
                            this.f7873z.add(c0797f.g(C0447h.k, c0799h));
                        case 138:
                            if ((i9 & 1024) != 1024) {
                                this.f7865r = new ArrayList();
                                i9 |= 1024;
                            }
                            this.f7865r.add(c0797f.g(b0.f8013r, c0799h));
                        case 248:
                            if ((i9 & 16384) != 16384) {
                                this.f7869v = new ArrayList();
                                i9 |= 16384;
                            }
                            this.f7869v.add(Integer.valueOf(c0797f.f()));
                        case 250:
                            i8 = 2097152;
                            int d3 = c0797f.d(c0797f.k());
                            if ((i9 & 16384) != 16384 && c0797f.b() > 0) {
                                this.f7869v = new ArrayList();
                                i9 |= 16384;
                            }
                            while (c0797f.b() > 0) {
                                i4 = i10;
                                try {
                                    try {
                                        this.f7869v.add(Integer.valueOf(c0797f.f()));
                                        i10 = i4;
                                    } catch (Throwable th) {
                                        th = th;
                                        if ((i9 & 32) == 32) {
                                            this.f7859l = Collections.unmodifiableList(this.f7859l);
                                        }
                                        if ((i9 & 256) == 256) {
                                            this.f7862o = Collections.unmodifiableList(this.f7862o);
                                        }
                                        if ((i9 & 512) == 512) {
                                            this.f7863p = Collections.unmodifiableList(this.f7863p);
                                        }
                                        if ((i9 & 65536) == 65536) {
                                            this.f7871x = Collections.unmodifiableList(this.f7871x);
                                        }
                                        if ((i9 & 131072) == 131072) {
                                            this.f7872y = Collections.unmodifiableList(this.f7872y);
                                        }
                                        if ((i9 & 262144) == 262144) {
                                            this.f7873z = Collections.unmodifiableList(this.f7873z);
                                        }
                                        if ((i9 & 1024) == 1024) {
                                            this.f7865r = Collections.unmodifiableList(this.f7865r);
                                        }
                                        if ((i9 & 16384) == i11) {
                                            this.f7869v = Collections.unmodifiableList(this.f7869v);
                                        }
                                        if ((i9 & 32768) == 32768) {
                                            this.f7870w = Collections.unmodifiableList(this.f7870w);
                                        }
                                        if ((i9 & 524288) == 524288) {
                                            this.f7849A = Collections.unmodifiableList(this.f7849A);
                                        }
                                        if ((i9 & i4) == i4) {
                                            this.f7850B = Collections.unmodifiableList(this.f7850B);
                                        }
                                        if ((i9 & i8) == i8) {
                                            this.f7851C = Collections.unmodifiableList(this.f7851C);
                                        }
                                        try {
                                            j.i();
                                        } catch (IOException unused) {
                                        } catch (Throwable th2) {
                                            this.f7854e = n3.e();
                                            throw th2;
                                        }
                                        this.f7854e = n3.e();
                                        m();
                                        throw th;
                                    }
                                } catch (InvalidProtocolBufferException e11) {
                                    e = e11;
                                    e.a(this);
                                    throw e;
                                } catch (IOException e12) {
                                    e = e12;
                                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                    invalidProtocolBufferException.a(this);
                                    throw invalidProtocolBufferException;
                                }
                            }
                            c0797f.c(d3);
                            break;
                        case 258:
                            if ((i9 & 32768) != 32768) {
                                this.f7870w = new ArrayList();
                                i9 |= 32768;
                            }
                            this.f7870w.add(c0797f.g(C0451l.k, c0799h));
                        case 266:
                            if ((i9 & 524288) != 524288) {
                                this.f7849A = new ArrayList();
                                i9 |= 524288;
                            }
                            this.f7849A.add(c0797f.g(C0447h.k, c0799h));
                        case 274:
                            if ((i9 & 1048576) != 1048576) {
                                this.f7850B = new ArrayList();
                                i9 |= 1048576;
                            }
                            this.f7850B.add(c0797f.g(C0447h.k, c0799h));
                        case 282:
                            if ((i9 & 2097152) != 2097152) {
                                this.f7851C = new ArrayList();
                                i9 |= 2097152;
                            }
                            try {
                                i8 = 2097152;
                            } catch (InvalidProtocolBufferException e13) {
                                e = e13;
                            } catch (IOException e14) {
                                e = e14;
                            } catch (Throwable th3) {
                                th = th3;
                                i8 = 2097152;
                            }
                            try {
                                this.f7851C.add(c0797f.g(C0447h.k, c0799h));
                            } catch (InvalidProtocolBufferException e15) {
                                e = e15;
                                e.a(this);
                                throw e;
                            } catch (IOException e16) {
                                e = e16;
                                InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e.getMessage());
                                invalidProtocolBufferException2.a(this);
                                throw invalidProtocolBufferException2;
                            } catch (Throwable th4) {
                                th = th4;
                                i4 = 1048576;
                                if ((i9 & 32) == 32) {
                                }
                                if ((i9 & 256) == 256) {
                                }
                                if ((i9 & 512) == 512) {
                                }
                                if ((i9 & 65536) == 65536) {
                                }
                                if ((i9 & 131072) == 131072) {
                                }
                                if ((i9 & 262144) == 262144) {
                                }
                                if ((i9 & 1024) == 1024) {
                                }
                                if ((i9 & 16384) == i11) {
                                }
                                if ((i9 & 32768) == 32768) {
                                }
                                if ((i9 & 524288) == 524288) {
                                }
                                if ((i9 & i4) == i4) {
                                }
                                if ((i9 & i8) == i8) {
                                }
                                j.i();
                                this.f7854e = n3.e();
                                m();
                                throw th;
                            }
                            break;
                        default:
                            r42 = n(c0797f, j, c0799h, n8);
                            z8 = r42 != 0 ? z10 : true;
                            z9 = z10;
                    }
                } catch (InvalidProtocolBufferException e17) {
                    e = e17;
                } catch (IOException e18) {
                    e = e18;
                } catch (Throwable th5) {
                    th = th5;
                    i4 = 1048576;
                    i8 = 2097152;
                    i11 = r42;
                }
            } else {
                if ((i9 & 32) == 32) {
                    this.f7859l = Collections.unmodifiableList(this.f7859l);
                }
                if ((i9 & 256) == 256) {
                    this.f7862o = Collections.unmodifiableList(this.f7862o);
                }
                if ((i9 & 512) == 512) {
                    this.f7863p = Collections.unmodifiableList(this.f7863p);
                }
                if ((i9 & 65536) == 65536) {
                    this.f7871x = Collections.unmodifiableList(this.f7871x);
                }
                if ((i9 & 131072) == 131072) {
                    this.f7872y = Collections.unmodifiableList(this.f7872y);
                }
                if ((i9 & 262144) == 262144) {
                    this.f7873z = Collections.unmodifiableList(this.f7873z);
                }
                if ((i9 & 1024) == 1024) {
                    this.f7865r = Collections.unmodifiableList(this.f7865r);
                }
                if ((i9 & 16384) == 16384) {
                    this.f7869v = Collections.unmodifiableList(this.f7869v);
                }
                if ((i9 & 32768) == 32768) {
                    this.f7870w = Collections.unmodifiableList(this.f7870w);
                }
                if ((i9 & 524288) == 524288) {
                    this.f7849A = Collections.unmodifiableList(this.f7849A);
                }
                if ((i9 & 1048576) == 1048576) {
                    this.f7850B = Collections.unmodifiableList(this.f7850B);
                }
                if ((i9 & 2097152) == 2097152) {
                    this.f7851C = Collections.unmodifiableList(this.f7851C);
                }
                try {
                    j.i();
                } catch (IOException unused2) {
                } catch (Throwable th6) {
                    this.f7854e = n3.e();
                    throw th6;
                }
                this.f7854e = n3.e();
                m();
                return;
            }
        }
    }
}
