package d7;

import L5.m;
import a7.C0440a;
import g7.AbstractC0796e;
import g7.AbstractC0801j;
import g7.C0795d;
import g7.C0797f;
import g7.o;
import g7.t;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: p, reason: collision with root package name */
    public static final i f10494p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0440a f10495q = new C0440a(29);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0796e f10496d;

    /* renamed from: e, reason: collision with root package name */
    public int f10497e;

    /* renamed from: f, reason: collision with root package name */
    public int f10498f;

    /* renamed from: g, reason: collision with root package name */
    public int f10499g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10500h;

    /* renamed from: i, reason: collision with root package name */
    public h f10501i;
    public List j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public List f10502l;

    /* renamed from: m, reason: collision with root package name */
    public int f10503m;

    /* renamed from: n, reason: collision with root package name */
    public byte f10504n;

    /* renamed from: o, reason: collision with root package name */
    public int f10505o;

    static {
        i iVar = new i();
        f10494p = iVar;
        iVar.f10498f = 1;
        iVar.f10499g = 0;
        iVar.f10500h = "";
        iVar.f10501i = h.NONE;
        List list = Collections.EMPTY_LIST;
        iVar.j = list;
        iVar.f10502l = list;
    }

    public i() {
        this.k = -1;
        this.f10503m = -1;
        this.f10504n = (byte) -1;
        this.f10505o = -1;
        this.f10496d = AbstractC0796e.f11223d;
    }

    @Override // g7.u
    public final boolean b() {
        if (this.f10504n == 1) {
            return true;
        }
        this.f10504n = (byte) 1;
        return true;
    }

    @Override // g7.AbstractC0793b
    public final int c() {
        int i4;
        AbstractC0796e abstractC0796e;
        int i8 = this.f10505o;
        if (i8 != -1) {
            return i8;
        }
        if ((this.f10497e & 1) == 1) {
            i4 = m.b(1, this.f10498f);
        } else {
            i4 = 0;
        }
        if ((this.f10497e & 2) == 2) {
            i4 += m.b(2, this.f10499g);
        }
        if ((this.f10497e & 8) == 8) {
            i4 += m.a(3, this.f10501i.f10493d);
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.j.size(); i10++) {
            i9 += m.c(((Integer) this.j.get(i10)).intValue());
        }
        int i11 = i4 + i9;
        if (!this.j.isEmpty()) {
            i11 = i11 + 1 + m.c(i9);
        }
        this.k = i9;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f10502l.size(); i13++) {
            i12 += m.c(((Integer) this.f10502l.get(i13)).intValue());
        }
        int i14 = i11 + i12;
        if (!this.f10502l.isEmpty()) {
            i14 = i14 + 1 + m.c(i12);
        }
        this.f10503m = i12;
        if ((this.f10497e & 4) == 4) {
            Object obj = this.f10500h;
            if (obj instanceof String) {
                try {
                    abstractC0796e = new t(((String) obj).getBytes("UTF-8"));
                    this.f10500h = abstractC0796e;
                } catch (UnsupportedEncodingException e9) {
                    throw new RuntimeException("UTF-8 not supported?", e9);
                }
            } else {
                abstractC0796e = (AbstractC0796e) obj;
            }
            i14 += abstractC0796e.size() + m.f(abstractC0796e.size()) + m.h(6);
        }
        int size = this.f10496d.size() + i14;
        this.f10505o = size;
        return size;
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j d() {
        return g.g();
    }

    @Override // g7.AbstractC0793b
    public final AbstractC0801j e() {
        g g8 = g.g();
        g8.h(this);
        return g8;
    }

    @Override // g7.AbstractC0793b
    public final void f(m mVar) {
        AbstractC0796e abstractC0796e;
        c();
        if ((this.f10497e & 1) == 1) {
            mVar.m(1, this.f10498f);
        }
        if ((this.f10497e & 2) == 2) {
            mVar.m(2, this.f10499g);
        }
        if ((this.f10497e & 8) == 8) {
            mVar.l(3, this.f10501i.f10493d);
        }
        if (this.j.size() > 0) {
            mVar.v(34);
            mVar.v(this.k);
        }
        for (int i4 = 0; i4 < this.j.size(); i4++) {
            mVar.n(((Integer) this.j.get(i4)).intValue());
        }
        if (this.f10502l.size() > 0) {
            mVar.v(42);
            mVar.v(this.f10503m);
        }
        for (int i8 = 0; i8 < this.f10502l.size(); i8++) {
            mVar.n(((Integer) this.f10502l.get(i8)).intValue());
        }
        if ((this.f10497e & 4) == 4) {
            Object obj = this.f10500h;
            if (obj instanceof String) {
                try {
                    abstractC0796e = new t(((String) obj).getBytes("UTF-8"));
                    this.f10500h = abstractC0796e;
                } catch (UnsupportedEncodingException e9) {
                    throw new RuntimeException("UTF-8 not supported?", e9);
                }
            } else {
                abstractC0796e = (AbstractC0796e) obj;
            }
            mVar.x(6, 2);
            mVar.v(abstractC0796e.size());
            mVar.r(abstractC0796e);
        }
        mVar.r(this.f10496d);
    }

    public i(g gVar) {
        this.k = -1;
        this.f10503m = -1;
        this.f10504n = (byte) -1;
        this.f10505o = -1;
        this.f10496d = gVar.f11240d;
    }

    public i(C0797f c0797f) {
        h hVar;
        this.k = -1;
        this.f10503m = -1;
        this.f10504n = (byte) -1;
        this.f10505o = -1;
        this.f10498f = 1;
        boolean z8 = false;
        this.f10499g = 0;
        this.f10500h = "";
        h hVar2 = h.NONE;
        this.f10501i = hVar2;
        List list = Collections.EMPTY_LIST;
        this.j = list;
        this.f10502l = list;
        C0795d c0795d = new C0795d();
        m j = m.j(c0795d, 1);
        int i4 = 0;
        while (!z8) {
            try {
                try {
                    int n3 = c0797f.n();
                    if (n3 != 0) {
                        if (n3 == 8) {
                            this.f10497e |= 1;
                            this.f10498f = c0797f.k();
                        } else if (n3 == 16) {
                            this.f10497e |= 2;
                            this.f10499g = c0797f.k();
                        } else if (n3 == 24) {
                            int k = c0797f.k();
                            if (k == 0) {
                                hVar = hVar2;
                            } else if (k != 1) {
                                hVar = k != 2 ? null : h.DESC_TO_CLASS_ID;
                            } else {
                                hVar = h.INTERNAL_TO_CLASS_ID;
                            }
                            if (hVar == null) {
                                j.v(n3);
                                j.v(k);
                            } else {
                                this.f10497e |= 8;
                                this.f10501i = hVar;
                            }
                        } else if (n3 == 32) {
                            if ((i4 & 16) != 16) {
                                this.j = new ArrayList();
                                i4 |= 16;
                            }
                            this.j.add(Integer.valueOf(c0797f.k()));
                        } else if (n3 == 34) {
                            int d2 = c0797f.d(c0797f.k());
                            if ((i4 & 16) != 16 && c0797f.b() > 0) {
                                this.j = new ArrayList();
                                i4 |= 16;
                            }
                            while (c0797f.b() > 0) {
                                this.j.add(Integer.valueOf(c0797f.k()));
                            }
                            c0797f.c(d2);
                        } else if (n3 == 40) {
                            if ((i4 & 32) != 32) {
                                this.f10502l = new ArrayList();
                                i4 |= 32;
                            }
                            this.f10502l.add(Integer.valueOf(c0797f.k()));
                        } else if (n3 == 42) {
                            int d3 = c0797f.d(c0797f.k());
                            if ((i4 & 32) != 32 && c0797f.b() > 0) {
                                this.f10502l = new ArrayList();
                                i4 |= 32;
                            }
                            while (c0797f.b() > 0) {
                                this.f10502l.add(Integer.valueOf(c0797f.k()));
                            }
                            c0797f.c(d3);
                        } else if (n3 != 50) {
                            if (!c0797f.q(n3, j)) {
                            }
                        } else {
                            t e9 = c0797f.e();
                            this.f10497e |= 4;
                            this.f10500h = e9;
                        }
                    }
                    z8 = true;
                } catch (Throwable th) {
                    if ((i4 & 16) == 16) {
                        this.j = Collections.unmodifiableList(this.j);
                    }
                    if ((i4 & 32) == 32) {
                        this.f10502l = Collections.unmodifiableList(this.f10502l);
                    }
                    try {
                        j.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f10496d = c0795d.e();
                        throw th2;
                    }
                    this.f10496d = c0795d.e();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.f12155d = this;
                throw e10;
            } catch (IOException e11) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                invalidProtocolBufferException.f12155d = this;
                throw invalidProtocolBufferException;
            }
        }
        if ((i4 & 16) == 16) {
            this.j = Collections.unmodifiableList(this.j);
        }
        if ((i4 & 32) == 32) {
            this.f10502l = Collections.unmodifiableList(this.f10502l);
        }
        try {
            j.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f10496d = c0795d.e();
            throw th3;
        }
        this.f10496d = c0795d.e();
    }
}
