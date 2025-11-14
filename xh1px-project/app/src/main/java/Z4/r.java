package Z4;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f7468a;

    /* renamed from: b, reason: collision with root package name */
    public final p f7469b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7470c;

    public r(q qVar, p pVar, ArrayList arrayList) {
        o6.j.e(qVar, "type");
        o6.j.e(pVar, "menuUiState");
        this.f7468a = qVar;
        this.f7469b = pVar;
        this.f7470c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (this.f7468a != rVar.f7468a || !o6.j.a(this.f7469b, rVar.f7469b) || !this.f7470c.equals(rVar.f7470c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7470c.hashCode() + ((this.f7469b.hashCode() + (this.f7468a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ScenarioListUiState(type=" + this.f7468a + ", menuUiState=" + this.f7469b + ", listContent=" + this.f7470c + ")";
    }
}
