package A;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f162m;

    /* renamed from: a, reason: collision with root package name */
    public float f163a;

    /* renamed from: b, reason: collision with root package name */
    public float f164b;

    /* renamed from: c, reason: collision with root package name */
    public float f165c;

    /* renamed from: d, reason: collision with root package name */
    public float f166d;

    /* renamed from: e, reason: collision with root package name */
    public float f167e;

    /* renamed from: f, reason: collision with root package name */
    public float f168f;

    /* renamed from: g, reason: collision with root package name */
    public float f169g;

    /* renamed from: h, reason: collision with root package name */
    public float f170h;

    /* renamed from: i, reason: collision with root package name */
    public float f171i;
    public float j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public float f172l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f162m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f185h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = obtainStyledAttributes.getIndex(i4);
            switch (f162m.get(index)) {
                case 1:
                    this.f163a = obtainStyledAttributes.getFloat(index, this.f163a);
                    break;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    this.f164b = obtainStyledAttributes.getFloat(index, this.f164b);
                    break;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    this.f165c = obtainStyledAttributes.getFloat(index, this.f165c);
                    break;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    this.f166d = obtainStyledAttributes.getFloat(index, this.f166d);
                    break;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    this.f167e = obtainStyledAttributes.getFloat(index, this.f167e);
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f168f = obtainStyledAttributes.getDimension(index, this.f168f);
                    break;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f169g = obtainStyledAttributes.getDimension(index, this.f169g);
                    break;
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    this.f170h = obtainStyledAttributes.getDimension(index, this.f170h);
                    break;
                case 9:
                    this.f171i = obtainStyledAttributes.getDimension(index, this.f171i);
                    break;
                case 10:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 11:
                    this.k = true;
                    this.f172l = obtainStyledAttributes.getDimension(index, this.f172l);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
