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
public final class G extends AbstractC0803l {

    /* renamed from: m, reason: collision with root package name */
    public static final G f7818m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0440a f7819n = new C0440a(12);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0796e f7820e;

    /* renamed from: f, reason: collision with root package name */
    public int f7821f;

    /* renamed from: g, reason: collision with root package name */
    public N f7822g;

    /* renamed from: h, reason: collision with root package name */
    public M f7823h;

    /* renamed from: i, reason: collision with root package name */
    public E f7824i;
    public List j;
    public byte k;

    /* renamed from: l, reason: collision with root package name */
    public int f7825l;

    static {
        G g8 = new G();
        f7818m = g8;
        g8.f7822g = N.f7896h;
        g8.f7823h = M.f7890h;
        g8.f7824i = E.f7806n;
        g8.j = Collections.EMPTY_LIST;
    }

    public G(F f8) {
        super(f8);
        this.k = (byte) -1;
        this.f7825l = -1;
        this.f7820e = f8.f11240d;
    }

    @Override // g7.u
    public final AbstractC0793b a() {
        return f7818m;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.k;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f7821f & 2) == 2 && !this.f7823h.b()) {
            this.k = (byte) 0;
            return false;
        }
        if ((this.f7821f & 4) == 4 && !this.f7824i.b()) {
            this.k = (byte) 0;
            return false;
        }
        for (int i4 = 0; i4 < this.j.size(); i4++) {
            if (!((C0450k) this.j.get(i4)).b()) {
                this.k = (byte) 0;
                return false;
            }
        }
        if (!i()) {
            this.k = (byte) 0;
            return false;
        }
        this.k = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f7825l;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f7821f & 1) == 1) {
            i4 = L5.m.d(1, this.f7822g);
        } else {
            i4 = 0;
        }
        if ((this.f7821f & 2) == 2) {
            i4 += L5.m.d(2, this.f7823h);
        }
        if ((this.f7821f & 4) == 4) {
            i4 += L5.m.d(3, this.f7824i);
        }
        for (int i9 = 0; i9 < this.j.size(); i9++) {
            i4 += L5.m.d(4, (AbstractC0793b) this.j.get(i9));
        }
        int size = this.f7820e.size() + j() + i4;
        this.f7825l = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return F.h();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        F h8 = F.h();
        h8.i(this);
        return h8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        R3.r rVar = new R3.r(this);
        if ((this.f7821f & 1) == 1) {
            mVar.o(1, this.f7822g);
        }
        if ((this.f7821f & 2) == 2) {
            mVar.o(2, this.f7823h);
        }
        if ((this.f7821f & 4) == 4) {
            mVar.o(3, this.f7824i);
        }
        for (int i4 = 0; i4 < this.j.size(); i4++) {
            mVar.o(4, (AbstractC0793b) this.j.get(i4));
        }
        rVar.d0(200, mVar);
        mVar.r(this.f7820e);
    }

    public G() {
        this.k = (byte) -1;
        this.f7825l = -1;
        this.f7820e = AbstractC0796e.f11223d;
    }

    public G(C0797f c0797f, C0799h c0799h) {
        this.k = (byte) -1;
        this.f7825l = -1;
        this.f7822g = N.f7896h;
        this.f7823h = M.f7890h;
        this.f7824i = E.f7806n;
        this.j = Collections.EMPTY_LIST;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        boolean z8 = false;
        char c6 = 0;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        D d2 = null;
                        C0454o c0454o = null;
                        C0454o c0454o2 = null;
                        if (n3 == 10) {
                            if ((this.f7821f & 1) == 1) {
                                N n8 = this.f7822g;
                                n8.getClass();
                                c0454o = new C0454o(3);
                                c0454o.f8198g = g7.r.f11253e;
                                c0454o.l(n8);
                            }
                            N n9 = (N) c0797f.g(N.f7897i, c0799h);
                            this.f7822g = n9;
                            if (c0454o != null) {
                                c0454o.l(n9);
                                this.f7822g = c0454o.h();
                            }
                            this.f7821f |= 1;
                        } else if (n3 == 18) {
                            if ((this.f7821f & 2) == 2) {
                                M m6 = this.f7823h;
                                m6.getClass();
                                c0454o2 = new C0454o(1);
                                c0454o2.f8198g = Collections.EMPTY_LIST;
                                c0454o2.k(m6);
                            }
                            M m8 = (M) c0797f.g(M.f7891i, c0799h);
                            this.f7823h = m8;
                            if (c0454o2 != null) {
                                c0454o2.k(m8);
                                this.f7823h = c0454o2.g();
                            }
                            this.f7821f |= 2;
                        } else if (n3 == 26) {
                            if ((this.f7821f & 4) == 4) {
                                E e9 = this.f7824i;
                                e9.getClass();
                                d2 = D.h();
                                d2.i(e9);
                            }
                            E e10 = (E) c0797f.g(E.f7807o, c0799h);
                            this.f7824i = e10;
                            if (d2 != null) {
                                d2.i(e10);
                                this.f7824i = d2.g();
                            }
                            this.f7821f |= 4;
                        } else if (n3 != 34) {
                            if (!n(c0797f, j, c0799h, n3)) {
                            }
                        } else {
                            int i4 = (c6 == true ? 1 : 0) & '\b';
                            c6 = c6;
                            if (i4 != 8) {
                                this.j = new ArrayList();
                                c6 = '\b';
                            }
                            this.j.add(c0797f.g(C0450k.f8143P, c0799h));
                        }
                    }
                    z8 = true;
                } catch (Throwable th) {
                    if (((c6 == true ? 1 : 0) & '\b') == 8) {
                        this.j = Collections.unmodifiableList(this.j);
                    }
                    try {
                        j.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f7820e = c0795d.e();
                        throw th2;
                    }
                    this.f7820e = c0795d.e();
                    m();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e11) {
                e11.f12155d = this;
                throw e11;
            } catch (IOException e12) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e12.getMessage());
                invalidProtocolBufferException.f12155d = this;
                throw invalidProtocolBufferException;
            }
        }
        if (((c6 == true ? 1 : 0) & '\b') == 8) {
            this.j = Collections.unmodifiableList(this.j);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f7820e = c0795d.e();
            throw th3;
        }
        this.f7820e = c0795d.e();
        m();
    }
}
