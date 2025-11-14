package P0;

import N0.x;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements Q0.a, d {

    /* renamed from: a, reason: collision with root package name */
    public final x f4432a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0.e f4433b;

    /* renamed from: c, reason: collision with root package name */
    public U0.k f4434c;

    public r(x xVar, V0.b bVar, U0.j jVar) {
        this.f4432a = xVar;
        Q0.e r02 = jVar.f5985a.r0();
        this.f4433b = r02;
        bVar.d(r02);
        r02.a(this);
    }

    public static int d(int i4, int i8) {
        int i9 = i4 / i8;
        if ((i4 ^ i8) < 0 && i9 * i8 != i4) {
            i9--;
        }
        return i4 - (i9 * i8);
    }

    @Override // Q0.a
    public final void b() {
        this.f4432a.invalidateSelf();
    }

    @Override // P0.d
    public final void c(List list, List list2) {
    }
}
