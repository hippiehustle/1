package F4;

import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final k f1384a;

    /* renamed from: b, reason: collision with root package name */
    public final G4.a f1385b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1386c;

    public h(k kVar, G4.a aVar, List list) {
        this.f1384a = kVar;
        this.f1385b = aVar;
        this.f1386c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (o6.j.a(this.f1384a, hVar.f1384a) && o6.j.a(this.f1385b, hVar.f1385b) && o6.j.a(this.f1386c, hVar.f1386c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1386c.hashCode() + ((this.f1385b.hashCode() + (this.f1384a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TutorialData(info=" + this.f1384a + ", game=" + this.f1385b + ", steps=" + this.f1386c + ")";
    }
}
