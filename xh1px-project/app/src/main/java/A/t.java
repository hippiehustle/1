package A;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class t extends c {
    public boolean j;
    public boolean k;

    @Override // A.c
    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f179b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 6) {
                    this.j = true;
                } else if (index == 13) {
                    this.k = true;
                }
            }
        }
    }

    public abstract void h(y.g gVar, int i4, int i8);

    @Override // A.c, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.j || this.k) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i4 = 0; i4 < this.f8e; i4++) {
                View view = (View) constraintLayout.f8516d.get(this.f7d[i4]);
                if (view != null) {
                    if (this.j) {
                        view.setVisibility(visibility);
                    }
                    if (this.k && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        c();
    }
}
