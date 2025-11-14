package A;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import w.AbstractC1680a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f153e;

    /* renamed from: a, reason: collision with root package name */
    public int f154a;

    /* renamed from: b, reason: collision with root package name */
    public int f155b;

    /* renamed from: c, reason: collision with root package name */
    public float f156c;

    /* renamed from: d, reason: collision with root package name */
    public float f157d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f153e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f182e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            switch (f153e.get(index)) {
                case 1:
                    this.f157d = obtainStyledAttributes.getFloat(index, this.f157d);
                    break;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    this.f155b = obtainStyledAttributes.getInt(index, this.f155b);
                    break;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC1680a.f15564a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    this.f154a = p.g(obtainStyledAttributes, index, this.f154a);
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f156c = obtainStyledAttributes.getFloat(index, this.f156c);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
