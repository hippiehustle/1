package a7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.C0797f;
import g7.C0799h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: a7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442c extends AbstractC0801j implements g7.u {

    /* renamed from: e, reason: collision with root package name */
    public int f8024e;

    /* renamed from: f, reason: collision with root package name */
    public EnumC0443d f8025f;

    /* renamed from: g, reason: collision with root package name */
    public long f8026g;

    /* renamed from: h, reason: collision with root package name */
    public float f8027h;

    /* renamed from: i, reason: collision with root package name */
    public double f8028i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f8029l;

    /* renamed from: m, reason: collision with root package name */
    public C0447h f8030m;

    /* renamed from: n, reason: collision with root package name */
    public List f8031n;

    /* renamed from: o, reason: collision with root package name */
    public int f8032o;

    /* renamed from: p, reason: collision with root package name */
    public int f8033p;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.j, a7.c] */
    public static C0442c g() {
        ?? abstractC0801j = new AbstractC0801j();
        abstractC0801j.f8025f = EnumC0443d.BYTE;
        abstractC0801j.f8030m = C0447h.j;
        abstractC0801j.f8031n = Collections.EMPTY_LIST;
        return abstractC0801j;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        C0444e f8 = f();
        if (f8.b()) {
            return f8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0442c g8 = g();
        g8.h(f());
        return g8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        C0444e c0444e = null;
        try {
            try {
                C0444e.f8058t.getClass();
                h(new C0444e(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                C0444e c0444e2 = (C0444e) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    c0444e = c0444e2;
                    if (c0444e != null) {
                        h(c0444e);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0444e != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        h((C0444e) oVar);
        return this;
    }

    public final C0444e f() {
        C0444e c0444e = new C0444e(this);
        int i4 = this.f8024e;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        c0444e.f8061f = this.f8025f;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        c0444e.f8062g = this.f8026g;
        if ((i4 & 4) == 4) {
            i8 |= 4;
        }
        c0444e.f8063h = this.f8027h;
        if ((i4 & 8) == 8) {
            i8 |= 8;
        }
        c0444e.f8064i = this.f8028i;
        if ((i4 & 16) == 16) {
            i8 |= 16;
        }
        c0444e.j = this.j;
        if ((i4 & 32) == 32) {
            i8 |= 32;
        }
        c0444e.k = this.k;
        if ((i4 & 64) == 64) {
            i8 |= 64;
        }
        c0444e.f8065l = this.f8029l;
        if ((i4 & 128) == 128) {
            i8 |= 128;
        }
        c0444e.f8066m = this.f8030m;
        if ((i4 & 256) == 256) {
            this.f8031n = Collections.unmodifiableList(this.f8031n);
            this.f8024e &= -257;
        }
        c0444e.f8067n = this.f8031n;
        if ((i4 & 512) == 512) {
            i8 |= 256;
        }
        c0444e.f8068o = this.f8032o;
        if ((i4 & 1024) == 1024) {
            i8 |= 512;
        }
        c0444e.f8069p = this.f8033p;
        c0444e.f8060e = i8;
        return c0444e;
    }

    public final void h(C0444e c0444e) {
        C0447h c0447h;
        if (c0444e == C0444e.f8057s) {
            return;
        }
        if ((c0444e.f8060e & 1) == 1) {
            EnumC0443d enumC0443d = c0444e.f8061f;
            enumC0443d.getClass();
            this.f8024e = 1 | this.f8024e;
            this.f8025f = enumC0443d;
        }
        int i4 = c0444e.f8060e;
        if ((i4 & 2) == 2) {
            long j = c0444e.f8062g;
            this.f8024e |= 2;
            this.f8026g = j;
        }
        if ((i4 & 4) == 4) {
            float f8 = c0444e.f8063h;
            this.f8024e = 4 | this.f8024e;
            this.f8027h = f8;
        }
        if ((i4 & 8) == 8) {
            double d2 = c0444e.f8064i;
            this.f8024e |= 8;
            this.f8028i = d2;
        }
        if ((i4 & 16) == 16) {
            int i8 = c0444e.j;
            this.f8024e = 16 | this.f8024e;
            this.j = i8;
        }
        if ((i4 & 32) == 32) {
            int i9 = c0444e.k;
            this.f8024e = 32 | this.f8024e;
            this.k = i9;
        }
        if ((i4 & 64) == 64) {
            int i10 = c0444e.f8065l;
            this.f8024e = 64 | this.f8024e;
            this.f8029l = i10;
        }
        if ((i4 & 128) == 128) {
            C0447h c0447h2 = c0444e.f8066m;
            if ((this.f8024e & 128) == 128 && (c0447h = this.f8030m) != C0447h.j) {
                C0446g c0446g = new C0446g(0);
                c0446g.f8095g = Collections.EMPTY_LIST;
                c0446g.i(c0447h);
                c0446g.i(c0447h2);
                this.f8030m = c0446g.f();
            } else {
                this.f8030m = c0447h2;
            }
            this.f8024e |= 128;
        }
        if (!c0444e.f8067n.isEmpty()) {
            if (this.f8031n.isEmpty()) {
                this.f8031n = c0444e.f8067n;
                this.f8024e &= -257;
            } else {
                if ((this.f8024e & 256) != 256) {
                    this.f8031n = new ArrayList(this.f8031n);
                    this.f8024e |= 256;
                }
                this.f8031n.addAll(c0444e.f8067n);
            }
        }
        int i11 = c0444e.f8060e;
        if ((i11 & 256) == 256) {
            int i12 = c0444e.f8068o;
            this.f8024e |= 512;
            this.f8032o = i12;
        }
        if ((i11 & 512) == 512) {
            int i13 = c0444e.f8069p;
            this.f8024e |= 1024;
            this.f8033p = i13;
        }
        this.f11240d = this.f11240d.h(c0444e.f8059d);
    }
}
