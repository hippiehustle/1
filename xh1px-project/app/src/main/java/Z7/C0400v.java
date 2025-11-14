package Z7;

import a6.AbstractC0434i;
import java.util.Arrays;

/* renamed from: Z7.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400v implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f7648a;

    /* renamed from: b, reason: collision with root package name */
    public final Z5.n f7649b;

    public C0400v(String str, Enum[] enumArr) {
        o6.j.e(enumArr, "values");
        this.f7648a = enumArr;
        this.f7649b = new Z5.n(new A1.n(this, 13, str));
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        int m6 = bVar.m(d());
        Enum[] enumArr = this.f7648a;
        if (m6 >= 0 && m6 < enumArr.length) {
            return enumArr[m6];
        }
        throw new IllegalArgumentException(m6 + " is not among valid " + d().b() + " enum values, values size is " + enumArr.length);
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        Enum r52 = (Enum) obj;
        o6.j.e(r52, "value");
        Enum[] enumArr = this.f7648a;
        int Z02 = AbstractC0434i.Z0(r52, enumArr);
        if (Z02 != -1) {
            X7.f d2 = d();
            cVar.getClass();
            o6.j.e(d2, "enumDescriptor");
            cVar.t(d2.d(Z02));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r52);
        sb.append(" is not a valid enum ");
        sb.append(d().b());
        sb.append(", must be one of ");
        String arrays = Arrays.toString(enumArr);
        o6.j.d(arrays, "toString(...)");
        sb.append(arrays);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // V7.a
    public final X7.f d() {
        return (X7.f) this.f7649b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + d().b() + '>';
    }
}
