package w6;

import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import L7.C0165x;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import n6.InterfaceC1162a;
import t6.C1586a;
import t6.C1588c;
import x6.C1795C;
import x6.C1796D;
import x6.InterfaceC1803g;

/* loaded from: classes.dex */
public final class U implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15820d;

    /* renamed from: e, reason: collision with root package name */
    public final W f15821e;

    public /* synthetic */ U(W w8, int i4) {
        this.f15820d = i4;
        this.f15821e = w8;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [t6.a, t6.c] */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        V v8;
        List J02;
        switch (this.f15820d) {
            case 0:
                return y0.d(this.f15821e.a());
            default:
                W w8 = this.f15821e;
                C6.K a3 = w8.a();
                int i4 = w8.f15826b;
                AbstractC1731s abstractC1731s = w8.f15825a;
                if ((a3 instanceof F6.w) && o6.j.a(y0.g(abstractC1731s.o()), a3) && abstractC1731s.o().e() == 2) {
                    InterfaceC0010k q6 = abstractC1731s.o().q();
                    o6.j.c(q6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class k = y0.k((InterfaceC0004e) q6);
                    if (k == null) {
                        throw new C0165x("Cannot determine receiver Java type of inherited declaration: " + a3);
                    }
                    return k;
                }
                InterfaceC1803g h8 = abstractC1731s.h();
                if (h8 instanceof C1796D) {
                    if (abstractC1731s.t()) {
                        C1796D c1796d = (C1796D) h8;
                        C1588c e9 = c1796d.e(i4 + 1);
                        int i8 = c1796d.e(0).f15124e + 1;
                        J02 = AbstractC0436k.J0(c1796d.f16235b.a(), new C1586a(e9.f15123d - i8, e9.f15124e - i8, 1));
                    } else {
                        C1796D c1796d2 = (C1796D) h8;
                        J02 = AbstractC0436k.J0(c1796d2.f16235b.a(), c1796d2.e(i4));
                    }
                    Type[] typeArr = (Type[]) J02.toArray(new Type[0]);
                    Type[] typeArr2 = (Type[]) Arrays.copyOf(typeArr, typeArr.length);
                    int length = typeArr2.length;
                    if (length != 0) {
                        if (length != 1) {
                            v8 = new V(typeArr2);
                        } else {
                            return (Type) AbstractC0434i.d1(typeArr2);
                        }
                    } else {
                        throw new Error("Expected at least 1 type for compound type");
                    }
                } else if (h8 instanceof C1795C) {
                    Class[] clsArr = (Class[]) ((Collection) ((C1795C) h8).f16232d.get(i4)).toArray(new Class[0]);
                    Type[] typeArr3 = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length2 = typeArr3.length;
                    if (length2 != 0) {
                        if (length2 != 1) {
                            v8 = new V(typeArr3);
                        } else {
                            return (Type) AbstractC0434i.d1(typeArr3);
                        }
                    } else {
                        throw new Error("Expected at least 1 type for compound type");
                    }
                } else {
                    return (Type) h8.a().get(i4);
                }
                return v8;
        }
    }
}
