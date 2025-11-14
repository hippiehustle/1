package T3;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final v f5708a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5709b;

    public I(v vVar, String str) {
        o6.j.e(str, "messageContent");
        this.f5708a = vVar;
        this.f5709b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i4 = (I) obj;
        if (o6.j.a(this.f5708a, i4.f5708a) && o6.j.a(this.f5709b, i4.f5709b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5709b.hashCode() + (this.f5708a.hashCode() * 31);
    }

    public final String toString() {
        return "UiNotificationMessage(typeItem=" + this.f5708a + ", messageContent=" + this.f5709b + ")";
    }
}
