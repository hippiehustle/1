package a7;

import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import g7.C0799h;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class Q extends g7.o {
    public static final Q k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0440a f7912l = new C0440a(18);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f7913d;

    /* renamed from: e, reason: collision with root package name */
    public int f7914e;

    /* renamed from: f, reason: collision with root package name */
    public P f7915f;

    /* renamed from: g, reason: collision with root package name */
    public T f7916g;

    /* renamed from: h, reason: collision with root package name */
    public int f7917h;

    /* renamed from: i, reason: collision with root package name */
    public byte f7918i;
    public int j;

    static {
        Q q6 = new Q();
        k = q6;
        q6.f7915f = P.INV;
        q6.f7916g = T.f7932w;
        q6.f7917h = 0;
    }

    public Q() {
        this.f7918i = (byte) -1;
        this.j = -1;
        this.f7913d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f7918i;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f7914e & 2) == 2 && !this.f7916g.b()) {
            this.f7918i = (byte) 0;
            return false;
        }
        this.f7918i = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.j;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f7914e & 1) == 1) {
            i4 = L5.m.a(1, this.f7915f.f7911d);
        } else {
            i4 = 0;
        }
        if ((this.f7914e & 2) == 2) {
            i4 += L5.m.d(2, this.f7916g);
        }
        if ((this.f7914e & 4) == 4) {
            i4 += L5.m.b(3, this.f7917h);
        }
        int size = this.f7913d.size() + i4;
        this.j = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return O.g();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        O g8 = O.g();
        g8.h(this);
        return g8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        if ((this.f7914e & 1) == 1) {
            mVar.l(1, this.f7915f.f7911d);
        }
        if ((this.f7914e & 2) == 2) {
            mVar.o(2, this.f7916g);
        }
        if ((this.f7914e & 4) == 4) {
            mVar.m(3, this.f7917h);
        }
        mVar.r(this.f7913d);
    }

    public Q(O o7) {
        this.f7918i = (byte) -1;
        this.j = -1;
        this.f7913d = o7.f11240d;
    }

    public Q(C0797f c0797f, C0799h c0799h) {
        this.f7918i = (byte) -1;
        this.j = -1;
        P p8 = P.INV;
        this.f7915f = p8;
        this.f7916g = T.f7932w;
        boolean z8 = false;
        this.f7917h = 0;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        S s8 = null;
                        P p9 = null;
                        if (n3 == 8) {
                            int k6 = c0797f.k();
                            if (k6 == 0) {
                                p9 = P.IN;
                            } else if (k6 == 1) {
                                p9 = P.OUT;
                            } else if (k6 == 2) {
                                p9 = p8;
                            } else if (k6 == 3) {
                                p9 = P.STAR;
                            }
                            if (p9 == null) {
                                j.v(n3);
                                j.v(k6);
                            } else {
                                this.f7914e |= 1;
                                this.f7915f = p9;
                            }
                        } else if (n3 == 18) {
                            if ((this.f7914e & 2) == 2) {
                                T t8 = this.f7916g;
                                t8.getClass();
                                s8 = T.r(t8);
                            }
                            T t9 = (T) c0797f.g(T.f7933x, c0799h);
                            this.f7916g = t9;
                            if (s8 != null) {
                                s8.i(t9);
                                this.f7916g = s8.g();
                            }
                            this.f7914e |= 2;
                        } else if (n3 != 24) {
                            if (!c0797f.q(n3, j)) {
                            }
                        } else {
                            this.f7914e |= 4;
                            this.f7917h = c0797f.k();
                        }
                    }
                    z8 = true;
                } catch (Throwable th) {
                    try {
                        j.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f7913d = c0795d.e();
                        throw th2;
                    }
                    this.f7913d = c0795d.e();
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
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f7913d = c0795d.e();
            throw th3;
        }
        this.f7913d = c0795d.e();
    }
}
