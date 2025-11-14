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

/* renamed from: a7.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463y extends g7.o {

    /* renamed from: o, reason: collision with root package name */
    public static final C0463y f8248o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0440a f8249p = new C0440a(9);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f8250d;

    /* renamed from: e, reason: collision with root package name */
    public int f8251e;

    /* renamed from: f, reason: collision with root package name */
    public int f8252f;

    /* renamed from: g, reason: collision with root package name */
    public int f8253g;

    /* renamed from: h, reason: collision with root package name */
    public EnumC0462x f8254h;

    /* renamed from: i, reason: collision with root package name */
    public T f8255i;
    public int j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public List f8256l;

    /* renamed from: m, reason: collision with root package name */
    public byte f8257m;

    /* renamed from: n, reason: collision with root package name */
    public int f8258n;

    static {
        C0463y c0463y = new C0463y();
        f8248o = c0463y;
        c0463y.f8252f = 0;
        c0463y.f8253g = 0;
        c0463y.f8254h = EnumC0462x.TRUE;
        c0463y.f8255i = T.f7932w;
        c0463y.j = 0;
        List list = Collections.EMPTY_LIST;
        c0463y.k = list;
        c0463y.f8256l = list;
    }

    public C0463y() {
        this.f8257m = (byte) -1;
        this.f8258n = -1;
        this.f8250d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        byte b4 = this.f8257m;
        if (b4 == 1) {
            return true;
        }
        if (b4 == 0) {
            return false;
        }
        if ((this.f8251e & 8) == 8 && !this.f8255i.b()) {
            this.f8257m = (byte) 0;
            return false;
        }
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            if (!((C0463y) this.k.get(i4)).b()) {
                this.f8257m = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f8256l.size(); i8++) {
            if (!((C0463y) this.f8256l.get(i8)).b()) {
                this.f8257m = (byte) 0;
                return false;
            }
        }
        this.f8257m = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        int i8 = this.f8258n;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f8251e & 1) == 1) {
            i4 = L5.m.b(1, this.f8252f);
        } else {
            i4 = 0;
        }
        if ((this.f8251e & 2) == 2) {
            i4 += L5.m.b(2, this.f8253g);
        }
        if ((this.f8251e & 4) == 4) {
            i4 += L5.m.a(3, this.f8254h.f8247d);
        }
        if ((this.f8251e & 8) == 8) {
            i4 += L5.m.d(4, this.f8255i);
        }
        if ((this.f8251e & 16) == 16) {
            i4 += L5.m.b(5, this.j);
        }
        for (int i9 = 0; i9 < this.k.size(); i9++) {
            i4 += L5.m.d(6, (AbstractC0793b) this.k.get(i9));
        }
        for (int i10 = 0; i10 < this.f8256l.size(); i10++) {
            i4 += L5.m.d(7, (AbstractC0793b) this.f8256l.get(i10));
        }
        int size = this.f8250d.size() + i4;
        this.f8258n = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return C0461w.g();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        C0461w g8 = C0461w.g();
        g8.h(this);
        return g8;
    }

    @Override // g7.AbstractC0793b
    public final void f(L5.m mVar) {
        c();
        if ((this.f8251e & 1) == 1) {
            mVar.m(1, this.f8252f);
        }
        if ((this.f8251e & 2) == 2) {
            mVar.m(2, this.f8253g);
        }
        if ((this.f8251e & 4) == 4) {
            mVar.l(3, this.f8254h.f8247d);
        }
        if ((this.f8251e & 8) == 8) {
            mVar.o(4, this.f8255i);
        }
        if ((this.f8251e & 16) == 16) {
            mVar.m(5, this.j);
        }
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            mVar.o(6, (AbstractC0793b) this.k.get(i4));
        }
        for (int i8 = 0; i8 < this.f8256l.size(); i8++) {
            mVar.o(7, (AbstractC0793b) this.f8256l.get(i8));
        }
        mVar.r(this.f8250d);
    }

    public C0463y(C0461w c0461w) {
        this.f8257m = (byte) -1;
        this.f8258n = -1;
        this.f8250d = c0461w.f11240d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public C0463y(C0797f c0797f, C0799h c0799h) {
        EnumC0462x enumC0462x;
        this.f8257m = (byte) -1;
        this.f8258n = -1;
        boolean z8 = false;
        this.f8252f = 0;
        this.f8253g = 0;
        EnumC0462x enumC0462x2 = EnumC0462x.TRUE;
        this.f8254h = enumC0462x2;
        this.f8255i = T.f7932w;
        this.j = 0;
        List list = Collections.EMPTY_LIST;
        this.k = list;
        this.f8256l = list;
        C0795d c0795d = new C0795d();
        L5.m j = L5.m.j(c0795d, 1);
        char c6 = 0;
        while (!z8) {
            try {
                try {
                    try {
                        int n3 = c0797f.n();
                        if (n3 != 0) {
                            if (n3 == 8) {
                                this.f8251e |= 1;
                                this.f8252f = c0797f.k();
                            } else if (n3 != 16) {
                                S s8 = null;
                                EnumC0462x enumC0462x3 = null;
                                if (n3 == 24) {
                                    int k = c0797f.k();
                                    if (k != 0) {
                                        if (k == 1) {
                                            enumC0462x3 = EnumC0462x.FALSE;
                                        } else if (k == 2) {
                                            enumC0462x3 = EnumC0462x.NULL;
                                        }
                                        enumC0462x = enumC0462x3;
                                    } else {
                                        enumC0462x = enumC0462x2;
                                    }
                                    if (enumC0462x == null) {
                                        j.v(n3);
                                        j.v(k);
                                    } else {
                                        this.f8251e |= 4;
                                        this.f8254h = enumC0462x;
                                    }
                                } else if (n3 == 34) {
                                    if ((this.f8251e & 8) == 8) {
                                        T t8 = this.f8255i;
                                        t8.getClass();
                                        s8 = T.r(t8);
                                    }
                                    S s9 = s8;
                                    T t9 = (T) c0797f.g(T.f7933x, c0799h);
                                    this.f8255i = t9;
                                    if (s9 != null) {
                                        s9.i(t9);
                                        this.f8255i = s9.g();
                                    }
                                    this.f8251e |= 8;
                                } else if (n3 != 40) {
                                    C0440a c0440a = f8249p;
                                    if (n3 == 50) {
                                        int i4 = (c6 == true ? 1 : 0) & 32;
                                        c6 = c6;
                                        if (i4 != 32) {
                                            this.k = new ArrayList();
                                            c6 = (c6 == true ? 1 : 0) | ' ';
                                        }
                                        this.k.add(c0797f.g(c0440a, c0799h));
                                    } else if (n3 != 58) {
                                        if (!c0797f.q(n3, j)) {
                                        }
                                    } else {
                                        int i8 = (c6 == true ? 1 : 0) & 64;
                                        c6 = c6;
                                        if (i8 != 64) {
                                            this.f8256l = new ArrayList();
                                            c6 = (c6 == true ? 1 : 0) | '@';
                                        }
                                        this.f8256l.add(c0797f.g(c0440a, c0799h));
                                    }
                                } else {
                                    this.f8251e |= 16;
                                    this.j = c0797f.k();
                                }
                            } else {
                                this.f8251e |= 2;
                                this.f8253g = c0797f.k();
                            }
                        }
                        z8 = true;
                    } catch (IOException e9) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e9.getMessage());
                        invalidProtocolBufferException.f12155d = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    e10.f12155d = this;
                    throw e10;
                }
            } catch (Throwable th) {
                if (((c6 == true ? 1 : 0) & 32) == 32) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if (((c6 == true ? 1 : 0) & 64) == 64) {
                    this.f8256l = Collections.unmodifiableList(this.f8256l);
                }
                try {
                    j.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f8250d = c0795d.e();
                    throw th2;
                }
                this.f8250d = c0795d.e();
                throw th;
            }
        }
        if (((c6 == true ? 1 : 0) & 32) == 32) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if (((c6 == true ? 1 : 0) & 64) == 64) {
            this.f8256l = Collections.unmodifiableList(this.f8256l);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f8250d = c0795d.e();
            throw th3;
        }
        this.f8250d = c0795d.e();
    }
}
