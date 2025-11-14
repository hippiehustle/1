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

/* renamed from: a7.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0464z extends AbstractC0802k {

    /* renamed from: g, reason: collision with root package name */
    public int f8259g;

    /* renamed from: h, reason: collision with root package name */
    public int f8260h;

    /* renamed from: i, reason: collision with root package name */
    public int f8261i;
    public int j;
    public T k;

    /* renamed from: l, reason: collision with root package name */
    public int f8262l;

    /* renamed from: m, reason: collision with root package name */
    public List f8263m;

    /* renamed from: n, reason: collision with root package name */
    public T f8264n;

    /* renamed from: o, reason: collision with root package name */
    public int f8265o;

    /* renamed from: p, reason: collision with root package name */
    public List f8266p;

    /* renamed from: q, reason: collision with root package name */
    public List f8267q;

    /* renamed from: r, reason: collision with root package name */
    public List f8268r;

    /* renamed from: s, reason: collision with root package name */
    public List f8269s;

    /* renamed from: t, reason: collision with root package name */
    public Z f8270t;

    /* renamed from: u, reason: collision with root package name */
    public List f8271u;

    /* renamed from: v, reason: collision with root package name */
    public C0455p f8272v;

    /* renamed from: w, reason: collision with root package name */
    public List f8273w;

    /* renamed from: x, reason: collision with root package name */
    public List f8274x;

    /* renamed from: y, reason: collision with root package name */
    public List f8275y;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.k, a7.z] */
    public static C0464z h() {
        ?? abstractC0802k = new AbstractC0802k();
        abstractC0802k.f8260h = 6;
        abstractC0802k.f8261i = 6;
        T t8 = T.f7932w;
        abstractC0802k.k = t8;
        List list = Collections.EMPTY_LIST;
        abstractC0802k.f8263m = list;
        abstractC0802k.f8264n = t8;
        abstractC0802k.f8266p = list;
        abstractC0802k.f8267q = list;
        abstractC0802k.f8268r = list;
        abstractC0802k.f8269s = list;
        abstractC0802k.f8270t = Z.j;
        abstractC0802k.f8271u = list;
        abstractC0802k.f8272v = C0455p.f8199h;
        abstractC0802k.f8273w = list;
        abstractC0802k.f8274x = list;
        abstractC0802k.f8275y = list;
        return abstractC0802k;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        C0439A g8 = g();
        if (g8.b()) {
            return g8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0464z h8 = h();
        h8.i(g());
        return h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        C0439A c0439a = null;
        try {
            try {
                C0439A.f7776C.getClass();
                i(new C0439A(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                C0439A c0439a2 = (C0439A) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    c0439a = c0439a2;
                    if (c0439a != null) {
                        i(c0439a);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0439a != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        i((C0439A) oVar);
        return this;
    }

    public final C0439A g() {
        C0439A c0439a = new C0439A(this);
        int i4 = this.f8259g;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        c0439a.f7780g = this.f8260h;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        c0439a.f7781h = this.f8261i;
        if ((i4 & 4) == 4) {
            i8 |= 4;
        }
        c0439a.f7782i = this.j;
        if ((i4 & 8) == 8) {
            i8 |= 8;
        }
        c0439a.j = this.k;
        if ((i4 & 16) == 16) {
            i8 |= 16;
        }
        c0439a.k = this.f8262l;
        if ((i4 & 32) == 32) {
            this.f8263m = Collections.unmodifiableList(this.f8263m);
            this.f8259g &= -33;
        }
        c0439a.f7783l = this.f8263m;
        if ((i4 & 64) == 64) {
            i8 |= 32;
        }
        c0439a.f7784m = this.f8264n;
        if ((i4 & 128) == 128) {
            i8 |= 64;
        }
        c0439a.f7785n = this.f8265o;
        if ((this.f8259g & 256) == 256) {
            this.f8266p = Collections.unmodifiableList(this.f8266p);
            this.f8259g &= -257;
        }
        c0439a.f7786o = this.f8266p;
        if ((this.f8259g & 512) == 512) {
            this.f8267q = Collections.unmodifiableList(this.f8267q);
            this.f8259g &= -513;
        }
        c0439a.f7787p = this.f8267q;
        if ((this.f8259g & 1024) == 1024) {
            this.f8268r = Collections.unmodifiableList(this.f8268r);
            this.f8259g &= -1025;
        }
        c0439a.f7789r = this.f8268r;
        if ((this.f8259g & 2048) == 2048) {
            this.f8269s = Collections.unmodifiableList(this.f8269s);
            this.f8259g &= -2049;
        }
        c0439a.f7790s = this.f8269s;
        if ((i4 & 4096) == 4096) {
            i8 |= 128;
        }
        c0439a.f7791t = this.f8270t;
        if ((this.f8259g & 8192) == 8192) {
            this.f8271u = Collections.unmodifiableList(this.f8271u);
            this.f8259g &= -8193;
        }
        c0439a.f7792u = this.f8271u;
        if ((i4 & 16384) == 16384) {
            i8 |= 256;
        }
        c0439a.f7793v = this.f8272v;
        if ((this.f8259g & 32768) == 32768) {
            this.f8273w = Collections.unmodifiableList(this.f8273w);
            this.f8259g &= -32769;
        }
        c0439a.f7794w = this.f8273w;
        if ((this.f8259g & 65536) == 65536) {
            this.f8274x = Collections.unmodifiableList(this.f8274x);
            this.f8259g &= -65537;
        }
        c0439a.f7795x = this.f8274x;
        if ((this.f8259g & 131072) == 131072) {
            this.f8275y = Collections.unmodifiableList(this.f8275y);
            this.f8259g &= -131073;
        }
        c0439a.f7796y = this.f8275y;
        c0439a.f7779f = i8;
        return c0439a;
    }

    public final void i(C0439A c0439a) {
        C0455p c0455p;
        Z z8;
        T t8;
        T t9;
        if (c0439a == C0439A.f7775B) {
            return;
        }
        int i4 = c0439a.f7779f;
        if ((i4 & 1) == 1) {
            int i8 = c0439a.f7780g;
            this.f8259g = 1 | this.f8259g;
            this.f8260h = i8;
        }
        if ((i4 & 2) == 2) {
            int i9 = c0439a.f7781h;
            this.f8259g = 2 | this.f8259g;
            this.f8261i = i9;
        }
        if ((i4 & 4) == 4) {
            int i10 = c0439a.f7782i;
            this.f8259g = 4 | this.f8259g;
            this.j = i10;
        }
        if ((i4 & 8) == 8) {
            T t10 = c0439a.j;
            if ((this.f8259g & 8) == 8 && (t9 = this.k) != T.f7932w) {
                S r8 = T.r(t9);
                r8.i(t10);
                this.k = r8.g();
            } else {
                this.k = t10;
            }
            this.f8259g |= 8;
        }
        if ((c0439a.f7779f & 16) == 16) {
            int i11 = c0439a.k;
            this.f8259g = 16 | this.f8259g;
            this.f8262l = i11;
        }
        if (!c0439a.f7783l.isEmpty()) {
            if (this.f8263m.isEmpty()) {
                this.f8263m = c0439a.f7783l;
                this.f8259g &= -33;
            } else {
                if ((this.f8259g & 32) != 32) {
                    this.f8263m = new ArrayList(this.f8263m);
                    this.f8259g |= 32;
                }
                this.f8263m.addAll(c0439a.f7783l);
            }
        }
        if ((c0439a.f7779f & 32) == 32) {
            T t11 = c0439a.f7784m;
            if ((this.f8259g & 64) == 64 && (t8 = this.f8264n) != T.f7932w) {
                S r9 = T.r(t8);
                r9.i(t11);
                this.f8264n = r9.g();
            } else {
                this.f8264n = t11;
            }
            this.f8259g |= 64;
        }
        if ((c0439a.f7779f & 64) == 64) {
            int i12 = c0439a.f7785n;
            this.f8259g |= 128;
            this.f8265o = i12;
        }
        if (!c0439a.f7786o.isEmpty()) {
            if (this.f8266p.isEmpty()) {
                this.f8266p = c0439a.f7786o;
                this.f8259g &= -257;
            } else {
                if ((this.f8259g & 256) != 256) {
                    this.f8266p = new ArrayList(this.f8266p);
                    this.f8259g |= 256;
                }
                this.f8266p.addAll(c0439a.f7786o);
            }
        }
        if (!c0439a.f7787p.isEmpty()) {
            if (this.f8267q.isEmpty()) {
                this.f8267q = c0439a.f7787p;
                this.f8259g &= -513;
            } else {
                if ((this.f8259g & 512) != 512) {
                    this.f8267q = new ArrayList(this.f8267q);
                    this.f8259g |= 512;
                }
                this.f8267q.addAll(c0439a.f7787p);
            }
        }
        if (!c0439a.f7789r.isEmpty()) {
            if (this.f8268r.isEmpty()) {
                this.f8268r = c0439a.f7789r;
                this.f8259g &= -1025;
            } else {
                if ((this.f8259g & 1024) != 1024) {
                    this.f8268r = new ArrayList(this.f8268r);
                    this.f8259g |= 1024;
                }
                this.f8268r.addAll(c0439a.f7789r);
            }
        }
        if (!c0439a.f7790s.isEmpty()) {
            if (this.f8269s.isEmpty()) {
                this.f8269s = c0439a.f7790s;
                this.f8259g &= -2049;
            } else {
                if ((this.f8259g & 2048) != 2048) {
                    this.f8269s = new ArrayList(this.f8269s);
                    this.f8259g |= 2048;
                }
                this.f8269s.addAll(c0439a.f7790s);
            }
        }
        if ((c0439a.f7779f & 128) == 128) {
            Z z9 = c0439a.f7791t;
            if ((this.f8259g & 4096) == 4096 && (z8 = this.f8270t) != Z.j) {
                C0446g i13 = Z.i(z8);
                i13.j(z9);
                this.f8270t = i13.g();
            } else {
                this.f8270t = z9;
            }
            this.f8259g |= 4096;
        }
        if (!c0439a.f7792u.isEmpty()) {
            if (this.f8271u.isEmpty()) {
                this.f8271u = c0439a.f7792u;
                this.f8259g &= -8193;
            } else {
                if ((this.f8259g & 8192) != 8192) {
                    this.f8271u = new ArrayList(this.f8271u);
                    this.f8259g |= 8192;
                }
                this.f8271u.addAll(c0439a.f7792u);
            }
        }
        if ((c0439a.f7779f & 256) == 256) {
            C0455p c0455p2 = c0439a.f7793v;
            if ((this.f8259g & 16384) == 16384 && (c0455p = this.f8272v) != C0455p.f8199h) {
                C0454o c0454o = new C0454o(0);
                c0454o.f8198g = Collections.EMPTY_LIST;
                c0454o.j(c0455p);
                c0454o.j(c0455p2);
                this.f8272v = c0454o.f();
            } else {
                this.f8272v = c0455p2;
            }
            this.f8259g |= 16384;
        }
        if (!c0439a.f7794w.isEmpty()) {
            if (this.f8273w.isEmpty()) {
                this.f8273w = c0439a.f7794w;
                this.f8259g &= -32769;
            } else {
                if ((this.f8259g & 32768) != 32768) {
                    this.f8273w = new ArrayList(this.f8273w);
                    this.f8259g |= 32768;
                }
                this.f8273w.addAll(c0439a.f7794w);
            }
        }
        if (!c0439a.f7795x.isEmpty()) {
            if (this.f8274x.isEmpty()) {
                this.f8274x = c0439a.f7795x;
                this.f8259g &= -65537;
            } else {
                if ((this.f8259g & 65536) != 65536) {
                    this.f8274x = new ArrayList(this.f8274x);
                    this.f8259g |= 65536;
                }
                this.f8274x.addAll(c0439a.f7795x);
            }
        }
        if (!c0439a.f7796y.isEmpty()) {
            if (this.f8275y.isEmpty()) {
                this.f8275y = c0439a.f7796y;
                this.f8259g &= -131073;
            } else {
                if ((this.f8259g & 131072) != 131072) {
                    this.f8275y = new ArrayList(this.f8275y);
                    this.f8259g |= 131072;
                }
                this.f8275y.addAll(c0439a.f7796y);
            }
        }
        f(c0439a);
        this.f11240d = this.f11240d.h(c0439a.f7778e);
    }
}
