package A0;

import I7.o;
import Z5.y;
import a6.AbstractC0436k;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f221a;

    /* renamed from: b, reason: collision with root package name */
    public final String f222b;

    /* renamed from: c, reason: collision with root package name */
    public final String f223c;

    /* renamed from: d, reason: collision with root package name */
    public final List f224d;

    /* renamed from: e, reason: collision with root package name */
    public final List f225e;

    public k(String str, String str2, String str3, List list, List list2) {
        o6.j.e(str, "referenceTable");
        o6.j.e(str2, "onDelete");
        o6.j.e(str3, "onUpdate");
        this.f221a = str;
        this.f222b = str2;
        this.f223c = str3;
        this.f224d = list;
        this.f225e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (!o6.j.a(this.f221a, kVar.f221a) || !o6.j.a(this.f222b, kVar.f222b) || !o6.j.a(this.f223c, kVar.f223c) || !o6.j.a(this.f224d, kVar.f224d)) {
                return false;
            }
            return o6.j.a(this.f225e, kVar.f225e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f225e.hashCode() + ((this.f224d.hashCode() + A.j.c(this.f223c, A.j.c(this.f222b, this.f221a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.f221a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.f222b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.f223c);
        sb.append("',\n            |   columnNames = {");
        o.P(AbstractC0436k.v0(AbstractC0436k.K0(this.f224d), ",", null, null, null, 62));
        o.P("},");
        y yVar = y.f7506a;
        sb.append(yVar);
        sb.append("\n            |   referenceColumnNames = {");
        o.P(AbstractC0436k.v0(AbstractC0436k.K0(this.f225e), ",", null, null, null, 62));
        o.P(" }");
        sb.append(yVar);
        sb.append("\n            |}\n        ");
        return o.P(o.R(sb.toString()));
    }
}
