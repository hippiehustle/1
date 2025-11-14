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

/* renamed from: a7.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455p extends g7.o {

    /* renamed from: h, reason: collision with root package name */
    public static final C0455p f8199h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0440a f8200i = new C0440a(6);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f8201d;

    /* renamed from: e, reason: collision with root package name */
    public List f8202e;

    /* renamed from: f, reason: collision with root package name */
    public byte f8203f;

    /* renamed from: g, reason: collision with root package name */
    public int f8204g;

    static {
        C0455p c0455p = new C0455p();
        f8199h = c0455p;
        c0455p.f8202e = Collections.EMPTY_LIST;
    }

    public C0455p() {
        this.f8203f = (byte) -1;
        this.f8204g = -1;
        this.f8201d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f8203f;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.f8202e.size(); i4++) {
            if (!((C0458t) this.f8202e.get(i4)).b()) {
                this.f8203f = (byte) 0;
                return false;
            }
        }
        this.f8203f = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4 = this.f8204g;
        if (i4 != -1) {
            return i4;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f8202e.size(); i9++) {
            i8 += L5.m.d(1, (AbstractC0793b) this.f8202e.get(i9));
        }
        int size = this.f8201d.size() + i8;
        this.f8204g = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        C0454o c0454o = new C0454o(0);
        c0454o.f8198g = Collections.EMPTY_LIST;
        return c0454o;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        C0454o c0454o = new C0454o(0);
        c0454o.f8198g = Collections.EMPTY_LIST;
        c0454o.j(this);
        return c0454o;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        for (int i4 = 0; i4 < this.f8202e.size(); i4++) {
            mVar.o(1, (AbstractC0793b) this.f8202e.get(i4));
        }
        mVar.r(this.f8201d);
    }

    public final C0454o i() {
        C0454o c0454o = new C0454o(0);
        c0454o.f8198g = Collections.EMPTY_LIST;
        c0454o.j(this);
        return c0454o;
    }

    public C0455p(C0454o c0454o) {
        this.f8203f = (byte) -1;
        this.f8204g = -1;
        this.f8201d = c0454o.f11240d;
    }

    public C0455p(C0797f c0797f, C0799h c0799h) {
        this.f8203f = (byte) -1;
        this.f8204g = -1;
        this.f8202e = Collections.EMPTY_LIST;
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
                                this.f8202e = new ArrayList();
                                z9 = true;
                            }
                            this.f8202e.add(c0797f.g(C0458t.f8221m, c0799h));
                        }
                    }
                    z8 = true;
                } catch (Throwable th) {
                    if (z9) {
                        this.f8202e = Collections.unmodifiableList(this.f8202e);
                    }
                    try {
                        j.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f8201d = c0795d.e();
                        throw th2;
                    }
                    this.f8201d = c0795d.e();
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
            this.f8202e = Collections.unmodifiableList(this.f8202e);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8201d = c0795d.e();
            throw th3;
        }
        this.f8201d = c0795d.e();
    }
}
