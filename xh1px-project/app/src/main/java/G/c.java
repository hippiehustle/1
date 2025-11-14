package G;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.buzbuz.smartautoclicker.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1648a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0136  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        ?? r9;
        int color;
        float f8;
        float f9;
        int attributeCount;
        int i4;
        char c6;
        int[] iArr;
        int i8;
        int d2;
        float min;
        float f10;
        int i9;
        float cbrt;
        int i10;
        int i11;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            boolean z8 = 1;
            int depth2 = xmlPullParser.getDepth() + 1;
            int[][] iArr2 = new int[20];
            int[] iArr3 = new int[20];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == z8 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                    break;
                }
                if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                    int[] iArr4 = D.a.f850a;
                    if (theme2 == null) {
                        r9 = r02.obtainAttributes(attributeSet2, iArr4);
                    } else {
                        r9 = theme2.obtainStyledAttributes(attributeSet2, iArr4, i12, i12);
                    }
                    int resourceId = r9.getResourceId(i12, -1);
                    if (resourceId != -1) {
                        ThreadLocal threadLocal = f1648a;
                        TypedValue typedValue2 = (TypedValue) threadLocal.get();
                        if (typedValue2 == null) {
                            typedValue = new TypedValue();
                            threadLocal.set(typedValue);
                        } else {
                            typedValue = typedValue2;
                        }
                        r02.getValue(resourceId, typedValue, z8);
                        int i14 = typedValue.type;
                        if (i14 < 28 || i14 > 31) {
                            try {
                                color = a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                            } catch (Exception unused) {
                                color = r9.getColor(i12, -65281);
                            }
                            if (!r9.hasValue(z8)) {
                                f8 = r9.getFloat(z8, 1.0f);
                            } else if (r9.hasValue(3)) {
                                f8 = r9.getFloat(3, 1.0f);
                            } else {
                                f8 = 1.0f;
                            }
                            char c9 = z8;
                            if (Build.VERSION.SDK_INT < 31 && r9.hasValue(2)) {
                                f9 = r9.getFloat(2, -1.0f);
                            } else {
                                f9 = r9.getFloat(4, -1.0f);
                            }
                            r9.recycle();
                            attributeCount = attributeSet2.getAttributeCount();
                            int[] iArr5 = new int[attributeCount];
                            i4 = i12;
                            int i15 = i4;
                            while (i4 < attributeCount) {
                                int attributeNameResource = attributeSet2.getAttributeNameResource(i4);
                                if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                    int i16 = i15 + 1;
                                    if (!attributeSet2.getAttributeBooleanValue(i4, false)) {
                                        attributeNameResource = -attributeNameResource;
                                    }
                                    iArr5[i15] = attributeNameResource;
                                    i15 = i16;
                                }
                                i4++;
                            }
                            int[] trimStateSet = StateSet.trimStateSet(iArr5, i15);
                            float f11 = 100.0f;
                            if (f9 < 0.0f && f9 <= 100.0f) {
                                c6 = c9;
                            } else {
                                c6 = 0;
                            }
                            if (f8 != 1.0f && c6 == 0) {
                                iArr = trimStateSet;
                                i8 = depth2;
                            } else {
                                int i17 = AbstractC1492c.i((int) ((Color.alpha(color) * f8) + 0.5f), 0, 255);
                                if (c6 == 0) {
                                    a a3 = a.a(color);
                                    float f12 = a3.f1635a;
                                    float f13 = a3.f1636b;
                                    o oVar = o.k;
                                    if (f13 < 1.0d || Math.round(f9) <= 0.0d || Math.round(f9) >= 100.0d) {
                                        iArr = trimStateSet;
                                        i8 = depth2;
                                        d2 = b.d(f9);
                                    } else {
                                        if (f12 < 0.0f) {
                                            min = 0.0f;
                                        } else {
                                            min = Math.min(360.0f, f12);
                                        }
                                        float f14 = 0.0f;
                                        float f15 = f13;
                                        char c10 = c9;
                                        a aVar = null;
                                        while (true) {
                                            if (Math.abs(f14 - f13) >= 0.4f) {
                                                float f16 = 1000.0f;
                                                float f17 = f11;
                                                float f18 = 0.0f;
                                                float f19 = 1000.0f;
                                                a aVar2 = null;
                                                while (true) {
                                                    if (Math.abs(f18 - f17) > 0.01f) {
                                                        f10 = f11;
                                                        float f20 = ((f17 - f18) / 2.0f) + f18;
                                                        iArr = trimStateSet;
                                                        int c11 = a.b(f20, f15, min).c(o.k);
                                                        float e9 = b.e(Color.red(c11));
                                                        float e10 = b.e(Color.green(c11));
                                                        float e11 = b.e(Color.blue(c11));
                                                        float[] fArr = b.f1644d[c9];
                                                        float f21 = ((e11 * fArr[2]) + ((e10 * fArr[c9]) + (e9 * fArr[0]))) / f10;
                                                        if (f21 <= 0.008856452f) {
                                                            cbrt = f21 * 903.2963f;
                                                            i9 = c11;
                                                        } else {
                                                            i9 = c11;
                                                            cbrt = (((float) Math.cbrt(f21)) * 116.0f) - 16.0f;
                                                        }
                                                        float abs = Math.abs(f9 - cbrt);
                                                        if (abs < 0.2f) {
                                                            a a4 = a.a(i9);
                                                            a b4 = a.b(a4.f1637c, a4.f1636b, min);
                                                            float f22 = a4.f1638d - b4.f1638d;
                                                            float f23 = a4.f1639e - b4.f1639e;
                                                            float f24 = a4.f1640f - b4.f1640f;
                                                            i8 = depth2;
                                                            float pow = (float) (Math.pow(Math.sqrt((f24 * f24) + (f23 * f23) + (f22 * f22)), 0.63d) * 1.41d);
                                                            if (pow <= 1.0f) {
                                                                f19 = pow;
                                                                f16 = abs;
                                                                aVar2 = a4;
                                                            }
                                                        } else {
                                                            i8 = depth2;
                                                        }
                                                        if (f16 == 0.0f && f19 == 0.0f) {
                                                            break;
                                                        }
                                                        if (cbrt < f9) {
                                                            f18 = f20;
                                                        } else {
                                                            f17 = f20;
                                                        }
                                                        f11 = f10;
                                                        trimStateSet = iArr;
                                                        depth2 = i8;
                                                    } else {
                                                        iArr = trimStateSet;
                                                        i8 = depth2;
                                                        f10 = f11;
                                                        break;
                                                    }
                                                }
                                                a aVar3 = aVar2;
                                                if (c10 != 0) {
                                                    if (aVar3 != null) {
                                                        d2 = aVar3.c(oVar);
                                                        break;
                                                    }
                                                    f15 = ((f13 - f14) / 2.0f) + f14;
                                                    f11 = f10;
                                                    trimStateSet = iArr;
                                                    depth2 = i8;
                                                    c10 = 0;
                                                } else {
                                                    if (aVar3 == null) {
                                                        f13 = f15;
                                                    } else {
                                                        aVar = aVar3;
                                                        f14 = f15;
                                                    }
                                                    f15 = ((f13 - f14) / 2.0f) + f14;
                                                    f11 = f10;
                                                    trimStateSet = iArr;
                                                    depth2 = i8;
                                                }
                                            } else {
                                                iArr = trimStateSet;
                                                i8 = depth2;
                                                if (aVar == null) {
                                                    d2 = b.d(f9);
                                                } else {
                                                    d2 = aVar.c(oVar);
                                                }
                                            }
                                        }
                                    }
                                    color = d2;
                                } else {
                                    iArr = trimStateSet;
                                    i8 = depth2;
                                }
                                color = (16777215 & color) | (i17 << 24);
                            }
                            i10 = i13 + 1;
                            int i18 = 8;
                            if (i10 > iArr3.length) {
                                if (i13 <= 4) {
                                    i11 = 8;
                                } else {
                                    i11 = i13 * 2;
                                }
                                int[] iArr6 = new int[i11];
                                System.arraycopy(iArr3, 0, iArr6, 0, i13);
                                iArr3 = iArr6;
                            }
                            iArr3[i13] = color;
                            if (i10 > iArr2.length) {
                                Class<?> componentType = iArr2.getClass().getComponentType();
                                if (i13 > 4) {
                                    i18 = i13 * 2;
                                }
                                ?? r12 = (Object[]) Array.newInstance(componentType, i18);
                                System.arraycopy(iArr2, 0, r12, 0, i13);
                                iArr2 = r12;
                            }
                            iArr2[i13] = iArr;
                            iArr2 = iArr2;
                            attributeSet2 = attributeSet;
                            theme2 = theme;
                            i13 = i10;
                            z8 = c9;
                            depth2 = i8;
                            i12 = 0;
                            r02 = resources;
                        }
                    }
                    color = r9.getColor(i12, -65281);
                    if (!r9.hasValue(z8)) {
                    }
                    char c92 = z8;
                    if (Build.VERSION.SDK_INT < 31) {
                    }
                    f9 = r9.getFloat(4, -1.0f);
                    r9.recycle();
                    attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr52 = new int[attributeCount];
                    i4 = i12;
                    int i152 = i4;
                    while (i4 < attributeCount) {
                    }
                    int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i152);
                    float f112 = 100.0f;
                    if (f9 < 0.0f) {
                    }
                    c6 = 0;
                    if (f8 != 1.0f) {
                    }
                    int i172 = AbstractC1492c.i((int) ((Color.alpha(color) * f8) + 0.5f), 0, 255);
                    if (c6 == 0) {
                    }
                    color = (16777215 & color) | (i172 << 24);
                    i10 = i13 + 1;
                    int i182 = 8;
                    if (i10 > iArr3.length) {
                    }
                    iArr3[i13] = color;
                    if (i10 > iArr2.length) {
                    }
                    iArr2[i13] = iArr;
                    iArr2 = iArr2;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i13 = i10;
                    z8 = c92;
                    depth2 = i8;
                    i12 = 0;
                    r02 = resources;
                } else {
                    r02 = resources;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    z8 = z8;
                    depth2 = depth2;
                    i12 = 0;
                }
            }
            int[] iArr7 = new int[i13];
            int[][] iArr8 = new int[i13];
            System.arraycopy(iArr3, 0, iArr7, 0, i13);
            System.arraycopy(iArr2, 0, iArr8, 0, i13);
            return new ColorStateList(iArr8, iArr7);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}
