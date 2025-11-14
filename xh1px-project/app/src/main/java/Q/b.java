package Q;

import P.O;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final B1.b f4694a;

    public b(B1.b bVar) {
        this.f4694a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f4694a.equals(((b) obj).f4694a);
    }

    public final int hashCode() {
        return this.f4694a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z8) {
        int i4;
        L5.i iVar = (L5.i) this.f4694a.f423e;
        AutoCompleteTextView autoCompleteTextView = iVar.f2953h;
        if (autoCompleteTextView != null && !AbstractC1492c.x(autoCompleteTextView)) {
            CheckableImageButton checkableImageButton = iVar.f2993d;
            if (z8) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            WeakHashMap weakHashMap = O.f4214a;
            checkableImageButton.setImportantForAccessibility(i4);
        }
    }
}
