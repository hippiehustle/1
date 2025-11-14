package d6;

import L7.C0159q;
import java.io.Serializable;
import n6.InterfaceC1164c;

/* renamed from: d6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616b implements InterfaceC0622h, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0622h f10445d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0620f f10446e;

    public C0616b(InterfaceC0620f interfaceC0620f, InterfaceC0622h interfaceC0622h) {
        o6.j.e(interfaceC0622h, "left");
        o6.j.e(interfaceC0620f, "element");
        this.f10445d = interfaceC0622h;
        this.f10446e = interfaceC0620f;
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0620f B(InterfaceC0621g interfaceC0621g) {
        o6.j.e(interfaceC0621g, "key");
        C0616b c0616b = this;
        while (true) {
            InterfaceC0620f B8 = c0616b.f10446e.B(interfaceC0621g);
            if (B8 != null) {
                return B8;
            }
            InterfaceC0622h interfaceC0622h = c0616b.f10445d;
            if (interfaceC0622h instanceof C0616b) {
                c0616b = (C0616b) interfaceC0622h;
            } else {
                return interfaceC0622h.B(interfaceC0621g);
            }
        }
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h D(InterfaceC0622h interfaceC0622h) {
        o6.j.e(interfaceC0622h, "context");
        if (interfaceC0622h == C0623i.f10448d) {
            return this;
        }
        return (InterfaceC0622h) interfaceC0622h.n(this, new C0159q(8));
    }

    public final boolean equals(Object obj) {
        boolean z8;
        if (this != obj) {
            if (obj instanceof C0616b) {
                C0616b c0616b = (C0616b) obj;
                c0616b.getClass();
                int i4 = 2;
                C0616b c0616b2 = c0616b;
                int i8 = 2;
                while (true) {
                    InterfaceC0622h interfaceC0622h = c0616b2.f10445d;
                    if (interfaceC0622h instanceof C0616b) {
                        c0616b2 = (C0616b) interfaceC0622h;
                    } else {
                        c0616b2 = null;
                    }
                    if (c0616b2 == null) {
                        break;
                    }
                    i8++;
                }
                C0616b c0616b3 = this;
                while (true) {
                    InterfaceC0622h interfaceC0622h2 = c0616b3.f10445d;
                    if (interfaceC0622h2 instanceof C0616b) {
                        c0616b3 = (C0616b) interfaceC0622h2;
                    } else {
                        c0616b3 = null;
                    }
                    if (c0616b3 == null) {
                        break;
                    }
                    i4++;
                }
                if (i8 == i4) {
                    C0616b c0616b4 = this;
                    while (true) {
                        InterfaceC0620f interfaceC0620f = c0616b4.f10446e;
                        if (!o6.j.a(c0616b.B(interfaceC0620f.getKey()), interfaceC0620f)) {
                            z8 = false;
                            break;
                        }
                        InterfaceC0622h interfaceC0622h3 = c0616b4.f10445d;
                        if (interfaceC0622h3 instanceof C0616b) {
                            c0616b4 = (C0616b) interfaceC0622h3;
                        } else {
                            o6.j.c(interfaceC0622h3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            InterfaceC0620f interfaceC0620f2 = (InterfaceC0620f) interfaceC0622h3;
                            z8 = o6.j.a(c0616b.B(interfaceC0620f2.getKey()), interfaceC0620f2);
                            break;
                        }
                    }
                    if (z8) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10446e.hashCode() + this.f10445d.hashCode();
    }

    @Override // d6.InterfaceC0622h
    public final Object n(Object obj, InterfaceC1164c interfaceC1164c) {
        return interfaceC1164c.l(this.f10445d.n(obj, interfaceC1164c), this.f10446e);
    }

    public final String toString() {
        return A.j.q(new StringBuilder("["), (String) n("", new C0159q(7)), ']');
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h y(InterfaceC0621g interfaceC0621g) {
        o6.j.e(interfaceC0621g, "key");
        InterfaceC0620f interfaceC0620f = this.f10446e;
        InterfaceC0620f B8 = interfaceC0620f.B(interfaceC0621g);
        InterfaceC0622h interfaceC0622h = this.f10445d;
        if (B8 != null) {
            return interfaceC0622h;
        }
        InterfaceC0622h y4 = interfaceC0622h.y(interfaceC0621g);
        if (y4 == interfaceC0622h) {
            return this;
        }
        if (y4 == C0623i.f10448d) {
            return interfaceC0620f;
        }
        return new C0616b(interfaceC0620f, y4);
    }
}
