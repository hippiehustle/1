package a7;

import g7.AbstractC0793b;
import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.AbstractC0802k;
import g7.AbstractC0803l;
import g7.C0795d;
import g7.C0797f;
import g7.C0799h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: a7.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460v extends AbstractC0803l {
    public static final C0460v k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0440a f8231l = new C0440a(8);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0796e f8232e;

    /* renamed from: f, reason: collision with root package name */
    public int f8233f;

    /* renamed from: g, reason: collision with root package name */
    public int f8234g;

    /* renamed from: h, reason: collision with root package name */
    public List f8235h;

    /* renamed from: i, reason: collision with root package name */
    public byte f8236i;
    public int j;

    static {
        C0460v c0460v = new C0460v();
        k = c0460v;
        c0460v.f8234g = 0;
        c0460v.f8235h = Collections.EMPTY_LIST;
    }

    public C0460v(C0459u c0459u) {
        super(c0459u);
        this.f8236i = (byte) -1;
        this.j = -1;
        this.f8232e = c0459u.f11240d;
    }

    @Override // g7.u
    public final AbstractC0793b a() {
        return k;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f8236i;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.f8235h.size(); i4++) {
            if (!((C0447h) this.f8235h.get(i4)).b()) {
                this.f8236i = (byte) 0;
                return false;
            }
        }
        if (!i()) {
            this.f8236i = (byte) 0;
            return false;
        }
        this.f8236i = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.j;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f8233f & 1) == 1) {
            i4 = L5.m.b(1, this.f8234g);
        } else {
            i4 = 0;
        }
        for (int i9 = 0; i9 < this.f8235h.size(); i9++) {
            i4 += L5.m.d(2, (AbstractC0793b) this.f8235h.get(i9));
        }
        int size = this.f8232e.size() + j() + i4;
        this.j = size;
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a7.u, g7.k, g7.j] */
    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        ?? abstractC0802k = new AbstractC0802k();
        abstractC0802k.f8230i = Collections.EMPTY_LIST;
        return abstractC0802k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a7.u, g7.k, g7.j] */
    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        ?? abstractC0802k = new AbstractC0802k();
        abstractC0802k.f8230i = Collections.EMPTY_LIST;
        abstractC0802k.h(this);
        return abstractC0802k;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        R3.r rVar = new R3.r(this);
        if ((this.f8233f & 1) == 1) {
            mVar.m(1, this.f8234g);
        }
        for (int i4 = 0; i4 < this.f8235h.size(); i4++) {
            mVar.o(2, (AbstractC0793b) this.f8235h.get(i4));
        }
        rVar.d0(200, mVar);
        mVar.r(this.f8232e);
    }

    public C0460v() {
        this.f8236i = (byte) -1;
        this.j = -1;
        this.f8232e = AbstractC0796e.f11223d;
    }

    public C0460v(C0797f c0797f, C0799h c0799h) {
        this.f8236i = (byte) -1;
        this.j = -1;
        boolean z8 = false;
        this.f8234g = 0;
        this.f8235h = Collections.EMPTY_LIST;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        char c6 = 0;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 == 8) {
                            this.f8233f |= 1;
                            this.f8234g = c0797f.k();
                        } else if (n3 != 18) {
                            if (!n(c0797f, j, c0799h, n3)) {
                            }
                        } else {
                            if ((c6 & 2) != 2) {
                                this.f8235h = new ArrayList();
                                c6 = 2;
                            }
                            this.f8235h.add(c0797f.g(C0447h.k, c0799h));
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
                if ((c6 & 2) == 2) {
                    this.f8235h = Collections.unmodifiableList(this.f8235h);
                }
                try {
                    j.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8232e = c0795d.e();
                    throw th2;
                }
                this.f8232e = c0795d.e();
                m();
                throw th;
            }
        }
        if ((c6 & 2) == 2) {
            this.f8235h = Collections.unmodifiableList(this.f8235h);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8232e = c0795d.e();
            throw th3;
        }
        this.f8232e = c0795d.e();
        m();
    }
}
