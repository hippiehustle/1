package W;

import P.C0254b;
import P.O;
import Q.g;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import t.h;
import t.k;
import t7.C1594d;

/* loaded from: classes.dex */
public abstract class b extends C0254b {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f6443n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final C1594d f6444o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final G5.e f6445p = new G5.e(9);

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f6450h;

    /* renamed from: i, reason: collision with root package name */
    public final View f6451i;
    public a j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f6446d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f6447e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f6448f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f6449g = new int[2];
    public int k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f6452l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f6453m = Integer.MIN_VALUE;

    public b(View view) {
        this.f6451i = view;
        this.f6450h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = O.f4214a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // P.C0254b
    public final W0.d b(View view) {
        if (this.j == null) {
            this.j = new a(this);
        }
        return this.j;
    }

    @Override // P.C0254b
    public final void d(View view, g gVar) {
        this.f4246a.onInitializeAccessibilityNodeInfo(view, gVar.f4709a);
        t(gVar);
    }

    public final boolean j(int i4) {
        if (this.f6452l != i4) {
            return false;
        }
        this.f6452l = Integer.MIN_VALUE;
        v(i4, false);
        x(i4, 8);
        return true;
    }

    public final AccessibilityEvent k(int i4, int i8) {
        View view = this.f6451i;
        if (i4 != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i8);
            g r8 = r(i4);
            obtain.getText().add(r8.g());
            AccessibilityNodeInfo accessibilityNodeInfo = r8.f4709a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            obtain.setSource(view, i4);
            obtain.setPackageName(view.getContext().getPackageName());
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i8);
        view.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    public final g l(int i4) {
        boolean z8;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        gVar.i("android.view.View");
        Rect rect = f6443n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f6451i;
        obtain.setParent(view);
        u(i4, gVar);
        if (gVar.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f6447e;
        gVar.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    gVar.f4710b = i4;
                    obtain.setSource(view, i4);
                    if (this.k == i4) {
                        obtain.setAccessibilityFocused(true);
                        gVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        gVar.a(64);
                    }
                    if (this.f6452l == i4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        gVar.a(2);
                    } else if (obtain.isFocusable()) {
                        gVar.a(1);
                    }
                    obtain.setFocused(z8);
                    int[] iArr = this.f6449g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f6446d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        gVar.f(rect3);
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f6448f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            obtain.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                Object parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        obtain.setVisibleToUser(true);
                                    }
                                }
                            }
                        }
                    }
                    return gVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final boolean m(MotionEvent motionEvent) {
        int i4;
        AccessibilityManager accessibilityManager = this.f6450h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && (i4 = this.f6453m) != Integer.MIN_VALUE) {
                    if (i4 != Integer.MIN_VALUE) {
                        this.f6453m = Integer.MIN_VALUE;
                        x(Integer.MIN_VALUE, 128);
                        x(i4, 256);
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                int n3 = n(motionEvent.getX(), motionEvent.getY());
                int i8 = this.f6453m;
                if (i8 != n3) {
                    this.f6453m = n3;
                    x(n3, 128);
                    x(i8, 256);
                }
                if (n3 == Integer.MIN_VALUE) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public abstract int n(float f8, float f9);

    public abstract void o(ArrayList arrayList);

    public final void p(int i4) {
        View view;
        ViewParent parent;
        if (i4 != Integer.MIN_VALUE && this.f6450h.isEnabled() && (parent = (view = this.f6451i).getParent()) != null) {
            AccessibilityEvent k = k(i4, 2048);
            k.setContentChangeTypes(0);
            parent.requestSendAccessibilityEvent(view, k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(int i4, Rect rect) {
        g gVar;
        int i8;
        int i9;
        boolean z8;
        Object obj;
        g gVar2;
        int lastIndexOf;
        int i10;
        int c6;
        int i11;
        int e9;
        int i12;
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        k kVar = new k(0);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            kVar.d(((Integer) arrayList.get(i13)).intValue(), l(((Integer) arrayList.get(i13)).intValue()));
        }
        int i14 = this.f6452l;
        if (i14 == Integer.MIN_VALUE) {
            gVar = null;
        } else {
            gVar = (g) kVar.b(i14);
        }
        C1594d c1594d = f6444o;
        G5.e eVar = f6445p;
        View view = this.f6451i;
        if (i4 != 1 && i4 != 2) {
            if (i4 != 17 && i4 != 33 && i4 != 66 && i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i15 = this.f6452l;
            if (i15 != Integer.MIN_VALUE) {
                r(i15).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i4 != 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 == 130) {
                                i11 = -1;
                                rect2.set(0, -1, width, -1);
                            } else {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        } else {
                            i11 = -1;
                            rect2.set(-1, 0, -1, height);
                        }
                    } else {
                        i11 = -1;
                        rect2.set(0, height, width, height);
                    }
                } else {
                    i11 = -1;
                    rect2.set(width, 0, width, height);
                }
                Rect rect3 = new Rect(rect2);
                if (i4 == 17) {
                    if (i4 != 33) {
                        if (i4 != 66) {
                            if (i4 == 130) {
                                i8 = 0;
                                rect3.offset(0, -(rect2.height() + 1));
                            } else {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        } else {
                            i8 = 0;
                            rect3.offset(-(rect2.width() + 1), 0);
                        }
                    } else {
                        i8 = 0;
                        rect3.offset(0, rect2.height() + 1);
                    }
                } else {
                    i8 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                }
                eVar.getClass();
                e9 = kVar.e();
                Rect rect4 = new Rect();
                gVar2 = null;
                for (i12 = i8; i12 < e9; i12++) {
                    g gVar3 = (g) kVar.f(i12);
                    if (gVar3 != gVar) {
                        c1594d.getClass();
                        gVar3.f(rect4);
                        if (E2.b.x(i4, rect2, rect4)) {
                            if (E2.b.x(i4, rect2, rect3) && !E2.b.b(i4, rect2, rect4, rect3)) {
                                if (!E2.b.b(i4, rect2, rect3, rect4)) {
                                    int A2 = E2.b.A(i4, rect2, rect4);
                                    int B8 = E2.b.B(i4, rect2, rect4);
                                    int i16 = (B8 * B8) + (A2 * 13 * A2);
                                    int A8 = E2.b.A(i4, rect2, rect3);
                                    int B9 = E2.b.B(i4, rect2, rect3);
                                    if (i16 >= (B9 * B9) + (A8 * 13 * A8)) {
                                    }
                                }
                            }
                            rect3.set(rect4);
                            gVar2 = gVar3;
                        }
                    }
                }
                i9 = i11;
            }
            i11 = -1;
            Rect rect32 = new Rect(rect2);
            if (i4 == 17) {
            }
            eVar.getClass();
            e9 = kVar.e();
            Rect rect42 = new Rect();
            gVar2 = null;
            while (i12 < e9) {
            }
            i9 = i11;
        } else {
            i8 = 0;
            i9 = -1;
            WeakHashMap weakHashMap = O.f4214a;
            if (view.getLayoutDirection() == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            eVar.getClass();
            int e10 = kVar.e();
            ArrayList arrayList2 = new ArrayList(e10);
            for (int i17 = 0; i17 < e10; i17++) {
                arrayList2.add((g) kVar.f(i17));
            }
            Collections.sort(arrayList2, new c(z8, c1594d));
            if (i4 != 1) {
                if (i4 == 2) {
                    int size = arrayList2.size();
                    if (gVar == null) {
                        lastIndexOf = -1;
                    } else {
                        lastIndexOf = arrayList2.lastIndexOf(gVar);
                    }
                    int i18 = lastIndexOf + 1;
                    if (i18 < size) {
                        obj = arrayList2.get(i18);
                        gVar2 = (g) obj;
                    }
                    obj = null;
                    gVar2 = (g) obj;
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
            } else {
                int size2 = arrayList2.size();
                if (gVar != null) {
                    size2 = arrayList2.indexOf(gVar);
                }
                int i19 = size2 - 1;
                if (i19 >= 0) {
                    obj = arrayList2.get(i19);
                    gVar2 = (g) obj;
                }
                obj = null;
                gVar2 = (g) obj;
            }
        }
        g gVar4 = gVar2;
        if (gVar4 == null) {
            c6 = Integer.MIN_VALUE;
        } else {
            if (kVar.f14671d) {
                h.a(kVar);
            }
            int i20 = kVar.f14674g;
            int i21 = i8;
            while (true) {
                if (i21 < i20) {
                    if (kVar.f14673f[i21] == gVar4) {
                        i10 = i21;
                        break;
                    }
                    i21++;
                } else {
                    i10 = i9;
                    break;
                }
            }
            c6 = kVar.c(i10);
        }
        return w(c6);
    }

    public final g r(int i4) {
        if (i4 == -1) {
            View view = this.f6451i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            g gVar = new g(obtain);
            WeakHashMap weakHashMap = O.f4214a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            o(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                gVar.f4709a.addChild(view, ((Integer) arrayList.get(i8)).intValue());
            }
            return gVar;
        }
        return l(i4);
    }

    public abstract boolean s(int i4, int i8, Bundle bundle);

    public abstract void u(int i4, g gVar);

    public final boolean w(int i4) {
        int i8;
        View view = this.f6451i;
        if ((view.isFocused() || view.requestFocus()) && (i8 = this.f6452l) != i4) {
            if (i8 != Integer.MIN_VALUE) {
                j(i8);
            }
            if (i4 == Integer.MIN_VALUE) {
                return false;
            }
            this.f6452l = i4;
            v(i4, true);
            x(i4, 8);
            return true;
        }
        return false;
    }

    public final void x(int i4, int i8) {
        View view;
        ViewParent parent;
        if (i4 != Integer.MIN_VALUE && this.f6450h.isEnabled() && (parent = (view = this.f6451i).getParent()) != null) {
            parent.requestSendAccessibilityEvent(view, k(i4, i8));
        }
    }

    public void t(g gVar) {
    }

    public void v(int i4, boolean z8) {
    }
}
