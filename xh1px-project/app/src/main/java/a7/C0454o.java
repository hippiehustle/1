package a7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.C0797f;
import g7.C0799h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: a7.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454o extends AbstractC0801j implements g7.u {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8196e;

    /* renamed from: f, reason: collision with root package name */
    public int f8197f;

    /* renamed from: g, reason: collision with root package name */
    public List f8198g;

    public /* synthetic */ C0454o(int i4) {
        this.f8196e = i4;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        switch (this.f8196e) {
            case 0:
                C0455p f8 = f();
                if (f8.b()) {
                    return f8;
                }
                throw new UninitializedMessageException();
            case 1:
                M g8 = g();
                if (g8.b()) {
                    return g8;
                }
                throw new UninitializedMessageException();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                g0 i4 = i();
                i4.b();
                return i4;
            default:
                N h8 = h();
                h8.b();
                return h8;
        }
    }

    public final Object clone() {
        switch (this.f8196e) {
            case 0:
                C0454o c0454o = new C0454o(0);
                c0454o.f8198g = Collections.EMPTY_LIST;
                c0454o.j(f());
                return c0454o;
            case 1:
                C0454o c0454o2 = new C0454o(1);
                c0454o2.f8198g = Collections.EMPTY_LIST;
                c0454o2.k(g());
                return c0454o2;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C0454o c0454o3 = new C0454o(2);
                c0454o3.f8198g = Collections.EMPTY_LIST;
                c0454o3.m(i());
                return c0454o3;
            default:
                C0454o c0454o4 = new C0454o(3);
                c0454o4.f8198g = g7.r.f11253e;
                c0454o4.l(h());
                return c0454o4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007d  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        switch (this.f8196e) {
            case 0:
                C0455p c0455p = null;
                try {
                    try {
                        C0455p.f8200i.getClass();
                        j(new C0455p(c0797f, c0799h));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (c0455p != null) {
                            j(c0455p);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e9) {
                    C0455p c0455p2 = (C0455p) e9.f12155d;
                    try {
                        throw e9;
                    } catch (Throwable th2) {
                        th = th2;
                        c0455p = c0455p2;
                        if (c0455p != null) {
                        }
                        throw th;
                    }
                }
            case 1:
                M m6 = null;
                try {
                    try {
                        M.f7891i.getClass();
                        k(new M(c0797f, c0799h));
                        return this;
                    } catch (Throwable th3) {
                        th = th3;
                        if (m6 != null) {
                            k(m6);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    M m8 = (M) e10.f12155d;
                    try {
                        throw e10;
                    } catch (Throwable th4) {
                        th = th4;
                        m6 = m8;
                        if (m6 != null) {
                        }
                        throw th;
                    }
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                g0 g0Var = null;
                try {
                    try {
                        g0.f8098i.getClass();
                        m(new g0(c0797f, c0799h));
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        g0 g0Var2 = (g0) e11.f12155d;
                        try {
                            throw e11;
                        } catch (Throwable th5) {
                            th = th5;
                            g0Var = g0Var2;
                            if (g0Var != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (g0Var != null) {
                        m(g0Var);
                    }
                    throw th;
                }
            default:
                N n3 = null;
                try {
                    try {
                        N.f7897i.getClass();
                        l(new N(c0797f));
                        return this;
                    } catch (InvalidProtocolBufferException e12) {
                        N n8 = (N) e12.f12155d;
                        try {
                            throw e12;
                        } catch (Throwable th7) {
                            th = th7;
                            n3 = n8;
                            if (n3 != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (n3 != null) {
                        l(n3);
                    }
                    throw th;
                }
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        switch (this.f8196e) {
            case 0:
                j((C0455p) oVar);
                return this;
            case 1:
                k((M) oVar);
                return this;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                m((g0) oVar);
                return this;
            default:
                l((N) oVar);
                return this;
        }
    }

    public C0455p f() {
        C0455p c0455p = new C0455p(this);
        if ((this.f8197f & 1) == 1) {
            this.f8198g = Collections.unmodifiableList(this.f8198g);
            this.f8197f &= -2;
        }
        c0455p.f8202e = this.f8198g;
        return c0455p;
    }

    public M g() {
        M m6 = new M(this);
        if ((this.f8197f & 1) == 1) {
            this.f8198g = Collections.unmodifiableList(this.f8198g);
            this.f8197f &= -2;
        }
        m6.f7893e = this.f8198g;
        return m6;
    }

    public N h() {
        N n3 = new N(this);
        if ((this.f8197f & 1) == 1) {
            this.f8198g = ((g7.s) this.f8198g).d();
            this.f8197f &= -2;
        }
        n3.f7899e = (g7.s) this.f8198g;
        return n3;
    }

    public g0 i() {
        g0 g0Var = new g0(this);
        if ((this.f8197f & 1) == 1) {
            this.f8198g = Collections.unmodifiableList(this.f8198g);
            this.f8197f &= -2;
        }
        g0Var.f8100e = this.f8198g;
        return g0Var;
    }

    public void j(C0455p c0455p) {
        if (c0455p == C0455p.f8199h) {
            return;
        }
        if (!c0455p.f8202e.isEmpty()) {
            if (this.f8198g.isEmpty()) {
                this.f8198g = c0455p.f8202e;
                this.f8197f &= -2;
            } else {
                if ((this.f8197f & 1) != 1) {
                    this.f8198g = new ArrayList(this.f8198g);
                    this.f8197f |= 1;
                }
                this.f8198g.addAll(c0455p.f8202e);
            }
        }
        this.f11240d = this.f11240d.h(c0455p.f8201d);
    }

    public void k(M m6) {
        if (m6 == M.f7890h) {
            return;
        }
        if (!m6.f7893e.isEmpty()) {
            if (this.f8198g.isEmpty()) {
                this.f8198g = m6.f7893e;
                this.f8197f &= -2;
            } else {
                if ((this.f8197f & 1) != 1) {
                    this.f8198g = new ArrayList(this.f8198g);
                    this.f8197f |= 1;
                }
                this.f8198g.addAll(m6.f7893e);
            }
        }
        this.f11240d = this.f11240d.h(m6.f7892d);
    }

    public void l(N n3) {
        if (n3 == N.f7896h) {
            return;
        }
        if (!n3.f7899e.isEmpty()) {
            if (((g7.s) this.f8198g).isEmpty()) {
                this.f8198g = n3.f7899e;
                this.f8197f &= -2;
            } else {
                if ((this.f8197f & 1) != 1) {
                    this.f8198g = new g7.r((g7.s) this.f8198g);
                    this.f8197f |= 1;
                }
                ((g7.s) this.f8198g).addAll(n3.f7899e);
            }
        }
        this.f11240d = this.f11240d.h(n3.f7898d);
    }

    public void m(g0 g0Var) {
        if (g0Var == g0.f8097h) {
            return;
        }
        if (!g0Var.f8100e.isEmpty()) {
            if (this.f8198g.isEmpty()) {
                this.f8198g = g0Var.f8100e;
                this.f8197f &= -2;
            } else {
                if ((this.f8197f & 1) != 1) {
                    this.f8198g = new ArrayList(this.f8198g);
                    this.f8197f |= 1;
                }
                this.f8198g.addAll(g0Var.f8100e);
            }
        }
        this.f11240d = this.f11240d.h(g0Var.f8099d);
    }
}
