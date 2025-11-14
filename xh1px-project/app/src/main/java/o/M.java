package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.buzbuz.smartautoclicker.R;
import n.ViewTreeObserverOnGlobalLayoutListenerC1107d;

/* loaded from: classes.dex */
public final class M extends E0 implements O {

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f13108F;

    /* renamed from: G, reason: collision with root package name */
    public K f13109G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f13110H;

    /* renamed from: I, reason: collision with root package name */
    public int f13111I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ P f13112J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p8, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f13112J = p8;
        this.f13110H = new Rect();
        this.f13069r = p8;
        this.f13055B = true;
        this.f13056C.setFocusable(true);
        this.f13070s = new L5.s(1, this);
    }

    @Override // o.O
    public final void f(CharSequence charSequence) {
        this.f13108F = charSequence;
    }

    @Override // o.O
    public final void j(int i4) {
        this.f13111I = i4;
    }

    @Override // o.O
    public final void l(int i4, int i8) {
        ViewTreeObserver viewTreeObserver;
        C1173A c1173a = this.f13056C;
        boolean isShowing = c1173a.isShowing();
        r();
        this.f13056C.setInputMethodMode(2);
        c();
        C1213s0 c1213s0 = this.f13059f;
        c1213s0.setChoiceMode(1);
        c1213s0.setTextDirection(i4);
        c1213s0.setTextAlignment(i8);
        P p8 = this.f13112J;
        int selectedItemPosition = p8.getSelectedItemPosition();
        C1213s0 c1213s02 = this.f13059f;
        if (c1173a.isShowing() && c1213s02 != null) {
            c1213s02.setListSelectionHidden(false);
            c1213s02.setSelection(selectedItemPosition);
            if (c1213s02.getChoiceMode() != 0) {
                c1213s02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = p8.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1107d viewTreeObserverOnGlobalLayoutListenerC1107d = new ViewTreeObserverOnGlobalLayoutListenerC1107d(3, this);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1107d);
            this.f13056C.setOnDismissListener(new L(this, viewTreeObserverOnGlobalLayoutListenerC1107d));
        }
    }

    @Override // o.O
    public final CharSequence n() {
        return this.f13108F;
    }

    @Override // o.E0, o.O
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f13109G = (K) listAdapter;
    }

    public final void r() {
        int i4;
        int i8;
        P p8 = this.f13112J;
        Rect rect = p8.k;
        C1173A c1173a = this.f13056C;
        Drawable background = c1173a.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z8 = t1.f13385a;
            if (p8.getLayoutDirection() == 1) {
                i4 = rect.right;
            } else {
                i4 = -rect.left;
            }
        } else {
            i4 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = p8.getPaddingLeft();
        int paddingRight = p8.getPaddingRight();
        int width = p8.getWidth();
        int i9 = p8.j;
        if (i9 == -2) {
            int a3 = p8.a(this.f13109G, c1173a.getBackground());
            int i10 = (p8.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a3 > i10) {
                a3 = i10;
            }
            q(Math.max(a3, (width - paddingLeft) - paddingRight));
        } else if (i9 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i9);
        }
        boolean z9 = t1.f13385a;
        if (p8.getLayoutDirection() == 1) {
            i8 = (((width - paddingRight) - this.f13061h) - this.f13111I) + i4;
        } else {
            i8 = paddingLeft + this.f13111I + i4;
        }
        this.f13062i = i8;
    }
}
