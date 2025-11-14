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
public final class c extends o {
    public static final c j;
    public static final C0440a k = new C0440a(26);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f10461d;

    /* renamed from: e, reason: collision with root package name */
    public int f10462e;

    /* renamed from: f, reason: collision with root package name */
    public int f10463f;

    /* renamed from: g, reason: collision with root package name */
    public int f10464g;

    /* renamed from: h, reason: collision with root package name */
    public byte f10465h;

    /* renamed from: i, reason: collision with root package name */
    public int f10466i;

    static {
        c cVar = new c();
        j = cVar;
        cVar.f10463f = 0;
        cVar.f10464g = 0;
    }

    public c() {
        this.f10465h = (byte) -1;
        this.f10466i = -1;
        this.f10461d = AbstractC0796e.f11223d;
    }

    public static a i(c cVar) {
        a aVar = new a(1);
        aVar.i(cVar);
        return aVar;
    }

    @Override // g7.u
    public final boolean b() {
        if (this.f10465h == 1) {
            return true;
        }
        this.f10465h = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f10466i;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f10462e & 1) == 1) {
            i4 = m.b(1, this.f10463f);
        } else {
            i4 = 0;
        }
        if ((this.f10462e & 2) == 2) {
            i4 += m.b(2, this.f10464g);
        }
        int size = this.f10461d.size() + i4;
        this.f10466i = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return new a(1);
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        return i(this);
    }

    @Override // g7.AbstractC0793b
    public final void f(m mVar) {
        c();
        if ((this.f10462e & 1) == 1) {
            mVar.m(1, this.f10463f);
        }
        if ((this.f10462e & 2) == 2) {
            mVar.m(2, this.f10464g);
        }
        mVar.r(this.f10461d);
    }

    public c(a aVar) {
        this.f10465h = (byte) -1;
        this.f10466i = -1;
        this.f10461d = aVar.f11240d;
    }

    public c(C0797f c0797f) {
        this.f10465h = (byte) -1;
        this.f10466i = -1;
        boolean z8 = false;
        this.f10463f = 0;
        this.f10464g = 0;
        C0795d c0795d = new C0795d();
        m j5 = m.j(c0795d, 1);
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 == 8) {
                            this.f10462e |= 1;
                            this.f10463f = c0797f.k();
                        } else if (n3 != 16) {
                            if (!c0797f.q(n3, j5)) {
                            }
                        } else {
                            this.f10462e |= 2;
                            this.f10464g = c0797f.k();
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
                    this.f10461d = c0795d.e();
                    throw th2;
                }
                this.f10461d = c0795d.e();
                throw th;
            }
        }
        try {
            j5.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10461d = c0795d.e();
            throw th3;
        }
        this.f10461d = c0795d.e();
    }
}
