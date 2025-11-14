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

/* loaded from: classes.dex */
public final class H extends AbstractC0802k {

    /* renamed from: A, reason: collision with root package name */
    public List f7826A;

    /* renamed from: B, reason: collision with root package name */
    public List f7827B;

    /* renamed from: C, reason: collision with root package name */
    public List f7828C;

    /* renamed from: g, reason: collision with root package name */
    public int f7829g;

    /* renamed from: h, reason: collision with root package name */
    public int f7830h;

    /* renamed from: i, reason: collision with root package name */
    public int f7831i;
    public int j;
    public T k;

    /* renamed from: l, reason: collision with root package name */
    public int f7832l;

    /* renamed from: m, reason: collision with root package name */
    public List f7833m;

    /* renamed from: n, reason: collision with root package name */
    public T f7834n;

    /* renamed from: o, reason: collision with root package name */
    public int f7835o;

    /* renamed from: p, reason: collision with root package name */
    public List f7836p;

    /* renamed from: q, reason: collision with root package name */
    public List f7837q;

    /* renamed from: r, reason: collision with root package name */
    public List f7838r;

    /* renamed from: s, reason: collision with root package name */
    public b0 f7839s;

    /* renamed from: t, reason: collision with root package name */
    public int f7840t;

    /* renamed from: u, reason: collision with root package name */
    public int f7841u;

    /* renamed from: v, reason: collision with root package name */
    public List f7842v;

    /* renamed from: w, reason: collision with root package name */
    public List f7843w;

    /* renamed from: x, reason: collision with root package name */
    public List f7844x;

    /* renamed from: y, reason: collision with root package name */
    public List f7845y;

    /* renamed from: z, reason: collision with root package name */
    public List f7846z;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.k, a7.H] */
    public static H h() {
        ?? abstractC0802k = new AbstractC0802k();
        abstractC0802k.f7830h = 518;
        abstractC0802k.f7831i = 2054;
        T t8 = T.f7932w;
        abstractC0802k.k = t8;
        List list = Collections.EMPTY_LIST;
        abstractC0802k.f7833m = list;
        abstractC0802k.f7834n = t8;
        abstractC0802k.f7836p = list;
        abstractC0802k.f7837q = list;
        abstractC0802k.f7838r = list;
        abstractC0802k.f7839s = b0.f8012q;
        abstractC0802k.f7842v = list;
        abstractC0802k.f7843w = list;
        abstractC0802k.f7844x = list;
        abstractC0802k.f7845y = list;
        abstractC0802k.f7846z = list;
        abstractC0802k.f7826A = list;
        abstractC0802k.f7827B = list;
        abstractC0802k.f7828C = list;
        return abstractC0802k;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        I g8 = g();
        if (g8.b()) {
            return g8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        H h8 = h();
        h8.i(g());
        return h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        I i4 = null;
        try {
            try {
                I.f7848G.getClass();
                i(new I(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                I i8 = (I) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    i4 = i8;
                    if (i4 != null) {
                        i(i4);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (i4 != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        i((I) oVar);
        return this;
    }

    public final I g() {
        I i4 = new I(this);
        int i8 = this.f7829g;
        int i9 = 1;
        if ((i8 & 1) != 1) {
            i9 = 0;
        }
        i4.f7856g = this.f7830h;
        if ((i8 & 2) == 2) {
            i9 |= 2;
        }
        i4.f7857h = this.f7831i;
        if ((i8 & 4) == 4) {
            i9 |= 4;
        }
        i4.f7858i = this.j;
        if ((i8 & 8) == 8) {
            i9 |= 8;
        }
        i4.j = this.k;
        if ((i8 & 16) == 16) {
            i9 |= 16;
        }
        i4.k = this.f7832l;
        if ((i8 & 32) == 32) {
            this.f7833m = Collections.unmodifiableList(this.f7833m);
            this.f7829g &= -33;
        }
        i4.f7859l = this.f7833m;
        if ((i8 & 64) == 64) {
            i9 |= 32;
        }
        i4.f7860m = this.f7834n;
        if ((i8 & 128) == 128) {
            i9 |= 64;
        }
        i4.f7861n = this.f7835o;
        if ((this.f7829g & 256) == 256) {
            this.f7836p = Collections.unmodifiableList(this.f7836p);
            this.f7829g &= -257;
        }
        i4.f7862o = this.f7836p;
        if ((this.f7829g & 512) == 512) {
            this.f7837q = Collections.unmodifiableList(this.f7837q);
            this.f7829g &= -513;
        }
        i4.f7863p = this.f7837q;
        if ((this.f7829g & 1024) == 1024) {
            this.f7838r = Collections.unmodifiableList(this.f7838r);
            this.f7829g &= -1025;
        }
        i4.f7865r = this.f7838r;
        if ((i8 & 2048) == 2048) {
            i9 |= 128;
        }
        i4.f7866s = this.f7839s;
        if ((i8 & 4096) == 4096) {
            i9 |= 256;
        }
        i4.f7867t = this.f7840t;
        if ((i8 & 8192) == 8192) {
            i9 |= 512;
        }
        i4.f7868u = this.f7841u;
        if ((this.f7829g & 16384) == 16384) {
            this.f7842v = Collections.unmodifiableList(this.f7842v);
            this.f7829g &= -16385;
        }
        i4.f7869v = this.f7842v;
        if ((this.f7829g & 32768) == 32768) {
            this.f7843w = Collections.unmodifiableList(this.f7843w);
            this.f7829g &= -32769;
        }
        i4.f7870w = this.f7843w;
        if ((this.f7829g & 65536) == 65536) {
            this.f7844x = Collections.unmodifiableList(this.f7844x);
            this.f7829g &= -65537;
        }
        i4.f7871x = this.f7844x;
        if ((this.f7829g & 131072) == 131072) {
            this.f7845y = Collections.unmodifiableList(this.f7845y);
            this.f7829g &= -131073;
        }
        i4.f7872y = this.f7845y;
        if ((this.f7829g & 262144) == 262144) {
            this.f7846z = Collections.unmodifiableList(this.f7846z);
            this.f7829g &= -262145;
        }
        i4.f7873z = this.f7846z;
        if ((this.f7829g & 524288) == 524288) {
            this.f7826A = Collections.unmodifiableList(this.f7826A);
            this.f7829g &= -524289;
        }
        i4.f7849A = this.f7826A;
        if ((this.f7829g & 1048576) == 1048576) {
            this.f7827B = Collections.unmodifiableList(this.f7827B);
            this.f7829g &= -1048577;
        }
        i4.f7850B = this.f7827B;
        if ((this.f7829g & 2097152) == 2097152) {
            this.f7828C = Collections.unmodifiableList(this.f7828C);
            this.f7829g &= -2097153;
        }
        i4.f7851C = this.f7828C;
        i4.f7855f = i9;
        return i4;
    }

    public final void i(I i4) {
        b0 b0Var;
        T t8;
        T t9;
        if (i4 == I.f7847F) {
            return;
        }
        int i8 = i4.f7855f;
        if ((i8 & 1) == 1) {
            int i9 = i4.f7856g;
            this.f7829g = 1 | this.f7829g;
            this.f7830h = i9;
        }
        if ((i8 & 2) == 2) {
            int i10 = i4.f7857h;
            this.f7829g = 2 | this.f7829g;
            this.f7831i = i10;
        }
        if ((i8 & 4) == 4) {
            int i11 = i4.f7858i;
            this.f7829g = 4 | this.f7829g;
            this.j = i11;
        }
        if ((i8 & 8) == 8) {
            T t10 = i4.j;
            if ((this.f7829g & 8) == 8 && (t9 = this.k) != T.f7932w) {
                S r8 = T.r(t9);
                r8.i(t10);
                this.k = r8.g();
            } else {
                this.k = t10;
            }
            this.f7829g |= 8;
        }
        if ((i4.f7855f & 16) == 16) {
            int i12 = i4.k;
            this.f7829g = 16 | this.f7829g;
            this.f7832l = i12;
        }
        if (!i4.f7859l.isEmpty()) {
            if (this.f7833m.isEmpty()) {
                this.f7833m = i4.f7859l;
                this.f7829g &= -33;
            } else {
                if ((this.f7829g & 32) != 32) {
                    this.f7833m = new ArrayList(this.f7833m);
                    this.f7829g |= 32;
                }
                this.f7833m.addAll(i4.f7859l);
            }
        }
        if ((i4.f7855f & 32) == 32) {
            T t11 = i4.f7860m;
            if ((this.f7829g & 64) == 64 && (t8 = this.f7834n) != T.f7932w) {
                S r9 = T.r(t8);
                r9.i(t11);
                this.f7834n = r9.g();
            } else {
                this.f7834n = t11;
            }
            this.f7829g |= 64;
        }
        if ((i4.f7855f & 64) == 64) {
            int i13 = i4.f7861n;
            this.f7829g |= 128;
            this.f7835o = i13;
        }
        if (!i4.f7862o.isEmpty()) {
            if (this.f7836p.isEmpty()) {
                this.f7836p = i4.f7862o;
                this.f7829g &= -257;
            } else {
                if ((this.f7829g & 256) != 256) {
                    this.f7836p = new ArrayList(this.f7836p);
                    this.f7829g |= 256;
                }
                this.f7836p.addAll(i4.f7862o);
            }
        }
        if (!i4.f7863p.isEmpty()) {
            if (this.f7837q.isEmpty()) {
                this.f7837q = i4.f7863p;
                this.f7829g &= -513;
            } else {
                if ((this.f7829g & 512) != 512) {
                    this.f7837q = new ArrayList(this.f7837q);
                    this.f7829g |= 512;
                }
                this.f7837q.addAll(i4.f7863p);
            }
        }
        if (!i4.f7865r.isEmpty()) {
            if (this.f7838r.isEmpty()) {
                this.f7838r = i4.f7865r;
                this.f7829g &= -1025;
            } else {
                if ((this.f7829g & 1024) != 1024) {
                    this.f7838r = new ArrayList(this.f7838r);
                    this.f7829g |= 1024;
                }
                this.f7838r.addAll(i4.f7865r);
            }
        }
        if ((i4.f7855f & 128) == 128) {
            b0 b0Var2 = i4.f7866s;
            if ((this.f7829g & 2048) == 2048 && (b0Var = this.f7839s) != b0.f8012q) {
                a0 h8 = a0.h();
                h8.i(b0Var);
                h8.i(b0Var2);
                this.f7839s = h8.g();
            } else {
                this.f7839s = b0Var2;
            }
            this.f7829g |= 2048;
        }
        int i14 = i4.f7855f;
        if ((i14 & 256) == 256) {
            int i15 = i4.f7867t;
            this.f7829g |= 4096;
            this.f7840t = i15;
        }
        if ((i14 & 512) == 512) {
            int i16 = i4.f7868u;
            this.f7829g |= 8192;
            this.f7841u = i16;
        }
        if (!i4.f7869v.isEmpty()) {
            if (this.f7842v.isEmpty()) {
                this.f7842v = i4.f7869v;
                this.f7829g &= -16385;
            } else {
                if ((this.f7829g & 16384) != 16384) {
                    this.f7842v = new ArrayList(this.f7842v);
                    this.f7829g |= 16384;
                }
                this.f7842v.addAll(i4.f7869v);
            }
        }
        if (!i4.f7870w.isEmpty()) {
            if (this.f7843w.isEmpty()) {
                this.f7843w = i4.f7870w;
                this.f7829g &= -32769;
            } else {
                if ((this.f7829g & 32768) != 32768) {
                    this.f7843w = new ArrayList(this.f7843w);
                    this.f7829g |= 32768;
                }
                this.f7843w.addAll(i4.f7870w);
            }
        }
        if (!i4.f7871x.isEmpty()) {
            if (this.f7844x.isEmpty()) {
                this.f7844x = i4.f7871x;
                this.f7829g &= -65537;
            } else {
                if ((this.f7829g & 65536) != 65536) {
                    this.f7844x = new ArrayList(this.f7844x);
                    this.f7829g |= 65536;
                }
                this.f7844x.addAll(i4.f7871x);
            }
        }
        if (!i4.f7872y.isEmpty()) {
            if (this.f7845y.isEmpty()) {
                this.f7845y = i4.f7872y;
                this.f7829g &= -131073;
            } else {
                if ((this.f7829g & 131072) != 131072) {
                    this.f7845y = new ArrayList(this.f7845y);
                    this.f7829g |= 131072;
                }
                this.f7845y.addAll(i4.f7872y);
            }
        }
        if (!i4.f7873z.isEmpty()) {
            if (this.f7846z.isEmpty()) {
                this.f7846z = i4.f7873z;
                this.f7829g &= -262145;
            } else {
                if ((this.f7829g & 262144) != 262144) {
                    this.f7846z = new ArrayList(this.f7846z);
                    this.f7829g |= 262144;
                }
                this.f7846z.addAll(i4.f7873z);
            }
        }
        if (!i4.f7849A.isEmpty()) {
            if (this.f7826A.isEmpty()) {
                this.f7826A = i4.f7849A;
                this.f7829g &= -524289;
            } else {
                if ((this.f7829g & 524288) != 524288) {
                    this.f7826A = new ArrayList(this.f7826A);
                    this.f7829g |= 524288;
                }
                this.f7826A.addAll(i4.f7849A);
            }
        }
        if (!i4.f7850B.isEmpty()) {
            if (this.f7827B.isEmpty()) {
                this.f7827B = i4.f7850B;
                this.f7829g &= -1048577;
            } else {
                if ((this.f7829g & 1048576) != 1048576) {
                    this.f7827B = new ArrayList(this.f7827B);
                    this.f7829g |= 1048576;
                }
                this.f7827B.addAll(i4.f7850B);
            }
        }
        if (!i4.f7851C.isEmpty()) {
            if (this.f7828C.isEmpty()) {
                this.f7828C = i4.f7851C;
                this.f7829g &= -2097153;
            } else {
                if ((this.f7829g & 2097152) != 2097152) {
                    this.f7828C = new ArrayList(this.f7828C);
                    this.f7829g |= 2097152;
                }
                this.f7828C.addAll(i4.f7851C);
            }
        }
        f(i4);
        this.f11240d = this.f11240d.h(i4.f7854e);
    }
}
