package Q;

import P.AbstractC0274w;
import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f4695e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f4696f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f4697g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f4698h;

    /* renamed from: i, reason: collision with root package name */
    public static final f f4699i;
    public static final f j;
    public static final f k;

    /* renamed from: l, reason: collision with root package name */
    public static final f f4700l;

    /* renamed from: m, reason: collision with root package name */
    public static final f f4701m;

    /* renamed from: n, reason: collision with root package name */
    public static final f f4702n;

    /* renamed from: o, reason: collision with root package name */
    public static final f f4703o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4704a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4705b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f4706c;

    /* renamed from: d, reason: collision with root package name */
    public final q f4707d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        new f(1);
        new f(2);
        new f(4);
        new f(8);
        f4695e = new f(16);
        new f(32);
        new f(64);
        new f(128);
        new f(256, j.class);
        new f(512, j.class);
        new f(1024, k.class);
        new f(2048, k.class);
        f4696f = new f(4096);
        f4697g = new f(8192);
        new f(16384);
        new f(32768);
        new f(65536);
        new f(131072, o.class);
        f4698h = new f(262144);
        f4699i = new f(524288);
        j = new f(1048576);
        new f(2097152, p.class);
        int i4 = Build.VERSION.SDK_INT;
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        k = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, m.class);
        f4700l = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f4701m = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23 = null;
        if (i4 >= 29) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction = accessibilityAction22;
        } else {
            accessibilityAction = null;
        }
        new f(accessibilityAction, R.id.accessibilityActionPageUp, null, null, null);
        if (i4 >= 29) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction2 = accessibilityAction21;
        } else {
            accessibilityAction2 = null;
        }
        new f(accessibilityAction2, R.id.accessibilityActionPageDown, null, null, null);
        if (i4 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new f(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null, null);
        if (i4 >= 29) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction4 = accessibilityAction20;
        } else {
            accessibilityAction4 = null;
        }
        new f(accessibilityAction4, R.id.accessibilityActionPageRight, null, null, null);
        new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        f4702n = new f(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, n.class);
        if (i4 >= 26) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction5 = null;
        }
        new f(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, null, l.class);
        if (i4 >= 28) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction6 = accessibilityAction19;
        } else {
            accessibilityAction6 = null;
        }
        new f(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i4 >= 28) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction7 = accessibilityAction18;
        } else {
            accessibilityAction7 = null;
        }
        new f(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null, null);
        if (i4 >= 30) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction8 = null;
        }
        new f(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i4 >= 30) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction9 = accessibilityAction17;
        } else {
            accessibilityAction9 = null;
        }
        new f(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null, null);
        if (i4 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction10 = null;
        }
        new f(accessibilityAction10, R.id.ALT, null, null, null);
        if (i4 >= 32) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction11 = accessibilityAction16;
        } else {
            accessibilityAction11 = null;
        }
        new f(accessibilityAction11, R.id.CTRL, null, null, null);
        if (i4 >= 32) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction12 = accessibilityAction15;
        } else {
            accessibilityAction12 = null;
        }
        new f(accessibilityAction12, R.id.FUNCTION, null, null, null);
        if (i4 >= 33) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction13 = accessibilityAction14;
        } else {
            accessibilityAction13 = null;
        }
        new f(accessibilityAction13, R.id.KEYCODE_0, null, null, null);
        if (i4 >= 34) {
            accessibilityAction23 = AbstractC0274w.a();
        }
        f4703o = new f(accessibilityAction23, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public f(int i4) {
        this(null, i4, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f4704a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        Object obj2 = ((f) obj).f4704a;
        Object obj3 = this.f4704a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f4704a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d2 = g.d(this.f4705b);
        if (d2.equals("ACTION_UNKNOWN")) {
            Object obj = this.f4704a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d2);
        return sb.toString();
    }

    public f(int i4, Class cls) {
        this(null, i4, null, null, cls);
    }

    public f(Object obj, int i4, String str, q qVar, Class cls) {
        this.f4705b = i4;
        this.f4707d = qVar;
        if (obj == null) {
            this.f4704a = new AccessibilityNodeInfo.AccessibilityAction(i4, str);
        } else {
            this.f4704a = obj;
        }
        this.f4706c = cls;
    }
}
