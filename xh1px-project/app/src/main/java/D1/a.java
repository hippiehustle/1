package D1;

import w1.e;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final e f855a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f856b;

    public a(e eVar, boolean z8) {
        this.f855a = eVar;
        this.f856b = z8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f855a.equals(aVar.f855a) || this.f856b != aVar.f856b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f856b) + (this.f855a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigateTo(overlay=" + this.f855a + ", hideCurrent=" + this.f856b + ")";
    }
}
