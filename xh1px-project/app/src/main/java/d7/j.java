package d7;

import L5.m;
import a7.C0440a;
import g7.AbstractC0793b;
import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import g7.C0799h;
import g7.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class j extends o {
    public static final j j;
    public static final C0440a k = new C0440a(28);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f10506d;

    /* renamed from: e, reason: collision with root package name */
    public List f10507e;

    /* renamed from: f, reason: collision with root package name */
    public List f10508f;

    /* renamed from: g, reason: collision with root package name */
    public int f10509g;

    /* renamed from: h, reason: collision with root package name */
    public byte f10510h;

    /* renamed from: i, reason: collision with root package name */
    public int f10511i;

    static {
        j jVar = new j();
        j = jVar;
        List list = Collections.EMPTY_LIST;
        jVar.f10507e = list;
        jVar.f10508f = list;
    }

    public j() {
        this.f10509g = -1;
        this.f10510h = (byte) -1;
        this.f10511i = -1;
        this.f10506d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        if (this.f10510h == 1) {
            return true;
        }
        this.f10510h = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4 = this.f10511i;
        if (i4 != -1) {
            return i4;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f10507e.size(); i9++) {
            i8 += m.d(1, (AbstractC0793b) this.f10507e.get(i9));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f10508f.size(); i11++) {
            i10 += m.c(((Integer) this.f10508f.get(i11)).intValue());
        }
        int i12 = i8 + i10;
        if (!this.f10508f.isEmpty()) {
            i12 = i12 + 1 + m.c(i10);
        }
        this.f10509g = i10;
        int size = this.f10506d.size() + i12;
        this.f10511i = size;
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.j, d7.f] */
    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        ?? abstractC0801j = new AbstractC0801j();
        List list = Collections.EMPTY_LIST;
        abstractC0801j.f10482f = list;
        abstractC0801j.f10483g = list;
        return abstractC0801j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.j, d7.f] */
    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        ?? abstractC0801j = new AbstractC0801j();
        List list = Collections.EMPTY_LIST;
        abstractC0801j.f10482f = list;
        abstractC0801j.f10483g = list;
        abstractC0801j.g(this);
        return abstractC0801j;
    }

    @Override // g7.AbstractC0793b
    public final void f(m mVar) {
        c();
        for (int i4 = 0; i4 < this.f10507e.size(); i4++) {
            mVar.o(1, (AbstractC0793b) this.f10507e.get(i4));
        }
        if (this.f10508f.size() > 0) {
            mVar.v(42);
            mVar.v(this.f10509g);
        }
        for (int i8 = 0; i8 < this.f10508f.size(); i8++) {
            mVar.n(((Integer) this.f10508f.get(i8)).intValue());
        }
        mVar.r(this.f10506d);
    }

    public j(f fVar) {
        this.f10509g = -1;
        this.f10510h = (byte) -1;
        this.f10511i = -1;
        this.f10506d = fVar.f11240d;
    }

    public j(C0797f c0797f, C0799h c0799h) {
        this.f10509g = -1;
        this.f10510h = (byte) -1;
        this.f10511i = -1;
        List list = Collections.EMPTY_LIST;
        this.f10507e = list;
        this.f10508f = list;
        C0795d c0795d = new C0795d();
        m j5 = m.j(c0795d, 1);
        boolean z8 = false;
        int i4 = 0;
        while (!z8) {
            try {
                try {
                    try {
                        int n3 = c0797f.n();
                        if (n3 != 0) {
                            if (n3 == 10) {
                                if ((i4 & 1) != 1) {
                                    this.f10507e = new ArrayList();
                                    i4 |= 1;
                                }
                                this.f10507e.add(c0797f.g(i.f10495q, c0799h));
                            } else if (n3 == 40) {
                                if ((i4 & 2) != 2) {
                                    this.f10508f = new ArrayList();
                                    i4 |= 2;
                                }
                                this.f10508f.add(Integer.valueOf(c0797f.k()));
                            } else if (n3 != 42) {
                                if (!c0797f.q(n3, j5)) {
                                }
                            } else {
                                int d2 = c0797f.d(c0797f.k());
                                if ((i4 & 2) != 2 && c0797f.b() > 0) {
                                    this.f10508f = new ArrayList();
                                    i4 |= 2;
                                }
                                while (c0797f.b() > 0) {
                                    this.f10508f.add(Integer.valueOf(c0797f.k()));
                                }
                                c0797f.c(d2);
                            }
                        }
                        z8 = true;
                    } catch (InvalidProtocolBufferException e9) {
                        e9.f12155d = this;
                        throw e9;
                    }
                } catch (IOException e10) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                    invalidProtocolBufferException.f12155d = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if ((i4 & 1) == 1) {
                    this.f10507e = Collections.unmodifiableList(this.f10507e);
                }
                if ((i4 & 2) == 2) {
                    this.f10508f = Collections.unmodifiableList(this.f10508f);
                }
                try {
                    j5.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f10506d = c0795d.e();
                    throw th2;
                }
                this.f10506d = c0795d.e();
                throw th;
            }
        }
        if ((i4 & 1) == 1) {
            this.f10507e = Collections.unmodifiableList(this.f10507e);
        }
        if ((i4 & 2) == 2) {
            this.f10508f = Collections.unmodifiableList(this.f10508f);
        }
        try {
            j5.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10506d = c0795d.e();
            throw th3;
        }
        this.f10506d = c0795d.e();
    }
}
