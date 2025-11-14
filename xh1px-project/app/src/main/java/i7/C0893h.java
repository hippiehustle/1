package i7;

import C6.EnumC0005f;
import C6.InterfaceC0004e;
import C6.InterfaceC0009j;
import C6.InterfaceC0010k;
import C6.InterfaceC0019u;
import C6.M;
import C6.S;
import java.util.Comparator;
import m7.AbstractC1098d;

/* renamed from: i7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0893h implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final C0893h f11775b = new C0893h(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11776a;

    public /* synthetic */ C0893h(int i4) {
        this.f11776a = i4;
    }

    public static int a(InterfaceC0010k interfaceC0010k) {
        if (interfaceC0010k != null) {
            if (AbstractC0890e.m(interfaceC0010k, EnumC0005f.f744g)) {
                return 8;
            }
            if (interfaceC0010k instanceof InterfaceC0009j) {
                return 7;
            }
            if (interfaceC0010k instanceof M) {
                if (((M) interfaceC0010k).M() == null) {
                    return 6;
                }
                return 5;
            }
            if (interfaceC0010k instanceof InterfaceC0019u) {
                if (((InterfaceC0019u) interfaceC0010k).M() == null) {
                    return 4;
                }
                return 3;
            }
            if (interfaceC0010k instanceof InterfaceC0004e) {
                return 2;
            }
            if (interfaceC0010k instanceof S) {
                return 1;
            }
            return 0;
        }
        AbstractC0890e.a(36);
        throw null;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num;
        switch (this.f11776a) {
            case 0:
                InterfaceC0010k interfaceC0010k = (InterfaceC0010k) obj;
                InterfaceC0010k interfaceC0010k2 = (InterfaceC0010k) obj2;
                int a3 = a(interfaceC0010k2) - a(interfaceC0010k);
                if (a3 != 0) {
                    num = Integer.valueOf(a3);
                } else {
                    EnumC0005f enumC0005f = EnumC0005f.f744g;
                    if (AbstractC0890e.m(interfaceC0010k, enumC0005f) && AbstractC0890e.m(interfaceC0010k2, enumC0005f)) {
                        num = 0;
                    } else {
                        int compareTo = interfaceC0010k.getName().f10804d.compareTo(interfaceC0010k2.getName().f10804d);
                        if (compareTo != 0) {
                            num = Integer.valueOf(compareTo);
                        } else {
                            num = null;
                        }
                    }
                }
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            default:
                return E2.c.N(AbstractC1098d.g((InterfaceC0004e) obj).f10797a.f10800a, AbstractC1098d.g((InterfaceC0004e) obj2).f10797a.f10800a);
        }
    }
}
