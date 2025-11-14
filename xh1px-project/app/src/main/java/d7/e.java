package d7;

import L5.m;
import a7.C0440a;
import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import g7.C0799h;
import g7.o;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: m, reason: collision with root package name */
    public static final e f10472m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0440a f10473n = new C0440a(27);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f10474d;

    /* renamed from: e, reason: collision with root package name */
    public int f10475e;

    /* renamed from: f, reason: collision with root package name */
    public b f10476f;

    /* renamed from: g, reason: collision with root package name */
    public c f10477g;

    /* renamed from: h, reason: collision with root package name */
    public c f10478h;

    /* renamed from: i, reason: collision with root package name */
    public c f10479i;
    public c j;
    public byte k;

    /* renamed from: l, reason: collision with root package name */
    public int f10480l;

    static {
        e eVar = new e();
        f10472m = eVar;
        eVar.f10476f = b.j;
        c cVar = c.j;
        eVar.f10477g = cVar;
        eVar.f10478h = cVar;
        eVar.f10479i = cVar;
        eVar.j = cVar;
    }

    public e() {
        this.k = (byte) -1;
        this.f10480l = -1;
        this.f10474d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        if (this.k == 1) {
            return true;
        }
        this.k = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f10480l;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f10475e & 1) == 1) {
            i4 = m.d(1, this.f10476f);
        } else {
            i4 = 0;
        }
        if ((this.f10475e & 2) == 2) {
            i4 += m.d(2, this.f10477g);
        }
        if ((this.f10475e & 4) == 4) {
            i4 += m.d(3, this.f10478h);
        }
        if ((this.f10475e & 8) == 8) {
            i4 += m.d(4, this.f10479i);
        }
        if ((this.f10475e & 16) == 16) {
            i4 += m.d(5, this.j);
        }
        int size = this.f10474d.size() + i4;
        this.f10480l = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return d.g();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        d g8 = d.g();
        g8.h(this);
        return g8;
    }

    @Override // g7.AbstractC0793b
    public final void f(m mVar) {
        c();
        if ((this.f10475e & 1) == 1) {
            mVar.o(1, this.f10476f);
        }
        if ((this.f10475e & 2) == 2) {
            mVar.o(2, this.f10477g);
        }
        if ((this.f10475e & 4) == 4) {
            mVar.o(3, this.f10478h);
        }
        if ((this.f10475e & 8) == 8) {
            mVar.o(4, this.f10479i);
        }
        if ((this.f10475e & 16) == 16) {
            mVar.o(5, this.j);
        }
        mVar.r(this.f10474d);
    }

    public final boolean i() {
        if ((this.f10475e & 4) == 4) {
            return true;
        }
        return false;
    }

    public e(d dVar) {
        this.k = (byte) -1;
        this.f10480l = -1;
        this.f10474d = dVar.f11240d;
    }

    public e(C0797f c0797f, C0799h c0799h) {
        this.k = (byte) -1;
        this.f10480l = -1;
        this.f10476f = b.j;
        c cVar = c.j;
        this.f10477g = cVar;
        this.f10478h = cVar;
        this.f10479i = cVar;
        this.j = cVar;
        C0795d c0795d = new C0795d();
        m j = m.j(c0795d, 1);
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        a aVar = null;
                        if (n3 == 10) {
                            if ((this.f10475e & 1) == 1) {
                                b bVar = this.f10476f;
                                bVar.getClass();
                                aVar = new a(0);
                                aVar.h(bVar);
                            }
                            b bVar2 = (b) c0797f.g(b.k, c0799h);
                            this.f10476f = bVar2;
                            if (aVar != null) {
                                aVar.h(bVar2);
                                this.f10476f = aVar.f();
                            }
                            this.f10475e |= 1;
                        } else if (n3 == 18) {
                            if ((this.f10475e & 2) == 2) {
                                c cVar2 = this.f10477g;
                                cVar2.getClass();
                                aVar = c.i(cVar2);
                            }
                            c cVar3 = (c) c0797f.g(c.k, c0799h);
                            this.f10477g = cVar3;
                            if (aVar != null) {
                                aVar.i(cVar3);
                                this.f10477g = aVar.g();
                            }
                            this.f10475e |= 2;
                        } else if (n3 == 26) {
                            if ((this.f10475e & 4) == 4) {
                                c cVar4 = this.f10478h;
                                cVar4.getClass();
                                aVar = c.i(cVar4);
                            }
                            c cVar5 = (c) c0797f.g(c.k, c0799h);
                            this.f10478h = cVar5;
                            if (aVar != null) {
                                aVar.i(cVar5);
                                this.f10478h = aVar.g();
                            }
                            this.f10475e |= 4;
                        } else if (n3 == 34) {
                            if ((this.f10475e & 8) == 8) {
                                c cVar6 = this.f10479i;
                                cVar6.getClass();
                                aVar = c.i(cVar6);
                            }
                            c cVar7 = (c) c0797f.g(c.k, c0799h);
                            this.f10479i = cVar7;
                            if (aVar != null) {
                                aVar.i(cVar7);
                                this.f10479i = aVar.g();
                            }
                            this.f10475e |= 8;
                        } else if (n3 != 42) {
                            if (!c0797f.q(n3, j)) {
                            }
                        } else {
                            if ((this.f10475e & 16) == 16) {
                                c cVar8 = this.j;
                                cVar8.getClass();
                                aVar = c.i(cVar8);
                            }
                            c cVar9 = (c) c0797f.g(c.k, c0799h);
                            this.j = cVar9;
                            if (aVar != null) {
                                aVar.i(cVar9);
                                this.j = aVar.g();
                            }
                            this.f10475e |= 16;
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
                    this.f10474d = c0795d.e();
                    throw th2;
                }
                this.f10474d = c0795d.e();
                throw th;
            }
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10474d = c0795d.e();
            throw th3;
        }
        this.f10474d = c0795d.e();
    }
}
