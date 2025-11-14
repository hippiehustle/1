package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.buzbuz.smartautoclicker.R;

/* renamed from: o.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176D extends RatingBar {

    /* renamed from: d, reason: collision with root package name */
    public final C1174B f13050d;

    public C1176D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        a1.a(this, getContext());
        C1174B c1174b = new C1174B(this);
        this.f13050d = c1174b;
        c1174b.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i4, int i8) {
        super.onMeasure(i4, i8);
        Bitmap bitmap = (Bitmap) this.f13050d.f13042c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i4, 0), getMeasuredHeight());
        }
    }
}
