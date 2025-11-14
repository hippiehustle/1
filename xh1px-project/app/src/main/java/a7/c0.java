package a7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.C0797f;
import g7.C0799h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class c0 extends AbstractC0801j implements g7.u {

    /* renamed from: e, reason: collision with root package name */
    public int f8034e;

    /* renamed from: f, reason: collision with root package name */
    public int f8035f;

    /* renamed from: g, reason: collision with root package name */
    public int f8036g;

    /* renamed from: h, reason: collision with root package name */
    public d0 f8037h;

    /* renamed from: i, reason: collision with root package name */
    public int f8038i;
    public int j;
    public e0 k;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.j, a7.c0] */
    public static c0 g() {
        ?? abstractC0801j = new AbstractC0801j();
        abstractC0801j.f8037h = d0.ERROR;
        abstractC0801j.k = e0.LANGUAGE_VERSION;
        return abstractC0801j;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        f0 f8 = f();
        f8.b();
        return f8;
    }

    public final Object clone() {
        c0 g8 = g();
        g8.h(f());
        return g8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        f0 f0Var = null;
        try {
            try {
                f0.f8084o.getClass();
                h(new f0(c0797f));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                f0 f0Var2 = (f0) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    f0Var = f0Var2;
                    if (f0Var != null) {
                        h(f0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (f0Var != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        h((f0) oVar);
        return this;
    }

    public final f0 f() {
        f0 f0Var = new f0(this);
        int i4 = this.f8034e;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        f0Var.f8087f = this.f8035f;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        f0Var.f8088g = this.f8036g;
        if ((i4 & 4) == 4) {
            i8 |= 4;
        }
        f0Var.f8089h = this.f8037h;
        if ((i4 & 8) == 8) {
            i8 |= 8;
        }
        f0Var.f8090i = this.f8038i;
        if ((i4 & 16) == 16) {
            i8 |= 16;
        }
        f0Var.j = this.j;
        if ((i4 & 32) == 32) {
            i8 |= 32;
        }
        f0Var.k = this.k;
        f0Var.f8086e = i8;
        return f0Var;
    }

    public final void h(f0 f0Var) {
        if (f0Var == f0.f8083n) {
            return;
        }
        int i4 = f0Var.f8086e;
        if ((i4 & 1) == 1) {
            int i8 = f0Var.f8087f;
            this.f8034e = 1 | this.f8034e;
            this.f8035f = i8;
        }
        if ((i4 & 2) == 2) {
            int i9 = f0Var.f8088g;
            this.f8034e = 2 | this.f8034e;
            this.f8036g = i9;
        }
        if ((i4 & 4) == 4) {
            d0 d0Var = f0Var.f8089h;
            d0Var.getClass();
            this.f8034e = 4 | this.f8034e;
            this.f8037h = d0Var;
        }
        int i10 = f0Var.f8086e;
        if ((i10 & 8) == 8) {
            int i11 = f0Var.f8090i;
            this.f8034e = 8 | this.f8034e;
            this.f8038i = i11;
        }
        if ((i10 & 16) == 16) {
            int i12 = f0Var.j;
            this.f8034e = 16 | this.f8034e;
            this.j = i12;
        }
        if ((i10 & 32) == 32) {
            e0 e0Var = f0Var.k;
            e0Var.getClass();
            this.f8034e = 32 | this.f8034e;
            this.k = e0Var;
        }
        this.f11240d = this.f11240d.h(f0Var.f8085d);
    }
}
