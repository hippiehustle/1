package a7;

import g7.AbstractC0793b;
import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.AbstractC0803l;
import g7.C0795d;
import g7.C0797f;
import g7.C0799h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class E extends AbstractC0803l {

    /* renamed from: n, reason: collision with root package name */
    public static final E f7806n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0440a f7807o = new C0440a(11);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0796e f7808e;

    /* renamed from: f, reason: collision with root package name */
    public int f7809f;

    /* renamed from: g, reason: collision with root package name */
    public List f7810g;

    /* renamed from: h, reason: collision with root package name */
    public List f7811h;

    /* renamed from: i, reason: collision with root package name */
    public List f7812i;
    public Z j;
    public g0 k;

    /* renamed from: l, reason: collision with root package name */
    public byte f7813l;

    /* renamed from: m, reason: collision with root package name */
    public int f7814m;

    static {
        E e9 = new E();
        f7806n = e9;
        List list = Collections.EMPTY_LIST;
        e9.f7810g = list;
        e9.f7811h = list;
        e9.f7812i = list;
        e9.j = Z.j;
        e9.k = g0.f8097h;
    }

    public E(D d2) {
        super(d2);
        this.f7813l = (byte) -1;
        this.f7814m = -1;
        this.f7808e = d2.f11240d;
    }

    @Override // g7.u
    public final AbstractC0793b a() {
        return f7806n;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f7813l;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.f7810g.size(); i4++) {
            if (!((C0439A) this.f7810g.get(i4)).b()) {
                this.f7813l = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f7811h.size(); i8++) {
            if (!((I) this.f7811h.get(i8)).b()) {
                this.f7813l = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.f7812i.size(); i9++) {
            if (!((V) this.f7812i.get(i9)).b()) {
                this.f7813l = (byte) 0;
                return false;
            }
        }
        if ((this.f7809f & 1) == 1 && !this.j.b()) {
            this.f7813l = (byte) 0;
            return false;
        }
        if (!i()) {
            this.f7813l = (byte) 0;
            return false;
        }
        this.f7813l = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4 = this.f7814m;
        if (i4 != -1) {
            return i4;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f7810g.size(); i9++) {
            i8 += L5.m.d(3, (AbstractC0793b) this.f7810g.get(i9));
        }
        for (int i10 = 0; i10 < this.f7811h.size(); i10++) {
            i8 += L5.m.d(4, (AbstractC0793b) this.f7811h.get(i10));
        }
        for (int i11 = 0; i11 < this.f7812i.size(); i11++) {
            i8 += L5.m.d(5, (AbstractC0793b) this.f7812i.get(i11));
        }
        if ((this.f7809f & 1) == 1) {
            i8 += L5.m.d(30, this.j);
        }
        if ((this.f7809f & 2) == 2) {
            i8 += L5.m.d(32, this.k);
        }
        int size = this.f7808e.size() + j() + i8;
        this.f7814m = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return D.h();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        D h8 = D.h();
        h8.i(this);
        return h8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        R3.r rVar = new R3.r(this);
        for (int i4 = 0; i4 < this.f7810g.size(); i4++) {
            mVar.o(3, (AbstractC0793b) this.f7810g.get(i4));
        }
        for (int i8 = 0; i8 < this.f7811h.size(); i8++) {
            mVar.o(4, (AbstractC0793b) this.f7811h.get(i8));
        }
        for (int i9 = 0; i9 < this.f7812i.size(); i9++) {
            mVar.o(5, (AbstractC0793b) this.f7812i.get(i9));
        }
        if ((this.f7809f & 1) == 1) {
            mVar.o(30, this.j);
        }
        if ((this.f7809f & 2) == 2) {
            mVar.o(32, this.k);
        }
        rVar.d0(200, mVar);
        mVar.r(this.f7808e);
    }

    public E() {
        this.f7813l = (byte) -1;
        this.f7814m = -1;
        this.f7808e = AbstractC0796e.f11223d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public E(C0797f c0797f, C0799h c0799h) {
        this.f7813l = (byte) -1;
        this.f7814m = -1;
        List list = Collections.EMPTY_LIST;
        this.f7810g = list;
        this.f7811h = list;
        this.f7812i = list;
        this.j = Z.j;
        this.k = g0.f8097h;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        boolean z8 = false;
        char c6 = 0;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 == 26) {
                            int i4 = (c6 == true ? 1 : 0) & 1;
                            c6 = c6;
                            if (i4 != 1) {
                                this.f7810g = new ArrayList();
                                c6 = (c6 == true ? 1 : 0) | 1;
                            }
                            this.f7810g.add(c0797f.g(C0439A.f7776C, c0799h));
                        } else if (n3 == 34) {
                            int i8 = (c6 == true ? 1 : 0) & 2;
                            c6 = c6;
                            if (i8 != 2) {
                                this.f7811h = new ArrayList();
                                c6 = (c6 == true ? 1 : 0) | 2;
                            }
                            this.f7811h.add(c0797f.g(I.f7848G, c0799h));
                        } else if (n3 != 42) {
                            C0454o c0454o = null;
                            C0446g c0446g = null;
                            if (n3 == 242) {
                                if ((this.f7809f & 1) == 1) {
                                    Z z9 = this.j;
                                    z9.getClass();
                                    c0446g = Z.i(z9);
                                }
                                Z z10 = (Z) c0797f.g(Z.k, c0799h);
                                this.j = z10;
                                if (c0446g != null) {
                                    c0446g.j(z10);
                                    this.j = c0446g.g();
                                }
                                this.f7809f |= 1;
                            } else if (n3 != 258) {
                                if (!n(c0797f, j, c0799h, n3)) {
                                }
                            } else {
                                if ((this.f7809f & 2) == 2) {
                                    g0 g0Var = this.k;
                                    g0Var.getClass();
                                    c0454o = new C0454o(2);
                                    c0454o.f8198g = Collections.EMPTY_LIST;
                                    c0454o.m(g0Var);
                                }
                                g0 g0Var2 = (g0) c0797f.g(g0.f8098i, c0799h);
                                this.k = g0Var2;
                                if (c0454o != null) {
                                    c0454o.m(g0Var2);
                                    this.k = c0454o.i();
                                }
                                this.f7809f |= 2;
                            }
                        } else {
                            int i9 = (c6 == true ? 1 : 0) & 4;
                            c6 = c6;
                            if (i9 != 4) {
                                this.f7812i = new ArrayList();
                                c6 = (c6 == true ? 1 : 0) | 4;
                            }
                            this.f7812i.add(c0797f.g(V.f7960t, c0799h));
                        }
                    }
                    z8 = true;
                } catch (Throwable th) {
                    if (((c6 == true ? 1 : 0) & 1) == 1) {
                        this.f7810g = Collections.unmodifiableList(this.f7810g);
                    }
                    if (((c6 == true ? 1 : 0) & 2) == 2) {
                        this.f7811h = Collections.unmodifiableList(this.f7811h);
                    }
                    if (((c6 == true ? 1 : 0) & 4) == 4) {
                        this.f7812i = Collections.unmodifiableList(this.f7812i);
                    }
                    try {
                        j.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f7808e = c0795d.e();
                        throw th2;
                    }
                    this.f7808e = c0795d.e();
                    m();
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
        if (((c6 == true ? 1 : 0) & 1) == 1) {
            this.f7810g = Collections.unmodifiableList(this.f7810g);
        }
        if (((c6 == true ? 1 : 0) & 2) == 2) {
            this.f7811h = Collections.unmodifiableList(this.f7811h);
        }
        if (((c6 == true ? 1 : 0) & 4) == 4) {
            this.f7812i = Collections.unmodifiableList(this.f7812i);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f7808e = c0795d.e();
            throw th3;
        }
        this.f7808e = c0795d.e();
        m();
    }
}
