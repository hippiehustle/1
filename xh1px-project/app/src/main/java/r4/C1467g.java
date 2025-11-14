package r4;

import g4.C0779a;
import java.util.ArrayList;

/* renamed from: r4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467g extends AbstractC1469i {

    /* renamed from: a, reason: collision with root package name */
    public final String f14395a;

    /* renamed from: b, reason: collision with root package name */
    public final C0779a f14396b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f14397c;

    public C1467g(String str, C0779a c0779a, ArrayList arrayList) {
        o6.j.e(str, "name");
        this.f14395a = str;
        this.f14396b = c0779a;
        this.f14397c = arrayList;
    }

    @Override // r4.AbstractC1469i
    public final String a() {
        return this.f14395a;
    }

    @Override // r4.AbstractC1469i
    public final E2.d b() {
        return this.f14396b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1467g) {
                C1467g c1467g = (C1467g) obj;
                if (!o6.j.a(this.f14395a, c1467g.f14395a) || !this.f14396b.equals(c1467g.f14396b) || !this.f14397c.equals(c1467g.f14397c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14397c.hashCode() + ((this.f14396b.hashCode() + (this.f14395a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Image(name=" + this.f14395a + ", uiEvent=" + this.f14396b + ", actionsIcons=" + this.f14397c + ")";
    }
}
