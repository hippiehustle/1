package m0;

import androidx.lifecycle.Z;
import g0.V;
import t.k;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1050a extends Z {

    /* renamed from: c, reason: collision with root package name */
    public static final V f12376c = new V(1);

    /* renamed from: b, reason: collision with root package name */
    public final k f12377b = new k(0);

    @Override // androidx.lifecycle.Z
    public final void d() {
        k kVar = this.f12377b;
        if (kVar.e() <= 0) {
            int i4 = kVar.f14674g;
            Object[] objArr = kVar.f14673f;
            for (int i8 = 0; i8 < i4; i8++) {
                objArr[i8] = null;
            }
            kVar.f14674g = 0;
            kVar.f14671d = false;
            return;
        }
        kVar.f(0).getClass();
        throw new ClassCastException();
    }
}
