package d7;

import L5.m;
import a7.C0440a;
import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import g7.o;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class b extends o {
    public static final b j;
    public static final C0440a k = new C0440a(25);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f10455d;

    /* renamed from: e, reason: collision with root package name */
    public int f10456e;

    /* renamed from: f, reason: collision with root package name */
    public int f10457f;

    /* renamed from: g, reason: collision with root package name */
    public int f10458g;

    /* renamed from: h, reason: collision with root package name */
    public byte f10459h;

    /* renamed from: i, reason: collision with root package name */
    public int f10460i;

    static {
        b bVar = new b();
        j = bVar;
        bVar.f10457f = 0;
        bVar.f10458g = 0;
    }

    public b() {
        this.f10459h = (byte) -1;
        this.f10460i = -1;
        this.f10455d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        if (this.f10459h == 1) {
            return true;
        }
        this.f10459h = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f10460i;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f10456e & 1) == 1) {
            i4 = m.b(1, this.f10457f);
        } else {
            i4 = 0;
        }
        if ((this.f10456e & 2) == 2) {
            i4 += m.b(2, this.f10458g);
        }
        int size = this.f10455d.size() + i4;
        this.f10460i = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return new a(0);
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        a aVar = new a(0);
        aVar.h(this);
        return aVar;
    }

    @Override // g7.AbstractC0793b
    public final void f(m mVar) {
        c();
        if ((this.f10456e & 1) == 1) {
            mVar.m(1, this.f10457f);
        }
        if ((this.f10456e & 2) == 2) {
            mVar.m(2, this.f10458g);
        }
        mVar.r(this.f10455d);
    }

    public b(a aVar) {
        this.f10459h = (byte) -1;
        this.f10460i = -1;
        this.f10455d = aVar.f11240d;
    }

    public b(C0797f c0797f) {
        this.f10459h = (byte) -1;
        this.f10460i = -1;
        boolean z8 = false;
        this.f10457f = 0;
        this.f10458g = 0;
        C0795d c0795d = new C0795d();
        m j5 = m.j(c0795d, 1);
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 == 8) {
                            this.f10456e |= 1;
                            this.f10457f = c0797f.k();
                        } else if (n3 != 16) {
                            if (!c0797f.q(n3, j5)) {
                            }
                        } else {
                            this.f10456e |= 2;
                            this.f10458g = c0797f.k();
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
                    j5.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f10455d = c0795d.e();
                    throw th2;
                }
                this.f10455d = c0795d.e();
                throw th;
            }
        }
        try {
            j5.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10455d = c0795d.e();
            throw th3;
        }
        this.f10455d = c0795d.e();
    }
}
