package W;

import Q.g;
import android.graphics.Rect;
import java.util.Comparator;
import t7.C1594d;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f6454a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f6455b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6456c;

    /* renamed from: d, reason: collision with root package name */
    public final C1594d f6457d;

    public c(boolean z8, C1594d c1594d) {
        this.f6456c = z8;
        this.f6457d = c1594d;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f6457d.getClass();
        Rect rect = this.f6454a;
        ((g) obj).f(rect);
        Rect rect2 = this.f6455b;
        ((g) obj2).f(rect2);
        int i4 = rect.top;
        int i8 = rect2.top;
        if (i4 >= i8) {
            if (i4 <= i8) {
                int i9 = rect.left;
                int i10 = rect2.left;
                boolean z8 = this.f6456c;
                if (i9 < i10) {
                    if (!z8) {
                        return -1;
                    }
                    return 1;
                }
                if (i9 > i10) {
                    if (z8) {
                        return -1;
                    }
                    return 1;
                }
                int i11 = rect.bottom;
                int i12 = rect2.bottom;
                if (i11 >= i12) {
                    if (i11 <= i12) {
                        int i13 = rect.right;
                        int i14 = rect2.right;
                        if (i13 < i14) {
                            if (!z8) {
                                return -1;
                            }
                            return 1;
                        }
                        if (i13 > i14) {
                            if (z8) {
                                return -1;
                            }
                            return 1;
                        }
                        return 0;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
        return -1;
    }
}
