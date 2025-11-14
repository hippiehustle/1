package U0;

import N0.C0202j;
import N0.x;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5995a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5996b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5997c;

    public m(String str, List list, boolean z8) {
        this.f5995a = str;
        this.f5996b = list;
        this.f5997c = z8;
    }

    @Override // U0.b
    public final P0.d a(x xVar, C0202j c0202j, V0.b bVar) {
        return new P0.e(xVar, bVar, this, c0202j);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f5995a + "' Shapes: " + Arrays.toString(this.f5996b.toArray()) + '}';
    }
}
