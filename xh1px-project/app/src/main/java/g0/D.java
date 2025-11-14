package g0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.strictmode.Violation;
import f0.AbstractC0650a;
import h0.C0807b;

/* loaded from: classes.dex */
public final class D implements LayoutInflater.Factory2 {

    /* renamed from: d, reason: collision with root package name */
    public final T f10854d;

    public D(T t8) {
        this.f10854d = t8;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z8;
        a0 g8;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        T t8 = this.f10854d;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, t8);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0650a.f10674a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z8 = AbstractComponentCallbacksC0755y.class.isAssignableFrom(J.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z8 = false;
                }
                if (z8) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0755y D7 = resourceId != -1 ? t8.D(resourceId) : null;
                    if (D7 == null && string != null) {
                        D7 = t8.E(string);
                    }
                    if (D7 == null && id != -1) {
                        D7 = t8.D(id);
                    }
                    if (D7 == null) {
                        J I8 = t8.I();
                        context.getClassLoader();
                        D7 = I8.a(attributeValue);
                        D7.f11122r = true;
                        D7.f11086B = resourceId != 0 ? resourceId : id;
                        D7.f11087C = id;
                        D7.f11088D = string;
                        D7.f11123s = true;
                        D7.f11128x = t8;
                        C0731A c0731a = t8.f10921x;
                        D7.f11129y = c0731a;
                        D7.C(c0731a.j, attributeSet, D7.f11111e);
                        g8 = t8.a(D7);
                        if (T.K(2)) {
                            D7.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else if (!D7.f11123s) {
                        D7.f11123s = true;
                        D7.f11128x = t8;
                        C0731A c0731a2 = t8.f10921x;
                        D7.f11129y = c0731a2;
                        D7.C(c0731a2.j, attributeSet, D7.f11111e);
                        g8 = t8.g(D7);
                        if (T.K(2)) {
                            D7.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C0807b c0807b = h0.c.f11305a;
                    h0.c.b(new Violation(D7, "Attempting to use <fragment> tag to add fragment " + D7 + " to container " + viewGroup));
                    h0.c.a(D7).getClass();
                    D7.f11094J = viewGroup;
                    g8.k();
                    g8.j();
                    View view2 = D7.K;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (D7.K.getTag() == null) {
                            D7.K.setTag(string);
                        }
                        D7.K.addOnAttachStateChangeListener(new C(this, g8));
                        return D7.K;
                    }
                    throw new IllegalStateException(A.j.p("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
