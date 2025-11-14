package n0;

import android.os.Bundle;

/* renamed from: n0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1142t implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1143u f12805d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f12806e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12807f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12808g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12809h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12810i;

    public C1142t(AbstractC1143u abstractC1143u, Bundle bundle, boolean z8, int i4, boolean z9, int i8) {
        this.f12805d = abstractC1143u;
        this.f12806e = bundle;
        this.f12807f = z8;
        this.f12808g = i4;
        this.f12809h = z9;
        this.f12810i = i8;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1142t c1142t) {
        o6.j.e(c1142t, "other");
        boolean z8 = c1142t.f12809h;
        boolean z9 = c1142t.f12807f;
        Bundle bundle = c1142t.f12806e;
        boolean z10 = this.f12807f;
        if (z10 && !z9) {
            return 1;
        }
        if (!z10 && z9) {
            return -1;
        }
        int i4 = this.f12808g - c1142t.f12808g;
        if (i4 > 0) {
            return 1;
        }
        if (i4 < 0) {
            return -1;
        }
        Bundle bundle2 = this.f12806e;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            o6.j.e(bundle2, "source");
            int size = bundle2.size();
            o6.j.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z11 = this.f12809h;
        if (z11 && !z8) {
            return 1;
        }
        if (!z11 && z8) {
            return -1;
        }
        return this.f12810i - c1142t.f12810i;
    }
}
