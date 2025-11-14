package U6;

import java.util.Set;
import o6.j;
import w7.S;
import w7.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final S f6170a;

    /* renamed from: b, reason: collision with root package name */
    public final b f6171b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6172c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6173d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f6174e;

    /* renamed from: f, reason: collision with root package name */
    public final z f6175f;

    public a(S s8, b bVar, boolean z8, boolean z9, Set set, z zVar) {
        this.f6170a = s8;
        this.f6171b = bVar;
        this.f6172c = z8;
        this.f6173d = z9;
        this.f6174e = set;
        this.f6175f = zVar;
    }

    public static a a(a aVar, b bVar, boolean z8, Set set, z zVar, int i4) {
        S s8 = aVar.f6170a;
        if ((i4 & 2) != 0) {
            bVar = aVar.f6171b;
        }
        b bVar2 = bVar;
        if ((i4 & 4) != 0) {
            z8 = aVar.f6172c;
        }
        boolean z9 = z8;
        boolean z10 = aVar.f6173d;
        if ((i4 & 16) != 0) {
            set = aVar.f6174e;
        }
        Set set2 = set;
        if ((i4 & 32) != 0) {
            zVar = aVar.f6175f;
        }
        aVar.getClass();
        j.e(s8, "howThisTypeIsUsed");
        j.e(bVar2, "flexibility");
        return new a(s8, bVar2, z9, z10, set2, zVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!j.a(aVar.f6175f, this.f6175f) || aVar.f6170a != this.f6170a || aVar.f6171b != this.f6171b || aVar.f6172c != this.f6172c || aVar.f6173d != this.f6173d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        z zVar = this.f6175f;
        if (zVar != null) {
            i4 = zVar.hashCode();
        } else {
            i4 = 0;
        }
        int hashCode = this.f6170a.hashCode() + (i4 * 31) + i4;
        int hashCode2 = this.f6171b.hashCode() + (hashCode * 31) + hashCode;
        int i8 = (hashCode2 * 31) + (this.f6172c ? 1 : 0) + hashCode2;
        return (i8 * 31) + (this.f6173d ? 1 : 0) + i8;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f6170a + ", flexibility=" + this.f6171b + ", isRaw=" + this.f6172c + ", isForAnnotationParameter=" + this.f6173d + ", visitedTypeParameters=" + this.f6174e + ", defaultType=" + this.f6175f + ')';
    }

    public /* synthetic */ a(S s8, boolean z8, boolean z9, Set set, int i4) {
        this(s8, b.f6176d, (i4 & 4) != 0 ? false : z8, (i4 & 8) != 0 ? false : z9, (i4 & 16) != 0 ? null : set, null);
    }
}
