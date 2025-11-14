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

/* renamed from: a7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447h extends g7.o {
    public static final C0447h j;
    public static final C0440a k = new C0440a(0);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f8103d;

    /* renamed from: e, reason: collision with root package name */
    public int f8104e;

    /* renamed from: f, reason: collision with root package name */
    public int f8105f;

    /* renamed from: g, reason: collision with root package name */
    public List f8106g;

    /* renamed from: h, reason: collision with root package name */
    public byte f8107h;

    /* renamed from: i, reason: collision with root package name */
    public int f8108i;

    static {
        C0447h c0447h = new C0447h();
        j = c0447h;
        c0447h.f8105f = 0;
        c0447h.f8106g = Collections.EMPTY_LIST;
    }

    public C0447h() {
        this.f8107h = (byte) -1;
        this.f8108i = -1;
        this.f8103d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f8107h;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f8104e & 1) == 1) {
            for (int i4 = 0; i4 < this.f8106g.size(); i4++) {
                if (!((C0445f) this.f8106g.get(i4)).b()) {
                    this.f8107h = (byte) 0;
                    return false;
                }
            }
            this.f8107h = (byte) 1;
            return true;
        }
        this.f8107h = (byte) 0;
        return false;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f8108i;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f8104e & 1) == 1) {
            i4 = L5.m.b(1, this.f8105f);
        } else {
            i4 = 0;
        }
        for (int i9 = 0; i9 < this.f8106g.size(); i9++) {
            i4 += L5.m.d(2, (AbstractC0793b) this.f8106g.get(i9));
        }
        int size = this.f8103d.size() + i4;
        this.f8108i = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        C0446g c0446g = new C0446g(0);
        c0446g.f8095g = Collections.EMPTY_LIST;
        return c0446g;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        C0446g c0446g = new C0446g(0);
        c0446g.f8095g = Collections.EMPTY_LIST;
        c0446g.i(this);
        return c0446g;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        if ((this.f8104e & 1) == 1) {
            mVar.m(1, this.f8105f);
        }
        for (int i4 = 0; i4 < this.f8106g.size(); i4++) {
            mVar.o(2, (AbstractC0793b) this.f8106g.get(i4));
        }
        mVar.r(this.f8103d);
    }

    public C0447h(C0446g c0446g) {
        this.f8107h = (byte) -1;
        this.f8108i = -1;
        this.f8103d = c0446g.f11240d;
    }

    public C0447h(C0797f c0797f, C0799h c0799h) {
        this.f8107h = (byte) -1;
        this.f8108i = -1;
        boolean z8 = false;
        this.f8105f = 0;
        this.f8106g = Collections.EMPTY_LIST;
        C0795d c0795d = new C0795d();
        L5.m j5 = L5.m.j(c0795d, 1);
        char c6 = 0;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 == 8) {
                            this.f8104e |= 1;
                            this.f8105f = c0797f.k();
                        } else if (n3 != 18) {
                            if (!c0797f.q(n3, j5)) {
                            }
                        } else {
                            if ((c6 & 2) != 2) {
                                this.f8106g = new ArrayList();
                                c6 = 2;
                            }
                            this.f8106g.add(c0797f.g(C0445f.k, c0799h));
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
                    this.f8106g = Collections.unmodifiableList(this.f8106g);
                }
                try {
                    j5.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8103d = c0795d.e();
                    throw th2;
                }
                this.f8103d = c0795d.e();
                throw th;
            }
        }
        if ((c6 & 2) == 2) {
            this.f8106g = Collections.unmodifiableList(this.f8106g);
        }
        try {
            j5.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8103d = c0795d.e();
            throw th3;
        }
        this.f8103d = c0795d.e();
    }
}
