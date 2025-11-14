package A;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f82a;

    /* renamed from: b, reason: collision with root package name */
    public final float f83b;

    /* renamed from: c, reason: collision with root package name */
    public final float f84c;

    /* renamed from: d, reason: collision with root package name */
    public final float f85d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86e;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f82a = Float.NaN;
        this.f83b = Float.NaN;
        this.f84c = Float.NaN;
        this.f85d = Float.NaN;
        this.f86e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f186i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f86e);
                this.f86e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new p().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f85d = obtainStyledAttributes.getDimension(index, this.f85d);
            } else if (index == 2) {
                this.f83b = obtainStyledAttributes.getDimension(index, this.f83b);
            } else if (index == 3) {
                this.f84c = obtainStyledAttributes.getDimension(index, this.f84c);
            } else if (index == 4) {
                this.f82a = obtainStyledAttributes.getDimension(index, this.f82a);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
