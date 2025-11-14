package i7;

import C6.F;
import C6.InterfaceC0001b;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import C6.InterfaceC0022x;
import C6.O;
import C6.T;
import F6.E;
import P6.s;
import a6.AbstractC0436k;
import java.util.Collection;
import n6.InterfaceC1164c;
import w7.J;
import x7.InterfaceC1821c;

/* renamed from: i7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888c implements InterfaceC1821c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0888c f11773a = new Object();

    public static /* synthetic */ void b(int i4) {
        Object[] objArr = new Object[3];
        if (i4 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static O e(InterfaceC0001b interfaceC0001b) {
        while (interfaceC0001b instanceof InterfaceC0002c) {
            InterfaceC0002c interfaceC0002c = (InterfaceC0002c) interfaceC0001b;
            if (interfaceC0002c.e() != 2) {
                break;
            }
            Collection s8 = interfaceC0002c.s();
            o6.j.d(s8, "getOverriddenDescriptors(...)");
            interfaceC0001b = (InterfaceC0002c) AbstractC0436k.H0(s8);
            if (interfaceC0001b == null) {
                return null;
            }
        }
        return interfaceC0001b.h();
    }

    @Override // x7.InterfaceC1821c
    public boolean a(J j, J j5) {
        if (j != null) {
            if (j5 != null) {
                return j.equals(j5);
            }
            b(1);
            throw null;
        }
        b(0);
        throw null;
    }

    public boolean c(InterfaceC0010k interfaceC0010k, InterfaceC0010k interfaceC0010k2, boolean z8) {
        boolean z9;
        if ((interfaceC0010k instanceof InterfaceC0004e) && (interfaceC0010k2 instanceof InterfaceC0004e)) {
            return o6.j.a(((InterfaceC0004e) interfaceC0010k).B(), ((InterfaceC0004e) interfaceC0010k2).B());
        }
        if ((interfaceC0010k instanceof T) && (interfaceC0010k2 instanceof T)) {
            return d((T) interfaceC0010k, (T) interfaceC0010k2, z8, C0886a.f11770d);
        }
        if ((interfaceC0010k instanceof InterfaceC0001b) && (interfaceC0010k2 instanceof InterfaceC0001b)) {
            InterfaceC0001b interfaceC0001b = (InterfaceC0001b) interfaceC0010k;
            InterfaceC0001b interfaceC0001b2 = (InterfaceC0001b) interfaceC0010k2;
            o6.j.e(interfaceC0001b, "a");
            o6.j.e(interfaceC0001b2, "b");
            if (!interfaceC0001b.equals(interfaceC0001b2)) {
                if (o6.j.a(interfaceC0001b.getName(), interfaceC0001b2.getName()) && ((!(interfaceC0001b instanceof InterfaceC0022x) || !(interfaceC0001b2 instanceof InterfaceC0022x) || ((InterfaceC0022x) interfaceC0001b).c0() == ((InterfaceC0022x) interfaceC0001b2).c0()) && ((!o6.j.a(interfaceC0001b.q(), interfaceC0001b2.q()) || (z8 && o6.j.a(e(interfaceC0001b), e(interfaceC0001b2)))) && !AbstractC0890e.n(interfaceC0001b) && !AbstractC0890e.n(interfaceC0001b2)))) {
                    InterfaceC0010k q6 = interfaceC0001b.q();
                    InterfaceC0010k q8 = interfaceC0001b2.q();
                    if (!(q6 instanceof InterfaceC0002c) && !(q8 instanceof InterfaceC0002c)) {
                        z9 = c(q6, q8, z8);
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        C0896k c0896k = new C0896k(new s(interfaceC0001b, interfaceC0001b2, z8));
                        if (c0896k.m(interfaceC0001b, interfaceC0001b2, null, true).b() != 1 || c0896k.m(interfaceC0001b2, interfaceC0001b, null, true).b() != 1) {
                        }
                    }
                }
                return false;
            }
            return true;
        }
        if ((interfaceC0010k instanceof F) && (interfaceC0010k2 instanceof F)) {
            return o6.j.a(((E) ((F) interfaceC0010k)).f1461i, ((E) ((F) interfaceC0010k2)).f1461i);
        }
        return o6.j.a(interfaceC0010k, interfaceC0010k2);
    }

    public boolean d(T t8, T t9, boolean z8, InterfaceC1164c interfaceC1164c) {
        boolean booleanValue;
        o6.j.e(t8, "a");
        o6.j.e(t9, "b");
        if (!t8.equals(t9)) {
            if (!o6.j.a(t8.q(), t9.q())) {
                InterfaceC0010k q6 = t8.q();
                InterfaceC0010k q8 = t9.q();
                if (!(q6 instanceof InterfaceC0002c) && !(q8 instanceof InterfaceC0002c)) {
                    booleanValue = c(q6, q8, z8);
                } else {
                    booleanValue = ((Boolean) interfaceC1164c.l(q6, q8)).booleanValue();
                }
                if (booleanValue && t8.getIndex() == t9.getIndex()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
