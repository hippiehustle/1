package t0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class d0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public s0 f14827a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f14828b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14829c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14830d;

    public d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14828b = new Rect();
        this.f14829c = true;
        this.f14830d = false;
    }

    public d0(int i4, int i8) {
        super(i4, i8);
        this.f14828b = new Rect();
        this.f14829c = true;
        this.f14830d = false;
    }

    public d0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f14828b = new Rect();
        this.f14829c = true;
        this.f14830d = false;
    }

    public d0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f14828b = new Rect();
        this.f14829c = true;
        this.f14830d = false;
    }

    public d0(d0 d0Var) {
        super((ViewGroup.LayoutParams) d0Var);
        this.f14828b = new Rect();
        this.f14829c = true;
        this.f14830d = false;
    }
}
