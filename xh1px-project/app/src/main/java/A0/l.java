package A0;

import I7.o;
import I7.v;
import Z5.y;
import a6.AbstractC0436k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f226a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f227b;

    /* renamed from: c, reason: collision with root package name */
    public final List f228c;

    /* renamed from: d, reason: collision with root package name */
    public final List f229d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public l(String str, boolean z8, List list, List list2) {
        o6.j.e(str, "name");
        this.f226a = str;
        this.f227b = z8;
        this.f228c = list;
        this.f229d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                list2.add("ASC");
            }
        }
        this.f229d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            boolean z8 = lVar.f227b;
            String str = lVar.f226a;
            if (this.f227b != z8 || !this.f228c.equals(lVar.f228c) || !o6.j.a(this.f229d, lVar.f229d)) {
                return false;
            }
            String str2 = this.f226a;
            if (v.a0(str2, "index_")) {
                return v.a0(str, "index_");
            }
            return str2.equals(str);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f226a;
        if (v.a0(str, "index_")) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.f229d.hashCode() + ((this.f228c.hashCode() + (((hashCode * 31) + (this.f227b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.f226a);
        sb.append("',\n            |   unique = '");
        sb.append(this.f227b);
        sb.append("',\n            |   columns = {");
        o.P(AbstractC0436k.v0(this.f228c, ",", null, null, null, 62));
        o.P("},");
        y yVar = y.f7506a;
        sb.append(yVar);
        sb.append("\n            |   orders = {");
        o.P(AbstractC0436k.v0(this.f229d, ",", null, null, null, 62));
        o.P(" }");
        sb.append(yVar);
        sb.append("\n            |}\n        ");
        return o.P(o.R(sb.toString()));
    }
}
