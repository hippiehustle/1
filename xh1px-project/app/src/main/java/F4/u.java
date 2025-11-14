package F4;

import a.AbstractC0405a;

/* loaded from: classes.dex */
public final class u extends v {

    /* renamed from: a, reason: collision with root package name */
    public final int f1428a;

    /* renamed from: b, reason: collision with root package name */
    public final w f1429b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0405a f1430c;

    /* renamed from: d, reason: collision with root package name */
    public final E2.d f1431d;

    public u(int i4, w wVar, AbstractC0405a abstractC0405a, E2.d dVar) {
        this.f1428a = i4;
        this.f1429b = wVar;
        this.f1430c = abstractC0405a;
        this.f1431d = dVar;
    }

    @Override // F4.v
    public final AbstractC0405a a() {
        return this.f1430c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u) {
                u uVar = (u) obj;
                if (this.f1428a != uVar.f1428a || !o6.j.a(this.f1429b, uVar.f1429b) || !o6.j.a(this.f1430c, uVar.f1430c) || !o6.j.a(this.f1431d, uVar.f1431d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f1428a) * 31;
        w wVar = this.f1429b;
        if (wVar == null) {
            hashCode = 0;
        } else {
            hashCode = wVar.hashCode();
        }
        return this.f1431d.hashCode() + ((this.f1430c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31);
    }

    public final String toString() {
        return "TutorialOverlay(contentTextResId=" + this.f1428a + ", image=" + this.f1429b + ", stepStartCondition=" + this.f1430c + ", stepEndCondition=" + this.f1431d + ")";
    }
}
