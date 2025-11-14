package n0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import h4.AbstractC0832f;
import h7.AbstractC0842e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import o.C1207p;
import o0.AbstractC1228a;
import org.xmlpull.v1.XmlPullParserException;
import q0.C1351g;
import q4.X;

/* renamed from: n0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147y {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f12826c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Context f12827a;

    /* renamed from: b, reason: collision with root package name */
    public final C1121K f12828b;

    public C1147y(Context context, C1121K c1121k) {
        o6.j.e(c1121k, "navigatorProvider");
        this.f12827a = context;
        this.f12828b = c1121k;
    }

    public static C1130h c(TypedArray typedArray, Resources resources, int i4) {
        boolean z8;
        AbstractC1117G abstractC1117G;
        AbstractC1117G abstractC1117G2;
        AbstractC1117G abstractC1117G3;
        Class cls;
        AbstractC1117G abstractC1117G4;
        boolean z9;
        Object obj;
        AbstractC1117G abstractC1117G5;
        boolean z10;
        String str;
        boolean z11;
        AbstractC1117G abstractC1117G6;
        boolean z12 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = f12826c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        AbstractC1117G abstractC1117G7 = AbstractC1117G.f12724c;
        AbstractC1117G abstractC1117G8 = AbstractC1117G.j;
        AbstractC1117G abstractC1117G9 = AbstractC1117G.f12735p;
        AbstractC1117G abstractC1117G10 = AbstractC1117G.f12732m;
        AbstractC1117G abstractC1117G11 = AbstractC1117G.f12728g;
        AbstractC1117G abstractC1117G12 = AbstractC1117G.f12725d;
        AbstractC1117G abstractC1117G13 = AbstractC1117G.f12727f;
        AbstractC1117G abstractC1117G14 = AbstractC1117G.f12731l;
        AbstractC1117G abstractC1117G15 = AbstractC1117G.f12734o;
        AbstractC1117G abstractC1117G16 = AbstractC1117G.f12730i;
        AbstractC1117G abstractC1117G17 = AbstractC1117G.f12723b;
        if (string != null) {
            abstractC1117G2 = abstractC1117G10;
            String resourcePackageName = resources.getResourcePackageName(i4);
            if ("integer".equals(string)) {
                z8 = z12;
                abstractC1117G3 = abstractC1117G17;
            } else {
                z8 = z12;
                if ("integer[]".equals(string)) {
                    abstractC1117G3 = abstractC1117G12;
                } else if ("List<Int>".equals(string)) {
                    abstractC1117G3 = AbstractC1117G.f12726e;
                } else if ("long".equals(string)) {
                    abstractC1117G3 = abstractC1117G13;
                } else if ("long[]".equals(string)) {
                    abstractC1117G3 = abstractC1117G11;
                } else if ("List<Long>".equals(string)) {
                    abstractC1117G3 = AbstractC1117G.f12729h;
                } else if ("boolean".equals(string)) {
                    abstractC1117G3 = abstractC1117G14;
                } else if ("boolean[]".equals(string)) {
                    abstractC1117G3 = abstractC1117G2;
                } else if ("List<Boolean>".equals(string)) {
                    abstractC1117G3 = AbstractC1117G.f12733n;
                } else if ("string".equals(string)) {
                    abstractC1117G3 = abstractC1117G15;
                } else if ("string[]".equals(string)) {
                    abstractC1117G3 = abstractC1117G9;
                } else if ("List<String>".equals(string)) {
                    abstractC1117G3 = AbstractC1117G.f12736q;
                } else if ("float".equals(string)) {
                    abstractC1117G3 = abstractC1117G16;
                } else if ("float[]".equals(string)) {
                    abstractC1117G3 = abstractC1117G8;
                } else if ("List<Float>".equals(string)) {
                    abstractC1117G3 = AbstractC1117G.k;
                } else {
                    abstractC1117G3 = null;
                }
            }
            if (abstractC1117G3 == null) {
                if ("reference".equals(string)) {
                    abstractC1117G = abstractC1117G13;
                    abstractC1117G3 = abstractC1117G7;
                } else if (string.length() == 0) {
                    abstractC1117G3 = abstractC1117G15;
                } else {
                    try {
                        if (I7.v.a0(string, ".") && resourcePackageName != null) {
                            str = resourcePackageName.concat(string);
                        } else {
                            str = string;
                        }
                        boolean W7 = I7.v.W(string, "[]");
                        if (W7) {
                            z11 = W7;
                            abstractC1117G = abstractC1117G13;
                            str = str.substring(0, str.length() - 2);
                            o6.j.d(str, "substring(...)");
                        } else {
                            abstractC1117G = abstractC1117G13;
                            z11 = W7;
                        }
                        Class<?> cls2 = Class.forName(str);
                        if (Parcelable.class.isAssignableFrom(cls2)) {
                            if (z11) {
                                abstractC1117G6 = new C1113C(cls2);
                            } else {
                                abstractC1117G6 = new C1114D(cls2);
                            }
                        } else if (Enum.class.isAssignableFrom(cls2) && !z11) {
                            abstractC1117G6 = new C1112B(cls2);
                        } else if (Serializable.class.isAssignableFrom(cls2)) {
                            if (z11) {
                                abstractC1117G6 = new C1115E(cls2);
                            } else {
                                abstractC1117G6 = new C1116F(cls2);
                            }
                        } else {
                            abstractC1117G6 = null;
                        }
                        if (abstractC1117G6 != null) {
                            abstractC1117G3 = abstractC1117G6;
                        } else {
                            throw new IllegalArgumentException((str + " is not Serializable or Parcelable.").toString());
                        }
                    } catch (ClassNotFoundException e9) {
                        throw new RuntimeException(e9);
                    }
                }
            }
            abstractC1117G = abstractC1117G13;
        } else {
            z8 = z12;
            abstractC1117G = abstractC1117G13;
            abstractC1117G2 = abstractC1117G10;
            abstractC1117G3 = null;
        }
        boolean z13 = true;
        if (typedArray.getValue(1, typedValue)) {
            cls = Serializable.class;
            if (abstractC1117G3 == abstractC1117G7) {
                int i8 = typedValue.resourceId;
                if (i8 != 0) {
                    obj = Integer.valueOf(i8);
                    z9 = false;
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    z9 = false;
                    obj = 0;
                } else {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC1117G3.b() + ". Must be a reference to a resource.");
                }
                abstractC1117G7 = abstractC1117G3;
            } else {
                z9 = false;
                int i9 = typedValue.resourceId;
                if (i9 != 0) {
                    if (abstractC1117G3 == null) {
                        obj = Integer.valueOf(i9);
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + abstractC1117G3.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                } else {
                    if (abstractC1117G3 == abstractC1117G15) {
                        z13 = true;
                        obj = typedArray.getString(1);
                        abstractC1117G7 = abstractC1117G3;
                    } else {
                        z13 = true;
                        int i10 = typedValue.type;
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    if (i10 != 18) {
                                        if (i10 >= 16 && i10 <= 31) {
                                            if (abstractC1117G3 == abstractC1117G16) {
                                                abstractC1117G7 = AbstractC0842e.d(typedValue, abstractC1117G3, abstractC1117G16, string, "float");
                                                obj = Float.valueOf(typedValue.data);
                                            } else {
                                                abstractC1117G7 = AbstractC0842e.d(typedValue, abstractC1117G3, abstractC1117G17, string, "integer");
                                                obj = Integer.valueOf(typedValue.data);
                                            }
                                        } else {
                                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                        }
                                    } else {
                                        abstractC1117G7 = AbstractC0842e.d(typedValue, abstractC1117G3, abstractC1117G14, string, "boolean");
                                        if (typedValue.data != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        obj = Boolean.valueOf(z10);
                                    }
                                } else {
                                    abstractC1117G7 = AbstractC0842e.d(typedValue, abstractC1117G3, abstractC1117G17, string, "dimension");
                                    obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                                }
                            } else {
                                abstractC1117G7 = AbstractC0842e.d(typedValue, abstractC1117G3, abstractC1117G16, string, "float");
                                obj = Float.valueOf(typedValue.getFloat());
                            }
                        } else {
                            String obj2 = typedValue.string.toString();
                            if (abstractC1117G3 == null) {
                                o6.j.e(obj2, "value");
                                try {
                                    abstractC1117G17.d(obj2);
                                    abstractC1117G3 = abstractC1117G17;
                                } catch (IllegalArgumentException unused) {
                                    abstractC1117G4 = abstractC1117G;
                                    try {
                                        try {
                                            try {
                                                abstractC1117G4.d(obj2);
                                                abstractC1117G3 = abstractC1117G4;
                                            } catch (IllegalArgumentException unused2) {
                                                abstractC1117G14.d(obj2);
                                                abstractC1117G3 = abstractC1117G14;
                                            }
                                        } catch (IllegalArgumentException unused3) {
                                            abstractC1117G16.d(obj2);
                                            abstractC1117G3 = abstractC1117G16;
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        abstractC1117G3 = abstractC1117G15;
                                    }
                                }
                            }
                            abstractC1117G4 = abstractC1117G;
                            abstractC1117G7 = abstractC1117G3;
                            obj = abstractC1117G7.d(obj2);
                        }
                    }
                    abstractC1117G4 = abstractC1117G;
                }
            }
            abstractC1117G4 = abstractC1117G;
            z13 = true;
        } else {
            cls = Serializable.class;
            abstractC1117G4 = abstractC1117G;
            z9 = false;
            abstractC1117G7 = abstractC1117G3;
            obj = null;
        }
        if (obj == null) {
            z13 = z9;
            obj = null;
        }
        if (abstractC1117G7 == null) {
            abstractC1117G7 = null;
        }
        if (abstractC1117G7 == null) {
            if (obj instanceof Integer) {
                abstractC1117G16 = abstractC1117G17;
            } else if (obj instanceof int[]) {
                abstractC1117G16 = abstractC1117G12;
            } else if (obj instanceof Long) {
                abstractC1117G16 = abstractC1117G4;
            } else if (obj instanceof long[]) {
                abstractC1117G16 = abstractC1117G11;
            } else if (!(obj instanceof Float)) {
                if (obj instanceof float[]) {
                    abstractC1117G16 = abstractC1117G8;
                } else if (obj instanceof Boolean) {
                    abstractC1117G16 = abstractC1117G14;
                } else if (obj instanceof boolean[]) {
                    abstractC1117G16 = abstractC1117G2;
                } else if (!(obj instanceof String) && obj != null) {
                    abstractC1117G16 = null;
                } else {
                    abstractC1117G16 = abstractC1117G15;
                }
            }
            if (abstractC1117G16 == null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    abstractC1117G5 = abstractC1117G9;
                } else {
                    o6.j.b(obj);
                    if (obj.getClass().isArray()) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        o6.j.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            o6.j.c(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            abstractC1117G5 = new C1113C(componentType2);
                        }
                    }
                    if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        o6.j.b(componentType3);
                        if (cls.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            o6.j.c(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            abstractC1117G5 = new C1115E(componentType4);
                        }
                    }
                    if (obj instanceof Parcelable) {
                        abstractC1117G5 = new C1114D(obj.getClass());
                    } else if (obj instanceof Enum) {
                        abstractC1117G5 = new C1112B(obj.getClass());
                    } else if (obj instanceof Serializable) {
                        abstractC1117G5 = new C1116F(obj.getClass());
                    } else {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                }
            } else {
                abstractC1117G5 = abstractC1117G16;
            }
            abstractC1117G7 = abstractC1117G5;
        }
        return new C1130h(abstractC1117G7, z8, obj, z13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0147, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0293, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC1143u a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i4) {
        int depth;
        Context context;
        C1207p c1207p;
        int i8;
        TypedArray typedArray;
        Object obj;
        String str;
        String str2;
        int i9 = i4;
        String name = xmlResourceParser.getName();
        o6.j.d(name, "getName(...)");
        AbstractC1143u a3 = this.f12828b.b(name).a();
        Context context2 = this.f12827a;
        a3.l(context2, attributeSet);
        C1207p c1207p2 = a3.f12813e;
        int i10 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                boolean equals = "argument".equals(name2);
                int[] iArr = AbstractC1228a.f13432b;
                if (equals) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    o6.j.d(obtainAttributes, "obtainAttributes(...)");
                    String string = obtainAttributes.getString(0);
                    if (string != null) {
                        C1130h c6 = c(obtainAttributes, resources, i9);
                        c1207p2.getClass();
                        ((LinkedHashMap) c1207p2.f13346e).put(string, c6);
                        obtainAttributes.recycle();
                    } else {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                } else if ("deepLink".equals(name2)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, AbstractC1228a.f13433c);
                    o6.j.d(obtainAttributes2, "obtainAttributes(...)");
                    String string2 = obtainAttributes2.getString(3);
                    String string3 = obtainAttributes2.getString(1);
                    String string4 = obtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        break;
                    }
                    String str3 = null;
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        o6.j.d(packageName, "getPackageName(...)");
                        str = I7.v.Z(string2, "${applicationId}", packageName);
                    } else {
                        str = null;
                    }
                    if (string3 != null && string3.length() != 0) {
                        String packageName2 = context2.getPackageName();
                        o6.j.d(packageName2, "getPackageName(...)");
                        str2 = I7.v.Z(string3, "${applicationId}", packageName2);
                        if (str2.length() <= 0) {
                            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                        }
                    } else {
                        str2 = null;
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        o6.j.d(packageName3, "getPackageName(...)");
                        str3 = I7.v.Z(string4, "${applicationId}", packageName3);
                    }
                    C1140r c1140r = new C1140r(str, str2, str3);
                    c1207p2.getClass();
                    ArrayList u8 = AbstractC0832f.u((LinkedHashMap) c1207p2.f13346e, new C1351g(c1140r, 0));
                    if (u8.isEmpty()) {
                        ((ArrayList) c1207p2.f13345d).add(c1140r);
                        obtainAttributes2.recycle();
                    } else {
                        StringBuilder s8 = A.j.s("Deep link ", str, " can't be used to open destination ");
                        s8.append((AbstractC1143u) c1207p2.f13343b);
                        s8.append(".\nFollowing required arguments are missing: ");
                        s8.append(u8);
                        throw new IllegalArgumentException(s8.toString().toString());
                    }
                } else {
                    if ("action".equals(name2)) {
                        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1228a.f13431a, 0, 0);
                        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                        context = context2;
                        C1128f c1128f = new C1128f(obtainStyledAttributes.getResourceId(1, 0));
                        c1128f.f12750b = new C1148z(obtainStyledAttributes.getBoolean(4, false), obtainStyledAttributes.getBoolean(10, false), obtainStyledAttributes.getResourceId(7, -1), obtainStyledAttributes.getBoolean(8, false), obtainStyledAttributes.getBoolean(9, false), obtainStyledAttributes.getResourceId(2, -1), obtainStyledAttributes.getResourceId(3, -1), obtainStyledAttributes.getResourceId(5, -1), obtainStyledAttributes.getResourceId(6, -1));
                        Bundle k = X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                        c1207p = c1207p2;
                        int i11 = 1;
                        int depth3 = xmlResourceParser.getDepth() + 1;
                        i8 = depth2;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 != i11) {
                                int depth4 = xmlResourceParser.getDepth();
                                typedArray = obtainStyledAttributes;
                                if (depth4 < depth3 && next2 == 3) {
                                    break;
                                }
                                if (next2 == 2 && depth4 <= depth3) {
                                    if ("argument".equals(xmlResourceParser.getName())) {
                                        TypedArray obtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                        o6.j.d(obtainAttributes3, "obtainAttributes(...)");
                                        String string5 = obtainAttributes3.getString(0);
                                        if (string5 != null) {
                                            C1130h c9 = c(obtainAttributes3, resources, i9);
                                            boolean z8 = c9.f12756c;
                                            if (z8 && z8 && (obj = c9.f12757d) != null) {
                                                c9.f12754a.e(k, string5, obj);
                                            }
                                            obtainAttributes3.recycle();
                                        } else {
                                            throw new XmlPullParserException("Arguments must have a name");
                                        }
                                    }
                                    i9 = i4;
                                }
                                obtainStyledAttributes = typedArray;
                                i11 = 1;
                            } else {
                                typedArray = obtainStyledAttributes;
                                break;
                            }
                        }
                        if (!k.isEmpty()) {
                            c1128f.f12751c = k;
                        }
                        if (!(a3 instanceof C1123a)) {
                            if (resourceId != 0) {
                                a3.f12816h.d(resourceId, c1128f);
                                typedArray.recycle();
                            } else {
                                throw new IllegalArgumentException("Cannot have an action with actionId 0");
                            }
                        } else {
                            throw new UnsupportedOperationException("Cannot add action " + resourceId + " to " + a3 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
                        }
                    } else {
                        context = context2;
                        c1207p = c1207p2;
                        i8 = depth2;
                        if ("include".equals(name2) && (a3 instanceof C1144v)) {
                            TypedArray obtainAttributes4 = resources.obtainAttributes(attributeSet, AbstractC1122L.f12744c);
                            o6.j.d(obtainAttributes4, "obtainAttributes(...)");
                            ((C1144v) a3).m(b(obtainAttributes4.getResourceId(0, 0)));
                            obtainAttributes4.recycle();
                        } else if (a3 instanceof C1144v) {
                            ((C1144v) a3).m(a(resources, xmlResourceParser, attributeSet, i4));
                        }
                    }
                    i9 = i4;
                    depth2 = i8;
                    context2 = context;
                    c1207p2 = c1207p;
                }
                i10 = 1;
            }
        }
    }

    public final C1144v b(int i4) {
        int next;
        Resources resources = this.f12827a.getResources();
        XmlResourceParser xml = resources.getXml(i4);
        o6.j.d(xml, "getXml(...)");
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e9) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i4) + " line " + xml.getLineNumber(), e9);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            o6.j.b(asAttributeSet);
            AbstractC1143u a3 = a(resources, xml, asAttributeSet, i4);
            if (a3 instanceof C1144v) {
                return (C1144v) a3;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
