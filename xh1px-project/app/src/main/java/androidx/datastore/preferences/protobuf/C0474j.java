package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474j {

    /* renamed from: a, reason: collision with root package name */
    public final b8.c f8701a;

    /* renamed from: b, reason: collision with root package name */
    public int f8702b;

    /* renamed from: c, reason: collision with root package name */
    public int f8703c;

    /* renamed from: d, reason: collision with root package name */
    public int f8704d = 0;

    public C0474j(b8.c cVar) {
        Charset charset = AbstractC0486w.f8742a;
        this.f8701a = cVar;
        cVar.f9255a = this;
    }

    public final int a() {
        int i4 = this.f8704d;
        if (i4 != 0) {
            this.f8702b = i4;
            this.f8704d = 0;
        } else {
            this.f8702b = this.f8701a.u();
        }
        int i8 = this.f8702b;
        if (i8 != 0 && i8 != this.f8703c) {
            return i8 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public final void b(Object obj, S s8, C0477m c0477m) {
        int i4 = this.f8703c;
        this.f8703c = ((this.f8702b >>> 3) << 3) | 4;
        try {
            s8.g(obj, this, c0477m);
            if (this.f8702b == this.f8703c) {
            } else {
                throw new IOException("Failed to parse the message.");
            }
        } finally {
            this.f8703c = i4;
        }
    }

    public final void c(Object obj, S s8, C0477m c0477m) {
        b8.c cVar = this.f8701a;
        int v8 = cVar.v();
        if (cVar.f9256b < 100) {
            int e9 = cVar.e(v8);
            cVar.f9256b++;
            s8.g(obj, this, c0477m);
            cVar.a(0);
            cVar.f9256b--;
            cVar.d(e9);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public final void d(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 0) {
            if (i4 == 2) {
                int b4 = cVar.b() + cVar.v();
                do {
                    ((P) interfaceC0485v).add(Boolean.valueOf(cVar.f()));
                } while (cVar.b() < b4);
                v(b4);
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((P) interfaceC0485v).add(Boolean.valueOf(cVar.f()));
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final C0471g e() {
        w(2);
        return this.f8701a.g();
    }

    public final void f(InterfaceC0485v interfaceC0485v) {
        int u8;
        if ((this.f8702b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((P) interfaceC0485v).add(e());
            b8.c cVar = this.f8701a;
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final void g(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 1) {
            if (i4 == 2) {
                int v8 = cVar.v();
                if ((v8 & 7) == 0) {
                    int b4 = cVar.b() + v8;
                    do {
                        ((P) interfaceC0485v).add(Double.valueOf(cVar.h()));
                    } while (cVar.b() < b4);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((P) interfaceC0485v).add(Double.valueOf(cVar.h()));
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final void h(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 0) {
            if (i4 == 2) {
                int b4 = cVar.b() + cVar.v();
                do {
                    ((P) interfaceC0485v).add(Integer.valueOf(cVar.i()));
                } while (cVar.b() < b4);
                v(b4);
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((P) interfaceC0485v).add(Integer.valueOf(cVar.i()));
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final Object i(n0 n0Var, Class cls, C0477m c0477m) {
        int ordinal = n0Var.ordinal();
        b8.c cVar = this.f8701a;
        switch (ordinal) {
            case 0:
                w(1);
                return Double.valueOf(cVar.h());
            case 1:
                w(5);
                return Float.valueOf(cVar.l());
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                w(0);
                return Long.valueOf(cVar.n());
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                w(0);
                return Long.valueOf(cVar.w());
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                w(0);
                return Integer.valueOf(cVar.m());
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                w(1);
                return Long.valueOf(cVar.k());
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                w(5);
                return Integer.valueOf(cVar.j());
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                w(0);
                return Boolean.valueOf(cVar.f());
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                w(2);
                return cVar.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                S a3 = O.f8627c.a(cls);
                AbstractC0484u i4 = a3.i();
                c(i4, a3, c0477m);
                a3.d(i4);
                return i4;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(cVar.v());
            case 13:
                w(0);
                return Integer.valueOf(cVar.i());
            case 14:
                w(5);
                return Integer.valueOf(cVar.o());
            case 15:
                w(1);
                return Long.valueOf(cVar.p());
            case 16:
                w(0);
                return Integer.valueOf(cVar.q());
            case 17:
                w(0);
                return Long.valueOf(cVar.r());
        }
    }

    public final void j(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 2) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                ((P) interfaceC0485v).add(Integer.valueOf(cVar.j()));
                if (!cVar.c()) {
                    u8 = cVar.u();
                } else {
                    return;
                }
            } while (u8 == this.f8702b);
            this.f8704d = u8;
            return;
        }
        int v8 = cVar.v();
        if ((v8 & 3) == 0) {
            int b4 = cVar.b() + v8;
            do {
                ((P) interfaceC0485v).add(Integer.valueOf(cVar.j()));
            } while (cVar.b() < b4);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public final void k(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 1) {
            if (i4 == 2) {
                int v8 = cVar.v();
                if ((v8 & 7) == 0) {
                    int b4 = cVar.b() + v8;
                    do {
                        ((P) interfaceC0485v).add(Long.valueOf(cVar.k()));
                    } while (cVar.b() < b4);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((P) interfaceC0485v).add(Long.valueOf(cVar.k()));
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final void l(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 2) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                ((P) interfaceC0485v).add(Float.valueOf(cVar.l()));
                if (!cVar.c()) {
                    u8 = cVar.u();
                } else {
                    return;
                }
            } while (u8 == this.f8702b);
            this.f8704d = u8;
            return;
        }
        int v8 = cVar.v();
        if ((v8 & 3) == 0) {
            int b4 = cVar.b() + v8;
            do {
                ((P) interfaceC0485v).add(Float.valueOf(cVar.l()));
            } while (cVar.b() < b4);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public final void m(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 0) {
            if (i4 == 2) {
                int b4 = cVar.b() + cVar.v();
                do {
                    ((P) interfaceC0485v).add(Integer.valueOf(cVar.m()));
                } while (cVar.b() < b4);
                v(b4);
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((P) interfaceC0485v).add(Integer.valueOf(cVar.m()));
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final void n(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 0) {
            if (i4 == 2) {
                int b4 = cVar.b() + cVar.v();
                do {
                    ((P) interfaceC0485v).add(Long.valueOf(cVar.n()));
                } while (cVar.b() < b4);
                v(b4);
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((P) interfaceC0485v).add(Long.valueOf(cVar.n()));
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final void o(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 2) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            do {
                ((P) interfaceC0485v).add(Integer.valueOf(cVar.o()));
                if (!cVar.c()) {
                    u8 = cVar.u();
                } else {
                    return;
                }
            } while (u8 == this.f8702b);
            this.f8704d = u8;
            return;
        }
        int v8 = cVar.v();
        if ((v8 & 3) == 0) {
            int b4 = cVar.b() + v8;
            do {
                ((P) interfaceC0485v).add(Integer.valueOf(cVar.o()));
            } while (cVar.b() < b4);
            return;
        }
        throw new IOException("Failed to parse the message.");
    }

    public final void p(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 1) {
            if (i4 == 2) {
                int v8 = cVar.v();
                if ((v8 & 7) == 0) {
                    int b4 = cVar.b() + v8;
                    do {
                        ((P) interfaceC0485v).add(Long.valueOf(cVar.p()));
                    } while (cVar.b() < b4);
                    return;
                }
                throw new IOException("Failed to parse the message.");
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((P) interfaceC0485v).add(Long.valueOf(cVar.p()));
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final void q(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 0) {
            if (i4 == 2) {
                int b4 = cVar.b() + cVar.v();
                do {
                    ((P) interfaceC0485v).add(Integer.valueOf(cVar.q()));
                } while (cVar.b() < b4);
                v(b4);
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((P) interfaceC0485v).add(Integer.valueOf(cVar.q()));
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final void r(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 0) {
            if (i4 == 2) {
                int b4 = cVar.b() + cVar.v();
                do {
                    ((P) interfaceC0485v).add(Long.valueOf(cVar.r()));
                } while (cVar.b() < b4);
                v(b4);
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((P) interfaceC0485v).add(Long.valueOf(cVar.r()));
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final void s(InterfaceC0485v interfaceC0485v, boolean z8) {
        String s8;
        int u8;
        if ((this.f8702b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            b8.c cVar = this.f8701a;
            if (z8) {
                w(2);
                s8 = cVar.t();
            } else {
                w(2);
                s8 = cVar.s();
            }
            ((P) interfaceC0485v).add(s8);
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final void t(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 0) {
            if (i4 == 2) {
                int b4 = cVar.b() + cVar.v();
                do {
                    ((P) interfaceC0485v).add(Integer.valueOf(cVar.v()));
                } while (cVar.b() < b4);
                v(b4);
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((P) interfaceC0485v).add(Integer.valueOf(cVar.v()));
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final void u(InterfaceC0485v interfaceC0485v) {
        int u8;
        int i4 = this.f8702b & 7;
        b8.c cVar = this.f8701a;
        if (i4 != 0) {
            if (i4 == 2) {
                int b4 = cVar.b() + cVar.v();
                do {
                    ((P) interfaceC0485v).add(Long.valueOf(cVar.w()));
                } while (cVar.b() < b4);
                v(b4);
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((P) interfaceC0485v).add(Long.valueOf(cVar.w()));
            if (cVar.c()) {
                return;
            } else {
                u8 = cVar.u();
            }
        } while (u8 == this.f8702b);
        this.f8704d = u8;
    }

    public final void v(int i4) {
        if (this.f8701a.b() == i4) {
        } else {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void w(int i4) {
        if ((this.f8702b & 7) == i4) {
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean x() {
        int i4;
        b8.c cVar = this.f8701a;
        if (!cVar.c() && (i4 = this.f8702b) != this.f8703c) {
            return cVar.x(i4);
        }
        return false;
    }
}
