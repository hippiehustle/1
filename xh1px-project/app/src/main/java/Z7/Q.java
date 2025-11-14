package Z7;

import a6.AbstractC0436k;
import h4.AbstractC0832f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.MissingFieldException;
import n1.AbstractC1149a;
import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final X7.f[] f7562a = new X7.f[0];

    /* renamed from: b, reason: collision with root package name */
    public static final V7.a[] f7563b = new V7.a[0];

    public static final A a(String str, V7.a aVar) {
        return new A(str, new B(aVar));
    }

    public static final Set b(X7.f fVar) {
        o6.j.e(fVar, "<this>");
        if (fVar instanceof InterfaceC0389j) {
            return ((InterfaceC0389j) fVar).f();
        }
        HashSet hashSet = new HashSet(fVar.c());
        int c6 = fVar.c();
        for (int i4 = 0; i4 < c6; i4++) {
            hashSet.add(fVar.d(i4));
        }
        return hashSet;
    }

    public static final X7.f[] c(List list) {
        X7.f[] fVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list != null && (fVarArr = (X7.f[]) list.toArray(new X7.f[0])) != null) {
            return fVarArr;
        }
        return f7562a;
    }

    public static final C0400v d(String str, Enum[] enumArr) {
        o6.j.e(enumArr, "values");
        return new C0400v(str, enumArr);
    }

    public static final int e(X7.f fVar, X7.f[] fVarArr) {
        boolean z8;
        boolean z9;
        int i4;
        o6.j.e(fVarArr, "typeParams");
        int hashCode = (fVar.b().hashCode() * 31) + Arrays.hashCode(fVarArr);
        int c6 = fVar.c();
        int i8 = 1;
        while (true) {
            int i9 = 0;
            if (c6 > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                break;
            }
            int i10 = c6 - 1;
            int i11 = i8 * 31;
            String b4 = fVar.j(fVar.c() - c6).b();
            if (b4 != null) {
                i9 = b4.hashCode();
            }
            i8 = i11 + i9;
            c6 = i10;
        }
        int c9 = fVar.c();
        int i12 = 1;
        while (true) {
            if (c9 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                int i13 = c9 - 1;
                int i14 = i12 * 31;
                q4.X e9 = fVar.j(fVar.c() - c9).e();
                if (e9 != null) {
                    i4 = e9.hashCode();
                } else {
                    i4 = 0;
                }
                i12 = i14 + i4;
                c9 = i13;
            } else {
                return (((hashCode * 31) + i8) * 31) + i12;
            }
        }
    }

    public static final void f(int i4, int i8, X7.f fVar) {
        o6.j.e(fVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i9 = (~i4) & i8;
        for (int i10 = 0; i10 < 32; i10++) {
            if ((i9 & 1) != 0) {
                arrayList.add(fVar.d(i10));
            }
            i9 >>>= 1;
        }
        throw new MissingFieldException(arrayList, fVar.b());
    }

    public static final void g(String str, InterfaceC1642c interfaceC1642c) {
        String sb;
        o6.j.e(interfaceC1642c, "baseClass");
        String str2 = "in the polymorphic scope of '" + interfaceC1642c.c() + '\'';
        if (str == null) {
            sb = "Class discriminator was missing and no default serializers were registered " + str2 + '.';
        } else {
            StringBuilder sb2 = new StringBuilder("Serializer for subclass '");
            sb2.append(str);
            sb2.append("' is not found ");
            sb2.append(str2);
            sb2.append(".\nCheck if class with serial name '");
            AbstractC1149a.m(sb2, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sb2.append(interfaceC1642c.c());
            sb2.append("' has to be sealed and '@Serializable'.");
            sb = sb2.toString();
        }
        throw new IllegalArgumentException(sb);
    }

    public static final String h(X7.f fVar) {
        return AbstractC0436k.v0(AbstractC0832f.G(0, fVar.c()), ", ", fVar.b() + '(', ")", new A1.h(17, fVar), 24);
    }
}
