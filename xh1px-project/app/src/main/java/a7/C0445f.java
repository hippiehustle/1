package a7;

import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import g7.C0799h;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: a7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445f extends g7.o {
    public static final C0445f j;
    public static final C0440a k = new C0440a(1);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f8077d;

    /* renamed from: e, reason: collision with root package name */
    public int f8078e;

    /* renamed from: f, reason: collision with root package name */
    public int f8079f;

    /* renamed from: g, reason: collision with root package name */
    public C0444e f8080g;

    /* renamed from: h, reason: collision with root package name */
    public byte f8081h;

    /* renamed from: i, reason: collision with root package name */
    public int f8082i;

    static {
        C0445f c0445f = new C0445f();
        j = c0445f;
        c0445f.f8079f = 0;
        c0445f.f8080g = C0444e.f8057s;
    }

    public C0445f() {
        this.f8081h = (byte) -1;
        this.f8082i = -1;
        this.f8077d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f8081h;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        int i4 = this.f8078e;
        if ((i4 & 1) == 1) {
            if ((i4 & 2) == 2) {
                if (!this.f8080g.b()) {
                    this.f8081h = (byte) 0;
                    return false;
                }
                this.f8081h = (byte) 1;
                return true;
            }
            this.f8081h = (byte) 0;
            return false;
        }
        this.f8081h = (byte) 0;
        return false;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f8082i;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f8078e & 1) == 1) {
            i4 = L5.m.b(1, this.f8079f);
        } else {
            i4 = 0;
        }
        if ((this.f8078e & 2) == 2) {
            i4 += L5.m.d(2, this.f8080g);
        }
        int size = this.f8077d.size() + i4;
        this.f8082i = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        C0441b c0441b = new C0441b(0);
        c0441b.f8011h = C0444e.f8057s;
        return c0441b;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        C0441b c0441b = new C0441b(0);
        c0441b.f8011h = C0444e.f8057s;
        c0441b.h(this);
        return c0441b;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        if ((this.f8078e & 1) == 1) {
            mVar.m(1, this.f8079f);
        }
        if ((this.f8078e & 2) == 2) {
            mVar.o(2, this.f8080g);
        }
        mVar.r(this.f8077d);
    }

    public C0445f(C0441b c0441b) {
        this.f8081h = (byte) -1;
        this.f8082i = -1;
        this.f8077d = c0441b.f11240d;
    }

    public C0445f(C0797f c0797f, C0799h c0799h) {
        C0442c c0442c;
        this.f8081h = (byte) -1;
        this.f8082i = -1;
        boolean z8 = false;
        this.f8079f = 0;
        this.f8080g = C0444e.f8057s;
        C0795d c0795d = new C0795d();
        L5.m j5 = L5.m.j(c0795d, 1);
        while (!z8) {
            try {
                try {
                    try {
                        int n3 = c0797f.n();
                        if (n3 != 0) {
                            if (n3 == 8) {
                                this.f8078e |= 1;
                                this.f8079f = c0797f.k();
                            } else if (n3 != 18) {
                                if (!c0797f.q(n3, j5)) {
                                }
                            } else {
                                if ((this.f8078e & 2) == 2) {
                                    C0444e c0444e = this.f8080g;
                                    c0444e.getClass();
                                    c0442c = C0444e.j(c0444e);
                                } else {
                                    c0442c = null;
                                }
                                C0444e c0444e2 = (C0444e) c0797f.g(C0444e.f8058t, c0799h);
                                this.f8080g = c0444e2;
                                if (c0442c != null) {
                                    c0442c.h(c0444e2);
                                    this.f8080g = c0442c.f();
                                }
                                this.f8078e |= 2;
                            }
                        }
                        z8 = true;
                    } catch (InvalidProtocolBufferException e9) {
                        e9.f12155d = this;
                        throw e9;
                    }
                } catch (IOException e10) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                    invalidProtocolBufferException.f12155d = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                try {
                    j5.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8077d = c0795d.e();
                    throw th2;
                }
                this.f8077d = c0795d.e();
                throw th;
            }
        }
        try {
            j5.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8077d = c0795d.e();
            throw th3;
        }
        this.f8077d = c0795d.e();
    }
}
