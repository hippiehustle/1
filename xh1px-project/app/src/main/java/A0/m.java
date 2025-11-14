package A0;

import I7.o;
import a6.AbstractC0436k;
import a6.s;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f230a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f231b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f232c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f233d;

    public m(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        o6.j.e(abstractSet, "foreignKeys");
        this.f230a = str;
        this.f231b = map;
        this.f232c = abstractSet;
        this.f233d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (!this.f230a.equals(mVar.f230a) || !this.f231b.equals(mVar.f231b) || !o6.j.a(this.f232c, mVar.f232c)) {
                    return false;
                }
                Set set2 = this.f233d;
                if (set2 != null && (set = mVar.f233d) != null) {
                    return set2.equals(set);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f232c.hashCode() + ((this.f231b.hashCode() + (this.f230a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    public final String toString() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f230a);
        sb.append("',\n            |    columns = {");
        sb.append(E2.b.s(AbstractC0436k.L0(this.f231b.values(), new i(2))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(E2.b.s(this.f232c));
        sb.append("\n            |    indices = {");
        Set set = this.f233d;
        if (set != null) {
            collection = AbstractC0436k.L0(set, new i(3));
        } else {
            collection = s.f7766d;
        }
        sb.append(E2.b.s(collection));
        sb.append("\n            |}\n        ");
        return o.R(sb.toString());
    }
}
