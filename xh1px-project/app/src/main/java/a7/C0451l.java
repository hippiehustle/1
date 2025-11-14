package a7;

import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: a7.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451l extends g7.o {
    public static final C0451l j;
    public static final C0440a k = new C0440a(4);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f8177d;

    /* renamed from: e, reason: collision with root package name */
    public int f8178e;

    /* renamed from: f, reason: collision with root package name */
    public int f8179f;

    /* renamed from: g, reason: collision with root package name */
    public g7.t f8180g;

    /* renamed from: h, reason: collision with root package name */
    public byte f8181h;

    /* renamed from: i, reason: collision with root package name */
    public int f8182i;

    static {
        C0451l c0451l = new C0451l();
        j = c0451l;
        c0451l.f8179f = 0;
        c0451l.f8180g = AbstractC0796e.f11223d;
    }

    public C0451l() {
        this.f8181h = (byte) -1;
        this.f8182i = -1;
        this.f8177d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f8181h;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        int i4 = this.f8178e;
        if ((i4 & 1) == 1) {
            if ((i4 & 2) == 2) {
                this.f8181h = (byte) 1;
                return true;
            }
            this.f8181h = (byte) 0;
            return false;
        }
        this.f8181h = (byte) 0;
        return false;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f8182i;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f8178e & 1) == 1) {
            i4 = L5.m.b(1, this.f8179f);
        } else {
            i4 = 0;
        }
        if ((this.f8178e & 2) == 2) {
            g7.t tVar = this.f8180g;
            i4 += tVar.size() + L5.m.f(tVar.size()) + L5.m.h(2);
        }
        int size = this.f8177d.size() + i4;
        this.f8182i = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        C0441b c0441b = new C0441b(1);
        c0441b.f8011h = AbstractC0796e.f11223d;
        return c0441b;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        C0441b c0441b = new C0441b(1);
        c0441b.f8011h = AbstractC0796e.f11223d;
        c0441b.i(this);
        return c0441b;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        if ((this.f8178e & 1) == 1) {
            mVar.m(1, this.f8179f);
        }
        if ((this.f8178e & 2) == 2) {
            g7.t tVar = this.f8180g;
            mVar.x(2, 2);
            mVar.v(tVar.size());
            mVar.r(tVar);
        }
        mVar.r(this.f8177d);
    }

    public C0451l(C0441b c0441b) {
        this.f8181h = (byte) -1;
        this.f8182i = -1;
        this.f8177d = c0441b.f11240d;
    }

    public C0451l(C0797f c0797f) {
        this.f8181h = (byte) -1;
        this.f8182i = -1;
        boolean z8 = false;
        this.f8179f = 0;
        this.f8180g = AbstractC0796e.f11223d;
        C0795d c0795d = new C0795d();
        L5.m j5 = L5.m.j(c0795d, 1);
        while (!z8) {
            try {
                try {
                    try {
                        int n3 = c0797f.n();
                        if (n3 != 0) {
                            if (n3 == 8) {
                                this.f8178e |= 1;
                                this.f8179f = c0797f.k();
                            } else if (n3 != 18) {
                                if (!c0797f.q(n3, j5)) {
                                }
                            } else {
                                this.f8178e |= 2;
                                this.f8180g = c0797f.e();
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
                    this.f8177d = c0795d.e();
                    throw th2;
                }
                this.f8177d = c0795d.e();
                throw th;
            }
        }
        try {
            j5.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8177d = c0795d.e();
            throw th3;
        }
        this.f8177d = c0795d.e();
    }
}
