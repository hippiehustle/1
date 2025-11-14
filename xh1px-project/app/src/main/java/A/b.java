package A;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f1a;

    /* renamed from: b, reason: collision with root package name */
    public int f2b;

    /* renamed from: c, reason: collision with root package name */
    public float f3c;

    /* renamed from: d, reason: collision with root package name */
    public String f4d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5e;

    /* renamed from: f, reason: collision with root package name */
    public int f6f;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f1a = bVar.f1a;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [A.b, java.lang.Object] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f180c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i4 = 0;
        Object obj = null;
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i4 = 6;
            } else {
                int i9 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i9 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i9 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i4 = 2;
                            } else if (index == 6) {
                                obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                i4 = 1;
                            } else if (index == 8) {
                                obj = obtainStyledAttributes.getString(index);
                            }
                        }
                        i4 = 7;
                    }
                }
                i4 = i9;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.f1a = i4;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC1769h.b(this.f1a)) {
            case 0:
                this.f2b = ((Integer) obj).intValue();
                return;
            case 1:
                this.f3c = ((Float) obj).floatValue();
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                this.f6f = ((Integer) obj).intValue();
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                this.f4d = (String) obj;
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                this.f5e = ((Boolean) obj).booleanValue();
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f3c = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
