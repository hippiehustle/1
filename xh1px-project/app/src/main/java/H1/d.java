package H1;

import P.S;
import android.animation.LayoutTransition;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashSet;
import o6.j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f1888a;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f1889b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f1890c;

    /* renamed from: d, reason: collision with root package name */
    public final A1.e f1891d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1892e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f1893f;

    /* renamed from: g, reason: collision with root package name */
    public final c f1894g;

    public d(ViewGroup viewGroup, ViewGroup viewGroup2, Size size, A1.e eVar) {
        j.e(viewGroup, "backgroundViewGroup");
        j.e(viewGroup2, "resizedContainer");
        j.e(size, "maximumSize");
        this.f1888a = viewGroup;
        this.f1889b = viewGroup2;
        this.f1890c = size;
        this.f1891d = eVar;
        this.f1893f = new LinkedHashSet();
        c cVar = new c(this);
        this.f1894g = cVar;
        LayoutTransition layoutTransition = viewGroup2.getLayoutTransition();
        if (layoutTransition != null) {
            layoutTransition.addTransitionListener(cVar);
        }
    }

    public final Size a() {
        ViewGroup viewGroup;
        int width;
        int i4;
        int i8;
        int i9;
        int height;
        ViewGroup viewGroup2 = this.f1889b;
        viewGroup2.measure(1073741824, 1073741824);
        S s8 = new S(0, viewGroup2);
        int i10 = 0;
        while (s8.hasNext()) {
            View view = (View) s8.next();
            if (view.getVisibility() == 8) {
                height = 0;
            } else {
                height = view.getHeight();
            }
            i10 += height;
        }
        int paddingBottom = viewGroup2.getPaddingBottom() + viewGroup2.getPaddingTop() + i10;
        View childAt = this.f1888a.getChildAt(0);
        if (childAt instanceof ViewGroup) {
            viewGroup = (ViewGroup) childAt;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null && viewGroup.getId() != viewGroup2.getId()) {
            S s9 = new S(0, viewGroup);
            width = 0;
            while (s9.hasNext()) {
                View view2 = (View) s9.next();
                if (view2.getVisibility() == 8) {
                    i9 = 0;
                } else {
                    int width2 = view2.getWidth();
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        i4 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        i4 = 0;
                    }
                    int i11 = width2 + i4;
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        i8 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    } else {
                        i8 = 0;
                    }
                    i9 = i11 + i8;
                }
                width += i9;
            }
        } else {
            width = viewGroup2.getWidth();
        }
        return new Size(width, paddingBottom);
    }
}
