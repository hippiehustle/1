package A;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f158a;

    /* renamed from: b, reason: collision with root package name */
    public int f159b;

    /* renamed from: c, reason: collision with root package name */
    public float f160c;

    /* renamed from: d, reason: collision with root package name */
    public float f161d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f183f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            if (index == 1) {
                this.f160c = obtainStyledAttributes.getFloat(index, this.f160c);
            } else if (index == 0) {
                int i8 = obtainStyledAttributes.getInt(index, this.f158a);
                this.f158a = i8;
                this.f158a = p.f173d[i8];
            } else if (index == 4) {
                this.f159b = obtainStyledAttributes.getInt(index, this.f159b);
            } else if (index == 3) {
                this.f161d = obtainStyledAttributes.getFloat(index, this.f161d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
