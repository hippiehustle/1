package e7;

import o6.j;

/* loaded from: classes.dex */
public final class e extends E2.d {

    /* renamed from: e, reason: collision with root package name */
    public final String f10665e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10666f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2) {
        super(27);
        j.e(str, "name");
        j.e(str2, "desc");
        this.f10665e = str;
        this.f10666f = str2;
    }

    @Override // E2.d
    public final String e() {
        return this.f10665e + this.f10666f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.f10665e, eVar.f10665e) && j.a(this.f10666f, eVar.f10666f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10666f.hashCode() + (this.f10665e.hashCode() * 31);
    }
}
