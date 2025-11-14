package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import h.AbstractC0805a;
import java.io.IOException;
import n.m;
import n.p;
import o.AbstractC1202m0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s3.AbstractC1492c;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f12360e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f12361f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f12362a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f12363b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f12364c;

    /* renamed from: d, reason: collision with root package name */
    public Object f12365d;

    static {
        Class[] clsArr = {Context.class};
        f12360e = clsArr;
        f12361f = clsArr;
    }

    public C1044g(Context context) {
        super(context);
        this.f12364c = context;
        Object[] objArr = {context};
        this.f12362a = objArr;
        this.f12363b = objArr;
    }

    public static Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        int i4;
        XmlPullParser xmlPullParser2;
        char charAt;
        char charAt2;
        boolean z8;
        ColorStateList colorStateList;
        int resourceId;
        C1043f c1043f = new C1043f(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i4 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z9 = false;
        boolean z10 = false;
        String str = null;
        while (!z9) {
            if (eventType != 1) {
                if (eventType != i4) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z10 && name2.equals(str)) {
                            xmlPullParser2 = xmlPullParser;
                            z10 = false;
                            str = null;
                            eventType = xmlPullParser2.next();
                            i4 = 2;
                            z9 = z9;
                            z10 = z10;
                        } else if (name2.equals("group")) {
                            c1043f.f12337b = 0;
                            c1043f.f12338c = 0;
                            c1043f.f12339d = 0;
                            c1043f.f12340e = 0;
                            c1043f.f12341f = true;
                            c1043f.f12342g = true;
                        } else if (name2.equals("item")) {
                            if (!c1043f.f12343h) {
                                p pVar = c1043f.f12359z;
                                if (pVar != null && pVar.f12694b.hasSubMenu()) {
                                    c1043f.f12343h = true;
                                    c1043f.b(c1043f.f12336a.addSubMenu(c1043f.f12337b, c1043f.f12344i, c1043f.j, c1043f.k).getItem());
                                } else {
                                    c1043f.f12343h = true;
                                    c1043f.b(c1043f.f12336a.add(c1043f.f12337b, c1043f.f12344i, c1043f.j, c1043f.k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z9 = true;
                        }
                    }
                    xmlPullParser2 = xmlPullParser;
                    z9 = z9;
                } else {
                    if (!z10) {
                        String name3 = xmlPullParser.getName();
                        if (name3.equals("group")) {
                            TypedArray obtainStyledAttributes = this.f12364c.obtainStyledAttributes(attributeSet, AbstractC0805a.f11288p);
                            c1043f.f12337b = obtainStyledAttributes.getResourceId(1, 0);
                            c1043f.f12338c = obtainStyledAttributes.getInt(3, 0);
                            c1043f.f12339d = obtainStyledAttributes.getInt(4, 0);
                            c1043f.f12340e = obtainStyledAttributes.getInt(5, 0);
                            c1043f.f12341f = obtainStyledAttributes.getBoolean(i4, true);
                            c1043f.f12342g = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                        } else {
                            if (name3.equals("item")) {
                                int[] iArr = AbstractC0805a.f11289q;
                                Context context = this.f12364c;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                                c1043f.f12344i = obtainStyledAttributes2.getResourceId(i4, 0);
                                c1043f.j = (obtainStyledAttributes2.getInt(6, c1043f.f12339d) & 65535) | (obtainStyledAttributes2.getInt(5, c1043f.f12338c) & (-65536));
                                c1043f.k = obtainStyledAttributes2.getText(7);
                                c1043f.f12345l = obtainStyledAttributes2.getText(8);
                                c1043f.f12346m = obtainStyledAttributes2.getResourceId(0, 0);
                                String string = obtainStyledAttributes2.getString(9);
                                if (string == null) {
                                    charAt = 0;
                                } else {
                                    charAt = string.charAt(0);
                                }
                                c1043f.f12347n = charAt;
                                c1043f.f12348o = obtainStyledAttributes2.getInt(16, 4096);
                                String string2 = obtainStyledAttributes2.getString(10);
                                if (string2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = string2.charAt(0);
                                }
                                c1043f.f12349p = charAt2;
                                c1043f.f12350q = obtainStyledAttributes2.getInt(20, 4096);
                                if (obtainStyledAttributes2.hasValue(11)) {
                                    c1043f.f12351r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                                } else {
                                    c1043f.f12351r = c1043f.f12340e;
                                }
                                c1043f.f12352s = obtainStyledAttributes2.getBoolean(3, false);
                                c1043f.f12353t = obtainStyledAttributes2.getBoolean(4, c1043f.f12341f);
                                c1043f.f12354u = obtainStyledAttributes2.getBoolean(1, c1043f.f12342g);
                                c1043f.f12355v = obtainStyledAttributes2.getInt(21, -1);
                                c1043f.f12358y = obtainStyledAttributes2.getString(12);
                                c1043f.f12356w = obtainStyledAttributes2.getResourceId(13, 0);
                                c1043f.f12357x = obtainStyledAttributes2.getString(15);
                                String string3 = obtainStyledAttributes2.getString(14);
                                if (string3 != null) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if (z8 && c1043f.f12356w == 0 && c1043f.f12357x == null) {
                                    c1043f.f12359z = (p) c1043f.a(string3, f12361f, this.f12363b);
                                } else {
                                    if (z8) {
                                        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                    }
                                    c1043f.f12359z = null;
                                }
                                c1043f.f12331A = obtainStyledAttributes2.getText(17);
                                c1043f.f12332B = obtainStyledAttributes2.getText(22);
                                if (obtainStyledAttributes2.hasValue(19)) {
                                    c1043f.f12334D = AbstractC1202m0.c(obtainStyledAttributes2.getInt(19, -1), c1043f.f12334D);
                                } else {
                                    c1043f.f12334D = null;
                                }
                                if (obtainStyledAttributes2.hasValue(18)) {
                                    if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC1492c.o(context, resourceId)) == null) {
                                        colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                    }
                                    c1043f.f12333C = colorStateList;
                                } else {
                                    c1043f.f12333C = null;
                                }
                                obtainStyledAttributes2.recycle();
                                c1043f.f12343h = false;
                                xmlPullParser2 = xmlPullParser;
                            } else if (name3.equals("menu")) {
                                c1043f.f12343h = true;
                                SubMenu addSubMenu = c1043f.f12336a.addSubMenu(c1043f.f12337b, c1043f.f12344i, c1043f.j, c1043f.k);
                                c1043f.b(addSubMenu.getItem());
                                xmlPullParser2 = xmlPullParser;
                                b(xmlPullParser2, attributeSet, addSubMenu);
                            } else {
                                xmlPullParser2 = xmlPullParser;
                                str = name3;
                                z10 = true;
                            }
                            eventType = xmlPullParser2.next();
                            i4 = 2;
                            z9 = z9;
                            z10 = z10;
                        }
                    }
                    xmlPullParser2 = xmlPullParser;
                    z9 = z9;
                }
                eventType = xmlPullParser2.next();
                i4 = 2;
                z9 = z9;
                z10 = z10;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i4, Menu menu) {
        if (!(menu instanceof m)) {
            super.inflate(i4, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z8 = false;
        try {
            try {
                xmlResourceParser = this.f12364c.getResources().getLayout(i4);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof m) {
                    m mVar = (m) menu;
                    if (!mVar.f12654p) {
                        mVar.w();
                        z8 = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z8) {
                    ((m) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e9) {
                throw new InflateException("Error inflating menu XML", e9);
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th) {
            if (z8) {
                ((m) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
