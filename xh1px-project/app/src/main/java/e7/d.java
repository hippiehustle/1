package e7;

import o6.j;

/* loaded from: classes.dex */
public final class d extends E2.d {

    /* renamed from: e, reason: collision with root package name */
    public final String f10663e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10664f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2) {
        super(27);
        j.e(str, "name");
        j.e(str2, "desc");
        this.f10663e = str;
        this.f10664f = str2;
    }

    @Override // E2.d
    public final String e() {
        return this.f10663e + ':' + this.f10664f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j.a(this.f10663e, dVar.f10663e) && j.a(this.f10664f, dVar.f10664f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10664f.hashCode() + (this.f10663e.hashCode() * 31);
    }
}
