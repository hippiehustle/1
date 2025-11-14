package L5;

import P.C0254b;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import o.C1178a0;

/* loaded from: classes.dex */
public final class y extends C0254b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f3047d;

    public y(TextInputLayout textInputLayout) {
        this.f3047d = textInputLayout;
    }

    @Override // P.C0254b
    public final void d(View view, Q.g gVar) {
        CharSequence charSequence;
        boolean z8;
        String str;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4709a;
        this.f4246a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f3047d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z9 = textInputLayout.f10308x0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        v vVar = textInputLayout.f10272e;
        C1178a0 c1178a0 = vVar.f3035e;
        if (c1178a0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c1178a0);
            accessibilityNodeInfo.setTraversalAfter(c1178a0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(vVar.f3037g);
        }
        if (!isEmpty) {
            gVar.m(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            gVar.m(str);
            if (!z9 && placeholderText != null) {
                gVar.m(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            gVar.m(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 26) {
                gVar.k(str);
            } else {
                if (!isEmpty) {
                    str = ((Object) charSequence) + ", " + str;
                }
                gVar.m(str);
            }
            if (i4 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                gVar.h(4, isEmpty);
            }
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z8) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C1178a0 c1178a02 = textInputLayout.f10285m.f3024y;
        if (c1178a02 != null) {
            accessibilityNodeInfo.setLabelFor(c1178a02);
        }
        textInputLayout.f10274f.b().n(gVar);
    }

    @Override // P.C0254b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f3047d.f10274f.b().o(accessibilityEvent);
    }
}
