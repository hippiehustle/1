package K2;

import a6.AbstractC0436k;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import t0.AbstractC1533a0;
import t0.AbstractC1537c0;
import t0.o0;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class e extends AbstractC1533a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f2614a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2615b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f2616c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2617d;

    public e(Context context, Set set) {
        this.f2614a = set;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.listDivider});
        o6.j.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            Log.w("ConditionalDividerItemDecoration", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
            drawable = null;
        }
        obtainStyledAttributes.recycle();
        this.f2616c = drawable;
        this.f2617d = 1;
    }

    @Override // t0.AbstractC1533a0
    public final void d(Rect rect, View view, RecyclerView recyclerView, o0 o0Var) {
        o6.j.e(rect, "outRect");
        o6.j.e(view, "view");
        o6.j.e(o0Var, "state");
        Drawable drawable = this.f2616c;
        if (drawable != null && !AbstractC0436k.l0(this.f2614a, AbstractC1638C.c(recyclerView, view))) {
            if (this.f2617d == 1) {
                rect.set(0, 0, 0, drawable.getIntrinsicHeight());
                return;
            } else {
                rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
                return;
            }
        }
        rect.setEmpty();
    }

    @Override // t0.AbstractC1533a0
    public final void e(Canvas canvas, RecyclerView recyclerView, o0 o0Var) {
        Drawable drawable;
        int height;
        int i4;
        int width;
        int i8;
        o6.j.e(canvas, "c");
        o6.j.e(o0Var, "state");
        if (recyclerView.getLayoutManager() != null && (drawable = this.f2616c) != null) {
            int i9 = this.f2617d;
            Set set = this.f2614a;
            Rect rect = this.f2615b;
            int i10 = 0;
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
                while (i10 < recyclerView.getChildCount()) {
                    int i11 = i10 + 1;
                    View childAt = recyclerView.getChildAt(i10);
                    if (childAt != null) {
                        if (!AbstractC0436k.l0(set, AbstractC1638C.c(recyclerView, childAt))) {
                            RecyclerView.O(childAt, rect);
                            int x8 = h2.a.x(childAt.getTranslationY()) + rect.bottom;
                            drawable.setBounds(i8, x8 - drawable.getIntrinsicHeight(), width, x8);
                            drawable.draw(canvas);
                        }
                        i10 = i11;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
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
            while (i10 < recyclerView.getChildCount()) {
                int i12 = i10 + 1;
                View childAt2 = recyclerView.getChildAt(i10);
                if (childAt2 != null) {
                    if (!AbstractC0436k.l0(set, AbstractC1638C.c(recyclerView, childAt2))) {
                        AbstractC1537c0 layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.z(childAt2, rect);
                        }
                        int x9 = h2.a.x(childAt2.getTranslationX()) + rect.right;
                        drawable.setBounds(x9 - drawable.getIntrinsicWidth(), i4, x9, height);
                        drawable.draw(canvas);
                    }
                    i10 = i12;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
            canvas.restore();
        }
    }
}
