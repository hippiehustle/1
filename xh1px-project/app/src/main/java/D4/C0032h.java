package D4;

import java.util.List;

/* renamed from: D4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032h {

    /* renamed from: a, reason: collision with root package name */
    public final String f959a;

    /* renamed from: b, reason: collision with root package name */
    public final List f960b;

    public C0032h(String str, List list) {
        o6.j.e(str, "resultText");
        o6.j.e(list, "detectionResults");
        this.f959a = str;
        this.f960b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0032h)) {
            return false;
        }
        C0032h c0032h = (C0032h) obj;
        if (o6.j.a(this.f959a, c0032h.f959a) && o6.j.a(this.f960b, c0032h.f960b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f960b.hashCode() + (this.f959a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageEventResultsDisplay(resultText=" + this.f959a + ", detectionResults=" + this.f960b + ")";
    }
}
