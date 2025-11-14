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

/* renamed from: a7.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450k extends AbstractC0803l {

    /* renamed from: O, reason: collision with root package name */
    public static final C0450k f8142O;

    /* renamed from: P, reason: collision with root package name */
    public static final C0440a f8143P = new C0440a(3);

    /* renamed from: A, reason: collision with root package name */
    public T f8144A;

    /* renamed from: B, reason: collision with root package name */
    public int f8145B;

    /* renamed from: C, reason: collision with root package name */
    public List f8146C;

    /* renamed from: D, reason: collision with root package name */
    public int f8147D;

    /* renamed from: E, reason: collision with root package name */
    public List f8148E;

    /* renamed from: F, reason: collision with root package name */
    public List f8149F;

    /* renamed from: G, reason: collision with root package name */
    public int f8150G;

    /* renamed from: H, reason: collision with root package name */
    public List f8151H;

    /* renamed from: I, reason: collision with root package name */
    public Z f8152I;

    /* renamed from: J, reason: collision with root package name */
    public List f8153J;
    public g0 K;

    /* renamed from: L, reason: collision with root package name */
    public List f8154L;

    /* renamed from: M, reason: collision with root package name */
    public byte f8155M;

    /* renamed from: N, reason: collision with root package name */
    public int f8156N;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0796e f8157e;

    /* renamed from: f, reason: collision with root package name */
    public int f8158f;

    /* renamed from: g, reason: collision with root package name */
    public int f8159g;

    /* renamed from: h, reason: collision with root package name */
    public int f8160h;

    /* renamed from: i, reason: collision with root package name */
    public int f8161i;
    public List j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public List f8162l;

    /* renamed from: m, reason: collision with root package name */
    public int f8163m;

    /* renamed from: n, reason: collision with root package name */
    public List f8164n;

    /* renamed from: o, reason: collision with root package name */
    public int f8165o;

    /* renamed from: p, reason: collision with root package name */
    public List f8166p;

    /* renamed from: q, reason: collision with root package name */
    public List f8167q;

    /* renamed from: r, reason: collision with root package name */
    public int f8168r;

    /* renamed from: s, reason: collision with root package name */
    public List f8169s;

    /* renamed from: t, reason: collision with root package name */
    public List f8170t;

    /* renamed from: u, reason: collision with root package name */
    public List f8171u;

    /* renamed from: v, reason: collision with root package name */
    public List f8172v;

    /* renamed from: w, reason: collision with root package name */
    public List f8173w;

    /* renamed from: x, reason: collision with root package name */
    public List f8174x;

    /* renamed from: y, reason: collision with root package name */
    public int f8175y;

    /* renamed from: z, reason: collision with root package name */
    public int f8176z;

    static {
        C0450k c0450k = new C0450k();
        f8142O = c0450k;
        c0450k.p();
    }

    public C0450k(C0448i c0448i) {
        super(c0448i);
        this.f8163m = -1;
        this.f8165o = -1;
        this.f8168r = -1;
        this.f8175y = -1;
        this.f8147D = -1;
        this.f8150G = -1;
        this.f8155M = (byte) -1;
        this.f8156N = -1;
        this.f8157e = c0448i.f11240d;
    }

    @Override // g7.u
    public final AbstractC0793b a() {
        return f8142O;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f8155M;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f8158f & 2) == 2) {
            for (int i4 = 0; i4 < this.j.size(); i4++) {
                if (!((Y) this.j.get(i4)).b()) {
                    this.f8155M = (byte) 0;
                    return false;
                }
            }
            for (int i8 = 0; i8 < this.k.size(); i8++) {
                if (!((T) this.k.get(i8)).b()) {
                    this.f8155M = (byte) 0;
                    return false;
                }
            }
            for (int i9 = 0; i9 < this.f8166p.size(); i9++) {
                if (!((T) this.f8166p.get(i9)).b()) {
                    this.f8155M = (byte) 0;
                    return false;
                }
            }
            for (int i10 = 0; i10 < this.f8169s.size(); i10++) {
                if (!((C0453n) this.f8169s.get(i10)).b()) {
                    this.f8155M = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < this.f8170t.size(); i11++) {
                if (!((C0439A) this.f8170t.get(i11)).b()) {
                    this.f8155M = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < this.f8171u.size(); i12++) {
                if (!((I) this.f8171u.get(i12)).b()) {
                    this.f8155M = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < this.f8172v.size(); i13++) {
                if (!((V) this.f8172v.get(i13)).b()) {
                    this.f8155M = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < this.f8173w.size(); i14++) {
                if (!((C0460v) this.f8173w.get(i14)).b()) {
                    this.f8155M = (byte) 0;
                    return false;
                }
            }
            if ((this.f8158f & 16) == 16 && !this.f8144A.b()) {
                this.f8155M = (byte) 0;
                return false;
            }
            for (int i15 = 0; i15 < this.f8148E.size(); i15++) {
                if (!((T) this.f8148E.get(i15)).b()) {
                    this.f8155M = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < this.f8151H.size(); i16++) {
                if (!((C0447h) this.f8151H.get(i16)).b()) {
                    this.f8155M = (byte) 0;
                    return false;
                }
            }
            if ((this.f8158f & 64) == 64 && !this.f8152I.b()) {
                this.f8155M = (byte) 0;
                return false;
            }
            for (int i17 = 0; i17 < this.f8154L.size(); i17++) {
                if (!((C0451l) this.f8154L.get(i17)).b()) {
                    this.f8155M = (byte) 0;
                    return false;
                }
            }
            if (!i()) {
                this.f8155M = (byte) 0;
                return false;
            }
            this.f8155M = (byte) 1;
            return true;
        }
        this.f8155M = (byte) 0;
        return false;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f8156N;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f8158f & 1) == 1) {
            i4 = L5.m.b(1, this.f8159g);
        } else {
            i4 = 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f8162l.size(); i10++) {
            i9 += L5.m.c(((Integer) this.f8162l.get(i10)).intValue());
        }
        int i11 = i4 + i9;
        if (!this.f8162l.isEmpty()) {
            i11 = i11 + 1 + L5.m.c(i9);
        }
        this.f8163m = i9;
        if ((this.f8158f & 2) == 2) {
            i11 += L5.m.b(3, this.f8160h);
        }
        if ((this.f8158f & 4) == 4) {
            i11 += L5.m.b(4, this.f8161i);
        }
        for (int i12 = 0; i12 < this.j.size(); i12++) {
            i11 += L5.m.d(5, (AbstractC0793b) this.j.get(i12));
        }
        for (int i13 = 0; i13 < this.k.size(); i13++) {
            i11 += L5.m.d(6, (AbstractC0793b) this.k.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f8164n.size(); i15++) {
            i14 += L5.m.c(((Integer) this.f8164n.get(i15)).intValue());
        }
        int i16 = i11 + i14;
        if (!this.f8164n.isEmpty()) {
            i16 = i16 + 1 + L5.m.c(i14);
        }
        this.f8165o = i14;
        for (int i17 = 0; i17 < this.f8169s.size(); i17++) {
            i16 += L5.m.d(8, (AbstractC0793b) this.f8169s.get(i17));
        }
        for (int i18 = 0; i18 < this.f8170t.size(); i18++) {
            i16 += L5.m.d(9, (AbstractC0793b) this.f8170t.get(i18));
        }
        for (int i19 = 0; i19 < this.f8171u.size(); i19++) {
            i16 += L5.m.d(10, (AbstractC0793b) this.f8171u.get(i19));
        }
        for (int i20 = 0; i20 < this.f8172v.size(); i20++) {
            i16 += L5.m.d(11, (AbstractC0793b) this.f8172v.get(i20));
        }
        for (int i21 = 0; i21 < this.f8173w.size(); i21++) {
            i16 += L5.m.d(13, (AbstractC0793b) this.f8173w.get(i21));
        }
        int i22 = 0;
        for (int i23 = 0; i23 < this.f8174x.size(); i23++) {
            i22 += L5.m.c(((Integer) this.f8174x.get(i23)).intValue());
        }
        int i24 = i16 + i22;
        if (!this.f8174x.isEmpty()) {
            i24 = i24 + 2 + L5.m.c(i22);
        }
        this.f8175y = i22;
        if ((this.f8158f & 8) == 8) {
            i24 += L5.m.b(17, this.f8176z);
        }
        if ((this.f8158f & 16) == 16) {
            i24 += L5.m.d(18, this.f8144A);
        }
        if ((this.f8158f & 32) == 32) {
            i24 += L5.m.b(19, this.f8145B);
        }
        for (int i25 = 0; i25 < this.f8166p.size(); i25++) {
            i24 += L5.m.d(20, (AbstractC0793b) this.f8166p.get(i25));
        }
        int i26 = 0;
        for (int i27 = 0; i27 < this.f8167q.size(); i27++) {
            i26 += L5.m.c(((Integer) this.f8167q.get(i27)).intValue());
        }
        int i28 = i24 + i26;
        if (!this.f8167q.isEmpty()) {
            i28 = i28 + 2 + L5.m.c(i26);
        }
        this.f8168r = i26;
        int i29 = 0;
        for (int i30 = 0; i30 < this.f8146C.size(); i30++) {
            i29 += L5.m.c(((Integer) this.f8146C.get(i30)).intValue());
        }
        int i31 = i28 + i29;
        if (!this.f8146C.isEmpty()) {
            i31 = i31 + 2 + L5.m.c(i29);
        }
        this.f8147D = i29;
        for (int i32 = 0; i32 < this.f8148E.size(); i32++) {
            i31 += L5.m.d(23, (AbstractC0793b) this.f8148E.get(i32));
        }
        int i33 = 0;
        for (int i34 = 0; i34 < this.f8149F.size(); i34++) {
            i33 += L5.m.c(((Integer) this.f8149F.get(i34)).intValue());
        }
        int i35 = i31 + i33;
        if (!this.f8149F.isEmpty()) {
            i35 = i35 + 2 + L5.m.c(i33);
        }
        this.f8150G = i33;
        for (int i36 = 0; i36 < this.f8151H.size(); i36++) {
            i35 += L5.m.d(25, (AbstractC0793b) this.f8151H.get(i36));
        }
        if ((this.f8158f & 64) == 64) {
            i35 += L5.m.d(30, this.f8152I);
        }
        int i37 = 0;
        for (int i38 = 0; i38 < this.f8153J.size(); i38++) {
            i37 += L5.m.c(((Integer) this.f8153J.get(i38)).intValue());
        }
        int size = (this.f8153J.size() * 2) + i35 + i37;
        if ((this.f8158f & 128) == 128) {
            size += L5.m.d(32, this.K);
        }
        for (int i39 = 0; i39 < this.f8154L.size(); i39++) {
            size += L5.m.d(33, (AbstractC0793b) this.f8154L.get(i39));
        }
        int size2 = this.f8157e.size() + j() + size;
        this.f8156N = size2;
        return size2;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return C0448i.h();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        C0448i h8 = C0448i.h();
        h8.i(this);
        return h8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        R3.r rVar = new R3.r(this);
        if ((this.f8158f & 1) == 1) {
            mVar.m(1, this.f8159g);
        }
        if (this.f8162l.size() > 0) {
            mVar.v(18);
            mVar.v(this.f8163m);
        }
        for (int i4 = 0; i4 < this.f8162l.size(); i4++) {
            mVar.n(((Integer) this.f8162l.get(i4)).intValue());
        }
        if ((this.f8158f & 2) == 2) {
            mVar.m(3, this.f8160h);
        }
        if ((this.f8158f & 4) == 4) {
            mVar.m(4, this.f8161i);
        }
        for (int i8 = 0; i8 < this.j.size(); i8++) {
            mVar.o(5, (AbstractC0793b) this.j.get(i8));
        }
        for (int i9 = 0; i9 < this.k.size(); i9++) {
            mVar.o(6, (AbstractC0793b) this.k.get(i9));
        }
        if (this.f8164n.size() > 0) {
            mVar.v(58);
            mVar.v(this.f8165o);
        }
        for (int i10 = 0; i10 < this.f8164n.size(); i10++) {
            mVar.n(((Integer) this.f8164n.get(i10)).intValue());
        }
        for (int i11 = 0; i11 < this.f8169s.size(); i11++) {
            mVar.o(8, (AbstractC0793b) this.f8169s.get(i11));
        }
        for (int i12 = 0; i12 < this.f8170t.size(); i12++) {
            mVar.o(9, (AbstractC0793b) this.f8170t.get(i12));
        }
        for (int i13 = 0; i13 < this.f8171u.size(); i13++) {
            mVar.o(10, (AbstractC0793b) this.f8171u.get(i13));
        }
        for (int i14 = 0; i14 < this.f8172v.size(); i14++) {
            mVar.o(11, (AbstractC0793b) this.f8172v.get(i14));
        }
        for (int i15 = 0; i15 < this.f8173w.size(); i15++) {
            mVar.o(13, (AbstractC0793b) this.f8173w.get(i15));
        }
        if (this.f8174x.size() > 0) {
            mVar.v(130);
            mVar.v(this.f8175y);
        }
        for (int i16 = 0; i16 < this.f8174x.size(); i16++) {
            mVar.n(((Integer) this.f8174x.get(i16)).intValue());
        }
        if ((this.f8158f & 8) == 8) {
            mVar.m(17, this.f8176z);
        }
        if ((this.f8158f & 16) == 16) {
            mVar.o(18, this.f8144A);
        }
        if ((this.f8158f & 32) == 32) {
            mVar.m(19, this.f8145B);
        }
        for (int i17 = 0; i17 < this.f8166p.size(); i17++) {
            mVar.o(20, (AbstractC0793b) this.f8166p.get(i17));
        }
        if (this.f8167q.size() > 0) {
            mVar.v(170);
            mVar.v(this.f8168r);
        }
        for (int i18 = 0; i18 < this.f8167q.size(); i18++) {
            mVar.n(((Integer) this.f8167q.get(i18)).intValue());
        }
        if (this.f8146C.size() > 0) {
            mVar.v(178);
            mVar.v(this.f8147D);
        }
        for (int i19 = 0; i19 < this.f8146C.size(); i19++) {
            mVar.n(((Integer) this.f8146C.get(i19)).intValue());
        }
        for (int i20 = 0; i20 < this.f8148E.size(); i20++) {
            mVar.o(23, (AbstractC0793b) this.f8148E.get(i20));
        }
        if (this.f8149F.size() > 0) {
            mVar.v(194);
            mVar.v(this.f8150G);
        }
        for (int i21 = 0; i21 < this.f8149F.size(); i21++) {
            mVar.n(((Integer) this.f8149F.get(i21)).intValue());
        }
        for (int i22 = 0; i22 < this.f8151H.size(); i22++) {
            mVar.o(25, (AbstractC0793b) this.f8151H.get(i22));
        }
        if ((this.f8158f & 64) == 64) {
            mVar.o(30, this.f8152I);
        }
        for (int i23 = 0; i23 < this.f8153J.size(); i23++) {
            mVar.m(31, ((Integer) this.f8153J.get(i23)).intValue());
        }
        if ((this.f8158f & 128) == 128) {
            mVar.o(32, this.K);
        }
        for (int i24 = 0; i24 < this.f8154L.size(); i24++) {
            mVar.o(33, (AbstractC0793b) this.f8154L.get(i24));
        }
        rVar.d0(19000, mVar);
        mVar.r(this.f8157e);
    }

    public final void p() {
        this.f8159g = 6;
        this.f8160h = 0;
        this.f8161i = 0;
        List list = Collections.EMPTY_LIST;
        this.j = list;
        this.k = list;
        this.f8162l = list;
        this.f8164n = list;
        this.f8166p = list;
        this.f8167q = list;
        this.f8169s = list;
        this.f8170t = list;
        this.f8171u = list;
        this.f8172v = list;
        this.f8173w = list;
        this.f8174x = list;
        this.f8176z = 0;
        this.f8144A = T.f7932w;
        this.f8145B = 0;
        this.f8146C = list;
        this.f8148E = list;
        this.f8149F = list;
        this.f8151H = list;
        this.f8152I = Z.j;
        this.f8153J = list;
        this.K = g0.f8097h;
        this.f8154L = list;
    }

    public C0450k() {
        this.f8163m = -1;
        this.f8165o = -1;
        this.f8168r = -1;
        this.f8175y = -1;
        this.f8147D = -1;
        this.f8150G = -1;
        this.f8155M = (byte) -1;
        this.f8156N = -1;
        this.f8157e = AbstractC0796e.f11223d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0048. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public C0450k(C0797f c0797f, C0799h c0799h) {
        char c6;
        char c9;
        this.f8163m = -1;
        this.f8165o = -1;
        this.f8168r = -1;
        this.f8175y = -1;
        this.f8147D = -1;
        this.f8150G = -1;
        this.f8155M = (byte) -1;
        this.f8156N = -1;
        p();
        C0795d n3 = AbstractC0796e.n();
        boolean z8 = true;
        L5.m j = L5.m.j(n3, 1);
        boolean z9 = false;
        char c10 = 0;
        while (true) {
            boolean z10 = z8;
            if (!z9) {
                try {
                    int n8 = c0797f.n();
                    C0446g c0446g = null;
                    switch (n8) {
                        case 0:
                            z9 = z10;
                            z8 = z10;
                            c10 = c10;
                        case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                            this.f8158f |= 1;
                            this.f8159g = c0797f.f();
                            z8 = z10;
                            c10 = c10;
                        case 16:
                            int i4 = (c10 == true ? 1 : 0) & 32;
                            c10 = c10;
                            if (i4 != 32) {
                                this.f8162l = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | ' ';
                            }
                            this.f8162l.add(Integer.valueOf(c0797f.f()));
                            z8 = z10;
                            c10 = c10;
                        case 18:
                            int d2 = c0797f.d(c0797f.k());
                            int i8 = (c10 == true ? 1 : 0) & 32;
                            c10 = c10;
                            if (i8 != 32) {
                                c10 = c10;
                                if (c0797f.b() > 0) {
                                    this.f8162l = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | ' ';
                                }
                            }
                            while (c0797f.b() > 0) {
                                this.f8162l.add(Integer.valueOf(c0797f.f()));
                            }
                            c0797f.c(d2);
                            z8 = z10;
                            c10 = c10;
                        case 24:
                            this.f8158f |= 2;
                            this.f8160h = c0797f.f();
                            z8 = z10;
                            c10 = c10;
                        case 32:
                            this.f8158f |= 4;
                            this.f8161i = c0797f.f();
                            z8 = z10;
                            c10 = c10;
                        case 42:
                            int i9 = (c10 == true ? 1 : 0) & 8;
                            c10 = c10;
                            if (i9 != 8) {
                                this.j = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | '\b';
                            }
                            this.j.add(c0797f.g(Y.f7984q, c0799h));
                            z8 = z10;
                            c10 = c10;
                        case 50:
                            int i10 = (c10 == true ? 1 : 0) & 16;
                            c10 = c10;
                            if (i10 != 16) {
                                this.k = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 16;
                            }
                            this.k.add(c0797f.g(T.f7933x, c0799h));
                            z8 = z10;
                            c10 = c10;
                        case 56:
                            int i11 = (c10 == true ? 1 : 0) & 64;
                            c10 = c10;
                            if (i11 != 64) {
                                this.f8164n = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | '@';
                            }
                            this.f8164n.add(Integer.valueOf(c0797f.f()));
                            z8 = z10;
                            c10 = c10;
                        case 58:
                            int d3 = c0797f.d(c0797f.k());
                            int i12 = (c10 == true ? 1 : 0) & 64;
                            c10 = c10;
                            if (i12 != 64) {
                                c10 = c10;
                                if (c0797f.b() > 0) {
                                    this.f8164n = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | '@';
                                }
                            }
                            while (c0797f.b() > 0) {
                                this.f8164n.add(Integer.valueOf(c0797f.f()));
                            }
                            c0797f.c(d3);
                            z8 = z10;
                            c10 = c10;
                        case 66:
                            int i13 = (c10 == true ? 1 : 0) & 512;
                            c10 = c10;
                            if (i13 != 512) {
                                this.f8169s = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 512;
                            }
                            this.f8169s.add(c0797f.g(C0453n.f8188o, c0799h));
                            z8 = z10;
                            c10 = c10;
                        case 74:
                            int i14 = (c10 == true ? 1 : 0) & 1024;
                            c10 = c10;
                            if (i14 != 1024) {
                                this.f8170t = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 1024;
                            }
                            this.f8170t.add(c0797f.g(C0439A.f7776C, c0799h));
                            z8 = z10;
                            c10 = c10;
                        case 82:
                            int i15 = (c10 == true ? 1 : 0) & 2048;
                            c10 = c10;
                            if (i15 != 2048) {
                                this.f8171u = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 2048;
                            }
                            this.f8171u.add(c0797f.g(I.f7848G, c0799h));
                            z8 = z10;
                            c10 = c10;
                        case 90:
                            int i16 = (c10 == true ? 1 : 0) & 4096;
                            c10 = c10;
                            if (i16 != 4096) {
                                this.f8172v = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 4096;
                            }
                            this.f8172v.add(c0797f.g(V.f7960t, c0799h));
                            z8 = z10;
                            c10 = c10;
                        case 106:
                            int i17 = (c10 == true ? 1 : 0) & 8192;
                            c10 = c10;
                            if (i17 != 8192) {
                                this.f8173w = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 8192;
                            }
                            this.f8173w.add(c0797f.g(C0460v.f8231l, c0799h));
                            z8 = z10;
                            c10 = c10;
                        case 128:
                            int i18 = (c10 == true ? 1 : 0) & 16384;
                            c10 = c10;
                            if (i18 != 16384) {
                                this.f8174x = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 16384;
                            }
                            this.f8174x.add(Integer.valueOf(c0797f.f()));
                            z8 = z10;
                            c10 = c10;
                        case 130:
                            int d9 = c0797f.d(c0797f.k());
                            int i19 = (c10 == true ? 1 : 0) & 16384;
                            c10 = c10;
                            if (i19 != 16384) {
                                c10 = c10;
                                if (c0797f.b() > 0) {
                                    this.f8174x = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 16384;
                                }
                            }
                            while (c0797f.b() > 0) {
                                this.f8174x.add(Integer.valueOf(c0797f.f()));
                            }
                            c0797f.c(d9);
                            z8 = z10;
                            c10 = c10;
                        case 136:
                            this.f8158f |= 8;
                            this.f8176z = c0797f.f();
                            z8 = z10;
                            c10 = c10;
                        case 146:
                            S e9 = (this.f8158f & 16) == 16 ? this.f8144A.e() : null;
                            T t8 = (T) c0797f.g(T.f7933x, c0799h);
                            this.f8144A = t8;
                            if (e9 != null) {
                                e9.i(t8);
                                this.f8144A = e9.g();
                            }
                            this.f8158f |= 16;
                            z8 = z10;
                            c10 = c10;
                        case 152:
                            this.f8158f |= 32;
                            this.f8145B = c0797f.f();
                            z8 = z10;
                            c10 = c10;
                        case 162:
                            int i20 = (c10 == true ? 1 : 0) & 128;
                            c10 = c10;
                            if (i20 != 128) {
                                this.f8166p = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 128;
                            }
                            this.f8166p.add(c0797f.g(T.f7933x, c0799h));
                            z8 = z10;
                            c10 = c10;
                        case 168:
                            int i21 = (c10 == true ? 1 : 0) & 256;
                            c10 = c10;
                            if (i21 != 256) {
                                this.f8167q = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 256;
                            }
                            this.f8167q.add(Integer.valueOf(c0797f.f()));
                            z8 = z10;
                            c10 = c10;
                        case 170:
                            int d10 = c0797f.d(c0797f.k());
                            int i22 = (c10 == true ? 1 : 0) & 256;
                            c10 = c10;
                            if (i22 != 256) {
                                c10 = c10;
                                if (c0797f.b() > 0) {
                                    this.f8167q = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 256;
                                }
                            }
                            while (c0797f.b() > 0) {
                                this.f8167q.add(Integer.valueOf(c0797f.f()));
                            }
                            c0797f.c(d10);
                            z8 = z10;
                            c10 = c10;
                        case 176:
                            int i23 = (c10 == true ? 1 : 0) & 262144;
                            c10 = c10;
                            if (i23 != 262144) {
                                this.f8146C = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f8146C.add(Integer.valueOf(c0797f.f()));
                            z8 = z10;
                            c10 = c10;
                        case 178:
                            int d11 = c0797f.d(c0797f.k());
                            int i24 = (c10 == true ? 1 : 0) & 262144;
                            c10 = c10;
                            if (i24 != 262144) {
                                c10 = c10;
                                if (c0797f.b() > 0) {
                                    this.f8146C = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 0;
                                }
                            }
                            while (c0797f.b() > 0) {
                                this.f8146C.add(Integer.valueOf(c0797f.f()));
                            }
                            c0797f.c(d11);
                            z8 = z10;
                            c10 = c10;
                        case 186:
                            int i25 = (c10 == true ? 1 : 0) & 524288;
                            c10 = c10;
                            if (i25 != 524288) {
                                this.f8148E = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f8148E.add(c0797f.g(T.f7933x, c0799h));
                            z8 = z10;
                            c10 = c10;
                        case 192:
                            int i26 = (c10 == true ? 1 : 0) & 1048576;
                            c10 = c10;
                            if (i26 != 1048576) {
                                this.f8149F = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f8149F.add(Integer.valueOf(c0797f.f()));
                            z8 = z10;
                            c10 = c10;
                        case 194:
                            int d12 = c0797f.d(c0797f.k());
                            int i27 = (c10 == true ? 1 : 0) & 1048576;
                            c10 = c10;
                            if (i27 != 1048576) {
                                c10 = c10;
                                if (c0797f.b() > 0) {
                                    this.f8149F = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 0;
                                }
                            }
                            while (c0797f.b() > 0) {
                                this.f8149F.add(Integer.valueOf(c0797f.f()));
                            }
                            c0797f.c(d12);
                            z8 = z10;
                            c10 = c10;
                        case 202:
                            int i28 = (c10 == true ? 1 : 0) & 2097152;
                            c10 = c10;
                            if (i28 != 2097152) {
                                this.f8151H = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f8151H.add(c0797f.g(C0447h.k, c0799h));
                            z8 = z10;
                            c10 = c10;
                        case 242:
                            if ((this.f8158f & 64) == 64) {
                                Z z11 = this.f8152I;
                                z11.getClass();
                                c0446g = Z.i(z11);
                            }
                            C0446g c0446g2 = c0446g;
                            Z z12 = (Z) c0797f.g(Z.k, c0799h);
                            this.f8152I = z12;
                            if (c0446g2 != null) {
                                c0446g2.j(z12);
                                this.f8152I = c0446g2.g();
                            }
                            this.f8158f |= 64;
                            z8 = z10;
                            c10 = c10;
                        case 248:
                            int i29 = (c10 == true ? 1 : 0) & 8388608;
                            c10 = c10;
                            if (i29 != 8388608) {
                                this.f8153J = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f8153J.add(Integer.valueOf(c0797f.f()));
                            z8 = z10;
                            c10 = c10;
                        case 250:
                            int d13 = c0797f.d(c0797f.k());
                            int i30 = (c10 == true ? 1 : 0) & 8388608;
                            c10 = c10;
                            if (i30 != 8388608) {
                                c10 = c10;
                                if (c0797f.b() > 0) {
                                    this.f8153J = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 0;
                                }
                            }
                            while (c0797f.b() > 0) {
                                this.f8153J.add(Integer.valueOf(c0797f.f()));
                            }
                            c0797f.c(d13);
                            z8 = z10;
                            c10 = c10;
                        case 258:
                            C0454o i31 = (this.f8158f & 128) == 128 ? this.K.i() : null;
                            g0 g0Var = (g0) c0797f.g(g0.f8098i, c0799h);
                            this.K = g0Var;
                            if (i31 != null) {
                                i31.m(g0Var);
                                this.K = i31.i();
                            }
                            this.f8158f |= 128;
                            z8 = z10;
                            c10 = c10;
                        case 266:
                            int i32 = (c10 == true ? 1 : 0) & 33554432;
                            c10 = c10;
                            if (i32 != 33554432) {
                                this.f8154L = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 0;
                            }
                            c6 = 0;
                            try {
                                try {
                                    this.f8154L.add(c0797f.g(C0451l.k, c0799h));
                                    z8 = z10;
                                    c10 = c10;
                                } catch (Throwable th) {
                                    th = th;
                                    c9 = c10;
                                    if ((c9 & ' ') == 32) {
                                        this.f8162l = Collections.unmodifiableList(this.f8162l);
                                    }
                                    if ((c9 & '\b') == 8) {
                                        this.j = Collections.unmodifiableList(this.j);
                                    }
                                    if ((c9 & 16) == 16) {
                                        this.k = Collections.unmodifiableList(this.k);
                                    }
                                    if ((c9 & '@') == 64) {
                                        this.f8164n = Collections.unmodifiableList(this.f8164n);
                                    }
                                    if ((c9 & 512) == 512) {
                                        this.f8169s = Collections.unmodifiableList(this.f8169s);
                                    }
                                    if ((c9 & 1024) == 1024) {
                                        this.f8170t = Collections.unmodifiableList(this.f8170t);
                                    }
                                    if ((c9 & 2048) == 2048) {
                                        this.f8171u = Collections.unmodifiableList(this.f8171u);
                                    }
                                    if ((c9 & 4096) == 4096) {
                                        this.f8172v = Collections.unmodifiableList(this.f8172v);
                                    }
                                    if ((c9 & 8192) == 8192) {
                                        this.f8173w = Collections.unmodifiableList(this.f8173w);
                                    }
                                    if ((c9 & 16384) == 16384) {
                                        this.f8174x = Collections.unmodifiableList(this.f8174x);
                                    }
                                    if ((c9 & 128) == 128) {
                                        this.f8166p = Collections.unmodifiableList(this.f8166p);
                                    }
                                    if ((c9 & 256) == 256) {
                                        this.f8167q = Collections.unmodifiableList(this.f8167q);
                                    }
                                    if ((c9 & 0) == 262144) {
                                        this.f8146C = Collections.unmodifiableList(this.f8146C);
                                    }
                                    if ((c9 & 0) == 524288) {
                                        this.f8148E = Collections.unmodifiableList(this.f8148E);
                                    }
                                    if ((c9 & 0) == 1048576) {
                                        this.f8149F = Collections.unmodifiableList(this.f8149F);
                                    }
                                    if ((c9 & 0) == 2097152) {
                                        this.f8151H = Collections.unmodifiableList(this.f8151H);
                                    }
                                    if ((c9 & 0) == 8388608) {
                                        this.f8153J = Collections.unmodifiableList(this.f8153J);
                                    }
                                    if ((c9 & c6) == c6) {
                                        this.f8154L = Collections.unmodifiableList(this.f8154L);
                                    }
                                    try {
                                        j.i();
                                    } catch (IOException unused) {
                                    } catch (Throwable th2) {
                                        this.f8157e = n3.e();
                                        throw th2;
                                    }
                                    this.f8157e = n3.e();
                                    m();
                                    throw th;
                                }
                            } catch (InvalidProtocolBufferException e10) {
                                e = e10;
                                e.a(this);
                                throw e;
                            } catch (IOException e11) {
                                e = e11;
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                invalidProtocolBufferException.a(this);
                                throw invalidProtocolBufferException;
                            }
                        default:
                            if (n(c0797f, j, c0799h, n8)) {
                                z8 = z10;
                                c10 = c10;
                            }
                            z9 = z10;
                            z8 = z10;
                            c10 = c10;
                    }
                } catch (InvalidProtocolBufferException e12) {
                    e = e12;
                } catch (IOException e13) {
                    e = e13;
                } catch (Throwable th3) {
                    th = th3;
                    c6 = 0;
                    c9 = c10;
                }
            } else {
                if (((c10 == true ? 1 : 0) & 32) == 32) {
                    this.f8162l = Collections.unmodifiableList(this.f8162l);
                }
                if (((c10 == true ? 1 : 0) & 8) == 8) {
                    this.j = Collections.unmodifiableList(this.j);
                }
                if (((c10 == true ? 1 : 0) & 16) == 16) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if (((c10 == true ? 1 : 0) & 64) == 64) {
                    this.f8164n = Collections.unmodifiableList(this.f8164n);
                }
                if (((c10 == true ? 1 : 0) & 512) == 512) {
                    this.f8169s = Collections.unmodifiableList(this.f8169s);
                }
                if (((c10 == true ? 1 : 0) & 1024) == 1024) {
                    this.f8170t = Collections.unmodifiableList(this.f8170t);
                }
                if (((c10 == true ? 1 : 0) & 2048) == 2048) {
                    this.f8171u = Collections.unmodifiableList(this.f8171u);
                }
                if (((c10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f8172v = Collections.unmodifiableList(this.f8172v);
                }
                if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f8173w = Collections.unmodifiableList(this.f8173w);
                }
                if (((c10 == true ? 1 : 0) & 16384) == 16384) {
                    this.f8174x = Collections.unmodifiableList(this.f8174x);
                }
                if (((c10 == true ? 1 : 0) & 128) == 128) {
                    this.f8166p = Collections.unmodifiableList(this.f8166p);
                }
                if (((c10 == true ? 1 : 0) & 256) == 256) {
                    this.f8167q = Collections.unmodifiableList(this.f8167q);
                }
                if (((c10 == true ? 1 : 0) & 262144) == 262144) {
                    this.f8146C = Collections.unmodifiableList(this.f8146C);
                }
                if (((c10 == true ? 1 : 0) & 524288) == 524288) {
                    this.f8148E = Collections.unmodifiableList(this.f8148E);
                }
                if (((c10 == true ? 1 : 0) & 1048576) == 1048576) {
                    this.f8149F = Collections.unmodifiableList(this.f8149F);
                }
                if (((c10 == true ? 1 : 0) & 2097152) == 2097152) {
                    this.f8151H = Collections.unmodifiableList(this.f8151H);
                }
                if (((c10 == true ? 1 : 0) & 8388608) == 8388608) {
                    this.f8153J = Collections.unmodifiableList(this.f8153J);
                }
                if (((c10 == true ? 1 : 0) & 33554432) == 33554432) {
                    this.f8154L = Collections.unmodifiableList(this.f8154L);
                }
                try {
                    j.i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f8157e = n3.e();
                    throw th4;
                }
                this.f8157e = n3.e();
                m();
                return;
            }
        }
    }
}
