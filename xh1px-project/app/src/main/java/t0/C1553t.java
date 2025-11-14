package t0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1553t extends AbstractC1533a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f14967d = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f14968a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14969b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f14970c = new Rect();

    public C1553t(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f14967d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f14968a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.f14969b = 1;
    }

    @Override // t0.AbstractC1533a0
    public final void d(Rect rect, View view, RecyclerView recyclerView, o0 o0Var) {
        Drawable drawable = this.f14968a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f14969b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // t0.AbstractC1533a0
    public final void e(Canvas canvas, RecyclerView recyclerView, o0 o0Var) {
        Drawable drawable;
        int height;
        int i4;
        int width;
        int i8;
        if (recyclerView.getLayoutManager() != null && (drawable = this.f14968a) != null) {
            int i9 = this.f14969b;
            int i10 = 0;
            Rect rect = this.f14970c;
            if (i9 == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i8 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i8, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i8 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i10 < childCount) {
                    View childAt = recyclerView.getChildAt(i10);
                    RecyclerView.O(childAt, rect);
                    int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                    drawable.setBounds(i8, round - drawable.getIntrinsicHeight(), width, round);
                    drawable.draw(canvas);
                    i10++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i4 = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i4, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                i4 = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i10 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i10);
                recyclerView.getLayoutManager().z(childAt2, rect);
                int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
                drawable.setBounds(round2 - drawable.getIntrinsicWidth(), i4, round2, height);
                drawable.draw(canvas);
                i10++;
            }
            canvas.restore();
        }
    }
}
