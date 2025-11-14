package G;

import P.O;
import a6.AbstractC0434i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import h.AbstractC0805a;
import java.util.ArrayList;
import java.util.Arrays;
import o.AbstractC1202m0;
import o.C1216u;
import o.c1;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1649a;

    /* renamed from: b, reason: collision with root package name */
    public int f1650b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1651c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1652d;

    public /* synthetic */ d() {
        this.f1649a = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new A.i(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.f88e;
        r17 = (float[]) r0.f89f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new G.d(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.f88e, (float[]) r0.f89f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.f88e;
        r21 = (float[]) r0.f89f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new A.i(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new A.i(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d b(Resources resources, int i4, Resources.Theme theme) {
        int next;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        int i8;
        int i9;
        boolean z8;
        int i10;
        float f14;
        int i11;
        float f15;
        int i12;
        float f16;
        float f17;
        XmlResourceParser xml = resources.getXml(i4);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    ColorStateList b4 = c.b(resources, xml, asAttributeSet, theme);
                    return new d(null, b4, b4.getDefaultColor());
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            String name2 = xml.getName();
            if (name2.equals("gradient")) {
                TypedArray f18 = b.f(resources, theme, asAttributeSet, D.a.f853d);
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) {
                    f8 = f18.getFloat(8, 0.0f);
                } else {
                    f8 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null) {
                    f9 = f18.getFloat(9, 0.0f);
                } else {
                    f9 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null) {
                    f10 = f18.getFloat(10, 0.0f);
                } else {
                    f10 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null) {
                    f11 = f18.getFloat(11, 0.0f);
                } else {
                    f11 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) {
                    f12 = f18.getFloat(3, 0.0f);
                } else {
                    f12 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null) {
                    f13 = f18.getFloat(4, 0.0f);
                } else {
                    f13 = 0.0f;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) {
                    i8 = f18.getInt(2, 0);
                } else {
                    i8 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null) {
                    i9 = f18.getColor(0, 0);
                } else {
                    i9 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) {
                    i10 = f18.getColor(7, 0);
                } else {
                    i10 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
                    f14 = f8;
                    i11 = f18.getColor(1, 0);
                } else {
                    f14 = f8;
                    i11 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
                    f15 = f9;
                    i12 = f18.getInt(6, 0);
                } else {
                    f15 = f9;
                    i12 = 0;
                }
                if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null) {
                    f16 = f18.getFloat(5, 0.0f);
                } else {
                    f16 = 0.0f;
                }
                f18.recycle();
                int depth = xml.getDepth() + 1;
                ArrayList arrayList = new ArrayList(20);
                float f19 = f16;
                ArrayList arrayList2 = new ArrayList(20);
                while (true) {
                    int next2 = xml.next();
                    float f20 = f10;
                    if (next2 != 1) {
                        int depth2 = xml.getDepth();
                        f17 = f11;
                        if (depth2 < depth && next2 == 3) {
                            break;
                        }
                        if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                            TypedArray f21 = b.f(resources, theme, asAttributeSet, D.a.f854e);
                            boolean hasValue = f21.hasValue(0);
                            boolean hasValue2 = f21.hasValue(1);
                            if (!hasValue || !hasValue2) {
                                break;
                            }
                            int color = f21.getColor(0, 0);
                            float f22 = f21.getFloat(1, 0.0f);
                            f21.recycle();
                            arrayList2.add(Integer.valueOf(color));
                            arrayList.add(Float.valueOf(f22));
                        }
                        f10 = f20;
                        f11 = f17;
                    } else {
                        f17 = f11;
                        break;
                    }
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public void a() {
        c1 c1Var;
        ImageView imageView = (ImageView) this.f1651c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1202m0.a(drawable);
        }
        if (drawable != null && (c1Var = (c1) this.f1652d) != null) {
            C1216u.e(drawable, c1Var, imageView.getDrawableState());
        }
    }

    public String c() {
        StringBuilder sb = new StringBuilder("$");
        int i4 = this.f1650b + 1;
        for (int i8 = 0; i8 < i4; i8++) {
            Object obj = ((Object[]) this.f1651c)[i8];
            if (obj instanceof X7.f) {
                X7.f fVar = (X7.f) obj;
                if (o6.j.a(fVar.e(), X7.i.f7074f)) {
                    if (((int[]) this.f1652d)[i8] != -1) {
                        sb.append("[");
                        sb.append(((int[]) this.f1652d)[i8]);
                        sb.append("]");
                    }
                } else {
                    int i9 = ((int[]) this.f1652d)[i8];
                    if (i9 >= 0) {
                        sb.append(".");
                        sb.append(fVar.d(i9));
                    }
                }
            } else if (obj != b8.k.f9267a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public boolean d() {
        ColorStateList colorStateList;
        if (((Shader) this.f1651c) == null && (colorStateList = (ColorStateList) this.f1652d) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void e(AttributeSet attributeSet, int i4) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1651c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0805a.f11280f;
        R.g J6 = R.g.J(context, attributeSet, iArr, i4);
        TypedArray typedArray = (TypedArray) J6.f4988f;
        O.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) J6.f4988f, i4);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = h4.g.k(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1202m0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(J6.z(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC1202m0.c(typedArray.getInt(3, -1), null));
            }
            J6.L();
        } catch (Throwable th) {
            J6.L();
            throw th;
        }
    }

    public void f() {
        int i4 = this.f1650b * 2;
        Object[] copyOf = Arrays.copyOf((Object[]) this.f1651c, i4);
        o6.j.d(copyOf, "copyOf(...)");
        this.f1651c = copyOf;
        int[] iArr = new int[i4];
        for (int i8 = 0; i8 < i4; i8++) {
            iArr[i8] = -1;
        }
        AbstractC0434i.R0(0, 14, (int[]) this.f1652d, iArr);
        this.f1652d = iArr;
    }

    public void g(int i4) {
        ImageView imageView = (ImageView) this.f1651c;
        if (i4 != 0) {
            Drawable k = h4.g.k(imageView.getContext(), i4);
            if (k != null) {
                AbstractC1202m0.a(k);
            }
            imageView.setImageDrawable(k);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    public String toString() {
        switch (this.f1649a) {
            case 1:
                return c();
            default:
                return super.toString();
        }
    }

    public d(ImageView imageView) {
        this.f1649a = 2;
        this.f1650b = 0;
        this.f1651c = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i4) {
        this.f1649a = 0;
        this.f1651c = shader;
        this.f1652d = colorStateList;
        this.f1650b = i4;
    }
}
