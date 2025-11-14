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
public final class S extends AbstractC0802k {

    /* renamed from: g, reason: collision with root package name */
    public int f7919g;

    /* renamed from: h, reason: collision with root package name */
    public List f7920h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7921i;
    public int j;
    public T k;

    /* renamed from: l, reason: collision with root package name */
    public int f7922l;

    /* renamed from: m, reason: collision with root package name */
    public int f7923m;

    /* renamed from: n, reason: collision with root package name */
    public int f7924n;

    /* renamed from: o, reason: collision with root package name */
    public int f7925o;

    /* renamed from: p, reason: collision with root package name */
    public int f7926p;

    /* renamed from: q, reason: collision with root package name */
    public T f7927q;

    /* renamed from: r, reason: collision with root package name */
    public int f7928r;

    /* renamed from: s, reason: collision with root package name */
    public T f7929s;

    /* renamed from: t, reason: collision with root package name */
    public int f7930t;

    /* renamed from: u, reason: collision with root package name */
    public int f7931u;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.k, a7.S] */
    public static S h() {
        ?? abstractC0802k = new AbstractC0802k();
        abstractC0802k.f7920h = Collections.EMPTY_LIST;
        T t8 = T.f7932w;
        abstractC0802k.k = t8;
        abstractC0802k.f7927q = t8;
        abstractC0802k.f7929s = t8;
        return abstractC0802k;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        T g8 = g();
        if (g8.b()) {
            return g8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        S h8 = h();
        h8.i(g());
        return h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        T t8 = null;
        try {
            try {
                T.f7933x.getClass();
                i(new T(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                T t9 = (T) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    t8 = t9;
                    if (t8 != null) {
                        i(t8);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (t8 != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        i((T) oVar);
        return this;
    }

    public final T g() {
        T t8 = new T(this);
        int i4 = this.f7919g;
        int i8 = 1;
        if ((i4 & 1) == 1) {
            this.f7920h = Collections.unmodifiableList(this.f7920h);
            this.f7919g &= -2;
        }
        t8.f7936g = this.f7920h;
        if ((i4 & 2) != 2) {
            i8 = 0;
        }
        t8.f7937h = this.f7921i;
        if ((i4 & 4) == 4) {
            i8 |= 2;
        }
        t8.f7938i = this.j;
        if ((i4 & 8) == 8) {
            i8 |= 4;
        }
        t8.j = this.k;
        if ((i4 & 16) == 16) {
            i8 |= 8;
        }
        t8.k = this.f7922l;
        if ((i4 & 32) == 32) {
            i8 |= 16;
        }
        t8.f7939l = this.f7923m;
        if ((i4 & 64) == 64) {
            i8 |= 32;
        }
        t8.f7940m = this.f7924n;
        if ((i4 & 128) == 128) {
            i8 |= 64;
        }
        t8.f7941n = this.f7925o;
        if ((i4 & 256) == 256) {
            i8 |= 128;
        }
        t8.f7942o = this.f7926p;
        if ((i4 & 512) == 512) {
            i8 |= 256;
        }
        t8.f7943p = this.f7927q;
        if ((i4 & 1024) == 1024) {
            i8 |= 512;
        }
        t8.f7944q = this.f7928r;
        if ((i4 & 2048) == 2048) {
            i8 |= 1024;
        }
        t8.f7945r = this.f7929s;
        if ((i4 & 4096) == 4096) {
            i8 |= 2048;
        }
        t8.f7946s = this.f7930t;
        if ((i4 & 8192) == 8192) {
            i8 |= 4096;
        }
        t8.f7947t = this.f7931u;
        t8.f7935f = i8;
        return t8;
    }

    public final S i(T t8) {
        T t9;
        T t10;
        T t11;
        T t12 = T.f7932w;
        if (t8 == t12) {
            return this;
        }
        if (!t8.f7936g.isEmpty()) {
            if (this.f7920h.isEmpty()) {
                this.f7920h = t8.f7936g;
                this.f7919g &= -2;
            } else {
                if ((this.f7919g & 1) != 1) {
                    this.f7920h = new ArrayList(this.f7920h);
                    this.f7919g |= 1;
                }
                this.f7920h.addAll(t8.f7936g);
            }
        }
        int i4 = t8.f7935f;
        if ((i4 & 1) == 1) {
            boolean z8 = t8.f7937h;
            this.f7919g |= 2;
            this.f7921i = z8;
        }
        if ((i4 & 2) == 2) {
            int i8 = t8.f7938i;
            this.f7919g |= 4;
            this.j = i8;
        }
        if ((i4 & 4) == 4) {
            T t13 = t8.j;
            if ((this.f7919g & 8) == 8 && (t11 = this.k) != t12) {
                S r8 = T.r(t11);
                r8.i(t13);
                this.k = r8.g();
            } else {
                this.k = t13;
            }
            this.f7919g |= 8;
        }
        if ((t8.f7935f & 8) == 8) {
            int i9 = t8.k;
            this.f7919g |= 16;
            this.f7922l = i9;
        }
        if (t8.p()) {
            int i10 = t8.f7939l;
            this.f7919g |= 32;
            this.f7923m = i10;
        }
        int i11 = t8.f7935f;
        if ((i11 & 32) == 32) {
            int i12 = t8.f7940m;
            this.f7919g |= 64;
            this.f7924n = i12;
        }
        if ((i11 & 64) == 64) {
            int i13 = t8.f7941n;
            this.f7919g |= 128;
            this.f7925o = i13;
        }
        if ((i11 & 128) == 128) {
            int i14 = t8.f7942o;
            this.f7919g |= 256;
            this.f7926p = i14;
        }
        if ((i11 & 256) == 256) {
            T t14 = t8.f7943p;
            if ((this.f7919g & 512) == 512 && (t10 = this.f7927q) != t12) {
                S r9 = T.r(t10);
                r9.i(t14);
                this.f7927q = r9.g();
            } else {
                this.f7927q = t14;
            }
            this.f7919g |= 512;
        }
        int i15 = t8.f7935f;
        if ((i15 & 512) == 512) {
            int i16 = t8.f7944q;
            this.f7919g |= 1024;
            this.f7928r = i16;
        }
        if ((i15 & 1024) == 1024) {
            T t15 = t8.f7945r;
            if ((this.f7919g & 2048) == 2048 && (t9 = this.f7929s) != t12) {
                S r10 = T.r(t9);
                r10.i(t15);
                this.f7929s = r10.g();
            } else {
                this.f7929s = t15;
            }
            this.f7919g |= 2048;
        }
        int i17 = t8.f7935f;
        if ((i17 & 2048) == 2048) {
            int i18 = t8.f7946s;
            this.f7919g |= 4096;
            this.f7930t = i18;
        }
        if ((i17 & 4096) == 4096) {
            int i19 = t8.f7947t;
            this.f7919g |= 8192;
            this.f7931u = i19;
        }
        f(t8);
        this.f11240d = this.f11240d.h(t8.f7934e);
        return this;
    }
}
