package A;

import P.InterfaceC0268p;
import P.t0;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements InterfaceC0268p {

    /* renamed from: d, reason: collision with root package name */
    public final int f79d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f81f;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f81f = new ArrayList();
        this.f80e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f184g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                this.f79d = obtainStyledAttributes.getResourceId(index, this.f79d);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f80e);
                this.f80e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new p().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // P.InterfaceC0268p
    public t0 y(View view, t0 t0Var) {
        View view2 = (View) this.f81f;
        int i4 = t0Var.f4308a.f(519).f1849b;
        int i8 = this.f79d;
        if (i8 >= 0) {
            view2.getLayoutParams().height = i8 + i4;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f80e + i4, view2.getPaddingRight(), view2.getPaddingBottom());
        return t0Var;
    }

    public g(View view, int i4, int i8) {
        this.f79d = i4;
        this.f81f = view;
        this.f80e = i8;
    }
}
