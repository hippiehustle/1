package P;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.buzbuz.smartautoclicker.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: P.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0254b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f4245c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f4246a;

    /* renamed from: b, reason: collision with root package name */
    public final C0253a f4247b;

    public C0254b() {
        this(f4245c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4246a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public W0.d b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f4246a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new W0.d(23, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f4246a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, Q.g gVar) {
        this.f4246a.onInitializeAccessibilityNodeInfo(view, gVar.f4709a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f4246a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4246a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i4, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z8;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z9 = false;
        int i8 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i8 >= list.size()) {
                break;
            }
            Q.f fVar = (Q.f) list.get(i8);
            if (fVar.a() == i4) {
                Class cls = fVar.f4706c;
                Q.q qVar = fVar.f4707d;
                if (qVar != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e9) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e9);
                        }
                    }
                    z8 = qVar.a(view);
                }
            } else {
                i8++;
            }
        }
        z8 = false;
        if (!z8) {
            z8 = this.f4246a.performAccessibilityAction(view, i4, bundle);
        }
        if (!z8 && i4 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i9 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i9)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i10 = 0;
                while (true) {
                    if (clickableSpanArr == null || i10 >= clickableSpanArr.length) {
                        break;
                    }
                    if (clickableSpan.equals(clickableSpanArr[i10])) {
                        clickableSpan.onClick(view);
                        z9 = true;
                        break;
                    }
                    i10++;
                }
            }
            return z9;
        }
        return z8;
    }

    public void h(View view, int i4) {
        this.f4246a.sendAccessibilityEvent(view, i4);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f4246a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0254b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f4246a = accessibilityDelegate;
        this.f4247b = new C0253a(this);
    }
}
