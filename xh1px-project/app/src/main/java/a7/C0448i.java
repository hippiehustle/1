package a7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.AbstractC0802k;
import g7.C0797f;
import g7.C0799h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: a7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0448i extends AbstractC0802k {

    /* renamed from: A, reason: collision with root package name */
    public List f8111A;

    /* renamed from: B, reason: collision with root package name */
    public List f8112B;

    /* renamed from: C, reason: collision with root package name */
    public List f8113C;

    /* renamed from: D, reason: collision with root package name */
    public Z f8114D;

    /* renamed from: E, reason: collision with root package name */
    public List f8115E;

    /* renamed from: F, reason: collision with root package name */
    public g0 f8116F;

    /* renamed from: G, reason: collision with root package name */
    public List f8117G;

    /* renamed from: g, reason: collision with root package name */
    public int f8118g;

    /* renamed from: h, reason: collision with root package name */
    public int f8119h;

    /* renamed from: i, reason: collision with root package name */
    public int f8120i;
    public int j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public List f8121l;

    /* renamed from: m, reason: collision with root package name */
    public List f8122m;

    /* renamed from: n, reason: collision with root package name */
    public List f8123n;

    /* renamed from: o, reason: collision with root package name */
    public List f8124o;

    /* renamed from: p, reason: collision with root package name */
    public List f8125p;

    /* renamed from: q, reason: collision with root package name */
    public List f8126q;

    /* renamed from: r, reason: collision with root package name */
    public List f8127r;

    /* renamed from: s, reason: collision with root package name */
    public List f8128s;

    /* renamed from: t, reason: collision with root package name */
    public List f8129t;

    /* renamed from: u, reason: collision with root package name */
    public List f8130u;

    /* renamed from: v, reason: collision with root package name */
    public List f8131v;

    /* renamed from: w, reason: collision with root package name */
    public int f8132w;

    /* renamed from: x, reason: collision with root package name */
    public T f8133x;

    /* renamed from: y, reason: collision with root package name */
    public int f8134y;

    /* renamed from: z, reason: collision with root package name */
    public List f8135z;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.k, a7.i] */
    public static C0448i h() {
        ?? abstractC0802k = new AbstractC0802k();
        abstractC0802k.f8119h = 6;
        List list = Collections.EMPTY_LIST;
        abstractC0802k.k = list;
        abstractC0802k.f8121l = list;
        abstractC0802k.f8122m = list;
        abstractC0802k.f8123n = list;
        abstractC0802k.f8124o = list;
        abstractC0802k.f8125p = list;
        abstractC0802k.f8126q = list;
        abstractC0802k.f8127r = list;
        abstractC0802k.f8128s = list;
        abstractC0802k.f8129t = list;
        abstractC0802k.f8130u = list;
        abstractC0802k.f8131v = list;
        abstractC0802k.f8133x = T.f7932w;
        abstractC0802k.f8135z = list;
        abstractC0802k.f8111A = list;
        abstractC0802k.f8112B = list;
        abstractC0802k.f8113C = list;
        abstractC0802k.f8114D = Z.j;
        abstractC0802k.f8115E = list;
        abstractC0802k.f8116F = g0.f8097h;
        abstractC0802k.f8117G = list;
        return abstractC0802k;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        C0450k g8 = g();
        if (g8.b()) {
            return g8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0448i h8 = h();
        h8.i(g());
        return h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        C0450k c0450k = null;
        try {
            try {
                C0450k.f8143P.getClass();
                i(new C0450k(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                C0450k c0450k2 = (C0450k) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    c0450k = c0450k2;
                    if (c0450k != null) {
                        i(c0450k);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0450k != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        i((C0450k) oVar);
        return this;
    }

    public final C0450k g() {
        C0450k c0450k = new C0450k(this);
        int i4 = this.f8118g;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        c0450k.f8159g = this.f8119h;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        c0450k.f8160h = this.f8120i;
        if ((i4 & 4) == 4) {
            i8 |= 4;
        }
        c0450k.f8161i = this.j;
        if ((i4 & 8) == 8) {
            this.k = Collections.unmodifiableList(this.k);
            this.f8118g &= -9;
        }
        c0450k.j = this.k;
        if ((this.f8118g & 16) == 16) {
            this.f8121l = Collections.unmodifiableList(this.f8121l);
            this.f8118g &= -17;
        }
        c0450k.k = this.f8121l;
        if ((this.f8118g & 32) == 32) {
            this.f8122m = Collections.unmodifiableList(this.f8122m);
            this.f8118g &= -33;
        }
        c0450k.f8162l = this.f8122m;
        if ((this.f8118g & 64) == 64) {
            this.f8123n = Collections.unmodifiableList(this.f8123n);
            this.f8118g &= -65;
        }
        c0450k.f8164n = this.f8123n;
        if ((this.f8118g & 128) == 128) {
            this.f8124o = Collections.unmodifiableList(this.f8124o);
            this.f8118g &= -129;
        }
        c0450k.f8166p = this.f8124o;
        if ((this.f8118g & 256) == 256) {
            this.f8125p = Collections.unmodifiableList(this.f8125p);
            this.f8118g &= -257;
        }
        c0450k.f8167q = this.f8125p;
        if ((this.f8118g & 512) == 512) {
            this.f8126q = Collections.unmodifiableList(this.f8126q);
            this.f8118g &= -513;
        }
        c0450k.f8169s = this.f8126q;
        if ((this.f8118g & 1024) == 1024) {
            this.f8127r = Collections.unmodifiableList(this.f8127r);
            this.f8118g &= -1025;
        }
        c0450k.f8170t = this.f8127r;
        if ((this.f8118g & 2048) == 2048) {
            this.f8128s = Collections.unmodifiableList(this.f8128s);
            this.f8118g &= -2049;
        }
        c0450k.f8171u = this.f8128s;
        if ((this.f8118g & 4096) == 4096) {
            this.f8129t = Collections.unmodifiableList(this.f8129t);
            this.f8118g &= -4097;
        }
        c0450k.f8172v = this.f8129t;
        if ((this.f8118g & 8192) == 8192) {
            this.f8130u = Collections.unmodifiableList(this.f8130u);
            this.f8118g &= -8193;
        }
        c0450k.f8173w = this.f8130u;
        if ((this.f8118g & 16384) == 16384) {
            this.f8131v = Collections.unmodifiableList(this.f8131v);
            this.f8118g &= -16385;
        }
        c0450k.f8174x = this.f8131v;
        if ((i4 & 32768) == 32768) {
            i8 |= 8;
        }
        c0450k.f8176z = this.f8132w;
        if ((i4 & 65536) == 65536) {
            i8 |= 16;
        }
        c0450k.f8144A = this.f8133x;
        if ((i4 & 131072) == 131072) {
            i8 |= 32;
        }
        c0450k.f8145B = this.f8134y;
        if ((this.f8118g & 262144) == 262144) {
            this.f8135z = Collections.unmodifiableList(this.f8135z);
            this.f8118g &= -262145;
        }
        c0450k.f8146C = this.f8135z;
        if ((this.f8118g & 524288) == 524288) {
            this.f8111A = Collections.unmodifiableList(this.f8111A);
            this.f8118g &= -524289;
        }
        c0450k.f8148E = this.f8111A;
        if ((this.f8118g & 1048576) == 1048576) {
            this.f8112B = Collections.unmodifiableList(this.f8112B);
            this.f8118g &= -1048577;
        }
        c0450k.f8149F = this.f8112B;
        if ((this.f8118g & 2097152) == 2097152) {
            this.f8113C = Collections.unmodifiableList(this.f8113C);
            this.f8118g &= -2097153;
        }
        c0450k.f8151H = this.f8113C;
        if ((i4 & 4194304) == 4194304) {
            i8 |= 64;
        }
        c0450k.f8152I = this.f8114D;
        if ((this.f8118g & 8388608) == 8388608) {
            this.f8115E = Collections.unmodifiableList(this.f8115E);
            this.f8118g &= -8388609;
        }
        c0450k.f8153J = this.f8115E;
        if ((i4 & 16777216) == 16777216) {
            i8 |= 128;
        }
        c0450k.K = this.f8116F;
        if ((this.f8118g & 33554432) == 33554432) {
            this.f8117G = Collections.unmodifiableList(this.f8117G);
            this.f8118g &= -33554433;
        }
        c0450k.f8154L = this.f8117G;
        c0450k.f8158f = i8;
        return c0450k;
    }

    public final void i(C0450k c0450k) {
        g0 g0Var;
        Z z8;
        T t8;
        if (c0450k == C0450k.f8142O) {
            return;
        }
        int i4 = c0450k.f8158f;
        if ((i4 & 1) == 1) {
            int i8 = c0450k.f8159g;
            this.f8118g = 1 | this.f8118g;
            this.f8119h = i8;
        }
        if ((i4 & 2) == 2) {
            int i9 = c0450k.f8160h;
            this.f8118g = 2 | this.f8118g;
            this.f8120i = i9;
        }
        if ((i4 & 4) == 4) {
            int i10 = c0450k.f8161i;
            this.f8118g = 4 | this.f8118g;
            this.j = i10;
        }
        if (!c0450k.j.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = c0450k.j;
                this.f8118g &= -9;
            } else {
                if ((this.f8118g & 8) != 8) {
                    this.k = new ArrayList(this.k);
                    this.f8118g |= 8;
                }
                this.k.addAll(c0450k.j);
            }
        }
        if (!c0450k.k.isEmpty()) {
            if (this.f8121l.isEmpty()) {
                this.f8121l = c0450k.k;
                this.f8118g &= -17;
            } else {
                if ((this.f8118g & 16) != 16) {
                    this.f8121l = new ArrayList(this.f8121l);
                    this.f8118g |= 16;
                }
                this.f8121l.addAll(c0450k.k);
            }
        }
        if (!c0450k.f8162l.isEmpty()) {
            if (this.f8122m.isEmpty()) {
                this.f8122m = c0450k.f8162l;
                this.f8118g &= -33;
            } else {
                if ((this.f8118g & 32) != 32) {
                    this.f8122m = new ArrayList(this.f8122m);
                    this.f8118g |= 32;
                }
                this.f8122m.addAll(c0450k.f8162l);
            }
        }
        if (!c0450k.f8164n.isEmpty()) {
            if (this.f8123n.isEmpty()) {
                this.f8123n = c0450k.f8164n;
                this.f8118g &= -65;
            } else {
                if ((this.f8118g & 64) != 64) {
                    this.f8123n = new ArrayList(this.f8123n);
                    this.f8118g |= 64;
                }
                this.f8123n.addAll(c0450k.f8164n);
            }
        }
        if (!c0450k.f8166p.isEmpty()) {
            if (this.f8124o.isEmpty()) {
                this.f8124o = c0450k.f8166p;
                this.f8118g &= -129;
            } else {
                if ((this.f8118g & 128) != 128) {
                    this.f8124o = new ArrayList(this.f8124o);
                    this.f8118g |= 128;
                }
                this.f8124o.addAll(c0450k.f8166p);
            }
        }
        if (!c0450k.f8167q.isEmpty()) {
            if (this.f8125p.isEmpty()) {
                this.f8125p = c0450k.f8167q;
                this.f8118g &= -257;
            } else {
                if ((this.f8118g & 256) != 256) {
                    this.f8125p = new ArrayList(this.f8125p);
                    this.f8118g |= 256;
                }
                this.f8125p.addAll(c0450k.f8167q);
            }
        }
        if (!c0450k.f8169s.isEmpty()) {
            if (this.f8126q.isEmpty()) {
                this.f8126q = c0450k.f8169s;
                this.f8118g &= -513;
            } else {
                if ((this.f8118g & 512) != 512) {
                    this.f8126q = new ArrayList(this.f8126q);
                    this.f8118g |= 512;
                }
                this.f8126q.addAll(c0450k.f8169s);
            }
        }
        if (!c0450k.f8170t.isEmpty()) {
            if (this.f8127r.isEmpty()) {
                this.f8127r = c0450k.f8170t;
                this.f8118g &= -1025;
            } else {
                if ((this.f8118g & 1024) != 1024) {
                    this.f8127r = new ArrayList(this.f8127r);
                    this.f8118g |= 1024;
                }
                this.f8127r.addAll(c0450k.f8170t);
            }
        }
        if (!c0450k.f8171u.isEmpty()) {
            if (this.f8128s.isEmpty()) {
                this.f8128s = c0450k.f8171u;
                this.f8118g &= -2049;
            } else {
                if ((this.f8118g & 2048) != 2048) {
                    this.f8128s = new ArrayList(this.f8128s);
                    this.f8118g |= 2048;
                }
                this.f8128s.addAll(c0450k.f8171u);
            }
        }
        if (!c0450k.f8172v.isEmpty()) {
            if (this.f8129t.isEmpty()) {
                this.f8129t = c0450k.f8172v;
                this.f8118g &= -4097;
            } else {
                if ((this.f8118g & 4096) != 4096) {
                    this.f8129t = new ArrayList(this.f8129t);
                    this.f8118g |= 4096;
                }
                this.f8129t.addAll(c0450k.f8172v);
            }
        }
        if (!c0450k.f8173w.isEmpty()) {
            if (this.f8130u.isEmpty()) {
                this.f8130u = c0450k.f8173w;
                this.f8118g &= -8193;
            } else {
                if ((this.f8118g & 8192) != 8192) {
                    this.f8130u = new ArrayList(this.f8130u);
                    this.f8118g |= 8192;
                }
                this.f8130u.addAll(c0450k.f8173w);
            }
        }
        if (!c0450k.f8174x.isEmpty()) {
            if (this.f8131v.isEmpty()) {
                this.f8131v = c0450k.f8174x;
                this.f8118g &= -16385;
            } else {
                if ((this.f8118g & 16384) != 16384) {
                    this.f8131v = new ArrayList(this.f8131v);
                    this.f8118g |= 16384;
                }
                this.f8131v.addAll(c0450k.f8174x);
            }
        }
        int i11 = c0450k.f8158f;
        if ((i11 & 8) == 8) {
            int i12 = c0450k.f8176z;
            this.f8118g |= 32768;
            this.f8132w = i12;
        }
        if ((i11 & 16) == 16) {
            T t9 = c0450k.f8144A;
            if ((this.f8118g & 65536) == 65536 && (t8 = this.f8133x) != T.f7932w) {
                S r8 = T.r(t8);
                r8.i(t9);
                this.f8133x = r8.g();
            } else {
                this.f8133x = t9;
            }
            this.f8118g |= 65536;
        }
        if ((c0450k.f8158f & 32) == 32) {
            int i13 = c0450k.f8145B;
            this.f8118g |= 131072;
            this.f8134y = i13;
        }
        if (!c0450k.f8146C.isEmpty()) {
            if (this.f8135z.isEmpty()) {
                this.f8135z = c0450k.f8146C;
                this.f8118g &= -262145;
            } else {
                if ((this.f8118g & 262144) != 262144) {
                    this.f8135z = new ArrayList(this.f8135z);
                    this.f8118g |= 262144;
                }
                this.f8135z.addAll(c0450k.f8146C);
            }
        }
        if (!c0450k.f8148E.isEmpty()) {
            if (this.f8111A.isEmpty()) {
                this.f8111A = c0450k.f8148E;
                this.f8118g &= -524289;
            } else {
                if ((this.f8118g & 524288) != 524288) {
                    this.f8111A = new ArrayList(this.f8111A);
                    this.f8118g |= 524288;
                }
                this.f8111A.addAll(c0450k.f8148E);
            }
        }
        if (!c0450k.f8149F.isEmpty()) {
            if (this.f8112B.isEmpty()) {
                this.f8112B = c0450k.f8149F;
                this.f8118g &= -1048577;
            } else {
                if ((this.f8118g & 1048576) != 1048576) {
                    this.f8112B = new ArrayList(this.f8112B);
                    this.f8118g |= 1048576;
                }
                this.f8112B.addAll(c0450k.f8149F);
            }
        }
        if (!c0450k.f8151H.isEmpty()) {
            if (this.f8113C.isEmpty()) {
                this.f8113C = c0450k.f8151H;
                this.f8118g &= -2097153;
            } else {
                if ((this.f8118g & 2097152) != 2097152) {
                    this.f8113C = new ArrayList(this.f8113C);
                    this.f8118g |= 2097152;
                }
                this.f8113C.addAll(c0450k.f8151H);
            }
        }
        if ((c0450k.f8158f & 64) == 64) {
            Z z9 = c0450k.f8152I;
            if ((this.f8118g & 4194304) == 4194304 && (z8 = this.f8114D) != Z.j) {
                C0446g i14 = Z.i(z8);
                i14.j(z9);
                this.f8114D = i14.g();
            } else {
                this.f8114D = z9;
            }
            this.f8118g |= 4194304;
        }
        if (!c0450k.f8153J.isEmpty()) {
            if (this.f8115E.isEmpty()) {
                this.f8115E = c0450k.f8153J;
                this.f8118g &= -8388609;
            } else {
                if ((this.f8118g & 8388608) != 8388608) {
                    this.f8115E = new ArrayList(this.f8115E);
                    this.f8118g |= 8388608;
                }
                this.f8115E.addAll(c0450k.f8153J);
            }
        }
        if ((c0450k.f8158f & 128) == 128) {
            g0 g0Var2 = c0450k.K;
            if ((this.f8118g & 16777216) == 16777216 && (g0Var = this.f8116F) != g0.f8097h) {
                C0454o c0454o = new C0454o(2);
                c0454o.f8198g = Collections.EMPTY_LIST;
                c0454o.m(g0Var);
                c0454o.m(g0Var2);
                this.f8116F = c0454o.i();
            } else {
                this.f8116F = g0Var2;
            }
            this.f8118g |= 16777216;
        }
        if (!c0450k.f8154L.isEmpty()) {
            if (this.f8117G.isEmpty()) {
                this.f8117G = c0450k.f8154L;
                this.f8118g &= -33554433;
            } else {
                if ((this.f8118g & 33554432) != 33554432) {
                    this.f8117G = new ArrayList(this.f8117G);
                    this.f8118g |= 33554432;
                }
                this.f8117G.addAll(c0450k.f8154L);
            }
        }
        f(c0450k);
        this.f11240d = this.f11240d.h(c0450k.f8157e);
    }
}
