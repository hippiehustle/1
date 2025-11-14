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

/* loaded from: classes.dex */
public final class M extends g7.o {

    /* renamed from: h, reason: collision with root package name */
    public static final M f7890h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0440a f7891i = new C0440a(14);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f7892d;

    /* renamed from: e, reason: collision with root package name */
    public List f7893e;

    /* renamed from: f, reason: collision with root package name */
    public byte f7894f;

    /* renamed from: g, reason: collision with root package name */
    public int f7895g;

    static {
        M m6 = new M();
        f7890h = m6;
        m6.f7893e = Collections.EMPTY_LIST;
    }

    public M() {
        this.f7894f = (byte) -1;
        this.f7895g = -1;
        this.f7892d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f7894f;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.f7893e.size(); i4++) {
            if (!((L) this.f7893e.get(i4)).b()) {
                this.f7894f = (byte) 0;
                return false;
            }
        }
        this.f7894f = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4 = this.f7895g;
        if (i4 != -1) {
            return i4;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f7893e.size(); i9++) {
            i8 += L5.m.d(1, (AbstractC0793b) this.f7893e.get(i9));
        }
        int size = this.f7892d.size() + i8;
        this.f7895g = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        C0454o c0454o = new C0454o(1);
        c0454o.f8198g = Collections.EMPTY_LIST;
        return c0454o;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        C0454o c0454o = new C0454o(1);
        c0454o.f8198g = Collections.EMPTY_LIST;
        c0454o.k(this);
        return c0454o;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        for (int i4 = 0; i4 < this.f7893e.size(); i4++) {
            mVar.o(1, (AbstractC0793b) this.f7893e.get(i4));
        }
        mVar.r(this.f7892d);
    }

    public M(C0454o c0454o) {
        this.f7894f = (byte) -1;
        this.f7895g = -1;
        this.f7892d = c0454o.f11240d;
    }

    public M(C0797f c0797f, C0799h c0799h) {
        this.f7894f = (byte) -1;
        this.f7895g = -1;
        this.f7893e = Collections.EMPTY_LIST;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        boolean z8 = false;
        boolean z9 = false;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 != 10) {
                            if (!c0797f.q(n3, j)) {
                            }
                        } else {
                            if (!z9) {
                                this.f7893e = new ArrayList();
                                z9 = true;
                            }
                            this.f7893e.add(c0797f.g(L.f7883l, c0799h));
                        }
                    }
                    z8 = true;
                } catch (Throwable th) {
                    if (z9) {
                        this.f7893e = Collections.unmodifiableList(this.f7893e);
                    }
                    try {
                        j.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f7892d = c0795d.e();
                        throw th2;
                    }
                    this.f7892d = c0795d.e();
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
        if (z9) {
            this.f7893e = Collections.unmodifiableList(this.f7893e);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f7892d = c0795d.e();
            throw th3;
        }
        this.f7892d = c0795d.e();
    }
}
