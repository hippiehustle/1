package V4;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final t f6425a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6426b;

    public u(t tVar, boolean z8) {
        o6.j.e(tVar, "selectedItem");
        this.f6425a = tVar;
        this.f6426b = z8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u) {
                u uVar = (u) obj;
                uVar.getClass();
                r rVar = r.f6420i;
                if (rVar.equals(rVar)) {
                    s sVar = s.f6421i;
                    if (!sVar.equals(sVar) || this.f6425a != uVar.f6425a || this.f6426b != uVar.f6426b) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6426b) + ((this.f6425a.hashCode() - 1844082185) * 31);
    }

    public final String toString() {
        return "ScenarioTypeSelectionState(dumbItem=" + r.f6420i + ", smartItem=" + s.f6421i + ", selectedItem=" + this.f6425a + ", showPaidLimitationWarning=" + this.f6426b + ")";
    }
}
