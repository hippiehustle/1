package P6;

import f7.C0725e;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final String f4519a;

    /* renamed from: b, reason: collision with root package name */
    public final C0725e f4520b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4521c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4522d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4523e;

    public B(String str, C0725e c0725e, String str2, String str3) {
        o6.j.e(str, "classInternalName");
        this.f4519a = str;
        this.f4520b = c0725e;
        this.f4521c = str2;
        this.f4522d = str3;
        String str4 = c0725e + '(' + str2 + ')' + str3;
        o6.j.e(str4, "jvmDescriptor");
        this.f4523e = str + '.' + str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b4 = (B) obj;
        if (o6.j.a(this.f4519a, b4.f4519a) && o6.j.a(this.f4520b, b4.f4520b) && o6.j.a(this.f4521c, b4.f4521c) && o6.j.a(this.f4522d, b4.f4522d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4522d.hashCode() + A.j.c(this.f4521c, (this.f4520b.hashCode() + (this.f4519a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.f4519a);
        sb.append(", name=");
        sb.append(this.f4520b);
        sb.append(", parameters=");
        sb.append(this.f4521c);
        sb.append(", returnType=");
        return A.j.q(sb, this.f4522d, ')');
    }
}
