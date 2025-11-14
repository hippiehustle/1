package a7;

import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class L extends g7.o {
    public static final L k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0440a f7883l = new C0440a(15);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f7884d;

    /* renamed from: e, reason: collision with root package name */
    public int f7885e;

    /* renamed from: f, reason: collision with root package name */
    public int f7886f;

    /* renamed from: g, reason: collision with root package name */
    public int f7887g;

    /* renamed from: h, reason: collision with root package name */
    public K f7888h;

    /* renamed from: i, reason: collision with root package name */
    public byte f7889i;
    public int j;

    static {
        L l6 = new L();
        k = l6;
        l6.f7886f = -1;
        l6.f7887g = 0;
        l6.f7888h = K.PACKAGE;
    }

    public L() {
        this.f7889i = (byte) -1;
        this.j = -1;
        this.f7884d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f7889i;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f7885e & 2) == 2) {
            this.f7889i = (byte) 1;
            return true;
        }
        this.f7889i = (byte) 0;
        return false;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.j;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f7885e & 1) == 1) {
            i4 = L5.m.b(1, this.f7886f);
        } else {
            i4 = 0;
        }
        if ((this.f7885e & 2) == 2) {
            i4 += L5.m.b(2, this.f7887g);
        }
        if ((this.f7885e & 4) == 4) {
            i4 += L5.m.a(3, this.f7888h.f7882d);
        }
        int size = this.f7884d.size() + i4;
        this.j = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return J.g();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        J g8 = J.g();
        g8.h(this);
        return g8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        if ((this.f7885e & 1) == 1) {
            mVar.m(1, this.f7886f);
        }
        if ((this.f7885e & 2) == 2) {
            mVar.m(2, this.f7887g);
        }
        if ((this.f7885e & 4) == 4) {
            mVar.l(3, this.f7888h.f7882d);
        }
        mVar.r(this.f7884d);
    }

    public L(J j) {
        this.f7889i = (byte) -1;
        this.j = -1;
        this.f7884d = j.f11240d;
    }

    public L(C0797f c0797f) {
        K k6;
        this.f7889i = (byte) -1;
        this.j = -1;
        this.f7886f = -1;
        boolean z8 = false;
        this.f7887g = 0;
        K k8 = K.PACKAGE;
        this.f7888h = k8;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 == 8) {
                            this.f7885e |= 1;
                            this.f7886f = c0797f.k();
                        } else if (n3 == 16) {
                            this.f7885e |= 2;
                            this.f7887g = c0797f.k();
                        } else if (n3 != 24) {
                            if (!c0797f.q(n3, j)) {
                            }
                        } else {
                            int k9 = c0797f.k();
                            if (k9 == 0) {
                                k6 = K.CLASS;
                            } else if (k9 != 1) {
                                k6 = k9 != 2 ? null : K.LOCAL;
                            } else {
                                k6 = k8;
                            }
                            if (k6 == null) {
                                j.v(n3);
                                j.v(k9);
                            } else {
                                this.f7885e |= 4;
                                this.f7888h = k6;
                            }
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
                    this.f7884d = c0795d.e();
                    throw th2;
                }
                this.f7884d = c0795d.e();
                throw th;
            }
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f7884d = c0795d.e();
            throw th3;
        }
        this.f7884d = c0795d.e();
    }
}
