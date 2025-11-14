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

/* renamed from: a7.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453n extends AbstractC0803l {

    /* renamed from: n, reason: collision with root package name */
    public static final C0453n f8187n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0440a f8188o = new C0440a(5);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0796e f8189e;

    /* renamed from: f, reason: collision with root package name */
    public int f8190f;

    /* renamed from: g, reason: collision with root package name */
    public int f8191g;

    /* renamed from: h, reason: collision with root package name */
    public List f8192h;

    /* renamed from: i, reason: collision with root package name */
    public List f8193i;
    public List j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public byte f8194l;

    /* renamed from: m, reason: collision with root package name */
    public int f8195m;

    static {
        C0453n c0453n = new C0453n();
        f8187n = c0453n;
        c0453n.f8191g = 6;
        List list = Collections.EMPTY_LIST;
        c0453n.f8192h = list;
        c0453n.f8193i = list;
        c0453n.j = list;
        c0453n.k = list;
    }

    public C0453n(C0452m c0452m) {
        super(c0452m);
        this.f8194l = (byte) -1;
        this.f8195m = -1;
        this.f8189e = c0452m.f11240d;
    }

    @Override // g7.u
    public final AbstractC0793b a() {
        return f8187n;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f8194l;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        for (int i4 = 0; i4 < this.f8192h.size(); i4++) {
            if (!((b0) this.f8192h.get(i4)).b()) {
                this.f8194l = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.j.size(); i8++) {
            if (!((C0451l) this.j.get(i8)).b()) {
                this.f8194l = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.k.size(); i9++) {
            if (!((C0447h) this.k.get(i9)).b()) {
                this.f8194l = (byte) 0;
                return false;
            }
        }
        if (!i()) {
            this.f8194l = (byte) 0;
            return false;
        }
        this.f8194l = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f8195m;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f8190f & 1) == 1) {
            i4 = L5.m.b(1, this.f8191g);
        } else {
            i4 = 0;
        }
        for (int i9 = 0; i9 < this.f8192h.size(); i9++) {
            i4 += L5.m.d(2, (AbstractC0793b) this.f8192h.get(i9));
        }
        for (int i10 = 0; i10 < this.k.size(); i10++) {
            i4 += L5.m.d(3, (AbstractC0793b) this.k.get(i10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f8193i.size(); i12++) {
            i11 += L5.m.c(((Integer) this.f8193i.get(i12)).intValue());
        }
        int size = (this.f8193i.size() * 2) + i4 + i11;
        for (int i13 = 0; i13 < this.j.size(); i13++) {
            size += L5.m.d(32, (AbstractC0793b) this.j.get(i13));
        }
        int size2 = this.f8189e.size() + j() + size;
        this.f8195m = size2;
        return size2;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return C0452m.h();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        C0452m h8 = C0452m.h();
        h8.i(this);
        return h8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        R3.r rVar = new R3.r(this);
        if ((this.f8190f & 1) == 1) {
            mVar.m(1, this.f8191g);
        }
        for (int i4 = 0; i4 < this.f8192h.size(); i4++) {
            mVar.o(2, (AbstractC0793b) this.f8192h.get(i4));
        }
        for (int i8 = 0; i8 < this.k.size(); i8++) {
            mVar.o(3, (AbstractC0793b) this.k.get(i8));
        }
        for (int i9 = 0; i9 < this.f8193i.size(); i9++) {
            mVar.m(31, ((Integer) this.f8193i.get(i9)).intValue());
        }
        for (int i10 = 0; i10 < this.j.size(); i10++) {
            mVar.o(32, (AbstractC0793b) this.j.get(i10));
        }
        rVar.d0(19000, mVar);
        mVar.r(this.f8189e);
    }

    public C0453n() {
        this.f8194l = (byte) -1;
        this.f8195m = -1;
        this.f8189e = AbstractC0796e.f11223d;
    }

    public C0453n(C0797f c0797f, C0799h c0799h) {
        this.f8194l = (byte) -1;
        this.f8195m = -1;
        this.f8191g = 6;
        List list = Collections.EMPTY_LIST;
        this.f8192h = list;
        this.f8193i = list;
        this.j = list;
        this.k = list;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        boolean z8 = false;
        int i4 = 0;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 == 8) {
                            this.f8190f |= 1;
                            this.f8191g = c0797f.k();
                        } else if (n3 == 18) {
                            if ((i4 & 2) != 2) {
                                this.f8192h = new ArrayList();
                                i4 |= 2;
                            }
                            this.f8192h.add(c0797f.g(b0.f8013r, c0799h));
                        } else if (n3 == 26) {
                            if ((i4 & 16) != 16) {
                                this.k = new ArrayList();
                                i4 |= 16;
                            }
                            this.k.add(c0797f.g(C0447h.k, c0799h));
                        } else if (n3 == 248) {
                            if ((i4 & 4) != 4) {
                                this.f8193i = new ArrayList();
                                i4 |= 4;
                            }
                            this.f8193i.add(Integer.valueOf(c0797f.k()));
                        } else if (n3 == 250) {
                            int d2 = c0797f.d(c0797f.k());
                            if ((i4 & 4) != 4 && c0797f.b() > 0) {
                                this.f8193i = new ArrayList();
                                i4 |= 4;
                            }
                            while (c0797f.b() > 0) {
                                this.f8193i.add(Integer.valueOf(c0797f.k()));
                            }
                            c0797f.c(d2);
                        } else if (n3 != 258) {
                            if (!n(c0797f, j, c0799h, n3)) {
                            }
                        } else {
                            if ((i4 & 8) != 8) {
                                this.j = new ArrayList();
                                i4 |= 8;
                            }
                            this.j.add(c0797f.g(C0451l.k, c0799h));
                        }
                    }
                    z8 = true;
                } catch (Throwable th) {
                    if ((i4 & 2) == 2) {
                        this.f8192h = Collections.unmodifiableList(this.f8192h);
                    }
                    if ((i4 & 16) == 16) {
                        this.k = Collections.unmodifiableList(this.k);
                    }
                    if ((i4 & 4) == 4) {
                        this.f8193i = Collections.unmodifiableList(this.f8193i);
                    }
                    if ((i4 & 8) == 8) {
                        this.j = Collections.unmodifiableList(this.j);
                    }
                    try {
                        j.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f8189e = c0795d.e();
                        throw th2;
                    }
                    this.f8189e = c0795d.e();
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
        if ((i4 & 2) == 2) {
            this.f8192h = Collections.unmodifiableList(this.f8192h);
        }
        if ((i4 & 16) == 16) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if ((i4 & 4) == 4) {
            this.f8193i = Collections.unmodifiableList(this.f8193i);
        }
        if ((i4 & 8) == 8) {
            this.j = Collections.unmodifiableList(this.j);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8189e = c0795d.e();
            throw th3;
        }
        this.f8189e = c0795d.e();
        m();
    }
}
