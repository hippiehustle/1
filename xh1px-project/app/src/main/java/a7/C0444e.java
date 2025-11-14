package a7;

import g7.AbstractC0793b;
import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import g7.C0799h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: a7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444e extends g7.o {

    /* renamed from: s, reason: collision with root package name */
    public static final C0444e f8057s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0440a f8058t = new C0440a(2);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f8059d;

    /* renamed from: e, reason: collision with root package name */
    public int f8060e;

    /* renamed from: f, reason: collision with root package name */
    public EnumC0443d f8061f;

    /* renamed from: g, reason: collision with root package name */
    public long f8062g;

    /* renamed from: h, reason: collision with root package name */
    public float f8063h;

    /* renamed from: i, reason: collision with root package name */
    public double f8064i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f8065l;

    /* renamed from: m, reason: collision with root package name */
    public C0447h f8066m;

    /* renamed from: n, reason: collision with root package name */
    public List f8067n;

    /* renamed from: o, reason: collision with root package name */
    public int f8068o;

    /* renamed from: p, reason: collision with root package name */
    public int f8069p;

    /* renamed from: q, reason: collision with root package name */
    public byte f8070q;

    /* renamed from: r, reason: collision with root package name */
    public int f8071r;

    static {
        C0444e c0444e = new C0444e();
        f8057s = c0444e;
        c0444e.i();
    }

    public C0444e() {
        this.f8070q = (byte) -1;
        this.f8071r = -1;
        this.f8059d = AbstractC0796e.f11223d;
    }

    public static C0442c j(C0444e c0444e) {
        C0442c g8 = C0442c.g();
        g8.h(c0444e);
        return g8;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f8070q;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f8060e & 128) == 128 && !this.f8066m.b()) {
            this.f8070q = (byte) 0;
            return false;
        }
        for (int i4 = 0; i4 < this.f8067n.size(); i4++) {
            if (!((C0444e) this.f8067n.get(i4)).b()) {
                this.f8070q = (byte) 0;
                return false;
            }
        }
        this.f8070q = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f8071r;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f8060e & 1) == 1) {
            i4 = L5.m.a(1, this.f8061f.f8051d);
        } else {
            i4 = 0;
        }
        if ((this.f8060e & 2) == 2) {
            long j = this.f8062g;
            i4 += L5.m.g((j >> 63) ^ (j << 1)) + L5.m.h(2);
        }
        if ((this.f8060e & 4) == 4) {
            i4 += L5.m.h(3) + 4;
        }
        if ((this.f8060e & 8) == 8) {
            i4 += L5.m.h(4) + 8;
        }
        if ((this.f8060e & 16) == 16) {
            i4 += L5.m.b(5, this.j);
        }
        if ((this.f8060e & 32) == 32) {
            i4 += L5.m.b(6, this.k);
        }
        if ((this.f8060e & 64) == 64) {
            i4 += L5.m.b(7, this.f8065l);
        }
        if ((this.f8060e & 128) == 128) {
            i4 += L5.m.d(8, this.f8066m);
        }
        for (int i9 = 0; i9 < this.f8067n.size(); i9++) {
            i4 += L5.m.d(9, (AbstractC0793b) this.f8067n.get(i9));
        }
        if ((this.f8060e & 512) == 512) {
            i4 += L5.m.b(10, this.f8069p);
        }
        if ((this.f8060e & 256) == 256) {
            i4 += L5.m.b(11, this.f8068o);
        }
        int size = this.f8059d.size() + i4;
        this.f8071r = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return C0442c.g();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        return j(this);
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        if ((this.f8060e & 1) == 1) {
            mVar.l(1, this.f8061f.f8051d);
        }
        if ((this.f8060e & 2) == 2) {
            long j = this.f8062g;
            mVar.x(2, 0);
            mVar.w((j >> 63) ^ (j << 1));
        }
        if ((this.f8060e & 4) == 4) {
            float f8 = this.f8063h;
            mVar.x(3, 5);
            mVar.t(Float.floatToRawIntBits(f8));
        }
        if ((this.f8060e & 8) == 8) {
            double d2 = this.f8064i;
            mVar.x(4, 1);
            mVar.u(Double.doubleToRawLongBits(d2));
        }
        if ((this.f8060e & 16) == 16) {
            mVar.m(5, this.j);
        }
        if ((this.f8060e & 32) == 32) {
            mVar.m(6, this.k);
        }
        if ((this.f8060e & 64) == 64) {
            mVar.m(7, this.f8065l);
        }
        if ((this.f8060e & 128) == 128) {
            mVar.o(8, this.f8066m);
        }
        for (int i4 = 0; i4 < this.f8067n.size(); i4++) {
            mVar.o(9, (AbstractC0793b) this.f8067n.get(i4));
        }
        if ((this.f8060e & 512) == 512) {
            mVar.m(10, this.f8069p);
        }
        if ((this.f8060e & 256) == 256) {
            mVar.m(11, this.f8068o);
        }
        mVar.r(this.f8059d);
    }

    public final void i() {
        this.f8061f = EnumC0443d.BYTE;
        this.f8062g = 0L;
        this.f8063h = 0.0f;
        this.f8064i = 0.0d;
        this.j = 0;
        this.k = 0;
        this.f8065l = 0;
        this.f8066m = C0447h.j;
        this.f8067n = Collections.EMPTY_LIST;
        this.f8068o = 0;
        this.f8069p = 0;
    }

    public C0444e(C0442c c0442c) {
        this.f8070q = (byte) -1;
        this.f8071r = -1;
        this.f8059d = c0442c.f11240d;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C0444e(C0797f c0797f, C0799h c0799h) {
        C0446g c0446g;
        this.f8070q = (byte) -1;
        this.f8071r = -1;
        i();
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        boolean z8 = false;
        char c6 = 0;
        while (true) {
            ?? r52 = 256;
            if (!z8) {
                try {
                    try {
                        int n3 = c0797f.n();
                        switch (n3) {
                            case 0:
                                z8 = true;
                            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                                int k = c0797f.k();
                                EnumC0443d b4 = EnumC0443d.b(k);
                                if (b4 == null) {
                                    j.v(n3);
                                    j.v(k);
                                } else {
                                    this.f8060e |= 1;
                                    this.f8061f = b4;
                                }
                            case 16:
                                this.f8060e |= 2;
                                long l6 = c0797f.l();
                                this.f8062g = (-(l6 & 1)) ^ (l6 >>> 1);
                            case 29:
                                this.f8060e |= 4;
                                this.f8063h = Float.intBitsToFloat(c0797f.i());
                            case 33:
                                this.f8060e |= 8;
                                this.f8064i = Double.longBitsToDouble(c0797f.j());
                            case 40:
                                this.f8060e |= 16;
                                this.j = c0797f.k();
                            case 48:
                                this.f8060e |= 32;
                                this.k = c0797f.k();
                            case 56:
                                this.f8060e |= 64;
                                this.f8065l = c0797f.k();
                            case 66:
                                if ((this.f8060e & 128) == 128) {
                                    C0447h c0447h = this.f8066m;
                                    c0447h.getClass();
                                    c0446g = new C0446g(0);
                                    c0446g.f8095g = Collections.EMPTY_LIST;
                                    c0446g.i(c0447h);
                                } else {
                                    c0446g = null;
                                }
                                C0447h c0447h2 = (C0447h) c0797f.g(C0447h.k, c0799h);
                                this.f8066m = c0447h2;
                                if (c0446g != null) {
                                    c0446g.i(c0447h2);
                                    this.f8066m = c0446g.f();
                                }
                                this.f8060e |= 128;
                            case 74:
                                if ((c6 & 256) != 256) {
                                    this.f8067n = new ArrayList();
                                    c6 = 256;
                                }
                                this.f8067n.add(c0797f.g(f8058t, c0799h));
                            case 80:
                                this.f8060e |= 512;
                                this.f8069p = c0797f.k();
                            case 88:
                                this.f8060e |= 256;
                                this.f8068o = c0797f.k();
                            default:
                                r52 = c0797f.q(n3, j);
                                if (r52 == 0) {
                                    z8 = true;
                                }
                        }
                    } catch (Throwable th) {
                        if ((c6 & 256) == r52) {
                            this.f8067n = Collections.unmodifiableList(this.f8067n);
                        }
                        try {
                            j.i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f8059d = c0795d.e();
                            throw th2;
                        }
                        this.f8059d = c0795d.e();
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
            } else {
                if ((c6 & 256) == 256) {
                    this.f8067n = Collections.unmodifiableList(this.f8067n);
                }
                try {
                    j.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f8059d = c0795d.e();
                    throw th3;
                }
                this.f8059d = c0795d.e();
                return;
            }
        }
    }
}
