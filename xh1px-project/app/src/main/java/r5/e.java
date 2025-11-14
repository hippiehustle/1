package r5;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import com.buzbuz.smartautoclicker.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import m.C1039b;
import o6.j;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f14413a = {R.attr.dynamicColorThemeOverlay};

    /* renamed from: b, reason: collision with root package name */
    public static final Map f14414b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f14415c;

    static {
        Object obj = new Object();
        Object obj2 = new Object();
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", obj);
        hashMap.put("google", obj);
        hashMap.put("hmd global", obj);
        hashMap.put("infinix", obj);
        hashMap.put("infinix mobility limited", obj);
        hashMap.put("itel", obj);
        hashMap.put("kyocera", obj);
        hashMap.put("lenovo", obj);
        hashMap.put("lge", obj);
        hashMap.put("meizu", obj);
        hashMap.put("motorola", obj);
        hashMap.put("nothing", obj);
        hashMap.put("oneplus", obj);
        hashMap.put("oppo", obj);
        hashMap.put("realme", obj);
        hashMap.put("robolectric", obj);
        hashMap.put("samsung", obj2);
        hashMap.put("sharp", obj);
        hashMap.put("shift", obj);
        hashMap.put("sony", obj);
        hashMap.put("tcl", obj);
        hashMap.put("tecno", obj);
        hashMap.put("tecno mobile limited", obj);
        hashMap.put("vivo", obj);
        hashMap.put("wingtech", obj);
        hashMap.put("xiaomi", obj);
        f14414b = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", obj);
        hashMap2.put("jio", obj);
        f14415c = Collections.unmodifiableMap(hashMap2);
    }

    public static boolean a() {
        Integer num;
        Integer num2 = 0;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            int i8 = L.a.f2740a;
            if (i4 < 33) {
                if (i4 >= 32) {
                    String str = Build.VERSION.CODENAME;
                    j.d(str, "CODENAME");
                    if (!"REL".equals(str)) {
                        Locale locale = Locale.ROOT;
                        String upperCase = str.toUpperCase(locale);
                        j.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        if (upperCase.equals("BAKLAVA")) {
                            num = num2;
                        } else {
                            num = null;
                        }
                        String upperCase2 = "Tiramisu".toUpperCase(locale);
                        j.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        if (!upperCase2.equals("BAKLAVA")) {
                            num2 = null;
                        }
                        if (num != null && num2 != null) {
                            if (num.intValue() >= num2.intValue()) {
                                return true;
                            }
                        } else if (num == null && num2 == null) {
                            String upperCase3 = str.toUpperCase(locale);
                            j.d(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            String upperCase4 = "Tiramisu".toUpperCase(locale);
                            j.d(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                            if (upperCase3.compareTo(upperCase4) >= 0) {
                                return true;
                            }
                        } else if (num != null) {
                            return true;
                        }
                    }
                }
                String str2 = Build.MANUFACTURER;
                Locale locale2 = Locale.ROOT;
                c cVar = (c) f14414b.get(str2.toLowerCase(locale2));
                if (cVar == null) {
                    cVar = (c) f14415c.get(Build.BRAND.toLowerCase(locale2));
                }
                if (cVar != null && cVar.a()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static Context b(C1039b c1039b) {
        if (a()) {
            TypedArray obtainStyledAttributes = c1039b.obtainStyledAttributes(f14413a);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            if (resourceId != 0) {
                return new ContextThemeWrapper(c1039b, resourceId);
            }
        }
        return c1039b;
    }
}
