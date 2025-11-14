package G;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f1641a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f1642b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f1643c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f1644d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1645e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static Method f1646f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f1647g;

    public static d b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i4) {
        d dVar;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i4, typedValue);
            int i8 = typedValue.type;
            if (i8 >= 28 && i8 <= 31) {
                return new d(null, null, typedValue.data);
            }
            try {
                dVar = d.b(typedArray.getResources(), typedArray.getResourceId(i4, 0), theme);
            } catch (Exception e9) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e9);
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return new d(null, null, 0);
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int d(float f8) {
        float f9;
        boolean z8;
        float f10;
        if (f8 < 1.0f) {
            return -16777216;
        }
        if (f8 > 99.0f) {
            return -1;
        }
        float f11 = (f8 + 16.0f) / 116.0f;
        if (f8 > 8.0f) {
            f9 = f11 * f11 * f11;
        } else {
            f9 = f8 / 903.2963f;
        }
        float f12 = f11 * f11 * f11;
        if (f12 > 0.008856452f) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            f10 = f12;
        } else {
            f10 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z8) {
            f12 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f1643c;
        return H.b.a(f10 * fArr[0], f9 * fArr[1], f12 * fArr[2]);
    }

    public static float e(int i4) {
        float pow;
        float f8 = i4 / 255.0f;
        if (f8 <= 0.04045f) {
            pow = f8 / 12.92f;
        } else {
            pow = (float) Math.pow((f8 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static e i(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i4;
        boolean z8;
        int i8;
        int i9;
        M.d dVar;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), D.a.f851b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(5);
                String string3 = obtainAttributes.getString(6);
                String string4 = obtainAttributes.getString(2);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(3, 1);
                int integer2 = obtainAttributes.getInteger(4, 500);
                String string5 = obtainAttributes.getString(7);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        k(xmlResourceParser);
                    }
                    List j = j(resources, resourceId);
                    if (string4 != null) {
                        dVar = new M.d(string, string2, string4, j);
                    } else {
                        dVar = null;
                    }
                    return new h(new M.d(string, string2, string3, j), dVar, integer, integer2, string5);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), D.a.f852c);
                            int i10 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i10 = 1;
                            }
                            int i11 = obtainAttributes2.getInt(i10, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i4 = 6;
                            } else {
                                i4 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i4, 0)) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            int i12 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i12 = 3;
                            }
                            if (obtainAttributes2.hasValue(7)) {
                                i8 = 7;
                            } else {
                                i8 = 4;
                            }
                            String string6 = obtainAttributes2.getString(i8);
                            int i13 = obtainAttributes2.getInt(i12, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i9 = 5;
                            } else {
                                i9 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i9, 0);
                            String string7 = obtainAttributes2.getString(i9);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                k(xmlResourceParser);
                            }
                            arrayList.add(new g(i11, i13, resourceId2, string7, string6, z8));
                        } else {
                            k(xmlResourceParser);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new f((g[]) arrayList.toArray(new g[0]));
            }
            k(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List j(Resources resources, int i4) {
        if (i4 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i4);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                    int resourceId = obtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i4);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void k(XmlPullParser xmlPullParser) {
        int i4 = 1;
        while (i4 > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i4--;
                }
            } else {
                i4++;
            }
        }
    }

    public static float l() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i4) {
        new Handler(Looper.getMainLooper()).post(new l(this, i4, 0));
    }

    public abstract void g(int i4);

    public abstract void h(Typeface typeface);
}
