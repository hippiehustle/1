package i;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: i.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0874m {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
