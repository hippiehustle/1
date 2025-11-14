package a7;

import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class f0 extends g7.o {

    /* renamed from: n, reason: collision with root package name */
    public static final f0 f8083n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0440a f8084o = new C0440a(23);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f8085d;

    /* renamed from: e, reason: collision with root package name */
    public int f8086e;

    /* renamed from: f, reason: collision with root package name */
    public int f8087f;

    /* renamed from: g, reason: collision with root package name */
    public int f8088g;

    /* renamed from: h, reason: collision with root package name */
    public d0 f8089h;

    /* renamed from: i, reason: collision with root package name */
    public int f8090i;
    public int j;
    public e0 k;

    /* renamed from: l, reason: collision with root package name */
    public byte f8091l;

    /* renamed from: m, reason: collision with root package name */
    public int f8092m;

    static {
        f0 f0Var = new f0();
        f8083n = f0Var;
        f0Var.f8087f = 0;
        f0Var.f8088g = 0;
        f0Var.f8089h = d0.ERROR;
        f0Var.f8090i = 0;
        f0Var.j = 0;
        f0Var.k = e0.LANGUAGE_VERSION;
    }

    public f0() {
        this.f8091l = (byte) -1;
        this.f8092m = -1;
        this.f8085d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        if (this.f8091l == 1) {
            return true;
        }
        this.f8091l = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f8092m;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f8086e & 1) == 1) {
            i4 = L5.m.b(1, this.f8087f);
        } else {
            i4 = 0;
        }
        if ((this.f8086e & 2) == 2) {
            i4 += L5.m.b(2, this.f8088g);
        }
        if ((this.f8086e & 4) == 4) {
            i4 += L5.m.a(3, this.f8089h.f8056d);
        }
        if ((this.f8086e & 8) == 8) {
            i4 += L5.m.b(4, this.f8090i);
        }
        if ((this.f8086e & 16) == 16) {
            i4 += L5.m.b(5, this.j);
        }
        if ((this.f8086e & 32) == 32) {
            i4 += L5.m.a(6, this.k.f8076d);
        }
        int size = this.f8085d.size() + i4;
        this.f8092m = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return c0.g();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        c0 g8 = c0.g();
        g8.h(this);
        return g8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        if ((this.f8086e & 1) == 1) {
            mVar.m(1, this.f8087f);
        }
        if ((this.f8086e & 2) == 2) {
            mVar.m(2, this.f8088g);
        }
        if ((this.f8086e & 4) == 4) {
            mVar.l(3, this.f8089h.f8056d);
        }
        if ((this.f8086e & 8) == 8) {
            mVar.m(4, this.f8090i);
        }
        if ((this.f8086e & 16) == 16) {
            mVar.m(5, this.j);
        }
        if ((this.f8086e & 32) == 32) {
            mVar.l(6, this.k.f8076d);
        }
        mVar.r(this.f8085d);
    }

    public f0(c0 c0Var) {
        this.f8091l = (byte) -1;
        this.f8092m = -1;
        this.f8085d = c0Var.f11240d;
    }

    public f0(C0797f c0797f) {
        this.f8091l = (byte) -1;
        this.f8092m = -1;
        boolean z8 = false;
        this.f8087f = 0;
        this.f8088g = 0;
        d0 d0Var = d0.ERROR;
        this.f8089h = d0Var;
        this.f8090i = 0;
        this.j = 0;
        e0 e0Var = e0.LANGUAGE_VERSION;
        this.k = e0Var;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 == 8) {
                            this.f8086e |= 1;
                            this.f8087f = c0797f.k();
                        } else if (n3 != 16) {
                            e0 e0Var2 = null;
                            d0 d0Var2 = null;
                            if (n3 == 24) {
                                int k = c0797f.k();
                                if (k == 0) {
                                    d0Var2 = d0.WARNING;
                                } else if (k == 1) {
                                    d0Var2 = d0Var;
                                } else if (k == 2) {
                                    d0Var2 = d0.HIDDEN;
                                }
                                if (d0Var2 == null) {
                                    j.v(n3);
                                    j.v(k);
                                } else {
                                    this.f8086e |= 4;
                                    this.f8089h = d0Var2;
                                }
                            } else if (n3 == 32) {
                                this.f8086e |= 8;
                                this.f8090i = c0797f.k();
                            } else if (n3 == 40) {
                                this.f8086e |= 16;
                                this.j = c0797f.k();
                            } else if (n3 != 48) {
                                if (!c0797f.q(n3, j)) {
                                }
                            } else {
                                int k6 = c0797f.k();
                                if (k6 == 0) {
                                    e0Var2 = e0Var;
                                } else if (k6 == 1) {
                                    e0Var2 = e0.COMPILER_VERSION;
                                } else if (k6 == 2) {
                                    e0Var2 = e0.API_VERSION;
                                }
                                if (e0Var2 == null) {
                                    j.v(n3);
                                    j.v(k6);
                                } else {
                                    this.f8086e |= 32;
                                    this.k = e0Var2;
                                }
                            }
                        } else {
                            this.f8086e |= 2;
                            this.f8088g = c0797f.k();
                        }
                    }
                    z8 = true;
                } catch (InvalidProtocolBufferException e9) {
                    e9.f12155d = this;
                    throw e9;
                } catch (IOException e10) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                    invalidProtocolBufferException.f12155d = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                try {
                    j.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8085d = c0795d.e();
                    throw th2;
                }
                this.f8085d = c0795d.e();
                throw th;
            }
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8085d = c0795d.e();
            throw th3;
        }
        this.f8085d = c0795d.e();
    }
}
