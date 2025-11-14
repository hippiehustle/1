package R3;

import android.text.InputFilter;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class z extends A {

    /* renamed from: a, reason: collision with root package name */
    public final D2.d f5115a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5116b;

    /* renamed from: c, reason: collision with root package name */
    public final InputFilter f5117c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5118d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5119e;

    public z(D2.d dVar, int i4, InputFilter inputFilter, String str, Object obj) {
        o6.j.e(dVar, "typeItem");
        o6.j.e(str, "valueStr");
        o6.j.e(obj, "value");
        this.f5115a = dVar;
        this.f5116b = i4;
        this.f5117c = inputFilter;
        this.f5118d = str;
        this.f5119e = obj;
    }

    @Override // R3.A
    public final D2.d a() {
        return this.f5115a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (o6.j.a(this.f5115a, zVar.f5115a) && this.f5116b == zVar.f5116b && o6.j.a(this.f5117c, zVar.f5117c) && o6.j.a(this.f5118d, zVar.f5118d) && o6.j.a(this.f5119e, zVar.f5119e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b4 = AbstractC1149a.b(this.f5116b, this.f5115a.hashCode() * 31, 31);
        InputFilter inputFilter = this.f5117c;
        if (inputFilter == null) {
            hashCode = 0;
        } else {
            hashCode = inputFilter.hashCode();
        }
        return this.f5119e.hashCode() + A.j.c(this.f5118d, (b4 + hashCode) * 31, 31);
    }

    public final String toString() {
        return "TextInputTypeSelected(typeItem=" + this.f5115a + ", inputType=" + this.f5116b + ", inputFilter=" + this.f5117c + ", valueStr=" + this.f5118d + ", value=" + this.f5119e + ")";
    }
}
