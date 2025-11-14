package a7;

import g7.AbstractC0793b;
import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import g7.C0799h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: a7.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458t extends g7.o {

    /* renamed from: l, reason: collision with root package name */
    public static final C0458t f8220l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0440a f8221m = new C0440a(7);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f8222d;

    /* renamed from: e, reason: collision with root package name */
    public int f8223e;

    /* renamed from: f, reason: collision with root package name */
    public r f8224f;

    /* renamed from: g, reason: collision with root package name */
    public List f8225g;

    /* renamed from: h, reason: collision with root package name */
    public C0463y f8226h;

    /* renamed from: i, reason: collision with root package name */
    public EnumC0457s f8227i;
    public byte j;
    public int k;

    static {
        C0458t c0458t = new C0458t();
        f8220l = c0458t;
        c0458t.f8224f = r.RETURNS_CONSTANT;
        c0458t.f8225g = Collections.EMPTY_LIST;
        c0458t.f8226h = C0463y.f8248o;
        c0458t.f8227i = EnumC0457s.AT_MOST_ONCE;
    }

    public C0458t() {
        this.j = (byte) -1;
        this.k = -1;
        this.f8222d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.j;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.f8225g.size(); i4++) {
            if (!((C0463y) this.f8225g.get(i4)).b()) {
                this.j = (byte) 0;
                return false;
            }
        }
        if ((this.f8223e & 2) == 2 && !this.f8226h.b()) {
            this.j = (byte) 0;
            return false;
        }
        this.j = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.k;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f8223e & 1) == 1) {
            i4 = L5.m.a(1, this.f8224f.f8214d);
        } else {
            i4 = 0;
        }
        for (int i9 = 0; i9 < this.f8225g.size(); i9++) {
            i4 += L5.m.d(2, (AbstractC0793b) this.f8225g.get(i9));
        }
        if ((this.f8223e & 2) == 2) {
            i4 += L5.m.d(3, this.f8226h);
        }
        if ((this.f8223e & 4) == 4) {
            i4 += L5.m.a(4, this.f8227i.f8219d);
        }
        int size = this.f8222d.size() + i4;
        this.k = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return C0456q.g();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        C0456q g8 = C0456q.g();
        g8.h(this);
        return g8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        if ((this.f8223e & 1) == 1) {
            mVar.l(1, this.f8224f.f8214d);
        }
        for (int i4 = 0; i4 < this.f8225g.size(); i4++) {
            mVar.o(2, (AbstractC0793b) this.f8225g.get(i4));
        }
        if ((this.f8223e & 2) == 2) {
            mVar.o(3, this.f8226h);
        }
        if ((this.f8223e & 4) == 4) {
            mVar.l(4, this.f8227i.f8219d);
        }
        mVar.r(this.f8222d);
    }

    public C0458t(C0456q c0456q) {
        this.j = (byte) -1;
        this.k = -1;
        this.f8222d = c0456q.f11240d;
    }

    public C0458t(C0797f c0797f, C0799h c0799h) {
        this.j = (byte) -1;
        this.k = -1;
        r rVar = r.RETURNS_CONSTANT;
        this.f8224f = rVar;
        this.f8225g = Collections.EMPTY_LIST;
        this.f8226h = C0463y.f8248o;
        EnumC0457s enumC0457s = EnumC0457s.AT_MOST_ONCE;
        this.f8227i = enumC0457s;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        boolean z8 = false;
        char c6 = 0;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        EnumC0457s enumC0457s2 = null;
                        r rVar2 = null;
                        C0461w c0461w = null;
                        if (n3 == 8) {
                            int k = c0797f.k();
                            if (k == 0) {
                                rVar2 = rVar;
                            } else if (k == 1) {
                                rVar2 = r.CALLS;
                            } else if (k == 2) {
                                rVar2 = r.RETURNS_NOT_NULL;
                            }
                            if (rVar2 == null) {
                                j.v(n3);
                                j.v(k);
                            } else {
                                this.f8223e |= 1;
                                this.f8224f = rVar2;
                            }
                        } else if (n3 == 18) {
                            int i4 = (c6 == true ? 1 : 0) & 2;
                            c6 = c6;
                            if (i4 != 2) {
                                this.f8225g = new ArrayList();
                                c6 = 2;
                            }
                            this.f8225g.add(c0797f.g(C0463y.f8249p, c0799h));
                        } else if (n3 == 26) {
                            if ((this.f8223e & 2) == 2) {
                                C0463y c0463y = this.f8226h;
                                c0463y.getClass();
                                c0461w = C0461w.g();
                                c0461w.h(c0463y);
                            }
                            C0463y c0463y2 = (C0463y) c0797f.g(C0463y.f8249p, c0799h);
                            this.f8226h = c0463y2;
                            if (c0461w != null) {
                                c0461w.h(c0463y2);
                                this.f8226h = c0461w.f();
                            }
                            this.f8223e |= 2;
                        } else if (n3 != 32) {
                            if (!c0797f.q(n3, j)) {
                            }
                        } else {
                            int k6 = c0797f.k();
                            if (k6 == 0) {
                                enumC0457s2 = enumC0457s;
                            } else if (k6 == 1) {
                                enumC0457s2 = EnumC0457s.EXACTLY_ONCE;
                            } else if (k6 == 2) {
                                enumC0457s2 = EnumC0457s.AT_LEAST_ONCE;
                            }
                            if (enumC0457s2 == null) {
                                j.v(n3);
                                j.v(k6);
                            } else {
                                this.f8223e |= 4;
                                this.f8227i = enumC0457s2;
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
                if (((c6 == true ? 1 : 0) & 2) == 2) {
                    this.f8225g = Collections.unmodifiableList(this.f8225g);
                }
                try {
                    j.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8222d = c0795d.e();
                    throw th2;
                }
                this.f8222d = c0795d.e();
                throw th;
            }
        }
        if (((c6 == true ? 1 : 0) & 2) == 2) {
            this.f8225g = Collections.unmodifiableList(this.f8225g);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8222d = c0795d.e();
            throw th3;
        }
        this.f8222d = c0795d.e();
    }
}
