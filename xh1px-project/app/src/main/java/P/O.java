package P;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.buzbuz.smartautoclicker.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import o.C1220w;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f4214a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Field f4215b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f4216c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4217d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e, reason: collision with root package name */
    public static final C0277z f4218e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final B f4219f = new B();

    public static U a(View view) {
        if (f4214a == null) {
            f4214a = new WeakHashMap();
        }
        U u8 = (U) f4214a.get(view);
        if (u8 == null) {
            U u9 = new U(view);
            f4214a.put(view, u9);
            return u9;
        }
        return u8;
    }

    public static void b(View view, t0 t0Var) {
        WindowInsets a3;
        int i4 = Build.VERSION.SDK_INT;
        WindowInsets f8 = t0Var.f();
        if (f8 != null) {
            if (i4 >= 30) {
                a3 = L.a(view, f8);
            } else {
                a3 = D.a(view, f8);
            }
            if (!a3.equals(f8)) {
                t0.g(view, a3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [P.N, java.lang.Object] */
    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = N.f4210d;
            N n3 = (N) view.getTag(R.id.tag_unhandled_key_event_manager);
            N n8 = n3;
            if (n3 == null) {
                ?? obj = new Object();
                obj.f4211a = null;
                obj.f4212b = null;
                obj.f4213c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                n8 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = n8.f4211a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = N.f4210d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (n8.f4211a == null) {
                                n8.f4211a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = N.f4210d;
                                View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view2 == null) {
                                    arrayList3.remove(size);
                                } else {
                                    n8.f4211a.put(view2, Boolean.TRUE);
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        n8.f4211a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a3 = n8.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (n8.f4212b == null) {
                        n8.f4212b = new SparseArray();
                    }
                    n8.f4212b.put(keyCode, new WeakReference(a3));
                }
            }
            if (a3 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return K.a(view);
        }
        if (!f4216c) {
            if (f4215b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f4215b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    f4216c = true;
                    return null;
                }
            }
            try {
                Object obj = f4215b.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                f4216c = true;
                return null;
            }
        }
        return null;
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = J.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] g(C1220w c1220w) {
        if (Build.VERSION.SDK_INT >= 31) {
            return M.a(c1220w);
        }
        return (String[]) c1220w.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i4) {
        boolean z8;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (e(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i8 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z8) {
                if (i4 == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i4);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    obtain.getText().add(e(view));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                }
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i4);
                        return;
                    } catch (AbstractMethodError e9) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e9);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z8) {
                i8 = 2048;
            }
            obtain2.setEventType(i8);
            obtain2.setContentChangeTypes(i4);
            if (z8) {
                obtain2.getText().add(e(view));
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0258f i(View view, C0258f c0258f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c0258f);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return M.b(view, c0258f);
        }
        S.j jVar = (S.j) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0269q interfaceC0269q = f4218e;
        if (jVar != null) {
            C0258f a3 = S.j.a(view, c0258f);
            if (a3 == null) {
                return null;
            }
            if (view instanceof InterfaceC0269q) {
                interfaceC0269q = (InterfaceC0269q) view;
            }
            return interfaceC0269q.a(a3);
        }
        if (view instanceof InterfaceC0269q) {
            interfaceC0269q = (InterfaceC0269q) view;
        }
        return interfaceC0269q.a(c0258f);
    }

    public static void j(View view, int i4) {
        ArrayList f8 = f(view);
        for (int i8 = 0; i8 < f8.size(); i8++) {
            if (((Q.f) f8.get(i8)).a() == i4) {
                f8.remove(i8);
                return;
            }
        }
    }

    public static void k(View view, Q.f fVar, Q.q qVar) {
        C0254b c0254b;
        Q.f fVar2 = new Q.f(null, fVar.f4705b, null, qVar, fVar.f4706c);
        View.AccessibilityDelegate d2 = d(view);
        if (d2 == null) {
            c0254b = null;
        } else if (d2 instanceof C0253a) {
            c0254b = ((C0253a) d2).f4240a;
        } else {
            c0254b = new C0254b(d2);
        }
        if (c0254b == null) {
            c0254b = new C0254b();
        }
        m(view, c0254b);
        j(view, fVar2.a());
        f(view).add(fVar2);
        h(view, 0);
    }

    public static void l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            K.b(view, context, iArr, attributeSet, typedArray, i4, 0);
        }
    }

    public static void m(View view, C0254b c0254b) {
        C0253a c0253a;
        if (c0254b == null && (d(view) instanceof C0253a)) {
            c0254b = new C0254b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (c0254b == null) {
            c0253a = null;
        } else {
            c0253a = c0254b.f4247b;
        }
        view.setAccessibilityDelegate(c0253a);
    }

    public static void n(View view, CharSequence charSequence) {
        boolean z8;
        new A(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).h(view, charSequence);
        B b4 = f4219f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = b4.f4202d;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z8));
            view.addOnAttachStateChangeListener(b4);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(b4);
                return;
            }
            return;
        }
        b4.f4202d.remove(view);
        view.removeOnAttachStateChangeListener(b4);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(b4);
    }
}
