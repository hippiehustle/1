package P;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.buzbuz.smartautoclicker.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: P.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0254b f4240a;

    public C0253a(C0254b c0254b) {
        this.f4240a = c0254b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4240a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        W0.d b4 = this.f4240a.b(view);
        if (b4 != null) {
            return (AccessibilityNodeProvider) b4.f6489e;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f4240a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        boolean z8;
        Object tag2;
        Object tag3;
        int i4;
        Q.g gVar = new Q.g(accessibilityNodeInfo);
        WeakHashMap weakHashMap = O.f4214a;
        ClickableSpan[] clickableSpanArr = null;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(J.c(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i8 = 0;
        boolean z9 = true;
        if (bool != null && bool.booleanValue()) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z8);
        } else {
            gVar.h(1, z8);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(J.b(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        if (bool2 == null || !bool2.booleanValue()) {
            z9 = false;
        }
        if (i9 >= 28) {
            accessibilityNodeInfo.setHeading(z9);
        } else {
            gVar.h(2, z9);
        }
        CharSequence e9 = O.e(view);
        if (i9 >= 28) {
            accessibilityNodeInfo.setPaneTitle(e9);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", e9);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            tag3 = L.b(view);
        } else {
            tag3 = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (i9 >= 30) {
            I.b.f(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f4240a.d(view, gVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i9 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    if (((WeakReference) sparseArray.valueAt(i10)).get() == null) {
                        arrayList.add(Integer.valueOf(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    sparseArray.remove(((Integer) arrayList.get(i11)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i12 = 0;
                while (i12 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i12];
                    int i13 = i8;
                    while (true) {
                        if (i13 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i13)).get())) {
                                i4 = sparseArray2.keyAt(i13);
                                break;
                            }
                            i13++;
                        } else {
                            i4 = Q.g.f4708c;
                            Q.g.f4708c = i4 + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i4, new WeakReference(clickableSpanArr[i12]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i12];
                    Spanned spanned = (Spanned) text;
                    gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i4));
                    i12++;
                    i8 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            gVar.b((Q.f) list.get(i14));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f4240a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4240a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
        return this.f4240a.g(view, i4, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i4) {
        this.f4240a.h(view, i4);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f4240a.i(view, accessibilityEvent);
    }
}
