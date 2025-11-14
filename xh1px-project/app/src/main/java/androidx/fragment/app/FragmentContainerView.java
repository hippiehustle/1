package androidx.fragment.app;

import P.D;
import P.O;
import P.t0;
import Z.g;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.buzbuz.smartautoclicker.R;
import f0.AbstractC0650a;
import g0.AbstractComponentCallbacksC0755y;
import g0.C0732a;
import g0.J;
import g0.T;
import g0.a0;
import g0.c0;
import i.AbstractActivityC0870i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Metadata;
import o6.j;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "LZ5/y;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Lg0/y;", "F", "getFragment", "()Lg0/y;", "fragment_release"}, k = 1, mv = {1, g.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8756d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f8757e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f8758f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8759g;

    public FragmentContainerView(Context context) {
        super(context);
        this.f8756d = new ArrayList();
        this.f8757e = new ArrayList();
        this.f8759g = true;
    }

    public final void a(View view) {
        if (this.f8757e.contains(view)) {
            this.f8756d.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y;
        j.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof AbstractComponentCallbacksC0755y) {
            abstractComponentCallbacksC0755y = (AbstractComponentCallbacksC0755y) tag;
        } else {
            abstractComponentCallbacksC0755y = null;
        }
        if (abstractComponentCallbacksC0755y != null) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        t0 t0Var;
        j.e(windowInsets, "insets");
        t0 g8 = t0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f8758f;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            j.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            t0Var = t0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = O.f4214a;
            WindowInsets f8 = g8.f();
            if (f8 != null) {
                WindowInsets b4 = D.b(this, f8);
                if (!b4.equals(f8)) {
                    g8 = t0.g(this, b4);
                }
            }
            t0Var = g8;
        }
        if (!t0Var.f4308a.m()) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                O.b(getChildAt(i4), t0Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j.e(canvas, "canvas");
        if (this.f8759g) {
            Iterator it = this.f8756d.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        j.e(canvas, "canvas");
        j.e(view, "child");
        if (this.f8759g) {
            ArrayList arrayList = this.f8756d;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        j.e(view, "view");
        this.f8757e.remove(view);
        if (this.f8756d.remove(view)) {
            this.f8759g = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0755y> F getFragment() {
        AbstractActivityC0870i abstractActivityC0870i;
        AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y;
        T p8;
        View view = this;
        while (true) {
            abstractActivityC0870i = null;
            if (view != null) {
                Object tag = view.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof AbstractComponentCallbacksC0755y) {
                    abstractComponentCallbacksC0755y = (AbstractComponentCallbacksC0755y) tag;
                } else {
                    abstractComponentCallbacksC0755y = null;
                }
                if (abstractComponentCallbacksC0755y != null) {
                    break;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            } else {
                abstractComponentCallbacksC0755y = null;
                break;
            }
        }
        if (abstractComponentCallbacksC0755y != null) {
            if (abstractComponentCallbacksC0755y.f11129y != null && abstractComponentCallbacksC0755y.f11118n) {
                p8 = abstractComponentCallbacksC0755y.i();
            } else {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0755y + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0870i) {
                    abstractActivityC0870i = (AbstractActivityC0870i) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0870i != null) {
                p8 = abstractActivityC0870i.p();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) p8.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                j.d(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        j.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i4) {
        View childAt = getChildAt(i4);
        j.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        j.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i4, int i8) {
        int i9 = i4 + i8;
        for (int i10 = i4; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            j.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i4, i8);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i4, int i8) {
        int i9 = i4 + i8;
        for (int i10 = i4; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            j.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i4, i8);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f8759g = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        this.f8758f = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        j.e(view, "view");
        if (view.getParent() == this) {
            this.f8757e.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        j.e(context, "context");
        this.f8756d = new ArrayList();
        this.f8757e = new ArrayList();
        this.f8759g = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0650a.f10675b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, T t8) {
        super(context, attributeSet);
        View view;
        j.e(context, "context");
        j.e(attributeSet, "attrs");
        this.f8756d = new ArrayList();
        this.f8757e = new ArrayList();
        this.f8759g = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0650a.f10675b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0755y D7 = t8.D(id);
        if (classAttribute != null && D7 == null) {
            if (id == -1) {
                throw new IllegalStateException(A.j.p("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            J I8 = t8.I();
            context.getClassLoader();
            AbstractComponentCallbacksC0755y a3 = I8.a(classAttribute);
            j.d(a3, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a3.f11086B = id;
            a3.f11087C = id;
            a3.f11088D = string;
            a3.f11128x = t8;
            a3.f11129y = t8.f10921x;
            a3.C(context, attributeSet, null);
            C0732a c0732a = new C0732a(t8);
            c0732a.f10964p = true;
            a3.f11094J = this;
            a3.f11124t = true;
            c0732a.g(getId(), a3, string, 1);
            if (!c0732a.f10957g) {
                c0732a.f10958h = false;
                T t9 = c0732a.f10966r;
                if (t9.f10921x != null && !t9.K) {
                    t9.z(true);
                    C0732a c0732a2 = t9.f10907h;
                    if (c0732a2 != null) {
                        c0732a2.f10967s = false;
                        c0732a2.d();
                        if (T.K(3)) {
                            Objects.toString(t9.f10907h);
                            Objects.toString(c0732a);
                        }
                        t9.f10907h.f(false, false);
                        t9.f10907h.a(t9.f10895M, t9.f10896N);
                        Iterator it = t9.f10907h.f10951a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = ((c0) it.next()).f10994b;
                            if (abstractComponentCallbacksC0755y != null) {
                                abstractComponentCallbacksC0755y.f11120p = false;
                            }
                        }
                        t9.f10907h = null;
                    }
                    c0732a.a(t9.f10895M, t9.f10896N);
                    t9.f10901b = true;
                    try {
                        t9.W(t9.f10895M, t9.f10896N);
                        t9.d();
                        t9.h0();
                        t9.v();
                        ((HashMap) t9.f10902c.f10988e).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        t9.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it2 = t8.f10902c.h().iterator();
        while (it2.hasNext()) {
            a0 a0Var = (a0) it2.next();
            AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y2 = a0Var.f10972c;
            if (abstractComponentCallbacksC0755y2.f11087C == getId() && (view = abstractComponentCallbacksC0755y2.K) != null && view.getParent() == null) {
                abstractComponentCallbacksC0755y2.f11094J = this;
                a0Var.b();
                a0Var.k();
            }
        }
    }
}
