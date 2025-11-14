package a7;

import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class N extends g7.o {

    /* renamed from: h, reason: collision with root package name */
    public static final N f7896h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0440a f7897i = new C0440a(16);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f7898d;

    /* renamed from: e, reason: collision with root package name */
    public g7.s f7899e;

    /* renamed from: f, reason: collision with root package name */
    public byte f7900f;

    /* renamed from: g, reason: collision with root package name */
    public int f7901g;

    static {
        N n3 = new N();
        f7896h = n3;
        n3.f7899e = g7.r.f11253e;
    }

    public N() {
        this.f7900f = (byte) -1;
        this.f7901g = -1;
        this.f7898d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        if (this.f7900f == 1) {
            return true;
        }
        this.f7900f = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4 = this.f7901g;
        if (i4 != -1) {
            return i4;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f7899e.size(); i9++) {
            AbstractC0796e c6 = this.f7899e.c(i9);
            i8 += c6.size() + L5.m.f(c6.size());
        }
        int size = this.f7898d.size() + this.f7899e.size() + i8;
        this.f7901g = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        C0454o c0454o = new C0454o(3);
        c0454o.f8198g = g7.r.f11253e;
        return c0454o;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        C0454o c0454o = new C0454o(3);
        c0454o.f8198g = g7.r.f11253e;
        c0454o.l(this);
        return c0454o;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        for (int i4 = 0; i4 < this.f7899e.size(); i4++) {
            AbstractC0796e c6 = this.f7899e.c(i4);
            mVar.x(1, 2);
            mVar.v(c6.size());
            mVar.r(c6);
        }
        mVar.r(this.f7898d);
    }

    public N(C0454o c0454o) {
        this.f7900f = (byte) -1;
        this.f7901g = -1;
        this.f7898d = c0454o.f11240d;
    }

    public N(C0797f c0797f) {
        this.f7900f = (byte) -1;
        this.f7901g = -1;
        this.f7899e = g7.r.f11253e;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        boolean z8 = false;
        boolean z9 = false;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 != 10) {
                            if (!c0797f.q(n3, j)) {
                            }
                        } else {
                            g7.t e9 = c0797f.e();
                            if (!z9) {
                                this.f7899e = new g7.r();
                                z9 = true;
                            }
                            this.f7899e.b(e9);
                        }
                    }
                    z8 = true;
                } catch (Throwable th) {
                    if (z9) {
                        this.f7899e = this.f7899e.d();
                    }
                    try {
                        j.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f7898d = c0795d.e();
                        throw th2;
                    }
                    this.f7898d = c0795d.e();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.f12155d = this;
                throw e10;
            } catch (IOException e11) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                invalidProtocolBufferException.f12155d = this;
                throw invalidProtocolBufferException;
            }
        }
        if (z9) {
            this.f7899e = this.f7899e.d();
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f7898d = c0795d.e();
            throw th3;
        }
        this.f7898d = c0795d.e();
    }
}
