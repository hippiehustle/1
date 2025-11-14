package W;

import P.O;
import Q.g;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends W0.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f6442g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(23);
        this.f6442g = bVar;
    }

    @Override // W0.d
    public final g f(int i4) {
        return new g(AccessibilityNodeInfo.obtain(this.f6442g.r(i4).f4709a));
    }

    @Override // W0.d
    public final g g(int i4) {
        int i8;
        b bVar = this.f6442g;
        if (i4 == 2) {
            i8 = bVar.k;
        } else {
            i8 = bVar.f6452l;
        }
        if (i8 == Integer.MIN_VALUE) {
            return null;
        }
        return f(i8);
    }

    @Override // W0.d
    public final boolean j(int i4, int i8, Bundle bundle) {
        int i9;
        b bVar = this.f6442g;
        View view = bVar.f6451i;
        if (i4 != -1) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 64) {
                        if (i8 != 128) {
                            return bVar.s(i4, i8, bundle);
                        }
                        if (bVar.k != i4) {
                            return false;
                        }
                        bVar.k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.x(i4, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.f6450h;
                    if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i9 = bVar.k) == i4) {
                        return false;
                    }
                    if (i9 != Integer.MIN_VALUE) {
                        bVar.k = Integer.MIN_VALUE;
                        view.invalidate();
                        bVar.x(i9, 65536);
                    }
                    bVar.k = i4;
                    view.invalidate();
                    bVar.x(i4, 32768);
                    return true;
                }
                return bVar.j(i4);
            }
            return bVar.w(i4);
        }
        WeakHashMap weakHashMap = O.f4214a;
        return view.performAccessibilityAction(i8, bundle);
    }
}
