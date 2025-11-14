package androidx.constraintlayout.widget;

import A.e;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i4) {
        e eVar = (e) getLayoutParams();
        eVar.f38a = i4;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i4) {
        e eVar = (e) getLayoutParams();
        eVar.f40b = i4;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f8) {
        e eVar = (e) getLayoutParams();
        eVar.f42c = f8;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
